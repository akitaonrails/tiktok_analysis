package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tiktok.homepage.mainfragment.inflate.HomepageIconServiceApi;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ISearchServiceLowEnd;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.spi.ISearchAppDiffProtocol;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s1m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1611120s1m extends AbstractC1586250rNf implements InterfaceC427710Gpt {
    public final C01GW LLILZIL;
    public TuxIconView LLILZLL;
    public boolean LLIZ;
    public long LLIZLLLIL;
    public String LLJ;
    public boolean LLJI;
    public C0QDS LLJIJIL;
    public boolean LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;

    @Override // X.AbstractC1586250rNf, X.InterfaceC1570900qyu
    public final void LIZ() {
        LJIIIIZZ(false);
    }

    @Override // X.AbstractC1586250rNf, X.InterfaceC1570900qyu
    public final void T1() {
        LJIIIIZZ(true);
    }

    @Override // X.InterfaceC1570900qyu
    public final void Z1() {
        this.LLIZ = false;
        LJ();
        C1548820qPI.LJIIIIZZ("event_show_search_entrance_guide", (C1611170s1r) this.LLJILLL.getValue());
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LJIILLIIL(this);
        C1ER1.LIZIZ.LLJJIJI();
        C1611140s1o c1611140s1o = (C1611140s1o) this.LLJILJILJ.getValue();
        c1611140s1o.getClass();
        C0CNO.LIZLLL(0L, new AwS568S0100000_24(c1611140s1o, 1660));
    }

    @Override // X.AbstractC1586250rNf, X.InterfaceC1570900qyu
    public final void a2() {
        this.LLJILJIL = true;
        if (this.LLIZ) {
            LJIILLIIL();
        }
    }

    @Override // X.AbstractC1586250rNf, X.InterfaceC1570900qyu
    public final void onPause() {
        this.LLJI = false;
    }

    @Override // X.AbstractC1586250rNf, X.InterfaceC1570900qyu
    public final void e2() {
        C1ER1.LIZIZ.LLJZ();
        this.LLJILJIL = false;
    }

    @Override // X.AbstractC1586250rNf, X.InterfaceC1570900qyu
    public final void onResume() {
        C19EG activity;
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        TuxIconView tuxIconView3;
        Context context;
        Activity activityLIZ;
        if (this.LLIZ && (activity = LIZJ().getActivity()) != null && (tuxIconView = this.LLILZLL) != null && tuxIconView.getContext() != null && (((tuxIconView2 = this.LLILZLL) == null || (context = tuxIconView2.getContext()) == null || (activityLIZ = C1388190mED.LIZ(context)) == null || !activityLIZ.isFinishing()) && (tuxIconView3 = this.LLILZLL) != null)) {
            PopupManager.LJIJI(C1ER1.LIZIZ.LLJJJIL(tuxIconView3, activity), true);
            this.LLIZ = false;
        }
        this.LLJI = true;
    }

    public C1611120s1m() {
        this.LLILZIL = C452501pT.LIZIZ(new C1586200rNa());
        this.LLJ = "";
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1657));
        this.LLJILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1658));
    }

    public static void LJIILJJIL() {
        final String strL0;
        if (C1157804fw.LIZ()) {
            InterfaceC1611110s1l interfaceC1611110s1l = (InterfaceC1611110s1l) ServiceManager.get().getService(ISearchServiceLowEnd.class);
            if (interfaceC1611110s1l == null) {
                return;
            } else {
                strL0 = interfaceC1611110s1l.L0();
            }
        } else {
            InterfaceC1611110s1l interfaceC1611110s1l2 = (InterfaceC1611110s1l) ServiceManager.get().getService(ISearchService.class);
            if (interfaceC1611110s1l2 == null) {
                return;
            } else {
                strL0 = interfaceC1611110s1l2.L0();
            }
        }
        if (strL0 != null) {
            C1537480q70 c1537480q70 = new C1537480q70();
            Uri.Builder builderBuildUpon = UriProtector.parse(strL0).buildUpon();
            builderBuildUpon.appendQueryParameter("enable_extra_info", "1");
            builderBuildUpon.appendQueryParameter("enable_memory_cache", "1");
            String string = builderBuildUpon.toString();
            c1537480q70.LJJIIZ(string);
            C1537830q7Z c1537830q7Z = new C1537830q7Z(UriProtector.parse(string), c1537480q70);
            c1537830q7Z.LJIJJLI = new C1537260q6e() { // from class: X.0QlV
                @Override // X.C1537260q6e
                public final void LIZIZ(Map<String, ? extends Object> map) {
                    Iterable iterable;
                    String strLJJLIIIJ;
                    Object obj = map.get("abParams");
                    Object aBParamsValue = null;
                    if ((obj instanceof List) && (iterable = (Iterable) obj) != null && (strLJJLIIIJ = C13LP.LJJLIIIJ(iterable, ",", null, null, 0, null, null, 62)) != null) {
                        String str = strL0;
                        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
                        C1538050q7v c1538050q7v = C1161970gLL.LIZIZ().LIZLLL;
                        if (c1538050q7v != null) {
                            aBParamsValue = c1538050q7v.getABParamsValue(strLJJLIIIJ);
                        }
                        Uri uriLJ = C1537540q76.LJ(str);
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJ, "channel");
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJ, "bundle");
                        if (C123100dR.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) && C123100dR.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                            sbLIZ.append('/');
                            sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            if (strLIZIZ != null) {
                                Map<String, Object> map2 = C1194004lm.LIZ;
                                if (((LinkedHashMap) map2).get(strLIZIZ) == null) {
                                    map2.put(strLIZIZ, aBParamsValue);
                                }
                            }
                        }
                    }
                }
            };
            c1537480q70.hybridParams = c1537830q7Z;
            C1536840q5y.LIZIZ(c1537480q70, null, null, true, null, 48);
        }
    }

    public final void LJI() {
        Object service;
        Object service2;
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).O4(false).LJIIIIZZ(null);
        if (C1157804fw.LIZ()) {
            service = ServiceManager.get().getService(ISearchServiceLowEnd.class);
            if (service == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchIconGeneratorPartial");
            }
        } else {
            service = ServiceManager.get().getService(ISearchService.class);
            if (service == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchIconGeneratorPartial");
            }
        }
        ((InterfaceC1611110s1l) service).P();
        if (C1157804fw.LIZ()) {
            service2 = ServiceManager.get().getService(ISearchServiceLowEnd.class);
            if (service2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchIconGeneratorPartial");
            }
        } else {
            service2 = ServiceManager.get().getService(ISearchService.class);
            if (service2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchIconGeneratorPartial");
            }
        }
        ((InterfaceC1611110s1l) service2).LJLLLL();
        C1548820qPI.LIZLLL("event_show_search_entrance_guide", (C1611170s1r) this.LLJILLL.getValue());
        if (C311290CId.LIZ()) {
            C1ER1 c1er1 = C1ER1.LIZIZ;
            c1er1.LJIJJ(new AwS568S0100000_24(this, 1656));
            c1er1.LLFFF(new AwS603S0100000_24(this, 462));
        }
    }

    public final String LJIIJ() {
        InterfaceC1593630rZZ interfaceC1593630rZZ;
        FeedFragment feedFragmentUx;
        InterfaceC665370Q7z interfaceC665370Q7zLJ;
        IViewPagerComponentAbility iViewPagerComponentAbility;
        C0SZ8 c0sz8LJLIL;
        VideoItemParams videoItemParamsLJ;
        Integer numValueOf;
        String string;
        C19EG activity = LIZJ().getActivity();
        if (activity == null || !C1EE2.LIZIZ.LIZLLL()) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        C128Y c128yBQ2 = C343710Ddh.LIZ(activity).BQ2();
        return (!(c128yBQ2 instanceof InterfaceC1593630rZZ) || (interfaceC1593630rZZ = (InterfaceC1593630rZZ) c128yBQ2) == null || (feedFragmentUx = interfaceC1593630rZZ.ux()) == null || (interfaceC665370Q7zLJ = C1578630rBN.LJ(feedFragmentUx)) == null || (iViewPagerComponentAbility = (IViewPagerComponentAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, IViewPagerComponentAbility.class, null)) == null || (c0sz8LJLIL = iViewPagerComponentAbility.LJLIL()) == null || (videoItemParamsLJ = C0RLJ.LJ(c0sz8LJLIL)) == null || (numValueOf = Integer.valueOf(videoItemParamsLJ.isEnterGraphicDetail)) == null || (string = numValueOf.toString()) == null) ? CardStruct.IStatusCode.DEFAULT : string;
    }

    public final Aweme LJIIJJI() {
        C19EG activity = LIZJ().getActivity();
        if (activity != null) {
            return C680080Qly.LIZIZ(activity).LLJILJILJ;
        }
        return null;
    }

    public final void LJIILL() {
        Object service;
        C19EG activity;
        TuxIconView tuxIconView;
        Object service2;
        String aid;
        Context context;
        Activity activityLIZ;
        if (C1157804fw.LIZ()) {
            service = ServiceManager.get().getService(ISearchServiceLowEnd.class);
            if (service == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchIconGeneratorPartial");
            }
        } else {
            service = ServiceManager.get().getService(ISearchService.class);
            if (service == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchIconGeneratorPartial");
            }
        }
        if (!((InterfaceC1611110s1l) service).LLIIIZ() || (activity = LIZJ().getActivity()) == null || (tuxIconView = this.LLILZLL) == null || tuxIconView.getContext() == null) {
            return;
        }
        TuxIconView tuxIconView2 = this.LLILZLL;
        if ((tuxIconView2 == null || (context = tuxIconView2.getContext()) == null || (activityLIZ = C1388190mED.LIZ(context)) == null || !activityLIZ.isFinishing()) && !((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZ()) {
            if (C1157804fw.LIZ()) {
                service2 = ServiceManager.get().getService(ISearchServiceLowEnd.class);
                if (service2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchIconGeneratorPartial");
                }
            } else {
                service2 = ServiceManager.get().getService(ISearchService.class);
                if (service2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchIconGeneratorPartial");
                }
            }
            if (((InterfaceC1611110s1l) service2).LJIL()) {
                PnSDigitalWellbeingSDKService pnSDigitalWellbeingSDKService = (PnSDigitalWellbeingSDKService) PluggableExtentionKt.pluggableSpi$default(PnSDigitalWellbeingSDKService.class, false, false, false, 14, null);
                if (pnSDigitalWellbeingSDKService == null || !pnSDigitalWellbeingSDKService.LJIIL()) {
                    if (PopupManager.LJI()) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("caption_intercept_reason", "popup_showing");
                        C20684815ws.LJIILLIIL("caption_intercept", c2344009Gk.LIZ);
                        return;
                    }
                    TuxIconView tuxIconView3 = this.LLILZLL;
                    if (tuxIconView3 == null) {
                        return;
                    }
                    Aweme aweme = C680080Qly.LIZIZ(activity).LLJILJILJ;
                    if (aweme == null || (aid = aweme.getAid()) == null) {
                        aid = this.LLJ;
                    }
                    PopupManager.LJIJI(C1ER1.LIZIZ.LJJJJIZL(activity, tuxIconView3, aid, new C1620990sHh(this, 1)), true);
                }
            }
        }
    }

    public final void LJIILLIIL() {
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        Context context;
        Activity activityLIZ;
        C19EG activity = LIZJ().getActivity();
        if (activity == null || (tuxIconView = this.LLILZLL) == null || tuxIconView.getContext() == null) {
            return;
        }
        TuxIconView tuxIconView3 = this.LLILZLL;
        if ((tuxIconView3 == null || (context = tuxIconView3.getContext()) == null || (activityLIZ = C1388190mED.LIZ(context)) == null || !activityLIZ.isFinishing()) && !PopupManager.LJI() && Intrinsics.LJFF(LIZJ().f3(), "homepage_hot") && (tuxIconView2 = this.LLILZLL) != null) {
            PopupManager.LJIJI(C1ER1.LIZIZ.LLJJJIL(tuxIconView2, activity), true);
        }
    }

    public C1611120s1m(InterfaceC1617760sCU interfaceC1617760sCU) {
        this();
        this.LL = interfaceC1617760sCU;
    }

    public final void LJIIIIZZ(boolean z) {
        C486530J6d c486530J6dLIZIZ;
        TuxIconView tuxIconView;
        int i;
        Context context;
        if (C1591480rW6.LJI()) {
            HomepageIconServiceApi homepageIconServiceApi = (HomepageIconServiceApi) this.LLILZIL.getValue();
            if (homepageIconServiceApi != null && (c486530J6dLIZIZ = homepageIconServiceApi.LIZIZ()) != null) {
                if ((z || !C295430Bi1.LIZ()) && !c486530J6dLIZIZ.LIZIZ) {
                    if (!z && !C295430Bi1.LIZ()) {
                        LJIIIZ(z);
                        return;
                    }
                    TuxIconView tuxIconView2 = this.LLILZLL;
                    if (tuxIconView2 == null || tuxIconView2.getContext() == null || (tuxIconView = this.LLILZLL) == null) {
                        return;
                    }
                    tuxIconView.setImageResource(c486530J6dLIZIZ.LIZ);
                    return;
                }
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                c419910GdJ.LIZ = R.raw.icon_magnifying_glass;
                c419910GdJ.LJFF = z;
                if (z) {
                    i = R.attr.ee;
                } else {
                    i = R.attr.e1;
                }
                TuxIconView tuxIconView3 = this.LLILZLL;
                if (tuxIconView3 == null || (context = tuxIconView3.getContext()) == null) {
                    return;
                }
                TuxIconView tuxIconView4 = this.LLILZLL;
                if (tuxIconView4 != null) {
                    tuxIconView4.setImageDrawable(c419910GdJ.LIZ(context));
                }
                Integer numLIZJ = C1308910kAL.LIZJ(i, context);
                if (numLIZJ == null) {
                    return;
                }
                int iIntValue = numLIZJ.intValue();
                TuxIconView tuxIconView5 = this.LLILZLL;
                if (tuxIconView5 == null) {
                    return;
                }
                tuxIconView5.setTintColor(iIntValue);
                return;
            }
            LJIIIZ(z);
            return;
        }
        LJIIIZ(z);
    }

    public final void LJIIIZ(boolean z) {
        Integer numValueOf;
        Context context;
        TuxIconView tuxIconView;
        boolean zLJI = C1591480rW6.LJI();
        int i = R.attr.ee;
        if (zLJI) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZ = R.raw.icon_magnifying_glass_offset;
            if (z) {
                numValueOf = Integer.valueOf(R.attr.ee);
            } else {
                numValueOf = Integer.valueOf(R.attr.e1);
            }
            c419910GdJ.LJ = numValueOf;
            c419910GdJ.LJFF = true;
            TuxIconView tuxIconView2 = this.LLILZLL;
            if (tuxIconView2 != null && (context = tuxIconView2.getContext()) != null && (tuxIconView = this.LLILZLL) != null) {
                tuxIconView.setImageDrawable(c419910GdJ.LIZ(context));
                return;
            }
            return;
        }
        TuxIconView tuxIconView3 = this.LLILZLL;
        if (tuxIconView3 == null) {
            return;
        }
        tuxIconView3.LIZJ(z);
        if (!z) {
            i = R.attr.e1;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(i, tuxIconView3.getContext());
        if (numLIZJ == null) {
            return;
        }
        tuxIconView3.setTintColor(numLIZJ.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(android.view.View r12) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1611120s1m.LJIIL(android.view.View):void");
    }

    @Override // X.InterfaceC1570900qyu
    public final void U1(View view) {
        C0R12 c0r12;
        ISearchAppDiffProtocol.LIZ.getClass();
        C1850707Mr.LIZIZ.getValue().LIZJ();
        C1906380zi0 c1906380zi0 = C1906380zi0.LIZ;
        EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.SEARCH;
        c1906380zi0.getClass();
        C1906380zi0.LJ(enumC1584360rKc);
        Aweme awemeLJIIJJI = LJIIJJI();
        if (awemeLJIIJJI != null && awemeLJIIJJI.isAd() && (c0r12 = C0R12.LIZIZ) != null) {
            c0r12.LJI(awemeLJIIJJI);
        }
        C0QMN.LIZIZ.LIZ.getClass();
        if (C0BYB.LIZ()) {
            if (C1619270sEv.LIZLLL) {
                C11JF c11jf = C1619270sEv.LJ;
                if (c11jf != null) {
                    c11jf.dispose();
                }
                C1619270sEv.LJ = null;
                C786410Ut5.LJJZZIII(C0CAU.LIZ, RunnableC1611180s1s.LL);
                C1619270sEv.LIZJ = true;
                C1619270sEv.LJ = (C11JF) C11NZ.LJLJJLL(Mp4ScreenVideoLoadTimeout.CONTROL, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.0QPV
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("VisualSearchChainedBubbleManager@dd44.startSbpBubbleSession$1");
                        C1619270sEv.LIZ.getClass();
                        C1619270sEv.LIZIZ();
                        C1C7U.LIZIZ("VisualSearchChainedBubbleManager@dd44.startSbpBubbleSession$1");
                    }
                });
            } else {
                C1619270sEv.LIZIZ();
            }
        }
        if (((Boolean) C04ST.LIZ.getValue()).booleanValue()) {
            if (C660220Pv2.LIZ(view)) {
                return;
            }
            LJIIL(view);
            return;
        }
        LJIIL(view);
    }

    @Override // X.InterfaceC1570900qyu
    public final void X1(int i) {
        TuxIconView tuxIconView;
        if (this.LLILZLL == null) {
            return;
        }
        C1030680cva.LJIILJJIL(LJIIJJI(), i, this.LLILZLL);
        if (i == 4 && (tuxIconView = this.LLILZLL) != null) {
            C786410Ut5.x5(tuxIconView, 1.0f);
        }
    }

    @Override // X.C0T2Y
    public final void Y3(Aweme aweme) {
        String aid;
        String aid2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAwemeChange aid(");
        Boolean boolValueOf = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(") ads: ");
        if (aweme != null) {
            boolValueOf = Boolean.valueOf(aweme.isAd());
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (aweme == null || (aid2 = aweme.getAid()) == null) {
            aid2 = "";
        }
        this.LLJ = aid2;
        LJIILL();
    }

    @Override // X.AbstractC1586250rNf, X.InterfaceC1570900qyu
    public final void d2(Integer num) {
        TuxIconView tuxIconView = this.LLILZLL;
        if (tuxIconView != null) {
            C1593860rZw.LIZ(tuxIconView, num, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    @Override // X.InterfaceC1570900qyu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View f2(android.content.Context r6) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1611120s1m.f2(android.content.Context):android.view.View");
    }

    public final C0QDS LJII(Aweme aweme, String str, String str2) {
        String aid;
        boolean z;
        boolean z2;
        boolean z3;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        String strLJIIJ = LJIIJ();
        C0QEQ c0qeqNewBuilder = C0QER.Companion.newBuilder();
        c0qeqNewBuilder.LJIIL = aid;
        c0qeqNewBuilder.LJJJJJL = ((Boolean) C07AQ.LIZ.getValue()).booleanValue();
        c0qeqNewBuilder.LJJJJL = ((Boolean) C07RM.LIZ.getValue()).booleanValue();
        c0qeqNewBuilder.LJJJJJ = ((Boolean) C1825707Db.LIZIZ.getValue()).booleanValue();
        c0qeqNewBuilder.LIZ = str;
        c0qeqNewBuilder.LJJJI = C1585030rLh.LIZIZ();
        c0qeqNewBuilder.LJIL = true;
        c0qeqNewBuilder.LJFF = str2;
        if (C1EE2.LIZIZ.LIZLLL()) {
            c0qeqNewBuilder.LJJIII.put("is_enter_graphic_detail", strLJIIJ);
        }
        C0QER c0qerLJ = c0qeqNewBuilder.LJ();
        SearchResultParam searchResultParam = new SearchResultParam();
        searchResultParam.setSearchFrom(str);
        boolean z4 = false;
        if (aweme != null && aweme.isLike()) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        if (aweme != null && AwemeExtKt.isCollected(aweme)) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean boolValueOf2 = Boolean.valueOf(z2);
        if (aweme != null && AwemeBizExtKt.isCommentClicked(aweme)) {
            z3 = true;
        } else {
            z3 = false;
        }
        Boolean boolValueOf3 = Boolean.valueOf(z3);
        if (aweme != null && AwemeBizExtKt.isForwardClicked(aweme)) {
            z4 = true;
        }
        return new C0QDS(LIZJ().getActivity(), searchResultParam, c0qerLJ, new C650950Pg5(new C650960Pg6(new C664000Q2s(str, null, true, true, "", "", 0, 0, false, "", "", ""), new C0Q8L(null, null, null), new C664030Q2v(null, aid, boolValueOf, boolValueOf2, boolValueOf3, Boolean.valueOf(z4)), new C650940Pg4(null, "", Boolean.FALSE, ""), new C0PYE(Long.valueOf(C326380Cqq.LIZ())), new C669560QOc(new C672110QXx(null, null, null, null, null), false, "", false, false, "", "", "", "", "", "", "", null, "", null, "", null, null, false, null, null, false, null, "", null), new C0QJN("", null, null, null, null, null)), new C0PSJ(new C0PRW(0, null, null, null, null, null, null, null, false, null, false, null, 4095, null), new C0PS4(-1, 0, "", new LinkedHashMap(), str, "enter", ""))), str, null);
    }

    public final void LJIILIIL(Aweme aweme, String str, String str2) {
        String aid;
        String str3;
        Map<String, String> mapLLLZLL;
        C1ER1 c1er1 = C1ER1.LIZIZ;
        String strLJJJJLI = c1er1.LJJJJLI();
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = this.LLJ;
        }
        C0QMN.LIZIZ.LIZ.getClass();
        boolean z = C1619270sEv.LIZJ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", "enter");
        c2344009Gk.LJIIIIZZ("enter_type", "click_feed_magnifier");
        c2344009Gk.LJIIIIZZ("search_entrance", str);
        String str4 = CardStruct.IStatusCode.DEFAULT;
        c2344009Gk.LJIIIIZZ("is_from_comment", CardStruct.IStatusCode.DEFAULT);
        if (c1er1.LIZLLL()) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("has_coin_task", str3);
        c2344009Gk.LJIIIIZZ("last_group_id", aid);
        if (z) {
            str4 = "1";
        }
        c2344009Gk.LJIIIIZZ("is_visual_tooltips_guide", str4);
        if (str2 != null) {
            c2344009Gk.LJFF("blankpage_id", str2);
        }
        if (strLJJJJLI.length() > 0) {
            c2344009Gk.LJFF("caption_type", "bubble");
        }
        if (c1er1.LLLLJI()) {
            c2344009Gk.LJFF("has_activation_task", "1");
            c2344009Gk.LJFF("activation_task_id", c1er1.f0());
        }
        if (c1er1.LJLJLJ() && (mapLLLZLL = c1er1.LLLZLL()) != null) {
            c2344009Gk.LJII(mapLLLZLL);
        }
        C0Q2O.LIZ.getClass();
        C0Q2O.LIZ(c2344009Gk);
        C20684815ws.LJIILLIIL("enter_search_blankpage", c2344009Gk.LIZ);
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("enter_from", str);
        c2344009Gk2.LJIIIIZZ("enter_method", "enter");
        C20684815ws.LJIILLIIL("enter_search", c2344009Gk2.LIZ);
    }

    @Override // X.InterfaceC427710Gpt
    public final void LLLLLLZZ(int i, User user, User user2) {
        Object service;
        if (C1157804fw.LIZ()) {
            service = ServiceManager.get().getService(ISearchServiceLowEnd.class);
            if (service == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchIconGeneratorPartial");
            }
        } else {
            service = ServiceManager.get().getService(ISearchService.class);
            if (service == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchIconGeneratorPartial");
            }
        }
        if (((InterfaceC1611110s1l) service).LLIIIZ()) {
            C1ER1.LIZIZ.b0();
        }
    }
}
