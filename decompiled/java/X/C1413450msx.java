package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.EffectSearchModel;
import com.ss.android.ugc.aweme.effect.VideoAnimModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0msx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1413450msx {
    public static final C1413450msx LIZ = new C1413450msx();
    public static String LIZIZ = "";
    public static final Set<String> LIZJ = new LinkedHashSet();
    public static String LIZLLL = "";

    public static String LIZLLL(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -510575962) {
            if (iHashCode != 41552559) {
                if (iHashCode == 1307747558 && str.equals("out_video_anim")) {
                    return "animation_out";
                }
                return str;
            }
            if (!str.equals("in_video_anim")) {
                return str;
            }
            if (C1413470msz.LIZ()) {
                return "animation";
            }
            return "animation_in";
        }
        if (!str.equals("combo_video_anim")) {
            return str;
        }
        return "animation_combo";
    }

    public static String LJFF(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -510575962) {
            if (iHashCode != 41552559) {
                if (iHashCode == 1307747558 && str.equals("out_video_anim")) {
                    return "video_anim_out";
                }
                return "";
            }
            if (str.equals("in_video_anim")) {
                return "video_anim_in";
            }
            return "";
        }
        if (str.equals("combo_video_anim")) {
            return "video_anim_combo";
        }
        return "";
    }

    public static C0LAB LJI(VideoPublishEditModel videoPublishEditModel) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
        return c0lab;
    }

    public static void LJIJJ(EffectSearchModel effectSearchModel) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("search_id", effectSearchModel.getSearchId());
        c0lab.LJ("enter_from", effectSearchModel.getSearchFrom());
        c0lab.LJ("search_keyword", effectSearchModel.getSearchKeyword());
        c0lab.LJ("search_result_id", effectSearchModel.getSearchResultId());
        c0lab.LJ("token_type", effectSearchModel.getTokenType());
        c0lab.LIZ(Intrinsics.LJFF(effectSearchModel.isFirstScreen(), Boolean.TRUE) ? 1 : 0, "is_first_screen");
        c0lab.LJ("universal_rank", effectSearchModel.getSearchUniversalRank());
        c0lab.LJ("creator_search_info", effectSearchModel.getCreatorSearchInfo());
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("search_result_click", c0lab.LIZ);
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        int i;
        if (videoPublishEditModel == null) {
            return;
        }
        videoPublishEditModel.getShootEnterMethod();
        CommonMobParamModel commonMobParamModel = videoPublishEditModel.creativeModel.commonMobModel;
        if (videoPublishEditModel.isCutSameVideoType() && commonMobParamModel.originalUserSelectedPicCnt != -1 && (i = commonMobParamModel.originalUserSelectedVideoCnt) != -1) {
            c0lab.LIZ(i, "original_video_cnt");
            c0lab.LIZ(commonMobParamModel.originalUserSelectedPicCnt, "original_pic_cnt");
        } else {
            c0lab.LIZ(commonMobParamModel.originVideoCount, "original_video_cnt");
            c0lab.LIZ(commonMobParamModel.originPhotoCount, "original_pic_cnt");
        }
    }

    public static NLETrackSlot LJ(List list, List list2) {
        ArrayList arrayList;
        if (list2.size() > list.size()) {
            arrayList = new ArrayList();
            for (Object obj : list2) {
                if (!list.contains(obj)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!list2.contains(obj2)) {
                    arrayList.add(obj2);
                }
            }
        }
        if (!arrayList.isEmpty() && arrayList.size() == 1) {
            return (NLETrackSlot) ListProtector.get(arrayList, 0);
        }
        return null;
    }

    public static void LJIILJJIL(VideoPublishEditModel videoPublishEditModel, AwS584S0100000_5 awS584S0100000_5) {
        String str;
        boolean z;
        C0LAB c0labLJI = LJI(videoPublishEditModel);
        c0labLJI.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0labLJI.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0labLJI.LIZ(videoPublishEditModel.getHasClippedEffect() ? 1 : 0, "is_edit_effect_duration");
        if (videoPublishEditModel.getDraftId() != 0) {
            c0labLJI.LIZ(videoPublishEditModel.getDraftId(), "draft_id");
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.getNewDraftId())) {
            c0labLJI.LJ("new_draft_id", videoPublishEditModel.getNewDraftId());
        }
        StringBuilder sb = new StringBuilder();
        for (EffectPointModel effectPointModel : videoPublishEditModel.getEffectList()) {
            if (!TextUtils.isEmpty(effectPointModel.getName())) {
                sb.append(effectPointModel.getName());
                sb.append(",");
            }
        }
        for (VideoAnimModel videoAnimModel : videoPublishEditModel.getVideoAnimList()) {
            if (!TextUtils.isEmpty(videoAnimModel.getName())) {
                sb.append(videoAnimModel.getName());
                sb.append(",");
            }
        }
        if (C1403680mdC.LJ(videoPublishEditModel)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJI.LJ("is_edit_prop", str);
        if (sb.length() > 0) {
            c0labLJI.LJ("effect_name", sb.substring(0, sb.length() - 1));
        }
        String str2 = videoPublishEditModel.creativeModel.initialModel.dmCameraModel.enterDM;
        if (str2 != null && str2.length() > 0) {
            LIZ.getClass();
            c0labLJI.LJ("enter_dm", str2);
        }
        ArrayList<EffectPointModel> effectList = videoPublishEditModel.getEffectList();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (EffectPointModel effectPointModel2 : effectList) {
            if (C1403700mdE.LIZJ(effectPointModel2.getExtra()).length() > 0) {
                arrayList.add(effectPointModel2);
            } else {
                arrayList2.add(effectPointModel2);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        Iterable iterable = (Iterable) pair.getFirst();
        Iterable iterable2 = (Iterable) pair.getSecond();
        String strLJJLIIIJ = C13LP.LJJLIIIJ(iterable, ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(345), 30);
        String strLJJLIIIJ2 = C13LP.LJJLIIIJ(iterable, ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(344), 30);
        String strLJJLIIIJ3 = C13LP.LJJLIIIJ(iterable2, ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(343), 30);
        String strLJJLIIIJ4 = C13LP.LJJLIIIJ(iterable2, ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(342), 30);
        if (strLJJLIIIJ2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        String str3 = null;
        if (!z) {
            strLJJLIIIJ2 = null;
        }
        c0labLJI.LJ("prop_resource_list", strLJJLIIIJ2);
        if (strLJJLIIIJ.length() <= 0) {
            strLJJLIIIJ = null;
        }
        c0labLJI.LJ("prop_list", strLJJLIIIJ);
        if (strLJJLIIIJ4.length() <= 0) {
            strLJJLIIIJ4 = null;
        }
        c0labLJI.LJ("effect_resource_list", strLJJLIIIJ4);
        if (strLJJLIIIJ3.length() > 0) {
            str3 = strLJJLIIIJ3;
        }
        c0labLJI.LJ("effect_list", str3);
        c0labLJI.LJ("effect_entrance_position", videoPublishEditModel.creativeModel.effectEntrancePosition);
        c0labLJI.LJ("effect_selected_from", videoPublishEditModel.getEditEffectSelectionStr(false, true));
        c0labLJI.LJ("effect_index", videoPublishEditModel.getEditEffectIndexStr(false));
        if (awS584S0100000_5 != null) {
            awS584S0100000_5.invoke(c0labLJI);
        }
        C0CHQ.LIZ().LIZJ().LJIIIIZZ("effect_confirm", c0labLJI.LIZ);
    }

    public static C0LAB LIZJ(VideoPublishEditModel videoPublishEditModel, Effect effect, int i) {
        int iIntValue;
        Integer numLJIIJJI;
        C0LAB c0labLJI = LJI(videoPublishEditModel);
        c0labLJI.LJ("effect_id", effect.getEffectId());
        c0labLJI.LJ("tab_name", effect.getPanel());
        c0labLJI.LIZ(i, "is_editor_pro");
        c0labLJI.LJ("effect_source", String.valueOf(effect.getSource()));
        String extra = effect.getExtra();
        if (extra != null && (numLJIIJJI = C2095008Iq.LJIIJJI(extra)) != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = -1;
        }
        c0labLJI.LIZ(iIntValue, "index");
        c0labLJI.LJ("effect_designer_uid", effect.getDesignerId());
        return c0labLJI;
    }

    public static void LJIIIZ(VideoPublishEditModel videoPublishEditModel, String str, boolean z) {
        String str2;
        C0LAB c0labLJI = LJI(videoPublishEditModel);
        if (str == null) {
            str = "";
        }
        c0labLJI.LJ("tab_name", str);
        if (z) {
            str2 = "play";
        } else {
            str2 = "pause";
        }
        c0labLJI.LJ("to_status", str2);
        c0labLJI.LIZ(0, "is_editor_pro");
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("click_effect_play", c0labLJI.LIZ);
    }

    public static void LJIJI(int i, long j, String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(i, "error_code");
        c0lab.LIZIZ(j, "duration");
        if (str != null) {
            c0lab.LJ("error_domain", str);
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("tool_fetch_search_query_suggestions", c0lab.LIZ);
    }

    public static void LJIL(int i, long j, String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(i, "error_code");
        c0lab.LIZIZ(j, "duration");
        if (str != null) {
            c0lab.LJ("error_domain", str);
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("tool_fetch_search_trending_keywords", c0lab.LIZ);
    }

    public static void LJIJ(VideoPublishEditModel videoPublishEditModel, String str, String str2, String str3) {
        if (videoPublishEditModel == null) {
            return;
        }
        C0LAB c0labLJI = LJI(videoPublishEditModel);
        c0labLJI.LJ("blankpage_id", str3);
        c0labLJI.LJ("enter_method", str2);
        c0labLJI.LJ("enter_from", str);
        C2341909Fp.LIZ("enter_editing_effect_search_blankpage", c0labLJI.LIZ);
    }

    public static void LIZ(boolean z, C0LAB c0lab, EffectModel effectModel, C1413460msy c1413460msy, String str) {
        String str2;
        String strLIZLLL;
        String str3 = null;
        if (c1413460msy == null || (str2 = c1413460msy.LIZ) == null || str2.length() <= 0) {
            if (effectModel != null) {
                str2 = effectModel.resourceId;
            } else {
                str2 = null;
            }
        }
        if (z) {
            if (effectModel != null && (strLIZLLL = C1403680mdC.LIZLLL(effectModel)) != null && strLIZLLL.length() > 0) {
                str3 = strLIZLLL;
            } else if (c1413460msy != null) {
                str3 = c1413460msy.LJFF;
            }
            c0lab.LJ("prop_id", str3);
            c0lab.LJ("prop_resource_id", str2);
            c0lab.LJ("effect_id", "");
            c0lab.LJ("effect_resource_id", "");
            return;
        }
        c0lab.LJ("effect_id", str);
        c0lab.LJ("effect_resource_id", str2);
        c0lab.LJ("prop_id", "");
        c0lab.LJ("prop_resource_id", "");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5, java.lang.String r6, boolean r7, int r8, boolean r9) {
        /*
            java.lang.String r1 = ""
            if (r7 != 0) goto Laf
            if (r6 == 0) goto Lb1
            int r0 = r6.hashCode()
            switch(r0) {
                case -1618412715: goto La3;
                case -841614300: goto L97;
                case 1169766991: goto L8b;
                case 1903044452: goto L80;
                default: goto Ld;
            }
        Ld:
            X.C1413450msx.LIZIZ = r1
            java.util.Set<java.lang.String> r0 = X.C1413450msx.LIZJ
            r0.clear()
            X.0LAB r4 = LJI(r5)
            java.lang.String r0 = "tab_name"
            r4.LJ(r0, r6)
            int r0 = r5.getDraftId()
            if (r0 == 0) goto L2c
            java.lang.String r1 = "draft_id"
            int r0 = r5.getDraftId()
            r4.LIZ(r0, r1)
        L2c:
            java.lang.String r0 = r5.getNewDraftId()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L3f
            java.lang.String r1 = "new_draft_id"
            java.lang.String r0 = r5.getNewDraftId()
            r4.LJ(r1, r0)
        L3f:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            java.lang.String r1 = r0.effectEntrancePosition
            java.lang.String r0 = "effect_entrance_position"
            r4.LJ(r0, r1)
            java.lang.String r3 = "1"
            java.lang.String r2 = "0"
            if (r7 == 0) goto L7e
            r1 = r3
        L4f:
            java.lang.String r0 = "is_editor_pro"
            r4.LJ(r0, r1)
            java.lang.String r1 = "tab_level"
            java.lang.String r0 = java.lang.String.valueOf(r8)
            r4.LJ(r1, r0)
            if (r9 != 0) goto L60
            r3 = r2
        L60:
            java.lang.String r0 = "is_from_create_template"
            r4.LJ(r0, r3)
            if (r7 == 0) goto L74
            com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel r0 = r5.getEditorProModel()
            java.lang.String r1 = r0.getClickFrom()
            java.lang.String r0 = "editorpro_click_from"
            r4.LJ(r0, r1)
        L74:
            java.util.List<X.09Fs> r0 = X.C2341909Fp.LIZ
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
            java.lang.String r0 = "click_effect_tab"
            X.C2341909Fp.LIZ(r0, r1)
            return
        L7e:
            r1 = r2
            goto L4f
        L80:
            java.lang.String r0 = "video_anim_out"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Ld
            java.lang.String r6 = "animation_out"
            goto Ld
        L8b:
            java.lang.String r0 = "video_anim_in"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Ld
            java.lang.String r6 = "animation_in"
            goto Ld
        L97:
            java.lang.String r0 = "video_anim_combo"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Ld
            java.lang.String r6 = "animation_combo"
            goto Ld
        La3:
            java.lang.String r0 = "video_anim"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Ld
            java.lang.String r6 = "animation"
            goto Ld
        Laf:
            if (r6 != 0) goto Ld
        Lb1:
            r6 = r1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1413450msx.LJIIIIZZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.String, boolean, int, boolean):void");
    }

    public static void LJIJJLI(long j, int i, String str, String str2, boolean z) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(i, "error_code");
        c0lab.LIZIZ(j, "duration");
        c0lab.LIZ(z ? 1 : 0, "is_load_more");
        if (str != null) {
            c0lab.LJ("search_id", str);
        }
        if (str2 != null) {
            c0lab.LJ("error_domain", str2);
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("tool_fetch_search_results", c0lab.LIZ);
    }

    public static void LJIILL(VideoPublishEditModel videoPublishEditModel, Pair pair, String str, String str2, int i, int i2, String str3) {
        if (Intrinsics.LJFF(str2, "video_anim")) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        str2 = "";
                    } else {
                        str2 = "animation_combo";
                    }
                } else {
                    str2 = "animation_out";
                }
            } else if (C1413470msz.LIZ()) {
                str2 = "animation";
            } else {
                str2 = "animation_in";
            }
        }
        C0LAB c0labLJI = LJI(videoPublishEditModel);
        c0labLJI.LJ("effect_id", str);
        c0labLJI.LIZ(0, "is_editor_pro");
        c0labLJI.LIZ(0, "is_multi_track");
        c0labLJI.LJ("tab_name", str2);
        int i3 = i2 + 1;
        c0labLJI.LIZ(i3, "effect_index");
        c0labLJI.LIZ(i3, "index");
        c0labLJI.LJ("effect_designer_uid", (String) pair.getFirst());
        c0labLJI.LJ("effect_source", (String) pair.getSecond());
        c0labLJI.LJ("effect_entrance_position", videoPublishEditModel.creativeModel.effectEntrancePosition);
        c0labLJI.LJ("delete_from", str3);
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("effect_delete", c0labLJI.LIZ);
    }

    public static void LJII(VideoPublishEditModel videoPublishEditModel, String str, String str2, int i, String str3, long j, Integer num, String str4) {
        C0LAB c0labLJI = LJI(videoPublishEditModel);
        c0labLJI.LJ("effect_id", str);
        c0labLJI.LJ("tab_name", str2);
        c0labLJI.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str3);
        c0labLJI.LIZ(0, "is_editor_pro");
        c0labLJI.LIZIZ(j, "duration");
        c0labLJI.LIZ(i + 1, "index");
        c0labLJI.LJ("effect_source", String.valueOf(num));
        if (str4 != null) {
            c0labLJI.LJ("effect_designer_uid", str4);
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("effect_apply_popup", c0labLJI.LIZ);
    }

    public static void LJIIJ(VideoPublishEditModel videoPublishEditModel, EffectModel effectModel, String str, C1413460msy c1413460msy, int i, boolean z, boolean z2, String str2, String str3, boolean z3) {
        LJIIJJI(videoPublishEditModel, effectModel, str, c1413460msy, i, z, z2, str2, str3, z3, null);
    }

    public static void LJIIJJI(VideoPublishEditModel videoPublishEditModel, EffectModel effectModel, String str, C1413460msy c1413460msy, int i, boolean z, boolean z2, String str2, String str3, boolean z3, EffectSearchModel effectSearchModel) {
        boolean z4;
        String str4;
        String str5;
        String str6;
        boolean z5;
        String str7 = c1413460msy.LJFF;
        int i2 = 0;
        if (str7 != null && str7.length() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        String str8 = "";
        if (z4) {
            str4 = "";
        } else {
            str4 = effectModel.key;
        }
        IFoundationAVService iFoundationAVService = (IFoundationAVService) ServiceManager.get().getService(IInternalAVService.class);
        iFoundationAVService.setLastInfo(new C1179004jM(str4));
        iFoundationAVService.setLastInfo(new C1259004wG(effectModel.resourceId));
        C0LAB c0labLJI = LJI(videoPublishEditModel);
        if (!z) {
            if (str == null) {
                str = "";
            }
            str = LIZLLL(str);
        }
        c0labLJI.LJ("tab_name", str);
        c0labLJI.LIZ(1003, "scene_id");
        c0labLJI.LJ("effect_name", effectModel.name);
        c0labLJI.LIZ(i + 1, "index");
        c0labLJI.LIZ(effectModel.isGoToCapCutEffect ? 1 : 0, "is_capcut");
        c0labLJI.LIZ(z ? 1 : 0, "is_editor_pro");
        String str9 = "1";
        if (z3) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJI.LJ("is_from_pip", str5);
        c0labLJI.LIZ(z2 ? 1 : 0, "is_multi_track");
        if (z) {
            str6 = "editor_pro";
        } else {
            str6 = "effect_entrance";
        }
        c0labLJI.LJ("entrance", str6);
        String str10 = c1413460msy.LJ;
        if (str10 == null || str10.length() <= 0) {
            str10 = videoPublishEditModel.creativeModel.effectEntrancePosition;
        }
        c0labLJI.LJ("effect_entrance_position", str10);
        String str11 = effectModel.recommendReason;
        if (str11 == null) {
            str11 = "";
        }
        c0labLJI.LJ("effect_panel_model_recall_type", str11);
        String str12 = effectModel.recommendRuleTags;
        if (str12 != null) {
            str8 = str12;
        }
        c0labLJI.LJ("effect_panel_model_recommend_tags", str8);
        if (videoPublishEditModel.getDraftId() != 0) {
            c0labLJI.LIZ(videoPublishEditModel.getDraftId(), "draft_id");
        }
        if (z) {
            c0labLJI.LJ("editorpro_click_from", videoPublishEditModel.getEditorProModel().getClickFrom());
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.getNewDraftId())) {
            c0labLJI.LJ("new_draft_id", videoPublishEditModel.getNewDraftId());
        }
        if (c1413460msy.LJFF.length() <= 0 && C1403680mdC.LIZLLL(effectModel).length() <= 0) {
            z5 = false;
            str9 = CardStruct.IStatusCode.DEFAULT;
        } else {
            z5 = true;
        }
        c0labLJI.LJ("is_edit_prop", str9);
        if (str2.length() != 0) {
            c0labLJI.LJ("action_type", str2);
        }
        if (str3.length() > 0) {
            c0labLJI.LJ("enter_way", str3);
        }
        String str13 = videoPublishEditModel.creativeModel.initialModel.dmCameraModel.enterDM;
        if (str13 != null && str13.length() > 0) {
            c0labLJI.LJ("enter_dm", str13);
        }
        c0labLJI.LJ("effect_source", String.valueOf(effectModel.source));
        c0labLJI.LJ("effect_designer_uid", effectModel.designerId);
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel);
        int iIntValue = pairLJIIJJI.getFirst().intValue();
        c0labLJI.LIZ(pairLJIIJJI.getSecond().intValue(), "pic_cnt");
        c0labLJI.LIZ(iIntValue, "video_cnt");
        if (C573570MeZ.LIZJ(videoPublishEditModel) || C573570MeZ.LIZIZ(videoPublishEditModel)) {
            i2 = 1;
        }
        c0labLJI.LIZ(i2, "is_pic_frame_single_pic_edit");
        if (C573570MeZ.LIZJ(videoPublishEditModel) || C573570MeZ.LIZIZ(videoPublishEditModel)) {
            c0labLJI.LIZ(1, "pic_cnt");
            c0labLJI.LJ("content_type", "multi_photo");
        }
        c0labLJI.LJ("music_id", c1413460msy.LIZIZ);
        c0labLJI.LJ("meta_song_id", c1413460msy.LIZJ);
        c0labLJI.LIZ(c1413460msy.LIZLLL ? 1 : 0, "is_pgc");
        if (c1413460msy.LJI) {
            c0labLJI.LJ("mix_request_id", videoPublishEditModel.creativeModel.mixEditingModel.requestId);
        }
        int i3 = videoPublishEditModel.creativeModel.imageEditModel.livePicCnt;
        if (i3 > 0) {
            c0labLJI.LIZ(i3, "live_pic_cnt");
        }
        LIZIZ(videoPublishEditModel, c0labLJI);
        LIZ(z5, c0labLJI, effectModel, c1413460msy, str4);
        if (effectSearchModel != null) {
            c0labLJI.LJ("search_id", effectSearchModel.getSearchId());
            c0labLJI.LJ("editing_effect_search_from", effectSearchModel.getSearchFrom());
            c0labLJI.LJ("search_keyword", effectSearchModel.getSearchKeyword());
            c0labLJI.LJ("search_result_id", effectSearchModel.getSearchResultId());
            c0labLJI.LJ("search_universal_rank", effectSearchModel.getSearchUniversalRank());
            c0labLJI.LJ("creator_search_info", effectSearchModel.getCreatorSearchInfo());
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("effect_click", c0labLJI.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0LAB] */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static void LJIILIIL(C1413450msx c1413450msx, VideoPublishEditModel videoPublishEditModel, String str, String str2, String str3, boolean z, boolean z2, String str4, int i, String str5, String str6, boolean z3, int i2) {
        String str7;
        int i3;
        if ((i2 & 16) != 0) {
            str3 = null;
        }
        ?? r9 = z;
        if ((i2 & 32) != 0) {
            r9 = 0;
        }
        ?? r10 = z2;
        if ((i2 & 64) != 0) {
            r10 = 0;
        }
        if ((i2 & 128) != 0) {
            str4 = null;
        }
        if ((i2 & 512) != 0) {
            str5 = "";
        }
        if ((i2 & 1024) != 0) {
            str6 = "";
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z3 = false;
        }
        c1413450msx.getClass();
        ?? LJI = LJI(videoPublishEditModel);
        if (str3 == null) {
            str3 = "";
        }
        LJI.LJ("tab_name", str3);
        LJI.LIZ(1003, "scene_id");
        LJI.LJ("effect_name", str);
        LJI.LJ("effect_id", str2);
        LJI.LIZ(0, "is_capcut");
        LJI.LIZ(r9, "is_editor_pro");
        if (z3) {
            str7 = "1";
        } else {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        LJI.LJ("is_from_pip", str7);
        LJI.LIZ(r10, "is_multi_track");
        LJI.LIZ(i, "impr_position");
        LJI.LIZ(i, "index");
        LJI.LJ("effect_entrance_position", videoPublishEditModel.creativeModel.effectEntrancePosition);
        if (!C573570MeZ.LIZJ(videoPublishEditModel) && !C573570MeZ.LIZIZ(videoPublishEditModel)) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        LJI.LIZ(i3, "is_pic_frame_single_pic_edit");
        LJI.LIZ(0, "is_edit_prop");
        if (C573570MeZ.LIZJ(videoPublishEditModel) || C573570MeZ.LIZIZ(videoPublishEditModel)) {
            LJI.LIZ(1, "pic_cnt");
            LJI.LJ("content_type", "multi_photo");
        }
        if (videoPublishEditModel.getDraftId() != 0) {
            LJI.LIZ(videoPublishEditModel.getDraftId(), "draft_id");
        }
        if (!TextUtils.isEmpty(videoPublishEditModel.getNewDraftId())) {
            LJI.LJ("new_draft_id", videoPublishEditModel.getNewDraftId());
        }
        if (str4 != null) {
            LJI.LJ("entrance", str4);
        }
        int i4 = videoPublishEditModel.creativeModel.imageEditModel.livePicCnt;
        if (i4 > 0) {
            LJI.LIZ(i4, "live_pic_cnt");
        }
        if (str5.length() != 0) {
            LJI.LJ("action_type", str5);
        }
        if (str6.length() > 0) {
            LJI.LJ("enter_way", str6);
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("effect_click", LJI.LIZ);
    }

    public static void LJIILLIIL(VideoPublishEditModel videoPublishEditModel, String str, String str2, int i, boolean z, boolean z2, String str3, Integer num, String str4, EffectModel effectModel, String str5, String str6, String str7, C1413460msy c1413460msy, boolean z3, EffectSearchModel effectSearchModel) {
        String str8;
        String str9;
        int i2;
        boolean z4;
        String str10;
        String str11 = str6;
        if (Intrinsics.LJFF(LIZLLL, videoPublishEditModel.getCreationId()) && Intrinsics.LJFF(LIZIZ, str2) && LIZJ.contains(str)) {
            return;
        }
        if (!Intrinsics.LJFF(LIZIZ, str2) || !Intrinsics.LJFF(LIZLLL, videoPublishEditModel.getCreationId())) {
            if (str2 != null) {
                LIZIZ = str2;
            }
            LIZLLL = videoPublishEditModel.getCreationId();
            LIZJ.clear();
        }
        LIZJ.add(str);
        String str12 = "";
        if (str2 == null) {
            str2 = "";
        }
        C0LAB c0labLJI = LJI(videoPublishEditModel);
        if (!z) {
            int iHashCode = str2.hashCode();
            if (iHashCode != -841614300) {
                if (iHashCode != 1169766991) {
                    if (iHashCode == 1903044452 && str2.equals("video_anim_out")) {
                        str2 = "animation_out";
                    }
                } else if (str2.equals("video_anim_in")) {
                    if (C1413470msz.LIZ()) {
                        str2 = "animation";
                    } else {
                        str2 = "animation_in";
                    }
                }
            } else if (str2.equals("video_anim_combo")) {
                str2 = "animation_combo";
            }
        }
        c0labLJI.LJ("tab_name", str2);
        int i3 = i + 1;
        c0labLJI.LIZ(i3, "index");
        c0labLJI.LIZ(z ? 1 : 0, "is_editor_pro");
        String str13 = "1";
        if (z3) {
            str8 = "1";
        } else {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJI.LJ("is_from_pip", str8);
        c0labLJI.LIZ(z2 ? 1 : 0, "is_multi_track");
        c0labLJI.LJ("from_location", str3);
        c0labLJI.LIZ(i3, "impr_position");
        if (c1413460msy == null || (str9 = c1413460msy.LJ) == null || str9.length() <= 0) {
            str9 = videoPublishEditModel.creativeModel.effectEntrancePosition;
        }
        c0labLJI.LJ("effect_entrance_position", str9);
        if (!C573570MeZ.LIZJ(videoPublishEditModel) && !C573570MeZ.LIZIZ(videoPublishEditModel)) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        c0labLJI.LIZ(i2, "is_pic_frame_single_pic_edit");
        if (C573570MeZ.LIZJ(videoPublishEditModel) || C573570MeZ.LIZIZ(videoPublishEditModel)) {
            c0labLJI.LIZ(1, "pic_cnt");
            c0labLJI.LJ("content_type", "multi_photo");
        }
        int i4 = videoPublishEditModel.creativeModel.imageEditModel.livePicCnt;
        if (i4 > 0) {
            c0labLJI.LIZ(i4, "live_pic_cnt");
        }
        if (num != null) {
            num.intValue();
            c0labLJI.LJ("effect_source", String.valueOf(num));
        }
        if (str11 == null) {
            str11 = "";
        }
        c0labLJI.LJ("effect_panel_model_recall_type", str11);
        if (str7 != null) {
            str12 = str7;
        }
        c0labLJI.LJ("effect_panel_model_recommend_tags", str12);
        if ((c1413460msy != null && (str10 = c1413460msy.LJFF) != null && str10.length() > 0) || (effectModel != null && C1403680mdC.LIZLLL(effectModel).length() > 0)) {
            z4 = true;
        } else {
            z4 = false;
            str13 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJI.LJ("is_edit_prop", str13);
        LIZ(z4, c0labLJI, effectModel, c1413460msy, str);
        c0labLJI.LJ("effect_designer_uid", str4);
        if (str5.length() > 0) {
            c0labLJI.LJ("enter_way", str5);
        }
        String str14 = videoPublishEditModel.creativeModel.initialModel.dmCameraModel.enterDM;
        if (str14 != null && str14.length() > 0) {
            c0labLJI.LJ("enter_dm", str14);
        }
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel);
        int iIntValue = pairLJIIJJI.getFirst().intValue();
        c0labLJI.LIZ(pairLJIIJJI.getSecond().intValue(), "pic_cnt");
        c0labLJI.LIZ(iIntValue, "video_cnt");
        if (c1413460msy != null) {
            c0labLJI.LJ("music_id", c1413460msy.LIZIZ);
            c0labLJI.LJ("meta_song_id", c1413460msy.LIZJ);
            c0labLJI.LIZ(c1413460msy.LIZLLL ? 1 : 0, "is_pgc");
            if (c1413460msy.LJI) {
                c0labLJI.LJ("mix_request_id", videoPublishEditModel.creativeModel.mixEditingModel.requestId);
            }
        }
        LIZIZ(videoPublishEditModel, c0labLJI);
        if (z) {
            c0labLJI.LJ("editorpro_click_from", videoPublishEditModel.getEditorProModel().getClickFrom());
        }
        if (effectSearchModel != null) {
            c0labLJI.LJ("search_id", effectSearchModel.getSearchId());
            c0labLJI.LJ("editing_effect_search_from", effectSearchModel.getSearchFrom());
            c0labLJI.LJ("search_keyword", effectSearchModel.getSearchKeyword());
            c0labLJI.LJ("search_result_id", effectSearchModel.getSearchResultId());
            c0labLJI.LJ("search_universal_rank", effectSearchModel.getSearchUniversalRank());
            c0labLJI.LJ("creator_search_info", effectSearchModel.getCreatorSearchInfo());
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("effect_show", c0labLJI.LIZ);
    }

    public static void LJIIZILJ(C1413450msx c1413450msx, VideoPublishEditModel videoPublishEditModel, String str, String str2, int i, boolean z, boolean z2, String str3, Integer num, String str4, EffectModel effectModel, String str5, String str6, String str7, C1413460msy c1413460msy, boolean z3, int i2) {
        boolean z4 = z3;
        String str8 = str7;
        String str9 = str6;
        String str10 = str5;
        EffectModel effectModel2 = effectModel;
        String str11 = str4;
        boolean z5 = z2;
        C1413460msy c1413460msy2 = c1413460msy;
        String str12 = str2;
        String str13 = str3;
        boolean z6 = z;
        Integer num2 = num;
        if ((i2 & 4) != 0) {
            str12 = null;
        }
        if ((i2 & 16) != 0) {
            z6 = false;
        }
        if ((i2 & 32) != 0) {
            z5 = false;
        }
        if ((i2 & 64) != 0) {
            str13 = "other";
        }
        if ((i2 & 128) != 0) {
            num2 = null;
        }
        if ((i2 & 256) != 0) {
            str11 = null;
        }
        if ((i2 & 512) != 0) {
            effectModel2 = null;
        }
        if ((i2 & 1024) != 0) {
            str10 = "";
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str9 = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str8 = null;
        }
        if ((i2 & 8192) != 0) {
            c1413460msy2 = null;
        }
        if ((i2 & 16384) != 0) {
            z4 = false;
        }
        c1413450msx.getClass();
        LJIILLIIL(videoPublishEditModel, str, str12, i, z6, z5, str13, num2, str11, effectModel2, str10, str9, str8, c1413460msy2, z4, null);
    }
}
