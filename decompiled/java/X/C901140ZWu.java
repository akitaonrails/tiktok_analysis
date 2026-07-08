package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0ZWu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.common.titlebar.serviceimpl.TitleBarService", f = "TitleBarService.kt", l = {LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT}, m = "fetchTitleBarRightIconConf")
public final class C901140ZWu extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C901150ZWv LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C901140ZWu(C901150ZWv c901150ZWv, InterfaceC1364105Vn<? super C901140ZWu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c901150ZWv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TitleBarService@7708.fetchTitleBarRightIconConf$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(false, 0, false, this);
        C1C7U.LIZIZ("TitleBarService@7708.fetchTitleBarRightIconConf$1");
        return objLIZ;
    }
}
