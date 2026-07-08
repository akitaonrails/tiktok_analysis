package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0HUo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.quickchat.ui.assem.QuickDMEmojiAbility$getEmojiBtnStateFlow$1$1", f = "IMQuickMessageInputVM.kt", l = {}, m = "invokeSuspend")
public final class C441920HUo extends C09AX implements InterfaceC1631630sYr<C1640006bW, EnumC430090Gtj, InterfaceC456120Huc, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ EnumC430090Gtj LL;
    public /* synthetic */ InterfaceC456120Huc LLILLJJLI;
    public final /* synthetic */ InterfaceC332260D0u<InterfaceC441910HUn> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C441920HUo(InterfaceC332260D0u<InterfaceC441910HUn> interfaceC332260D0u, InterfaceC1364105Vn<? super C441920HUo> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
        this.LLILLL = interfaceC332260D0u;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC441910HUn c441860HUi;
        C1C7U.LIZ("QuickDMEmojiAbility@6d1f.getEmojiBtnStateFlow$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EnumC430090Gtj enumC430090Gtj = this.LL;
        InterfaceC456120Huc interfaceC456120Huc = this.LLILLJJLI;
        InterfaceC332260D0u<InterfaceC441910HUn> interfaceC332260D0u = this.LLILLL;
        if (C1630706a1.LIZ(enumC430090Gtj)) {
            c441860HUi = C441930HUp.LIZ;
        } else if (interfaceC456120Huc instanceof InterfaceC1632206aG) {
            c441860HUi = C441940HUq.LIZ;
        } else {
            c441860HUi = new C441860HUi(EnumC441840HUg.EMOJI);
        }
        interfaceC332260D0u.setValue(c441860HUi);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("QuickDMEmojiAbility@6d1f.getEmojiBtnStateFlow$1$1");
        return unit;
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(C1640006bW c1640006bW, EnumC430090Gtj enumC430090Gtj, InterfaceC456120Huc interfaceC456120Huc, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C441920HUo c441920HUo = new C441920HUo(this.LLILLL, interfaceC1364105Vn);
        c441920HUo.LL = enumC430090Gtj;
        c441920HUo.LLILLJJLI = interfaceC456120Huc;
        return c441920HUo.invokeSuspend(Unit.LIZ);
    }
}
