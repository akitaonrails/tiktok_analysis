package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.b2c.preview.B2CCheckItemRsp;

/* JADX INFO: renamed from: X.0Nbg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C597260Nbg implements InterfaceC597270Nbh {
    public static final C597260Nbg LIZIZ = new C597260Nbg();
    public final /* synthetic */ InterfaceC597270Nbh LIZ = (InterfaceC597270Nbh) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(InterfaceC597270Nbh.class);

    @Override // X.InterfaceC597270Nbh
    @InterfaceC1501200pAU("/tiktok/v1/im/chat/business/check/item")
    public final Object LIZ(@InterfaceC1501120pAM("biz_uid") long j, @InterfaceC1501120pAM("biz_id") String str, @InterfaceC1501120pAM("item_id") String str2, @InterfaceC1501120pAM("extra") String str3, InterfaceC1364105Vn<? super B2CCheckItemRsp> interfaceC1364105Vn) {
        return this.LIZ.LIZ(j, str, str2, str3, interfaceC1364105Vn);
    }
}
