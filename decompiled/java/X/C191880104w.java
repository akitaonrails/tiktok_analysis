package X;

import Y.AfS3S1001000_28;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.tiktok.tpsc.model.PopupExtra;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyPrompt;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecordV2;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.ss.android.ugc.tiktok.tpsc.privacy.account.effectcount.InteractionVideoCount;
import com.ss.android.ugc.tiktok.tpsc.privacy.account.effectcount.NoPAControlSettings;
import com.ss.android.ugc.tiktok.tpsc.privacy.account.effectcount.VideoCount;
import com.ss.android.ugc.tiktok.tpsc.privacy.account.restriction.RestrictionResponse;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.104w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191880104w {
    public static final C191880104w LIZ = new C191880104w();

    public static InteractionVideoCount LJIIIZ() {
        InteractionVideoCount interactionVideoCount;
        C191871104n.LIZ().getClass();
        if (C1888900zFo.LIZJ == null) {
            try {
                InterfaceC1519050pdH interfaceC1519050pdH = C1888900zFo.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("privacy_user_interaction_video_count_");
                InterfaceC1888940zFs interfaceC1888940zFsLIZJ = C191871104n.LIZJ();
                sbLIZ.append(interfaceC1888940zFsLIZJ != null ? interfaceC1888940zFsLIZJ.LIZLLL() : null);
                interactionVideoCount = (InteractionVideoCount) GsonProtectorUtils.fromJson(C1703730uR9.LIZ(), interfaceC1519050pdH.getString(C2188811AlT.LIZIZ(sbLIZ)), InteractionVideoCount.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                interactionVideoCount = null;
            }
            C1888900zFo.LIZJ = interactionVideoCount;
        }
        InteractionVideoCount interactionVideoCount2 = C1888900zFo.LIZJ;
        if (interactionVideoCount2 == null) {
            return null;
        }
        VideoCount videoCount = interactionVideoCount2.comment;
        VideoCount videoCount2 = videoCount != null ? new VideoCount(videoCount.onCount, videoCount.offCount) : null;
        VideoCount videoCount3 = interactionVideoCount2.duet;
        VideoCount videoCount4 = videoCount3 != null ? new VideoCount(videoCount3.onCount, videoCount3.offCount) : null;
        VideoCount videoCount5 = interactionVideoCount2.stitch;
        VideoCount videoCount6 = videoCount5 != null ? new VideoCount(videoCount5.onCount, videoCount5.offCount) : null;
        VideoCount videoCount7 = interactionVideoCount2.contentReusePermission;
        return new InteractionVideoCount(videoCount2, videoCount4, videoCount6, videoCount7 != null ? new VideoCount(videoCount7.onCount, videoCount7.offCount) : null);
    }

    public static NoPAControlSettings LJIIJ() {
        C191871104n.LIZ().getClass();
        NoPAControlSettings noPAControlSettingsLIZ = C1888900zFo.LIZ();
        if (noPAControlSettingsLIZ != null) {
            return new NoPAControlSettings(noPAControlSettingsLIZ.download, noPAControlSettingsLIZ.duet, noPAControlSettingsLIZ.stitch, noPAControlSettingsLIZ.contentReusePermission);
        }
        return null;
    }

    public static PrivacyUserSettingsV2 LJIIL() {
        C191871104n.LJ().getClass();
        return C191859104b.LIZJ();
    }

    public static C11ON LIZ(Map map) {
        C191871104n.LJ().getClass();
        return C191862104e.LIZ(map);
    }

    public static PrivacySettingsAgreementRecord LJI(String str) {
        Map<String, PrivacySettingsAgreementRecord> postRecord;
        Map<String, PrivacySettingsAgreementRecord> popupAgreement;
        PrivacySettingsAgreementRecord privacySettingsAgreementRecord;
        Object c098200Yq;
        Object obj = null;
        if (C1207604ny.LIZ()) {
            C191871104n.LIZLLL().getClass();
            C1888910zFp.LIZ.getClass();
            PrivacyPrompt privacyPrompt = (PrivacyPrompt) C1888910zFp.LIZ().get(str);
            if (privacyPrompt == null) {
                return null;
            }
            try {
                c098200Yq = (PopupExtra) C1703730uR9.LIZ().LJII(privacyPrompt.props, PopupExtra.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            return new PrivacySettingsAgreementRecord(privacyPrompt.status, (PopupExtra) obj);
        }
        C191871104n.LIZIZ().getClass();
        RestrictionResponse restrictionResponseLIZ = C191874104q.LIZ();
        if (restrictionResponseLIZ != null && (popupAgreement = restrictionResponseLIZ.getPopupAgreement()) != null && (privacySettingsAgreementRecord = popupAgreement.get(str)) != null) {
            return privacySettingsAgreementRecord;
        }
        RestrictionResponse restrictionResponseLIZ2 = C191874104q.LIZ();
        if (restrictionResponseLIZ2 == null || (postRecord = restrictionResponseLIZ2.getPostRecord()) == null) {
            return null;
        }
        return postRecord.get(str);
    }

    public static PrivacySettingsAgreementRecordV2 LJII(String str) {
        Map<String, PrivacySettingsAgreementRecordV2> popupAgreementV2;
        if (C1207604ny.LIZ()) {
            C191871104n.LIZLLL().getClass();
            C1888910zFp.LIZ.getClass();
            PrivacyPrompt privacyPrompt = (PrivacyPrompt) C1888910zFp.LIZ().get(str);
            if (privacyPrompt == null) {
                return null;
            }
            C13DA c13da = new C13DA();
            c13da.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(privacyPrompt.status));
            try {
                C189200o6.m2constructorimpl((Integer) c13da.put("type", Integer.valueOf(JSONObjectProtectorUtils.getInt(new JSONObject(privacyPrompt.props), "type"))));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(c13da.build());
            String str2 = privacyPrompt.props;
            return new PrivacySettingsAgreementRecordV2(linkedHashMap, str2, str2);
        }
        C191871104n.LIZIZ().getClass();
        RestrictionResponse restrictionResponseLIZ = C191874104q.LIZ();
        if (restrictionResponseLIZ == null || (popupAgreementV2 = restrictionResponseLIZ.getPopupAgreementV2()) == null) {
            return null;
        }
        return popupAgreementV2.get(str);
    }

    public static boolean LJIILIIL(String str) {
        PrivacySettingsAgreementRecord privacySettingsAgreementRecordLJI = LJI(str);
        if (privacySettingsAgreementRecordLJI != null && privacySettingsAgreementRecordLJI.status == 1) {
            return true;
        }
        return false;
    }

    public static void LJIIZILJ(String str) {
        Map<String, PrivacySettingsAgreementRecordV2> popupAgreementV2;
        PrivacySettingsAgreementRecordV2 privacySettingsAgreementRecordV2;
        Object c098200Yq;
        if (C1207604ny.LIZ()) {
            C191871104n.LIZLLL().getClass();
            C1888910zFp.LIZ.getClass();
            PrivacyPrompt privacyPrompt = (PrivacyPrompt) C1888910zFp.LIZ().get(str);
            if (privacyPrompt != null) {
                boolean z = true;
                boolean z2 = false;
                if (Intrinsics.LJFF(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)) {
                    if (privacyPrompt.status != 2) {
                        privacyPrompt.status = 2;
                    } else {
                        return;
                    }
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(privacyPrompt.props);
                        if (jSONObject.has(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS) && jSONObject.optInt(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS) == 2) {
                            z = false;
                        } else {
                            privacyPrompt.props = C786410Ut5.J3(jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 2));
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z;
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                        z = z2;
                    }
                    C189200o6.m1boximpl(c098200Yq);
                    if (!z) {
                        return;
                    }
                }
                C1888910zFp.LIZ.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap(C1888910zFp.LIZ());
                linkedHashMap.put(str, privacyPrompt);
                C1888910zFp.LIZJ(linkedHashMap);
                return;
            }
            return;
        }
        C191871104n.LIZIZ().getClass();
        RestrictionResponse restrictionResponseLIZ = C191874104q.LIZ();
        RestrictionResponse restrictionResponseCopy = null;
        if (restrictionResponseLIZ == null || (popupAgreementV2 = restrictionResponseLIZ.getPopupAgreementV2()) == null || (privacySettingsAgreementRecordV2 = popupAgreementV2.get(str)) == null) {
            return;
        }
        PrivacySettingsAgreementRecordV2 privacySettingsAgreementRecordV22 = new PrivacySettingsAgreementRecordV2(new HashMap(privacySettingsAgreementRecordV2.propsInt), privacySettingsAgreementRecordV2.extra, privacySettingsAgreementRecordV2.props);
        privacySettingsAgreementRecordV22.propsInt.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 2);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(popupAgreementV2);
        linkedHashMap2.put(str, privacySettingsAgreementRecordV22);
        RestrictionResponse restrictionResponseLIZ2 = C191874104q.LIZ();
        if (restrictionResponseLIZ2 != null) {
            restrictionResponseCopy = restrictionResponseLIZ2.copy(restrictionResponseLIZ2.privacySettingsRestriction, restrictionResponseLIZ2.popupAgreement, linkedHashMap2, restrictionResponseLIZ2.postRecord, restrictionResponseLIZ2.logReportEnable);
        }
        C191874104q.LJ(restrictionResponseCopy);
    }

    public static void LIZIZ(String str, Function0 function0) {
        if (C1207604ny.LIZ()) {
            C191870104m c191870104mLIZLLL = C191871104n.LIZLLL();
            EnumC191875104r enumC191875104r = EnumC191875104r.RESTRICTION;
            c191870104mLIZLLL.getClass();
            C191870104m.LIZIZ(enumC191875104r, str, false, function0);
            return;
        }
        C191871104n.LIZIZ().getClass();
        C191879104v.LIZ(str, function0);
    }

    public static void LJFF(C191880104w c191880104w, String str) {
        c191880104w.getClass();
        C191870104m c191870104mLIZLLL = C191871104n.LIZLLL();
        EnumC191875104r enumC191875104r = EnumC191875104r.ALL;
        c191870104mLIZLLL.getClass();
        C191870104m.LIZIZ(enumC191875104r, str, false, null);
    }

    public static Integer LJIIIIZZ(String str, String str2) {
        PrivacySettingsAgreementRecordV2 privacySettingsAgreementRecordV2LJII = LJII(str);
        if (privacySettingsAgreementRecordV2LJII != null) {
            return privacySettingsAgreementRecordV2LJII.propsInt.get(str2);
        }
        return null;
    }

    public static PrivacySettingsRestrictionItem LJIIJJI(int i, String str) {
        C191871104n.LIZIZ().getClass();
        return C191879104v.LIZIZ(i, str);
    }

    public static void LJIILL(int i, String str) {
        if (C1207604ny.LIZ()) {
            C191871104n.LIZLLL().getClass();
            C1888910zFp.LIZ.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C1888910zFp.LIZ());
            linkedHashMap.put(str, new PrivacyPrompt(i, "{}"));
            C1888910zFp.LIZJ(linkedHashMap);
            return;
        }
        C191871104n.LIZIZ().getClass();
        C191874104q.LIZLLL(i, str);
    }

    public static void LJIJ(int i, String str) {
        C191879104v c191879104vLIZIZ = C191871104n.LIZIZ();
        Integer numValueOf = Integer.valueOf(i);
        c191879104vLIZIZ.getClass();
        C191879104v.LIZJ(numValueOf, str);
        LJIILL(i, str);
    }

    public static void LIZLLL(String str, Function0 function0, boolean z) {
        boolean zLJI = MethodIDManager.LJI(137313);
        if (C1207604ny.LIZ()) {
            C191870104m c191870104mLIZLLL = C191871104n.LIZLLL();
            EnumC191875104r enumC191875104r = EnumC191875104r.SETTING;
            if (str == null) {
                str = "";
            }
            c191870104mLIZLLL.getClass();
            C191870104m.LIZIZ(enumC191875104r, str, z, function0);
        } else {
            C191871104n.LJ().getClass();
            C191862104e.LIZIZ(str, function0, z);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static C11JN LJIILJJIL(int i, String str, Map map) {
        C191871104n.LIZIZ().getClass();
        return C191882104y.LIZ(i, str, map).LJJIJIIJIL(new AfS3S1001000_28(str, i, 0)).LJJIJIIJIL(new AfS3S1001000_28(str, i, 3));
    }

    public static C11O8 LJIILLIIL(C191880104w c191880104w, String str, int i) {
        Map mapLJ = C2097608Jq.LJ();
        c191880104w.getClass();
        C191871104n.LIZIZ().getClass();
        return C191882104y.LIZ(i, str, mapLJ);
    }

    public static C11J7 LJIJI(int i, int i2, String str) {
        C191871104n.LJ().getClass();
        return C191862104e.LJ(i, i2, str);
    }
}
