package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05V1, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.ui.aggregated.SocialThoughtAggregatedCellKt$SocialThoughtAggregatedCell$2$1", f = "SocialThoughtAggregatedCell.kt", l = {180, 181}, m = "invokeSuspend")
public final class C05V1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05V1(int i, C1677480tko c1677480tko, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = i;
        this.LLILZ = c1677480tko;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05V1(this.LLILLL, this.LLILZ, interfaceC1364105Vn, this.LLILLJJLI);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r7 = "SocialThoughtAggregatedCellKt@4745.SocialThoughtAggregatedCell$2$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r13.LL
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L35
            if (r0 != r3) goto L5b
            X.C155000ia.LIZIZ(r14)
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L1c:
            X.C155000ia.LIZIZ(r14)
            boolean r0 = r13.LLILLJJLI
            if (r0 == 0) goto L16
            int r0 = r13.LLILLL
            long r5 = (long) r0
            r0 = 75
            long r5 = r5 * r0
            r13.LL = r2
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r5, r13)
            if (r0 != r4) goto L38
            X.C1C7U.LIZIZ(r7)
            return r4
        L35:
            X.C155000ia.LIZIZ(r14)
        L38:
            X.0tko<java.lang.Float, X.0tkU> r8 = r13.LLILZ
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r9 = X.C2286608xc.LIZLLL(r0)
            r2 = 1061830001(0x3f4a3d71, float:0.79)
            r11 = 0
            r1 = 1138447155(0x43db5333, float:438.65)
            r0 = 4
            X.0tjr r10 = X.C1671550tbF.LIZJ(r2, r1, r11, r0)
            r14 = 12
            r13.LL = r3
            r12 = r11
            java.lang.Object r0 = X.C1677480tko.LIZJ(r8, r9, r10, r11, r12, r13, r14)
            if (r0 != r4) goto L16
            X.C1C7U.LIZIZ(r7)
            return r4
        L5b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05V1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
