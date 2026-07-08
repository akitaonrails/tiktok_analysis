package com.bytedance.android.live.liveinteract.multimatch.business.dialog;

import X.AbstractC978910ba5;
import X.C098200Yq;
import X.C0DXR;
import X.C0R9K;
import X.C156900it;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C20174413wk;
import X.C20337914i1;
import X.C20441214yg;
import X.C20736316Cj;
import X.C497740JfY;
import X.C784440Upu;
import X.C786410Ut5;
import X.C914740Zua;
import X.C915980Zwa;
import X.C946050aj5;
import X.C946060aj6;
import X.C973660bRc;
import X.C974210bSV;
import X.C974230bSX;
import X.C974250bSZ;
import X.C978520bZS;
import X.C978930ba7;
import X.C978940ba8;
import X.C978980baC;
import X.InterfaceC1106030et7;
import X.InterfaceC963450bB9;
import X.InterfaceC973730bRj;
import X.InterfaceC975810bV5;
import X.InterfaceC975870bVB;
import Y.ACListenerS150S0100000_15;
import Y.ARunnableS115S0100000_15;
import Y.ARunnableS131S0100000_31;
import Y.AsS42S0100000_15;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.cohost.playentity.DesignatedGiftConfig;
import com.bytedance.android.live.liveinteract.matchv2.connection.combinedmatch.coordinator.TriggerCombinedMatchPanelDismissEvent;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MatchOnlyGiftSelectContract$AbsView;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableSpecificGiftEntranceOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostSelectGiftPageGridEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostSelectGiftPageRefactorEnableSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class MatchOnlyGiftSelectFragment extends MatchOnlyGiftSelectContract$AbsView {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElJC4nHELIOSKy1iKzogISspOjx9LCwtJSA0ZggtPSw7BysgMAg6LjEfLCM2KzEKOy40JSAiPQ==";
    public RecyclerView LLILZ;
    public InterfaceC963450bB9 LLILZIL;
    public boolean LLILZLL;
    public GiftMode LLIZ;
    public boolean LLIZLLLIL;
    public C946060aj6<DesignatedGiftConfig> LLJ;
    public C914740Zua LLJI;
    public final InterfaceC975810bV5 LLJIJIL = C915980Zwa.LJI().LIZLLL();
    public ComposeView LLJILJIL;
    public DataChannel LLJILJILJ;
    public boolean LLJILLL;
    public Function0<Unit> LLJJ;

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        C978980baC c978980baC = new C978980baC();
        c978980baC.LIZ = SpannableString.valueOf(C497740JfY.LJIJI(2131853675));
        c978980baC.LIZJ = (C156900it.LJIIJ() && this.LLJ == null) ? 481 : 307;
        c978980baC.LJIIIIZZ = true;
        boolean z = this.LLIZLLLIL;
        c978980baC.LIZLLL = z;
        c978980baC.LJIIIZ = z;
        LiveIconView liveIconView = new LiveIconView(getContext(), null);
        C786410Ut5.w6(liveIconView, new ViewGroup.LayoutParams((int) C497740JfY.LIZIZ(24.0f), (int) C497740JfY.LIZIZ(24.0f)));
        liveIconView.setIcon(C20736316Cj.LIZLLL(C497740JfY.LJJ() ? R.attr.d3e : R.attr.d33, liveIconView.getContext()));
        C786410Ut5.g8(liveIconView, new ACListenerS150S0100000_15(this, 15));
        c978980baC.LJI = liveIconView;
        c978980baC.LIZIZ();
        c978980baC.LJIILIIL = !LiveCoHostSelectGiftPageGridEnableSetting.INSTANCE.isEnable();
        c978980baC.LJIIJ = new AwS559S0100000_15(this, 525);
        c978980baC.LJIIJJI = new AwS559S0100000_15(this, 526);
        if (C156900it.LJIIJ() && this.LLJ == null) {
            c978980baC.LJIJI = 0;
            c978980baC.LIZ();
            c978980baC.LJIILIIL = false;
        }
        return c978980baC;
    }

    public final void RR() {
        List<GiftMode> listLIZLLL;
        GiftMode next;
        InterfaceC975810bV5 interfaceC975810bV5;
        if (this.LLJI != null) {
            InterfaceC975810bV5 interfaceC975810bV52 = this.LLJIJIL;
            if (interfaceC975810bV52 != null && (listLIZLLL = interfaceC975810bV52.LIZLLL()) != null) {
                Iterator<GiftMode> it2 = listLIZLLL.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    GiftMode giftMode = next;
                    C914740Zua c914740Zua = this.LLJI;
                    if (c914740Zua != null && giftMode.giftId == c914740Zua.LIZIZ) {
                        break;
                    }
                }
                GiftMode giftMode2 = next;
                if (giftMode2 != null && (interfaceC975810bV5 = this.LLJIJIL) != null) {
                    interfaceC975810bV5.LJJIIJZLJL(giftMode2, true, true);
                }
            }
            C914740Zua c914740Zua2 = this.LLJI;
            if (c914740Zua2 != null) {
                C978520bZS.LJIJJ(c914740Zua2.LIZIZ);
            }
        }
    }

    public final void SR() {
        LinearLayoutManager linearLayoutManager;
        int iFindFirstVisibleItemPosition;
        int iFindLastVisibleItemPosition;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        C978940ba8 c978940ba8;
        GiftMode giftMode;
        GiftMode giftMode2;
        String str;
        Map<String, String> mapLIZIZ;
        RecyclerView recyclerView = this.LLILZ;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (!(layoutManager instanceof LinearLayoutManager) || (iFindFirstVisibleItemPosition = (linearLayoutManager = (LinearLayoutManager) layoutManager).findFirstVisibleItemPosition()) > (iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition())) {
            return;
        }
        while (true) {
            RecyclerView recyclerView2 = this.LLILZ;
            if (recyclerView2 != null && (viewHolderFindViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition)) != null && (viewHolderFindViewHolderForAdapterPosition instanceof C978940ba8) && (((giftMode = (c978940ba8 = (C978940ba8) viewHolderFindViewHolderForAdapterPosition).LLJILJILJ) == null || giftMode.giftId != 0) && EnableSpecificGiftEntranceOptimizeSetting.INSTANCE.getValue() && (giftMode2 = c978940ba8.LLJILJILJ) != null && giftMode2.hasFlashEffect)) {
                C20337914i1<Map<String, String>> c20337914i1 = InterfaceC1106030et7.r7;
                if (c20337914i1 == null || (mapLIZIZ = c20337914i1.LIZIZ()) == null) {
                    str = null;
                } else {
                    GiftMode giftMode3 = c978940ba8.LLJILJILJ;
                    str = mapLIZIZ.get(String.valueOf(giftMode3 != null ? Long.valueOf(giftMode3.giftId) : null));
                }
                if (Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
                    HandlerHook.viewPost(c978940ba8.itemView, new ARunnableS131S0100000_31(c978940ba8, 14));
                }
            }
            if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                return;
            } else {
                iFindFirstVisibleItemPosition++;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        C973660bRc.LIZ.LJJZZIII(this.LLJILJILJ, "gift_panel", this.LLILZLL);
        super.onDetach();
    }

    public MatchOnlyGiftSelectFragment() {
        C915980Zwa.LJI().LJI();
        this.LLJJ = AFwS203S0000000_15.get$arr$(149);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C946050aj5 c946050aj5LIZIZ;
        InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
        int i = (interfaceC975870bVBLJFF == null || !interfaceC975870bVBLJFF.LJIIL()) ? 2 : 1;
        InterfaceC975870bVB interfaceC975870bVBLJFF2 = C915980Zwa.LJI().LJFF();
        if (interfaceC975870bVBLJFF2 != null) {
            interfaceC975870bVBLJFF2.LJIILLIIL(false);
        }
        super.onDestroyView();
        C946060aj6<DesignatedGiftConfig> c946060aj6 = this.LLJ;
        if (c946060aj6 != null && (c946050aj5LIZIZ = c946060aj6.LIZIZ()) != null) {
            c946050aj5LIZIZ.LIZIZ(i);
        }
        AbstractC978910ba5 abstractC978910ba5 = (AbstractC978910ba5) this.LLILLL;
        if (abstractC978910ba5 != null) {
            abstractC978910ba5.LJIIJ();
        }
    }

    public static void PR(C914740Zua c914740Zua) {
        C974210bSV c974210bSV = new C974210bSV("start_match", null);
        c974210bSV.LJFF = c914740Zua.LIZ;
        c974210bSV.LJIIIIZZ = new C974230bSX(25);
        c974210bSV.LIZJ = new C974250bSZ(c914740Zua.LIZIZ);
        C784440Upu.LIZ().LIZIZ(c974210bSV);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        DesignatedGiftConfig designatedGiftConfigLIZ;
        List<GiftMode> listLIZLLL;
        InterfaceC975810bV5 interfaceC975810bV5;
        super.onViewCreated(view, bundle);
        if (LiveCoHostSelectGiftPageRefactorEnableSetting.INSTANCE.isEnable()) {
            ComposeView composeView = this.LLJILJIL;
            if (composeView != null) {
                C20174413wk.LIZIZ(composeView, new C19719212De(916338512, new AwS629S0100000_15(this, 40), true));
            }
            C20441214yg.LIZIZ("MatchOnlyGiftSelectFragment", "onViewCreated match compose mode");
            C973660bRc.LIZ.LJJZZI(this.LLJILJILJ, "gift_panel", this.LLILZLL);
            return;
        }
        if (C915980Zwa.LJII().LLILZLL(true).size() <= 1) {
            C978520bZS.LIZ(new AwS594S0100000_15(this, 51), new AwS594S0100000_15(this, 50));
        } else {
            C946060aj6<DesignatedGiftConfig> c946060aj6 = this.LLJ;
            GiftMode giftMode = null;
            if (c946060aj6 != null) {
                designatedGiftConfigLIZ = c946060aj6.LIZ();
            } else {
                designatedGiftConfigLIZ = null;
            }
            if (this.LLJ != null && designatedGiftConfigLIZ != null) {
                InterfaceC975810bV5 interfaceC975810bV52 = this.LLJIJIL;
                if (interfaceC975810bV52 != null && (listLIZLLL = interfaceC975810bV52.LIZLLL()) != null) {
                    Iterator<GiftMode> it2 = listLIZLLL.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        GiftMode next = it2.next();
                        if (next.giftId == designatedGiftConfigLIZ.giftId) {
                            giftMode = next;
                            break;
                        }
                    }
                    GiftMode giftMode2 = giftMode;
                    if (giftMode2 != null && (interfaceC975810bV5 = this.LLJIJIL) != null) {
                        interfaceC975810bV5.LJJIIJZLJL(giftMode2, false, true);
                    }
                }
                C978520bZS.LJIJJ(designatedGiftConfigLIZ.giftId);
            }
            RR();
        }
        DataChannel dataChannel = this.LLJILJILJ;
        if (dataChannel != null) {
            dataChannel.BQ2(this, TriggerCombinedMatchPanelDismissEvent.class, new AwS594S0100000_15(this, 510));
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.iyh);
        this.LLILZ = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 1, false));
        }
        RecyclerView recyclerView2 = this.LLILZ;
        if (recyclerView2 != null) {
            final int iLIZIZ = (int) C497740JfY.LIZIZ(12.0f);
            recyclerView2.addItemDecoration(new C0DXR(iLIZIZ) { // from class: X.06Yx
                public final int LL;

                {
                    this.LL = iLIZIZ;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView3, C21673919s1 c21673919s1) {
                    AbstractC21673619ry adapter = recyclerView3.getAdapter();
                    if (adapter != null) {
                        if (recyclerView3.getChildAdapterPosition(view2) == adapter.getItemCount() - 1) {
                            return;
                        }
                    }
                    rect.bottom = this.LL;
                }
            });
        }
        RecyclerView recyclerView3 = this.LLILZ;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(new C978930ba7(new AwS594S0100000_15(this, 511)));
        }
        C973660bRc.LIZ.LJJZZI(this.LLJILJILJ, "gift_panel", this.LLILZLL);
        AsS42S0100000_15 asS42S0100000_15 = new AsS42S0100000_15(this, 0);
        RecyclerView recyclerView4 = this.LLILZ;
        if (recyclerView4 != null) {
            recyclerView4.addOnScrollListener(asS42S0100000_15);
        }
        if (this.LLJI != null) {
            Iterator<GiftMode> it3 = C978520bZS.LIZIZ().iterator();
            int i = 0;
            while (true) {
                if (it3.hasNext()) {
                    GiftMode next2 = it3.next();
                    C914740Zua c914740Zua = this.LLJI;
                    if (c914740Zua != null && next2.giftId == c914740Zua.LIZIZ) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            RecyclerView recyclerView5 = this.LLILZ;
            if (recyclerView5 != null) {
                recyclerView5.smoothScrollToPosition(i);
            }
        }
        AbstractC978910ba5 abstractC978910ba5 = (AbstractC978910ba5) this.LLILLL;
        if (abstractC978910ba5 != null) {
            abstractC978910ba5.LJIIIZ();
        }
        C0R9K.LIZ(view, new ARunnableS115S0100000_15(this, 75));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.View, androidx.compose.ui.platform.ComposeView] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        GiftMode next;
        ?? Td;
        boolean z;
        C946050aj5 c946050aj5LIZIZ;
        Context context;
        boolean z2 = true;
        C19GS c19gs = null;
        if (LiveCoHostSelectGiftPageRefactorEnableSetting.INSTANCE.isEnable()) {
            if (viewGroup != null && (context = viewGroup.getContext()) != null) {
                Td = new ComposeView(context, null, 6);
                this.LLJILJIL = Td;
                if (!C156900it.LJIIJ() || this.LLJ != null) {
                    z2 = false;
                }
                if (!z2) {
                    Td.setBackgroundColor(C20736316Cj.LIZIZ(R.attr.c5w, getContext()));
                }
            } else {
                Td = 0;
            }
        } else {
            C946060aj6<DesignatedGiftConfig> c946060aj6 = this.LLJ;
            if (c946060aj6 != null && (c946050aj5LIZIZ = c946060aj6.LIZIZ()) != null) {
                c946050aj5LIZIZ.LJFF(0);
            }
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(this.LLILZLL);
            Iterator<GiftMode> it2 = C978520bZS.LIZIZ().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.giftId == C978520bZS.LJIIIIZZ()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            this.LLIZ = next;
            if (interfaceC973730bRjYf2 != null) {
                interfaceC973730bRjYf2.LJIIZILJ(true);
            }
            Td = C786410Ut5.Td(layoutInflater, R.layout.g8g, viewGroup, false);
        }
        boolean z3 = Td instanceof View;
        ?? r2 = Td;
        if (!z3) {
            r2 = 0;
        }
        if (r2 != 0) {
            try {
                ViewTreeLifecycleOwner.set(r2, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(r2, this);
                r2.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return r2;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return r2;
    }
}
