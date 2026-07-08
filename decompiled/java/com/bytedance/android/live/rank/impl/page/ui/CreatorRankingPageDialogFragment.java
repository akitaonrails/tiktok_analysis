package com.bytedance.android.live.rank.impl.page.ui;

import X.AbstractC21673619ry;
import X.C01GW;
import X.C0TZM;
import X.C1166310gSL;
import X.C13LP;
import X.C1697580uHE;
import X.C1749280vcc;
import X.C1779500wPM;
import X.C1785320wYk;
import X.C1785390wYr;
import X.C1785460wYy;
import X.C1785470wYz;
import X.C1785510wZ3;
import X.C1786010wZr;
import X.C1786100wa0;
import X.C1786170wa7;
import X.C1786390waT;
import X.C1846060y8i;
import X.C1864580yca;
import X.C20441214yg;
import X.C20632315oP;
import X.C23250099c;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C748880TZe;
import X.C760380TsC;
import X.C786410Ut5;
import X.C861560Xr0;
import X.C991790bur;
import X.EnumC452301pR;
import X.InterfaceC1786180wa8;
import X.InterfaceC1846110y8n;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS161S0100000_27;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel;
import com.bytedance.android.live.rank.impl.page.ui.CreatorRankingPageDialogFragment;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class CreatorRankingPageDialogFragment extends LiveDialogFragment implements InterfaceC1786180wa8 {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiOy49I2slJD8/ZjUtHELIOSLip9PSxiCj02KTEjOx0yJi4lJygDKSIpDSYyJCorDz0yLygpJzs=";
    public final C01GW LL;
    public boolean LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public boolean LLILZIL;
    public C1846060y8i LLILZLL;
    public View LLIZ;
    public TuxTextView LLIZLLLIL;
    public View LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public View LLJILJIL;
    public LiveIconView LLJILJILJ;
    public LiveIconView LLJILLL;
    public View LLJJ;
    public LiveIconView LLJJI;
    public TuxTextView LLJJIII;
    public C20632315oP LLJJIJI;
    public View LLJJIJIIJIL;
    public C1749280vcc LLJJIJIL;
    public final C01GW LLJJJ;
    public final C1786100wa0 LLJJJIL;
    public final C1864580yca LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    @Override // X.InterfaceC1786180wa8
    public final Fragment qx() {
        return this;
    }

    @Override // X.InterfaceC1786180wa8
    public final View Cb() {
        C1779500wPM c1779500wPM;
        Fragment next;
        CreatorRankingFirstTabPageFragment creatorRankingFirstTabPageFragment;
        C20632315oP c20632315oP;
        C1785470wYz c1785470wYz;
        List<C1779500wPM> list;
        C1779500wPM c1779500wPM2;
        Fragment next2;
        CreatorRankingSubPageFragment creatorRankingSubPageFragment;
        C1785320wYk c1785320wYk;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        View viewFindViewByPosition;
        View viewFindViewById;
        Bundle arguments;
        Bundle arguments2;
        C20632315oP c20632315oP2 = this.LLJJIJI;
        if (c20632315oP2 != null && (c1779500wPM = (C1779500wPM) C13LP.LJJJLZIJ(c20632315oP2.getCurrentItem(), ((C1785460wYy) MR().LLILLJJLI.getValue()).LIZIZ.LIZ)) != null) {
            int i = c1779500wPM.LIZ;
            Iterator<Fragment> it2 = getChildFragmentManager().LJJLIIIJL().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                Fragment fragment = next;
                if ((fragment instanceof CreatorRankingFirstTabPageFragment) && (arguments2 = fragment.getArguments()) != null && arguments2.getInt("arg_first_rank_type") == i && fragment.getView() != null) {
                    break;
                }
            }
            if ((next instanceof CreatorRankingFirstTabPageFragment) && (creatorRankingFirstTabPageFragment = (CreatorRankingFirstTabPageFragment) next) != null && (c20632315oP = creatorRankingFirstTabPageFragment.LLJI) != null) {
                int currentItem = c20632315oP.getCurrentItem();
                C1785510wZ3 c1785510wZ3 = creatorRankingFirstTabPageFragment.LLJILJILJ;
                if (c1785510wZ3 != null && (c1785470wYz = c1785510wZ3.LIZ) != null && (list = c1785470wYz.LIZ) != null && (c1779500wPM2 = (C1779500wPM) C13LP.LJJJLZIJ(currentItem, list)) != null) {
                    int i2 = c1779500wPM2.LIZ;
                    Iterator<Fragment> it3 = creatorRankingFirstTabPageFragment.getChildFragmentManager().LJJLIIIJL().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                        Fragment fragment2 = next2;
                        if ((fragment2 instanceof CreatorRankingSubPageFragment) && (arguments = fragment2.getArguments()) != null && arguments.getInt("arg_rank_type") == i2 && fragment2.getView() != null) {
                            break;
                        }
                    }
                    if ((next2 instanceof CreatorRankingSubPageFragment) && (creatorRankingSubPageFragment = (CreatorRankingSubPageFragment) next2) != null && (c1785320wYk = ((C1785460wYy) creatorRankingSubPageFragment.NR().LLILLJJLI.getValue()).LJ) != null) {
                        int i3 = c1785320wYk.LIZ.LIZ.type;
                        Bundle arguments3 = creatorRankingSubPageFragment.getArguments();
                        if (i3 == (arguments3 != null ? arguments3.getInt("arg_rank_type") : 0) && c1785320wYk.LIZ.LIZIZ != -1 && (c1785320wYk.LIZIZ instanceof C1785390wYr) && (viewOnAttachStateChangeListenerC20604515jv = creatorRankingSubPageFragment.LLILLL) != null && viewOnAttachStateChangeListenerC20604515jv.getVisibility() == 0) {
                            RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
                            if ((layoutManager instanceof LinearLayoutManager) && layoutManager != null && (viewFindViewByPosition = layoutManager.findViewByPosition(0)) != null && (viewFindViewById = viewFindViewByPosition.findViewById(R.id.dxd)) != null && viewFindViewById.getVisibility() == 0) {
                                return viewFindViewById;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC1786180wa8
    public final boolean LLIL() {
        DataChannel dataChannel = this.dataChannel;
        return dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel);
    }

    public final CreatorRankingPageViewModel MR() {
        return (CreatorRankingPageViewModel) this.LL.getValue();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C20441214yg.LIZIZ("CreatorRankingPageDialogFragment", "createParams");
        DataChannel dataChannel = this.dataChannel;
        this.LLILLJJLI = C500260Jjc.LJJIJIL(dataChannel != null ? (Boolean) dataChannel.gg0(C0TZM.class) : null);
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g5e);
        c500980Jkm.LIZJ = this.LLILLJJLI ? R.style.ahb : C497740JfY.LJJ() ? R.style.ahf : R.style.ahg;
        c500980Jkm.LJII = this.LLILLJJLI ? 80 : C497740JfY.LJJ() ? 3 : 5;
        c500980Jkm.LJI = 0.0f;
        c500980Jkm.LJIIIZ = this.LLILLJJLI ? -1 : C497740JfY.LJIIIZ(R.dimen.arw);
        c500980Jkm.LJIIJ = C760380TsC.LIZ(this, this.LLILLJJLI);
        return c500980Jkm;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        C20441214yg.LIZIZ("CreatorRankingPageDialogFragment", "isSheet");
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C1846060y8i c1846060y8i = this.LLILZLL;
        if (c1846060y8i != null) {
            c1846060y8i.LJIIL(this.LLJJJIL);
        }
        C20632315oP c20632315oP = this.LLJJIJI;
        if (c20632315oP != null) {
            c20632315oP.LJI(this.LLJJJJ);
        }
        LiveIconView liveIconView = this.LLJILJILJ;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, null);
        }
        LiveIconView liveIconView2 = this.LLJILLL;
        if (liveIconView2 != null) {
            C786410Ut5.g8(liveIconView2, null);
        }
        LiveIconView liveIconView3 = this.LLJJI;
        if (liveIconView3 != null) {
            C786410Ut5.g8(liveIconView3, null);
        }
        C20632315oP c20632315oP2 = this.LLJJIJI;
        if (c20632315oP2 != null) {
            c20632315oP2.setAdapter(null);
        }
        this.LLILZIL = false;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C20441214yg.LIZIZ("CreatorRankingPageDialogFragment", "onPause");
        C1786010wZr c1786010wZrTw = tw();
        c1786010wZrTw.LIZJ();
        c1786010wZrTw.LIZJ = false;
        MR().onEvent(new C991790bur(false));
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        C20441214yg.LIZIZ("CreatorRankingPageDialogFragment", "onResume");
        super.onResume();
        C1786010wZr c1786010wZrTw = tw();
        if (!c1786010wZrTw.LIZJ) {
            c1786010wZrTw.LIZJ = true;
        }
        MR().onEvent(new C991790bur(true));
    }

    @Override // X.InterfaceC1786180wa8
    public final C1786010wZr tw() {
        return (C1786010wZr) this.LLJJJJJIL.getValue();
    }

    @Override // X.InterfaceC1786180wa8
    public final FragmentManager xG() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            return (FragmentManager) dataChannel.gg0(C748880TZe.class);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0wa0] */
    public CreatorRankingPageDialogFragment() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LL = C452501pT.LIZ(enumC452301pR, new AwS571S0100000_27(this, 100));
        this.LLILLJJLI = true;
        this.LLJJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 99));
        this.LLJJJIL = new InterfaceC1846110y8n() { // from class: X.0wa0
            @Override // X.InterfaceC1846110y8n
            public final void LIZ(C1845940y8W c1845940y8W) {
            }

            @Override // X.InterfaceC1846110y8n
            public final void LIZJ(C1845940y8W c1845940y8W) {
            }

            @Override // X.InterfaceC1846110y8n
            public final void LIZIZ(C1845940y8W c1845940y8W) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFirstTabSelectedByClick position=");
                sbLIZ.append(c1845940y8W.LIZLLL);
                sbLIZ.append(" programmatic=");
                sbLIZ.append(this.LIZ.LLILZIL);
                C20441214yg.LIZIZ("CreatorRankingPageDialogFragment", C2188811AlT.LIZIZ(sbLIZ));
                CreatorRankingPageDialogFragment creatorRankingPageDialogFragment = this.LIZ;
                if (creatorRankingPageDialogFragment.LLILZIL) {
                    return;
                }
                creatorRankingPageDialogFragment.MR().onEvent(new C991820buu(c1845940y8W.LIZLLL, true));
            }
        };
        this.LLJJJJ = new C1864580yca(this, 1);
        this.LLJJJJJIL = C452501pT.LIZ(enumC452301pR, new AwS571S0100000_27(this, 97));
        this.LLJJJJLIIL = C452501pT.LIZ(enumC452301pR, new AwS571S0100000_27(this, 98));
    }

    @Override // X.InterfaceC1786180wa8
    public final Context Eu() {
        return getContext();
    }

    @Override // X.InterfaceC1786180wa8
    public final boolean Mi() {
        Bundle arguments = getArguments();
        return arguments != null && arguments.getLong("arg_period") == -1;
    }

    @Override // X.InterfaceC1786180wa8
    public final CreatorRankingPageViewModel YI() {
        return MR();
    }

    @Override // X.InterfaceC1786180wa8
    public final String o5() {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("arg_source")) == null) {
            string = "";
        }
        return string.length() == 0 ? "room_entrance_click" : string;
    }

    @Override // X.InterfaceC1786180wa8
    public final int zv() {
        View view = getView();
        return (int) C497740JfY.LJJI(view != null ? view.getHeight() : C760380TsC.LIZ(this, this.LLILLJJLI));
    }

    @Override // X.InterfaceC1786180wa8
    public final boolean Lz() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1786180wa8
    public final long Qx() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1786180wa8
    public final void UJ() {
        dismissAllowingStateLoss();
    }

    @Override // X.InterfaceC1786180wa8
    public final DataChannel getDataChannel() {
        return this.dataChannel;
    }

    @Override // X.InterfaceC1786180wa8
    public final long hg() {
        return this.LLILZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x018f  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r30) {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.page.ui.CreatorRankingPageDialogFragment.onCreate(android.os.Bundle):void");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C20441214yg.LIZIZ("CreatorRankingPageDialogFragment", "onViewCreated");
        super.onViewCreated(view, bundle);
        view.setFitsSystemWindows(true);
        this.LLILZLL = (C1846060y8i) view.findViewById(R.id.f8z);
        this.LLIZ = view.findViewById(R.id.f9c);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.f90);
        this.LLIZLLLIL = tuxTextView;
        if (tuxTextView != null) {
            TuxTextView.LJJJJ(tuxTextView, 19.0f, 25, C1697580uHE.LIZIZ(0.0f, 800, 36.0f, 0.0f, Float.valueOf(19.0f), 0.0f, 0, null, 233), tuxTextView.getLetterSpacing());
        }
        this.LLJ = view.findViewById(R.id.f9d);
        this.LLJI = (TuxTextView) view.findViewById(R.id.f9e);
        this.LLJIJIL = (TuxTextView) view.findViewById(R.id.f9f);
        this.LLJILJIL = view.findViewById(R.id.f8t);
        this.LLJILJILJ = (LiveIconView) view.findViewById(R.id.f91);
        this.LLJILLL = (LiveIconView) view.findViewById(R.id.f8w);
        this.LLJJ = view.findViewById(R.id.f94);
        this.LLJJI = (LiveIconView) view.findViewById(R.id.f92);
        this.LLJJIII = (TuxTextView) view.findViewById(R.id.f95);
        this.LLJJIJI = (C20632315oP) view.findViewById(R.id.f8y);
        this.LLJJIJIIJIL = view.findViewById(R.id.f8v);
        this.LLJJIJIL = (C1749280vcc) view.findViewById(R.id.f9g);
        C1749280vcc c1749280vcc = this.LLJJIJIL;
        if (c1749280vcc != null) {
            C1786390waT c1786390waT = C1786390waT.LIZ;
            Context contextRequireContext = requireContext();
            c1786390waT.getClass();
            C1786390waT.LIZ(c1749280vcc, contextRequireContext);
        }
        C20632315oP c20632315oP = this.LLJJIJI;
        if (c20632315oP != null) {
            c20632315oP.setAdapter((AbstractC21673619ry) this.LLJJJ.getValue());
        }
        C1846060y8i c1846060y8i = this.LLILZLL;
        if (c1846060y8i != null) {
            C20632315oP c20632315oP2 = this.LLJJIJI;
            if (c20632315oP2 == null) {
                return;
            }
            C20441214yg.LIZIZ("TuxTabBarViewPager2Exts", "setupWithViewPager2 enter");
            c1846060y8i.LIZ(new C1786170wa7(c20632315oP2));
            c20632315oP2.LIZIZ(new C1166310gSL(c1846060y8i));
        }
        C1846060y8i c1846060y8i2 = this.LLILZLL;
        if (c1846060y8i2 != null) {
            c1846060y8i2.LIZ(this.LLJJJIL);
        }
        C20632315oP c20632315oP3 = this.LLJJIJI;
        if (c20632315oP3 != null) {
            c20632315oP3.LIZIZ(this.LLJJJJ);
        }
        LiveIconView liveIconView = this.LLJILJILJ;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS161S0100000_27(this, 21));
        }
        LiveIconView liveIconView2 = this.LLJILLL;
        if (liveIconView2 != null) {
            C786410Ut5.g8(liveIconView2, new ACListenerS161S0100000_27(this, 22));
        }
        LiveIconView liveIconView3 = this.LLJJI;
        if (liveIconView3 != null) {
            C786410Ut5.g8(liveIconView3, new ACListenerS161S0100000_27(this, 23));
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C861560Xr0(this, null), 3);
    }
}
