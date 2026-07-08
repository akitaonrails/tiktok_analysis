package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0qvC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.domain.usecase.header.GetRechargePanelNoticeUseCase", f = "GetRechargePanelNoticeUseCase.kt", l = {LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT}, m = "execute")
public final class C1568600qvC extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1568590qvB LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1568600qvC(C1568590qvB c1568590qvB, InterfaceC1364105Vn<? super C1568600qvC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1568590qvB;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetRechargePanelNoticeUseCase@9173.execute$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLJJLI.LJFF(null, this);
        C1C7U.LIZIZ("GetRechargePanelNoticeUseCase@9173.execute$1");
        return objLJFF;
    }
}
