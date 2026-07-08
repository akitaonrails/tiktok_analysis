package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.05A2, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoNoNetworkAssem$onViewCreated$3$1", f = "TakoAIVideoNoNetworkAssem.kt", l = {}, m = "invokeSuspend")
public final class C05A2 extends C09AX implements InterfaceC1631620sYq<Boolean, Boolean, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ boolean LL;
    public /* synthetic */ boolean LLILLJJLI;

    public C05A2(InterfaceC1364105Vn<? super C05A2> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("TakoAIVideoNoNetworkAssem@7bee.onViewCreated$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z2 = this.LL;
        boolean z3 = this.LLILLJJLI;
        if (!z2 && !z3) {
            z = false;
        } else {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("TakoAIVideoNoNetworkAssem@7bee.onViewCreated$3$1");
        return boolValueOf;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Boolean bool, Boolean bool2, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        C05A2 c05a2 = new C05A2(interfaceC1364105Vn);
        c05a2.LL = zBooleanValue;
        c05a2.LLILLJJLI = zBooleanValue2;
        return c05a2.invokeSuspend(Unit.LIZ);
    }
}
