package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.01qw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.FullWidthCarouselBottomComponent$observeEffectSelectStateToShowBottomWidget$1$2", f = "FullWidthCarouselBottomComponent.kt", l = {}, m = "invokeSuspend")
public final class C461601qw extends C09AX implements InterfaceC1631620sYq<InterfaceC461401qu, Boolean, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ InterfaceC461401qu LL;
    public /* synthetic */ boolean LLILLJJLI;

    public C461601qw(InterfaceC1364105Vn<? super C461601qw> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("FullWidthCarouselBottomComponent@d6b5.observeEffectSelectStateToShowBottomWidget$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC461401qu interfaceC461401qu = this.LL;
        boolean z2 = this.LLILLJJLI;
        if ((interfaceC461401qu instanceof C461501qv) && z2) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("FullWidthCarouselBottomComponent@d6b5.observeEffectSelectStateToShowBottomWidget$1$2");
        return boolValueOf;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC461401qu interfaceC461401qu, Boolean bool, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        C461601qw c461601qw = new C461601qw(interfaceC1364105Vn);
        c461601qw.LL = interfaceC461401qu;
        c461601qw.LLILLJJLI = zBooleanValue;
        return c461601qw.invokeSuspend(Unit.LIZ);
    }
}
