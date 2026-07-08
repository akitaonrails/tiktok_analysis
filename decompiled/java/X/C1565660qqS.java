package X;

import Y.ACListenerS158S0100000_24;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IPanelUIAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.feed.platform.panel.clearmode.IClearModePanelComponent;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS459S0200000_24;

/* JADX INFO: renamed from: X.0qqS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1565660qqS implements InterfaceC1565710qqX {
    public View LL;
    public C1565650qqR LLILLJJLI;
    public C1565600qqM LLILLL;
    public String LLILZ;
    public Aweme LLILZIL;
    public IPlayerComponentAbility LLILZLL;
    public IClearModePanelComponent LLIZ;
    public IPanelUIAbility LLIZLLLIL;
    public IFeedPanelPlatformAbility LLJ;
    public final C0S4J LLJI = new C0S4J("ClearModeImmersiveBarController");

    @Override // X.InterfaceC1565710qqX
    public final void LIZ() {
        AwS459S0200000_24 awS459S0200000_24;
        C622680Oba.LIZLLL(this);
        C1565600qqM c1565600qqM = this.LLILLL;
        if (c1565600qqM == null || (awS459S0200000_24 = c1565600qqM.LIZLLL) == null) {
            return;
        }
        C589960NBy.LIZ.getClass();
        ((ArrayList) C589960NBy.LJFF).remove(awS459S0200000_24);
    }

    @Override // X.InterfaceC1565710qqX
    public final EnumC1565700qqW LIZJ(C737030Svd c737030Svd) {
        return C1565680qqU.LIZ(c737030Svd);
    }

    @C14EU
    public final void onPlayerControllerVideoStatusEvent(C722910SXh c722910SXh) {
        C1565650qqR c1565650qqR;
        C0S4J c0s4j = this.LLJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayerControllerVideoStatusEvent ");
        sbLIZ.append(c722910SXh.LIZJ);
        c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        int i = c722910SXh.LIZJ;
        if (i != 1) {
            if (i == 2 && (c1565650qqR = this.LLILLJJLI) != null) {
                c1565650qqR.LIZ(true);
                return;
            }
            return;
        }
        C1565650qqR c1565650qqR2 = this.LLILLJJLI;
        if (c1565650qqR2 == null) {
            return;
        }
        c1565650qqR2.LIZ(false);
    }

    @Override // X.InterfaceC1565710qqX
    public final View LIZLLL(C19EG c19eg, ViewGroup viewGroup) {
        this.LLJI.LJIIIZ("createBottomView");
        View viewLIZLLL = C20673215v0.LIZLLL(R.layout.b74, C1388190mED.LIZ(c19eg), viewGroup, false);
        this.LL = viewLIZLLL;
        new Object(this) { // from class: X.0qqN
            public final View LIZ;

            {
                View viewFindViewById;
                View view = this.LL;
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.e0k);
                } else {
                    viewFindViewById = null;
                }
                this.LIZ = viewFindViewById;
                if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJIZ()) {
                    if (viewFindViewById != null) {
                        C786410Ut5.LJLLLLLL(8, viewFindViewById);
                    }
                } else {
                    if (viewFindViewById != null) {
                        C786410Ut5.I7(new ACListenerS158S0100000_24(this, 90), viewFindViewById);
                    }
                    C2271391DvN.LIZ(viewFindViewById, (C1A5L) C2271381DvM.LJJJLL.getValue());
                }
            }
        };
        this.LLILLJJLI = new C1565650qqR(this);
        this.LLILLL = new C1565600qqM(this);
        C622680Oba.LIZJ(this);
        return viewLIZLLL;
    }

    @Override // X.InterfaceC1565710qqX
    public final void LIZIZ(C737030Svd c737030Svd, Aweme aweme, boolean z, Fragment fragment) {
        String aid;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ;
        IPlayerComponentAbility iPlayerComponentAbilityX32;
        IClearModePanelComponent iClearModePanelComponent;
        C0N0Y playerManager;
        IPlayerComponentAbility iPlayerComponentAbility;
        IPlayerComponentAbility iPlayerComponentAbility2;
        IPlayerComponentAbility iPlayerComponentAbility3;
        IPlayerComponentAbility iPlayerComponentAbility4;
        C0N0Y playerManager2;
        C0N0Y playerManager3;
        InterfaceC665370Q7z interfaceC665370Q7zLJ;
        InterfaceC665370Q7z interfaceC665370Q7zLJ2;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ2;
        Aweme awemeLJIIIIZZ;
        try {
            this.LLILZ = c737030Svd.LJ;
            this.LLILZIL = aweme;
            C0S4J c0s4j = this.LLJI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleCustomizedLogic eventType:");
            sbLIZ.append(this.LLILZ);
            sbLIZ.append("  aid:");
            Aweme aweme2 = this.LLILZIL;
            IPanelUIAbility iPanelUIAbility = null;
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            sbLIZ.append("  inSelfImmersion:");
            sbLIZ.append(z);
            c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                if (fragment == null) {
                    iFeedPanelPlatformAbilityLIZJ = null;
                } else {
                    iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(fragment);
                }
                this.LLJ = iFeedPanelPlatformAbilityLIZJ;
                if (iFeedPanelPlatformAbilityLIZJ != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbilityLIZJ.LJIIIIZZ()) != null) {
                    this.LLILZIL = awemeLJIIIIZZ;
                }
                if (fragment == null || (iFeedPanelPlatformAbilityLIZJ2 = C0T1R.LIZJ(fragment)) == null) {
                    iPlayerComponentAbilityX32 = null;
                } else {
                    iPlayerComponentAbilityX32 = iFeedPanelPlatformAbilityLIZJ2.x32();
                }
                this.LLILZLL = iPlayerComponentAbilityX32;
                if (fragment == null || (interfaceC665370Q7zLJ2 = C1578630rBN.LJ(fragment)) == null) {
                    iClearModePanelComponent = null;
                } else {
                    iClearModePanelComponent = (IClearModePanelComponent) C1558520qew.LIZ(interfaceC665370Q7zLJ2, IClearModePanelComponent.class, null);
                }
                this.LLIZ = iClearModePanelComponent;
                if (fragment != null && (interfaceC665370Q7zLJ = C1578630rBN.LJ(fragment)) != null) {
                    iPanelUIAbility = (IPanelUIAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, IPanelUIAbility.class, null);
                }
                this.LLIZLLLIL = iPanelUIAbility;
                boolean z2 = true;
                if (AwemeExtKt.isPhotoMode(aweme)) {
                    View view = this.LL;
                    if (view != null) {
                        C786410Ut5.LJLLLLLL(8, view);
                    }
                } else {
                    View view2 = this.LL;
                    if (view2 != null) {
                        C786410Ut5.LJLLLLLL(0, view2);
                    }
                    if (C287800BPu.LIZ()) {
                        C1565650qqR c1565650qqR = this.LLILLJJLI;
                        if (c1565650qqR != null) {
                            IPlayerComponentAbility iPlayerComponentAbility5 = this.LLILZLL;
                            if ((iPlayerComponentAbility5 == null || (playerManager3 = iPlayerComponentAbility5.getPlayerManager()) == null || !playerManager3.isPlaying()) && (((iPlayerComponentAbility = this.LLILZLL) == null || iPlayerComponentAbility.uz1() != 2) && (((iPlayerComponentAbility2 = this.LLILZLL) == null || iPlayerComponentAbility2.uz1() != 1) && (((iPlayerComponentAbility3 = this.LLILZLL) != null && (playerManager2 = iPlayerComponentAbility3.getPlayerManager()) != null && playerManager2.isPaused()) || (iPlayerComponentAbility4 = this.LLILZLL) == null || iPlayerComponentAbility4.uz1() != 3)))) {
                                z2 = false;
                            }
                            c1565650qqR.LIZ(z2);
                        }
                    } else {
                        C1565650qqR c1565650qqR2 = this.LLILLJJLI;
                        if (c1565650qqR2 != null) {
                            IPlayerComponentAbility iPlayerComponentAbility6 = this.LLILZLL;
                            if (iPlayerComponentAbility6 == null || (playerManager = iPlayerComponentAbility6.getPlayerManager()) == null || !playerManager.isPlaying()) {
                                z2 = false;
                            }
                            c1565650qqR2.LIZ(z2);
                        }
                    }
                    C1565600qqM c1565600qqM = this.LLILLL;
                    if (c1565600qqM != null) {
                        c1565600qqM.LIZIZ();
                    }
                }
            }
            IClearModePanelComponent iClearModePanelComponent2 = this.LLIZ;
            if (iClearModePanelComponent2 != null) {
                iClearModePanelComponent2.LJ1(z);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message != null) {
                this.LLJI.LJ(message);
            }
            C1AF0.LJ(e);
        }
    }
}
