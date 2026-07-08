package com.bytedance.android.live.aireply;

import X.C006A;
import X.C05YD;
import X.C445870He5;
import X.InterfaceC1364105Vn;
import X.InterfaceC346201Wa;
import com.bytedance.android.livesdk.model.CommentReply;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public interface IAIReplyAnchorManagerService extends C006A {
    public static final C445870He5 Companion = C445870He5.LIZ;

    boolean feedbackComment(CommentReply commentReply, long j, boolean z);

    Object getAiCommentReplySwitch(DataChannel dataChannel, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    InterfaceC346201Wa<Pair<Long, Integer>> getFeedbackState();

    C05YD<Boolean> getHasPermission();

    C05YD<Boolean> getSwitchLoading();

    C05YD<Boolean> getSwitchStateFlow();

    /* bridge */ /* synthetic */ void onInit();

    void refreshPermission(boolean z);

    boolean updateSwitchState(DataChannel dataChannel, boolean z);
}
