package X;

import Y.ARunnableS81S0200000_12;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragment;
import com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragmentSheet;
import com.bytedance.android.livesdk.broadcast.voicechat.layer.VoiceChatWidget;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.impl.revenue.starcomment.manage.AnchorStarCommentManageDialog;
import com.bytedance.android.livesdk.message.proto.StarCommentConfig;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Usm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786220Usm implements InterfaceC1141530foN {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        switch (this.$t) {
            case 0:
                mh2$0(this, c262100zr);
                break;
            case 1:
                mh2$1(this, c262100zr);
                break;
            case 2:
                mh2$2(this, c262100zr);
                break;
            case 3:
                mh2$3(this, c262100zr);
                break;
            case 4:
                mh2$4(this, c262100zr);
                break;
            case 5:
                mh2$5(this, c262100zr);
                break;
            case 6:
                mh2$6(this, c262100zr);
                break;
        }
    }

    public C786220Usm(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void mh2$0(C786220Usm c786220Usm, C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        if (Intrinsics.LJFF(c262100zr.LIZ, "star_comment_setting_event") && (interfaceC1107590evd = c262100zr.LIZIZ) != null) {
            LiveCommentSettingFragment liveCommentSettingFragment = (LiveCommentSettingFragment) c786220Usm.l0;
            try {
                StarCommentConfig starCommentConfig = new StarCommentConfig();
                starCommentConfig.starCommentSwitch = interfaceC1107590evd.getBoolean("star_comment_switch");
                starCommentConfig.grantGroup = interfaceC1107590evd.getInt("grant_group");
                starCommentConfig.grantLevel = interfaceC1107590evd.getInt("grant_level");
                starCommentConfig.starCommentQualification = true;
                if (Intrinsics.LJFF(liveCommentSettingFragment.LL, "from_page_preview")) {
                    DataChannel dataChannelLJ = C475510Ikn.LJ(liveCommentSettingFragment);
                    if (dataChannelLJ != null) {
                        dataChannelLJ.SX0(C752120Tes.class, starCommentConfig);
                        return;
                    }
                    return;
                }
                Room roomRR = liveCommentSettingFragment.RR();
                if (roomRR != null) {
                    roomRR.starCommentConfig = starCommentConfig;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static final void mh2$1(C786220Usm c786220Usm, C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        if (Intrinsics.LJFF(c262100zr.LIZ, "star_comment_setting_event") && (interfaceC1107590evd = c262100zr.LIZIZ) != null) {
            LiveCommentSettingFragmentSheet liveCommentSettingFragmentSheet = (LiveCommentSettingFragmentSheet) c786220Usm.l0;
            try {
                StarCommentConfig starCommentConfig = new StarCommentConfig();
                starCommentConfig.starCommentSwitch = interfaceC1107590evd.getBoolean("star_comment_switch");
                starCommentConfig.grantGroup = interfaceC1107590evd.getInt("grant_group");
                starCommentConfig.grantLevel = interfaceC1107590evd.getInt("grant_level");
                starCommentConfig.starCommentQualification = true;
                if (Intrinsics.LJFF(liveCommentSettingFragmentSheet.LLLLII, "from_page_preview")) {
                    DataChannel dataChannelLJ = C475510Ikn.LJ(liveCommentSettingFragmentSheet);
                    if (dataChannelLJ != null) {
                        dataChannelLJ.SX0(C752120Tes.class, starCommentConfig);
                        return;
                    }
                    return;
                }
                Room roomYS = liveCommentSettingFragmentSheet.yS();
                if (roomYS != null) {
                    roomYS.starCommentConfig = starCommentConfig;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static final void mh2$2(C786220Usm c786220Usm, C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        Room room;
        if (Intrinsics.LJFF(c262100zr.LIZ, "star_comment_setting_event") && (interfaceC1107590evd = c262100zr.LIZIZ) != null) {
            AnchorStarCommentManageDialog anchorStarCommentManageDialog = (AnchorStarCommentManageDialog) c786220Usm.l0;
            try {
                StarCommentConfig starCommentConfig = new StarCommentConfig();
                starCommentConfig.starCommentSwitch = interfaceC1107590evd.getBoolean("star_comment_switch");
                starCommentConfig.grantGroup = interfaceC1107590evd.getInt("grant_group");
                starCommentConfig.grantLevel = interfaceC1107590evd.getInt("grant_level");
                starCommentConfig.starCommentQualification = true;
                DataChannel dataChannel = anchorStarCommentManageDialog.dataChannel;
                if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
                    room.starCommentConfig = starCommentConfig;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static final void mh2$3(C786220Usm c786220Usm, C262100zr c262100zr) {
        String string;
        LiveEffect liveEffect;
        String strLLILII;
        String strLLILII2;
        if (Intrinsics.LJFF(c262100zr.LIZ, "ttlive_report_effect_preview")) {
            LiveEffect liveEffect2 = (LiveEffect) C13LP.LJJJLL(C768460UCm.LIZIZ().qr(C0UD4.LIZIZ));
            if (liveEffect2 != null) {
                ((C0UAC) c786220Usm.l0).LIZIZ = liveEffect2;
            }
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                string = interfaceC1107590evd.getString("action");
            } else {
                string = null;
            }
            if (TextUtils.equals(string, "hide")) {
                LiveEffect liveEffect3 = ((C0UAC) c786220Usm.l0).LIZIZ;
                if (liveEffect3 != null && (strLLILII2 = liveEffect3.LLILII()) != null && C781270Ukn.LJI().getLiveEffectRemoveList() != null) {
                    Set<String> set = C767780U9w.LIZIZ;
                    set.add(strLLILII2);
                    C20337914i1<Set<String>> c20337914i1 = InterfaceC766480U4w.LJJJJ;
                    c20337914i1.LJFF(set);
                    c20337914i1.LIZJ();
                }
                if (C781270Ukn.LJI().getLiveEffectRemoveList() != null) {
                    C767780U9w.LIZ(((C0UAC) c786220Usm.l0).LIZIZ);
                    return;
                }
                return;
            }
            if (!TextUtils.equals(string, "unhide")) {
                return;
            }
            LiveEffect liveEffect4 = ((C0UAC) c786220Usm.l0).LIZIZ;
            if (liveEffect4 != null && (strLLILII = liveEffect4.LLILII()) != null && C781270Ukn.LJI().getLiveEffectRemoveList() != null) {
                Set<String> set2 = C767780U9w.LIZIZ;
                set2.remove(strLLILII);
                C20337914i1<Set<String>> c20337914i12 = InterfaceC766480U4w.LJJJJ;
                c20337914i12.LJFF(set2);
                c20337914i12.LIZJ();
            }
            if (C781270Ukn.LJI().getLiveEffectRemoveList() == null || (liveEffect = ((C0UAC) c786220Usm.l0).LIZIZ) == null) {
                return;
            }
            String resourceId = liveEffect.getResourceId();
            if (resourceId != null) {
                Set<String> set3 = C767780U9w.LIZIZ;
                set3.remove(resourceId);
                C20337914i1<Set<String>> c20337914i13 = InterfaceC766480U4w.LJJJJ;
                c20337914i13.LJFF(set3);
                c20337914i13.LIZJ();
            }
            Iterator<C0UA7> it2 = C767780U9w.LIZJ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ(liveEffect);
            }
        }
    }

    public static final void mh2$4(C786220Usm c786220Usm, C262100zr c262100zr) {
        View view;
        C14ZZ c14zz = (C14ZZ) c786220Usm.l0;
        C20286814Zm c20286814Zm = c14zz.LLJJIJI;
        if (c20286814Zm != null && (view = c20286814Zm.LJJIJIIJI) != null) {
            if (!c14zz.LLJJL) {
                c14zz.LLJJL = true;
                view.animate().translationYBy(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))).alpha(0.0f).setDuration(150L).withEndAction(new ARunnableS81S0200000_12(view, c14zz, 108)).start();
                c14zz.LLJJJIL = true;
                return;
            }
            return;
        }
        c14zz.getClass();
    }

    public static final void mh2$5(C786220Usm c786220Usm, C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        ((VoiceChatWidget) c786220Usm.l0).getClass();
        if (Intrinsics.LJFF(c262100zr.LIZ, "live_goal_update_event") && (interfaceC1107590evd = c262100zr.LIZIZ) != null) {
            C0U6C liveGoalEffectHelper = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper();
            if (interfaceC1107590evd.hasKey("isQuit") && interfaceC1107590evd.getBoolean("isQuit")) {
                ((C0UFI) liveGoalEffectHelper).LJIILLIIL();
                return;
            }
            if (interfaceC1107590evd.hasKey("live_goal_background_position") && interfaceC1107590evd.getInt("live_goal_background_position") == 0) {
                ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGameEffectHelper().getClass();
                if (C769040UEs.LIZLLL) {
                    C769040UEs.LIZJ = null;
                }
                ((C0UFI) liveGoalEffectHelper).LJIIJJI();
            } else {
                C0UFI.LJJIFFI();
                C0UFI.LJJI();
            }
            liveGoalEffectHelper.getClass();
            C0UFI.LJ = null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void mh2$6(C786220Usm c786220Usm, C262100zr c262100zr) {
        String strLJFF;
        String strLJFF2;
        String str = c262100zr.LIZ;
        switch (str.hashCode()) {
            case -1891834119:
                if (str.equals("anchor_set_customize_superfan_sticker")) {
                    ((C771520UOg) c786220Usm.l0).getClass();
                    InterfaceC1106030et7.Y8.LIZJ(Boolean.TRUE);
                }
                break;
            case -655806071:
                if (str.equals("anchor_set_customize_fan_club_badge")) {
                    ((C771520UOg) c786220Usm.l0).getClass();
                    InterfaceC1106030et7.W8.LIZJ(Boolean.TRUE);
                }
                break;
            case -413287005:
                if (str.equals("anchor_set_customize_fan_club_sticker")) {
                    ((C771520UOg) c786220Usm.l0).getClass();
                    InterfaceC1106030et7.X8.LIZJ(Boolean.TRUE);
                }
                break;
            case 550701530:
                if (str.equals("fan_club_guide_containerzation_frequency_maximum")) {
                    InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                    String str2 = "";
                    if (interfaceC1107590evd == null || (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "guidance_type", "")) == null) {
                        strLJFF = "";
                    }
                    InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd2 != null && (strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd2, "guidance_key", "")) != null) {
                        str2 = strLJFF2;
                    }
                    if (Intrinsics.LJFF(strLJFF, "fan_club_entrance") && str2.length() > 0) {
                        ((C771520UOg) c786220Usm.l0).getClass();
                        ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).RV0(str2);
                        break;
                    }
                }
                break;
        }
    }
}
