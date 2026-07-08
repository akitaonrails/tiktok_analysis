package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.ICaptionKevaService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1600, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1600 extends AnonymousClass1603 {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0026 A[PHI: r1 r2
      0x0026: PHI (r1v1 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:15:0x0023, B:8:0x0015] A[DONT_GENERATE, DONT_INLINE]
      0x0026: PHI (r2v2 com.ss.android.ugc.aweme.feed.model.Aweme) = (r2v1 com.ss.android.ugc.aweme.feed.model.Aweme), (r2v5 com.ss.android.ugc.aweme.feed.model.Aweme) binds: [B:15:0x0023, B:8:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AnonymousClass1600(com.ss.android.ugc.aweme.feed.model.VideoItemParams r5) {
        /*
            r4 = this;
            r3 = 0
            if (r5 == 0) goto L21
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r5.getAweme()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getAweme()
            if (r0 == 0) goto L22
            java.lang.String r1 = r0.getAid()
        L11:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getAweme()
            if (r0 == 0) goto L26
            java.lang.String r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r0)
        L1b:
            java.lang.String r3 = r5.mEventType
        L1d:
            r4.<init>(r1, r0, r3, r2)
            return
        L21:
            r2 = r3
        L22:
            r1 = r3
            if (r5 == 0) goto L26
            goto L11
        L26:
            r0 = r3
            if (r5 == 0) goto L1d
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1600.<init>(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }

    public static C2344009Gk LJIIIIZZ(C2344009Gk c2344009Gk) {
        C651970Phj.LLILLL.getClass();
        Map mapLIZJ = C651980Phk.LIZJ();
        if (mapLIZJ.isEmpty()) {
            return c2344009Gk;
        }
        c2344009Gk.LJFF("search_keyword", (String) mapLIZJ.get("search_keyword"));
        c2344009Gk.LJFF("search_id", (String) mapLIZJ.get("search_id"));
        c2344009Gk.LJFF("search_type", (String) mapLIZJ.get("search_type"));
        return c2344009Gk;
    }

    public final void LJIIJ(C2344009Gk c2344009Gk) {
        c2344009Gk.LJIIIIZZ("subtitle_type", C20703515zt.LJIIJJI(this.LIZ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0061, code lost:
    
        r1 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r5.versionType);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.C2344009Gk r9, boolean r10) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.LIZ
            X.15zt r0 = X.C20703515zt.LIZ
            if (r1 == 0) goto L6c
            com.ss.android.ugc.aweme.feed.model.Video r0 = r1.getVideo()
            if (r0 == 0) goto L6c
            com.ss.android.ugc.aweme.feed.model.CaptionModel r0 = r0.getCaptionModel()
            if (r0 == 0) goto L6c
            java.util.List<com.ss.android.ugc.aweme.feed.model.CaptionItemModel> r2 = r0.captionList
            if (r2 == 0) goto L6c
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L6c
            com.ss.android.ugc.aweme.feed.model.Video r0 = r1.getVideo()
            if (r0 == 0) goto L5f
            com.ss.android.ugc.aweme.feed.model.CaptionModel r0 = r0.getCaptionModel()
            if (r0 == 0) goto L5f
            com.ss.android.ugc.aweme.feed.model.CaptionLanguage r0 = r0.originalCaptionLanguage
            if (r0 == 0) goto L5f
            long r0 = r0.languageId
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
        L32:
            java.util.Iterator r6 = r2.iterator()
        L36:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r5 = r6.next()
            com.ss.android.ugc.aweme.feed.model.CaptionItemModel r5 = (com.ss.android.ugc.aweme.feed.model.CaptionItemModel) r5
            long r3 = r5.languageId
            if (r7 == 0) goto L50
            long r1 = r7.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L50
            if (r10 != 0) goto L61
        L50:
            long r3 = r5.languageId
            if (r7 == 0) goto L5c
            long r1 = r7.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L36
        L5c:
            if (r10 != 0) goto L36
            goto L61
        L5f:
            r7 = 0
            goto L32
        L61:
            java.lang.String r0 = r5.versionType     // Catch: java.lang.Exception -> L68
            int r1 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.Exception -> L68
            goto L6d
        L68:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L6c:
            r1 = 0
        L6d:
            java.lang.String r0 = "cla_subtitle_type"
            r9.LIZJ(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1600.LJII(X.09Gk, boolean):void");
    }

    public final void LJIIIZ(C2344009Gk c2344009Gk, boolean z) {
        c2344009Gk.LJIIIIZZ("subtitle_lang", C20703515zt.LJFF(this.LIZ, z));
    }

    public AnonymousClass1600(String str, String str2, String str3, Aweme aweme) {
        super(str, str2, str3, aweme);
    }

    public static void LJIIJJI(AnonymousClass1600 anonymousClass1600, Boolean bool, EnumC1390800mIQ enumC1390800mIQ, C160B c160b, Integer num, String str, String str2, int i, Integer num2, Boolean bool2, C207088161u c207088161u, int i2) {
        String str3;
        String str4;
        int iIntValue;
        boolean z;
        String str5;
        String str6 = str2;
        C207088161u c207088161u2 = c207088161u;
        Integer num3 = num2;
        if ((i2 & 8) != 0) {
            str3 = "";
        } else {
            str3 = null;
        }
        if ((i2 & 16) != 0) {
            c160b = null;
        }
        if ((i2 & 32) != 0) {
            num = null;
        }
        if ((i2 & 64) != 0) {
            str = null;
        }
        if ((i2 & 128) != 0) {
            str6 = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            num3 = null;
        }
        if ((i2 & 8192) != 0) {
            bool2 = null;
        }
        if ((i2 & 16384) != 0) {
            c207088161u2 = null;
        }
        anonymousClass1600.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        anonymousClass1600.LIZ(c2344009Gk, null);
        C20703515zt c20703515zt = C20703515zt.LIZ;
        c20703515zt.getClass();
        C161N c161n = C20703515zt.LIZIZ;
        c2344009Gk.LJIIIIZZ("target_lang", c161n.LLIIZ());
        anonymousClass1600.LJ(c2344009Gk);
        c2344009Gk.LJIIIIZZ("enter_method", enumC1390800mIQ.getValue());
        anonymousClass1600.LJIIJ(c2344009Gk);
        anonymousClass1600.LIZLLL(c2344009Gk);
        anonymousClass1600.LJI(c2344009Gk);
        c2344009Gk.LJIIIIZZ("user_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
        LJIIIIZZ(c2344009Gk);
        anonymousClass1600.LIZIZ(c2344009Gk);
        c2344009Gk.LIZJ(i, "is_landscape_screen");
        c20703515zt.getClass();
        if (!c161n.LJIJI(anonymousClass1600.LIZ)) {
            if (str6 == null) {
                if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                    if (C20702515zj.LIZIZ(anonymousClass1600.LIZ)) {
                        str6 = "see_translation";
                    } else {
                        str6 = "see_translation_in_grey";
                    }
                } else {
                    str6 = "see_original";
                }
            }
            c2344009Gk.LJFF("translation_options", str6);
        }
        C1390830mIT.LIZ(c2344009Gk, anonymousClass1600.LIZ, bool, str);
        if (bool2 != null) {
            c2344009Gk.LIZJ(bool2.booleanValue() ? 1 : 0, "is_author");
        }
        if (c160b != null) {
            int i3 = AnonymousClass1605.LIZ[c160b.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    str5 = "captions";
                } else {
                    throw new C1954807lC();
                }
            } else {
                str5 = "hidden";
            }
            c2344009Gk.LJIIIIZZ("captions_show_type", str5);
        }
        if (bool != null) {
            bool.booleanValue();
            anonymousClass1600.LJIIIZ(c2344009Gk, bool.booleanValue());
        }
        if (!Intrinsics.LJFF(str3, "")) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            if ((C20703515zt.LJJIJIL(anonymousClass1600.LIZ, Boolean.valueOf(z)) || C20703515zt.LJJIJIIJI(anonymousClass1600.LIZ)) && str3 != null) {
                c2344009Gk.LJIIIIZZ("author_options", str3);
            }
        }
        if (!Intrinsics.LJFF(str3, "manage") && (num3 == null || num3.intValue() != 150)) {
            if (num != null) {
                iIntValue = num.intValue();
            } else if (!((ICaptionKevaService) ServiceManager.get().getService(ICaptionKevaService.class)).LJJIIJ()) {
                iIntValue = 1;
            } else {
                iIntValue = 0;
            }
            c2344009Gk.LIZJ(iIntValue, "is_to_turn_on");
        }
        c2344009Gk.LJ(num3, "aweme_type");
        if (C0BSX.LIZ && c207088161u2 != null) {
            c2344009Gk.LIZJ(c207088161u2.LIZIZ.size(), "translated_elements_count");
            if (c207088161u2.LJIIIZ) {
                str4 = "shown_selected";
            } else {
                str4 = "shown_not_selected";
            }
            c2344009Gk.LJFF("show_trans_survey_status", str4);
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair(EnumC207101162h.DESCRIPTION, "description"), new Pair(EnumC207101162h.CAPTION, "caption"), new Pair(EnumC207101162h.STICKER, "sticker"));
            List<EnumC207101162h> list = c207088161u2.LIZIZ;
            ArrayList arrayList = new ArrayList();
            Iterator<EnumC207101162h> it2 = list.iterator();
            while (it2.hasNext()) {
                Object obj = mapLJIIIIZZ.get(it2.next());
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            c2344009Gk.LJFF("translated_elements", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
        } else {
            c2344009Gk.LIZJ(0, "translated_elements_count");
            c2344009Gk.LJFF("show_trans_survey_status", "not_shown");
            c2344009Gk.LJFF("translated_elements", "null");
        }
        C207069161b.LJFF(new AnonymousClass0174(), "show_subtitle_options", c2344009Gk.LIZ);
    }
}
