package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.05C3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoFullscreenTextInputSlotAssem$observeRootVisibility$1$1", f = "TakoAIVideoFullscreenTextInputSlotAssem.kt", l = {}, m = "invokeSuspend")
public final class C05C3 extends C09AX implements InterfaceC1631620sYq<Boolean, Boolean, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ boolean LL;
    public /* synthetic */ boolean LLILLJJLI;

    public C05C3(InterfaceC1364105Vn<? super C05C3> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("TakoAIVideoFullscreenTextInputSlotAssem@5bab.observeRootVisibility$1$1");
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
        C1C7U.LIZIZ("TakoAIVideoFullscreenTextInputSlotAssem@5bab.observeRootVisibility$1$1");
        return boolValueOf;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Boolean bool, Boolean bool2, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        C05C3 c05c3 = new C05C3(interfaceC1364105Vn);
        c05c3.LL = zBooleanValue;
        c05c3.LLILLJJLI = zBooleanValue2;
        return c05c3.invokeSuspend(Unit.LIZ);
    }
}
