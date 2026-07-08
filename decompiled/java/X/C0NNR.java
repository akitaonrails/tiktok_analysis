package X;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0NNR, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.tux.compose.TuxSwitchKt$TuxSwitch$6$1$2", f = "TuxSwitch.kt", l = {}, m = "invokeSuspend")
public final class C0NNR extends C09AX implements InterfaceC1631620sYq<Boolean, C0NNS, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends C0NNS>>, Object> {
    public /* synthetic */ boolean LL;
    public /* synthetic */ C0NNS LLILLJJLI;

    public C0NNR(InterfaceC1364105Vn<? super C0NNR> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TuxSwitchKt@eb2.TuxSwitch$6$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = this.LL;
        Pair pair = new Pair(Boolean.valueOf(z), this.LLILLJJLI);
        C1C7U.LIZIZ("TuxSwitchKt@eb2.TuxSwitch$6$1$2");
        return pair;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Boolean bool, C0NNS c0nns, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends C0NNS>> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        C0NNR c0nnr = new C0NNR(interfaceC1364105Vn);
        c0nnr.LL = zBooleanValue;
        c0nnr.LLILLJJLI = c0nns;
        return c0nnr.invokeSuspend(Unit.LIZ);
    }
}
