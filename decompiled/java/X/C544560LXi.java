package X;

import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LXi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel$startWaitingTimeJob$2", f = "AIGCOfflineProcessingViewModel.kt", l = {931}, m = "invokeSuspend")
public final class C544560LXi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C118300cf LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ AIGCOfflineProcessingViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544560LXi(int i, AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel, InterfaceC1364105Vn<? super C544560LXi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = i;
        this.LLILZIL = aIGCOfflineProcessingViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C544560LXi c544560LXi = new C544560LXi(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c544560LXi.LLILLL = obj;
        return c544560LXi;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0069 -> B:6:0x001b). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            java.lang.String r8 = "AIGCOfflineProcessingViewModel@fe8e.startWaitingTimeJob$2"
            X.C1C7U.LIZ(r8)
            java.lang.Object r6 = X.C099R.LJFF()
            r7 = r24
            int r0 = r7.LLILLJJLI
            r5 = 1
            if (r0 == 0) goto L6f
            if (r0 != r5) goto L86
            X.00cf r1 = r7.LL
            java.lang.Object r2 = r7.LLILLL
            X.01wk r2 = (X.InterfaceC497601wk) r2
            X.C155000ia.LIZIZ(r25)
        L1b:
            int r0 = r1.element
            if (r0 <= r5) goto L23
            int r0 = r0 + (-1)
            r1.element = r0
        L23:
            int r0 = r1.element
            if (r0 <= 0) goto L80
            boolean r0 = X.C2296808zG.LJI(r2)
            if (r0 == 0) goto L80
            com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel r0 = r7.LLILZIL
            X.1DDq r4 = r0.LLJILLL
        L31:
            java.lang.Object r3 = r4.getValue()
            r9 = r3
            X.0LY8 r9 = (X.C0LY8) r9
            r10 = 0
            int r0 = r1.element
            java.lang.Integer r14 = X.C2286608xc.LJ(r0)
            r23 = 32751(0x7fef, float:4.5894E-41)
            r11 = r10
            r12 = r10
            r13 = r10
            r15 = r10
            r16 = r10
            r17 = r10
            r18 = r10
            r19 = r10
            r20 = r10
            r21 = r10
            r22 = r10
            X.0LY8 r0 = X.C0LY8.LIZ(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r0 = r4.compareAndSet(r3, r0)
            if (r0 == 0) goto L31
            r7.LLILLL = r2
            r7.LL = r1
            r7.LLILLJJLI = r5
            r3 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r3, r7)
            if (r0 != r6) goto L1b
            X.C1C7U.LIZIZ(r8)
            return r6
        L6f:
            X.C155000ia.LIZIZ(r25)
            java.lang.Object r2 = r7.LLILLL
            X.01wk r2 = (X.InterfaceC497601wk) r2
            X.00cf r1 = new X.00cf
            r1.<init>()
            int r0 = r7.LLILZ
            r1.element = r0
            goto L23
        L80:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L86:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C544560LXi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
