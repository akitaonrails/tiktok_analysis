package X;

import com.ss.android.ugc.aweme.comment.commentlist.api.CommentBatchDeleteResponse;
import com.ss.android.ugc.aweme.comment.commentlist.api.UserBatchBlockResponse;

/* JADX INFO: renamed from: X.0l4d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public interface InterfaceC1343810l4d {
    public static final C1343820l4e LIZ = C1343820l4e.LIZ;

    @InterfaceC1501240pAY("/tiktok/v1/user/batch/block/")
    @InterfaceC1485505rh
    AbstractC19484711Kz<UserBatchBlockResponse> LIZ(@InterfaceC1501100pAK("to_user_id_list") String str);

    @InterfaceC1501240pAY("/tiktok/comment/batch_delete/v1")
    @InterfaceC1485505rh
    AbstractC19484711Kz<CommentBatchDeleteResponse> LIZIZ(@InterfaceC1501100pAK("cids") String str, @InterfaceC1501100pAK("item_id") String str2);
}
