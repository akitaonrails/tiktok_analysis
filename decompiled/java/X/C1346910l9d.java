package X;

import com.ss.android.ugc.aweme.comment.model.CommentStickerStruct;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: X.0l9d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1346910l9d implements Serializable {
    public final String accountType;
    public final String friendsV3TrackScene;
    public final CharSequence initEditTextContent;
    public final EnumC1341680l1C initKeyboardType;
    public final CommentStickerStruct initSticker;
    public final String noticeId;
    public final int openKeyboardType;
    public final String quickCommentActionType;
    public final List<String> quickCommentEmojiString;
    public String quickCommentShowType;

    public C1346910l9d() {
        this("", null, null, 0, EnumC1341680l1C.TEXT, "", null, "", null, "");
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Extra(accountType=");
        sbLIZ.append(this.accountType);
        sbLIZ.append(", initEditTextContent=");
        sbLIZ.append((Object) this.initEditTextContent);
        sbLIZ.append(", initSticker=");
        sbLIZ.append(this.initSticker);
        sbLIZ.append(", openKeyboardType=");
        sbLIZ.append(this.openKeyboardType);
        sbLIZ.append(", initKeyboardType=");
        sbLIZ.append(this.initKeyboardType);
        sbLIZ.append(", quickCommentActionType=");
        sbLIZ.append(this.quickCommentActionType);
        sbLIZ.append(", noticeId=");
        sbLIZ.append(this.noticeId);
        sbLIZ.append(", friendsV3TrackScene=");
        sbLIZ.append(this.friendsV3TrackScene);
        sbLIZ.append(", quickCommentEmojiString=");
        sbLIZ.append(this.quickCommentEmojiString);
        sbLIZ.append(", quickCommentShowType=");
        sbLIZ.append(this.quickCommentShowType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setQuickCommentShowType(String str) {
        this.quickCommentShowType = str;
    }

    public C1346910l9d(String str, CharSequence charSequence, CommentStickerStruct commentStickerStruct, int i, EnumC1341680l1C enumC1341680l1C, String str2, String str3, String str4, List<String> list, String str5) {
        this.accountType = str;
        this.initEditTextContent = charSequence;
        this.initSticker = commentStickerStruct;
        this.openKeyboardType = i;
        this.initKeyboardType = enumC1341680l1C;
        this.quickCommentActionType = str2;
        this.noticeId = str3;
        this.friendsV3TrackScene = str4;
        this.quickCommentEmojiString = list;
        this.quickCommentShowType = str5;
    }
}
