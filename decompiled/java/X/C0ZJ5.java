package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZJ5, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activestatus.impl.analytics.performance.ActivityStatusAccuracyClient$collectActivityStatusAccuracyInfo$1", f = "ActivityStatusAccuracyClient.kt", l = {}, m = "invokeSuspend")
public final class C0ZJ5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0ZJD LL;
    public final /* synthetic */ RecyclerView LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZJ5(C0ZJD c0zjd, RecyclerView recyclerView, InterfaceC1364105Vn<? super C0ZJ5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0zjd;
        this.LLILLJJLI = recyclerView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZJ5(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "ActivityStatusAccuracyClient@c0db.collectActivityStatusAccuracyInfo$1"
            X.C1C7U.LIZ(r10)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r12)
            X.0ZJD r0 = r11.LL
            X.04rr r0 = r0.LIZLLL
            r0.getClass()
            androidx.recyclerview.widget.RecyclerView r0 = r11.LLILLJJLI
            int r6 = r0.getChildCount()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = 0
        L1e:
            if (r5 >= r6) goto La4
            androidx.recyclerview.widget.RecyclerView r0 = r11.LLILLJJLI
            android.view.View r9 = r0.getChildAt(r5)
            if (r9 == 0) goto L46
            int r0 = r9.getVisibility()
            r3 = 1
            r8 = 8
            if (r0 == r8) goto L46
            r7 = 2131376067(0x7f0a37c3, float:1.83723E38)
            java.lang.Object r1 = r9.getTag(r7)
            r0 = 2131376068(0x7f0a37c4, float:1.8372302E38)
            java.lang.Object r2 = r9.getTag(r0)
            boolean r0 = r1 instanceof X.C0ZJ8
            if (r0 == 0) goto L49
            r4.add(r1)
        L46:
            int r5 = r5 + 1
            goto L1e
        L49:
            X.05h5 r0 = com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi r0 = X.C1419705h5.LIZ()
            if (r0 == 0) goto L77
            boolean r0 = r0.LJI(r2)
            if (r0 != r3) goto L77
            r1 = 0
            if (r3 == 0) goto L77
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto L69
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L69
            java.lang.Object r1 = r2.getTag(r7)
        L69:
            boolean r0 = r1 instanceof X.C0ZJ8
            if (r0 == 0) goto L46
            if (r1 == 0) goto L46
            boolean r0 = r4.add(r1)
            java.lang.Boolean.valueOf(r0)
            goto L46
        L77:
            boolean r0 = r9 instanceof android.view.ViewGroup
            if (r0 == 0) goto L46
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            int r3 = r9.getChildCount()
            r2 = 0
        L82:
            if (r2 >= r3) goto L46
            android.view.View r1 = r9.getChildAt(r2)
            if (r1 == 0) goto La1
            int r0 = r1.getVisibility()
            if (r0 == r8) goto La1
            java.lang.Object r1 = r1.getTag(r7)
            boolean r0 = r1 instanceof X.C0ZJ8
            if (r0 == 0) goto La1
            if (r1 == 0) goto La1
            boolean r0 = r4.add(r1)
            java.lang.Boolean.valueOf(r0)
        La1:
            int r2 = r2 + 1
            goto L82
        La4:
            X.0ZJD r0 = r11.LL
            X.0zoY r1 = r0.LIZ
            X.0ZJ9 r0 = X.C0ZJ9.LIZ
            r0.getClass()
            X.C0ZJ9.LJ(r1, r4)
            X.0ZJD r0 = r11.LL
            X.04rr r0 = r0.LIZLLL
            r0.getClass()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ZJ5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
