package X;

import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.ConversationResponse;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.CreatorPermissionResponse;

/* JADX INFO: renamed from: X.0iTZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public interface InterfaceC1243950iTZ {
    public static final C1751280vfq LIZ = C1751280vfq.LIZ;

    @InterfaceC1501200pAU("/api/v1/affiliate/notification/ec_permission")
    Object LIZ(InterfaceC1364105Vn<? super CreatorPermissionResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("/api/v1/im/shop_creator/creator/conversation_inbox_api/list")
    Object LIZIZ(@InterfaceC1501120pAM("shopCreatorCursor") Integer num, @InterfaceC1501120pAM("shopCreatorLimit") int i, @InterfaceC1501120pAM("shopBuyerCursor") Integer num2, @InterfaceC1501120pAM("shopBuyerLimit") int i2, @InterfaceC1501120pAM("shopPlatformCursor") Integer num3, @InterfaceC1501120pAM("shopPlatformLimit") int i3, @InterfaceC1501120pAM("PIGEON_BIZ_TYPE") int i4, @InterfaceC1501120pAM("Ecommercemsgexpversion") int i5, InterfaceC1364105Vn<? super ConversationResponse> interfaceC1364105Vn);
}
