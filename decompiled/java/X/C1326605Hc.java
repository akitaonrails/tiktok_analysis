package X;

import com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Hc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent$showBottomSkipWithAnimation$1", f = "BaseInterestSelectionComponent.kt", l = {1130, 1137, 1147}, m = "invokeSuspend")
public final class C1326605Hc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ BaseInterestSelectionComponent LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1326605Hc(boolean z, long j, BaseInterestSelectionComponent baseInterestSelectionComponent, InterfaceC1364105Vn<? super C1326605Hc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = j;
        this.LLILZ = baseInterestSelectionComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1326605Hc(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "BaseInterestSelectionComponent@f1ee.showBottomSkipWithAnimation$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r8.LL
            r5 = 3
            r6 = 2
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L20
            if (r0 == r2) goto L4d
            if (r0 == r6) goto L48
            if (r0 != r5) goto La5
            X.C155000ia.LIZIZ(r9)
        L1a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L20:
            X.C155000ia.LIZIZ(r9)
            boolean r0 = r8.LLILLJJLI
            if (r0 == 0) goto L3a
            long r0 = r8.LLILLL
            X.05Hd r6 = new X.05Hd
            r6.<init>(r3)
            r8.LL = r2
            java.lang.Object r9 = X.C099A.LIZJ(r0, r6, r8)
            if (r9 != r4) goto L50
            X.C1C7U.LIZIZ(r7)
            return r4
        L3a:
            long r0 = r8.LLILLL
            r8.LL = r6
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r8)
            if (r0 != r4) goto L4b
            X.C1C7U.LIZIZ(r7)
            return r4
        L48:
            X.C155000ia.LIZIZ(r9)
        L4b:
            r9 = r3
            goto L50
        L4d:
            X.C155000ia.LIZIZ(r9)
        L50:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isRTL? "
            r1.append(r0)
            com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent r0 = r8.LLILZ
            X.127h r0 = r0.LLJZIJLIL
            r6 = 0
            if (r0 == 0) goto La3
            int r0 = r0.getLayoutDirection()
            if (r0 != r2) goto La1
            r0 = 1
        L67:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L6b:
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            int r0 = X.C1720306oT.LIZ
            com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent r1 = r8.LLILZ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r9, r0)
            if (r0 == 0) goto L9c
            java.lang.Integer r0 = X.C2286608xc.LJ(r2)
        L83:
            r1.LLLIIIL = r0
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.06PJ r1 = new X.06PJ
            com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent r0 = r8.LLILZ
            r1.<init>(r0, r3)
            r8.LL = r5
            java.lang.Object r0 = X.C23250099c.LJI(r8, r2, r1)
            if (r0 != r4) goto L1a
            X.C1C7U.LIZIZ(r7)
            return r4
        L9c:
            java.lang.Integer r0 = X.C2286608xc.LJ(r6)
            goto L83
        La1:
            r0 = 0
            goto L67
        La3:
            r0 = r3
            goto L6b
        La5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1326605Hc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
