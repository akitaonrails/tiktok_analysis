package com.bytedance.android.live.liveinteract.multihost.biz.link.fragment;

import X.AbstractC960410b6F;
import X.AbstractC960950b77;
import X.AbstractC962030b8r;
import X.C01GW;
import X.C08JC;
import X.C0J8P;
import X.C0U4C;
import X.C1117360fBO;
import X.C1152520g66;
import X.C1161920gLG;
import X.C1533950q1J;
import X.C158B;
import X.C1697810uHb;
import X.C1826800xde;
import X.C1935407i4;
import X.C20441214yg;
import X.C20484615Do;
import X.C2188811AlT;
import X.C410901il;
import X.C439101nJ;
import X.C452501pT;
import X.C481090Itn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C5182020e;
import X.C781290Ukp;
import X.C786410Ut5;
import X.C944300agG;
import X.C950220apo;
import X.C950660aqW;
import X.C955400ayA;
import X.C955440ayE;
import X.C955540ayO;
import X.C955580ayS;
import X.C956020azA;
import X.C956080azG;
import X.C956150azN;
import X.C956250azX;
import X.C957680b1q;
import X.C958770b3b;
import X.C959600b4w;
import X.C960320b66;
import X.C960330b67;
import X.C960370b6B;
import X.C960380b6C;
import X.C960390b6D;
import X.C960450b6J;
import X.C960480b6M;
import X.C960600b6Y;
import X.C960890b71;
import X.C961000b7C;
import X.C961160b7S;
import X.C961180b7U;
import X.C961340b7k;
import X.C961360b7m;
import X.C961370b7n;
import X.C961400b7q;
import X.C961410b7r;
import X.C961420b7s;
import X.C961510b81;
import X.C961520b82;
import X.C961600b8A;
import X.C961630b8D;
import X.C961710b8L;
import X.C961750b8P;
import X.C961770b8R;
import X.C961780b8S;
import X.C961790b8T;
import X.C961820b8W;
import X.C961830b8X;
import X.C961940b8i;
import X.C962010b8p;
import X.C962140b92;
import X.C962340b9M;
import X.C962380b9Q;
import X.C962530b9f;
import X.C962600b9m;
import X.C962620b9o;
import X.C962640b9q;
import X.C962650b9r;
import X.C962660b9s;
import X.C963150bAf;
import X.C963330bAx;
import X.C963760bBe;
import X.C978980baC;
import X.EnumC952640ati;
import X.EnumC955720ayg;
import X.EnumC961080b7K;
import X.InterfaceC954810axD;
import X.InterfaceC960350b69;
import X.InterfaceC962690b9v;
import X.RunnableC781530UlD;
import Y.ACListenerS150S0100000_15;
import Y.ACListenerS154S0100000_19;
import Y.ARunnableS1S0104000_1;
import Y.ARunnableS21S0201000_15;
import Y.ARunnableS26S0101000_15;
import Y.AUListenerS222S0200000_15;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.link.viewbinder.randomlinkmic.InteractRandomLinkMicLargeViewBinder;
import com.bytedance.android.live.liveinteract.multihost.biz.link.viewbinder.randomlinkmic.InteractRandomLinkMicSmallViewBinder$InteractRandomLinkMicSmallViewHolder$showSelectInterestTagView$2;
import com.bytedance.android.live.liveinteract.multihost.biz.quickcohost.service.IQuickCoHostService;
import com.bytedance.android.livesdk.chatroom.interact.model.QuickCohostContent;
import com.bytedance.android.livesdk.chatroom.interact.model.QuickCohostContentInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import com.bytedance.android.livesdk.chatroom.model.interact.ActivityBadgeInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostInviteListPerformanceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostInvitationMonitorSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostScrollAndInsertionMoveSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostAllowQuickInviteWithManualInviteSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.text.a0;
import kotlin.text.u;
import wh6.AbS696S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiHostInviteListFragmentV2 extends BaseMultiHostInviteListFragment implements InterfaceC960350b69, InterfaceC962690b9v {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElISAgPGHELIOSsuIDV9JCwiImE1OiQrJCo9PGsBPCMnIQ0jOjsaJjMlPSofITY4Dz0yLygpJzsFeg==";
    public long LLJLLL;
    public boolean LLJZ;
    public boolean LLLF;
    public C961940b8i LLLFF;
    public C950660aqW LLLFFI;
    public String LLJZIJLIL = "call";
    public final long LLL = SystemClock.uptimeMillis();
    public final C01GW LLLFZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(143));
    public final C01GW LLLI = C1935407i4.LIZ(new C5182020e(this, 74));
    public final C01GW LLLII = C1935407i4.LIZ(new AwS559S0100000_15(this, 434));

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.BaseMultiHostInviteListFragment
    public final String getName() {
        return "INVITE_MULTI_CO_HOST_USER_LIST_FRAGMENT";
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void mS() {
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.BaseMultiHostInviteListFragment
    public final void BS() {
        this.LLJJI.LLLI(C956150azN.class, new C962140b92(this, this, this, this.LLJJ));
        C1117360fBO c1117360fBO = this.LLJJI;
        final boolean z = this.LLJ;
        c1117360fBO.LLLI(C961160b7S.class, new C0J8P<C961160b7S, C1826800xde>(z) { // from class: X.0xdd
            public final boolean LIZIZ;

            {
                this.LIZIZ = z;
            }

            @Override // X.C0J8P
            public final void LIZJ(RecyclerView.ViewHolder viewHolder, C961160b7S c961160b7S) {
                C1826800xde c1826800xde = (C1826800xde) viewHolder;
                C961160b7S c961160b7S2 = c961160b7S;
                ((TextView) c1826800xde.LL.getValue()).setText(c961160b7S2.LJ);
                if (this.LIZIZ) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((View) c1826800xde.LL.getValue()).getLayoutParams();
                    marginLayoutParams.topMargin = C1338790kwX.LIZ(10.0f);
                    C786410Ut5.y6((C16F5) c1826800xde.LL.getValue(), marginLayoutParams);
                }
                View view = (View) c1826800xde.LLILLJJLI.getValue();
                if (!a0.LJJJIL(c961160b7S2.LJI)) {
                    C450720Hlu c450720Hlu = new C450720Hlu(view.getContext());
                    C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                    c1391600mJi.LIZIZ = view;
                    c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
                    c1391600mJi.LJII = -1001L;
                    c450720Hlu.LLILZ = c961160b7S2.LJI;
                    c450720Hlu.LJI(C20736316Cj.LIZIZ(R.attr.ezm, C1834150xpV.LJII(view.getContext())));
                    c450720Hlu.LLILLJJLI.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    C786410Ut5.I7(new ACListenerS154S0100000_19(c450720Hlu.LIZIZ(), 233), view);
                    C500260Jjc.LLFFF(view);
                } else {
                    C500260Jjc.LJIILIIL(view);
                }
                C960940b76.LIZIZ(c1826800xde, c961160b7S2);
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C1826800xde(C786410Ut5.Td(layoutInflater, R.layout.grb, viewGroup, false));
            }
        });
        this.LLJJI.LLLI(C961780b8S.class, new C0J8P<C961780b8S, C961630b8D>() { // from class: X.0b7t
            @Override // X.C0J8P
            public final void LIZJ(RecyclerView.ViewHolder viewHolder, C961780b8S c961780b8S) {
                C960940b76.LIZIZ(viewHolder, c961780b8S);
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                final View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gra, viewGroup, false);
                return new RecyclerView.ViewHolder(viewTd) { // from class: X.0b8D
                    public final C01GW LL;

                    {
                        super(viewTd);
                        this.LL = C1935407i4.LIZ(new AwS559S0100000_15(viewTd, 760));
                    }
                };
            }
        });
        C1117360fBO c1117360fBO2 = this.LLJJI;
        final DataChannel dataChannel = this.LLJJ;
        final AbstractC960950b77 abstractC960950b77 = (AbstractC960950b77) this.LLILLL;
        c1117360fBO2.LLLI(C961790b8T.class, new AbstractC960410b6F<C961790b8T, C962340b9M>(this, this, dataChannel, abstractC960950b77) { // from class: X.0b9L
            public final LifecycleOwner LIZIZ;
            public final DataChannel LIZJ;
            public final AbstractC960950b77 LIZLLL;

            @Override // X.AbstractC960410b6F
            public final String LJIIIZ() {
                return "InteractRandomLinkMicTimeoutViewBinder";
            }

            @Override // X.AbstractC960410b6F
            public final AbstractC960400b6E LJIIIIZZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                User owner;
                ImageModel avatarThumb;
                final View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gvw, viewGroup, false);
                final LifecycleOwner lifecycleOwner = this.LIZIZ;
                final DataChannel dataChannel2 = this.LIZJ;
                final AbstractC960950b77 abstractC960950b772 = this.LIZLLL;
                AbstractC962390b9R<C961790b8T> abstractC962390b9R = new AbstractC962390b9R<C961790b8T>(viewTd, lifecycleOwner, dataChannel2, abstractC960950b772) { // from class: X.0b9M
                    public final DataChannel LLJJLIIIJLLLLLLLZ;

                    @Override // X.AbstractC960400b6E
                    public final String getName() {
                        return "InteractRandomLinkMicTimeoutViewHolder";
                    }

                    @Override // X.InterfaceC956600b06
                    public final DataChannel getDataChannel() {
                        return this.LLJJLIIIJLLLLLLLZ;
                    }

                    @Override // X.AbstractC960400b6E
                    public final void I5(List list, int i, Object obj) {
                        String strLJIJI;
                        C1143680frq.LIZLLL((View) this.LLJILJIL.getValue(), "tiktok_live_interaction_normal_1", "ttlive_bg_upgrade_random_linkmic.png");
                        if (LiveCohostAllowQuickInviteWithManualInviteSetting.INSTANCE.isEnable()) {
                            C16FS c16fsD0 = d0();
                            if (c16fsD0 != null) {
                                C949960apO.LIZLLL(c16fsD0, this.LLJJLIIIJLLLLLLLZ, false, true, 4);
                            }
                            C16F5 c16f5S5 = S5();
                            if (c16f5S5 != null) {
                                C16FS c16fsD02 = d0();
                                if (c16fsD02 != null && c16fsD02.isEnabled() && C949960apO.LIZ()) {
                                    strLJIJI = C497740JfY.LJIJI(2131851777);
                                } else {
                                    strLJIJI = C497740JfY.LJIJI(2131851742);
                                }
                                c16f5S5.setText(strLJIJI);
                            }
                        }
                    }

                    {
                        this.LLJJLIIIJLLLLLLLZ = dataChannel2;
                    }
                };
                C16FS c16fsD0 = abstractC962390b9R.d0();
                if (c16fsD0 != null) {
                    c16fsD0.setMaxWidth(Integer.MAX_VALUE);
                }
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room != null) {
                    owner = room.getOwner();
                } else {
                    owner = null;
                }
                C1099610eil c1099610eilU5 = abstractC962390b9R.U5();
                if (c1099610eilU5 != null) {
                    if (owner != null) {
                        avatarThumb = owner.getAvatarThumb();
                    } else {
                        avatarThumb = null;
                    }
                    C1121670fIL.LJIILIIL(c1099610eilU5, avatarThumb, c1099610eilU5.getWidth(), c1099610eilU5.getHeight(), R.drawable.el_);
                }
                C16FS c16fsD02 = abstractC962390b9R.d0();
                if (c16fsD02 != null) {
                    C949960apO.LIZJ(c16fsD02, this.LIZJ, null, null, 56);
                }
                return abstractC962390b9R;
            }

            {
                this.LIZIZ = this;
                this.LIZJ = dataChannel;
                this.LIZLLL = abstractC960950b77;
            }
        });
        this.LLJJI.LLLI(C961820b8W.class, new InteractRandomLinkMicLargeViewBinder(this, this, this.LLJJ, (AbstractC960950b77) this.LLILLL));
        if (!C1152520g66.LIZ()) {
            C1117360fBO c1117360fBO3 = this.LLJJI;
            final DataChannel dataChannel2 = this.LLJJ;
            final AbstractC960950b77 abstractC960950b772 = (AbstractC960950b77) this.LLILLL;
            c1117360fBO3.LLLI(C961830b8X.class, new AbstractC960410b6F<C961830b8X, C962380b9Q>(this, this, dataChannel2, abstractC960950b772) { // from class: X.0b9N
                public final InterfaceC962020b8q LIZIZ;
                public final LifecycleOwner LIZJ;
                public final DataChannel LIZLLL;
                public final AbstractC960950b77 LJ;

                @Override // X.AbstractC960410b6F
                public final String LJIIIZ() {
                    return "InteractRandomLinkMicSmallViewBinder";
                }

                @Override // X.AbstractC960410b6F
                public final AbstractC960400b6E LJIIIIZZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                    final View viewLIZIZ = C943970afj.LIZIZ(layoutInflater, viewGroup.getContext(), C962250b9D.LJFF(), viewGroup);
                    final InterfaceC962020b8q interfaceC962020b8q = this.LIZIZ;
                    final LifecycleOwner lifecycleOwner = this.LIZJ;
                    final DataChannel dataChannel3 = this.LIZLLL;
                    final AbstractC960950b77 abstractC960950b773 = this.LJ;
                    AbstractC962390b9R<C961830b8X> abstractC962390b9R = new AbstractC962390b9R<C961830b8X>(viewLIZIZ, interfaceC962020b8q, lifecycleOwner, dataChannel3, abstractC960950b773) { // from class: X.0b9Q
                        public final DataChannel LLJJLIIIJLLLLLLLZ;
                        public boolean LLJL;

                        @Override // X.AbstractC960400b6E
                        public final String getName() {
                            return "InteractRandomLinkMicSmallViewHolder";
                        }

                        @Override // X.InterfaceC956600b06
                        public final DataChannel getDataChannel() {
                            return this.LLJJLIIIJLLLLLLLZ;
                        }

                        @Override // X.AbstractC962390b9R
                        public final void b6(C961830b8X c961830b8X) {
                            List<QuickCohostContent> list;
                            C961830b8X c961830b8X2 = c961830b8X;
                            if (!C949960apO.LIZ()) {
                                QuickCohostContentInfo quickCohostContentInfo = c961830b8X2.LJ.quickCohostContentInfo;
                                if (quickCohostContentInfo == null || (list = quickCohostContentInfo.quickCohostContent) == null) {
                                    list = C13BV.INSTANCE;
                                }
                                if (!C960270b61.LIZ().isEmpty()) {
                                    N5(list, false);
                                } else {
                                    if (C500260Jjc.LJJJJIZL(V5())) {
                                        return;
                                    }
                                    C500260Jjc.LJIILIIL(T5());
                                    C500260Jjc.LLFFF(V5());
                                    ImageView imageView = (ImageView) this.LLJJJIL.getValue();
                                    if (imageView != null) {
                                        C419910GdJ c419910GdJ = new C419910GdJ();
                                        c419910GdJ.LIZIZ = C439101nJ.LIZ(12);
                                        c419910GdJ.LIZJ = C439101nJ.LIZ(12);
                                        c419910GdJ.LIZ = R.raw.icon_chevron_right_ltr;
                                        c419910GdJ.LJ = Integer.valueOf(R.attr.ezs);
                                        imageView.setImageDrawable(c419910GdJ.LIZ(this.itemView.getContext()));
                                    }
                                    View viewV5 = V5();
                                    if (viewV5 != null) {
                                        C786410Ut5.I7(new AbS696S0100000_15(new C962400b9S(false, this, list, false, "simplified_tag"), 9), viewV5);
                                    }
                                }
                                if (!this.LLJL) {
                                    this.LLJL = true;
                                    this.LLILZ.getLifecycle().addObserver(new InteractRandomLinkMicSmallViewBinder$InteractRandomLinkMicSmallViewHolder$showSelectInterestTagView$2(this));
                                }
                            }
                        }

                        @Override // X.AbstractC960400b6E
                        public final void I5(List list, int i, Object obj) {
                            C962370b9P c962370b9P = (C962370b9P) obj;
                            C962320b9K.LIZ.getClass();
                            C962320b9K.LIZ(this, c962370b9P, list);
                            P5(c962370b9P, false);
                            c6(false);
                            C16FS c16fsD0 = d0();
                            if (c16fsD0 != null) {
                                C949960apO.LIZJ(c16fsD0, this.LLJJLIIIJLLLLLLLZ, Boolean.FALSE, this.LLJJJJ, 32);
                            }
                            a6(c962370b9P);
                        }

                        {
                            this.LLJJLIIIJLLLLLLLZ = dataChannel3;
                        }
                    };
                    C962320b9K.LIZ.getClass();
                    C962320b9K.LIZIZ(abstractC962390b9R);
                    viewLIZIZ.setBackgroundResource(R.drawable.e5e);
                    return abstractC962390b9R;
                }

                {
                    this.LIZIZ = this;
                    this.LIZJ = this;
                    this.LIZLLL = dataChannel2;
                    this.LJ = abstractC960950b772;
                }
            });
        }
        this.LLJJI.LLLI(C960380b6C.class, new C960370b6B(this.LLJJJJ, this));
        this.LLJJI.LLLI(C961360b7m.class, new C961370b7n(this));
        this.LLJJI.LLLI(C961410b7r.class, new C962530b9f(this.LLJJ));
        this.LLJJI.LLLI(C956020azA.class, new C963760bBe(this, this, this.LLJJ));
        this.LLJJI.LLLI(C961770b8R.class, new C0J8P<C961770b8R, C961710b8L>() { // from class: X.0b7w
            @Override // X.C0J8P
            public final void LIZJ(RecyclerView.ViewHolder viewHolder, C961770b8R c961770b8R) {
                C786410Ut5.LJLLLLLL(0, viewHolder.itemView);
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                final View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gss, viewGroup, false);
                return new RecyclerView.ViewHolder(viewTd) { // from class: X.0b8L
                };
            }
        });
        this.LLJJI.LLLI(C960600b6Y.class, new C961000b7C(this.LLJJJJ, new AwS594S0100000_15(this, 473)));
        C1117360fBO c1117360fBO4 = this.LLJJI;
        final DataChannel dataChannel3 = this.LLJJ;
        final AbstractC960950b77 abstractC960950b773 = (AbstractC960950b77) this.LLILLL;
        c1117360fBO4.LLLI(C960450b6J.class, new AbstractC960410b6F<C960450b6J, C960390b6D>(this, this, dataChannel3, abstractC960950b773) { // from class: X.0b6G
            public final InterfaceC956060azE LIZIZ;
            public final InterfaceC956210azT LIZJ;
            public final DataChannel LIZLLL;
            public final AbstractC960950b77 LJ;

            @Override // X.AbstractC960410b6F
            public final String LJIIIZ() {
                return "BattlePairListViewBinder";
            }

            @Override // X.AbstractC960410b6F
            public final AbstractC960400b6E LJIIIIZZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C960390b6D(C786410Ut5.Td(layoutInflater, R.layout.gs2, viewGroup, false), this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ);
            }

            {
                this.LIZIZ = this;
                this.LIZJ = this;
                this.LIZLLL = dataChannel3;
                this.LJ = abstractC960950b773;
            }
        });
        this.LLJJI.LLLI(C961420b7s.class, new C0J8P<C961420b7s, C962600b9m>() { // from class: X.0b9i
            @Override // X.C0J8P
            public final void LIZJ(RecyclerView.ViewHolder viewHolder, C961420b7s c961420b7s) {
                C962600b9m c962600b9m = (C962600b9m) viewHolder;
                final C961420b7s c961420b7s2 = c961420b7s;
                C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
                String str = c961420b7s2.LJFF;
                c1124870fNVLIZJ.getClass();
                String strLIZIZ = C1124870fNV.LIZIZ(str);
                if (C500260Jjc.LJJIIZ(strLIZIZ)) {
                    ((TextView) c962600b9m.LL.getValue()).setText(strLIZIZ);
                }
                if (!c961420b7s2.LIZ) {
                    c961420b7s2.LIZ = true;
                    C955400ayA.LIZ.LJLILLLLZI(EnumC962630b9p.ROUND1.getValue());
                }
                if (C500260Jjc.LJJIIZ(c961420b7s2.LJ)) {
                    C786410Ut5.I7(new AbstractViewOnClickListenerC951940asa() { // from class: X.0b9j
                        @Override // X.AbstractViewOnClickListenerC951940asa
                        public final void LIZ(View view) {
                            C955400ayA.LIZ.LJLIL(EnumC962630b9p.ROUND1.getValue());
                            IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
                            Context contextLJII = C497740JfY.LJII();
                            C962560b9i c962560b9i = this.LLILZIL;
                            String str2 = c961420b7s2.LJ;
                            c962560b9i.getClass();
                            int iLJJI = (int) ((((double) C497740JfY.LJJI(C497740JfY.LJIILLIIL())) * 0.7d) + ((double) 52));
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(u.LJJIFFI(str2, "webcast_webview", "webcast_webview_popup", false));
                            sbLIZ.append("&height=");
                            sbLIZ.append(iLJJI);
                            iActionHandlerService.handle(contextLJII, C2188811AlT.LIZIZ(sbLIZ));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    }, c962600b9m.itemView);
                }
                C960940b76.LIZIZ(c962600b9m, c961420b7s2);
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C962600b9m(C786410Ut5.Td(layoutInflater, R.layout.gr8, viewGroup, false));
            }
        });
        this.LLJJI.LLLI(C962010b8p.class, new C962650b9r(this, this.LLJJ));
        this.LLJJI.LLLI(C961180b7U.class, new C962620b9o(this));
        this.LLJJI.LLLI(C962660b9s.class, new C962640b9q());
        this.LLJJI.LLLI(C957680b1q.class, new C960320b66(this.LLJJJJ, this));
        this.LLJJI.LLLI(C958770b3b.class, new C960330b67(this.LLJJJJ, this));
        this.LLJJI.LLLI(C963150bAf.class, new AbstractC960410b6F<C963150bAf, C963330bAx>(this) { // from class: X.0bA1
            public final LifecycleOwner LIZIZ;

            @Override // X.AbstractC960410b6F
            public final String LJIIIZ() {
                return "CoHostInviteListLynxViewBinder";
            }

            {
                this.LIZIZ = this;
            }

            @Override // X.AbstractC960410b6F
            public final AbstractC960400b6E LJIIIIZZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C963330bAx(new FrameLayout(viewGroup.getContext()), this.LIZIZ);
            }
        });
        this.LLJJI.LLLI(C961400b7q.class, new C0J8P<C961400b7q, C961600b8A>() { // from class: X.0b7a
            @Override // X.C0J8P
            public final void LIZJ(RecyclerView.ViewHolder viewHolder, C961400b7q c961400b7q) {
                ((TextView) ((C961600b8A) viewHolder).LL.getValue()).setText(c961400b7q.LJ);
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C961600b8A(C786410Ut5.Td(layoutInflater, R.layout.gq7, viewGroup, false));
            }
        });
        this.LLJJI.LLLI(C961340b7k.class, new C0J8P<C961340b7k, C961520b82>() { // from class: X.0b7l
            @Override // X.C0J8P
            public final void LIZJ(RecyclerView.ViewHolder viewHolder, C961340b7k c961340b7k) {
                String str;
                C961520b82 c961520b82 = (C961520b82) viewHolder;
                C961340b7k c961340b7k2 = c961340b7k;
                RivalsListsData.OffliveInvitationBanner offliveInvitationBanner = c961340b7k2.LJ;
                TextView textView = (TextView) c961520b82.LL.getValue();
                Text text = offliveInvitationBanner.title;
                String str2 = null;
                if (text != null) {
                    str = text.defaultPattern;
                } else {
                    str = null;
                }
                textView.setText(C1133830fbx.LJIILIIL(text, str));
                TextView textView2 = (TextView) c961520b82.LLILLJJLI.getValue();
                Text text2 = offliveInvitationBanner.description;
                if (text2 != null) {
                    str2 = text2.defaultPattern;
                }
                textView2.setText(C1133830fbx.LJIILIIL(text2, str2));
                C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(offliveInvitationBanner.icon);
                c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
                c1324610kZfLJIIIZ.LJJI((View) c961520b82.LLILLL.getValue());
                C960940b76.LIZIZ(c961520b82, c961340b7k2);
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C961520b82(C786410Ut5.Td(layoutInflater, R.layout.gq6, viewGroup, false));
            }
        });
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        return new C978980baC();
    }

    @Override // X.InterfaceC962690b9v
    public final void RQ() {
        AbstractC960950b77 abstractC960950b77 = (AbstractC960950b77) this.LLILLL;
        if (abstractC960950b77 != null) {
            abstractC960950b77.LJIILJJIL(this.LLJJIJI.getValue(), false);
        }
    }

    @Override // X.InterfaceC962690b9v
    public final void ag() {
        AbstractC960950b77 abstractC960950b77 = (AbstractC960950b77) this.LLILLL;
        if (abstractC960950b77 != null) {
            abstractC960950b77.LJIILJJIL(this.LLJJIJI.getValue(), false);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void bS() {
        if (this.mStatusViewValid) {
            RunnableC781530UlD runnableC781530UlD = this.LLJJJJ;
            boolean z = false;
            if (runnableC781530UlD != null && runnableC781530UlD.getVisibility() == 0) {
                z = true;
            }
            if (!z) {
                C20441214yg.LIZIZ("MultiHostInviteListUpgradeFragment", "onMatchProcessStartedChanged. RecyclerView is not visible. skip");
            } else {
                C20441214yg.LIZIZ("MultiHostInviteListUpgradeFragment", "onMatchProcessStartedChanged. Re-render recyclerView");
                this.LLJJI.notifyDataSetChanged();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[RETURN] */
    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dS() {
        /*
            r5 = this;
            boolean r0 = r5.mStatusViewValid
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r5.LLJ
            r4 = 0
            if (r0 == 0) goto L2b
            T extends com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter r0 = r5.LLILLL
            X.0b77 r0 = (X.AbstractC960950b77) r0
            if (r0 == 0) goto L34
            X.01il r1 = r0.LLJILJILJ
            if (r1 == 0) goto L34
            r0 = 86
            kotlin.jvm.internal.AFwS250S0000000_15 r0 = kotlin.jvm.internal.AFwS250S0000000_15.get$arr$(r0)
            kotlin.Pair r0 = X.C500260Jjc.LJI(r1, r0)
            java.lang.Object r0 = r0.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
        L28:
            if (r3 >= 0) goto L35
            return
        L2b:
            T extends com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter r0 = r5.LLILLL
            X.0b77 r0 = (X.AbstractC960950b77) r0
            if (r0 == 0) goto L34
            int r3 = r0.LLJILJIL
            goto L28
        L34:
            r3 = 0
        L35:
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C915980Zwa.LJII()
            r0.LLILIL()
            X.0aqW r1 = r5.LLLFFI
            if (r1 == 0) goto L45
            java.lang.String r0 = "cancel quick cohost"
            r1.LIZLLL(r0)
        L45:
            X.0fBO r2 = r5.LLJJI
            r0 = 1
            java.lang.Integer[] r1 = new java.lang.Integer[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r4] = r0
            java.util.List r0 = X.C1697810uHb.LJIILJJIL(r1)
            r2.notifyItemChanged(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiHostInviteListFragmentV2.dS():void");
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void gS() {
        C20484615Do c20484615Do;
        if (this.mStatusViewValid) {
            C959600b4w c959600b4wC0 = ((InterfaceC954810axD) C1161920gLG.LIZJ(IQuickCoHostService.class)).c0();
            boolean z = c959600b4wC0 != null ? c959600b4wC0.LJIIIIZZ : true;
            if (LiveCohostAllowQuickInviteWithManualInviteSetting.INSTANCE.isEnable() || !z) {
                sS();
                return;
            }
            LiveSheetFragment liveSheetFragment = this.LLILLJJLI;
            if (liveSheetFragment == null || (c20484615Do = liveSheetFragment.LLJJIJIL) == null) {
                return;
            }
            c20484615Do.LIZ(1);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void hS() {
        RunnableC781530UlD runnableC781530UlD = this.LLJJJJ;
        if (runnableC781530UlD == null || ((C961510b81) this.LLLFZ.getValue()).LL > 0) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (int) C497740JfY.LIZIZ(99.0f));
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS222S0200000_15(this, runnableC781530UlD, 2));
        valueAnimatorOfFloat.start();
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void oS() {
        C410901il c410901il;
        C1117360fBO c1117360fBO = this.LLJJI;
        AbstractC960950b77 abstractC960950b77 = (AbstractC960950b77) this.LLILLL;
        if (abstractC960950b77 == null || (c410901il = abstractC960950b77.LLJILJILJ) == null) {
            c410901il = new C410901il();
        }
        c1117360fBO.LL = c410901il;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01fa A[PHI: r4
      0x01fa: PHI (r4v5 java.lang.String) = (r4v0 java.lang.String), (r4v6 java.lang.String) binds: [B:96:0x0147, B:94:0x0143] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05eb A[LOOP:8: B:260:0x05e5->B:262:0x05eb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0149  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.BaseMultiHostInviteListFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroy() {
        /*
            Method dump skipped, instruction units count: 1534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiHostInviteListFragmentV2.onDestroy():void");
    }

    public final View GS() {
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(getContext());
        View viewTd = null;
        if (layoutInflaterNe != null) {
            View view = getView();
            viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.hs8, view instanceof ViewGroup ? (ViewGroup) view : null, false);
        }
        FS(viewTd);
        if (viewTd != null) {
            C786410Ut5.I7(new ACListenerS150S0100000_15(this, 161), viewTd);
        }
        return viewTd;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (LiveCoHostInvitationMonitorSettings.INSTANCE.isEnable()) {
            C781290Ukp.LIZ.remove(C0U4C.COHOST_INVITATION_LIST.getValue());
        }
    }

    public final void FS(View view) {
        int iLIZ = C439101nJ.LIZ(8);
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS1S0104000_1(view, iLIZ, iLIZ, iLIZ, iLIZ, 1));
        }
    }

    @Override // X.InterfaceC960350b69
    public final void Qi(int i) {
        AbstractC960950b77 abstractC960950b77 = (AbstractC960950b77) this.LLILLL;
        if (abstractC960950b77 != null) {
            abstractC960950b77.LJJIFFI(i);
            this.LLJJI.notifyItemRemoved(i);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void UR(Throwable th) {
        if (this.LLJJIJIIJIL) {
            C481090Itn c481090Itn = this.LLJJJJLIIL;
            if (c481090Itn != null) {
                c481090Itn.setRefreshing(false);
            }
            this.LLJJIJIIJIL = false;
        }
        View view = this.LLJJJJJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        if (!this.mStatusViewValid) {
            return;
        }
        View viewWS = wS(true);
        if (viewWS != null) {
            C500260Jjc.LLFFF(viewWS);
        }
        this.LLJJI.LL = new C410901il();
        RunnableC781530UlD runnableC781530UlD = this.LLJJJJ;
        if (runnableC781530UlD != null) {
            C786410Ut5.LLLILZJ(runnableC781530UlD, 8);
        }
    }

    @Override // X.InterfaceC960350b69
    public final void kK(int i) {
        AbstractC960950b77 abstractC960950b77 = (AbstractC960950b77) this.LLILLL;
        if (abstractC960950b77 != null) {
            abstractC960950b77.LJJI(i);
            this.LLJJI.notifyItemRemoved(i);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C960890b71 c960890b71;
        AbstractC962030b8r abstractC962030b8r;
        super.onCreate(bundle);
        if (C956080azG.LIZLLL && (abstractC962030b8r = (AbstractC962030b8r) ((LinkedHashMap) C956080azG.LIZ).get("event_cohost_show_invitation_list")) != null && !abstractC962030b8r.LIZJ.has("create_dialog")) {
            AbstractC962030b8r.LJIIJ(abstractC962030b8r.LIZJ, "create_dialog", Long.valueOf(SystemClock.uptimeMillis() - abstractC962030b8r.LIZ), true);
        }
        C944300agG.LIZ("reentrant_open_panel");
        if (CoHostInviteListPerformanceSetting.INSTANCE.isEnabled()) {
            long jLIZ = C158B.LIZ();
            C955440ayE c955440ayE = new C955440ayE();
            long j = jLIZ - this.LLJLLL;
            AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "page_name", "cohost_panel", true);
            AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "page_enter_from", C955440ayE.LJJIJ(c955440ayE), true);
            AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "start_type", String.valueOf(3), true);
            AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "start_to_now", Long.valueOf(j), true);
            AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "init_stage_cost", Long.valueOf(j), true);
            c955440ayE.LJIJJLI("meaningful_init");
            T t = this.LLILLL;
            if ((t instanceof C960890b71) && (c960890b71 = (C960890b71) t) != null) {
                c960890b71.LLL = jLIZ;
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void uS(int i) {
        if (!this.mStatusViewValid) {
            return;
        }
        this.LLJJI.notifyItemChanged(i, C1697810uHb.LJIILJJIL(1));
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.BaseMultiHostInviteListFragment, com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void cS(int i, int i2) {
        RecyclerView.LayoutManager layoutManager;
        int iFindFirstVisibleItemPosition;
        int top;
        RunnableC781530UlD runnableC781530UlD = this.LLJJJJ;
        LinearLayoutManager linearLayoutManager = null;
        if (runnableC781530UlD != null) {
            layoutManager = runnableC781530UlD.getLayoutManager();
        } else {
            layoutManager = null;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        }
        if (linearLayoutManager != null) {
            iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
            if (viewFindViewByPosition != null) {
                top = viewFindViewByPosition.getTop();
            }
            this.LLJJI.notifyItemRangeInserted(i, i2);
            if (linearLayoutManager == null && iFindFirstVisibleItemPosition != -1 && i <= iFindFirstVisibleItemPosition) {
                linearLayoutManager.scrollToPositionWithOffset(iFindFirstVisibleItemPosition + i2, top);
                return;
            }
            return;
        }
        iFindFirstVisibleItemPosition = -1;
        top = 0;
        this.LLJJI.notifyItemRangeInserted(i, i2);
        if (linearLayoutManager == null) {
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void kS(int i, int i2) {
        C410901il c410901il;
        C1117360fBO c1117360fBO = this.LLJJI;
        AbstractC960950b77 abstractC960950b77 = (AbstractC960950b77) this.LLILLL;
        if (abstractC960950b77 == null || (c410901il = abstractC960950b77.LLJILJILJ) == null) {
            c410901il = new C410901il();
        }
        c1117360fBO.LL = c410901il;
        this.LLJJI.notifyItemRangeRemoved(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022e  */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instruction units count: 817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiHostInviteListFragmentV2.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0163 A[PHI: r3
      0x0163: PHI (r3v5 java.lang.String) = (r3v4 java.lang.String), (r3v11 java.lang.String), (r3v11 java.lang.String) binds: [B:27:0x007a, B:36:0x008d, B:38:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void VR(boolean r13, boolean r14, java.util.Set<java.lang.Integer> r15) {
        /*
            Method dump skipped, instruction units count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiHostInviteListFragmentV2.VR(boolean, boolean, java.util.Set):void");
    }

    public final void HS(C956150azN c956150azN, int i, int i2, boolean z) {
        AbstractC960950b77 abstractC960950b77;
        Boolean boolValueOf;
        boolean z2;
        boolean z3;
        ActivityBadgeInfo activityBadgeInfo;
        boolean z4;
        boolean z5;
        Map<String, String> map;
        AbstractC960950b77 abstractC960950b772;
        ActivityBadgeInfo activityBadgeInfo2;
        String str;
        RunnableC781530UlD runnableC781530UlD;
        long j;
        AbstractC960950b77 abstractC960950b773;
        if (this.mStatusViewValid && c956150azN != null && i != -1 && z && i >= 0 && i <= this.LLJJI.LL.size()) {
            EnumC961080b7K enumC961080b7K = c956150azN.LJIIIIZZ;
            if (((enumC961080b7K == EnumC961080b7K.TOP_LIVING_MAY_KNOW && ((this.LLILZIL != 0 && !this.LLIZ) || (abstractC960950b773 = (AbstractC960950b77) this.LLILLL) == null || abstractC960950b773.LLIZLLLIL != 0)) || ((enumC961080b7K == EnumC961080b7K.TOP_LIVING_RECOMMEND && ((abstractC960950b77 = (AbstractC960950b77) this.LLILLL) == null || abstractC960950b77.LLIZLLLIL != 0)) || (enumC961080b7K == EnumC961080b7K.TOP_LIVING_VIEWER_SUGGESTION && this.LLILZLL != 0))) && this.mStatusViewValid && i2 >= 0 && i2 < this.LLJJI.LL.size() && (runnableC781530UlD = this.LLJJJJ) != null) {
                ARunnableS26S0101000_15 aRunnableS26S0101000_15 = new ARunnableS26S0101000_15(i2, this, 7);
                if (i == this.LLJJI.LL.size()) {
                    j = 300;
                } else {
                    j = 120;
                }
                HandlerHook.viewPostDelay(runnableC781530UlD, aRunnableS26S0101000_15, j);
            }
            if (this.mStatusViewValid) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("User inserted animation into ");
                if (this.LLIZ) {
                    str = "friends";
                } else {
                    str = "may know";
                }
                sbLIZ.append(str);
                sbLIZ.append(" list");
                C20441214yg.LIZIZ("MultiHostInviteListUpgradeFragment", C2188811AlT.LIZIZ(sbLIZ));
                this.LLIZLLLIL = true;
                RunnableC781530UlD runnableC781530UlD2 = this.LLJJJJ;
                if (runnableC781530UlD2 != null) {
                    HandlerHook.viewPostDelay(runnableC781530UlD2, new ARunnableS21S0201000_15(i, this, c956150azN, 7), 240L);
                }
            }
            C956250azX c956250azX = new C956250azX(c956150azN.getClass(), c956150azN.LJ.getId());
            String str2 = "";
            Map<String, String> map2 = null;
            Boolean boolValueOf2 = null;
            map2 = null;
            if (C1533950q1J.LJ(c956150azN.LJIJJLI)) {
                String str3 = c956150azN.LJII;
                if (str3 != null) {
                    str2 = str3;
                }
                Room room = c956150azN.LJ;
                C955540ayO c955540ayO = c956150azN.LJIJI;
                if (c955540ayO == null) {
                    c955540ayO = c956150azN.LJI;
                }
                RivalExtraInfo rivalExtraInfo = c956150azN.LJIIJ;
                if (c956150azN.LJIIIIZZ != EnumC961080b7K.IDLE) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                EnumC955720ayg enumC955720ayg = c956150azN.LJIIL;
                String type = C950220apo.LJII(false).getType();
                boolean z6 = c956150azN.LJIILLIIL;
                String str4 = c956150azN.LJIJJLI;
                if (c956150azN.LJJ) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                RivalExtraInfo rivalExtraInfo2 = c956150azN.LJIIJ;
                if (rivalExtraInfo2 != null && (activityBadgeInfo2 = rivalExtraInfo2.activityBadgeInfo) != null) {
                    map = activityBadgeInfo2.eventTrace;
                } else {
                    map = null;
                }
                C955400ayA.LLI(str2, room, c955540ayO, rivalExtraInfo, z4, enumC955720ayg, type, z6, false, str4, false, z5, map, 1280);
                c956150azN.LIZ = true;
                C960480b6M c960480b6M = (C960480b6M) ((LinkedHashMap) C955400ayA.LJII).get(Long.valueOf(c956150azN.LJ.getId()));
                if (c960480b6M != null) {
                    c960480b6M.LIZIZ = Boolean.TRUE;
                }
                AbstractC960950b77 abstractC960950b774 = (AbstractC960950b77) this.LLILLL;
                if (abstractC960950b774 != null) {
                    boolValueOf2 = Boolean.valueOf(abstractC960950b774.LJIILIIL(c956250azX));
                }
                if (C500260Jjc.LJJIJIIJIL(boolValueOf2) && (abstractC960950b772 = (AbstractC960950b77) this.LLILLL) != null) {
                    abstractC960950b772.LJJ(c956250azX);
                }
            } else if (!c956150azN.LIZ) {
                AbstractC960950b77 abstractC960950b775 = (AbstractC960950b77) this.LLILLL;
                if (abstractC960950b775 != null) {
                    boolValueOf = Boolean.valueOf(abstractC960950b775.LJIILIIL(c956250azX));
                } else {
                    boolValueOf = null;
                }
                if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
                    c956150azN.LIZ = true;
                    AbstractC960950b77 abstractC960950b776 = (AbstractC960950b77) this.LLILLL;
                    if (abstractC960950b776 != null) {
                        abstractC960950b776.LJJ(c956250azX);
                    }
                    C960480b6M c960480b6M2 = (C960480b6M) ((LinkedHashMap) C955400ayA.LJII).get(Long.valueOf(c956150azN.LJ.getId()));
                    if (c960480b6M2 != null) {
                        c960480b6M2.LIZIZ = Boolean.TRUE;
                    }
                    String str5 = c956150azN.LJII;
                    if (str5 != null) {
                        str2 = str5;
                    }
                    Room room2 = c956150azN.LJ;
                    C955540ayO c955540ayO2 = c956150azN.LJIJI;
                    if (c955540ayO2 == null) {
                        c955540ayO2 = c956150azN.LJI;
                    }
                    RivalExtraInfo rivalExtraInfo3 = c956150azN.LJIIJ;
                    if (c956150azN.LJIIIIZZ != EnumC961080b7K.IDLE) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    EnumC955720ayg enumC955720ayg2 = c956150azN.LJIIL;
                    String type2 = C950220apo.LJII(false).getType();
                    boolean z7 = c956150azN.LJIILLIIL;
                    if (c956150azN.LJJ) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    RivalExtraInfo rivalExtraInfo4 = c956150azN.LJIIJ;
                    if (rivalExtraInfo4 != null && (activityBadgeInfo = rivalExtraInfo4.activityBadgeInfo) != null) {
                        map2 = activityBadgeInfo.eventTrace;
                    }
                    C955400ayA.LLI(str2, room2, c955540ayO2, rivalExtraInfo3, z2, enumC955720ayg2, type2, z7, false, null, false, z3, map2, 1792);
                }
            }
            C955580ayS.LIZJ = System.currentTimeMillis();
            AbstractC960950b77 abstractC960950b777 = (AbstractC960950b77) this.LLILLL;
            if (abstractC960950b777 != null) {
                abstractC960950b777.LLJJIJI = false;
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void RR(C956150azN c956150azN, int i, int i2, boolean z) {
        if (LiveCoHostScrollAndInsertionMoveSetting.INSTANCE.isEnable()) {
            HS(c956150azN, i, i2, z);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView
    public final void WR(boolean z, C956150azN c956150azN, int i, int i2, boolean z2) {
        C410901il c410901il;
        C08JC c08jc;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFetchUserListSectionDataSuccess isDataValid = ");
        sbLIZ.append(z);
        sbLIZ.append(", topLivingIndex = ");
        sbLIZ.append(i);
        sbLIZ.append(", scrollIndex = ");
        sbLIZ.append(i2);
        sbLIZ.append(", isFirstInvoke = ");
        sbLIZ.append(z2);
        C20441214yg.LIZIZ("MultiHostInviteListUpgradeFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.mStatusViewValid) {
            return;
        }
        if (z) {
            C1117360fBO c1117360fBO = this.LLJJI;
            AbstractC960950b77 abstractC960950b77 = (AbstractC960950b77) this.LLILLL;
            if (abstractC960950b77 == null || (c410901il = abstractC960950b77.LLJILJILJ) == null) {
                c410901il = new C410901il();
            }
            c1117360fBO.LL = c410901il;
            this.LLJJI.notifyDataSetChanged();
            AbstractC960950b77 abstractC960950b772 = (AbstractC960950b77) this.LLILLL;
            if (abstractC960950b772 != null && (c08jc = abstractC960950b772.LLJJJIL) != null) {
                for (Map.Entry<String, C961750b8P> entry : c08jc.entrySet()) {
                    C961750b8P value = entry.getValue();
                    if (value != null && !value.LIZIZ) {
                        C955440ayE c955440ayE = new C955440ayE();
                        long jCurrentTimeMillis = System.currentTimeMillis() - C955400ayA.LJIL;
                        EnumC952640ati enumC952640ati = value.LIZ;
                        String key = entry.getKey();
                        AbstractC962030b8r.LJIIJ(c955440ayE.LIZJ, "load_duration", Long.valueOf(jCurrentTimeMillis), true);
                        c955440ayE.LJIIL(Integer.valueOf(enumC952640ati.getValue()), "rival_type", true);
                        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "section_name", key, true);
                        c955440ayE.LJIJJLI("invite_list_section_load");
                        value.LIZIZ = true;
                    }
                }
            }
        }
        if (!LiveCoHostScrollAndInsertionMoveSetting.INSTANCE.isEnable()) {
            HS(c956150azN, i, i2, z2);
        }
        C20441214yg.LIZIZ("MultiHostInviteListUpgradeFragment", "onFetchUserListSectionDataSuccess completed");
    }
}
