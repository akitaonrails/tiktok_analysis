package Y;

import X.AbstractC1896090zRP;
import X.C1161920gLG;
import X.C1295960jpS;
import X.C1391190mJ3;
import X.C1559070qfp;
import X.C1569990qxR;
import X.C1572790r1x;
import X.C1572990r2H;
import X.C1579100rC8;
import X.C1581520rG2;
import X.C1584320rKY;
import X.C1592170rXD;
import X.C1611790s2r;
import X.C1612490s3z;
import X.C1612600s4A;
import X.C1614640s7S;
import X.C1614710s7Z;
import X.C1614800s7i;
import X.C1614890s7r;
import X.C1619460sFE;
import X.C1619720sFe;
import X.C1803800x2Y;
import X.C1805270x4v;
import X.C1893580zNM;
import X.C1894310zOX;
import X.C1894320zOY;
import X.C1906380zi0;
import X.C1954807lC;
import X.C197039127h;
import X.C2257791DYr;
import X.C343970De7;
import X.C446700HfQ;
import X.EnumC1584360rKc;
import X.EnumC1614900s7s;
import X.InterfaceC1583870rJp;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.walletnew.RechargeViewModel;
import com.bytedance.android.livesdk.wallet.NoticesResult;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.touchpoint.api.model.BottomTabBubble;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.picker.TuxWheelPickerFragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import com.ss.android.ugc.aweme.model.VipSubscriptionDetail;
import com.ss.android.ugc.aweme.model.VipSubscriptionDetailResponse;
import com.ss.android.ugc.aweme.series.feed.profile.view.SeriesProfileItemCell;
import com.ss.android.ugc.aweme.series.feed.profile.viewmodel.SeriesProfileTabViewModel;
import com.ss.android.ugc.aweme.series.seriesdetail.assem.SeriesDetailDescriptionAssem;
import com.ss.android.ugc.aweme.series.seriesdetail.viewmodel.SeriesDetailVideoListViewModel;
import com.ss.android.ugc.aweme.series.vip.assem.SeriesVipSubscriptionFooterAssem;
import com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public class ACListenerS88S0300000_24 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS88S0300000_24 aCListenerS88S0300000_24, View view) {
        Function1<? super Long, Unit> function1 = ((C1579100rC8) aCListenerS88S0300000_24.l0).LJ;
        if (function1 != null) {
            function1.invoke(Long.valueOf(((C2257791DYr) aCListenerS88S0300000_24.l1).getCurrentTime()));
        }
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF((TuxWheelPickerFragment) aCListenerS88S0300000_24.l2, C343970De7.LIZ);
    }

    public static final void onClick$1(ACListenerS88S0300000_24 aCListenerS88S0300000_24, View view) {
        VipSubscriptionDetail vipSubscriptionDetail;
        String str;
        String str2 = ((C1559070qfp) ((SeriesVipSubscriptionFooterAssem) aCListenerS88S0300000_24.l0).LLIZLLLIL.getValue()).LL;
        VipSubscriptionDetailResponse vipSubscriptionDetailResponse = ((C1614710s7Z) ((AssemViewModel) ((SeriesVipSubscriptionFooterAssem) aCListenerS88S0300000_24.l0).LLJ.getValue()).getState()).LLILLJJLI;
        if (vipSubscriptionDetailResponse != null) {
            vipSubscriptionDetail = vipSubscriptionDetailResponse.detail;
        } else {
            vipSubscriptionDetail = null;
        }
        SeriesVipSubscriptionFooterAssem seriesVipSubscriptionFooterAssem = (SeriesVipSubscriptionFooterAssem) aCListenerS88S0300000_24.l0;
        EnumC1614900s7s enumC1614900s7s = ((C1614800s7i) aCListenerS88S0300000_24.l1).LIZ;
        seriesVipSubscriptionFooterAssem.getClass();
        int i = C1614890s7r.LIZ[enumC1614900s7s.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        str = "extend";
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    str = "purchase";
                }
            } else {
                str = "cancel";
            }
        } else {
            str = "change_plan";
        }
        C1614640s7S.LIZIZ(str2, vipSubscriptionDetail, str, null, null);
        ((SeriesVipSubscriptionViewModel) ((SeriesVipSubscriptionFooterAssem) aCListenerS88S0300000_24.l0).LLJ.getValue()).EQ2(((C197039127h) aCListenerS88S0300000_24.l2).getContext(), ((C1614800s7i) aCListenerS88S0300000_24.l1).LIZ);
    }

    public static final void onClick$2(ACListenerS88S0300000_24 aCListenerS88S0300000_24, View view) {
        C1584320rKY c1584320rKY = C1584320rKY.LIZ;
        String strTag = ((InterfaceC1583870rJp) aCListenerS88S0300000_24.l0).tag();
        c1584320rKY.getClass();
        EnumC1584360rKc enumC1584360rKcLJIIIIZZ = C1584320rKY.LJIIIIZZ(strTag);
        if (enumC1584360rKcLJIIIIZZ != null) {
            C1906380zi0.LIZ.getClass();
            C1906380zi0.LJ(enumC1584360rKcLJIIIIZZ);
        }
        ((C1592170rXD) aCListenerS88S0300000_24.l1).LJJLIIIIJ(view, (InterfaceC1583870rJp) aCListenerS88S0300000_24.l0, (ScrollSwitchStateManager) aCListenerS88S0300000_24.l2);
    }

    public static final void onClick$3(ACListenerS88S0300000_24 aCListenerS88S0300000_24, View view) {
        ScrollSwitchStateManager scrollSwitchStateManager = (ScrollSwitchStateManager) aCListenerS88S0300000_24.l0;
        if (scrollSwitchStateManager != null) {
            ((C1592170rXD) aCListenerS88S0300000_24.l1).LJJLIIIIJ(view, (InterfaceC1583870rJp) aCListenerS88S0300000_24.l2, scrollSwitchStateManager);
        }
    }

    public static final void onClick$4(ACListenerS88S0300000_24 aCListenerS88S0300000_24, View view) {
        C1893580zNM c1893580zNM = C1893580zNM.LIZ;
        String str = ((BottomTabBubble) aCListenerS88S0300000_24.l0).jumpLink;
        c1893580zNM.getClass();
        if (str != null && Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "isEmbedded"), "1")) {
            C1619460sFE c1619460sFE = (C1619460sFE) aCListenerS88S0300000_24.l1;
            BottomTabBubble bottomTabBubble = (BottomTabBubble) aCListenerS88S0300000_24.l0;
            c1619460sFE.getClass();
            if (bottomTabBubble.needLoginGate && !C1894310zOX.LIZIZ()) {
                AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
                if (abstractC1896090zRP != null) {
                    abstractC1896090zRP.LJJIJLIJ(Integer.valueOf(bottomTabBubble.LIZ), new AwS603S0100000_24(c1619460sFE, 416));
                }
            } else {
                c1619460sFE.LJJJJ();
            }
            C1295960jpS tabLottieIcon = ((C1619460sFE) aCListenerS88S0300000_24.l1).LL.getTabLottieIcon();
            if (tabLottieIcon == null) {
                return;
            }
            if (tabLottieIcon.isAnimating()) {
                tabLottieIcon.pauseAnimation();
                tabLottieIcon.setProgress(0.0f);
            }
        } else {
            BottomTabBubble bottomTabBubble2 = (BottomTabBubble) aCListenerS88S0300000_24.l0;
            String str2 = bottomTabBubble2.jumpLink;
            if (str2 != null) {
                C1893580zNM.LJ(c1893580zNM, (Activity) aCListenerS88S0300000_24.l2, Integer.valueOf(bottomTabBubble2.LIZ), str2, bottomTabBubble2.LIZIZ, bottomTabBubble2.needLoginGate, bottomTabBubble2.LJ, null, null, 192);
            }
        }
        C446700HfQ c446700HfQ = ((C1619460sFE) aCListenerS88S0300000_24.l1).LLJJIJIIJIL;
        if (c446700HfQ != null) {
            c446700HfQ.LJJIIJZLJL();
        }
        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer num = ((BottomTabBubble) aCListenerS88S0300000_24.l0).LIZJ;
        c1894320zOY.getClass();
        C1894320zOY.LJIILJJIL(36, linkedHashMap, num, null, null);
    }

    public static final void onClick$5(ACListenerS88S0300000_24 aCListenerS88S0300000_24, View view) {
        String stringExtra;
        SeriesDetailVideoListViewModel.IQ2(((SeriesDetailDescriptionAssem) aCListenerS88S0300000_24.l0).Oo(), (PaidVideoItem) aCListenerS88S0300000_24.l1, view.getContext(), (CollectionDetailModel) aCListenerS88S0300000_24.l2);
        CollectionDetailModel collectionDetailModel = (CollectionDetailModel) aCListenerS88S0300000_24.l2;
        SeriesDetailDescriptionAssem seriesDetailDescriptionAssem = (SeriesDetailDescriptionAssem) aCListenerS88S0300000_24.l0;
        PaidVideoItem paidVideoItem = (PaidVideoItem) aCListenerS88S0300000_24.l1;
        C1611790s2r c1611790s2r = C1611790s2r.LIZ;
        Intent intent = seriesDetailDescriptionAssem.Jo().LLILZ;
        String aid = null;
        if (intent != null) {
            try {
                stringExtra = intent.getStringExtra("enter_from");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
        } else {
            stringExtra = null;
        }
        Intent intent2 = seriesDetailDescriptionAssem.Jo().LLILZ;
        boolean z = seriesDetailDescriptionAssem.Jo().LLJJIII;
        Aweme aweme = paidVideoItem.aweme;
        if (aweme != null) {
            aid = aweme.getAid();
        }
        C1612600s4A c1612600s4A = seriesDetailDescriptionAssem.Jo().LLJJIJIIJIL;
        c1611790s2r.getClass();
        C1612490s3z.LJJJJZ(C1612490s3z.LJI, "click_trailer_button_collection", stringExtra, null, null, null, aid, Boolean.valueOf(C1611790s2r.LIZJ(intent2)), null, null, null, null, null, null, null, null, null, null, null, collectionDetailModel, null, null, null, null, null, null, null, z, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, c1612600s4A, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -268959844, 1073733631);
    }

    public static final void onClick$6(ACListenerS88S0300000_24 aCListenerS88S0300000_24, View view) {
        String str;
        Map<String, String> map;
        String str2;
        String str3;
        String strXQ2 = ((RechargeViewModel) aCListenerS88S0300000_24.l0).XQ2();
        C1805270x4v c1805270x4v = (C1805270x4v) aCListenerS88S0300000_24.l1;
        NoticesResult.Notice notice = (NoticesResult.Notice) aCListenerS88S0300000_24.l2;
        c1805270x4v.getClass();
        if (notice != null && (map = notice.extra) != null) {
            boolean zLJFF = Intrinsics.LJFF(map.get("enable_auto_login"), "true");
            boolean zLJFF2 = Intrinsics.LJFF(map.get("link_to_external_browser"), "true");
            if (zLJFF) {
                String str4 = map.get("auto_login_start_url");
                if (str4 != null && (str2 = map.get("auto_login_target_url")) != null && (str3 = map.get("auto_login_state")) != null) {
                    ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).tryOpenAutoLogin(str4, str2, str3, new C1569990qxR(c1805270x4v, str2, strXQ2, notice));
                    return;
                }
            } else if (zLJFF2 && c1805270x4v.LIZ(notice.schemaUrl)) {
                C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                String str5 = notice.id;
                c1803800x2Y.getClass();
                C1803800x2Y.LJJJ(strXQ2, str5, "external_browser", null);
                return;
            }
        }
        NoticesResult.Notice notice2 = (NoticesResult.Notice) aCListenerS88S0300000_24.l2;
        if (notice2 != null && (str = notice2.schemaUrl) != null) {
            C1805270x4v c1805270x4v2 = (C1805270x4v) aCListenerS88S0300000_24.l1;
            C1803800x2Y c1803800x2Y2 = C1803800x2Y.LIZ;
            String str6 = notice2.id;
            c1803800x2Y2.getClass();
            C1803800x2Y.LJJJ(strXQ2, str6, "in_app", null);
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(c1805270x4v2.LIZ.getContext(), str);
        }
    }

    public static final void onClick$7(ACListenerS88S0300000_24 aCListenerS88S0300000_24, View view) {
        String str;
        long jLongValue;
        String str2;
        if (((SeriesProfileItemCell) aCListenerS88S0300000_24.l0).getContext() != null) {
            SeriesProfileItemCell seriesProfileItemCell = (SeriesProfileItemCell) aCListenerS88S0300000_24.l0;
            C1572790r1x c1572790r1x = (C1572790r1x) aCListenerS88S0300000_24.l1;
            SeriesProfileTabViewModel.wQ2((SeriesProfileTabViewModel) seriesProfileItemCell.LLIZ.getValue(), Long.valueOf(c1572790r1x.LL), 1L, String.valueOf((Long) aCListenerS88S0300000_24.l2), true, c1572790r1x.LLILZ);
        }
        C1581520rG2 c1581520rG2 = C1581520rG2.LJI;
        if (((C1572990r2H) ((AssemViewModel) ((SeriesProfileItemCell) aCListenerS88S0300000_24.l0).LLIZ.getValue()).getState()).LLILLL) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        String strValueOf = String.valueOf(((C1572790r1x) aCListenerS88S0300000_24.l1).LL);
        Long l = ((C1572790r1x) aCListenerS88S0300000_24.l1).LLILZIL.LIZLLL;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        String strValueOf2 = String.valueOf(jLongValue);
        if (((C1572790r1x) aCListenerS88S0300000_24.l1).LLILZ) {
            str2 = "last_watch_video";
        } else {
            str2 = "video";
        }
        c1581520rG2.LJJIJL(str, strValueOf, strValueOf2, str2);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACListenerS88S0300000_24(X.InterfaceC1583870rJp r2, com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r3, X.C1592170rXD r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 2 - r5
            if (r5 == 0) goto L11
            r0 = r1
            r0.l0 = r3
            r0.l1 = r4
            r0.l2 = r2
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r4
            r0.l2 = r3
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS88S0300000_24.<init>(X.0rJp, com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager, X.0rXD, int):void");
    }

    public ACListenerS88S0300000_24(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
