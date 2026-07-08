package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EAE, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EAE {
    public static final C0EAE LIZ = new C0EAE();
    public static String LIZIZ = "editor_pro";
    public static String LIZJ = C0E98.EP_TOOLBAR.getValue();

    public static void LIZ(C1403560md0 c1403560md0, VideoPublishEditModel videoPublishEditModel) {
        String extra;
        String str;
        String str2;
        int i;
        int i2;
        NLEModel nleModel;
        NLEModel nleModel2;
        if (videoPublishEditModel == null || (nleModel2 = videoPublishEditModel.getNleModel()) == null || (extra = nleModel2.getExtra("retouch_panel_last_open_scene")) == null) {
            extra = LIZJ;
        }
        String str3 = c1403560md0.LIZ.get("all_editor_pro_used_functions");
        String strLIZIZ = "";
        if (str3 == null) {
            str3 = "";
        }
        int i3 = 0;
        if (videoPublishEditModel == null || (nleModel = videoPublishEditModel.getNleModel()) == null) {
            str = "";
            str2 = "";
            i = 0;
            i2 = 0;
        } else {
            List<NLETrackSlot> listLJFF = C352250DrT.LJFF(nleModel);
            ArrayList<C351410Dq7> arrayList = new ArrayList();
            str2 = "";
            i = 0;
            i3 = 0;
            i2 = 0;
            for (NLETrackSlot nLETrackSlot : (ArrayList) listLJFF) {
                List<C351390Dq5> listLJIIIZ = C351220Dpo.LJIIIZ(nLETrackSlot);
                List<C351410Dq7> listLJIIJ = C351220Dpo.LJIIJ(nLETrackSlot);
                if (!((ArrayList) listLJIIJ).isEmpty()) {
                    i++;
                    if (str3.length() > 0) {
                        str2 = ",retouch";
                    } else {
                        str2 = "retouch";
                    }
                    i3 = 1;
                }
                if (!((ArrayList) listLJIIIZ).isEmpty()) {
                    i2 = 1;
                }
                C19719612Di.LJJI(listLJIIJ, arrayList);
            }
            String strLIZIZ2 = "";
            for (C351410Dq7 c351410Dq7 : arrayList) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ2);
                sbLIZ.append(c351410Dq7.LIZ.LIZIZ);
                sbLIZ.append(',');
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                for (Pair<String, Integer> pair : c351410Dq7.LIZ.LIZJ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append(pair.getFirst());
                    sbLIZ2.append(':');
                    sbLIZ2.append(pair.getSecond().intValue());
                    sbLIZ2.append(';');
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
            str = strLIZIZ;
            strLIZIZ = strLIZIZ2;
        }
        a0.LJJJLL(",", strLIZIZ);
        a0.LJJJLL(";", str);
        c1403560md0.LJ("retouch_used_functions", str);
        c1403560md0.LJ("retouch_resource_id_list", strLIZIZ);
        c1403560md0.LJ("retouch_click_from", extra);
        c1403560md0.LIZ(i3, "is_editorpro_retouch");
        c1403560md0.LIZ(i2, "is_editorpro_auto_retouch");
        c1403560md0.LIZ(i, "retouch_clips_cnt");
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(str3);
        sbLIZ3.append(str2);
        c1403560md0.LJ("all_editor_pro_used_functions", C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static void LIZIZ(C1403560md0 c1403560md0, VideoPublishEditModel videoPublishEditModel) {
        NLEModel nleModel;
        int i = 0;
        if (videoPublishEditModel != null && (nleModel = videoPublishEditModel.getNleModel()) != null) {
            Iterator it2 = ((ArrayList) C352250DrT.LJFF(nleModel)).iterator();
            while (it2.hasNext()) {
                if (!((ArrayList) C351220Dpo.LJIIJ((NLETrackSlot) it2.next())).isEmpty()) {
                    i = 1;
                }
            }
        }
        c1403560md0.LIZ(i, "is_editorpro_retouch");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012 A[PHI: r4
      0x0012: PHI (r4v2 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String) binds: [B:9:0x0010, B:7:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0LAB LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r6, java.lang.String r7) {
        /*
            java.lang.String r3 = X.C1403540mcy.LIZJ(r6)
            java.lang.String r5 = ""
            if (r3 != 0) goto L9
            r3 = r5
        L9:
            if (r6 == 0) goto Lf
            java.lang.String r4 = r6.mShootWay
            if (r4 != 0) goto L12
        Lf:
            r4 = r5
            if (r6 == 0) goto L16
        L12:
            java.lang.String r5 = X.C1428470nHB.LJIILIIL(r6)
        L16:
            X.0M8t r2 = X.C563650M8t.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "createCommonParams creationId = "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " shootWay = "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " contentSource = "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " enterFrom = "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "RetouchMobEvent"
            X.C201955140j.LIZLLL(r2, r0, r1)
            X.0LAB r1 = new X.0LAB
            r1.<init>()
            java.lang.String r0 = "content_source"
            r1.LJ(r0, r5)
            java.lang.String r0 = "enter_from"
            r1.LJ(r0, r7)
            java.lang.String r0 = "shoot_way"
            r1.LJ(r0, r4)
            java.lang.String r0 = "creation_id"
            r1.LJ(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EAE.LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.String):X.0LAB");
    }

    public static final void LIZLLL(VideoPublishEditModel videoPublishEditModel, EnumC360140EAa enumC360140EAa) {
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobAdjustRetouchPreviewArea action = ");
        sbLIZ.append(enumC360140EAa.getValue());
        C201955140j.LIZLLL(c563650M8t, "RetouchMobEvent", C2188811AlT.LIZIZ(sbLIZ));
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, LIZIZ);
        c0labLIZJ.LJ("action", enumC360140EAa.getValue());
        c0labLIZJ.LJ("click_from", LIZJ);
        C20684815ws.LJIILLIIL("adjust_retouch_preview_area", c0labLIZJ.LIZ);
    }

    public static final void LJ(VideoPublishEditModel videoPublishEditModel, EnumC373620Ekq enumC373620Ekq) {
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobClickOnRetouchPanel action = ");
        sbLIZ.append(enumC373620Ekq.getValue());
        C201955140j.LIZLLL(c563650M8t, "RetouchMobEvent", C2188811AlT.LIZIZ(sbLIZ));
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, LIZIZ);
        c0labLIZJ.LJ("action", enumC373620Ekq.getValue());
        c0labLIZJ.LJ("click_from", LIZJ);
        C20684815ws.LJIILLIIL("click_on_retouch_panel", c0labLIZJ.LIZ);
    }

    public static final void LJFF(VideoPublishEditModel videoPublishEditModel, C0EAG c0eag) {
        LIZIZ = "video_edit_page";
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobClickRetouchEntrance actionType = ");
        sbLIZ.append(c0eag.getValue());
        C201955140j.LIZLLL(c563650M8t, "RetouchMobEvent", C2188811AlT.LIZIZ(sbLIZ));
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, LIZIZ);
        c0labLIZJ.LJ("action_type", c0eag.getValue());
        C20684815ws.LJIILLIIL("click_retouch_entrance", c0labLIZJ.LIZ);
    }

    public static void LJIIL(VideoPublishEditModel videoPublishEditModel, boolean z) {
        String str;
        String str2;
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobRetouchEntranceShow isEditorPro = ");
        sbLIZ.append(z);
        C201955140j.LIZLLL(c563650M8t, "RetouchMobEvent", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            str = "editor_pro";
        } else {
            str = "video_edit_page";
        }
        LIZIZ = str;
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLIZJ.LJ("is_editor_pro", str2);
        C20684815ws.LJIILLIIL("retouch_entrance_show", c0labLIZJ.LIZ);
    }

    public static final void LJIILJJIL(VideoPublishEditModel videoPublishEditModel, C0EA0 c0ea0) {
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobRetouchPopupClick action = ");
        sbLIZ.append(c0ea0.getValue());
        C201955140j.LIZLLL(c563650M8t, "RetouchMobEvent", C2188811AlT.LIZIZ(sbLIZ));
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, LIZIZ);
        c0labLIZJ.LJ("click_from", C0E98.EP_TOOLBAR.getValue());
        c0labLIZJ.LJ("action", c0ea0.getValue());
        C20684815ws.LJIILLIIL("retouch_popup_click", c0labLIZJ.LIZ);
    }

    public static final void LJIILIIL(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, C0E98 c0e98) {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        NLEModel nLEModelLLZ;
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobRetouchPanelShow clickFrom = ");
        sbLIZ.append(c0e98.getValue());
        C201955140j.LIZLLL(c563650M8t, "RetouchMobEvent", C2188811AlT.LIZIZ(sbLIZ));
        LIZJ = c0e98.getValue();
        if (c0e48 != null && (interfaceC351350Dq1LLFII = c0e48.LLFII()) != null && (nLEModelLLZ = interfaceC351350Dq1LLFII.LLZ()) != null) {
            nLEModelLLZ.setExtra("retouch_panel_last_open_scene", LIZJ);
        }
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, LIZIZ);
        c0labLIZJ.LJ("click_from", LIZJ);
        C20684815ws.LJIILLIIL("retouch_panel_show", c0labLIZJ.LIZ);
    }

    public static void LJIIIIZZ(C0EAE c0eae, int i, Integer num, List list) {
        c0eae.getClass();
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobDownloadRetouchItemsForAutoRetouch status = ");
        sbLIZ.append(i);
        sbLIZ.append(", errorCode = ");
        sbLIZ.append((String) null);
        sbLIZ.append(", errorDomain = ");
        sbLIZ.append((String) null);
        sbLIZ.append(", duration = ");
        sbLIZ.append(num);
        sbLIZ.append(", resourceIdList = ");
        sbLIZ.append(list);
        C201955140j.LIZLLL(c563650M8t, "RetouchMobEvent", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sb = new StringBuilder();
        if (list != null) {
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    sb.append((String) obj);
                    if (i2 != list.size() - 1) {
                        sb.append(",");
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (num != null) {
            c0lab.LIZ(num.intValue(), "duration");
        }
        c0lab.LJ("resource_id_list", sb.toString());
        C20684815ws.LJIILLIIL("download_retouch_items_for_auto_retouch", c0lab.LIZ);
    }

    public static void LJIIIZ(String str, int i, Integer num, Integer num2, String str2) {
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobLoadRetouchPanelAlg status = ");
        sbLIZ.append(i);
        sbLIZ.append(", errorCode = ");
        sbLIZ.append(str);
        sbLIZ.append(", errorDomain = ");
        sbLIZ.append(str2);
        sbLIZ.append(", duration = ");
        sbLIZ.append(num);
        sbLIZ.append(", useCache = ");
        sbLIZ.append(num2);
        C201955140j.LIZLLL(c563650M8t, "RetouchMobEvent", C2188811AlT.LIZIZ(sbLIZ));
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (i == 1) {
            if (str != null) {
                c0lab.LJ("error_code", str);
            }
            if (str2 != null) {
                c0lab.LJ("error_domain", str2);
            }
        }
        if (num != null) {
            c0lab.LIZ(num.intValue(), "duration");
        }
        if (num2 != null) {
            c0lab.LIZ(num2.intValue(), "use_cache");
        }
        C20684815ws.LJIILLIIL("load_retouch_panel_alg", c0lab.LIZ);
    }

    public static void LJIIJJI(String str, int i, Integer num, Integer num2, String str2) {
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobLoadRetouchPanelAutoRetouchRes status = ");
        sbLIZ.append(i);
        sbLIZ.append(", errorCode = ");
        sbLIZ.append(str);
        sbLIZ.append(", errorDomain = ");
        sbLIZ.append(str2);
        sbLIZ.append(", duration = ");
        sbLIZ.append(num);
        sbLIZ.append(", useCache = ");
        sbLIZ.append(num2);
        C201955140j.LIZLLL(c563650M8t, "RetouchMobEvent", C2188811AlT.LIZIZ(sbLIZ));
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (i == 1) {
            if (str != null) {
                c0lab.LJ("error_code", str);
            }
            if (str2 != null) {
                c0lab.LJ("error_domain", str2);
            }
        }
        if (num != null) {
            c0lab.LIZ(num.intValue(), "duration");
        }
        if (num2 != null) {
            c0lab.LIZ(num2.intValue(), "use_cache");
        }
        C20684815ws.LJIILLIIL("load_retouch_panel_auto_retouch_res", c0lab.LIZ);
    }

    public static void LJI(C0EAE c0eae, int i, Integer num, String str, String str2, Integer num2, Integer num3, long j, int i2) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        if ((i2 & 16) != 0) {
            num2 = null;
        }
        if ((i2 & 32) != 0) {
            num3 = null;
        }
        c0eae.getClass();
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobDetectFaceSuccessRate status = ");
        sbLIZ.append(i);
        sbLIZ.append(", faceNum = ");
        sbLIZ.append(num);
        sbLIZ.append(", errorCode = ");
        sbLIZ.append(str);
        sbLIZ.append(", errorDomain = ");
        sbLIZ.append(str2);
        sbLIZ.append(", useCache = ");
        sbLIZ.append(num2);
        sbLIZ.append(", duration = ");
        sbLIZ.append(num3);
        C201955140j.LIZLLL(c563650M8t, "RetouchMobEvent", C2188811AlT.LIZIZ(sbLIZ));
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (i == 0) {
            if (num != null) {
                c0lab.LIZ(num.intValue(), "face_num");
            }
        } else {
            if (str != null) {
                c0lab.LJ("error_code", str);
            }
            if (str2 != null) {
                c0lab.LJ("error_domain", str2);
            }
        }
        if (num2 != null) {
            c0lab.LIZ(num2.intValue(), "use_cache");
        }
        if (num3 != null) {
            c0lab.LIZ(num3.intValue(), "duration");
        }
        c0lab.LIZIZ(j, "fetch_alg_model_duration");
        C20684815ws.LJIILLIIL("detect_face_success_rate", c0lab.LIZ);
    }

    public static void LJII(int i, String str, String str2, Integer num, Integer num2, String str3, String str4, String str5, Boolean bool) {
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobDownloadRetouch status = ");
        sbLIZ.append(i);
        sbLIZ.append(", errorCode = ");
        sbLIZ.append(str);
        sbLIZ.append(", errorDomain = ");
        sbLIZ.append(str2);
        sbLIZ.append(", useCache = ");
        sbLIZ.append(num);
        sbLIZ.append(", duration = ");
        sbLIZ.append(num2);
        sbLIZ.append(", resourceId = ");
        sbLIZ.append(str4);
        sbLIZ.append(", resourceName = ");
        sbLIZ.append(str5);
        sbLIZ.append(", isPrimaryListRes = ");
        sbLIZ.append(bool);
        C201955140j.LIZLLL(c563650M8t, "RetouchMobEvent", C2188811AlT.LIZIZ(sbLIZ));
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (i == 1) {
            c0lab.LJ("error_code", str);
            if (str2 != null) {
                c0lab.LJ("error_domain", str2);
            }
        }
        if (num != null) {
            c0lab.LIZ(num.intValue(), "use_cache");
        }
        if (num2 != null) {
            c0lab.LIZ(num2.intValue(), "duration");
        }
        if (str4 != null) {
            c0lab.LJ("resource_id", str4);
        }
        if (str3 != null) {
            c0lab.LJ("effect_id", str3);
        }
        if (str5 != null) {
            c0lab.LJ("resource_name", str5);
        }
        if (bool != null) {
            c0lab.LJFF("is_primary_list_res", bool.booleanValue());
        }
        C20684815ws.LJIILLIIL("download_retouch", c0lab.LIZ);
    }
}
