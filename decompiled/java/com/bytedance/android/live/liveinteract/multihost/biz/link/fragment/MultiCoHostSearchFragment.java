package com.bytedance.android.live.liveinteract.multihost.biz.link.fragment;

import X.AbstractC21673719rz;
import X.AbstractC21674919sB;
import X.AbstractC960710b6j;
import X.AnonymousClass0956;
import X.C0DRA;
import X.C0IJT;
import X.C0J8P;
import X.C0WZX;
import X.C1117360fBO;
import X.C1143680frq;
import X.C1161920gLG;
import X.C1324720kZq;
import X.C13BV;
import X.C142Q;
import X.C1697810uHb;
import X.C16FZ;
import X.C1838840xx4;
import X.C1AK1;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2204961BRm;
import X.C304701Gb;
import X.C410901il;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501540Jlg;
import X.C766270U4b;
import X.C782110Um9;
import X.C785410UrT;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C950220apo;
import X.C955510ayL;
import X.C955540ayO;
import X.C955590ayT;
import X.C955650ayZ;
import X.C955980az6;
import X.C957700b1s;
import X.C960610b6Z;
import X.C960750b6n;
import X.C960760b6o;
import X.C960770b6p;
import X.C960780b6q;
import X.C960790b6r;
import X.C960880b70;
import X.C961160b7S;
import X.C962070b8v;
import X.C962250b9D;
import X.C963370bB1;
import X.C963410bB5;
import X.C963750bBd;
import X.C970230bM5;
import X.C972220bPI;
import X.C972230bPJ;
import X.C973020bQa;
import X.C978980baC;
import X.C986900bmy;
import X.C987080bnG;
import X.EnumC959280b4Q;
import X.EnumC961060b7I;
import X.InterfaceC956060azE;
import X.InterfaceC956210azT;
import X.InterfaceC957060b0q;
import X.InterfaceC958410b31;
import X.InterfaceC960800b6s;
import X.InterfaceC963420bB6;
import X.InterfaceC963450bB9;
import X.InterfaceC972200bPG;
import X.InterfaceC973040bQc;
import X.RunnableC781530UlD;
import X.ViewOnFocusChangeListenerC986980bn6;
import Y.ACListenerS150S0100000_15;
import Y.ARunnableS115S0100000_15;
import Y.ATListenerS448S0100000_15;
import Y.AcS496S0100000_15;
import Y.AsS42S0100000_15;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSearchContract$AbsView;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MultiCoHostViolationException;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostShowHistoryListSetting;
import com.bytedance.android.livesdk.livesetting.rank.LiveFriendRankingSetting;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.utils.KeyBoardUtil;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public class MultiCoHostSearchFragment extends MultiCoHostSearchContract$AbsView implements InterfaceC972200bPG, InterfaceC973040bQc, InterfaceC956060azE, InterfaceC956210azT, InterfaceC957060b0q, InterfaceC963420bB6 {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElISHELIOSAgPGsuIDV9JCwiImE1OiQrJCo9PGsBPCMnIQYjASAgPBYpKD0wIAM+KCg+LSs4";
    public DataChannel LLILZIL;
    public LiveEditText LLILZLL;
    public FrameLayout LLIZ;
    public ViewGroup LLIZLLLIL;
    public LiveIconView LLJ;
    public ViewGroup LLJI;
    public LiveDialog LLJIJIL;
    public C16FZ LLJILJIL;
    public RunnableC781530UlD LLJILJILJ;
    public C1117360fBO LLJILLL;
    public ViewGroup LLJJ;
    public AnonymousClass0956 LLJJI;
    public Function1<? super Long, Unit> LLJJIJI;
    public C1324720kZq LLJJIJIIJIL;
    public boolean LLJJJ;
    public int LLJJJIL;
    public boolean LLJJJJ;
    public RecyclerView LLJJJJLIIL;
    public C972230bPJ LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public List<? extends View> LLJJIII = C13BV.INSTANCE;
    public int LLJJIJIL = 1;
    public EnumC961060b7I LLJJJJJIL = EnumC961060b7I.Normal;
    public final C1117360fBO LLJJL = new C1117360fBO();
    public int LLJLIL = -1;
    public final AwS559S0100000_15 LLJLILLLLZIIL = new AwS559S0100000_15(this, 427);

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSearchContract$AbsView
    public final void Kh(Throwable th) {
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        C978980baC c978980baC = new C978980baC();
        c978980baC.LIZJ = ((int) (((double) C497740JfY.LJJI(C497740JfY.LJIILLIIL())) * 0.7d)) + 52;
        c978980baC.LJIILIIL = false;
        c978980baC.LJIIL = false;
        c978980baC.LJFF = this.LLJLILLLLZIIL;
        c978980baC.LJ = CoHostShowHistoryListSetting.INSTANCE.isEnable();
        return c978980baC;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSearchContract$AbsView
    public final boolean UR() {
        RecyclerView recyclerView = this.LLJJJJLIIL;
        boolean z = false;
        if (recyclerView != null && recyclerView.getScrollState() == 0) {
            z = true;
        }
        return !z;
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSearchContract$AbsView
    public final void ZR() {
        C410901il c410901il;
        C1117360fBO c1117360fBO = this.LLJJL;
        AbstractC960710b6j abstractC960710b6j = (AbstractC960710b6j) this.LLILLL;
        if (abstractC960710b6j == null || (c410901il = abstractC960710b6j.LLILZLL) == null) {
            c410901il = new C410901il();
        }
        c1117360fBO.LL = c410901il;
        this.LLJJL.notifyDataSetChanged();
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSearchContract$AbsView
    public final void cS() {
        if (this.mStatusViewValid) {
            C955650ayZ.LIZIZ();
        }
    }

    public final void mS() {
        C1117360fBO c1117360fBO = new C1117360fBO();
        this.LLJILLL = c1117360fBO;
        RunnableC781530UlD runnableC781530UlD = this.LLJILJILJ;
        if (runnableC781530UlD != null) {
            runnableC781530UlD.setAdapter(c1117360fBO);
        }
        C1117360fBO c1117360fBO2 = this.LLJILLL;
        if (c1117360fBO2 != null) {
            c1117360fBO2.LLLI(C955980az6.class, new C963750bBd(this, this, this, this.LLILZIL, true));
        }
        C1117360fBO c1117360fBO3 = this.LLJILLL;
        if (c1117360fBO3 != null) {
            c1117360fBO3.LLLI(C961160b7S.class, new C0J8P<C961160b7S, C963410bB5>() { // from class: X.0bB3
                @Override // X.C0J8P
                public final void LIZJ(RecyclerView.ViewHolder viewHolder, C961160b7S c961160b7S) {
                    ((TextView) ((C963410bB5) viewHolder).LL.getValue()).setText(c961160b7S.LJ);
                }

                @Override // X.C0J8P
                /* JADX INFO: renamed from: LJ */
                public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                    return new C963410bB5(C786410Ut5.Td(layoutInflater, R.layout.grc, viewGroup, false));
                }
            });
        }
        C1117360fBO c1117360fBO4 = this.LLJILLL;
        if (c1117360fBO4 != null) {
            c1117360fBO4.LLLI(C960790b6r.class, new C1AK1(this));
        }
        RunnableC781530UlD runnableC781530UlD2 = this.LLJILJILJ;
        if (runnableC781530UlD2 != null) {
            new C955510ayL(runnableC781530UlD2, null);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C20441214yg.LJIIIZ("MultiCoHostSearchFrag", "Search onDestroy");
        super.onDestroy();
        iS();
        T t = this.LLILLL;
        if (t != 0) {
            t.LJIIIIZZ();
        }
        this.LLILLL = null;
        LiveDialog liveDialog = this.LLJIJIL;
        if (liveDialog != null) {
            liveDialog.dismiss();
            C785410UrT.LIZ(liveDialog);
        }
        if (this.LLJL) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_hourly_user_rank_swipe_to_end");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJIIZI(C2097608Jq.LJIIL(gS(), C2097908Jt.LIZJ(new Pair("last_user_rank", String.valueOf(this.LLJLIL)))));
            c474500IjALIZ.LIZ();
        }
    }

    public final void qS() {
        LiveEditText liveEditText;
        if (this.LLJJJIL >= 3) {
            this.LLJJJIL = 0;
            return;
        }
        LiveEditText liveEditText2 = this.LLILZLL;
        if (liveEditText2 == null || liveEditText2.getParent() == null || (liveEditText = this.LLILZLL) == null) {
            return;
        }
        HandlerHook.viewPostDelay(liveEditText, new ARunnableS115S0100000_15(this, 65), 200L);
    }

    public final void rS() {
        LinearLayoutManager linearLayoutManager;
        int iFindFirstVisibleItemPosition;
        int iFindLastVisibleItemPosition;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        C20441214yg.LJIIIZ("MultiCoHostSearchFrag", "history,visibleItemShowReport");
        RecyclerView recyclerView = this.LLJJJJLIIL;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (!(layoutManager instanceof LinearLayoutManager) || (iFindFirstVisibleItemPosition = (linearLayoutManager = (LinearLayoutManager) layoutManager).findFirstVisibleItemPosition()) > (iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition())) {
            return;
        }
        while (true) {
            RecyclerView recyclerView2 = this.LLJJJJLIIL;
            if (recyclerView2 != null && (viewHolderFindViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition)) != null && (viewHolderFindViewHolderForAdapterPosition instanceof C972220bPI)) {
                ((C972220bPI) viewHolderFindViewHolderForAdapterPosition).L5();
            }
            if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                return;
            } else {
                iFindFirstVisibleItemPosition++;
            }
        }
    }

    public static Map gS() {
        Room roomLIZJ = C950220apo.LIZJ();
        long jIg0 = ((IRankService) C1161920gLG.LIZJ(IRankService.class)).Ig0(RankTypeV2.LJJIIZ.type);
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("anchor_rank", jIg0 < 0 ? "-1" : (1 > jIg0 || jIg0 >= 100) ? CardStruct.IStatusCode.DEFAULT : "1");
        pairArr[1] = new Pair("anchor_id", String.valueOf(roomLIZJ != null ? Long.valueOf(roomLIZJ.getOwnerUserId()) : null));
        pairArr[2] = new Pair("room_id", String.valueOf(roomLIZJ != null ? Long.valueOf(roomLIZJ.getId()) : null));
        pairArr[3] = new Pair("user_type", C950220apo.LJI() ? "anchor" : "user");
        pairArr[4] = new Pair("rank_type", "friends_ranking");
        pairArr[5] = new Pair("page_type", "cohost_search");
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // X.InterfaceC973040bQc
    public final void Qy() {
        iS();
        LiveDialog liveDialog = this.LLJIJIL;
        if (liveDialog != null) {
            C500260Jjc.LJJLIIIJLLLLLLLZ(liveDialog);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSearchContract$AbsView
    public final void ht() {
        C766270U4b.LIZLLL(2131843537);
    }

    public final void iS() {
        if (getContext() == null) {
            return;
        }
        LiveEditText liveEditText = this.LLILZLL;
        if (liveEditText != null) {
            liveEditText.clearFocus();
        }
        KeyBoardUtil.LIZJ(getContext(), this.LLILZLL);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        T t = this.LLILLL;
        C960610b6Z c960610b6Z = t instanceof C960610b6Z ? (C960610b6Z) t : null;
        if (LiveFriendRankingSetting.INSTANCE.getEnableFriendRanking()) {
            if ((c960610b6Z != null ? c960610b6Z.LLJJIJIL : null) == EnumC959280b4Q.FRIENDS_RANKING) {
                AbstractC960710b6j abstractC960710b6j = (AbstractC960710b6j) this.LLILLL;
                if (abstractC960710b6j != null) {
                    abstractC960710b6j.LJIILIIL(this.LLJJJJJIL.getValue());
                    return;
                }
                return;
            }
        }
        AbstractC960710b6j abstractC960710b6j2 = (AbstractC960710b6j) this.LLILLL;
        if (abstractC960710b6j2 != null) {
            abstractC960710b6j2.LJIILJJIL(this.LLJJJJJIL.getValue());
        }
    }

    @Override // X.InterfaceC956210azT
    public final void Kc(Room room) {
        AbstractC960710b6j abstractC960710b6j;
        if (this.mStatusViewValid && (abstractC960710b6j = (AbstractC960710b6j) this.LLILLL) != null) {
            abstractC960710b6j.LJIIJ(room);
        }
    }

    @Override // X.InterfaceC972200bPG
    public final void Ns(String str) {
        LiveEditText liveEditText = this.LLILZLL;
        if (liveEditText != null && liveEditText.hasFocus()) {
            iS();
        }
        this.LLJJJ = true;
        LiveEditText liveEditText2 = this.LLILZLL;
        if (liveEditText2 != null) {
            liveEditText2.setText(str);
        }
        AbstractC960710b6j abstractC960710b6j = (AbstractC960710b6j) this.LLILLL;
        if (abstractC960710b6j != null) {
            abstractC960710b6j.LJIJJLI(str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSearchContract$AbsView
    public final void PR(boolean z) {
        AbstractC960710b6j abstractC960710b6j;
        C1117360fBO c1117360fBO;
        if (this.mStatusViewValid && z && (abstractC960710b6j = (AbstractC960710b6j) this.LLILLL) != null && (c1117360fBO = this.LLJILLL) != null) {
            c1117360fBO.notifyItemRangeChanged(0, abstractC960710b6j.LLILZIL.size() - 1);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSearchContract$AbsView
    public final void RR(Throwable th) throws Throwable {
        if (!this.mStatusViewValid) {
            return;
        }
        LiveEditText liveEditText = this.LLILZLL;
        Editable editableLLLFZ = null;
        if (liveEditText != null) {
            editableLLLFZ = C2204961BRm.LLLFZ(liveEditText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF8AJhVgcdTdZDViJS7KxlteluS4UTf+R2n5Kq6zvG9zOAmqXithS2+iqmR8x/COWp", null));
        }
        if (String.valueOf(editableLLLFZ).length() > 0) {
            nS(this.LLJJ, AFwS203S0000000_15.get$arr$(140));
        }
        C1117360fBO c1117360fBO = this.LLJILLL;
        if (c1117360fBO != null) {
            c1117360fBO.LL = new C410901il();
        }
        C501540Jlg.LJ(getContext(), th);
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSearchContract$AbsView
    public final void SR(boolean z) throws Throwable {
        C410901il c410901il;
        if (!this.mStatusViewValid) {
            return;
        }
        mS();
        LiveEditText liveEditText = this.LLILZLL;
        Editable editableLLLFZ = null;
        if (liveEditText != null) {
            editableLLLFZ = C2204961BRm.LLLFZ(liveEditText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF8AJhVgcdTdZDViJS7KxlteluS4UTf+R2n5Kq6zvG9zOAmqXithS2+iqmR8x/COWp", null));
        }
        if (String.valueOf(editableLLLFZ).length() > 0) {
            if (!z) {
                C1117360fBO c1117360fBO = this.LLJILLL;
                if (c1117360fBO != null) {
                    c1117360fBO.LL = new C410901il();
                }
                nS(this.LLJJ, AFwS203S0000000_15.get$arr$(141));
                return;
            }
            C1117360fBO c1117360fBO2 = this.LLJILLL;
            if (c1117360fBO2 != null) {
                c1117360fBO2.LL.clear();
                AbstractC960710b6j abstractC960710b6j = (AbstractC960710b6j) this.LLILLL;
                if (abstractC960710b6j == null || (c410901il = abstractC960710b6j.LLILZIL) == null) {
                    c410901il = new C410901il();
                }
                c1117360fBO2.LL = c410901il;
                c1117360fBO2.notifyDataSetChanged();
            }
            nS(this.LLJILJILJ, AFwS203S0000000_15.get$arr$(142));
            return;
        }
        C1117360fBO c1117360fBO3 = this.LLJILLL;
        if (c1117360fBO3 != null) {
            c1117360fBO3.LL = new C410901il();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSearchContract$AbsView
    public final void VR(Throwable th) {
        C410901il c410901il;
        C1117360fBO c1117360fBO = this.LLJJL;
        AbstractC960710b6j abstractC960710b6j = (AbstractC960710b6j) this.LLILLL;
        if (abstractC960710b6j == null || (c410901il = abstractC960710b6j.LLILZLL) == null) {
            c410901il = new C410901il();
        }
        c1117360fBO.LL = c410901il;
        this.LLJJL.notifyDataSetChanged();
        if (th instanceof C962070b8v) {
            kS(true);
        }
    }

    @Override // X.InterfaceC963420bB6
    public final void W4(AwS612S0100000_33 awS612S0100000_33) throws Throwable {
        AbstractC960710b6j abstractC960710b6j = (AbstractC960710b6j) this.LLILLL;
        if (abstractC960710b6j != null) {
            LiveEditText liveEditText = this.LLILZLL;
            Editable editableLLLFZ = null;
            if (liveEditText != null) {
                editableLLLFZ = C2204961BRm.LLLFZ(liveEditText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF8AJhVgcdTdZDViJS7KxlteluS4UTf+R2n5Kq6zvG9zOAmqXithS2+iqmR8x/COWp", null));
            }
            abstractC960710b6j.LJIIZILJ(this.LLJJIJIL, String.valueOf(editableLLLFZ), new AwS381S0200000_15(awS612S0100000_33, this, 135));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSearchContract$AbsView
    public final void bS(Throwable th) {
        if (this.mStatusViewValid && !(th instanceof MultiCoHostViolationException)) {
            C501540Jlg.LIZJ(getContext(), th);
        }
    }

    @Override // X.InterfaceC957060b0q
    public final void hk(C955590ayT c955590ayT) {
        AbstractC960710b6j abstractC960710b6j;
        if (this.mStatusViewValid && (abstractC960710b6j = (AbstractC960710b6j) this.LLILLL) != null) {
            abstractC960710b6j.LJIJJ(c955590ayT);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kS(boolean r13) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostSearchFragment.kS(boolean):void");
    }

    public final void oS(boolean z) {
        C410901il c410901il;
        AbstractC960710b6j abstractC960710b6j = (AbstractC960710b6j) this.LLILLL;
        if (abstractC960710b6j != null) {
            abstractC960710b6j.LJJ(z);
        }
        C1117360fBO c1117360fBO = this.LLJJL;
        AbstractC960710b6j abstractC960710b6j2 = (AbstractC960710b6j) this.LLILLL;
        if (abstractC960710b6j2 == null || (c410901il = abstractC960710b6j2.LLILZLL) == null) {
            c410901il = new C410901il();
        }
        c1117360fBO.LL = c410901il;
        this.LLJJL.notifyDataSetChanged();
    }

    @Override // X.InterfaceC972200bPG
    public final void yr(int i) {
        oS(false);
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSearchContract$AbsView
    public final void WR(boolean z, Set<Integer> set) {
        hS(z, set);
        if (!z) {
            kS(false);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSearchContract$AbsView
    public final void aS(boolean z, Set<Integer> set) {
        hS(z, set);
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSearchContract$AbsView
    public final void dS(int i, boolean z) {
        if (!this.mStatusViewValid) {
            return;
        }
        if (z) {
            this.LLJJL.notifyItemChanged(i, C1697810uHb.LJIILJJIL(1));
            return;
        }
        C1117360fBO c1117360fBO = this.LLJILLL;
        if (c1117360fBO == null) {
            return;
        }
        c1117360fBO.notifyItemChanged(i, C1697810uHb.LJIILJJIL(1));
    }

    public final void hS(boolean z, Set<Integer> set) {
        C410901il c410901il;
        C1117360fBO c1117360fBO = this.LLJJL;
        AbstractC960710b6j abstractC960710b6j = (AbstractC960710b6j) this.LLILLL;
        if (abstractC960710b6j == null || (c410901il = abstractC960710b6j.LLILZLL) == null) {
            c410901il = new C410901il();
        }
        c1117360fBO.LL = c410901il;
        if (z) {
            if (set.size() >= this.LLJJL.LL.size()) {
                this.LLJJL.notifyDataSetChanged();
                return;
            }
            Iterator<Integer> it2 = set.iterator();
            while (it2.hasNext()) {
                this.LLJJL.notifyItemChanged(it2.next().intValue());
            }
            return;
        }
        this.LLJJL.notifyDataSetChanged();
    }

    public final void nS(View view, Function0<Boolean> function0) {
        int i;
        for (View view2 : this.LLJJIII) {
            if (view2 != null) {
                if (Intrinsics.LJFF(view2, view) && function0.invoke().booleanValue()) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, view2);
            }
        }
    }

    @Override // X.InterfaceC956060azE
    public final void ns(C955590ayT c955590ayT, Room room) {
        AbstractC960710b6j abstractC960710b6j;
        if (this.mStatusViewValid && (abstractC960710b6j = (AbstractC960710b6j) this.LLILLL) != null) {
            abstractC960710b6j.LJIIJJI(c955590ayT, room);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC21673719rz itemAnimator;
        View rootView;
        Window window;
        super.onViewCreated(view, bundle);
        this.LLJJJJLIIL = (RecyclerView) view.findViewById(R.id.twi);
        this.LLILZLL = (LiveEditText) view.findViewById(R.id.hdi);
        this.LLIZ = (FrameLayout) view.findViewById(R.id.bn4);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.ufm);
        this.LLIZLLLIL = viewGroup;
        C962250b9D.LJIIJJI(2131841208, viewGroup);
        this.LLJILJILJ = (RunnableC781530UlD) view.findViewById(R.id.ue4);
        this.LLJI = (ViewGroup) view.findViewById(R.id.jq3);
        this.LLJ = (LiveIconView) view.findViewById(R.id.cor);
        this.LLJILJIL = (C16FZ) view.findViewById(R.id.uds);
        this.LLJJIJIIJIL = (C1324720kZq) view.findViewById(R.id.lu7);
        this.LLJJ = (ViewGroup) view.findViewById(R.id.mag);
        LiveIconView liveIconView = this.LLJ;
        if (liveIconView != null) {
            C786410Ut5.LLJJIJIL(liveIconView, 8);
        }
        this.LLJJIII = C1697810uHb.LJIIJJI(this.LLJJ, this.LLJILJIL, this.LLJILJILJ, this.LLJJJJLIIL);
        C1143680frq.LIZLLL(this.LLJJIJIIJIL, "tiktok_live_interaction_normal_1", "ttlive_icon_search_large.png");
        LiveIconView liveIconView2 = this.LLJ;
        if (liveIconView2 != null) {
            C786410Ut5.g8(liveIconView2, new ACListenerS150S0100000_15(this, 253));
        }
        LiveEditText liveEditText = this.LLILZLL;
        if (liveEditText != null) {
            liveEditText.addTextChangedListener(new C987080bnG(this, 1));
        }
        LiveEditText liveEditText2 = this.LLILZLL;
        if (liveEditText2 != null) {
            liveEditText2.setOnFocusChangeListener(new ViewOnFocusChangeListenerC986980bn6(this, 1));
        }
        LiveEditText liveEditText3 = this.LLILZLL;
        if (liveEditText3 != null) {
            liveEditText3.setOnEditorActionListener(new C986900bmy(this, 1));
        }
        RecyclerView recyclerView = this.LLJJJJLIIL;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RecyclerView recyclerView2 = this.LLJJJJLIIL;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.LLJJL);
        }
        RecyclerView recyclerView3 = this.LLJJJJLIIL;
        if (recyclerView3 != null) {
            recyclerView3.addOnScrollListener(new AsS42S0100000_15(this, 8));
        }
        RecyclerView recyclerView4 = this.LLJJJJLIIL;
        AbstractC21673719rz itemAnimator2 = null;
        if (recyclerView4 != null) {
            new C955510ayL(recyclerView4, null);
        }
        Context context = getContext();
        if (context != null) {
            C782110Um9 c782110Um9 = new C782110Um9(context);
            c782110Um9.LJIILLIIL = true;
            c782110Um9.LIZJ = C497740JfY.LJIJI(2131841214);
            c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131841213));
            c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131841210), new AcS496S0100000_15(this, 56));
            c782110Um9.LJIIJJI(C497740JfY.LJIJI(2131841209), new C304701Gb());
            c782110Um9.LJIILL = true;
            this.LLJIJIL = c782110Um9.LIZ();
        }
        AsS42S0100000_15 asS42S0100000_15 = new AsS42S0100000_15(this, 10);
        RecyclerView recyclerView5 = this.LLJJJJLIIL;
        if (recyclerView5 != null) {
            recyclerView5.addOnScrollListener(asS42S0100000_15);
        }
        this.LLJJL.LLLI(C960780b6q.class, new C973020bQa(this));
        C972230bPJ c972230bPJ = new C972230bPJ(this, getContext());
        this.LLJJLIIIJLLLLLLLZ = c972230bPJ;
        this.LLJJL.LLLI(C960770b6p.class, c972230bPJ);
        this.LLJJL.LLLI(C961160b7S.class, new C963370bB1(new AwS594S0100000_15(this, 923)));
        this.LLJJL.LLLI(C957700b1s.class, new C963750bBd(this, this, this, this.LLILZIL, false));
        this.LLJJL.LLLI(C960760b6o.class, new C0J8P<C960760b6o, C970230bM5>() { // from class: X.0bM4
            @Override // X.C0J8P
            public final void LIZJ(RecyclerView.ViewHolder viewHolder, C960760b6o c960760b6o) {
                int i;
                C970230bM5 c970230bM5 = (C970230bM5) viewHolder;
                C960760b6o c960760b6o2 = c960760b6o;
                c970230bM5.getClass();
                C0HTI c0hti = new C0HTI();
                c0hti.LIZ = R.drawable.ng;
                ((ImageView) c970230bM5.LL.getValue()).setImageDrawable(c0hti.LIZ(((View) c970230bM5.LL.getValue()).getContext()));
                TextView textView = (TextView) c970230bM5.LLILLJJLI.getValue();
                String strLJIJI = c960760b6o2.LIZ;
                if (strLJIJI == null) {
                    strLJIJI = C497740JfY.LJIJI(2131841122);
                }
                textView.setText(strLJIJI);
                View view2 = (View) c970230bM5.LLILLL.getValue();
                if (c960760b6o2.LIZIZ) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, view2);
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup2) {
                return new C970230bM5(C786410Ut5.Td(layoutInflater, R.layout.gh2, viewGroup2, false));
            }
        });
        this.LLJJL.LLLI(C960750b6n.class, new C0J8P<C960750b6n, C1838840xx4>() { // from class: X.0xx3
            @Override // X.C0J8P
            public final void LJII(RecyclerView.ViewHolder viewHolder) {
                ((C1390410mHn) ((C1838840xx4) viewHolder).LL.getValue()).LIZLLL();
            }

            @Override // X.C0J8P
            public final void LIZJ(RecyclerView.ViewHolder viewHolder, C960750b6n c960750b6n) {
                ((C1390410mHn) ((C1838840xx4) viewHolder).LL.getValue()).LIZJ();
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup2) {
                return new C1838840xx4(C786410Ut5.Td(layoutInflater, R.layout.gh3, viewGroup2, false));
            }
        });
        if (InterfaceC960800b6s.LLLLJI.LIZIZ().size() != 0) {
            oS(true);
        }
        nS(this.LLJJJJLIIL, AFwS203S0000000_15.get$arr$(367));
        RunnableC781530UlD runnableC781530UlD = this.LLJILJILJ;
        if (runnableC781530UlD != null) {
            runnableC781530UlD.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RunnableC781530UlD runnableC781530UlD2 = this.LLJILJILJ;
        if (runnableC781530UlD2 != null) {
            itemAnimator = runnableC781530UlD2.getItemAnimator();
        } else {
            itemAnimator = null;
        }
        if (itemAnimator instanceof AbstractC21674919sB) {
            RunnableC781530UlD runnableC781530UlD3 = this.LLJILJILJ;
            if (runnableC781530UlD3 != null) {
                itemAnimator2 = runnableC781530UlD3.getItemAnimator();
            }
            ((AbstractC21674919sB) itemAnimator2).LLIZ = false;
        }
        mS();
        RunnableC781530UlD runnableC781530UlD4 = this.LLJILJILJ;
        if (runnableC781530UlD4 != null) {
            runnableC781530UlD4.addOnScrollListener(new AsS42S0100000_15(this, 9));
        }
        ViewGroup viewGroup2 = this.LLIZLLLIL;
        if (viewGroup2 != null) {
            viewGroup2.setOnTouchListener(new ATListenerS448S0100000_15(this, 7));
        }
        C962250b9D.LJIIJJI(2131841176, this.LLIZ);
        FrameLayout frameLayout = this.LLIZ;
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new ACListenerS150S0100000_15(this, 255));
        }
        qS();
        if (Build.VERSION.SDK_INT >= 30) {
            InterfaceC963450bB9 interfaceC963450bB9 = this.LL;
            if (interfaceC963450bB9 != null && (window = interfaceC963450bB9.getWindow()) != null) {
                C0DRA.LIZ(window, false);
            }
            InterfaceC963450bB9 interfaceC963450bB92 = this.LL;
            if (interfaceC963450bB92 != null && (rootView = interfaceC963450bB92.getRootView()) != null) {
                rootView.setFitsSystemWindows(true);
            }
        }
        View view2 = getView();
        if (view2 != null) {
            KeyBoardUtil.LIZ(this, view2, new C142Q() { // from class: X.0bB8
                @Override // X.C142Q
                public final void onHide() {
                    C20441214yg.LJIIIZ("MultiCoHostSearchFrag", "onHide");
                    C786410Ut5.LJLIIL(50L, C473410IhP.LIZ(), new ARunnableS115S0100000_15(this.LIZ, 165));
                }

                @Override // X.C142Q
                public final void onShow() {
                    C20441214yg.LJIIIZ("MultiCoHostSearchFrag", "onShow");
                    C786410Ut5.LJLIIL(50L, C473410IhP.LIZ(), new ARunnableS115S0100000_15(this.LIZ, 166));
                }
            }, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r7, android.view.ViewGroup r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostSearchFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.InterfaceC956210azT
    public final void GP(C955590ayT c955590ayT, C955540ayO c955540ayO, boolean z, long j) {
        if (!this.mStatusViewValid) {
            return;
        }
        C960880b70.LIZ(c955590ayT, getContext(), this.LLILZIL);
        C915980Zwa.LJI().LIZ().LLJJI(c955540ayO);
        AbstractC960710b6j abstractC960710b6j = (AbstractC960710b6j) this.LLILLL;
        if (abstractC960710b6j != null) {
            abstractC960710b6j.LJIIIZ(c955590ayT, c955540ayO, z, j);
        }
    }

    @Override // X.InterfaceC956060azE
    public final void ce(C955590ayT c955590ayT, C955540ayO c955540ayO, boolean z, long j, InterfaceC958410b31 interfaceC958410b31) {
        long id;
        if (!this.mStatusViewValid) {
            return;
        }
        Function1<? super Long, Unit> function1 = this.LLJJIJI;
        if (function1 != null) {
            User owner = c955590ayT.LJ.getOwner();
            if (owner != null) {
                id = owner.getId();
            } else {
                id = 0;
            }
            function1.invoke(Long.valueOf(id));
        }
        C915980Zwa.LJI().LIZ().LLJJI(c955540ayO);
        AbstractC960710b6j abstractC960710b6j = (AbstractC960710b6j) this.LLILLL;
        if (abstractC960710b6j != null) {
            abstractC960710b6j.LJIILL(c955590ayT, c955540ayO, z, j);
        }
    }
}
