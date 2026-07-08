package com.bytedance.android.live.aireply;

import X.C006A;
import X.C378201dU;
import X.InterfaceC346201Wa;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.model.message.CommentReplyMessage;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public interface IAIReplyWatcherManagerService extends C006A {
    public static final C378201dU Companion = C378201dU.LIZ;

    boolean feedbackComment(CommentReplyMessage commentReplyMessage, long j, boolean z);

    InterfaceC346201Wa<Pair<Long, Integer>> getFeedbackState();

    /* bridge */ /* synthetic */ void onInit();

    void showFeedbackDialog(FragmentManager fragmentManager, CommentReplyMessage commentReplyMessage);

    void showProfileDialog(FragmentManager fragmentManager, CommentReplyMessage commentReplyMessage);
}
