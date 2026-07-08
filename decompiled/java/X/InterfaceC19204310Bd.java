package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.10Bd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC19204310Bd extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "aweme_id", required = true)
    String getAwemeId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "comment_status", nestedClassType = InterfaceC19204710Bh.class, required = false)
    InterfaceC19204710Bh getCommentStatus();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "content_ai_remix_permission", nestedClassType = InterfaceC19204810Bi.class, required = false)
    InterfaceC19204810Bi getContentAiRemixPermission();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "content_reuse_permission", nestedClassType = InterfaceC19204910Bj.class, required = false)
    InterfaceC19204910Bj getContentReusePermission();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "hybrid_label", required = false)
    String getHybridLabel();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "label_private", required = false)
    String getLabelPrivate();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "private_status", nestedClassType = InterfaceC19204610Bg.class, required = false)
    InterfaceC19204610Bg getPrivateStatus();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "video_text", required = false)
    String getVideoText();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_delete", required = false)
    Number isDelete();
}
