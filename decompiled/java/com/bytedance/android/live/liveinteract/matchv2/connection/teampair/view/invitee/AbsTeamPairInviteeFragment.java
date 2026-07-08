package com.bytedance.android.live.liveinteract.matchv2.connection.teampair.view.invitee;

import X.C13LP;
import X.C16FS;
import X.C20441214yg;
import X.C20743416Fc;
import X.C20744116Fj;
import X.C2188811AlT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C973070bQf;
import X.C986950bn3;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.liveinteract.matchv2.connection.teampair.view.AbsTeamPairFragment;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleUserInfoWrapper;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.match.LeagueScoreInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public abstract class AbsTeamPairInviteeFragment extends AbsTeamPairFragment<BattleUserInfoWrapper> {
    public LinkMicBattleMessage LLLF;
    public final List<BattleUserInfoWrapper> LLLFF = new ArrayList();
    public final List<BattleUserInfoWrapper> LLLFFI = new ArrayList();
    public final Map<Long, Boolean> LLLFZ = new LinkedHashMap();
    public boolean LLLI;
    public C20744116Fj LLLII;
    public LinearLayout LLLIIII;
    public C16FS LLLIIIIL;
    public C16FS LLLIIIL;
    public C16FS LLLIIL;

    public final void wS(boolean z) {
        if (z) {
            C500260Jjc.LLFFF(this.LLLIIL);
            LinearLayout linearLayout = this.LLLIIII;
            if (linearLayout != null) {
                C500260Jjc.LJIILIIL(linearLayout);
            }
        } else {
            C500260Jjc.LJIILIIL(this.LLLIIL);
            LinearLayout linearLayout2 = this.LLLIIII;
            if (linearLayout2 != null) {
                C500260Jjc.LLFFF(linearLayout2);
            }
        }
        this.LLJJL = z;
        this.LLJJJJLIIL = z;
        boolean z2 = !z;
        C20744116Fj c20744116Fj = this.LLLII;
        if (c20744116Fj != null) {
            c20744116Fj.setEnabled(z2);
        }
    }

    public void yS(boolean z) {
        C20744116Fj c20744116Fj;
        View view = getView();
        if (view != null) {
            c20744116Fj = (C20744116Fj) view.findViewById(R.id.xwb);
        } else {
            c20744116Fj = null;
        }
        this.LLLII = c20744116Fj;
        if (c20744116Fj != null) {
            C500260Jjc.LLFFF(c20744116Fj);
        }
        C20744116Fj c20744116Fj2 = this.LLLII;
        if (c20744116Fj2 != null) {
            c20744116Fj2.setChecked(z);
        }
        C20744116Fj c20744116Fj3 = this.LLLII;
        if (c20744116Fj3 != null) {
            C786410Ut5.z7(c20744116Fj3, new C986950bn3(this, 2));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.matchv2.connection.teampair.view.AbsTeamPairFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        LinearLayout linearLayout;
        C16FS c16fs;
        C16FS c16fs2;
        boolean zBooleanValue;
        Map<Long, GiftGalleryBadgeInfo> map;
        Map<Long, LeagueScoreInfo> map2;
        List<BattleUserInfoWrapper> list;
        List<TeamUsersInfo> list2;
        super.onViewCreated(view, bundle);
        String strLJIJI = C497740JfY.LJIJI(2131856748);
        C20743416Fc c20743416Fc = this.LLJZ;
        if (c20743416Fc != null) {
            c20743416Fc.setText(strLJIJI);
        }
        String strLJIJI2 = C497740JfY.LJIJI(2131856750);
        C20743416Fc c20743416Fc2 = this.LLJZIJLIL;
        if (c20743416Fc2 != null) {
            C500260Jjc.LLFFF(c20743416Fc2);
        }
        C20743416Fc c20743416Fc3 = this.LLJZIJLIL;
        if (c20743416Fc3 != null) {
            c20743416Fc3.setText(strLJIJI2);
        }
        yS(this.LLLI);
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        Iterable arrayList = new ArrayList();
        Iterable arrayList2 = new ArrayList();
        LinkMicBattleMessage linkMicBattleMessage = this.LLLF;
        if (linkMicBattleMessage != null && (list2 = linkMicBattleMessage.teamUsers) != null) {
            for (TeamUsersInfo teamUsersInfo : list2) {
                if (teamUsersInfo.userIds.contains(Long.valueOf(currentUserId))) {
                    arrayList = teamUsersInfo.userIds;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("selfTeamIds, ");
                    sbLIZ.append(arrayList);
                    C20441214yg.LIZIZ("AbsTeamPairInviteeFragment", C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    arrayList2 = teamUsersInfo.userIds;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("rivalTeamIds, ");
                    sbLIZ2.append(arrayList2);
                    C20441214yg.LIZIZ("AbsTeamPairInviteeFragment", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
        LinkMicBattleMessage linkMicBattleMessage2 = this.LLLF;
        if (linkMicBattleMessage2 != null && (list = linkMicBattleMessage2.anchorInfo) != null) {
            for (BattleUserInfoWrapper battleUserInfoWrapper : list) {
                if (C13LP.LJJJJ(battleUserInfoWrapper.userId, arrayList)) {
                    List<BattleUserInfoWrapper> list3 = this.LLLFF;
                    if (list3 != null) {
                        ((ArrayList) list3).add(battleUserInfoWrapper);
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("selfTeamUserInfos, ");
                    sbLIZ3.append(this.LLLFF);
                    C20441214yg.LIZIZ("AbsTeamPairInviteeFragment", C2188811AlT.LIZIZ(sbLIZ3));
                }
                if (C13LP.LJJJJ(battleUserInfoWrapper.userId, arrayList2)) {
                    List<BattleUserInfoWrapper> list4 = this.LLLFFI;
                    if (list4 != null) {
                        ((ArrayList) list4).add(battleUserInfoWrapper);
                    }
                    Long l = battleUserInfoWrapper.userId;
                    if (l != null) {
                        this.LLLFZ.put(Long.valueOf(l.longValue()), Boolean.TRUE);
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("rivalTeamUserInfos, ");
                    sbLIZ4.append(this.LLLFFI);
                    C20441214yg.LIZIZ("AbsTeamPairInviteeFragment", C2188811AlT.LIZIZ(sbLIZ4));
                }
            }
        }
        C973070bQf c973070bQf = this.LLJLLL;
        C16FS c16fs3 = null;
        if (c973070bQf != null) {
            List<BattleUserInfoWrapper> list5 = this.LLLFF;
            List<BattleUserInfoWrapper> list6 = this.LLLFFI;
            Map<Long, Boolean> map3 = this.LLLFZ;
            LinkMicBattleMessage linkMicBattleMessage3 = this.LLLF;
            if (linkMicBattleMessage3 != null) {
                map = linkMicBattleMessage3.leagueInfoMap;
                map2 = linkMicBattleMessage3.leagueScoreInfoMap;
            } else {
                map = null;
                map2 = null;
            }
            c973070bQf.l0(list5, list6, map, map2, map3);
        }
        View view2 = getView();
        if (view2 != null) {
            linearLayout = (LinearLayout) view2.findViewById(R.id.cqv);
        } else {
            linearLayout = null;
        }
        this.LLLIIII = linearLayout;
        View view3 = getView();
        if (view3 != null) {
            c16fs = (C16FS) view3.findViewById(R.id.fhf);
        } else {
            c16fs = null;
        }
        this.LLLIIIIL = c16fs;
        View view4 = getView();
        if (view4 != null) {
            c16fs2 = (C16FS) view4.findViewById(R.id.z_);
        } else {
            c16fs2 = null;
        }
        this.LLLIIIL = c16fs2;
        View view5 = getView();
        if (view5 != null) {
            c16fs3 = (C16FS) view5.findViewById(R.id.za);
        }
        this.LLLIIL = c16fs3;
        Boolean bool = (Boolean) ((LinkedHashMap) this.LLLFZ).get(Long.valueOf(UserService.getInstance().user().getCurrentUserId()));
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        wS(zBooleanValue);
        rS(false);
    }
}
