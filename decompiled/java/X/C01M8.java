package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.01M8, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.scrolltobottomindicator.ScrollToBottomIndicator$scrollToBottomVisibilityFlow$1", f = "ScrollToBottomIndicator.kt", l = {}, m = "invokeSuspend")
public final class C01M8 extends C09AX implements InterfaceC1631620sYq<Boolean, Boolean, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ boolean LL;
    public /* synthetic */ boolean LLILLJJLI;

    public C01M8(InterfaceC1364105Vn<? super C01M8> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("ScrollToBottomIndicator@f37b.scrollToBottomVisibilityFlow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z2 = this.LL;
        boolean z3 = this.LLILLJJLI;
        if (!z2 && z3) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("ScrollToBottomIndicator@f37b.scrollToBottomVisibilityFlow$1");
        return boolValueOf;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Boolean bool, Boolean bool2, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        C01M8 c01m8 = new C01M8(interfaceC1364105Vn);
        c01m8.LL = zBooleanValue;
        c01m8.LLILLJJLI = zBooleanValue2;
        return c01m8.invokeSuspend(Unit.LIZ);
    }
}
