package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01eu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.conflict.PCSBoardEffectManager$downloadResource$1$1", f = "PCSBoardEffectManager.kt", l = {266, 269}, m = "invokeSuspend")
public final class C387001eu extends C09AX implements Function2<InterfaceC346701Wf<? super LiveEffect>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C387101ev LLILZ;
    public final /* synthetic */ C389701fL LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C387001eu(C387101ev c387101ev, C389701fL c389701fL, InterfaceC1364105Vn<? super C387001eu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c387101ev;
        this.LLILZIL = c389701fL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C387001eu c387001eu = new C387001eu(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c387001eu.LLILLL = obj;
        return c387001eu;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "PCSBoardEffectManager@20d3.downloadResource$1$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LLILLJJLI
            r5 = 2
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L3d
            if (r0 == r3) goto L71
            if (r0 != r5) goto L8b
            X.C155000ia.LIZIZ(r9)
        L17:
            X.01fp r3 = new X.01fp
            X.01es r0 = new X.01es
            r2 = -1006(0xfffffffffffffc12, float:NaN)
            java.lang.String r1 = "Effect download fail"
            r0.<init>(r2, r1)
            r3.<init>(r0)
            X.C392601fo.LJI(r3)
            X.01fL r0 = r8.LLILZIL
            X.01GW r0 = r0.LJ
            java.lang.Object r0 = r0.getValue()
            X.01fS r0 = (X.InterfaceC390401fS) r0
            if (r0 == 0) goto L37
            r0.LIZIZ(r2, r1)
        L37:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L3d:
            X.C155000ia.LIZIZ(r9)
            java.lang.Object r1 = r8.LLILLL
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            X.01ft r0 = X.C393101ft.LIZ
            X.C392601fo.LJII(r0, r4)
            X.01ev r0 = r8.LLILZ
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = r0.LIZIZ
            if (r0 == 0) goto L55
            java.lang.String r0 = r0.getResourceId()
            if (r0 != 0) goto L57
        L55:
            java.lang.String r0 = ""
        L57:
            X.C392601fo.LIZLLL = r0
            X.01ev r2 = r8.LLILZ
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = r2.LIZIZ
            int r2 = r2.LIZ
            if (r2 != r3) goto L7a
            r8.LLILLL = r1
            r8.LL = r2
            r8.LLILLJJLI = r3
            java.lang.Object r0 = r1.emit(r0, r8)
            if (r0 != r6) goto L37
            X.C1C7U.LIZIZ(r7)
            return r6
        L71:
            int r2 = r8.LL
            java.lang.Object r1 = r8.LLILLL
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            X.C155000ia.LIZIZ(r9)
        L7a:
            r0 = -1
            if (r2 != r0) goto L37
            r8.LLILLL = r4
            r8.LLILLJJLI = r5
            java.lang.Object r0 = r1.emit(r4, r8)
            if (r0 != r6) goto L17
            X.C1C7U.LIZIZ(r7)
            return r6
        L8b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C387001eu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super LiveEffect> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
