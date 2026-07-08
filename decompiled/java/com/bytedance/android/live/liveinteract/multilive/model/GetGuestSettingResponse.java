package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class GetGuestSettingResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("distribution_status")
        public int distributionStatus;

        @C09CT("flow_distribute")
        public int flowDistribute;

        @C09CT("guest_camera_mirror_status")
        public int guestCameraMirrorStatus;

        @C09CT("guest_camera_status")
        public int guestCameraStatus;

        @C09CT("guest_hear_your_voice_status")
        public int guestHearYourVoiceStatus;

        @C09CT("guest_preview_camera_status")
        public int guestPreviewCameraStatus;

        @C09CT("guest_preview_used_effect_id")
        public String guestPreviewUsedEffectId = "";

        @C09CT("rank_list_show_action")
        public int rankListShowAction;
    }
}
