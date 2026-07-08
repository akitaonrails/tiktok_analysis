package X;

import Y.ACListenerS145S0100000_10;
import Y.ACallableS417S0100000_10;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchRefreshPredictMobCanShowVM;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS659S0100000_10;

/* JADX INFO: renamed from: X.0Prt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C658270Prt extends AbstractViewOnAttachStateChangeListenerC654600Ply implements InterfaceC658400Ps6, InterfaceC648350Pbt {
    public static final C658370Ps3 LLJJJJ = new C658370Ps3(C653580PkK.LIZJ);
    public final C658370Ps3 LLIZ;
    public final InterfaceC1631620sYq<View, Integer, Aweme, Unit> LLIZLLLIL;
    public final InterfaceC656470Poz LLJ;
    public final C658530PsJ LLJI;
    public final FrameLayout LLJIJIL;
    public final SmartImageView LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public C1012300cRw LLJJ;
    public final View LLJJI;
    public final View LLJJIII;
    public Aweme LLJJIJI;
    public final C658330Prz LLJJIJIIJIL;
    public int LLJJIJIL;
    public SearchRefreshPredictMobCanShowVM LLJJJ;
    public boolean LLJJJIL;

    public C658270Prt() {
        throw null;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean L0() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJLIIIJLLLLLLLZ() {
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean LLLLIIIILLL() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LLZZZIL(C587060N0u c587060N0u) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void Mu(C650630PfZ c650630PfZ) {
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean N1() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final View getDetectView() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final InterfaceC584630MwP getPreload() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final C0PCQ getPriority() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        return false;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean l2() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void release() {
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayMetrics(C664400Q4g c664400Q4g) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayableLifecycleListener(InterfaceC659190PtN interfaceC659190PtN) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void wp(C650630PfZ c650630PfZ) {
    }

    @Override // X.InterfaceC648350Pbt
    public final Boolean z3() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJJLIIL() {
        this.LLJI.getLiveCore().LJI();
    }

    @Override // X.InterfaceC648350Pbt
    public final String getDebugId() {
        return C655580PnY.LIZ(this);
    }

    @Override // X.InterfaceC648350Pbt
    public final View p0() {
        return this.itemView;
    }

    @Override // X.InterfaceC658400Ps6
    public final void A5(final InterfaceC641090PCp interfaceC641090PCp) {
        this.LLJI.getLiveCore().getDataProvider().LIZ = new InterfaceC641090PCp() { // from class: X.0PCj
            @Override // X.InterfaceC641090PCp
            public final Fragment LIZ() {
                return interfaceC641090PCp.LIZ();
            }

            @Override // X.InterfaceC641090PCp
            public final Context getContext() {
                return interfaceC641090PCp.getContext();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
            @Override // X.InterfaceC641090PCp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.String getIdentifier() {
                /*
                    r7 = this;
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    java.lang.String r0 = "AladdinAweme_"
                    r4.<init>(r0)
                    com.ss.android.ugc.aweme.search.common.utils.SAFHelper r6 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LIZ
                    X.0Prt r0 = r7.LIZ
                    android.view.View r5 = r0.itemView
                    android.content.Context r0 = r5.getContext()
                    X.0JEh r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJII(r0)
                    r3 = 0
                    if (r0 == 0) goto L3b
                    X.198i r2 = r0.LIZLLL()
                    if (r2 == 0) goto L3b
                L1e:
                    X.0Prt r0 = r7.LIZ
                    android.view.View r0 = r0.itemView
                    android.content.Context r0 = r0.getContext()
                    if (r0 == 0) goto L2c
                    android.app.Activity r3 = X.C1388190mED.LIZ(r0)
                L2c:
                    r6.getClass()
                    java.lang.Integer r0 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJIJIIJI(r2, r3)
                    r4.append(r0)
                    java.lang.String r0 = r4.toString()
                    return r0
                L3b:
                    android.content.Context r0 = r5.getContext()
                    android.app.Activity r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
                    if (r0 == 0) goto L66
                    android.content.Context r0 = r5.getContext()
                    android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
                    boolean r0 = X.C294780Bgy.LIZ()
                    if (r0 == 0) goto L59
                    boolean r0 = r1 instanceof X.InterfaceC214897198d
                    if (r0 != 0) goto L66
                L57:
                    r2 = r3
                    goto L1e
                L59:
                    boolean r0 = r1 instanceof X.InterfaceC214897198d
                    if (r0 == 0) goto L57
                    X.198d r1 = (X.InterfaceC214897198d) r1
                    boolean r0 = r1.getEnableSAF()
                    if (r0 != 0) goto L66
                    goto L57
                L66:
                    androidx.fragment.app.Fragment r2 = X.C946803n0.LIZ(r5)
                    if (r2 == 0) goto L57
                    android.content.Context r0 = r2.getContext()
                    if (r0 == 0) goto L81
                    android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
                L76:
                    boolean r0 = X.C294780Bgy.LIZ()
                    if (r0 == 0) goto L83
                    boolean r0 = r1 instanceof X.InterfaceC214897198d
                    if (r0 != 0) goto L92
                    goto L57
                L81:
                    r1 = r3
                    goto L76
                L83:
                    boolean r0 = r1 instanceof X.InterfaceC214897198d
                    if (r0 == 0) goto L57
                    X.198d r1 = (X.InterfaceC214897198d) r1
                    boolean r0 = r1.getEnableSAF()
                    if (r0 != 0) goto L92
                    goto L57
                L90:
                    if (r2 == 0) goto L57
                L92:
                    boolean r0 = r2 instanceof X.InterfaceC214902198i
                    if (r0 == 0) goto L99
                    X.198i r2 = (X.InterfaceC214902198i) r2
                    goto L1e
                L99:
                    androidx.fragment.app.Fragment r2 = r2.getParentFragment()
                    goto L90
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C641030PCj.getIdentifier():java.lang.String");
            }
        };
    }

    public final void R5(EnumC655500PnQ enumC655500PnQ) {
        C1012300cRw c1012300cRw;
        C2174741A9g c2174741A9g = C2174741A9g.LIZIZ;
        if (c2174741A9g.LJIILJJIL()) {
            C659080PtC.LIZ = false;
            c2174741A9g.LJIILL("general_search", enumC655500PnQ, C0SVP.STYLE_NO_BUTTON);
        }
        int i = !C659080PtC.LIZIZ() ? 1 : 0;
        C659080PtC.LIZJ(i);
        this.LLJI.getLiveCore().setMute(C659080PtC.LIZ(C07P0.LIZIZ() ? 1 : 0, 0, this.LLJJIJI));
        C1011980cRQ c1011980cRQ = EnumC1012120cRe.Companion;
        C659080PtC.LJFF();
        int i2 = C659080PtC.LIZIZ;
        c1011980cRQ.getClass();
        EnumC1012120cRe enumC1012120cReLIZ = C1011980cRQ.LIZ(i2);
        if (enumC1012120cReLIZ != null && (c1012300cRw = this.LLJJ) != null) {
            c1012300cRw.LIZ(enumC1012120cReLIZ, false);
        }
        Aweme aweme = this.LLJJIJI;
        if (aweme != null) {
            C663180Pzo c663180Pzo = C663180Pzo.LIZ;
            String aid = aweme.getAid();
            c663180Pzo.getClass();
            C663180Pzo.LJII(i, aid);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S5(final android.view.View r7) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r6.LLJJIJI
            if (r3 != 0) goto L5
            return
        L5:
            boolean r0 = X.C0OBG.LIZIZ(r7)
            if (r0 == 0) goto Lc
            return
        Lc:
            boolean r0 = X.C0P9N.LIZ()
            if (r0 == 0) goto L13
            return
        L13:
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto Lba
            com.ss.android.ugc.aweme.search.common.utils.SAFHelper r5 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LIZ
            android.content.Context r0 = r7.getContext()
            X.0JEh r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJII(r0)
            if (r0 == 0) goto L3b
            X.198i r4 = r0.LIZLLL()
            if (r4 == 0) goto L3b
        L31:
            r5.getClass()
            android.app.Activity r0 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJIIIIZZ(r4)
            if (r0 != 0) goto L9f
            return
        L3b:
            android.content.Context r0 = r7.getContext()
            android.app.Activity r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
            r4 = 0
            if (r0 == 0) goto L66
            android.content.Context r0 = r7.getContext()
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L59
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L66
            goto L31
        L59:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L31
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L66
            goto L31
        L66:
            androidx.fragment.app.Fragment r2 = X.C946803n0.LIZ(r7)
            if (r2 == 0) goto L31
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L81
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L76:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L83
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L92
            goto L31
        L81:
            r1 = r4
            goto L76
        L83:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L31
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L92
            goto L31
        L90:
            if (r2 == 0) goto L31
        L92:
            boolean r0 = r2 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L9a
            r4 = r2
            X.198i r4 = (X.InterfaceC214902198i) r4
            goto L31
        L9a:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto L90
        L9f:
            com.ss.android.ugc.aweme.ILoginService r2 = X.C0XQ7.LIZJ()
            X.0XQS r1 = new X.0XQS
            r1.<init>()
            r1.LIZ = r0
            X.0Ps4 r0 = new X.0Ps4
            r0.<init>()
            r1.LJ = r0
            X.0XQT r0 = new X.0XQT
            r0.<init>(r1)
            r2.showLoginAndRegisterView(r0)
            return
        Lba:
            r6.P5(r7, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C658270Prt.S5(android.view.View):void");
    }

    @Override // X.AbstractViewOnAttachStateChangeListenerC654600Ply, android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        InterfaceC655270Pn3 interfaceC655270Pn3;
        AbstractC653010PjP abstractC653010PjP;
        super.onViewAttachedToWindow(view);
        C646200PWg.LJFF(this.LLJI.getLiveCore());
        C652990PjN c652990PjN = this.LLJI.getLiveCore().getDataProvider().LIZJ;
        if (c652990PjN != null && (abstractC653010PjP = this.LLJI.getLiveCore().getDataProvider().LIZLLL) != null) {
            abstractC653010PjP.LIZ = 0;
            abstractC653010PjP.LIZIZ = false;
            abstractC653010PjP.LIZIZ();
            c652990PjN.LIZIZ.add(abstractC653010PjP);
        }
        C15O7.LIZJ(new ACallableS417S0100000_10(this, 2));
        SAFHelper sAFHelper = SAFHelper.LIZ;
        View view2 = this.itemView;
        C19EG c19egL5 = L5();
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJJII = SAFHelper.LJJII(view2, c19egL5);
        if ((lifecycleOwnerLJJII instanceof InterfaceC655270Pn3) && (interfaceC655270Pn3 = (InterfaceC655270Pn3) lifecycleOwnerLJJII) != null) {
            interfaceC655270Pn3.registerActivityOnKeyDownListener(this.LLJJIJIIJIL);
        }
        if (C0PPZ.LIZ() && this.LLJJJ == null) {
            this.LLJJJ = C0P72.LIZ(C946803n0.LIZ(this.itemView));
        }
        this.LLJJJIL = true;
    }

    @Override // X.AbstractViewOnAttachStateChangeListenerC654600Ply, android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        InterfaceC655270Pn3 interfaceC655270Pn3;
        super.onViewDetachedFromWindow(view);
        C646200PWg.LJI(this.LLJI.getLiveCore());
        InterfaceC655620Pnc interfaceC655620Pnc = this.LLJI.getLiveCore().getDataProvider().LJ;
        if (interfaceC655620Pnc != null) {
            interfaceC655620Pnc.onDestroy();
        }
        C652990PjN c652990PjN = this.LLJI.getLiveCore().getDataProvider().LIZJ;
        if (c652990PjN != null) {
            c652990PjN.LJ(this.LLJI.getLiveCore().getDataProvider().LIZLLL);
        }
        SAFHelper sAFHelper = SAFHelper.LIZ;
        View view2 = this.itemView;
        C19EG c19egL5 = L5();
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJJII = SAFHelper.LJJII(view2, c19egL5);
        if ((lifecycleOwnerLJJII instanceof InterfaceC655270Pn3) && (interfaceC655270Pn3 = (InterfaceC655270Pn3) lifecycleOwnerLJJII) != null) {
            interfaceC655270Pn3.unRegisterActivityOnKeyDownListener(this.LLJJIJIIJIL);
        }
        this.LLJJJIL = false;
    }

    public final void P5(View view, Aweme aweme) {
        C658220Pro.LLJIJIL = aweme.getAid();
        C1012300cRw c1012300cRw = this.LLJJ;
        if (c1012300cRw != null) {
            C786410Ut5.r1(c1012300cRw, 8);
        }
        InterfaceC1631620sYq<View, Integer, Aweme, Unit> interfaceC1631620sYq = this.LLIZLLLIL;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(view, Integer.valueOf(this.LLJJIJIL), aweme);
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final void W0(long j, C587060N0u c587060N0u) {
        String str;
        Aweme aweme = this.LLJJIJI;
        if (aweme != null && aweme.getIsLiveHasProduct()) {
            str = "ecom";
        } else {
            str = "";
        }
        this.LLJI.getLiveCore().setLivePlayerEntranceParam(new C1699360uK6("general_search", "hot_user_native", "", str, false, true, 8));
        this.LLJI.getLiveCore().LLLLLIL();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0Prz] */
    public C658270Prt(View view, C658370Ps3 c658370Ps3, AwS659S0100000_10 awS659S0100000_10, InterfaceC656470Poz interfaceC656470Poz) {
        boolean z;
        int iIntValue;
        super(view);
        this.LLIZ = c658370Ps3;
        this.LLIZLLLIL = awS659S0100000_10;
        this.LLJ = interfaceC656470Poz;
        C658530PsJ c658530PsJ = (C658530PsJ) this.itemView.findViewById(R.id.user_live_view);
        this.LLJI = c658530PsJ;
        this.LLJIJIL = (FrameLayout) this.itemView.findViewById(R.id.user_live_view_container);
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.user_live_cover);
        this.LLJILJIL = smartImageView;
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1139));
        this.LLJILLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1153));
        View viewFindViewById = this.itemView.findViewById(R.id.user_live_video_container_layout);
        this.LLJJI = viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(R.id.user_live_tag);
        this.LLJJIII = viewFindViewById2;
        this.LLJJIJIIJIL = new InterfaceC1399350mWD() { // from class: X.0Prz
            @Override // X.InterfaceC1399350mWD
            public final /* synthetic */ boolean Fi() {
                return false;
            }

            @Override // X.InterfaceC1399350mWD
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                EnumC655500PnQ enumC655500PnQ;
                if (this.LL.LLJI.getLiveCore().isPlaying() && C2174741A9g.LIZIZ.LJIILJJIL()) {
                    if (i == 24 || i == 25) {
                        C658270Prt c658270Prt = this.LL;
                        if (i == 24) {
                            enumC655500PnQ = EnumC655500PnQ.TURN_UP_VOLUME;
                        } else {
                            enumC655500PnQ = EnumC655500PnQ.TURN_DOWN_VOLUME;
                        }
                        c658270Prt.R5(enumC655500PnQ);
                        return false;
                    }
                    return false;
                }
                return false;
            }
        };
        View view2 = this.itemView;
        Context context = view2.getContext();
        Integer numValueOf = Integer.valueOf(C1913107eT.LIZJ());
        if (numValueOf.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 4;
        }
        view2.setOutlineProvider(new C663220Pzs((int) C661350Pwr.LIZ(iIntValue, context)));
        view2.setClipToOutline(true);
        if (!c658370Ps3.LIZIZ) {
            C786410Ut5.I7(new ACListenerS145S0100000_10(this, 74), view2);
        }
        C657990PrR.LIZJ(this.itemView, new AwS589S0100000_10(this, 534));
        Integer numValueOf2 = Integer.valueOf(C1913107eT.LIZIZ());
        if (numValueOf2.intValue() > 0) {
            float fLIZIZ = C418440Gaw.LIZIZ(numValueOf2);
            if (viewFindViewById2 != null) {
                C661350Pwr.LJ(viewFindViewById2, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ);
            }
        }
        Integer numValueOf3 = Integer.valueOf(C1913107eT.LJ());
        if (numValueOf3.intValue() > 0) {
            C0HXV.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(numValueOf3.intValue()))), viewFindViewById);
        }
        new AwS589S0100000_10(this, 531).invoke(new C658910Psv());
        C786410Ut5.sa(c658530PsJ, new ACListenerS145S0100000_10(this, 73));
        c658530PsJ.setMCoverView(smartImageView);
        c658530PsJ.getLiveCore().LIZ(new AwS554S0100000_10(this, 1135));
        C1524805y2.LIZIZ(0L, new AwS554S0100000_10(this, 1143));
    }
}
