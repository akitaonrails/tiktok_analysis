package X;

import com.bytedance.android.live.liveinteract.competition.launcher.CompetitionModeChooseContract$View;
import com.bytedance.android.live.liveinteract.multimatch.event.MatchPermissionData;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostIcyClashMatchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostMatchAutoSelectedSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveMatchTakeStageOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTeamPairSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LivePlazaPanelSimplifiedInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.0bZf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978650bZf extends AbstractC979780bbU {
    public final String LLILLL;
    public final EnumC962960bAM LLILZ;
    public final DataChannel LLILZIL;
    public final boolean LLILZLL;
    public final C979690bbL LLIZ;
    public final InterfaceC1631630sYr<EnumC919170a1j, Boolean, String, Boolean, Unit> LLIZLLLIL;
    public final boolean LLJ;
    public EnumC919170a1j LLJI;
    public boolean LLJIJIL;
    public C978700bZk LLJILJIL;
    public C978790bZt LLJILJILJ;
    public C978800bZu LLJILLL;
    public C978770bZr LLJJ;
    public final C979030baH LLJJI;

    @Override // X.AbstractC979780bbU
    public final void LJIIJ() {
        WeakReference<InterfaceC978780bZs> weakReference;
        InterfaceC978780bZs interfaceC978780bZs;
        Object next;
        C979030baH.LIZLLL(this.LLJJI, 3);
        this.LLILLJJLI.clear();
        if (!LJIILIIL() && C915980Zwa.LJFF().k31()) {
            this.LLILLJJLI.add(new Object() { // from class: X.0ba2
            });
        }
        boolean zLJIILJJIL = LJIILJJIL();
        boolean zLJIIL = LJIIL();
        boolean zLJIILIIL = LJIILIIL();
        int size = C915980Zwa.LJII().LLILZLL(true).size();
        AwS594S0100000_15 awS594S0100000_15 = new AwS594S0100000_15(this, 600);
        C972460bPg c972460bPg = new C972460bPg(zLJIIL, this.LLILZIL, (CompetitionModeChooseContract$View) this.LL, this.LLILLJJLI, awS594S0100000_15, this.LLILLL, C915980Zwa.LJII(), C915980Zwa.LJI(), C915980Zwa.LIZLLL());
        C978660bZg c978660bZg = new C978660bZg(zLJIILJJIL, zLJIIL, zLJIILIIL, awS594S0100000_15);
        C978680bZi c978680bZi = new C978680bZi(zLJIILJJIL, zLJIIL, zLJIILIIL, awS594S0100000_15);
        C978670bZh c978670bZh = new C978670bZh(awS594S0100000_15, zLJIILJJIL, zLJIIL);
        for (InterfaceC978740bZo interfaceC978740bZo : C1697810uHb.LJIIJJI(c978660bZg, c978680bZi, c972460bPg, c978670bZh)) {
            if (interfaceC978740bZo.shouldShow()) {
                C978700bZk c978700bZkLIZIZ = interfaceC978740bZo.LIZIZ();
                if (c978700bZkLIZIZ.LJ == EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE) {
                    this.LLJILJIL = c978700bZkLIZIZ;
                }
                this.LLILLJJLI.add(c978700bZkLIZIZ);
            }
        }
        Iterator it2 = C1697810uHb.LJIIJJI(c972460bPg, c978670bZh, c978680bZi, c978660bZg).iterator();
        while (true) {
            Object obj = null;
            if (it2.hasNext()) {
                InterfaceC978740bZo interfaceC978740bZo2 = (InterfaceC978740bZo) it2.next();
                if (interfaceC978740bZo2.LIZLLL()) {
                    if (interfaceC978740bZo2.LIZJ()) {
                        interfaceC978740bZo2.LIZ();
                        C410901il c410901il = this.LLILLJJLI;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : c410901il) {
                            if (obj2 instanceof C978700bZk) {
                                arrayList.add(obj2);
                            }
                        }
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                if (((C978700bZk) next).LJ == interfaceC978740bZo2.LJIIIZ()) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        C978700bZk c978700bZk = (C978700bZk) next;
                        if (c978700bZk != null) {
                            c978700bZk.LJI = true;
                        }
                    }
                }
            } else {
                C410901il c410901il2 = this.LLILLJJLI;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : c410901il2) {
                    if (obj3 instanceof C978700bZk) {
                        arrayList2.add(obj3);
                    }
                }
                Iterator it4 = arrayList2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next2 = it4.next();
                    if (((C978700bZk) next2).LJ == EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE) {
                        obj = next2;
                        break;
                    }
                }
                C978700bZk c978700bZk2 = (C978700bZk) obj;
                if (c978700bZk2 != null) {
                    C20337914i1<Integer> c20337914i1 = InterfaceC960800b6s.LLLII;
                    if (c20337914i1.LIZIZ().intValue() < 3) {
                        c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
                        c978700bZk2.LJI = true;
                    }
                }
            }
        }
        C978790bZt c978790bZt = new C978790bZt((zLJIIL || !zLJIILIIL) ? 0 : 2);
        this.LLJILJILJ = c978790bZt;
        this.LLILLJJLI.add(c978790bZt);
        C978800bZu c978800bZu = new C978800bZu();
        this.LLJILLL = c978800bZu;
        this.LLILLJJLI.add(c978800bZu);
        if (c978660bZg.shouldShow() || c978680bZi.shouldShow()) {
            this.LLILLJJLI.add(new C790810V0l(C948790anV.LIZ(C915980Zwa.LJFF(), C915980Zwa.LJII()) ? 1 : 0));
        }
        C978770bZr c978770bZr = new C978770bZr(new AwS559S0100000_15(this, 571));
        this.LLJJ = c978770bZr;
        this.LLILLJJLI.add(c978770bZr);
        EnumC919170a1j enumC919170a1j = this.LLJI;
        EnumC919170a1j enumC919170a1j2 = EnumC919170a1j.UNKNOWN;
        if (enumC919170a1j == enumC919170a1j2) {
            if (zLJIIL || Intrinsics.LJFF(this.LLILLL, "playbook_match")) {
                if (size == 2) {
                    this.LLJI = EnumC919170a1j.MATCH_TYPE_1V1;
                } else {
                    this.LLJI = EnumC919170a1j.MATCH_TYPE_INDIVIDUAL;
                }
            } else if (LiveCoHostMatchAutoSelectedSetting.INSTANCE.isEnable()) {
                EnumC919170a1j enumC919170a1jLIZ = C918130a03.LIZ(InterfaceC960800b6s.LLJLLL.LIZIZ());
                if (size != 2) {
                    enumC919170a1jLIZ = EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE;
                } else if (enumC919170a1jLIZ == enumC919170a1j2) {
                    enumC919170a1jLIZ = EnumC919170a1j.MATCH_TYPE_CATCH_BEANS;
                }
                this.LLJI = enumC919170a1jLIZ;
            } else {
                this.LLJI = EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE;
            }
        }
        if (!LJIILJJIL() && !LJIIL()) {
            this.LLJI = EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE;
        }
        if (LJIIL() || Intrinsics.LJFF(this.LLILLL, "playbook_match")) {
            this.LLJJI.LIZJ(this.LLILLJJLI);
        }
        LJIILL(this.LLJI, true);
        ((CompetitionModeChooseContract$View) this.LL).UR();
        C979690bbL c979690bbL = this.LLIZ;
        if (c979690bbL != null && (weakReference = c979690bbL.LIZ) != null && (interfaceC978780bZs = weakReference.get()) != null) {
            interfaceC978780bZs.LIZ();
        }
        EnumC919170a1j enumC919170a1j3 = this.LLJI;
        String str = this.LLILLL;
        C978770bZr c978770bZr2 = this.LLJJ;
        C973690bRf.LJJIIZ(enumC919170a1j3, str, c978770bZr2 != null && c978770bZr2.LIZ);
    }

    public final boolean LJIIL() {
        if (Intrinsics.LJFF(this.LLILLL, "pk_icon") || Intrinsics.LJFF(this.LLILLL, "pk_guide") || Intrinsics.LJFF(this.LLILLL, "1v1v1_guide") || Intrinsics.LJFF(this.LLILLL, "lynx_fallback")) {
            return true;
        }
        return (Intrinsics.LJFF(this.LLILLL, EnumC975850bV9.CANCEL_AFTER_INVITE.getSource()) || Intrinsics.LJFF(this.LLILLL, EnumC975850bV9.INVITE_REQUEST_FAILED.getSource())) && this.LLILZ == EnumC962960bAM.MATCH_INDIVIDUAL;
    }

    public final boolean LJIILIIL() {
        if (Intrinsics.LJFF(this.LLILLL, "plaza_icon") || Intrinsics.LJFF(this.LLILLL, "take_stage_guide") || Intrinsics.LJFF(this.LLILLL, "catch_bean_guide")) {
            return true;
        }
        if (!Intrinsics.LJFF(this.LLILLL, EnumC975850bV9.CANCEL_AFTER_INVITE.getSource()) && !Intrinsics.LJFF(this.LLILLL, EnumC975850bV9.INVITER_TIMEOUT.getSource()) && !Intrinsics.LJFF(this.LLILLL, EnumC975850bV9.INVITEE_REJECT_BUTTON_CLICK.getSource()) && !Intrinsics.LJFF(this.LLILLL, EnumC975850bV9.INVITEE_TIMEOUT.getSource())) {
            return false;
        }
        EnumC962960bAM enumC962960bAM = this.LLILZ;
        return enumC962960bAM == EnumC962960bAM.CATCH_BEANS || enumC962960bAM == EnumC962960bAM.TAKE_THE_STAGE;
    }

    public final boolean LJIILJJIL() {
        if (LiveMatchTakeStageOptSetting.INSTANCE.isEnableOptMatchButton()) {
            DataChannel dataChannel = this.LLILZIL;
            if (!C500260Jjc.LJJJI(dataChannel != null ? (Boolean) dataChannel.gg0(MatchPermissionData.class) : null) || !this.LLILZLL) {
                return false;
            }
        }
        return true;
    }

    public final void LJIIZILJ() {
        WeakReference<InterfaceC978780bZs> weakReference;
        InterfaceC978780bZs interfaceC978780bZs;
        if (C975140bU0.LIZIZ(this.LLJI, AFwS250S0000000_15.get$arr$(110))) {
            return;
        }
        C978770bZr c978770bZr = this.LLJJ;
        if (c978770bZr != null && !c978770bZr.LIZ) {
            LJIJI(this, false);
            return;
        }
        List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        if ((!listLJIJJ.isEmpty()) && (true ^ listLLILZLL.isEmpty()) && listLLILZLL.size() != listLJIJJ.size()) {
            C766270U4b.LIZLLL(2131851644);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("someone inviting/applying, linkingUsers = ");
            sbLIZ.append(listLJIJJ);
            sbLIZ.append(" , linkedList = ");
            sbLIZ.append(listLLILZLL);
            C20441214yg.LJ("CompetitionModeChoosePresenter", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C979690bbL c979690bbL = this.LLIZ;
        if (c979690bbL != null && (weakReference = c979690bbL.LIZ) != null && (interfaceC978780bZs = weakReference.get()) != null) {
            interfaceC978780bZs.onSuccess();
        }
        InterfaceC1631630sYr<EnumC919170a1j, Boolean, String, Boolean, Unit> interfaceC1631630sYr = this.LLIZLLLIL;
        if (interfaceC1631630sYr != null) {
            interfaceC1631630sYr.invoke(this.LLJI, Boolean.valueOf(this.LLJ), this.LLILLL, Boolean.valueOf(this.LLJIJIL));
        }
    }

    @Override // X.InterfaceC1844530y6F
    public final void Qp() {
        List<Playbook> listLJ;
        if (this.LLJJI.LJII) {
            C979690bbL c979690bbL = this.LLIZ;
            boolean zLJJJI = C500260Jjc.LJJJI(c979690bbL != null ? Boolean.valueOf(c979690bbL.LIZJ) : null);
            boolean z = !this.LLJJI.LIZLLL;
            InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
            C978350bZB.LIZIZ(zLJJJI, "match_panel", z, (interfaceC975870bVBLJFF == null || (listLJ = interfaceC975870bVBLJFF.LJ()) == null) ? 0 : listLJ.size(), "click", LSPassThroughRecordSizeConfig.DEFAULT, this.LLILZIL, null, 704);
            Pair<Integer, Integer> pairLJ = this.LLJJI.LJ(this.LLILLJJLI);
            int iIntValue = pairLJ.getFirst().intValue();
            int iIntValue2 = pairLJ.getSecond().intValue();
            C979030baH c979030baH = this.LLJJI;
            boolean z2 = c979030baH.LIZLLL;
            ((CompetitionModeChooseContract$View) this.LL).RR(c979030baH.LJI);
            ((CompetitionModeChooseContract$View) this.LL).SR(this.LLILLJJLI.indexOf(this.LLJJI.LIZ));
            ((CompetitionModeChooseContract$View) this.LL).VR(iIntValue, iIntValue2, z2);
        }
    }

    @Override // X.AbstractC979780bbU
    public final void LJIIIZ(C07WX c07wx) {
        String strLJJLIIIJ;
        C978770bZr c978770bZr = this.LLJJ;
        if (c978770bZr == null) {
            C20441214yg.LJ("CompetitionModeChoosePresenter", "Confirmation button is clicked but cannot find a listener to react");
            return;
        }
        if (this.LLJI != EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TakeStage should start but lastSelectedMode=");
            sbLIZ.append(this.LLJI);
            C20441214yg.LJ("CompetitionModeChoosePresenter", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        DataChannel dataChannel = this.LLILZIL;
        if (dataChannel != null) {
            dataChannel.SX0(C0UEF.class, c07wx);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Get started: set performer order, invoke confirm. text=");
        sbLIZ2.append(c978770bZr.LIZIZ);
        sbLIZ2.append(", performers=");
        if (c07wx == null) {
            strLJJLIIIJ = "null";
        } else if (c07wx.LIZ.isEmpty()) {
            strLJJLIIIJ = "empty";
        } else {
            strLJJLIIIJ = C13LP.LJJLIIIJ(c07wx.LIZ, null, e3.e, e3.f, 0, null, AFwS250S0000000_15.get$arr$(111), 25);
        }
        sbLIZ2.append(strLJJLIIIJ);
        C20441214yg.LIZIZ("CompetitionModeChoosePresenter", C2188811AlT.LIZIZ(sbLIZ2));
        LJIIZILJ();
    }

    public C978650bZf(CompetitionModeChooseContract$View competitionModeChooseContract$View, C975200bU6 c975200bU6) {
        super(competitionModeChooseContract$View);
        this.LLILLL = c975200bU6.LJIIIIZZ;
        this.LLILZ = c975200bU6.LJIIIZ;
        this.LLILZIL = c975200bU6.LIZ;
        this.LLILZLL = c975200bU6.LJI;
        this.LLIZ = c975200bU6.LJII;
        this.LLIZLLLIL = c975200bU6.LIZIZ;
        this.LLJ = c975200bU6.LJFF;
        this.LLJI = c975200bU6.LJ;
        this.LLJJI = new C979030baH();
    }

    public static void LJIJI(C978650bZf c978650bZf, boolean z) {
        c978650bZf.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateButtonDisabled: disabled ");
        sbLIZ.append(z);
        sbLIZ.append(", allowClickWhenDisabled ");
        sbLIZ.append(true);
        C20441214yg.LJIIIZ("CompetitionModeChoosePresenter", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            C978770bZr c978770bZr = c978650bZf.LLJJ;
            if (c978770bZr != null) {
                c978770bZr.LIZ = false;
                c978770bZr.LIZJ = true;
                return;
            }
            return;
        }
        C978770bZr c978770bZr2 = c978650bZf.LLJJ;
        if (c978770bZr2 == null) {
            return;
        }
        c978770bZr2.LIZ = true;
    }

    @Override // X.AbstractC979780bbU
    public final void LJIIJJI(int i, int i2) {
        C979030baH c979030baH = this.LLJJI;
        c979030baH.LJ = i;
        c979030baH.LJFF = i2;
        c979030baH.LJI = i2;
    }

    public final void LJIILL(EnumC919170a1j enumC919170a1j, boolean z) {
        boolean z2;
        C978790bZt c978790bZt;
        String str;
        int idx;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onItemSelected: matchType ");
        sbLIZ.append(enumC919170a1j);
        sbLIZ.append(", defaultSelected ");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("CompetitionModeChoosePresenter", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJIJIL = z;
        if (this.LLJI == enumC919170a1j && !z) {
            return;
        }
        this.LLJI = enumC919170a1j;
        if (!LiveCoHostMatchAutoSelectedSetting.INSTANCE.isEnable()) {
            C20441214yg.LJ("CompetitionModeChoosePresenter", "recordChooseItemSelected return for switch is disable.");
        } else if (enumC919170a1j != EnumC919170a1j.UNKNOWN && !z) {
            if (LJIILIIL()) {
                InterfaceC960800b6s.LLJLLL.LJFF(Integer.valueOf(enumC919170a1j.getType()));
            }
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("recordChooseItemSelected return, matchType:");
            sbLIZ2.append(enumC919170a1j);
            sbLIZ2.append(" defaultSelected:");
            sbLIZ2.append(z);
            C20441214yg.LJ("CompetitionModeChoosePresenter", C2188811AlT.LIZIZ(sbLIZ2));
        }
        LJIJI(this, C975140bU0.LIZIZ(enumC919170a1j, null));
        Iterator<Object> it2 = this.LLILLJJLI.iterator();
        while (true) {
            z2 = false;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof C978700bZk) {
                C978700bZk c978700bZk = (C978700bZk) next;
                if (c978700bZk.LJ == enumC919170a1j) {
                    z2 = true;
                }
                c978700bZk.LJFF = z2;
            }
        }
        switch (C917440Zyw.LIZ[enumC919170a1j.ordinal()]) {
            case 1:
                C978800bZu c978800bZu = this.LLJILLL;
                if (c978800bZu != null) {
                    c978800bZu.LIZ = 0;
                }
                C978790bZt c978790bZt2 = this.LLJILJILJ;
                if (c978790bZt2 != null) {
                    c978790bZt2.LIZ = 0;
                }
                C978770bZr c978770bZr = this.LLJJ;
                if (c978770bZr != null) {
                    c978770bZr.LIZIZ = C497740JfY.LJIJI(2131851792);
                }
                break;
            case 2:
                C978800bZu c978800bZu2 = this.LLJILLL;
                if (c978800bZu2 != null) {
                    c978800bZu2.LIZ = 0;
                }
                C978790bZt c978790bZt3 = this.LLJILJILJ;
                if (c978790bZt3 != null) {
                    c978790bZt3.LIZ = 0;
                }
                C978770bZr c978770bZr2 = this.LLJJ;
                if (c978770bZr2 != null) {
                    c978770bZr2.LIZIZ = C497740JfY.LJIJI(2131853336);
                }
                break;
            case 3:
            case 4:
                C978800bZu c978800bZu3 = this.LLJILLL;
                if (c978800bZu3 != null) {
                    c978800bZu3.LIZ = 0;
                }
                C978790bZt c978790bZt4 = this.LLJILJILJ;
                if (c978790bZt4 != null) {
                    c978790bZt4.LIZ = 0;
                }
                C978770bZr c978770bZr3 = this.LLJJ;
                if (c978770bZr3 != null) {
                    c978770bZr3.LIZIZ = C497740JfY.LJIJI(2131853334);
                }
                break;
            case 5:
                C978800bZu c978800bZu4 = this.LLJILLL;
                if (c978800bZu4 != null) {
                    c978800bZu4.LIZ = 0;
                }
                C978790bZt c978790bZt5 = this.LLJILJILJ;
                if (c978790bZt5 != null) {
                    c978790bZt5.LIZ = 2;
                }
                C978770bZr c978770bZr4 = this.LLJJ;
                if (c978770bZr4 != null) {
                    c978770bZr4.LIZIZ = C497740JfY.LJIJI(2131854921);
                }
                break;
            case 6:
                C978800bZu c978800bZu5 = this.LLJILLL;
                if (c978800bZu5 != null) {
                    c978800bZu5.LIZ = 0;
                }
                C978790bZt c978790bZt6 = this.LLJILJILJ;
                if (c978790bZt6 != null) {
                    c978790bZt6.LIZ = 2;
                }
                if (LivePlazaPanelSimplifiedInfo.INSTANCE.isEnable()) {
                    C978770bZr c978770bZr5 = this.LLJJ;
                    if (c978770bZr5 != null) {
                        c978770bZr5.LIZIZ = C497740JfY.LJIJI(2131854921);
                    }
                } else {
                    C978770bZr c978770bZr6 = this.LLJJ;
                    if (c978770bZr6 != null) {
                        c978770bZr6.LIZIZ = C497740JfY.LJIJI(2131851792);
                    }
                }
                break;
        }
        if ((LiveMatchTeamPairSetting.INSTANCE.isEnable() || LiveCoHostIcyClashMatchSetting.INSTANCE.isEnable()) && (c978790bZt = this.LLJILJILJ) != null) {
            c978790bZt.LIZ = 2;
        }
        C978700bZk c978700bZk2 = this.LLJILJIL;
        if (c978700bZk2 != null) {
            if (enumC919170a1j == EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE) {
                z2 = true;
            }
            c978700bZk2.LJIIIZ = z2;
        }
        new C974490bSx().LJJII(enumC919170a1j, z);
        if (!enumC919170a1j.isMatch() && (enumC919170a1j.isTakeTheStage() || enumC919170a1j.isCatchBeans())) {
            str = "plaza";
        } else {
            str = "match";
        }
        if (enumC919170a1j.isMatch()) {
            idx = EnumC978690bZj.LIVE_MATCH.getIdx();
        } else if (enumC919170a1j.isTakeTheStage()) {
            idx = EnumC978690bZj.TAKE_STAGE.getIdx();
        } else if (enumC919170a1j.isCatchBeans()) {
            idx = EnumC978690bZj.CATCH_BEAN.getIdx();
        } else {
            idx = EnumC978690bZj.LIVE_MATCH.getIdx();
        }
        CompetitionModeChooseContract$View competitionModeChooseContract$View = (CompetitionModeChooseContract$View) this.LL;
        if (competitionModeChooseContract$View != null) {
            competitionModeChooseContract$View.PR(Integer.valueOf(idx), str);
        }
    }
}
