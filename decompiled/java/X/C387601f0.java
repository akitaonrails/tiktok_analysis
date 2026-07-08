package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01f0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.conflict.PCSBoardEffectManager$checkBoardConflicts$1$1", f = "PCSBoardEffectManager.kt", l = {143, 151, 155, 172}, m = "invokeSuspend")
public final class C387601f0 extends C09AX implements Function2<InterfaceC346701Wf<? super Boolean>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C389701fL LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C387601f0(int i, C389701fL c389701fL, InterfaceC1364105Vn<? super C387601f0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = i;
        this.LLILZ = c389701fL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C387601f0 c387601f0 = new C387601f0(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c387601f0.LLILLJJLI = obj;
        return c387601f0;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C387601f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super Boolean> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
