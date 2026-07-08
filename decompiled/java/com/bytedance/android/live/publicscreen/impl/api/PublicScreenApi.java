package com.bytedance.android.live.publicscreen.impl.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.live.publicscreen.impl.api.model.CommentTranslationResult;
import com.bytedance.android.livesdk.chatroom.model.GetUserStatusResp;
import com.bytedance.android.livesdk.chatroom.model.WaveResponse;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public interface PublicScreenApi {
    @InterfaceC1501160pAQ("/webcast/room/get_user_status/")
    C11NZ<C470590Icr<GetUserStatusResp.Data>> getUserStatus(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("enter_uid") long j2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/comment_translate/")
    C11NZ<C470590Icr<CommentTranslationResult>> translateComment(@InterfaceC1501050pAF("comment_content") String str, @InterfaceC1501050pAF("anchor_id") long j, @InterfaceC1501050pAF("room_id") long j2, @InterfaceC1501050pAF("msg_id") long j3, @InterfaceC1501050pAF("room_message_heat_level") long j4, @InterfaceC1501050pAF("at_username") String str2, @InterfaceC1501050pAF("at_nickname") String str3, @InterfaceC1501050pAF("emotes_index") String str4);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/wave/")
    C11NZ<C470590Icr<WaveResponse>> wave(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("enter_uid") long j2, @InterfaceC1501050pAF("enter_msg_id") long j3, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) int i);
}
