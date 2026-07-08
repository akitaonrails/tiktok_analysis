package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.ConfirmUserAuctionInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.GetAuctionInfoRequest;

/* JADX INFO: renamed from: X.040v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC10295040v {
    public static final C10291040r LIZ = C10291040r.LIZ;

    @InterfaceC1501240pAY("/api/v1/trade_auction/info/get")
    Object LIZ(@C040I GetAuctionInfoRequest getAuctionInfoRequest, InterfaceC1364105Vn<? super C1026503zr> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/trade_auction/info/confirm")
    Object LIZIZ(@C040I ConfirmUserAuctionInfoRequest confirmUserAuctionInfoRequest, InterfaceC1364105Vn<? super C1026403zq> interfaceC1364105Vn);
}
