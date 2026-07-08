package com.bytedance.android.live.liveinteract.matchv2.connection.twomatch.coordinator.inviter.view;

import X.C098200Yq;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C153T;
import X.C1685300txQ;
import X.C16FS;
import X.C1776540wKa;
import X.C1819620xS4;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C2188811AlT;
import X.C259800zU;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C748880TZe;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C948770anT;
import X.C954460awe;
import X.C973100bQi;
import X.C973890bRz;
import X.C974450bSt;
import X.C974540bT2;
import X.C975140bU0;
import X.C977620bY0;
import X.C978750bZp;
import X.C978980baC;
import X.EnumC919170a1j;
import X.EnumC964170bCJ;
import X.EnumC974980bTk;
import X.EnumC975850bV9;
import X.InterfaceC1294060jmO;
import X.InterfaceC1631620sYq;
import X.InterfaceC21506019Ek;
import X.InterfaceC963450bB9;
import Y.ACListenerS118S0200000_15;
import Y.ACListenerS150S0100000_15;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.cohost.ui.dialog.InteractDisconnectDialog;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostIcyClashMatchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTeamPairSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS338S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
@InterfaceC1294060jmO
public final class TwoMatchInviterFragment extends TwoMatchInviterContract$View implements InterfaceC21506019Ek {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyIyPCYkP319KyoiJyowPCwjJ2HELIOSEnPyohKDswIGsvJiAhLCwiKDs8OmslJzk6PCA+Zzk6LTJiHTg8BSQ4KicaJjMlPSohDjctLiI2JjE=";
    public C977620bY0 LLILZ;
    public InteractDisconnectDialog LLIZLLLIL;
    public C973100bQi LLJ;
    public ConstraintLayout LLJIJIL;
    public C16FS LLJILJIL;
    public C153T LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public C16FS LLJJI;
    public boolean LLJJIII;
    public EnumC974980bTk LLJJIJI;
    public EnumC975850bV9 LLJJIJIIJIL;
    public String LLJJIJIL;
    public DataChannel LLJJJ;
    public InterfaceC1631620sYq<? super EnumC919170a1j, ? super List<C954460awe>, ? super List<C954460awe>, Unit> LLILZIL = AFwS338S0000000_15.get$arr$(2);
    public Function0<Unit> LLILZLL = AFwS203S0000000_15.get$arr$(47);
    public Function0<Unit> LLIZ = AFwS203S0000000_15.get$arr$(48);
    public C978750bZp LLJI = new C978750bZp(this);

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        return RR(null);
    }

    @Override // X.InterfaceC21506019Ek
    public final /* synthetic */ void onBackStackChangeCancelled() {
    }

    @Override // X.InterfaceC21506019Ek
    public final /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z) {
    }

    @Override // X.InterfaceC21506019Ek
    public final /* synthetic */ void onBackStackChangeProgressed(C1776540wKa c1776540wKa) {
    }

    @Override // X.InterfaceC21506019Ek
    public final /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z) {
    }

    public final void PR() {
        FragmentManager fragmentManager;
        InteractDisconnectDialog interactDisconnectDialog;
        C20441214yg.LIZIZ("TwoMatchInvitePanel", "cancelInvite");
        boolean z = this.LLJJIII;
        AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(this, 153);
        InteractDisconnectDialog interactDisconnectDialog2 = new InteractDisconnectDialog();
        this.LLIZLLLIL = interactDisconnectDialog2;
        interactDisconnectDialog2.LLIZLLLIL = C497740JfY.LJIJI(2131842675);
        interactDisconnectDialog2.LLJ = C497740JfY.LJIJI(2131842676);
        interactDisconnectDialog2.LLJI = 3;
        interactDisconnectDialog2.LLJILJIL = C497740JfY.LJIJI(2131842737);
        interactDisconnectDialog2.LLJIJIL = C497740JfY.LJIJI(2131842677);
        interactDisconnectDialog2.LLJJ = new AwS559S0100000_15(awS559S0100000_15, 1020);
        interactDisconnectDialog2.LLJILJILJ = z;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null && (fragmentManager = (FragmentManager) dataChannelLJ.gg0(C748880TZe.class)) != null && (interactDisconnectDialog = this.LLIZLLLIL) != null) {
            interactDisconnectDialog.show(fragmentManager, "InteractDisconnectDialog");
        }
        UR("withdraw", "1v1", false);
        C974540bT2.LIZ.LJJLI(0L, "withdraw", this.LLJJIII);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v27, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Integer] */
    public final void VR() {
        C259800zU c259800zU = new C259800zU();
        C259800zU c259800zU2 = new C259800zU();
        if (C915980Zwa.LJFF().RY(this.LLJJIII).compareTo(EnumC964170bCJ.INVITED) >= 0) {
            c259800zU.element = 2131856762;
            c259800zU2.element = "onClick: teamPairButton is disabled already invited";
        } else if (C948770anT.LJ() && (!C915980Zwa.LJII().LJJIIJZLJL().isEmpty())) {
            c259800zU.element = 2131851852;
            c259800zU2.element = "onClick: teamPairButton is disabled, getSelfHostRoomLinkedGuests().isNotEmpty()";
        } else if (C975140bU0.LJFF()) {
            c259800zU.element = 2131851723;
            c259800zU2.element = "onClick: teamPairButton is disabled, currently in catch beans";
        } else if (C975140bU0.LJII()) {
            c259800zU.element = 2131851724;
            c259800zU2.element = "onClick: teamPairButton is disabled, currently in take the stage";
        }
        if (c259800zU.element == 0 || c259800zU2.element == 0) {
            C16FS c16fs = this.LLJJI;
            if (c16fs != null) {
                c16fs.setEnabled(true);
            }
            C16FS c16fs2 = this.LLJJI;
            if (c16fs2 != null) {
                C786410Ut5.h8(c16fs2, new ACListenerS150S0100000_15(this, 55));
                return;
            }
            return;
        }
        C16FS c16fs3 = this.LLJJI;
        if (c16fs3 != null) {
            c16fs3.setEnabled(false);
        }
        C16FS c16fs4 = this.LLJJI;
        if (c16fs4 != null) {
            c16fs4.setAllowClickWhenDisabledCompat(true);
        }
        C16FS c16fs5 = this.LLJJI;
        if (c16fs5 != null) {
            C786410Ut5.h8(c16fs5, new ACListenerS118S0200000_15(c259800zU2, c259800zU, 22));
        }
    }

    public final void WR() {
        Text text;
        if (LiveMatchTeamPairSetting.INSTANCE.isEnable() || LiveCoHostIcyClashMatchSetting.INSTANCE.isEnable()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("giftEventDesc = ");
        C974450bSt c974450bSt = C973890bRz.LIZ;
        MultiMatchPrepareResponse multiMatchPrepareResponse = C973890bRz.LJIIJJI;
        sbLIZ.append(multiMatchPrepareResponse != null ? multiMatchPrepareResponse.giftEventDesc : null);
        C20441214yg.LIZIZ("TwoMatchInvitePanel", C2188811AlT.LIZIZ(sbLIZ));
        C978750bZp c978750bZp = this.LLJI;
        boolean z = this.LLJJIII;
        MultiMatchPrepareResponse multiMatchPrepareResponse2 = C973890bRz.LJIIJJI;
        if (multiMatchPrepareResponse2 == null || (text = multiMatchPrepareResponse2.giftEventDesc) == null) {
            text = new Text();
            text.defaultPattern = "";
        }
        c978750bZp.LJFF(z, text, false);
    }

    public final void ZR() {
        C16FS c16fs = this.LLJILJIL;
        if (c16fs != null) {
            c16fs.j0(R.style.a85);
        }
        C16FS c16fs2 = this.LLJILJIL;
        if (c16fs2 != null) {
            c16fs2.setText(C497740JfY.LJIJI(2131841253));
        }
        C16FS c16fs3 = this.LLJILJIL;
        if (c16fs3 != null) {
            c16fs3.setEnabled(true);
        }
        C16FS c16fs4 = this.LLJILJIL;
        if (c16fs4 != null) {
            C500260Jjc.LJLIIIL(500L, c16fs4, new AwS594S0100000_15(this, 139));
        }
        int size = C915980Zwa.LJII().LLILZLL(true).size();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showWithdrawBtn coHostLinkedUserCount:");
        sbLIZ.append(size);
        C20441214yg.LIZIZ("TwoMatchInvitePanel", C2188811AlT.LIZIZ(sbLIZ));
        if (size < 2) {
            this.LL.Vh(RR(new AwS559S0100000_15(this, 157)));
        }
        WR();
    }

    public final void aS() {
        MutableLiveData<Map<Boolean, List<C954460awe>>> mutableLiveData;
        Map<Boolean, List<C954460awe>> value;
        MutableLiveData<Map<Boolean, List<C954460awe>>> mutableLiveData2;
        Map<Boolean, List<C954460awe>> value2;
        C20441214yg.LIZIZ("TwoMatchInvitePanel", "start Invite");
        EnumC919170a1j enumC919170a1j = EnumC919170a1j.MATCH_TYPE_1V1;
        C977620bY0 c977620bY0 = this.LLILZ;
        List<C954460awe> list = (c977620bY0 == null || (mutableLiveData2 = c977620bY0.LJFF) == null || (value2 = mutableLiveData2.getValue()) == null) ? null : value2.get(Boolean.TRUE);
        C977620bY0 c977620bY02 = this.LLILZ;
        List<C954460awe> list2 = (c977620bY02 == null || (mutableLiveData = c977620bY02.LJFF) == null || (value = mutableLiveData.getValue()) == null) ? null : value.get(Boolean.FALSE);
        if (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) {
            C20441214yg.LJ("TwoMatchInvitePanel", "self or rival is empty");
            return;
        }
        this.LLILZIL.invoke(enumC919170a1j, list, list2);
        this.LL.Vh(RR(null));
        UR("invite", "1v1", false);
        C974540bT2.LIZ.LJJLI(0L, "invite", this.LLJJIII);
    }

    @Override // X.InterfaceC21506019Ek
    public final void onBackStackChanged() {
        View rootView;
        Text text;
        C978750bZp c978750bZp = new C978750bZp(this);
        this.LLJI = c978750bZp;
        c978750bZp.LIZJ(false);
        InterfaceC963450bB9 interfaceC963450bB9 = this.LL;
        if (interfaceC963450bB9 == null || (rootView = interfaceC963450bB9.getRootView()) == null) {
            return;
        }
        this.LLJI.LIZ(rootView, this.LL, new AwS559S0100000_15(this, 1013));
        C978750bZp c978750bZp2 = this.LLJI;
        MultiMatchPrepareResponse multiMatchPrepareResponse = C973890bRz.LJIIJJI;
        if (multiMatchPrepareResponse == null || (text = multiMatchPrepareResponse.giftEventDesc) == null) {
            text = new Text();
            text.defaultPattern = "";
        }
        c978750bZp2.LJFF(false, text, true);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.zQ2(this);
        }
        getChildFragmentManager().LLD(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        getChildFragmentManager().LLD(this);
        this.LL.Ja(this);
    }

    public final C978980baC RR(Function0<Unit> function0) {
        C978980baC c978980baC = new C978980baC();
        c978980baC.LJIILIIL = false;
        c978980baC.LIZIZ = true;
        c978980baC.LIZ = SpannableString.valueOf(C497740JfY.LJIJI(2131843042));
        c978980baC.LJIIIIZZ = true;
        c978980baC.LJIIJ = new AwS559S0100000_15(function0, (Function0<Unit>) 154);
        c978980baC.LJIIJJI = new AwS559S0100000_15(function0, (Function0<Unit>) 155);
        c978980baC.LJII = this.LLJI.LIZIZ(this.LLJJJ, this.LLJJIII, this.LL, true);
        c978980baC.LJIJI = 0;
        c978980baC.LIZ();
        c978980baC.LIZIZ();
        return c978980baC;
    }

    public final void SR(ImageModel imageModel, C1324720kZq c1324720kZq) {
        int width;
        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
        c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el_;
        int height = 0;
        if (c1324720kZq != null) {
            width = c1324720kZq.getWidth();
            height = c1324720kZq.getHeight();
        } else {
            width = 0;
        }
        c1324610kZfLJIIIZ.LJ = width;
        c1324610kZfLJIIIZ.LJFF = height;
        c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
        c1324610kZfLJIIIZ.LJJI(c1324720kZq);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0237  */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instruction units count: 1035
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.matchv2.connection.twomatch.coordinator.inviter.view.TwoMatchInviterFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049 A[PHI: r3
      0x0049: PHI (r3v3 java.util.List<X.0awe>) = (r3v1 java.util.List<X.0awe>), (r3v4 java.util.List<X.0awe>) binds: [B:11:0x0028, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void UR(java.lang.String r18, java.lang.String r19, boolean r20) {
        /*
            r17 = this;
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r1 = X.C915980Zwa.LJII()
            r0 = 1
            java.util.List r3 = r1.LLILZLL(r0)
            r4 = 0
            r10 = r20
            r2 = r17
            if (r10 != 0) goto L28
            X.0bY0 r0 = r2.LLILZ
            if (r0 == 0) goto L48
            androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.Boolean, java.util.List<X.0awe>>> r0 = r0.LJFF
            if (r0 == 0) goto L48
            java.lang.Object r1 = r0.getValue()
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L48
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Object r3 = r1.get(r0)
            java.util.List r3 = (java.util.List) r3
        L28:
            if (r10 == 0) goto L49
        L2a:
            X.0bRc r0 = X.C973660bRc.LIZ
            r7 = 0
            r5 = 0
            android.view.View r0 = r2.LLJJ
            if (r0 == 0) goto L46
            boolean r9 = X.C500260Jjc.LJJJJIZL(r0)
        L36:
            r16 = 15944(0x3e48, float:2.2342E-41)
            r6 = r19
            r2 = r18
            r8 = r5
            r11 = r7
            r12 = r5
            r13 = r5
            r14 = r5
            r15 = r5
            X.C973660bRc.LJJJLZIJ(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L46:
            r9 = 0
            goto L36
        L48:
            r3 = r4
        L49:
            X.0bY0 r0 = r2.LLILZ
            if (r0 == 0) goto L2a
            androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.Boolean, java.util.List<X.0awe>>> r0 = r0.LJFF
            if (r0 == 0) goto L2a
            java.lang.Object r1 = r0.getValue()
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L2a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Object r4 = r1.get(r0)
            java.util.List r4 = (java.util.List) r4
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.matchv2.connection.twomatch.coordinator.inviter.view.TwoMatchInviterFragment.UR(java.lang.String, java.lang.String, boolean):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gct, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
