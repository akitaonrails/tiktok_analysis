package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.b2c.api.model.ClickToChatItemResponse;

/* JADX INFO: renamed from: X.06fA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1662606fA implements InterfaceC1662706fB {
    public static final C1662606fA LIZIZ = new C1662606fA();
    public final /* synthetic */ InterfaceC1662706fB LIZ = (InterfaceC1662706fB) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(InterfaceC1662706fB.class);

    @Override // X.InterfaceC1662706fB
    @InterfaceC1501200pAU("/tiktok/v1/im/b2c/click_to_chat/start_conv")
    public final Object LIZ(@InterfaceC1501120pAM("link_user_name") String str, @InterfaceC1501120pAM("link_message") String str2, InterfaceC1364105Vn<? super ClickToChatItemResponse> interfaceC1364105Vn) {
        return this.LIZ.LIZ(str, str2, interfaceC1364105Vn);
    }
}
