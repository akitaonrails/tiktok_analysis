package X;

import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.vibefeed.VibeFeedRuntimeFeature;

/* JADX INFO: renamed from: X.0I5Y, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I5Y {
    public static final BaseContent.ReferenceVideo LIZ(C869590Y9l c869590Y9l) {
        AttachmentComponent attachmentComponentHs;
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        if (baseTemplateLIZ != null && (attachmentComponentHs = baseTemplateLIZ.Hs()) != null) {
            if (attachmentComponentHs.id.length() == 0) {
                return null;
            }
            return C0ZDR.LIZIZ(attachmentComponentHs);
        }
        return BaseContentParserKt.getReferenceVideo(c869590Y9l);
    }

    public static final boolean LIZIZ(C869590Y9l c869590Y9l) {
        VibeFeedRuntimeFeature vibeFeedRuntimeFeatureLIZ;
        if (c869590Y9l == null || (vibeFeedRuntimeFeatureLIZ = VibeFeedRuntimeFeature.LIZ.LIZ()) == null || !vibeFeedRuntimeFeatureLIZ.LIZIZ(c869590Y9l.getConversationId())) {
            return false;
        }
        return C0ZDX.LJJJI(c869590Y9l);
    }
}
