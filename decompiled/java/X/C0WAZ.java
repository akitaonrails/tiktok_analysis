package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0WAZ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.middlepage.AdMiddlePageBannerView$1", f = "AdMiddlePageBannerView.kt", l = {76}, m = "invokeSuspend")
public final class C0WAZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C259800zU<C818790WAb> LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ C1037430d6T LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WAZ(C259800zU<C818790WAb> c259800zU, Context context, C1037430d6T c1037430d6T, InterfaceC1364105Vn<? super C0WAZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c259800zU;
        this.LLILLL = context;
        this.LLILZ = c1037430d6T;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0WAZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "AdMiddlePageBannerView@aa55.<init>$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r10.LL
            r6 = 1
            if (r0 == 0) goto L19
            if (r0 != r6) goto L9a
            X.C155000ia.LIZIZ(r11)
        L13:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L19:
            X.C155000ia.LIZIZ(r11)
            java.lang.System.currentTimeMillis()
            X.00zU<X.0WAb> r7 = r10.LLILLJJLI
            X.0d6O r0 = X.C1037380d6O.LIZ
            android.content.Context r8 = r10.LLILLL
            r0.getClass()
            r4 = 0
            X.01GW r0 = X.C0AML.LIZ     // Catch: java.lang.Exception -> L77
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L77
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L77
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L7e
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Exception -> L77
            java.lang.String r1 = "android.intent.action.VIEW"
            java.lang.String r0 = "http://"
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.Exception -> L77
            r2.<init>(r1, r0)     // Catch: java.lang.Exception -> L77
            android.content.pm.PackageManager r1 = r8.getPackageManager()     // Catch: java.lang.Exception -> L77
            r0 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r0 = r1.resolveActivity(r2, r0)     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L7e
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch: java.lang.Exception -> L77
            java.lang.String r3 = r0.packageName     // Catch: java.lang.Exception -> L77
            android.content.pm.PackageManager r0 = r8.getPackageManager()     // Catch: java.lang.Exception -> L77
            android.graphics.drawable.Drawable r2 = r0.getApplicationIcon(r3)     // Catch: java.lang.Exception -> L77
            android.content.pm.PackageManager r1 = r8.getPackageManager()     // Catch: java.lang.Exception -> L77
            r0 = 0
            android.content.pm.ApplicationInfo r1 = X.C786410Ut5.V3(r1, r3, r0)     // Catch: java.lang.Exception -> L77
            android.content.pm.PackageManager r0 = r8.getPackageManager()     // Catch: java.lang.Exception -> L77
            java.lang.CharSequence r0 = r0.getApplicationLabel(r1)     // Catch: java.lang.Exception -> L77
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Exception -> L77
            X.0WAb r0 = new X.0WAb     // Catch: java.lang.Exception -> L77
            r0.<init>(r2, r1)     // Catch: java.lang.Exception -> L77
            goto L7f
        L77:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LJ(r0)
        L7e:
            r0 = r4
        L7f:
            r7.element = r0
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.0WAa r2 = new X.0WAa
            X.0d6T r1 = r10.LLILZ
            X.00zU<X.0WAb> r0 = r10.LLILLJJLI
            r2.<init>(r1, r0, r4)
            r10.LL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r10, r3, r2)
            if (r0 != r5) goto L13
            X.C1C7U.LIZIZ(r9)
            return r5
        L9a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WAZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
