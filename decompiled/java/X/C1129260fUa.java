package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.0fUa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.giftbasic.domain.usecase.panel.OpenPanelUseCase", f = "OpenPanelUseCase.kt", l = {86, 109, 131}, m = "invoke")
public final class C1129260fUa extends AbstractC23140094w {
    public C1129080fUI LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Room LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C1128850fTv LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1129260fUa(C1128850fTv c1128850fTv, InterfaceC1364105Vn<? super C1129260fUa> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c1128850fTv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OpenPanelUseCase@d7eb.invoke$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZLL.LIZIZ(null, null, null, null, this);
        C1C7U.LIZIZ("OpenPanelUseCase@d7eb.invoke$1");
        return objLIZIZ;
    }
}
