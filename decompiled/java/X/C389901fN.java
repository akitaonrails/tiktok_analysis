package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01fN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.conflict.PCSBoardEffectManager$setUpCurrentEffectResource$1", f = "PCSBoardEffectManager.kt", l = {291, 294, 309, 314}, m = "invokeSuspend")
public final class C389901fN extends C09AX implements Function2<InterfaceC346701Wf<? super Boolean>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C389701fL LLILLL;
    public final /* synthetic */ LiveEffect LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C389901fN(C389701fL c389701fL, LiveEffect liveEffect, InterfaceC1364105Vn<? super C389901fN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c389701fL;
        this.LLILZ = liveEffect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C389901fN c389901fN = new C389901fN(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c389901fN.LLILLJJLI = obj;
        return c389901fN;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C389901fN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super Boolean> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
