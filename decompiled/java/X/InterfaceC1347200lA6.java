package X;

import com.ss.android.ugc.aweme.comment.poll.repository.CreatePollResponse;

/* JADX INFO: renamed from: X.0lA6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public interface InterfaceC1347200lA6 {
    @InterfaceC1501240pAY("/aweme/v1/comment/poll/cancel_vote/")
    @InterfaceC1485505rh
    Object LIZ(@InterfaceC1501100pAK("item_id") String str, @InterfaceC1501100pAK("poll_id") String str2, @InterfaceC1501100pAK("option_index") int i, InterfaceC1364105Vn<? super C990830btJ> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/aweme/v1/comment/poll/create/")
    @InterfaceC1485505rh
    Object LIZIZ(@InterfaceC1501100pAK("item_id") String str, @InterfaceC1501100pAK("title") String str2, @InterfaceC1501100pAK("poll_option_list") String str3, @InterfaceC1501100pAK("expire_time") long j, InterfaceC1364105Vn<? super CreatePollResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/aweme/v1/comment/poll/vote/")
    @InterfaceC1485505rh
    Object LIZJ(@InterfaceC1501100pAK("item_id") String str, @InterfaceC1501100pAK("poll_id") String str2, @InterfaceC1501100pAK("option_index") int i, InterfaceC1364105Vn<? super C990840btK> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/aweme/v1/comment/poll/delete/")
    @InterfaceC1485505rh
    Object LIZLLL(@InterfaceC1501100pAK("poll_id") String str, @InterfaceC1501100pAK("item_id") String str2, InterfaceC1364105Vn<? super C990850btL> interfaceC1364105Vn);
}
