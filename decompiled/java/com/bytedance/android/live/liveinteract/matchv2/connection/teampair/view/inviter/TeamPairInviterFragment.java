package com.bytedance.android.live.liveinteract.matchv2.connection.teampair.view.inviter;

import X.C1397510mTF;
import X.C16FS;
import X.C915980Zwa;
import X.C954460awe;
import X.C962900bAG;
import X.C977590bXx;
import X.C977630bY1;
import X.C978340bZA;
import X.EnumC959580b4u;
import com.bytedance.android.live.liveinteract.match.business.event.BattleIsInTeamPairing;
import com.bytedance.android.live.liveinteract.matchv2.connection.teampair.view.AbsTeamPairFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class TeamPairInviterFragment extends AbsTeamPairFragment<C954460awe> {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyIyPCYkP319KyoiJyHELIOSowPCwjJ2EnLSQhOS46Oms6ICokZiwiPyYnLTdiHSoyJRUtID0aJjMlPSohDjctLiI2JjE=";
    public C977590bXx LLLF;
    public boolean LLLFF;
    public C977630bY1 LLLI;
    public C16FS LLLIIII;
    public C1397510mTF LLLIIIIL;
    public Function0<Unit> LLLFFI = AFwS203S0000000_15.get$arr$(44);
    public Function0<Unit> LLLFZ = AFwS203S0000000_15.get$arr$(45);
    public List<C954460awe> LLLII = new ArrayList();

    public TeamPairInviterFragment() {
        new ArrayList();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C978340bZA.LIZLLL();
    }

    public final void wS(EnumC959580b4u enumC959580b4u) {
        this.LLLFZ.invoke();
        if (this.LLLF != null) {
            C915980Zwa.LJIIIZ().LIZ(enumC959580b4u, null);
        }
        C977590bXx c977590bXx = this.LLLF;
        if (c977590bXx != null) {
            c977590bXx.LJI();
        }
        DataChannel dataChannel = this.LLL;
        if (dataChannel != null) {
            dataChannel.zW(BattleIsInTeamPairing.class, new C962900bAG(false, false, 4));
        }
        close(1);
    }

    @Override // com.bytedance.android.live.liveinteract.matchv2.connection.teampair.view.AbsTeamPairFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        super.x1(i);
        C1397510mTF c1397510mTF = this.LLLIIIIL;
        if (c1397510mTF != null) {
            c1397510mTF.LIZIZ(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    @Override // com.bytedance.android.live.liveinteract.matchv2.connection.teampair.view.AbsTeamPairFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r30, android.os.Bundle r31) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.matchv2.connection.teampair.view.inviter.TeamPairInviterFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
