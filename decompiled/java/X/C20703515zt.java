package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.appdiff.ICaptionAppDiffProtocol;
import com.ss.android.ugc.aweme.experiment.ReDexExperimentOpt;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.TtsInfos;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.ICaptionKevaService;
import com.ss.android.ugc.aweme.sticker.data.AutocaptionType;
import com.ss.android.ugc.aweme.sticker.data.CaptionStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15zt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20703515zt {
    public static final C20703515zt LIZ = new C20703515zt();
    public static final C161N LIZIZ = C161N.LIZIZ;
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1846350y9B());

    public static List LJ() {
        C1839820xye.LIZ().LJIIIIZZ().getClass();
        String[] strArrLIZJ = C20700315zN.LIZJ();
        if (strArrLIZJ == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArrLIZJ) {
            LIZ.getClass();
            String strLJII = LJII(str);
            if (strLJII != null) {
                arrayList.add(strLJII);
            }
        }
        return arrayList;
    }

    public static boolean LIZIZ(String str) {
        if (str != null && !Intrinsics.LJFF(str, "un")) {
            C161N c161n = LIZIZ;
            if (!Intrinsics.LJFF(str, c161n.LLIIZ()) && !C13LQ.LJIILLIIL(str, c161n.LL())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZJ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if ((!C1905290zgF.LIZ(8) && (((Number) C1243204ti.LIZ.getValue()).intValue() & 1) != 1) || !LJJIIJZLJL(aweme)) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if ((!C1905290zgF.LIZ(16) && (((Number) C1243204ti.LIZ.getValue()).intValue() & 2) != 2) || !LJJIIJZLJL(aweme)) {
            return false;
        }
        return true;
    }

    public static final List<String> LJI(Aweme aweme) {
        Video video;
        CaptionModel captionModel;
        if (aweme == null || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null) {
            return null;
        }
        return captionModel.duplicateLanguages;
    }

    public static String LJII(String str) {
        return ((ICaptionKevaService) ServiceManager.get().getService(ICaptionKevaService.class)).LJLJLLL().get(str);
    }

    public static final CaptionItemModel LJIIIIZZ(Aweme aweme) {
        if (!ReDexExperimentOpt.getAbTest()) {
            return LJIIIIZZ$redex$base(aweme);
        }
        return LJIIIIZZ$redex$opt(aweme);
    }

    private static final CaptionItemModel LJIIIIZZ$redex$base(Aweme aweme) {
        Video video;
        CaptionModel captionModel;
        CaptionLanguage captionLanguage;
        CaptionModel captionModel2;
        List<CaptionItemModel> list;
        CaptionItemModel captionItemModel = null;
        if (aweme == null || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (captionLanguage = captionModel.originalCaptionLanguage) == null) {
            return null;
        }
        long j = captionLanguage.languageId;
        Video video2 = aweme.getVideo();
        if (video2 == null || (captionModel2 = video2.getCaptionModel()) == null || (list = captionModel2.captionList) == null) {
            return null;
        }
        Iterator<CaptionItemModel> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            CaptionItemModel next = it2.next();
            if (j == next.languageId) {
                captionItemModel = next;
                break;
            }
        }
        return captionItemModel;
    }

    private static final CaptionItemModel LJIIIIZZ$redex$opt(Aweme aweme) {
        Video video;
        CaptionModel captionModel;
        CaptionLanguage captionLanguage;
        CaptionModel captionModel2;
        List<CaptionItemModel> list;
        CaptionItemModel captionItemModel = null;
        if (aweme == null || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (captionLanguage = captionModel.originalCaptionLanguage) == null) {
            return null;
        }
        long j = captionLanguage.languageId;
        Video video2 = aweme.getVideo();
        if (video2 == null || (captionModel2 = video2.getCaptionModel()) == null || (list = captionModel2.captionList) == null) {
            return null;
        }
        int i = 0;
        int size = list.size();
        while (true) {
            if (i >= size) {
                break;
            }
            CaptionItemModel captionItemModel2 = list.get(i);
            i++;
            if (j == captionItemModel2.languageId) {
                captionItemModel = captionItemModel2;
                break;
            }
        }
        return captionItemModel;
    }

    public static final String LJIIIZ(Aweme aweme) {
        CaptionItemModel captionItemModelLJIIIIZZ = LJIIIIZZ(aweme);
        if (captionItemModelLJIIIIZZ != null) {
            return captionItemModelLJIIIIZZ.languageCode;
        }
        return null;
    }

    public static final Long LJIIJ(Aweme aweme) {
        CaptionItemModel captionItemModelLJIIIIZZ = LJIIIIZZ(aweme);
        if (captionItemModelLJIIIIZZ != null) {
            return Long.valueOf(captionItemModelLJIIIIZZ.claSubtitleId);
        }
        return null;
    }

    public static final String LJIIJJI(Aweme aweme) {
        Video video;
        CaptionModel captionModel;
        Video video2;
        CaptionModel captionModel2;
        CaptionLanguage captionLanguage;
        CaptionLanguage.ClaOriginalCaptionType originalCaptionType = null;
        if (aweme != null && (video = aweme.getVideo()) != null && (captionModel = video.getCaptionModel()) != null && captionModel.originalCaptionLanguage != null) {
            if (aweme != null && (video2 = aweme.getVideo()) != null && (captionModel2 = video2.getCaptionModel()) != null && (captionLanguage = captionModel2.originalCaptionLanguage) != null) {
                originalCaptionType = captionLanguage.getOriginalCaptionType();
            }
            if (originalCaptionType != CaptionLanguage.ClaOriginalCaptionType.CLA_ORIGINAL_CAPTION_TYPE_UNSPECIFIED && originalCaptionType != null && originalCaptionType.getCaptionName() != null) {
                return originalCaptionType.getCaptionName();
            }
            return "undefined";
        }
        return "undefined";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJIIL(com.ss.android.ugc.aweme.feed.model.Aweme r3) {
        /*
            java.lang.String r2 = ""
            if (r3 != 0) goto L5
            return r2
        L5:
            com.ss.android.ugc.aweme.service.ICLACaptionService r0 = X.C0RT2.LIZ()
            boolean r0 = r0.LIZJ(r3)
            if (r0 == 0) goto L3d
            com.ss.android.ugc.aweme.feed.model.CaptionItemModel r0 = X.C20702515zj.LIZLLL(r3)
            if (r0 != 0) goto L21
            X.161N r1 = X.C20703515zt.LIZIZ
            java.lang.String r0 = r1.LLIIZ()
            boolean r0 = r1.LLIIIL(r3, r0)
            if (r0 == 0) goto L32
        L21:
            com.ss.android.ugc.aweme.translation.service.ITranslationKevaService r0 = X.C161T.LIZ()
            boolean r0 = r0.LIZIZ()
            if (r0 == 0) goto L32
            X.161N r0 = X.C20703515zt.LIZIZ
            java.lang.String r2 = r0.LLIIZ()
        L31:
            return r2
        L32:
            com.ss.android.ugc.aweme.feed.model.CaptionItemModel r0 = LJIIIIZZ(r3)
            if (r0 == 0) goto L31
            java.lang.String r0 = r0.languageName
            if (r0 == 0) goto L31
            return r0
        L3d:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r3.getVideo()
            if (r0 == 0) goto L5a
            com.ss.android.ugc.aweme.feed.model.CaptionModel r0 = r0.getCaptionModel()
            if (r0 == 0) goto L5a
            java.util.List<com.ss.android.ugc.aweme.feed.model.CaptionItemModel> r1 = r0.captionList
            if (r1 == 0) goto L5a
            r0 = 0
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r0, r1)
            com.ss.android.ugc.aweme.feed.model.CaptionItemModel r0 = (com.ss.android.ugc.aweme.feed.model.CaptionItemModel) r0
            if (r0 == 0) goto L5a
            java.lang.String r2 = r0.languageName
            if (r2 != 0) goto L31
        L5a:
            X.10eQ r0 = X.C19296410eQ.LIZIZ
            java.lang.String r2 = r0.getAppLanguage()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20703515zt.LJIIL(com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }

    public static final String LJIILIIL(Aweme aweme) {
        List<AutocaptionType> list;
        AutocaptionType autocaptionType;
        String str;
        if (aweme == null) {
            return "";
        }
        if (LJIIIIZZ(aweme) != null) {
            CaptionItemModel captionItemModelLJIIIIZZ = LJIIIIZZ(aweme);
            if (captionItemModelLJIIIIZZ == null || (str = captionItemModelLJIIIIZZ.languageName) == null) {
                return "";
            }
            return str;
        }
        if (aweme.getInteractStickerStructs() != null && (!aweme.getInteractStickerStructs().isEmpty())) {
            Iterator<InteractStickerStruct> it2 = aweme.getInteractStickerStructs().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InteractStickerStruct next = it2.next();
                if (next.getCaptionStruct() != null && next.getType() == 20) {
                    CaptionStruct captionStruct = next.getCaptionStruct();
                    if (captionStruct == null || (list = captionStruct.autoCaptions) == null || (autocaptionType = (AutocaptionType) C13LP.LJJJLZIJ(0, list)) == null || (str = autocaptionType.language) == null) {
                        break;
                    }
                }
            }
        }
        return "";
    }

    public static final int LJIILJJIL(Aweme aweme) {
        if (aweme == null || !LIZIZ.LJIILL(aweme, null, null) || !C746760TRa.LIZ().LJLILLLLZI()) {
            return 0;
        }
        return 1;
    }

    public static final Integer LJIILL(Aweme aweme) {
        Video video;
        if (aweme == null || (video = aweme.getVideo()) == null) {
            return null;
        }
        return Integer.valueOf(video.getVideoLength());
    }

    public static final Long LJIILLIIL(Aweme aweme) {
        Video video;
        CaptionModel captionModel;
        CaptionLanguage captionLanguage;
        Long l;
        if (aweme == null || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (captionLanguage = captionModel.originalCaptionLanguage) == null || (l = captionLanguage.firstSubtitleTime) == null) {
            return null;
        }
        long jLongValue = l.longValue();
        if (jLongValue < 0) {
            return null;
        }
        return Long.valueOf(jLongValue);
    }

    public static final boolean LJIIZILJ(Aweme aweme) {
        boolean z;
        Video video;
        CaptionModel captionModel;
        List<CaptionItemModel> list;
        if (aweme != null && (video = aweme.getVideo()) != null && (captionModel = video.getCaptionModel()) != null && (list = captionModel.captionList) != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    public static final boolean LJIJI(Aweme aweme) {
        CaptionItemModel captionItemModelLJIIIIZZ;
        Long lValueOf;
        if (aweme == null || (captionItemModelLJIIIIZZ = LJIIIIZZ(aweme)) == null || (lValueOf = Long.valueOf(captionItemModelLJIIIIZZ.claSubtitleId)) == null || lValueOf.longValue() == 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJIJJ(Aweme aweme) {
        Video video;
        CaptionModel captionModel;
        Long l;
        if (aweme == null || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (l = captionModel.creatorEditedCaptionId) == null || l.longValue() == 0) {
            return false;
        }
        return true;
    }

    public static final int LJIJJLI(Aweme aweme) {
        Audio audio;
        List<TtsInfos> ttsInfos;
        if (aweme != null && (audio = aweme.getAudio()) != null && (ttsInfos = audio.getTtsInfos()) != null && C13LP.LJJJLL(ttsInfos) != null) {
            return 1;
        }
        return 0;
    }

    public static boolean LJIL(Aweme aweme) {
        if (LJJIII(aweme)) {
            return C746760TRa.LIZ().LIZIZ();
        }
        return C746760TRa.LIZ().LJL();
    }

    public static boolean LJJ(Aweme aweme) {
        Video video;
        CaptionModel captionModel;
        Long lValueOf;
        if (aweme == null || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null) {
            return false;
        }
        CaptionLanguage captionLanguage = captionModel.originalCaptionLanguage;
        CaptionItemModel captionItemModel = null;
        if (captionLanguage != null) {
            lValueOf = Long.valueOf(captionLanguage.languageId);
        } else {
            lValueOf = null;
        }
        List<CaptionItemModel> list = captionModel.captionList;
        if (list == null) {
            return false;
        }
        Iterator<CaptionItemModel> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            CaptionItemModel next = it2.next();
            long j = next.languageId;
            if (lValueOf != null && j == lValueOf.longValue()) {
                captionItemModel = next;
                break;
            }
        }
        CaptionItemModel captionItemModel2 = captionItemModel;
        if (captionItemModel2 == null) {
            return false;
        }
        return captionItemModel2.isAutoGenerated();
    }

    public static final boolean LJJI(Aweme aweme) {
        if (LJIIIIZZ(aweme) != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJII(Aweme aweme) {
        if (C293260BeW.LIZ() && aweme != null) {
            if (LJIIIIZZ(aweme) == null) {
                if (aweme != null && C20702515zj.LIZLLL(aweme) != null) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean LJJIII(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if (LIZIZ.LJIJI(aweme)) {
            return true;
        }
        return !LIZIZ(LJIIIZ(aweme));
    }

    public static final boolean LJJIIJ(Aweme aweme) {
        CaptionModel captionModel;
        Long l;
        boolean z = false;
        if (aweme == null) {
            return false;
        }
        Video video = aweme.getVideo();
        if (video != null && (captionModel = video.getCaptionModel()) != null && (l = captionModel.creatorEditedCaptionId) != null && l.longValue() == 0) {
            z = true;
        }
        return !z;
    }

    public static boolean LJJIIJZLJL(Aweme aweme) {
        return Intrinsics.LJFF(LIZIZ.LLIIZ(), LJIIIZ(aweme));
    }

    public static final boolean LJJIIZ(Aweme aweme) {
        String authorUid;
        LIZ.getClass();
        String curUserId = ((IAccountService) LIZJ.getValue()).LJIIJ().getCurUserId();
        if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
            authorUid = "";
        }
        return curUserId.equals(authorUid);
    }

    public static final boolean LJJIJIIJI(Aweme aweme) {
        if (aweme == null || !LJJIIZ(aweme)) {
            return false;
        }
        if (!LJIJJ(aweme) && !LJIJI(aweme)) {
            return false;
        }
        if (LJIIIIZZ(aweme) != null && !C746760TRa.LIZ().LJJIL(aweme.getAid())) {
            return false;
        }
        ICaptionAppDiffProtocol.LIZ.getClass();
        C1865290ydj.LIZIZ.getValue().LIZ();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0025 A[PHI: r0
      0x0025: PHI (r0v2 java.lang.String) = (r0v1 java.lang.String), (r0v5 java.lang.String) binds: [B:17:0x0023, B:11:0x0016] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJFF(com.ss.android.ugc.aweme.feed.model.Aweme r2, boolean r3) {
        /*
            java.lang.String r1 = ""
            if (r3 != 0) goto L19
            if (r2 == 0) goto L18
            com.ss.android.ugc.aweme.feed.model.CaptionItemModel r0 = X.C20702515zj.LIZLLL(r2)
            if (r0 == 0) goto L19
            if (r2 == 0) goto L18
            com.ss.android.ugc.aweme.feed.model.CaptionItemModel r0 = X.C20702515zj.LIZLLL(r2)
            if (r0 == 0) goto L18
            java.lang.String r0 = r0.languageName
            if (r0 != 0) goto L25
        L18:
            return r1
        L19:
            if (r2 == 0) goto L18
            com.ss.android.ugc.aweme.feed.model.CaptionItemModel r0 = LJIIIIZZ(r2)
            if (r0 == 0) goto L18
            java.lang.String r0 = r0.languageName
            if (r0 == 0) goto L18
        L25:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20703515zt.LJFF(com.ss.android.ugc.aweme.feed.model.Aweme, boolean):java.lang.String");
    }

    public static boolean LJJIFFI(Aweme aweme, boolean z) {
        List<String> listLJI;
        String strLLIIZ;
        if (aweme == null || (listLJI = LJI(aweme)) == null) {
            return false;
        }
        if (z) {
            strLLIIZ = LJIIIZ(aweme);
        } else {
            strLLIIZ = LIZIZ.LLIIZ();
        }
        return C13LP.LJJJJ(strLLIIZ, listLJI);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJJIIZI(com.ss.android.ugc.aweme.feed.model.Aweme r3, java.lang.Boolean r4) {
        /*
            boolean r0 = X.C305370By3.LIZ
            r2 = 0
            if (r0 != 0) goto L6
            return r2
        L6:
            if (r3 != 0) goto L9
            return r2
        L9:
            boolean r0 = LJJIIZ(r3)
            if (r0 == 0) goto L10
            return r2
        L10:
            X.161N r1 = X.C161N.LIZIZ
            java.lang.String r0 = r3.getAid()
            X.0S5m r1 = r1.LJJZZI(r0)
            boolean r0 = X.C0BJD.LIZ()
            if (r0 != 0) goto L28
            if (r4 == 0) goto L2e
            boolean r0 = r4.booleanValue()
            if (r0 == 0) goto L29
        L28:
            r2 = 1
        L29:
            boolean r0 = LJJIFFI(r3, r2)
            return r0
        L2e:
            X.0S5m r0 = X.EnumC715680S5m.NOT_OVERWRITTEN
            if (r1 == r0) goto L37
            X.0S5m r0 = X.EnumC715680S5m.OVERRIDE_TO_ORIGINAL
            if (r1 != r0) goto L29
            goto L28
        L37:
            com.ss.android.ugc.aweme.translation.service.ITranslationKevaService r0 = X.C161T.LIZ()
            boolean r0 = r0.LIZ()
            if (r0 == 0) goto L28
            X.161N r0 = X.C20703515zt.LIZIZ
            java.lang.String[] r1 = r0.LL()
            java.lang.String r0 = LJIIIZ(r3)
            boolean r0 = X.C13LQ.LJIILLIIL(r0, r1)
            if (r0 != 0) goto L28
            boolean r0 = LJJIIJZLJL(r3)
            if (r0 == 0) goto L29
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20703515zt.LJJIIZI(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Boolean):boolean");
    }

    public static boolean LJJIJ(Aweme aweme, Boolean bool) {
        String aid;
        if (Intrinsics.LJFF(bool, Boolean.FALSE) || LJJIII(aweme)) {
            return false;
        }
        C161N c161n = C161N.LIZIZ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        EnumC715680S5m enumC715680S5mLJJZZI = c161n.LJJZZI(aid);
        if ((C0BJD.LIZ() || enumC715680S5mLJJZZI != EnumC715680S5m.OVERRIDE_TO_TRANSLATED) && (!C161T.LIZ().LIZ() || enumC715680S5mLJJZZI == EnumC715680S5m.OVERRIDE_TO_ORIGINAL)) {
            return false;
        }
        if (!Intrinsics.LJFF(bool, Boolean.TRUE) && LIZIZ.LLFFF(aweme, false)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJJIJIIJIL(com.ss.android.ugc.aweme.feed.model.Aweme r4, boolean r5) {
        /*
            boolean r0 = LIZLLL(r4)
            r3 = 0
            if (r0 != 0) goto L23
            r2 = 0
            if (r5 == 0) goto L26
            X.161N r1 = X.C161N.LIZIZ
            if (r4 == 0) goto L24
            java.lang.String r0 = r4.getAid()
        L12:
            X.0S5m r1 = r1.LJJZZI(r0)
            X.0S5m r0 = X.EnumC715680S5m.OVERRIDE_TO_TRANSLATED
            if (r1 != r0) goto L26
            X.161N r0 = X.C20703515zt.LIZIZ
            boolean r0 = r0.LLFFF(r4, r3)
            if (r0 == 0) goto L26
        L22:
            r3 = 1
        L23:
            return r3
        L24:
            r0 = r2
            goto L12
        L26:
            boolean r0 = LJIL(r4)
            if (r0 == 0) goto L23
            boolean r0 = LJJIJ(r4, r2)
            if (r0 != 0) goto L23
            boolean r0 = LJJIIZI(r4, r2)
            if (r0 != 0) goto L23
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20703515zt.LJJIJIIJIL(com.ss.android.ugc.aweme.feed.model.Aweme, boolean):boolean");
    }

    public static final boolean LJJIJIL(Aweme aweme, Boolean bool) {
        if (aweme == null || !LJJIIZ(aweme)) {
            return false;
        }
        if ((!LJIJJ(aweme) && !LJIJI(aweme)) || C746760TRa.LIZ().LJJIL(aweme.getAid())) {
            return false;
        }
        if ((!LJJIIJ(aweme) && C0BJD.LIZ()) || Intrinsics.LJFF(bool, Boolean.TRUE)) {
            return false;
        }
        ICaptionAppDiffProtocol.LIZ.getClass();
        C1865290ydj.LIZIZ.getValue().LIZ();
        return true;
    }

    public static final String LIZ(Aweme aweme, String[] strArr, Boolean bool) {
        boolean z;
        CaptionModel captionModel;
        CaptionModel.NoCaptionReasonEnum noCaptionReason;
        if (aweme == null) {
            return null;
        }
        if (!LJJI(aweme)) {
            Video video = aweme.getVideo();
            if (video == null || (captionModel = video.getCaptionModel()) == null || (noCaptionReason = captionModel.getNoCaptionReason()) == null) {
                return null;
            }
            switch (C20699515zF.LIZ[noCaptionReason.ordinal()]) {
                case -1:
                case 6:
                    return null;
                case 0:
                default:
                    throw new C1954807lC();
                case 1:
                    return EnumC20703615zu.NO_AUTHORIZATION.getValue();
                case 2:
                    return EnumC20703615zu.SPEECH_NOT_RECOGNIZED.getValue();
                case 3:
                    return EnumC20703615zu.LANGUAGE_NOT_SUPPORTED.getValue();
                case 4:
                    return EnumC20703615zu.BEING_GENERATING.getValue();
                case 5:
                    return EnumC20703615zu.OTHERS.getValue();
            }
        }
        if (strArr != null && bool != null) {
            String strLJIIIZ = LJIIIZ(aweme);
            if (bool.booleanValue() && C13LQ.LJJIJIIJI(strLJIIIZ, strArr) < 0) {
                z = false;
            } else {
                z = true;
            }
            C20703515zt c20703515zt = LIZ;
            Boolean boolValueOf = Boolean.valueOf(z);
            c20703515zt.getClass();
            if (LJJIIZI(aweme, boolValueOf)) {
                return EnumC20703615zu.EMBEDDED_CAPTION.getValue();
            }
            if (strLJIIIZ != null && C13LQ.LJJIJIIJI(strLJIIIZ, strArr) >= 0) {
                return EnumC20703615zu.DO_NOT_TRANSLATE.getValue();
            }
        }
        return null;
    }
}
