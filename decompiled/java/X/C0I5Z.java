package X;

import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;

/* JADX INFO: renamed from: X.0I5Z, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I5Z {
    public static final boolean LIZ(C869590Y9l c869590Y9l) {
        AttachmentTypeComponent attachmentTypeComponent;
        AttachmentComponent attachmentComponentHs;
        if (c869590Y9l.getReferenceInfo() == null) {
            BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
            if (baseTemplateLIZ != null && (attachmentComponentHs = baseTemplateLIZ.Hs()) != null) {
                attachmentTypeComponent = attachmentComponentHs.type;
            } else {
                attachmentTypeComponent = null;
            }
            if (attachmentTypeComponent != AttachmentTypeComponent.ATTACHMENT_TYPE_SHARED_REPOST) {
                BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BaseContent.class);
                if (orParseJsonContent != null) {
                    Integer referenceScene = orParseJsonContent.getReferenceScene();
                    int iOrdinal = BaseContent.ReferenceSceneType.SHARE_COMMENT.ordinal();
                    if (referenceScene == null || referenceScene.intValue() != iOrdinal) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
