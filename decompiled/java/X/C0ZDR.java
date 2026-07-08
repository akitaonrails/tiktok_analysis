package X;

import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessageKt;

/* JADX INFO: renamed from: X.0ZDR, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZDR {
    public static final boolean LIZ(C869590Y9l c869590Y9l) {
        int msgType;
        if (C1510305vh.LIZ(c869590Y9l) || C0ZDX.LJJJJL(c869590Y9l) || C0ZDX.LJJIJIL(c869590Y9l) || C068M.LIZ(c869590Y9l) || FakeMessageKt.isFakeMessage(c869590Y9l) || (4000 <= (msgType = c869590Y9l.getMsgType()) && msgType < 5000)) {
            return false;
        }
        return true;
    }

    public static final BaseContent.ReferenceVideo LIZIZ(AttachmentComponent attachmentComponent) {
        boolean z;
        BaseContent.ReferenceVideo referenceVideo = new BaseContent.ReferenceVideo();
        referenceVideo.setRefVideoId(attachmentComponent.id);
        referenceVideo.setRefVideoAuthorUid(String.valueOf(attachmentComponent.uid));
        referenceVideo.setRefVideoAuthorSecUid("");
        referenceVideo.setRefVideoCoverUrl(C0I3J.LIZ(attachmentComponent.cover.url_list));
        referenceVideo.setRefVideoAwemeType(attachmentComponent.awemeType);
        AttachmentTypeComponent attachmentTypeComponent = attachmentComponent.type;
        if (attachmentTypeComponent != AttachmentTypeComponent.ATTACHMENT_TYPE_STORY && attachmentTypeComponent != AttachmentTypeComponent.ATTACHMENT_TYPE_STORY_REPLY) {
            z = false;
        } else {
            z = true;
        }
        referenceVideo.setRefVideoIsStory(z);
        referenceVideo.setFallbackStatusComponent(attachmentComponent.status);
        referenceVideo.setExpireAt(attachmentComponent.expireAt);
        referenceVideo.setOriginAuthorId(attachmentComponent.originAuthorUid);
        return referenceVideo;
    }
}
