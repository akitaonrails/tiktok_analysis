package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.comment.model.CommentSurpriseStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0lCe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public interface InterfaceC1348780lCe {
    boolean checkCommentInputable();

    Aweme getCommentInputAweme();

    Comment getCommentInputReplyComment();

    int getCommentInputViewType();

    String getEnterMethod();

    String getEventType();

    String getFromPage();

    EnumC1346360l8k getInputServiceType();

    String getSessionId();

    boolean isLandscapeMode();

    void onCommentInputClick();

    void onCommentInputKeyboardDismiss(boolean z, C1347310lAH c1347310lAH);

    void onCommentInputKeyboardShow(boolean z, String str, C1347310lAH c1347310lAH);

    void onCommentInputPublishClick(int i, int i2, CharSequence charSequence, String str, String str2, boolean z, C1347310lAH c1347310lAH);

    void onCommentInputPublishFailed(Exception exc, int i, Comment comment);

    void onCommentInputPublishOnlyGiftSuccess(Comment comment);

    void onCommentInputPublishStart(Comment comment);

    void onCommentInputPublishSuccess(Comment comment, boolean z, CommentResponse commentResponse);

    void onEmojiClick(String str, int i, int i2);

    void onEmojiToKeyboard(String str);

    void onEvent(C1346240l8Y c1346240l8Y);

    void onImageUploadProgress(String str, int i);

    void publishCommentPost(Comment comment, Bitmap bitmap, String str);

    void tryTriggerEasterEgg(CommentSurpriseStruct commentSurpriseStruct);
}
