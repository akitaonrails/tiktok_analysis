package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.05DN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatroomEmojiPanelAssem$onViewCreated$2$2", f = "ChatroomEmojiPanelAssem.kt", l = {}, m = "invokeSuspend")
public final class C05DN extends C09AX implements InterfaceC1631620sYq<Boolean, Boolean, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ boolean LL;
    public /* synthetic */ boolean LLILLJJLI;

    public C05DN(InterfaceC1364105Vn<? super C05DN> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatroomEmojiPanelAssem@819c.onViewCreated$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = this.LL;
        boolean z2 = this.LLILLJJLI;
        boolean z3 = true;
        if (!((Boolean) C2273121DyA.LIZJ.getValue()).booleanValue() ? !z : !z && !z2) {
            z3 = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z3);
        C1C7U.LIZIZ("ChatroomEmojiPanelAssem@819c.onViewCreated$2$2");
        return boolValueOf;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Boolean bool, Boolean bool2, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        C05DN c05dn = new C05DN(interfaceC1364105Vn);
        c05dn.LL = zBooleanValue;
        c05dn.LLILLJJLI = zBooleanValue2;
        return c05dn.invokeSuspend(Unit.LIZ);
    }
}
