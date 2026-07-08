package X;

import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I6e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C461060I6e {
    public static final boolean LIZ(C869590Y9l c869590Y9l) {
        String scene;
        String scene2;
        if (!C281310B0v.LIZ() || c869590Y9l == null) {
            return false;
        }
        if (c869590Y9l.getMsgType() != 1025) {
            if (c869590Y9l.getMsgType() != 1809) {
                return false;
            }
            String scene3 = null;
            if (c869590Y9l != null) {
                scene = c869590Y9l.getScene();
            } else {
                scene = null;
            }
            if (!Intrinsics.LJFF(scene, "share_video_story")) {
                if (c869590Y9l != null) {
                    scene2 = c869590Y9l.getScene();
                } else {
                    scene2 = null;
                }
                if (!Intrinsics.LJFF(scene2, "share_highlight_story")) {
                    if (c869590Y9l != null) {
                        scene3 = c869590Y9l.getScene();
                    }
                    if (!Intrinsics.LJFF(scene3, "share_highlight_story_collection")) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final boolean LIZIZ(C869590Y9l c869590Y9l) {
        BaseTemplate baseTemplateLIZ;
        AttachmentComponent attachmentComponentHs;
        if (c869590Y9l != null && C281310B0v.LIZ()) {
            if (!Intrinsics.LJFF(c869590Y9l.getScene(), "story_reaction")) {
                if (IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJJI(c869590Y9l.getScene()) && (baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class)) != null && (attachmentComponentHs = baseTemplateLIZ.Hs()) != null) {
                    AttachmentTypeComponent attachmentTypeComponent = attachmentComponentHs.type;
                    if (attachmentTypeComponent != AttachmentTypeComponent.ATTACHMENT_TYPE_STORY && (!attachmentComponentHs.isStory || attachmentTypeComponent == AttachmentTypeComponent.ATTACHMENT_TYPE_STORY_REPLY)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(C869590Y9l c869590Y9l) {
        String scene;
        AttachmentComponent attachmentComponentHs;
        String scene2 = null;
        if (c869590Y9l != null) {
            scene = c869590Y9l.getScene();
        } else {
            scene = null;
        }
        if (!Intrinsics.LJFF(scene, "story_reply")) {
            if (c869590Y9l != null) {
                scene2 = c869590Y9l.getScene();
            }
            if (!Intrinsics.LJFF(scene2, "story_reaction")) {
                if (c869590Y9l != null) {
                    int i = C0ZDX.LIZJ;
                    BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
                    if (baseTemplateLIZ == null || (attachmentComponentHs = baseTemplateLIZ.Hs()) == null || !attachmentComponentHs.isStory) {
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
