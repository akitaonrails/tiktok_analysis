package X;

import Y.AfS148S0200000_12;
import Y.AfS176S0100000_7;
import Y.AfS184S0100000_15;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.quickconnect.MultiGuestAnchorQuickConnectViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestAnchorQuickConnectSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;
import wh6.AbS696S0100000_15;

/* JADX INFO: renamed from: X.0aLb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C931490aLb extends AbstractC960470b6L<C929360aIA> {
    public final DataChannel LL;
    public final LifecycleOwner LLILLJJLI;
    public final C931450aLX LLILLL;
    public final InterfaceC931560aLi LLILZ;
    public final Function1<Boolean, Unit> LLILZIL;
    public C1295960jpS LLILZLL;
    public C197039127h LLIZ;
    public C16F5 LLIZLLLIL;
    public C16F5 LLJ;
    public ViewGroup LLJI;
    public ViewGroup LLJIJIL;
    public final C01GW LLJILJIL;
    public final C11NJ LLJILJILJ;
    public final C931500aLc LLJILLL;

    public final MultiGuestAnchorQuickConnectViewModel L5() {
        return (MultiGuestAnchorQuickConnectViewModel) this.LLJILJIL.getValue();
    }

    @Override // X.AbstractC960470b6L
    public final void LLIILZL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewRecycled, compositeDisposable.size = ");
        sbLIZ.append(this.LLJILJILJ.LJI());
        C20441214yg.LIZIZ("MultiGuestQuickCallViewHolder", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJILJILJ.LJ();
        C940770aaZ.LIZ().LJJ(this.LLJILLL);
    }

    public final boolean N5() {
        int i;
        PosIdentity posIdentity;
        List<C957020b0m> listLJIIIZ = C940770aaZ.LIZ().getDataSource().LJIIIZ();
        if ((listLJIIIZ instanceof Collection) && listLJIIIZ.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (C957020b0m c957020b0m : listLJIIIZ) {
                if (c957020b0m == null || (posIdentity = c957020b0m.getPosIdentity()) == null || posIdentity.type != 0) {
                    i++;
                    if (i < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
        }
        MultiGuestAnchorQuickConnectViewModel multiGuestAnchorQuickConnectViewModelL5 = L5();
        return (multiGuestAnchorQuickConnectViewModelL5 != null ? multiGuestAnchorQuickConnectViewModelL5.yQ2() : null) == EnumC931540aLg.IDLE && C940770aaZ.LIZ().getDataSource().LJIIIZ().size() > 1 && i >= C940770aaZ.LIZ().getDataSource().LIZJ();
    }

    public final void P5() {
        if (N5()) {
            C197039127h c197039127h = this.LLIZ;
            if (c197039127h != null) {
                C786410Ut5.w5(c197039127h, 0.5f);
                return;
            }
            return;
        }
        C197039127h c197039127h2 = this.LLIZ;
        if (c197039127h2 != null) {
            C786410Ut5.w5(c197039127h2, 1.0f);
        }
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        MultiGuestAnchorQuickConnectViewModel multiGuestAnchorQuickConnectViewModelL5;
        C19475711Hn c19475711Hn;
        C19475711Hn c19475711Hn2;
        int iHashCode;
        C19475711Hn c19475711Hn3;
        C20441214yg.LIZIZ("MultiGuestQuickCallViewHolder", "onBindViewHolder");
        this.LLIZ = (C197039127h) this.itemView.findViewById(R.id.slt);
        this.LLILZLL = (C1295960jpS) this.itemView.findViewById(R.id.sls);
        this.LLIZLLLIL = (C16F5) this.itemView.findViewById(R.id.slx);
        this.LLJ = (C16F5) this.itemView.findViewById(R.id.slv);
        this.LLJI = (ViewGroup) this.itemView.findViewById(R.id.slw);
        this.LLJIJIL = (ViewGroup) this.itemView.findViewById(R.id.slu);
        C931450aLX c931450aLX = this.LLILLL;
        C1295960jpS c1295960jpS = this.LLILZLL;
        Object objYQ2 = null;
        boolean z = false;
        if (!Intrinsics.LJFF(c931450aLX.LIZIZ, c1295960jpS)) {
            C1295960jpS c1295960jpS2 = c931450aLX.LIZIZ;
            if (c1295960jpS2 != null) {
                c1295960jpS2.removeAllAnimatorListeners();
                c1295960jpS2.removeAllLottieOnCompositionLoadedListener();
                c931450aLX.LIZLLL.LJ();
                c1295960jpS2.cancelAnimation();
                c1295960jpS2.setImageDrawable(null);
            }
            c931450aLX.LIZJ = new C11PQ<>();
            c931450aLX.LIZIZ = c1295960jpS;
            MultiGuestAnchorQuickConnectViewModel multiGuestAnchorQuickConnectViewModel = (MultiGuestAnchorQuickConnectViewModel) c931450aLX.LJ.getValue();
            if (multiGuestAnchorQuickConnectViewModel != null && (c19475711Hn3 = multiGuestAnchorQuickConnectViewModel.LLIZ) != null) {
                c931450aLX.LIZLLL.LIZ(new C11IW(c19475711Hn3.LJJIFFI().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new AfS184S0100000_15(c931450aLX, 1))).LJIILL().LJIIZILJ());
            }
            C11PQ<String> c11pq = c931450aLX.LIZJ;
            if (c11pq != null) {
                c931450aLX.LIZLLL.LIZ(new C11IW(c11pq.LJJIFFI().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new AfS148S0200000_12(c1295960jpS, c931450aLX, 9))).LJIILL().LJIIZILJ());
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bindView, viewcode = ");
            C1295960jpS c1295960jpS3 = c931450aLX.LIZIZ;
            if (c1295960jpS3 != null) {
                iHashCode = c1295960jpS3.hashCode();
            } else {
                iHashCode = 0;
            }
            sbLIZ.append(iHashCode);
            sbLIZ.append(", compositeDisposable = ");
            sbLIZ.append(c931450aLX.LIZLLL.LJI());
            C20441214yg.LIZIZ("QuickConnectLottieHelper", C2188811AlT.LIZIZ(sbLIZ));
        }
        C197039127h c197039127h = this.LLIZ;
        if (c197039127h != null) {
            c197039127h.setTextSize(14.0f);
        }
        if (C930540aK4.LJIJJLI()) {
            ViewGroup viewGroup = this.LLJI;
            if (viewGroup != null) {
                C786410Ut5.X5(new C19ME(-1, -2), viewGroup);
            }
            ViewGroup viewGroup2 = this.LLJIJIL;
            if (viewGroup2 != null) {
                C786410Ut5.X5(new C19ME(-1, -2), viewGroup2);
            }
            ViewGroup viewGroup3 = this.LLJIJIL;
            if (viewGroup3 != null) {
                C500260Jjc.LJLJL(0, viewGroup3);
            }
            C197039127h c197039127h2 = this.LLIZ;
            if ((c197039127h2 instanceof View) && c197039127h2 != null) {
                C500260Jjc.LJJZ((int) C497740JfY.LIZIZ(32.0f), c197039127h2);
            }
        }
        P5();
        C197039127h c197039127h3 = this.LLIZ;
        if (c197039127h3 != null) {
            C786410Ut5.I7(new AbS696S0100000_15(this, 0), c197039127h3);
        }
        MultiGuestAnchorQuickConnectViewModel multiGuestAnchorQuickConnectViewModelL52 = L5();
        if (multiGuestAnchorQuickConnectViewModelL52 != null && (c19475711Hn2 = multiGuestAnchorQuickConnectViewModelL52.LLIZ) != null) {
            this.LLJILJILJ.LIZ(new C11IW(c19475711Hn2.LJJIFFI().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new AfS184S0100000_15(this, 12))).LJIILL().LJIIZILJ());
        }
        if (MultiGuestAnchorQuickConnectSetting.INSTANCE.isEnableAndLimitTime() && (multiGuestAnchorQuickConnectViewModelL5 = L5()) != null && (c19475711Hn = multiGuestAnchorQuickConnectViewModelL5.LLIZLLLIL) != null) {
            this.LLJILJILJ.LIZ(new C11IW(c19475711Hn.LJJIFFI().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new AfS176S0100000_7(this, 14))).LJIILL().LJIIZILJ());
        }
        C940770aaZ.LIZ().LJIIZILJ(this.LLJILLL);
        if (!this.LLILZ.LIZIZ()) {
            this.LLILZ.LIZ();
            MultiGuestAnchorQuickConnectViewModel multiGuestAnchorQuickConnectViewModelL53 = L5();
            if (multiGuestAnchorQuickConnectViewModelL53 != null) {
                objYQ2 = multiGuestAnchorQuickConnectViewModelL53.yQ2();
            }
            Object obj2 = EnumC931540aLg.CALLING;
            if (obj2 == null) {
                obj2 = Boolean.FALSE;
            }
            if (objYQ2 == obj2) {
                z = true;
            }
            C922810a7b.LIZJ(Boolean.valueOf(z), "show");
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0aLc] */
    public C931490aLb(View view, DataChannel dataChannel, LifecycleOwner lifecycleOwner, C931450aLX c931450aLX, C931570aLj c931570aLj, Function1 function1) {
        super(view);
        this.LL = dataChannel;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = c931450aLX;
        this.LLILZ = c931570aLj;
        this.LLILZIL = function1;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 76));
        this.LLJILJILJ = new C11NJ();
        this.LLJILLL = new InterfaceC940760aaY() { // from class: X.0aLc
            @Override // X.InterfaceC940760aaY
            public final void LJFF(int i, String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJIJI(LayoutState layoutState, List<SpotInfo> list, MultiGuestLayoutExtra multiGuestLayoutExtra) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJI(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJII(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIII(List<C957020b0m> list) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIJ(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIJIIJIL(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIIJZLJL(C942080acg c942080acg) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onLayoutRenderSuccessEnd,isQuickConnectBtnShouldGrey = ");
                sbLIZ.append(this.LIZ.N5());
                C20441214yg.LIZIZ("MultiGuestQuickCallViewHolder", C2188811AlT.LIZIZ(sbLIZ));
                this.LIZ.P5();
            }
        };
    }
}
