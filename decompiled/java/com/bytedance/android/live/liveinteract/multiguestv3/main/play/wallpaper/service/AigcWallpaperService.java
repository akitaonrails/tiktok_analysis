package com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.service;

import X.C926820aE4;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.liveinteract.multilive.model.GetWallpaperContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.WallpaperAiCreateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.WallpaperCreateParams;
import com.bytedance.android.live.liveinteract.multilive.model.WallpaperCreateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.WallpaperEndResponse;
import com.bytedance.android.live.liveinteract.multilive.model.WallpaperPicReplyResponse;
import com.bytedance.android.live.liveinteract.multilive.model.WallpaperReplyResponse;
import com.bytedance.android.live.liveinteract.multilive.model.WallpaperUserLeaveResponse;

/* JADX INFO: loaded from: classes16.dex */
public interface AigcWallpaperService {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/multi_guest_play/wallpaper/pic_reply/")
    Object applyAigcWallpaper(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("channel_id") long j2, @InterfaceC1501050pAF("wallpaper_id") long j3, @InterfaceC1501050pAF("ai_pic_url") String str, @InterfaceC1501050pAF("context_keywords") String str2, @InterfaceC1501050pAF("keywords") String str3, @InterfaceC1501050pAF("reply_type") int i, InterfaceC1364105Vn<? super C926820aE4<WallpaperPicReplyResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/multi_guest_play/wallpaper/ai_create/")
    Object createAigcWallpaper(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("channel_id") long j2, @InterfaceC1501050pAF("wallpaper_id") long j3, @InterfaceC1501050pAF("keywords") String str, @InterfaceC1501050pAF("context_keywords") String str2, @InterfaceC1501050pAF("ai_style") long j4, InterfaceC1364105Vn<? super C926820aE4<WallpaperAiCreateResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/multi_guest_play/wallpaper/create/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    Object createAigcWallpaperMode(@InterfaceC1485405rg WallpaperCreateParams wallpaperCreateParams, InterfaceC1364105Vn<? super C926820aE4<WallpaperCreateResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/multi_guest_play/wallpaper/end/")
    Object destroyAigcWallpaperMode(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("channel_id") long j2, @InterfaceC1501050pAF("wallpaper_id") long j3, @InterfaceC1501050pAF("end_apply_type") int i, InterfaceC1364105Vn<? super C926820aE4<WallpaperEndResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR(" /webcast/multi_guest_play/wallpaper/get_content/")
    Object fetchPlayerInfoAigcWallpaper(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("channel_id") long j2, @InterfaceC1501050pAF("wallpaper_id") long j3, InterfaceC1364105Vn<? super C926820aE4<GetWallpaperContentResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/multi_guest_play/wallpaper/user_leave/")
    Object leaveAigcWallpaper(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("channel_id") long j2, @InterfaceC1501050pAF("wallpaper_id") long j3, InterfaceC1364105Vn<? super C926820aE4<WallpaperUserLeaveResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/multi_guest_play/wallpaper/reply/")
    Object replyInviteAigcWallpaper(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("channel_id") long j2, @InterfaceC1501050pAF("wallpaper_id") long j3, @InterfaceC1501050pAF("reply_type") int i, InterfaceC1364105Vn<? super C926820aE4<WallpaperReplyResponse.ResponseData>> interfaceC1364105Vn);
}
