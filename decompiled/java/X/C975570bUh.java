package X;

import Y.ACListenerS150S0100000_15;
import Y.ARunnableS115S0100000_15;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.match.business.event.BattleDrawReMatchEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleReMatchEvent;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.CohostContentGuideInfo;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS133S0110000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bUh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C975570bUh implements InterfaceC977420bXg {
    public MatchBaseWidget LL;
    public DataChannel LLILLJJLI;
    public C16FS LLILLL;
    public C985030bjx LLILZ;
    public C979420bau LLILZIL;
    public Integer LLILZLL;
    public boolean LLIZ;
    public ARunnableS115S0100000_15 LLIZLLLIL;
    public C975540bUe LLJ;

    public final void LJI() {
        this.LLILZLL = null;
        this.LLIZ = false;
    }

    @Override // X.InterfaceC977420bXg
    public final void LJII(BattleInfoResponse battleInfoResponse) {
    }

    @Override // X.InterfaceC977420bXg
    public final void reset() {
    }

    public final void LJIIIIZZ() {
        C979420bau c979420bau;
        C16FS c16fs = this.LLILLL;
        if (c16fs != null) {
            C786410Ut5.LLJJJ(c16fs, 8);
        }
        C985030bjx c985030bjx = this.LLILZ;
        if (c985030bjx != null) {
            C786410Ut5.LLJL(c985030bjx, 8);
        }
        C985030bjx c985030bjx2 = this.LLILZ;
        if (c985030bjx2 != null) {
            c985030bjx2.LLIZ.LIZ();
        }
        ARunnableS115S0100000_15 aRunnableS115S0100000_15 = this.LLIZLLLIL;
        if (aRunnableS115S0100000_15 != null && (c979420bau = this.LLILZIL) != null) {
            HandlerHook.viewRemoveCallbacks(c979420bau, aRunnableS115S0100000_15);
        }
        this.LLIZLLLIL = null;
        C979420bau c979420bau2 = this.LLILZIL;
        if (c979420bau2 != null) {
            c979420bau2.setVisibility(false);
        }
    }

    public final void LJIIJJI() {
        MatchBaseWidget matchBaseWidget = this.LL;
        if (matchBaseWidget == null || matchBaseWidget.getView() == null) {
            return;
        }
        C970290bMB.LJIJ("finish");
        MatchBaseWidget matchBaseWidget2 = this.LL;
        ViewGroup viewGroup = matchBaseWidget2 != null ? (ViewGroup) matchBaseWidget2.findViewById(R.id.m96) : null;
        if (viewGroup != null && viewGroup.getVisibility() != 0) {
            C786410Ut5.LJLZ(0, viewGroup);
        }
        C985030bjx c985030bjx = this.LLILZ;
        if (c985030bjx != null) {
            C786410Ut5.LLJL(c985030bjx, 0);
        }
        C985030bjx c985030bjx2 = this.LLILZ;
        if (c985030bjx2 != null) {
            c985030bjx2.setCountDownListener(new AbstractC985060bk0() { // from class: X.0bUi
                @Override // X.AbstractC985060bk0
                public final void LIZIZ(long j) {
                    this.LIZ.LJI();
                    C975540bUe c975540bUe = this.LIZ.LLJ;
                    if (c975540bUe != null) {
                        c975540bUe.LIZ(false);
                    }
                    C985030bjx c985030bjx3 = this.LIZ.LLILZ;
                    if (c985030bjx3 != null) {
                        C786410Ut5.LLJL(c985030bjx3, 8);
                    }
                }
            });
        }
        C985010bjv.LIZ(new AwS594S0100000_15(this, 619));
        LJIIJ(0);
    }

    public final void LJIIL() {
        ViewGroup viewGroup;
        C20441214yg.LIZIZ("MatchRematchComponent", "normal rematch button will show");
        MatchBaseWidget matchBaseWidget = this.LL;
        if (matchBaseWidget == null || matchBaseWidget.getView() == null) {
            return;
        }
        C970290bMB.LJIJ("finish");
        MatchBaseWidget matchBaseWidget2 = this.LL;
        if (matchBaseWidget2 != null && (viewGroup = (ViewGroup) matchBaseWidget2.findViewById(R.id.m96)) != null && viewGroup.getVisibility() != 0) {
            C786410Ut5.LJLZ(0, viewGroup);
        }
        C16FS c16fs = this.LLILLL;
        if (c16fs != null) {
            HandlerHook.viewPost(c16fs, new ARunnableS115S0100000_15(this, 90));
        }
    }

    @Override // X.InterfaceC977430bXh
    public final void dismiss() {
        LJI();
        LJIIIIZZ();
        C979420bau c979420bau = this.LLILZIL;
        if (c979420bau != null) {
            c979420bau.LIZ();
        }
    }

    @Override // X.InterfaceC977430bXh
    public final void onUnload() {
        LJI();
        LJIIIIZZ();
        C979420bau c979420bau = this.LLILZIL;
        if (c979420bau != null) {
            c979420bau.LIZ();
        }
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    @Override // X.InterfaceC977420bXg
    public final void LIZJ(AbstractC986700bme abstractC986700bme) {
        boolean z;
        LJIILJJIL(abstractC986700bme instanceof C986690bmd);
        Integer num = this.LLILZLL;
        if (num != null) {
            int iIntValue = num.intValue();
            LJIIIIZZ();
            if (iIntValue == 0) {
                z = true;
            } else {
                z = false;
            }
            LJIILIIL(z);
        }
    }

    @Override // X.InterfaceC977430bXh
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        boolean z;
        this.LL = matchBaseWidget;
        this.LLILLJJLI = matchBaseWidget.provideDataChannel();
        this.LLILLL = (C16FS) matchBaseWidget.findViewById(R.id.cnn);
        this.LLILZ = (C985030bjx) matchBaseWidget.findViewById(R.id.cnl);
        this.LLILZIL = (C979420bau) matchBaseWidget.findViewById(R.id.i9h);
        C985030bjx c985030bjx = this.LLILZ;
        if (c985030bjx != null) {
            c985030bjx.setOnRematchClickListener(new ACListenerS150S0100000_15(this, 181));
        }
        C16FS c16fs = this.LLILLL;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ACListenerS150S0100000_15(this, 182));
        }
        C20441214yg.LJ("MatchRematchComponent", "Rematch Onload ");
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.CQ2(BattleDrawReMatchEvent.class, this, new AwS594S0100000_15(this, 617));
        }
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(BattleReMatchEvent.class, this, new AwS594S0100000_15(this, 618));
        }
        if (C500260Jjc.LJJIJIIJIL(Boolean.valueOf(C500260Jjc.LJIIZILJ(this.LLILLJJLI)))) {
            LJIIIIZZ();
        }
        if (C915980Zwa.LJFF().r82() && C915980Zwa.LJII().L6()) {
            z = true;
        } else {
            z = false;
        }
        LJIILJJIL(z);
    }

    @Override // X.InterfaceC977420bXg
    public final void LJFF(C975960bVK c975960bVK) {
        BattleTeamResult battleTeamResult;
        BattleTeamResult battleTeamResult2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("battleResult model = ");
        if (c975960bVK != null) {
            battleTeamResult = c975960bVK.LJJIJIIJIL;
        } else {
            battleTeamResult = null;
        }
        sbLIZ.append(battleTeamResult);
        C20441214yg.LJ("MatchRematchComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (c975960bVK != null && (battleTeamResult2 = c975960bVK.LJJIJIIJIL) != null && battleTeamResult2.result >= 0 && C500260Jjc.LJJIJIIJIL(Boolean.valueOf(C500260Jjc.LJIIZILJ(this.LLILLJJLI)))) {
            LJI();
            C16FS c16fs = this.LLILLL;
            if (c16fs != null) {
                C786410Ut5.LLJJJ(c16fs, 8);
            }
            C985030bjx c985030bjx = this.LLILZ;
            if (c985030bjx != null) {
                C786410Ut5.LLJL(c985030bjx, 8);
            }
        }
    }

    public final void LJIIJ(int i) {
        List<TeamUsersInfo> listLJJJ;
        String str;
        if (this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        C973660bRc c973660bRc = C973660bRc.LIZ;
        boolean zLJII = C970370bMJ.LJII();
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            listLJJJ = interfaceC973730bRjYf2.LJJJ();
        } else {
            listLJJJ = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C973660bRc.LJJIIJZLJL(linkedHashMap);
        C973660bRc.LJIIZILJ(c973660bRc, linkedHashMap, false, false, null, 14);
        if (i == 0) {
            str = "draw";
        } else {
            str = "not_draw";
        }
        linkedHashMap.put("oncemore_type", str);
        C973660bRc.LJI(linkedHashMap);
        C973660bRc.LIZ(linkedHashMap);
        C955400ayA.LIZ.LJJIJ(linkedHashMap, C915980Zwa.LJI().LIZ().LLIIIJ(), C915980Zwa.LJI().LIZ().LJLJI(), C915980Zwa.LJI().LIZ().LJIILLIIL(), C915980Zwa.LJI().LIZ().LLI());
        C973660bRc.LJJIII(linkedHashMap);
        C973660bRc.LJJI("", linkedHashMap);
        C973710bRh.LIZ(linkedHashMap);
        if (zLJII && C915980Zwa.LJII().LLILZLL(true).size() > 2) {
            C973660bRc.LJJIJ(listLJJJ, linkedHashMap);
            C955410ayB.LIZLLL(linkedHashMap, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
            C955400ayA.LJII(linkedHashMap);
            String strLIZIZ = (String) ((LinkedHashMap) C973660bRc.LJLJLLL).get("sub_match_type");
            if (strLIZIZ == null) {
                C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
                EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
                int size = C915980Zwa.LJII().LLILZLL(true).size();
                c917350Zyn.getClass();
                strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1jXB0, size);
            }
            C973660bRc.LJZ(c973660bRc, "livesdk_pk_oncemore_show", linkedHashMap, strLIZIZ);
            return;
        }
        C955410ayB.LIZLLL(linkedHashMap, C915980Zwa.LJI().LIZ().LJIILLIIL(), false);
        C955400ayA.LJII(linkedHashMap);
        linkedHashMap.put("right_user_id", String.valueOf(C915980Zwa.LJI().LJIIJ().LLJJJIL()));
        C973660bRc.LJZI(c973660bRc, "livesdk_pk_oncemore_show", linkedHashMap, "1v1");
    }

    public final void LJIILIIL(boolean z) {
        int i;
        boolean z2;
        int i2;
        ViewGroup viewGroup;
        if (z) {
            i = 0;
        } else {
            i = 1;
        }
        this.LLILZLL = i;
        if (C915980Zwa.LJFF().r82() && C915980Zwa.LJII().L6()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            C970290bMB.LJIJ("finish");
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
            CohostContentGuideInfo cohostContentGuideInfoLJL = null;
            if (interfaceC973730bRjYf2 != null) {
                cohostContentGuideInfoLJL = interfaceC973730bRjYf2.LJL();
            }
            if (C915980Zwa.LIZ().o20().LIZLLL(cohostContentGuideInfoLJL)) {
                C20441214yg.LIZIZ("MatchRematchComponent", "lynx rematch button will show");
                MatchBaseWidget matchBaseWidget = this.LL;
                if (matchBaseWidget != null && matchBaseWidget.getView() != null) {
                    MatchBaseWidget matchBaseWidget2 = this.LL;
                    if (matchBaseWidget2 != null && (viewGroup = (ViewGroup) matchBaseWidget2.findViewById(R.id.m96)) != null && viewGroup.getVisibility() != 0) {
                        C786410Ut5.LJLZ(0, viewGroup);
                    }
                    if (cohostContentGuideInfoLJL != null) {
                        i2 = cohostContentGuideInfoLJL.recommendedBattleType;
                    } else {
                        i2 = 0;
                    }
                    C979420bau c979420bau = this.LLILZIL;
                    if (c979420bau != null) {
                        c979420bau.LIZIZ(this.LL, i2, this.LLILLJJLI, new AwS133S0110000_15(this, z, 5));
                    }
                    C979420bau c979420bau2 = this.LLILZIL;
                    if (c979420bau2 != null) {
                        c979420bau2.setVisibility(true);
                    }
                    if (z) {
                        C985010bjv.LIZ(new AwS594S0100000_15(this, 628));
                    }
                    if (C978340bZA.LIZJ(true) != null) {
                        C918210a0B.LIZIZ = true;
                        return;
                    }
                    return;
                }
            }
        }
        if (z) {
            C20441214yg.LIZIZ("MatchRematchComponent", "Showing draw rematch button");
            LJIIJJI();
        } else {
            C20441214yg.LIZIZ("MatchRematchComponent", "Showing normal rematch button");
            LJIIL();
        }
    }

    public final void LJIILJJIL(boolean z) {
        if (z) {
            C16FS c16fs = this.LLILLL;
            if (c16fs != null) {
                c16fs.setCircular(true);
            }
            C500260Jjc.LJLJLLL(-1, this.LLILLL);
            C500260Jjc.LJJZ(C439101nJ.LIZ(24), this.LLILLL);
            C500260Jjc.LJLJLLL(-1, this.LLILZ);
            C500260Jjc.LJJZ(C439101nJ.LIZ(24), this.LLILZ);
            C985030bjx c985030bjx = this.LLILZ;
            if (c985030bjx != null) {
                c985030bjx.setBackgroundResource(R.drawable.e2x);
                return;
            }
            return;
        }
        C16FS c16fs2 = this.LLILLL;
        if (c16fs2 != null) {
            c16fs2.setCircular(false);
        }
        C500260Jjc.LJLJLLL(-2, this.LLILLL);
        C500260Jjc.LJJZ(C439101nJ.LIZ(28), this.LLILLL);
        C500260Jjc.LJLJLLL(-2, this.LLILZ);
        C500260Jjc.LJJZ(C439101nJ.LIZ(28), this.LLILZ);
        C985030bjx c985030bjx2 = this.LLILZ;
        if (c985030bjx2 == null) {
            return;
        }
        c985030bjx2.setBackgroundResource(R.drawable.e2w);
    }
}
