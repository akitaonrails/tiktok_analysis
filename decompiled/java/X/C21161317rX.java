package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.17rX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.api.ServerABSettingsApi$Companion", f = "ServerABSettingsApi.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "getABTestResultForBroadcaster")
public final class C21161317rX extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C21161417rY LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21161317rX(C21161417rY c21161417rY, InterfaceC1364105Vn<? super C21161317rX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c21161417rY;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ServerABSettingsApi$Companion@eb56.getABTestResultForBroadcaster$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("ServerABSettingsApi$Companion@eb56.getABTestResultForBroadcaster$1");
        return objLIZ;
    }
}
