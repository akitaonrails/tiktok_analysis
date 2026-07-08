package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.ImageCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.PortraitCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.ShareCommentCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.VideoCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZEm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C896380ZEm {
    public static final /* synthetic */ int LIZ = 0;

    public static SharePackage LIZIZ(SendMessageTemplateTask sendMessageTemplateTask) {
        String str;
        Bundle bundle = new Bundle();
        BaseTemplate baseTemplate = sendMessageTemplateTask.template;
        if (baseTemplate instanceof ImageCardTemplate) {
            str = "image_card";
        } else if (baseTemplate instanceof PictureCardTemplate) {
            str = "picture_card";
        } else if (baseTemplate instanceof StickerTemplate) {
            str = "video_sticker";
            if (!Intrinsics.LJFF(sendMessageTemplateTask.scene, "video_sticker")) {
                str = "set_sticker";
            }
        } else if (baseTemplate instanceof VideoCardTemplate) {
            str = "video_card";
        } else if (baseTemplate instanceof AwemeCardTemplate) {
            str = "aweme_card";
        } else if (baseTemplate instanceof PortraitCardTemplate) {
            str = "aigc_avatar";
        } else if (baseTemplate instanceof DynamicCardTemplate) {
            str = "dynamic_card";
        } else if (baseTemplate instanceof ShareCommentCardTemplate) {
            str = "comment_card";
        } else {
            str = "Invalid";
        }
        C1370940lmO c1370940lmO = new C1370940lmO();
        c1370940lmO.LIZ = str;
        c1370940lmO.LJIIIIZZ = sendMessageTemplateTask;
        c1370940lmO.LJII = bundle;
        return new SharePackage(c1370940lmO);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate LIZ(android.content.Context r7, com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate r8, X.C869590Y9l r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C896380ZEm.LIZ(android.content.Context, com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate, X.0Y9l, java.lang.String, java.lang.String):com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate");
    }
}
