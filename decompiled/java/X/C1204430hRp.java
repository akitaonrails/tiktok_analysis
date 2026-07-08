package X;

import android.view.View;
import com.ss.android.ugc.nearby.feedcard.vm.NearbyFeedSharedViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hRp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.nearby.feedcard.vm.NearbyFeedSharedViewModel$afterPreloadRefresh$1", f = "NearbyFeedSharedViewModel.kt", l = {681}, m = "invokeSuspend")
public final class C1204430hRp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ NearbyFeedSharedViewModel LLILLL;
    public final /* synthetic */ C1203960hR4 LLILZ;
    public final /* synthetic */ View LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1204430hRp(NearbyFeedSharedViewModel nearbyFeedSharedViewModel, C1203960hR4 c1203960hR4, View view, InterfaceC1364105Vn<? super C1204430hRp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = nearbyFeedSharedViewModel;
        this.LLILZ = c1203960hR4;
        this.LLILZIL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1204430hRp c1204430hRp = new C1204430hRp(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1204430hRp.LLILLJJLI = obj;
        return c1204430hRp;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[Catch: Exception -> 0x0083, TRY_LEAVE, TryCatch #0 {Exception -> 0x0083, blocks: (B:16:0x0043, B:17:0x0046, B:18:0x0048, B:21:0x0050, B:25:0x005c, B:27:0x0064, B:28:0x0078, B:30:0x007c, B:9:0x0025, B:11:0x002b), top: B:38:0x000d }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "NearbyFeedSharedViewModel@5001.afterPreloadRefresh$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LL
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L1e
            if (r0 != r5) goto L16
            java.lang.Object r3 = r8.LLILLJJLI
            X.01wk r3 = (X.InterfaceC497601wk) r3
            goto L43
        L16:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1e:
            X.C155000ia.LIZIZ(r9)
            java.lang.Object r3 = r8.LLILLJJLI
            X.01wk r3 = (X.InterfaceC497601wk) r3
            com.ss.android.ugc.nearby.feedcard.vm.NearbyFeedSharedViewModel r0 = r8.LLILLL     // Catch: java.lang.Exception -> L83
            X.0hRq r2 = r0.LLJ     // Catch: java.lang.Exception -> L83
            if (r2 == 0) goto L41
            r0 = 1
            java.lang.Long r1 = X.C2286608xc.LJFF(r0)     // Catch: java.lang.Exception -> L83
            X.0hR4 r0 = r8.LLILZ     // Catch: java.lang.Exception -> L83
            r8.LLILLJJLI = r3     // Catch: java.lang.Exception -> L83
            r8.LL = r5     // Catch: java.lang.Exception -> L83
            java.lang.Object r9 = r2.invoke(r1, r0, r8)     // Catch: java.lang.Exception -> L83
            if (r9 != r6) goto L46
            X.C1C7U.LIZIZ(r7)
            return r6
        L41:
            r9 = r4
            goto L48
        L43:
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Exception -> L83
        L46:
            kotlin.Pair r9 = (kotlin.Pair) r9     // Catch: java.lang.Exception -> L83
        L48:
            boolean r0 = X.C2296808zG.LJI(r3)     // Catch: java.lang.Exception -> L83
            if (r0 == 0) goto L78
            if (r9 == 0) goto L57
            java.lang.Object r0 = r9.getFirst()     // Catch: java.lang.Exception -> L83
            X.0hRM r0 = (X.EnumC1204140hRM) r0     // Catch: java.lang.Exception -> L83
            goto L58
        L57:
            r0 = r4
        L58:
            if (r0 != 0) goto L78
            if (r9 == 0) goto L62
            java.lang.Object r4 = r9.getSecond()     // Catch: java.lang.Exception -> L83
            X.0hRG r4 = (X.C1204080hRG) r4     // Catch: java.lang.Exception -> L83
        L62:
            if (r4 == 0) goto L78
            com.ss.android.ugc.nearby.feedcard.vm.NearbyFeedSharedViewModel r3 = r8.LLILLL     // Catch: java.lang.Exception -> L83
            X.0hR4 r2 = r8.LLILZ     // Catch: java.lang.Exception -> L83
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Exception -> L83
            r4.LJII = r0     // Catch: java.lang.Exception -> L83
            kotlin.jvm.internal.AwS384S0200000_18 r1 = new kotlin.jvm.internal.AwS384S0200000_18     // Catch: java.lang.Exception -> L83
            r0 = 256(0x100, float:3.59E-43)
            r1.<init>(r4, r2, r0)     // Catch: java.lang.Exception -> L83
            r3.setState(r1)     // Catch: java.lang.Exception -> L83
        L78:
            X.0hR4 r2 = r8.LLILZ     // Catch: java.lang.Exception -> L83
            if (r2 == 0) goto Lad
            android.view.View r1 = r8.LLILZIL     // Catch: java.lang.Exception -> L83
            r0 = 0
            r2.LIZIZ(r1, r0)     // Catch: java.lang.Exception -> L83
            goto Lad
        L83:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0hR4 r1 = r8.LLILZ
            if (r1 == 0) goto L9a
            kotlin.Pair r0 = X.C2177408g0.LIZIZ(r2)
            java.lang.Object r0 = r0.getFirst()
            java.lang.String r0 = (java.lang.String) r0
            r1.LJIIJ = r0
            r1.LIZ()
        L9a:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "afterPreloadRefresh cancelled or failed, e="
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
        Lad:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1204430hRp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
