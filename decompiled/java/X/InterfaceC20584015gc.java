package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtCancelRequest;
import com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtCancelResponse;
import com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtGenerateResponse;
import com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtResultsRequest;
import com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtResultsResponse;
import com.ss.android.ugc.aweme.story.note.avatar.AvatarThoughtSocialAvatarResponse;

/* JADX INFO: renamed from: X.15gc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public interface InterfaceC20584015gc {
    public static final C339920DUg LIZ = C339920DUg.LIZ;

    @InterfaceC1501200pAU("/tiktok/v1/story/user_avatars")
    Object LIZ(InterfaceC1364105Vn<? super AvatarThoughtSocialAvatarResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/tiktok/v1/avatar_thought/cancel")
    Object LIZIZ(@C040I AvatarThoughtCancelRequest avatarThoughtCancelRequest, InterfaceC1364105Vn<? super AvatarThoughtCancelResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/tiktok/v1/avatar_thought/save")
    @InterfaceC1485505rh
    Object LIZJ(@InterfaceC1501100pAK("task_id") String str, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/tiktok/v1/avatar_thought/results")
    Object LIZLLL(@C040I AvatarThoughtResultsRequest avatarThoughtResultsRequest, InterfaceC1364105Vn<? super AvatarThoughtResultsResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/tiktok/v1/avatar_thought/generate")
    @InterfaceC1485505rh
    Object LJ(@InterfaceC1501100pAK("text_element") String str, InterfaceC1364105Vn<? super AvatarThoughtGenerateResponse> interfaceC1364105Vn);
}
