package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0McX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C572310McX {
    public static final String LJI(VideoPublishEditModel videoPublishEditModel) {
        if (C123100dR.LIZ(videoPublishEditModel.creativeModel.text2ImageModel.asyncEntrance)) {
            return videoPublishEditModel.creativeModel.text2ImageModel.asyncEntrance;
        }
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        if (creativeModel.draftInfoModel.isDraft) {
            return "draft";
        }
        return creativeModel.text2ImageModel.entrance;
    }

    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        Object objValueOf;
        int i;
        TextImageTaskInfo textImageTaskInfoLIZJ = C572250McR.LIZJ(videoPublishEditModel.creativeModel.text2ImageModel);
        if (textImageTaskInfoLIZJ == null) {
            return;
        }
        String type = textImageTaskInfoLIZJ.getType();
        C0LIV c0liv = C0LIV.AI;
        if (Intrinsics.LJFF(type, c0liv.getType()) || Intrinsics.LJFF(textImageTaskInfoLIZJ.getType(), C0LIV.NLE.getType())) {
            c0lab.LIZ(Intrinsics.LJFF(textImageTaskInfoLIZJ.getType(), c0liv.getType()) ? 1 : 0, "is_ai_text_mode");
            if (Intrinsics.LJFF(textImageTaskInfoLIZJ.getType(), c0liv.getType())) {
                objValueOf = Long.valueOf(C572250McR.LJ(videoPublishEditModel.creativeModel.text2ImageModel));
            } else {
                objValueOf = "";
            }
            c0lab.LIZLLL(objValueOf, "ai_generated_image_style");
            if (Intrinsics.LJFF(textImageTaskInfoLIZJ.getType(), C0LIV.NLE.getType())) {
                i = 0;
            } else if (C123100dR.LIZ(textImageTaskInfoLIZJ.getFailReason())) {
                i = 3;
            } else if (C123100dR.LIZ(textImageTaskInfoLIZJ.getUri())) {
                i = 1;
            } else {
                i = 2;
            }
            c0lab.LIZ(i, "ai_img_gen_status");
            String failReason = textImageTaskInfoLIZJ.getFailReason();
            if (!C123100dR.LIZ(failReason) || failReason == null) {
                failReason = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("fail_reason", failReason);
            c0lab.LJ("entrance", LJI(videoPublishEditModel));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1 A[Catch: all -> 0x0148, TryCatch #0 {all -> 0x0148, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x0010, B:11:0x0017, B:14:0x0028, B:18:0x0031, B:22:0x003f, B:24:0x004a, B:26:0x0050, B:30:0x005d, B:33:0x0069, B:35:0x0074, B:37:0x007a, B:38:0x007e, B:40:0x008d, B:42:0x0093, B:44:0x009b, B:81:0x0127, B:82:0x012b, B:84:0x0131, B:49:0x00a9, B:51:0x00b2, B:52:0x00b6, B:54:0x00bc, B:56:0x00c4, B:59:0x00cc, B:60:0x00cf, B:62:0x00d3, B:63:0x00d9, B:64:0x00dd, B:66:0x00e3, B:68:0x00e9, B:70:0x00ed, B:71:0x00f3, B:73:0x00f7, B:74:0x00ff, B:76:0x0105, B:77:0x011c, B:46:0x00a1), top: B:93:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C572310McX.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C0LAB LJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r6, X.C0LAB r7) {
        /*
            boolean r0 = X.C1428470nHB.LLIIIILZ(r6)
            java.lang.String r2 = "0"
            java.lang.String r4 = "is_text_trans_pic"
            if (r0 == 0) goto L90
            com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData r0 = r6.getImageAlbumData()
            r5 = 0
            if (r0 == 0) goto L17
            java.util.List r3 = r0.getImageList()
            if (r3 != 0) goto L21
        L17:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r6.creativeModel
            com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData r0 = r0.imageAlbumModel
            if (r0 == 0) goto L90
            java.util.List r3 = r0.getImageList()
        L21:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L90
            boolean r0 = X.C1428470nHB.LJJZZI(r6)
            if (r0 == 0) goto L88
            com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData r0 = r6.getImageAlbumData()
            if (r0 == 0) goto L81
            int r1 = r0.getCurrentPreviewIndex()
        L37:
            int r0 = r3.size()
            int r0 = r0 + (-1)
            int r0 = X.C13LZ.LJ(r1, r5, r0)
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r0)
            com.ss.android.ugc.aweme.creative.model.edit.SingleImageData r0 = (com.ss.android.ugc.aweme.creative.model.edit.SingleImageData) r0
            boolean r1 = r0.isText2Image()
            r0 = 1
            if (r1 != r0) goto L90
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r6.creativeModel
            com.ss.android.ugc.aweme.creative.model.edit.Text2ImageModel r3 = r0.text2ImageModel
            com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo r0 = X.C572250McR.LIZJ(r3)
            if (r0 == 0) goto L7f
            java.lang.String r1 = r0.getType()
        L5c:
            X.0LIV r0 = X.C0LIV.AI
            java.lang.String r0 = r0.getType()
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            java.lang.String r0 = "1"
            r7.LJ(r4, r0)
            if (r1 == 0) goto L6e
            r2 = r0
        L6e:
            java.lang.String r0 = "is_ai_text_mode"
            r7.LJ(r0, r2)
            if (r1 == 0) goto L7e
            java.lang.String r2 = "ai_generated_image_style"
            long r0 = X.C572250McR.LJ(r3)
            r7.LIZIZ(r0, r2)
        L7e:
            return r7
        L7f:
            r1 = 0
            goto L5c
        L81:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r6.creativeModel
            com.ss.android.ugc.aweme.creative.model.edit.ImageEditModel r0 = r0.imageEditModel
            int r1 = r0.selectedImageIndex
            goto L37
        L88:
            int r1 = X.C1428470nHB.LJJIJ(r6)
            if (r1 >= 0) goto L37
            r1 = 0
            goto L37
        L90:
            r7.LJ(r4, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C572310McX.LJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0LAB):X.0LAB");
    }

    public static final void LJFF(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        Bundle bundle;
        Set<String> setKeySet;
        if (C1428470nHB.LLIIIILZ(videoPublishEditModel) && (bundle = videoPublishEditModel.creativeModel.text2ImageModel.etParams) != null && (setKeySet = bundle.keySet()) != null) {
            for (String str : setKeySet) {
                c0lab.LJ(str, bundle.getString(str));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJII(X.C0LAB r4, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5, java.util.List<com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct> r6) {
        /*
            boolean r0 = X.C1428470nHB.LLIIIILZ(r5)
            if (r0 == 0) goto L54
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            com.ss.android.ugc.aweme.creative.model.edit.Text2ImageModel r0 = r0.text2ImageModel
            java.lang.String r0 = r0.fromCommentId
            boolean r0 = X.C123100dR.LIZ(r0)
            r3 = 1
            if (r0 == 0) goto L25
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            com.ss.android.ugc.aweme.creative.model.publish.PostPageModel r0 = r0.postPageModel
            com.ss.android.ugc.aweme.creative.model.publish.CaptionModel r0 = r0.captionModel
            java.util.List<com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct> r1 = r0.markupExtra
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L57
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L57
        L25:
            if (r6 == 0) goto L55
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L55
            java.util.Iterator r2 = r6.iterator()
        L31:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct r0 = (com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct) r0
            long r0 = r0.commentId
            java.lang.String r1 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            com.ss.android.ugc.aweme.creative.model.edit.Text2ImageModel r0 = r0.text2ImageModel
            java.lang.String r0 = r0.fromCommentId
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L31
        L4f:
            java.lang.String r0 = "is_contain_original_post"
            r4.LIZ(r3, r0)
        L54:
            return
        L55:
            r3 = 0
            goto L4f
        L57:
            java.util.Iterator r2 = r1.iterator()
        L5b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct r0 = (com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct) r0
            long r0 = r0.commentId
            java.lang.String r1 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            com.ss.android.ugc.aweme.creative.model.edit.Text2ImageModel r0 = r0.text2ImageModel
            java.lang.String r0 = r0.fromCommentId
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L5b
            goto L4f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C572310McX.LJII(X.0LAB, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(X.C0LAB r9, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10, java.lang.Integer r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C572310McX.LIZJ(X.0LAB, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.Integer, boolean):void");
    }
}
