package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.05Qk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.quickchat.ui.assem.QuickEmojiPanelAssem$subscribeToTextState$1$4", f = "QuickEmojiPanelAssem.kt", l = {}, m = "invokeSuspend")
public final class C1350805Qk extends C09AX implements InterfaceC1631630sYr<Boolean, Boolean, Boolean, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ boolean LL;
    public /* synthetic */ boolean LLILLJJLI;
    public /* synthetic */ boolean LLILLL;

    public C1350805Qk(InterfaceC1364105Vn<? super C1350805Qk> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QuickEmojiPanelAssem@177a.subscribeToTextState$1$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(this.LL & this.LLILLJJLI & (!this.LLILLL));
        C1C7U.LIZIZ("QuickEmojiPanelAssem@177a.subscribeToTextState$1$4");
        return boolValueOf;
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Boolean bool, Boolean bool2, Boolean bool3, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        boolean zBooleanValue3 = bool3.booleanValue();
        C1350805Qk c1350805Qk = new C1350805Qk(interfaceC1364105Vn);
        c1350805Qk.LL = zBooleanValue;
        c1350805Qk.LLILLJJLI = zBooleanValue2;
        c1350805Qk.LLILLL = zBooleanValue3;
        return c1350805Qk.invokeSuspend(Unit.LIZ);
    }
}
