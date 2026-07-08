package X;

import com.ss.android.ugc.aweme.creativedetail.datamodel.CreativeToolDetailListModel;
import com.ss.android.ugc.aweme.creativedetail.datamodel.CreativeToolDetailModel;

/* JADX INFO: renamed from: X.0Ojm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC627760Ojm {
    public static final C627770Ojn LIZ = C627770Ojn.LIZ;

    @InterfaceC1501200pAU("/tiktok/v1/publish/anchor/detail")
    Object LIZ(@InterfaceC1501120pAM("anchor_type") int i, @InterfaceC1501120pAM("detail_page_id") String str, InterfaceC1364105Vn<? super CreativeToolDetailModel> interfaceC1364105Vn);

    @InterfaceC1501200pAU("/tiktok/v1/publish/anchor/aweme")
    Object LIZIZ(@InterfaceC1501120pAM("anchor_type") int i, @InterfaceC1501120pAM("detail_page_id") String str, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") int i2, InterfaceC1364105Vn<? super CreativeToolDetailListModel> interfaceC1364105Vn);
}
