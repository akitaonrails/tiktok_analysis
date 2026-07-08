package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.playbook.TryItNowPlaybookChannel;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookStartResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPlaybookOuterUtilsTechSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPlaybookRevertSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14qm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20392214qm {
    public static DataChannel LIZ;

    public static String LIZ() {
        return C500260Jjc.LJJIL() ? "live_take" : "";
    }

    public static void LIZIZ(DataChannel dataChannel, JSONObject jSONObject) {
        boolean z;
        final long jLongValue;
        final long jLongValue2;
        long jLongValue3;
        final boolean z2;
        boolean z3;
        String str;
        if (!LinkMicPlaybookOuterUtilsTechSwitchSetting.INSTANCE.isEnable()) {
            return;
        }
        LIZ = dataChannel;
        if (jSONObject.optInt("panel_type", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        C0UTJ c0utjPl1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Pl1(dataChannel);
        if (c0utjPl1 != null) {
            c0utjPl1.LJJIIJ(z);
        }
        final String strOptString = jSONObject.optString("panel_entrance", "activity");
        final boolean zLJFF = Intrinsics.LJFF(jSONObject.optString("is_activity", "1"), "1");
        String str2 = "";
        final String strOptString2 = jSONObject.optString("from", "");
        final String strOptString3 = jSONObject.optString("business_type", "");
        Long lLJJLIL = C500260Jjc.LJJLIL(jSONObject.optString("playbook_id", CardStruct.IStatusCode.DEFAULT));
        if (lLJJLIL != null) {
            jLongValue = lLJJLIL.longValue();
        } else {
            jLongValue = 0;
        }
        Long lLJJLIL2 = C500260Jjc.LJJLIL(jSONObject.optString("playbook_content_id", CardStruct.IStatusCode.DEFAULT));
        if (lLJJLIL2 != null) {
            jLongValue2 = lLJJLIL2.longValue();
        } else {
            jLongValue2 = 0;
        }
        Long lLJJLIL3 = C500260Jjc.LJJLIL(jSONObject.optString("playbook_original_content_id", CardStruct.IStatusCode.DEFAULT));
        if (lLJJLIL3 != null) {
            jLongValue3 = lLJJLIL3.longValue();
        } else {
            jLongValue3 = 0;
        }
        if (jSONObject.optInt("is_show_playbook_detail", 1) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (jSONObject.optInt("is_start_playbook", 0) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int iOptInt = jSONObject.optInt("playbook_manage_panel_type", 1);
        int iOptInt2 = jSONObject.optInt("playbook_manage_first_level_tag_type", 1);
        String strOptString4 = jSONObject.optString("entity_uri");
        if (strOptString4 != null) {
            str2 = strOptString4;
        }
        Integer numLJJLIIJ = C500260Jjc.LJJLIIJ(jSONObject.optString("target_open"));
        if (numLJJLIIJ != null) {
            int iIntValue = numLJJLIIJ.intValue();
            if (iIntValue != 1) {
                if (iIntValue != 2) {
                    if (iIntValue != 3) {
                        if (iIntValue == 4) {
                            if (LinkMicPlaybookRevertSetting.INSTANCE.getValue()) {
                                C766270U4b.LIZLLL(2131855291);
                                return;
                            }
                            C0UTJ c0utjPl12 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Pl1(LIZ);
                            if (c0utjPl12 != null) {
                                c0utjPl12.LJJIIJZLJL(UriProtector.parse(str2));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (LinkMicPlaybookRevertSetting.INSTANCE.getValue()) {
                        C766270U4b.LIZLLL(2131855291);
                        return;
                    }
                    C0UTJ c0utjPl13 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Pl1(LIZ);
                    if (c0utjPl13 != null) {
                        c0utjPl13.LJIIIIZZ(new C915190ZvJ(strOptString2, zLJFF, 4), strOptString);
                        return;
                    }
                    return;
                }
                if (LinkMicPlaybookRevertSetting.INSTANCE.getValue()) {
                    C766270U4b.LIZLLL(2131855291);
                    return;
                }
                String strLIZ = C01EI.LIZ(55, "PlaybookOuterUtils");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("handleManagePanelPage, playbookManagePanelType=");
                sbLIZ.append(iOptInt);
                sbLIZ.append(", playbookManageFirstLevelTagType=");
                sbLIZ.append(iOptInt2);
                sbLIZ.append(", isActivity=");
                sbLIZ.append(zLJFF);
                sbLIZ.append(", activityFrom=");
                sbLIZ.append(strOptString2);
                C1AZW.LJFF(strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
                C0UTJ c0utjPl14 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Pl1(LIZ);
                if (c0utjPl14 != null) {
                    c0utjPl14.LJIIJJI(new C773350UVh(c0utjPl14, strOptString, strOptString2, zLJFF, iOptInt, iOptInt2));
                    return;
                }
                return;
            }
            if (jLongValue > 0 && jLongValue2 > 0) {
                if (LinkMicPlaybookRevertSetting.INSTANCE.getValue()) {
                    C766270U4b.LIZLLL(2131855291);
                    return;
                }
                C0UTJ c0utjPl15 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Pl1(LIZ);
                if (z3) {
                    DataChannel dataChannel2 = LIZ;
                    if (dataChannel2 != null) {
                        dataChannel2.zW(TryItNowPlaybookChannel.class, Boolean.TRUE);
                    }
                    C20389714qN c20389714qN = new C20389714qN(jLongValue, jLongValue2, jLongValue3);
                    if (c0utjPl15 != null) {
                        if (zLJFF) {
                            str = strOptString2;
                        } else {
                            str = strOptString;
                        }
                        c0utjPl15.LJJIII(new C20386714pt(null, c20389714qN, str, LIZ(), null, zLJFF, false, strOptString, null, new InterfaceC170900l9<C470590Icr<PlaybookStartResponse.ResponseData>>() { // from class: X.14qn
                            @Override // X.InterfaceC170900l9
                            public final void LIZ(C470590Icr<PlaybookStartResponse.ResponseData> c470590Icr) {
                                C766270U4b.LJIIIIZZ(3000L, C497740JfY.LJII(), C497740JfY.LJIJI(2131851335));
                                if (z2) {
                                    long j = jLongValue;
                                    long j2 = jLongValue2;
                                    C20392214qm.LIZJ(strOptString, strOptString3, strOptString2, zLJFF, j, j2);
                                }
                            }

                            @Override // X.InterfaceC170900l9
                            public final void onFailed(Throwable th) {
                                String message;
                                String strLIZ2 = C01EI.LIZ(55, "PlaybookOuterUtils");
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("start playbook fail, error_msg=");
                                if (th != null) {
                                    message = th.getMessage();
                                } else {
                                    message = null;
                                }
                                sbLIZ2.append(message);
                                C1AZW.LJFF(strLIZ2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                            }
                        }, 337));
                        return;
                    }
                    return;
                }
                if (z2) {
                    LIZJ(strOptString, strOptString3, strOptString2, zLJFF, jLongValue, jLongValue2);
                }
            }
        }
    }

    public static void LIZJ(String str, String str2, String str3, boolean z, long j, long j2) {
        C0UTJ c0utjPl1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Pl1(LIZ);
        C20382814pG c20382814pG = new C20382814pG(j, j2, false, false, false, null, null, null, false, 0, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str2, false, -536877060);
        if (c0utjPl1 != null) {
            boolean z2 = true;
            if (str.length() <= 0 || !z) {
                z2 = false;
            }
            c0utjPl1.LJJIFFI(c20382814pG, str3, new C915190ZvJ(str3, z, z2), EnumC20429314wl.INTERACT, true);
        }
    }
}
