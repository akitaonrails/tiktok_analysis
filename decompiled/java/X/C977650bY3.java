package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.matchv2.connection.teampair.view.inviter.TeamPairInviterFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0bY3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C977650bY3 {
    public static final LinkDialog LJ(LifecycleOwner lifecycleOwner, C977800bYI c977800bYI) {
        LinkDialog linkDialog = new LinkDialog(lifecycleOwner);
        EnumC977660bY4 enumC977660bY4 = EnumC977660bY4.MULTI_LIVE_ANCHOR_SETTING_FRAGMENT;
        C934880aR4 c934880aR4 = new C934880aR4();
        c934880aR4.LIZIZ = c977800bYI.LIZ;
        c934880aR4.LIZJ = c977800bYI.LIZJ;
        c934880aR4.LIZLLL = c977800bYI.LIZLLL;
        c934880aR4.LJ = c977800bYI.LJ;
        c934880aR4.LJFF = c977800bYI.LJFF;
        c934880aR4.LJI = c977800bYI.LJI;
        c934880aR4.LJII = c977800bYI.LJII;
        c934880aR4.LJIIIIZZ = c977800bYI.LIZIZ;
        c934880aR4.LJIIIZ = c977800bYI.LJIIIIZZ;
        linkDialog.LLILZIL = enumC977660bY4;
        linkDialog.LLILZLL = c934880aR4;
        return linkDialog;
    }

    public static final LinkDialog LIZ(LifecycleOwner lifecycleOwner, boolean z, boolean z2, DataChannel dataChannel, Function0 function0) {
        LinkDialog linkDialog = new LinkDialog(lifecycleOwner);
        EnumC977660bY4 enumC977660bY4 = EnumC977660bY4.MATCH_OPTION_SETTING;
        C977780bYG c977780bYG = new C977780bYG();
        c977780bYG.LIZIZ = z;
        c977780bYG.LIZJ = z2;
        c977780bYG.LIZLLL = false;
        c977780bYG.LJ = dataChannel;
        c977780bYG.LJFF = function0;
        c977780bYG.LJI = true;
        linkDialog.LLILZIL = enumC977660bY4;
        linkDialog.LLILZLL = c977780bYG;
        return linkDialog;
    }

    public static final long LJFF(C977630bY1 c977630bY1, C977590bXx c977590bXx, DataChannel dataChannel, Function0 function0, Function0 function02, boolean z) {
        FragmentManager fragmentManager;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            Fragment fragmentLJJJJZI = fragmentManager.LJJJJZI("TeamPairInviterFragment");
            if ((fragmentLJJJJZI instanceof TeamPairInviterFragment) && !fragmentLJJJJZI.isVisible() && !fragmentLJJJJZI.isAdded()) {
                return C19322110iZ.LIZLLL(fragmentManager, TeamPairInviterFragment.class, "match_team_pair_inviter_dialog", null, null);
            }
            TeamPairInviterFragment teamPairInviterFragment = new TeamPairInviterFragment();
            teamPairInviterFragment.LLL = dataChannel;
            teamPairInviterFragment.LLLF = c977590bXx;
            teamPairInviterFragment.LLLFFI = function0;
            teamPairInviterFragment.LLLFF = z;
            teamPairInviterFragment.LLLFZ = function02;
            teamPairInviterFragment.LLLI = c977630bY1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("newInstance, viewmodel");
            sbLIZ.append(teamPairInviterFragment.LLLF);
            C20441214yg.LIZIZ("TeamPairInviterFragment", C2188811AlT.LIZIZ(sbLIZ));
            return C19322110iZ.LJFF(fragmentManager, teamPairInviterFragment, "match_team_pair_inviter_dialog", null, 0);
        }
        return 0L;
    }

    public static final LinkDialog LIZIZ(MatchBaseWidget matchBaseWidget, long j, EnumC982940bga enumC982940bga, boolean z, List list, boolean z2, Function2 function2) {
        LinkDialog linkDialog = new LinkDialog(matchBaseWidget);
        EnumC977660bY4 enumC977660bY4 = EnumC977660bY4.TAKE_THE_STAGE_PLAYING_MANAGE_AUDIENCE;
        C977710bY9 c977710bY9 = new C977710bY9();
        c977710bY9.LIZIZ = function2;
        c977710bY9.LIZJ = j;
        c977710bY9.LIZLLL = enumC982940bga;
        c977710bY9.LJ = z;
        c977710bY9.LJFF = list;
        c977710bY9.LJI = z2;
        linkDialog.LLILZIL = enumC977660bY4;
        linkDialog.LLILZLL = c977710bY9;
        return linkDialog;
    }

    public static final LinkDialog LIZJ(MatchBaseWidget matchBaseWidget, MatchBaseWidget matchBaseWidget2, String str, GiftMode giftMode, boolean z, InterfaceC1631620sYq interfaceC1631620sYq, boolean z2, boolean z3) {
        LinkDialog linkDialog = new LinkDialog(matchBaseWidget);
        EnumC977660bY4 enumC977660bY4 = EnumC977660bY4.TYPE_TEAM_MATCH_INVITER;
        C979720bbO c979720bbO = new C979720bbO(matchBaseWidget2, str, giftMode, z2, z, interfaceC1631620sYq, z3);
        linkDialog.LLILZIL = enumC977660bY4;
        linkDialog.LLILZLL = c979720bbO;
        return linkDialog;
    }

    public static LinkDialog LIZLLL(MatchBaseWidget matchBaseWidget, MatchBaseWidget matchBaseWidget2, String str, GiftMode giftMode, EnumC974980bTk enumC974980bTk, EnumC975850bV9 enumC975850bV9, InterfaceC1631620sYq interfaceC1631620sYq, AwS416S0200000_15 awS416S0200000_15, AwS559S0100000_15 awS559S0100000_15, boolean z, String str2, C979690bbL c979690bbL, int i) {
        String str3 = str2;
        Function0 function0 = awS416S0200000_15;
        EnumC975850bV9 enumC975850bV92 = enumC975850bV9;
        Function0 function02 = awS559S0100000_15;
        EnumC974980bTk enumC974980bTk2 = enumC974980bTk;
        C979690bbL c979690bbL2 = null;
        if ((i & 16) != 0) {
            enumC974980bTk2 = null;
        }
        if ((i & 32) != 0) {
            enumC975850bV92 = null;
        }
        if ((i & 128) != 0) {
            function0 = AFwS203S0000000_15.get$arr$(7);
        }
        if ((i & 256) != 0) {
            function02 = AFwS203S0000000_15.get$arr$(8);
        }
        if ((i & 1024) != 0) {
            str3 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0) {
            c979690bbL2 = c979690bbL;
        }
        LinkDialog linkDialog = new LinkDialog(matchBaseWidget);
        EnumC977660bY4 enumC977660bY4 = EnumC977660bY4.TYPE_TWO_MATCH_INVITER;
        C979640bbG c979640bbG = new C979640bbG(matchBaseWidget2, str, giftMode, z, enumC974980bTk2, enumC975850bV92, str3, interfaceC1631620sYq, function0, function02, c979690bbL2);
        linkDialog.LLILZIL = enumC977660bY4;
        linkDialog.LLILZLL = c979640bbG;
        return linkDialog;
    }
}
