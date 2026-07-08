package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverInfo;
import com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0nwR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1454050nwR {
    public static final C1454050nwR LIZ = new C1454050nwR();
    public static volatile String LIZIZ = "video_edit_page";

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem LJII(com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverInfo r5) {
        /*
            r0 = 0
            if (r5 == 0) goto L64
            java.lang.String r4 = r5.getSelectedCoverId()
            java.util.List r1 = r5.getCovers()
            if (r1 == 0) goto L2f
            java.util.Iterator r3 = r1.iterator()
        L11:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem r1 = (com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem) r1
            java.lang.String r1 = r1.getSubTaskId()
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r4)
            if (r1 == 0) goto L11
        L28:
            com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem r2 = (com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem) r2
            if (r2 == 0) goto L2f
            return r2
        L2d:
            r2 = r0
            goto L28
        L2f:
            java.util.List r1 = r5.getCovers()
            if (r1 == 0) goto L54
            java.util.Iterator r4 = r1.iterator()
        L39:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L61
            java.lang.Object r3 = r4.next()
            r1 = r3
            com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem r1 = (com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem) r1
            X.0nwa r2 = r1.getState()
            X.0nwa r1 = X.EnumC1454140nwa.SUCCESS
            if (r2 != r1) goto L39
        L4e:
            com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem r3 = (com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem) r3
            if (r3 != 0) goto L63
            if (r5 == 0) goto L64
        L54:
            java.util.List r1 = r5.getCovers()
            if (r1 == 0) goto L64
            java.lang.Object r0 = X.C13LP.LJJJLL(r1)
            com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem r0 = (com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem) r0
            return r0
        L61:
            r3 = r0
            goto L4e
        L63:
            return r3
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1454050nwR.LJII(com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverInfo):com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem");
    }

    public static String LJIIIIZZ(AICoverInfo aICoverInfo) {
        AICoverItem aICoverItemLJII = LJII(aICoverInfo);
        if (aICoverItemLJII != null) {
            return aICoverItemLJII.getTemplateId();
        }
        return null;
    }

    public static String LJIIIZ(AICoverInfo aICoverInfo) {
        AICoverItem aICoverItemLJII = LJII(aICoverInfo);
        if (aICoverItemLJII != null) {
            return aICoverItemLJII.getTemplateName();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7) {
        /*
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r7.creativeModel
            com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverMobModel r6 = r0.aiCoverMobModel
            X.0nwR r0 = X.C1454050nwR.LIZ
            r0.getClass()
            java.lang.String r3 = X.C1454030nwP.LIZLLL(r7)
            com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData r0 = r7.getImageAlbumData()
            if (r0 == 0) goto L55
            java.util.List r0 = r0.getImageList()
            if (r0 == 0) goto L55
            X.07ik r2 = new X.07ik
            r2.<init>(r0)
            kotlin.jvm.internal.AwS72S1000000_22 r1 = new kotlin.jvm.internal.AwS72S1000000_22
            r0 = 12
            r1.<init>(r3, r0)
            X.08QU r1 = X.C09RB.LJIIIZ(r2, r1)
            r0 = 287(0x11f, float:4.02E-43)
            kotlin.jvm.internal.AFwS239S0000000_8 r0 = kotlin.jvm.internal.AFwS239S0000000_8.get$arr$(r0)
            X.08QU r5 = X.C09RB.LJIIIZ(r1, r0)
            X.0nkg r0 = X.C1446760nkg.LIZ
            r0.getClass()
            X.0C64 r4 = X.C0C64.LJIILLIIL()
            r3 = 31744(0x7c00, float:4.4483E-41)
            r2 = 6
            java.lang.String r0 = "tt_photo_text_ai_cover_image_upload_maxcount"
            r1 = 1
            int r0 = r4.LJIJ(r3, r2, r0, r1)
            if (r0 < r1) goto L49
            r1 = r0
        L49:
            kotlin.sequences.Sequence r0 = X.C09RB.LJJI(r5, r1)
            if (r0 == 0) goto L55
            java.util.List r0 = X.C09RB.LJJII(r0)
            if (r0 != 0) goto L57
        L55:
            X.13BV r0 = X.C13BV.INSTANCE
        L57:
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.usedPicCnt = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1454050nwR.LJIIJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):void");
    }

    public static String LJIILIIL(AICoverItem aICoverItem) {
        int i = C1454130nwZ.LIZ[aICoverItem.getState().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return CardStruct.IStatusCode.DEFAULT;
            }
            return "2";
        }
        return "1";
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C0LAB r11, com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverInfo r12) {
        /*
            r5 = 0
            if (r12 == 0) goto L47
            java.util.List r0 = r12.getCovers()
            if (r0 == 0) goto L47
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L12:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem r0 = (com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem) r0
            java.lang.String r1 = r0.getTemplateId()
            if (r1 == 0) goto L12
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L12
            r3.add(r1)
            goto L12
        L30:
            java.lang.String r4 = ","
            r7 = 0
            r10 = 62
            r6 = r5
            r8 = r5
            r9 = r5
            java.lang.String r1 = X.C13LP.LJJLIIIJ(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r1 == 0) goto L47
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L47
            goto L48
        L47:
            r1 = r5
        L48:
            java.lang.String r0 = "all_ai_photo_cover_template_id"
            LJ(r11, r0, r1)
            if (r12 == 0) goto L93
            java.util.List r0 = r12.getCovers()
            if (r0 == 0) goto L93
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L5e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem r0 = (com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem) r0
            java.lang.String r1 = r0.getTemplateName()
            if (r1 == 0) goto L5e
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L5e
            r3.add(r1)
            goto L5e
        L7c:
            java.lang.String r4 = ","
            r7 = 0
            r10 = 62
            r6 = r5
            r8 = r5
            r9 = r5
            java.lang.String r1 = X.C13LP.LJJLIIIJ(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r1 == 0) goto L93
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L93
            r5 = r1
        L93:
            java.lang.String r0 = "all_ai_photo_cover_template_style"
            LJ(r11, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1454050nwR.LIZ(X.0LAB, com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverInfo):void");
    }

    public static final void LIZJ(C0LAB c0lab, C1155300gAa c1155300gAa) {
        C1454050nwR c1454050nwR = LIZ;
        String str = c1155300gAa.LIZ;
        c1454050nwR.getClass();
        LJ(c0lab, "function_type", str);
        LJ(c0lab, "enter_method", c1155300gAa.LIZIZ);
        Integer num = c1155300gAa.LIZJ;
        if (num != null) {
            c0lab.LIZ(num.intValue(), "ai_photo_cover_used_pic_cnt");
        }
    }

    public static final void LIZLLL(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        int i;
        AICoverInfo aiCoverInfo;
        List<SingleImageData> imageList;
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        int i2 = 1;
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null && !imageList.isEmpty()) {
            for (SingleImageData singleImageData : imageList) {
                if (singleImageData.isAICover() && singleImageData.getCollageInfo() == null) {
                    i = 1;
                    break;
                }
            }
            i = 0;
        } else {
            i = 0;
        }
        ImageAlbumData imageAlbumData2 = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData2 != null) {
            aiCoverInfo = imageAlbumData2.getAiCoverInfo();
        } else {
            aiCoverInfo = null;
        }
        LIZ.getClass();
        c0lab.LIZ(i, "is_ai_photo_cover");
        if (i == 0 && aiCoverInfo == null && !videoPublishEditModel.creativeModel.aiCoverMobModel.hasEnteredAiCover) {
            i2 = 0;
        }
        c0lab.LIZ(i2, "is_used_ai_photo_cover");
        LJ(c0lab, "ai_photo_cover_template_id", LJIIIIZZ(aiCoverInfo));
        LJ(c0lab, "ai_photo_cover_template_style", LJIIIZ(aiCoverInfo));
        Integer num = videoPublishEditModel.creativeModel.aiCoverMobModel.usedPicCnt;
        if (num != null) {
            c0lab.LIZ(num.intValue(), "ai_photo_cover_used_pic_cnt");
        }
    }

    public static String LJIIJJI(AICoverInfo aICoverInfo, String str) {
        boolean z;
        List<AICoverItem> covers;
        AICoverItem next;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z || aICoverInfo == null || (covers = aICoverInfo.getCovers()) == null) {
            return null;
        }
        Iterator<AICoverItem> it2 = covers.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getSubTaskId(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AICoverItem aICoverItem = next;
        if (aICoverItem == null) {
            return null;
        }
        return aICoverItem.getTemplateId();
    }

    public static String LJIIL(AICoverInfo aICoverInfo, String str) {
        boolean z;
        List<AICoverItem> covers;
        AICoverItem next;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z || aICoverInfo == null || (covers = aICoverInfo.getCovers()) == null) {
            return null;
        }
        Iterator<AICoverItem> it2 = covers.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getSubTaskId(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AICoverItem aICoverItem = next;
        if (aICoverItem == null) {
            return null;
        }
        return aICoverItem.getTemplateName();
    }

    public static final void LIZIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab, String str) {
        int iIntValue = C580270MpN.LJIIJJI(videoPublishEditModel).getSecond().intValue();
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("enter_from", str);
        c0lab.LIZ(iIntValue, "pic_cnt");
        C580270MpN.LJFF(videoPublishEditModel, c0lab);
    }

    public static C0LAB LJ(C0LAB c0lab, String str, String str2) {
        if (str2 != null && (!a0.LJJJIL(str2))) {
            c0lab.LJ(str, str2);
        }
        return c0lab;
    }

    public static final void LJFF(VideoPublishEditModel videoPublishEditModel, String str, String str2, String str3) {
        C1454050nwR c1454050nwR = LIZ;
        C0LAB c0lab = new C0LAB();
        if (str3 == null) {
            str3 = LIZIZ;
        }
        LIZIZ(videoPublishEditModel, c0lab, str3);
        c0lab.LJ("function_type", "ai_photo_cover");
        c0lab.LJ("notice_reason", str);
        c1454050nwR.getClass();
        LJ(c0lab, "gen_task_id", str2);
        C20684815ws.LJIILLIIL("ttinter_photo_gen_notice_show", c0lab.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[PHI: r4
      0x002a: PHI (r4v6 java.lang.String) = (r4v1 java.lang.String), (r4v7 java.lang.String) binds: [B:14:0x0028, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030 A[PHI: r4
      0x0030: PHI (r4v5 java.lang.String) = (r4v1 java.lang.String), (r4v6 java.lang.String) binds: [B:14:0x0028, B:16:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce A[PHI: r3 r4
      0x00ce: PHI (r3v0 java.lang.String) = (r3v3 java.lang.String), (r3v5 java.lang.String) binds: [B:23:0x0045, B:16:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r4v3 java.lang.String) = (r4v5 java.lang.String), (r4v6 java.lang.String) binds: [B:23:0x0045, B:16:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem r11) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1454050nwR.LJI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem):void");
    }
}
