package X;

import Y.ACListenerS158S0100000_24;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IPanelUIAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.PaidContentMiniDramaInfo;
import com.ss.android.ugc.aweme.service.IPaidContentPanelAbility;
import com.ss.android.ugc.feed.platform.panel.clearmode.IClearModePanelComponent;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import irm.AkS91S0100000_24;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: renamed from: X.0qqT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1565670qqT implements InterfaceC1565710qqX, InterfaceC1616070s9l {
    public View LL;
    public String LLILLJJLI;
    public Aweme LLILLL;
    public IPlayerComponentAbility LLILZ;
    public IClearModePanelComponent LLILZIL;
    public IPanelUIAbility LLILZLL;
    public IFeedPanelPlatformAbility LLIZ;
    public IPaidContentPanelAbility LLJI;
    public AwS638S0100000_24 LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final C0S4J LLIZLLLIL = new C0S4J("MiniDramaClearModeImmersiveBarController");
    public final C630740Ooa LLJ = C628500Oky.LIZ(new AwS568S0100000_24(this, 1718));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1712));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1714));
    public final String LLJILJILJ = "handle_play_method";
    public final String LLJILLL = "click_clean_screen_pause_icon";
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1715));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1716));
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(358));
    public int LLJJIJI = 1;
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1717));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1713));

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onBeforePageChange() {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageScrolledEnd(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageSelected(int i, boolean z) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageUnSelected(C0SZ8 c0sz8) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
    }

    public final TuxTextView LJ() {
        return (TuxTextView) this.LLJJI.getValue();
    }

    public final List<Float> LJFF() {
        return (List) this.LLJJIII.getValue();
    }

    public final void LJI() {
        StringBuilder sbLIZ;
        Context context;
        C589960NBy c589960NBy = C589960NBy.LIZ;
        Aweme aweme = this.LLILLL;
        c589960NBy.getClass();
        boolean z = false;
        if (C589960NBy.LIZ(aweme)) {
            TuxTextView tuxTextViewLJ = LJ();
            if (tuxTextViewLJ != null) {
                tuxTextViewLJ.setEnabled(true);
            }
            TuxTextView tuxTextViewLJ2 = LJ();
            if (tuxTextViewLJ2 != null) {
                tuxTextViewLJ2.setTextColorRes(R.attr.zl);
            }
        } else {
            C0S4J c0s4j = this.LLIZLLLIL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cannot speed aid: ");
            Aweme aweme2 = this.LLILLL;
            sbLIZ2.append(aweme2 != null ? aweme2.getAid() : null);
            c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
            TuxTextView tuxTextViewLJ3 = LJ();
            if (tuxTextViewLJ3 != null) {
                tuxTextViewLJ3.setEnabled(false);
            }
            TuxTextView tuxTextViewLJ4 = LJ();
            if (tuxTextViewLJ4 != null) {
                tuxTextViewLJ4.setTextColorRes(R.attr.zk);
            }
        }
        float fLIZIZ = C589960NBy.LIZIZ(this.LLILLL);
        int i = 0;
        for (Float f : LJFF()) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            if (fLIZIZ >= f.floatValue()) {
                this.LLJJIJI = i;
            }
            i = i2;
        }
        TuxTextView tuxTextViewLJ5 = LJ();
        if (tuxTextViewLJ5 != null) {
            View view = this.LL;
            if (view != null && (context = view.getContext()) != null && C426750GoL.LIZLLL(context)) {
                z = true;
            }
            if (z) {
                sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((char) 215);
                sbLIZ.append(fLIZIZ);
            } else {
                sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(fLIZIZ);
                sbLIZ.append((char) 215);
            }
            tuxTextViewLJ5.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJII() {
        Context context;
        PaidContentInfo paidContentInfo;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
        Integer videoCountInList;
        PaidContentInfo paidContentInfo2;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ2;
        Integer episodeNumInList;
        Context context2;
        Resources resources;
        PaidContentInfo paidContentInfo3;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ3;
        Integer videoCountInList2;
        Aweme aweme = this.LLILLL;
        String string = null;
        if (aweme != null && C718510SGj.LIZJ(aweme)) {
            Aweme aweme2 = this.LLILLL;
            int iIntValue = (aweme2 == null || (paidContentInfo3 = aweme2.mPaidContentInfo) == null || (paidContentMiniDramaInfoLIZ3 = C718180SFc.LIZ(paidContentInfo3)) == null || (videoCountInList2 = paidContentMiniDramaInfoLIZ3.getVideoCountInList()) == null) ? 0 : videoCountInList2.intValue();
            View view = this.LL;
            if (view != null && (context2 = view.getContext()) != null && (resources = context2.getResources()) != null) {
                string = resources.getQuantityString(2131755462, iIntValue, Integer.valueOf(iIntValue));
            }
        } else {
            Aweme aweme3 = this.LLILLL;
            int iIntValue2 = (aweme3 == null || (paidContentInfo2 = aweme3.mPaidContentInfo) == null || (paidContentMiniDramaInfoLIZ2 = C718180SFc.LIZ(paidContentInfo2)) == null || (episodeNumInList = paidContentMiniDramaInfoLIZ2.getEpisodeNumInList()) == null) ? 0 : episodeNumInList.intValue();
            Aweme aweme4 = this.LLILLL;
            int iIntValue3 = (aweme4 == null || (paidContentInfo = aweme4.mPaidContentInfo) == null || (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo)) == null || (videoCountInList = paidContentMiniDramaInfoLIZ.getVideoCountInList()) == null) ? 0 : videoCountInList.intValue();
            View view2 = this.LL;
            if (view2 != null && (context = view2.getContext()) != null) {
                string = context.getString(2131839413, String.valueOf(iIntValue2), String.valueOf(iIntValue3));
            }
        }
        TextView textView = (TextView) this.LLJJJ.getValue();
        if (textView != null) {
            textView.setText(string);
        }
    }

    @Override // X.InterfaceC1565710qqX
    public final void LIZ() {
        C622680Oba.LIZLLL(this);
        AwS638S0100000_24 awS638S0100000_24 = this.LLJJIJIIJIL;
        if (awS638S0100000_24 != null) {
            C589960NBy.LIZ.getClass();
            ((ArrayList) C589960NBy.LJFF).remove(awS638S0100000_24);
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJ.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Xl0(this);
        }
    }

    @Override // X.InterfaceC1565710qqX
    public final EnumC1565700qqW LIZJ(C737030Svd c737030Svd) {
        return C1565680qqU.LIZ(c737030Svd);
    }

    public final void LJIIIIZZ(boolean z) {
        int i;
        TuxIconView tuxIconView = (TuxIconView) this.LLJJ.getValue();
        if (tuxIconView != null) {
            if (z) {
                i = R.raw.icon_pause_fill;
            } else {
                i = R.raw.icon_play_fill;
            }
            tuxIconView.setIconRes(i);
        }
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        Aweme awemeLJIIIIZZ;
        boolean z;
        int i2;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = this.LLIZ;
        if (iFeedPanelPlatformAbility != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbility.LJIIIIZZ()) != null) {
            this.LLILLL = awemeLJIIIIZZ;
            LJII();
            Aweme aweme = this.LLILLL;
            int i3 = 0;
            if (aweme != null && C0SFC.LIZIZ.LJIIIIZZ(aweme)) {
                z = true;
            } else {
                z = false;
            }
            View view = (View) this.LLJIJIL.getValue();
            if (view != null) {
                if (!z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                C786410Ut5.LJLLLLLL(i2, view);
            }
            View view2 = (View) this.LLJILJIL.getValue();
            if (view2 != null) {
                if (!(!z)) {
                    i3 = 8;
                }
                C786410Ut5.LJLLLLLL(i3, view2);
            }
        }
    }

    @C14EU
    public final void onPlayerControllerVideoStatusEvent(C722910SXh c722910SXh) {
        C0S4J c0s4j = this.LLIZLLLIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPlayerControllerVideoStatusEvent ");
        sbLIZ.append(c722910SXh.LIZJ);
        c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        int i = c722910SXh.LIZJ;
        if (i != 1) {
            if (i == 2) {
                LJIIIIZZ(true);
                return;
            }
            return;
        }
        LJIIIIZZ(false);
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        C0N0Y playerManager;
        IPlayerComponentAbility iPlayerComponentAbility;
        IPlayerComponentAbility iPlayerComponentAbility2;
        IPlayerComponentAbility iPlayerComponentAbility3;
        IPlayerComponentAbility iPlayerComponentAbility4;
        C0N0Y playerManager2;
        C0N0Y playerManager3;
        if (c737030Svd.LIZ == 88) {
            boolean z = true;
            if (C287800BPu.LIZ()) {
                IPlayerComponentAbility iPlayerComponentAbility5 = this.LLILZ;
                if ((iPlayerComponentAbility5 == null || (playerManager3 = iPlayerComponentAbility5.getPlayerManager()) == null || !playerManager3.isPlaying()) && (((iPlayerComponentAbility = this.LLILZ) == null || iPlayerComponentAbility.uz1() != 2) && (((iPlayerComponentAbility2 = this.LLILZ) == null || iPlayerComponentAbility2.uz1() != 1) && (((iPlayerComponentAbility3 = this.LLILZ) != null && (playerManager2 = iPlayerComponentAbility3.getPlayerManager()) != null && playerManager2.isPaused()) || (iPlayerComponentAbility4 = this.LLILZ) == null || iPlayerComponentAbility4.uz1() != 3)))) {
                    z = false;
                }
                LJIIIIZZ(z);
                return;
            }
            IPlayerComponentAbility iPlayerComponentAbility6 = this.LLILZ;
            if (iPlayerComponentAbility6 == null || (playerManager = iPlayerComponentAbility6.getPlayerManager()) == null || !playerManager.isPlaying()) {
                z = false;
            }
            LJIIIIZZ(z);
        }
    }

    @Override // X.InterfaceC1565710qqX
    public final View LIZLLL(C19EG c19eg, ViewGroup viewGroup) {
        int i;
        C0N0Y playerManager;
        this.LLIZLLLIL.LJIIIZ("createBottomView");
        View viewLIZLLL = C20673215v0.LIZLLL(R.layout.bhr, C1388190mED.LIZ(c19eg), viewGroup, false);
        this.LL = viewLIZLLL;
        View view = (View) this.LLJIJIL.getValue();
        if (view != null) {
            C786410Ut5.I7(new ACListenerS158S0100000_24(this, 78), view);
        }
        C2271391DvN.LIZ((View) this.LLJIJIL.getValue(), (C1A5L) C2271381DvM.LJJJLL.getValue());
        TuxIconView tuxIconView = (TuxIconView) this.LLJJ.getValue();
        if (tuxIconView != null) {
            IPlayerComponentAbility iPlayerComponentAbility = this.LLILZ;
            if (iPlayerComponentAbility != null && (playerManager = iPlayerComponentAbility.getPlayerManager()) != null && playerManager.isPlaying()) {
                i = R.raw.icon_pause_fill;
            } else {
                i = R.raw.icon_play_fill;
            }
            tuxIconView.setIconRes(i);
        }
        TuxIconView tuxIconView2 = (TuxIconView) this.LLJJ.getValue();
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS158S0100000_24(this, 79));
        }
        C2271391DvN.LIZ((View) this.LLJJ.getValue(), (C1A5L) C2271381DvM.LJJJLZIJ.getValue());
        TuxTextView tuxTextViewLJ = LJ();
        if (tuxTextViewLJ != null) {
            C786410Ut5.h9(tuxTextViewLJ, new ACListenerS158S0100000_24(this, 80));
        }
        C2271391DvN.LIZ(LJ(), (C1A5L) C2271381DvM.LJJJZ.getValue());
        TuxTextView tuxTextViewLJ2 = LJ();
        if (tuxTextViewLJ2 != null) {
            tuxTextViewLJ2.LJJJJI(14.0f);
        }
        AwS638S0100000_24 awS638S0100000_24 = new AwS638S0100000_24(this, 160);
        this.LLJJIJIIJIL = awS638S0100000_24;
        C589960NBy.LIZ.getClass();
        ((ArrayList) C589960NBy.LJFF).add(awS638S0100000_24);
        View view2 = (View) this.LLJJJIL.getValue();
        if (view2 != null) {
            C786410Ut5.I7(new AkS91S0100000_24(this, 19), view2);
        }
        C622680Oba.LIZJ(this);
        return viewLIZLLL;
    }

    @Override // X.InterfaceC1565710qqX
    public final void LIZIZ(C737030Svd c737030Svd, Aweme aweme, boolean z, Fragment fragment) {
        String aid;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ;
        IPlayerComponentAbility iPlayerComponentAbilityX32;
        IPaidContentPanelAbility iPaidContentPanelAbility;
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
        InterfaceC665370Q7z interfaceC665370Q7zLJ3;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ2;
        Aweme awemeLJIIIIZZ;
        try {
            this.LLILLJJLI = c737030Svd.LJ;
            this.LLILLL = aweme;
            C0S4J c0s4j = this.LLIZLLLIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleCustomizedLogic eventType:");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append("  aid:");
            Aweme aweme2 = this.LLILLL;
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
                this.LLIZ = iFeedPanelPlatformAbilityLIZJ;
                if (iFeedPanelPlatformAbilityLIZJ != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbilityLIZJ.LJIIIIZZ()) != null) {
                    this.LLILLL = awemeLJIIIIZZ;
                }
                IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJ.getValue();
                boolean z2 = true;
                if (iViewPagerComponentAbility != null && !this.LLJJIJIL) {
                    iViewPagerComponentAbility.Bv0(this);
                    this.LLJJIJIL = true;
                }
                if (fragment == null || (iFeedPanelPlatformAbilityLIZJ2 = C0T1R.LIZJ(fragment)) == null) {
                    iPlayerComponentAbilityX32 = null;
                } else {
                    iPlayerComponentAbilityX32 = iFeedPanelPlatformAbilityLIZJ2.x32();
                }
                this.LLILZ = iPlayerComponentAbilityX32;
                if (fragment == null || (interfaceC665370Q7zLJ3 = C1578630rBN.LJ(fragment)) == null) {
                    iPaidContentPanelAbility = null;
                } else {
                    iPaidContentPanelAbility = (IPaidContentPanelAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ3, IPaidContentPanelAbility.class, null);
                }
                this.LLJI = iPaidContentPanelAbility;
                if (fragment == null || (interfaceC665370Q7zLJ2 = C1578630rBN.LJ(fragment)) == null) {
                    iClearModePanelComponent = null;
                } else {
                    iClearModePanelComponent = (IClearModePanelComponent) C1558520qew.LIZ(interfaceC665370Q7zLJ2, IClearModePanelComponent.class, null);
                }
                this.LLILZIL = iClearModePanelComponent;
                if (fragment != null && (interfaceC665370Q7zLJ = C1578630rBN.LJ(fragment)) != null) {
                    iPanelUIAbility = (IPanelUIAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, IPanelUIAbility.class, null);
                }
                this.LLILZLL = iPanelUIAbility;
                if (C287800BPu.LIZ()) {
                    IPlayerComponentAbility iPlayerComponentAbility5 = this.LLILZ;
                    if ((iPlayerComponentAbility5 == null || (playerManager3 = iPlayerComponentAbility5.getPlayerManager()) == null || !playerManager3.isPlaying()) && (((iPlayerComponentAbility = this.LLILZ) == null || iPlayerComponentAbility.uz1() != 2) && (((iPlayerComponentAbility2 = this.LLILZ) == null || iPlayerComponentAbility2.uz1() != 1) && (((iPlayerComponentAbility3 = this.LLILZ) != null && (playerManager2 = iPlayerComponentAbility3.getPlayerManager()) != null && playerManager2.isPaused()) || (iPlayerComponentAbility4 = this.LLILZ) == null || iPlayerComponentAbility4.uz1() != 3)))) {
                        z2 = false;
                    }
                    LJIIIIZZ(z2);
                } else {
                    IPlayerComponentAbility iPlayerComponentAbility6 = this.LLILZ;
                    if (iPlayerComponentAbility6 == null || (playerManager = iPlayerComponentAbility6.getPlayerManager()) == null || !playerManager.isPlaying()) {
                        z2 = false;
                    }
                    LJIIIIZZ(z2);
                }
                LJI();
                LJII();
            }
            IClearModePanelComponent iClearModePanelComponent2 = this.LLILZIL;
            if (iClearModePanelComponent2 != null) {
                iClearModePanelComponent2.LJ1(z);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message != null) {
                this.LLIZLLLIL.LJ(message);
            }
            C1AF0.LJ(e);
        }
    }
}
