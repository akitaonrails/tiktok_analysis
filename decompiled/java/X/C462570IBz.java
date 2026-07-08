package X;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0IBz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.PhotoswapAnimAbilityImpl$launchPhotoSwapAnimAndReturnJob$1$1", f = "PhotoswapCard.kt", l = {}, m = "invokeSuspend")
public final class C462570IBz extends C09AX implements InterfaceC1631620sYq<Boolean, C0ZSW, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends C0ZSW>>, Object> {
    public /* synthetic */ boolean LL;
    public /* synthetic */ C0ZSW LLILLJJLI;

    public C462570IBz(InterfaceC1364105Vn<? super C462570IBz> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PhotoswapAnimAbilityImpl@603.launchPhotoSwapAnimAndReturnJob$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = this.LL;
        Pair pair = new Pair(Boolean.valueOf(z), this.LLILLJJLI);
        C1C7U.LIZIZ("PhotoswapAnimAbilityImpl@603.launchPhotoSwapAnimAndReturnJob$1$1");
        return pair;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Boolean bool, C0ZSW c0zsw, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends C0ZSW>> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        C462570IBz c462570IBz = new C462570IBz(interfaceC1364105Vn);
        c462570IBz.LL = zBooleanValue;
        c462570IBz.LLILLJJLI = c0zsw;
        return c462570IBz.invokeSuspend(Unit.LIZ);
    }
}
