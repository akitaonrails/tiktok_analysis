package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.08lS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.quickchat.ui.assem.IMQuickMessageInputVM$onPrepared$2$3", f = "IMQuickMessageInputVM.kt", l = {}, m = "invokeSuspend")
public final class C2211208lS extends C09AX implements InterfaceC1631620sYq<Boolean, Boolean, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ boolean LL;
    public /* synthetic */ boolean LLILLJJLI;

    public C2211208lS(InterfaceC1364105Vn<? super C2211208lS> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMQuickMessageInputVM@b1e6.onPrepared$2$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(this.LL | this.LLILLJJLI);
        C1C7U.LIZIZ("IMQuickMessageInputVM@b1e6.onPrepared$2$3");
        return boolValueOf;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Boolean bool, Boolean bool2, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        C2211208lS c2211208lS = new C2211208lS(interfaceC1364105Vn);
        c2211208lS.LL = zBooleanValue;
        c2211208lS.LLILLJJLI = zBooleanValue2;
        return c2211208lS.invokeSuspend(Unit.LIZ);
    }
}
