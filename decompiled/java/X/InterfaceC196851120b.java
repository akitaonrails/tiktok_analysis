package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.120b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public interface InterfaceC196851120b extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "anchors", nestedClassType = C09W2.class, required = false)
    List<C09W2> getAnchors();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "avatarURLList", primitiveClassType = String.class, required = false)
    List<String> getAvatarURLList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "aweme_id", required = false)
    String getAwemeId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "awemeUid", required = false)
    String getAwemeUid();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "challenge_id", required = false)
    String getChallengeId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "channelID", required = false)
    Number getChannelID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "comment_id", required = false)
    String getCommentId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "content", required = false)
    String getContent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "effect_id", required = false)
    String getEffectId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enter_from", required = false)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enter_method", required = false)
    String getEnterMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "music_id", required = false)
    String getMusicId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "refer_string", required = false)
    String getReferString();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "replyAwemeID", required = false)
    String getReplyAwemeID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "replyAwemeUserID", required = false)
    String getReplyAwemeUserID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "subCommentID", required = false)
    String getSubCommentID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "userID", required = false)
    String getUserID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "userName", required = false)
    String getUserName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_ecommerce", required = false)
    Boolean isEcommerce();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isOthersVideo", required = false)
    Number isOthersVideo();
}
