package X;

import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.TtsInfos;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.video.TranslatedVideo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.ICLACaptionService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15zl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20702715zl {
    public static final C20702715zl LIZ = new C20702715zl();
    public static final C08I7<String, CaptionModel> LIZIZ = new C08I7<>(10);

    public static boolean LIZIZ(Aweme aweme) {
        boolean z;
        boolean zLJFF;
        String languageCode;
        TranslatedVideo translatedVideo;
        Audio audio;
        List<TtsInfos> ttsInfos;
        if (C1481040ody.LIZ() && aweme != null && (audio = aweme.getAudio()) != null && (ttsInfos = audio.getTtsInfos()) != null && !ttsInfos.isEmpty()) {
            Iterator<TtsInfos> it2 = ttsInfos.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().languageCode, C161N.LIZIZ.LLIIZ())) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        if (C287430BOj.LIZ()) {
            if (aweme != null && (translatedVideo = aweme.getTranslatedVideo()) != null) {
                languageCode = translatedVideo.getLanguageCode();
            } else {
                languageCode = null;
            }
            zLJFF = Intrinsics.LJFF(languageCode, C161N.LIZIZ.LLIIZ());
        } else {
            zLJFF = false;
        }
        if (z || zLJFF) {
            return true;
        }
        return false;
    }

    public static int LIZLLL(Aweme aweme) {
        String aid;
        CaptionModel captionModelLIZIZ;
        ICLACaptionService iCLACaptionService = (ICLACaptionService) PluggableExtentionKt.pluggableSpi$default(ICLACaptionService.class, false, false, false, 14, null);
        if (iCLACaptionService == null) {
            return -1;
        }
        if (C292300Bcy.LIZ) {
            return iCLACaptionService.LJIIJ(aweme);
        }
        if (aweme == null || (aid = aweme.getAid()) == null || aid.length() == 0 || (captionModelLIZIZ = LIZIZ.LIZIZ(aid)) == null) {
            return -1;
        }
        C20702715zl c20702715zl = LIZ;
        String id = C0SKK.INITIALIZED.getId();
        String strLLIIZ = C161N.LIZIZ.LLIIZ();
        c20702715zl.getClass();
        return LIZJ(aweme, id, strLLIIZ, captionModelLIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1479890oc7 LJ(com.ss.android.ugc.aweme.feed.model.Aweme r10) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20702715zl.LJ(com.ss.android.ugc.aweme.feed.model.Aweme):X.0oc7");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r3, boolean r4) {
        /*
            r2 = 1
            if (r4 != 0) goto L3f
            java.lang.String r1 = X.C20703515zt.LJIIIZ(r3)
            if (r1 == 0) goto L3f
            com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService r0 = X.C1839820xye.LIZ()
            X.15zM r0 = r0.LJIIIIZZ()
            r0.getClass()
            java.lang.String[] r0 = X.C20700315zN.LIZJ()
            if (r0 == 0) goto L3f
            int r0 = X.C13LQ.LJJIJIIJI(r1, r0)
            if (r0 < 0) goto L3d
            r0 = 1
        L21:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L3f
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3f
            boolean r0 = X.C299190Bo5.LIZ()
            if (r0 == 0) goto L3f
            r1 = 1
        L34:
            boolean r0 = LIZIZ(r3)
            if (r0 == 0) goto L41
            if (r1 != 0) goto L41
            return r2
        L3d:
            r0 = 0
            goto L21
        L3f:
            r1 = 0
            goto L34
        L41:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20702715zl.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, boolean):boolean");
    }

    public static final C581750Mrl LJFF(Aweme aweme, String str) {
        Video video;
        CaptionModel captionModel;
        String aid;
        List<CaptionItemModel> list;
        String id = str;
        C20703515zt.LIZ.getClass();
        if (C20703515zt.LIZJ(aweme)) {
            return null;
        }
        ArrayList arrayList = null;
        ICLACaptionService iCLACaptionService = (ICLACaptionService) PluggableExtentionKt.pluggableSpi$default(ICLACaptionService.class, false, false, false, 14, null);
        if (iCLACaptionService == null) {
            return null;
        }
        if (C292300Bcy.LIZ) {
            return iCLACaptionService.LJIIIZ(aweme);
        }
        if (aweme == null || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (aid = aweme.getAid()) == null || aid.length() == 0 || (list = captionModel.captionList) == null || list.isEmpty()) {
            return null;
        }
        if (id == null) {
            id = C0SKK.INITIALIZED.getId();
        }
        String strLLIIZ = C161N.LIZIZ.LLIIZ();
        LIZ.getClass();
        CaptionModel captionModelLIZIZ = LIZIZ.LIZIZ(aweme.getAid());
        if (captionModelLIZIZ != null) {
            CaptionItemModel captionItemModelLIZLLL = C20702515zj.LIZLLL(aweme);
            if (captionItemModelLIZLLL != null) {
                int i = captionItemModelLIZLLL.subId;
                List<CaptionItemModel> list2 = captionModelLIZIZ.captionList;
                if (list2 != null) {
                    Iterator<CaptionItemModel> it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (i == it2.next().subId) {
                                break;
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList(list2);
                            arrayList2.add(captionItemModelLIZLLL);
                            captionModelLIZIZ = captionModelLIZIZ.copy(captionModelLIZIZ.hasOriginalAudio, captionModelLIZIZ.enableAutoCaption, captionModelLIZIZ.originalCaptionLanguage, arrayList2, captionModelLIZIZ.creatorEditedCaptionId, captionModelLIZIZ.appearance, captionModelLIZIZ.position, captionModelLIZIZ.captionsType, captionModelLIZIZ.noOriginalCaptionReasonV2, captionModelLIZIZ.duplicateLanguages, captionModelLIZIZ.isAuthorDubbingQualified);
                            if (captionModelLIZIZ == null) {
                            }
                        }
                    }
                }
            }
            captionModel = captionModelLIZIZ;
        } else {
            LIZIZ.LIZLLL(aweme.getAid(), captionModel);
        }
        List<CaptionItemModel> list3 = captionModel.captionList;
        if (list3 != null) {
            Iterator<CaptionItemModel> it3 = list3.iterator();
            while (it3.hasNext()) {
                if (Intrinsics.LJFF(it3.next().languageCode, strLLIIZ)) {
                    break;
                }
            }
            captionModel = iCLACaptionService.LJIIJJI(aweme, strLLIIZ, captionModel);
            LIZIZ.LIZLLL(aweme.getAid(), captionModel);
        } else {
            captionModel = iCLACaptionService.LJIIJJI(aweme, strLLIIZ, captionModel);
            LIZIZ.LIZLLL(aweme.getAid(), captionModel);
        }
        LIZ.getClass();
        int iLIZJ = LIZJ(aweme, id, strLLIIZ, captionModel);
        String str2 = AnonymousClass0176.LIZ;
        aweme.getAid();
        List<CaptionItemModel> list4 = captionModel.captionList;
        if (list4 != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list4, 10));
            for (CaptionItemModel captionItemModel : list4) {
                arrayList.add(new Pair(captionItemModel.languageCode, Integer.valueOf(captionItemModel.subId)));
            }
        }
        Objects.toString(arrayList);
        C581750Mrl c581750Mrl = new C581750Mrl(true, iLIZJ, C162B.LIZIZ.Vg(aweme), captionModel, 20);
        C1485670olR.LIZ().LJI(aweme, c581750Mrl);
        return c581750Mrl;
    }

    public static int LIZJ(Aweme aweme, String str, String str2, CaptionModel captionModel) {
        CaptionModel captionModel2;
        CaptionLanguage captionLanguage;
        CaptionItemModel captionItemModelLJIIIIZZ;
        CaptionItemModel next;
        if (aweme == null) {
            return -1;
        }
        if (!C161T.LIZ().LJII(aweme) && !Intrinsics.LJFF(str, C0SKK.TRANSLATED.getId())) {
            CaptionItemModel captionItemModelLJIIIIZZ2 = C20703515zt.LJIIIIZZ(aweme);
            if (captionItemModelLJIIIIZZ2 == null) {
                return -1;
            }
            return captionItemModelLJIIIIZZ2.subId;
        }
        CaptionItemModel captionItemModelLIZLLL = C20702515zj.LIZLLL(aweme);
        if (captionItemModelLIZLLL != null) {
            return captionItemModelLIZLLL.subId;
        }
        List<CaptionItemModel> list = captionModel.captionList;
        if (list != null) {
            Iterator<CaptionItemModel> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.languageCode, str2)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            CaptionItemModel captionItemModel = next;
            if (captionItemModel != null) {
                return captionItemModel.subId;
            }
        }
        Video video = aweme.getVideo();
        if (video == null || (captionModel2 = video.getCaptionModel()) == null || (captionLanguage = captionModel2.originalCaptionLanguage) == null || !captionLanguage.canTranslateRealtime || (captionItemModelLJIIIIZZ = C20703515zt.LJIIIIZZ(aweme)) == null) {
            return -1;
        }
        return captionItemModelLJIIIIZZ.subId;
    }
}
