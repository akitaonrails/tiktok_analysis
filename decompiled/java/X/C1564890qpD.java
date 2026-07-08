package X;

import android.text.TextUtils;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.ad.feed.component.IAdComponentService;
import com.ss.android.ugc.aweme.experiment.FollowRealTimeReadExp;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushColdStartExp;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ISearchServiceLowEnd;
import com.ss.android.ugc.feed.platform.ab.FeedPagingDurationConfig;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper;
import com.ss.android.ugc.feed.platform.popup.exp.FeedDynamicBugfixConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: renamed from: X.0qpD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1564890qpD extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ BasePanelUIComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1564890qpD(BasePanelUIComponent basePanelUIComponent) {
        super(1);
        this.LL = basePanelUIComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Object service;
        C13IQ<? extends AbstractC738140SxQ> c13iqLIZJ;
        C19719912Dl c19719912DlLJIJJ;
        String eventType;
        String eventType2;
        String eventType3;
        final Assembler assembler2 = assembler;
        assembler2.vQ2(this.LL, new C1559510qgX());
        if (C07MU.LIZ() > 0 && (C1389300mG0.LJIJJ(this.LL.getPanelContext()) || C1386360mBG.LJIIJ(C1389300mG0.LIZ(this.LL.getPanelContext())) || TextUtils.equals("homepage_explore", C1389300mG0.LIZ(this.LL.getPanelContext())))) {
            assembler2.vQ2(this.LL, AFwS264S0000000_24.get$arr$(554));
        }
        assembler2.vQ2(this.LL, new C1559470qgT());
        assembler2.vQ2(this.LL, new C687520Qxy());
        assembler2.QQ2(this.LL, new C1216810hln());
        if (C1389300mG0.LJIJJ(this.LL.getPanelContext()) && ((FeedPagingDurationConfig) C1564730qox.LIZIZ.getValue()).enable) {
            BasePanelUIComponent basePanelUIComponent = this.LL;
            C2189821An6 c2189821An6 = basePanelUIComponent.getPanelContext().LIZJ;
            if (c2189821An6 != null) {
                eventType3 = c2189821An6.getEventType();
            } else {
                eventType3 = null;
            }
            C0RUC.LJI(basePanelUIComponent, assembler2, eventType3, new C1558030qe9());
        }
        if (C0OHO.LIZ().enable) {
            if (C1565340qpw.LIZ().getOptScrollConfig()) {
                BasePanelUIComponent basePanelUIComponent2 = this.LL;
                C2189821An6 c2189821An62 = basePanelUIComponent2.getPanelContext().LIZJ;
                if (c2189821An62 != null) {
                    eventType2 = c2189821An62.getEventType();
                } else {
                    eventType2 = null;
                }
                C0RUC.LJI(basePanelUIComponent2, assembler2, eventType2, AFwS240S0000000_9.get$arr$(705));
            } else {
                assembler2.QQ2(this.LL, AFwS240S0000000_9.get$arr$(706));
            }
        }
        assembler2.vQ2(this.LL, AFwS240S0000000_9.get$arr$(707));
        assembler2.vQ2(this.LL, new C1559430qgP());
        if (C1594720rbK.LIZ() > 0) {
            if (C1565340qpw.LIZ().getOptFeedLiveCardComponent()) {
                BasePanelUIComponent basePanelUIComponent3 = this.LL;
                C2189821An6 c2189821An63 = basePanelUIComponent3.getPanelContext().LIZJ;
                if (c2189821An63 != null) {
                    eventType = c2189821An63.getEventType();
                } else {
                    eventType = null;
                }
                C0RUC.LIZIZ(basePanelUIComponent3, assembler2, eventType, new C1559440qgQ(), 12);
            } else {
                assembler2.vQ2(this.LL, new C1559450qgR());
            }
        }
        assembler2.vQ2(this.LL, AFwS264S0000000_24.get$arr$(557));
        assembler2.vQ2(this.LL, new C1559460qgS());
        assembler2.vQ2(this.LL, new C0OCK());
        if (((Number) C300880Bqo.LIZ.getValue()).intValue() > 0) {
            assembler2.vQ2(this.LL, new C1216950hm1());
        }
        assembler2.QQ2(this.LL, AFwS264S0000000_24.get$arr$(558));
        if (LoadMorePanelComponentTempHelper.LLILZLL) {
            assembler2.QQ2(this.LL, AFwS229S0000000_2.get$arr$(571));
        }
        assembler2.QQ2(this.LL, new C737020Svc());
        BasePanelUIComponent basePanelUIComponent4 = this.LL;
        assembler2.QQ2(basePanelUIComponent4, new AwS603S0100000_24(basePanelUIComponent4, 423));
        BasePanelUIComponent basePanelUIComponent5 = this.LL;
        assembler2.QQ2(basePanelUIComponent5, new AwS603S0100000_24(basePanelUIComponent5, 424));
        if (C0BOS.LIZ()) {
            assembler2.vQ2(this.LL, AFwS257S0000000_19.get$arr$(557));
        }
        if (((Boolean) C285090BFj.LJJZ.getValue()).booleanValue()) {
            Long lValueOf = Long.valueOf(((Number) C285090BFj.LJJLL.getValue()).longValue());
            final BasePanelUIComponent basePanelUIComponent6 = this.LL;
            C0CN5.LIZJ(lValueOf, new Runnable() { // from class: X.0qec
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PanelConfigKt@fac5.applyCommonConfig$1$23");
                    try {
                        assembler2.vQ2(basePanelUIComponent6, AFwS264S0000000_24.get$arr$(560));
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PanelConfigKt@fac5.applyCommonConfig$1$23");
                }
            }, false);
        } else {
            assembler2.vQ2(this.LL, new C734590Srh());
        }
        if (((Boolean) C285090BFj.LJLIIL.getValue()).booleanValue()) {
            Long lValueOf2 = Long.valueOf(((Number) C285090BFj.LJLIIIL.getValue()).longValue());
            final BasePanelUIComponent basePanelUIComponent7 = this.LL;
            C0CN5.LIZJ(lValueOf2, new Runnable() { // from class: X.0qed
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PanelConfigKt@fac5.applyCommonConfig$1$25");
                    try {
                        assembler2.vQ2(basePanelUIComponent7, AFwS264S0000000_24.get$arr$(561));
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PanelConfigKt@fac5.applyCommonConfig$1$25");
                }
            }, false);
        } else {
            assembler2.vQ2(this.LL, new C734600Sri());
        }
        C0RUC.LIZIZ(this.LL, assembler2, null, new C734580Srg(), 14);
        if (C1157804fw.LIZ()) {
            service = ServiceManager.get().getService(ISearchServiceLowEnd.class);
            if (service == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchPanelConfigPartial");
            }
        } else {
            service = ServiceManager.get().getService(ISearchService.class);
            if (service == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchPanelConfigPartial");
            }
        }
        C13IQ<? extends AbstractC738140SxQ> c13iqLLZIL = ((InterfaceC1569760qx4) service).LLZIL();
        if (c13iqLLZIL != null) {
            BasePanelUIComponent basePanelUIComponent8 = this.LL;
            if (C1157804fw.LIZ()) {
                C0RUC.LIZIZ(basePanelUIComponent8, assembler2, null, new AwS581S0100000_2((C13IQ) c13iqLLZIL, (C13IQ<? extends UISlotAssem>) 383), 14);
            } else {
                assembler2.vQ2(basePanelUIComponent8, new AwS581S0100000_2((C13IQ) c13iqLLZIL, (C13IQ<? extends UISlotAssem>) 384));
            }
        }
        if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJZ()) {
            assembler2.vQ2(this.LL, AFwS264S0000000_24.get$arr$(553));
            assembler2.vQ2(this.LL, new C1559400qgM());
        }
        if (FollowRealTimeReadExp.LIZ()) {
            assembler2.vQ2(this.LL, AFwS264S0000000_24.get$arr$(555));
        }
        IAdComponentService iAdComponentService = (IAdComponentService) ServiceManager.get().getService(IAdComponentService.class);
        if (iAdComponentService != null && (c19719912DlLJIJJ = iAdComponentService.LJIJJ()) != null) {
            assembler2.QQ2(this.LL, new AwS581S0100000_2((C13IQ) c19719912DlLJIJJ, (C13IQ<? extends UISlotAssem>) 385));
        }
        assembler2.QQ2(this.LL, AFwS264S0000000_24.get$arr$(556));
        if (InnerPushColdStartExp.LIZ() && (c13iqLIZJ = C1908480zlO.LIZIZ.LIZJ()) != null) {
            assembler2.vQ2(this.LL, new AwS581S0100000_2((C13IQ) c13iqLIZJ, (C13IQ<? extends UISlotAssem>) 386));
        }
        C13IQ<? extends AbstractC738140SxQ> castingPanelComponent = C1D0F.LIZ.LJIIJ().getCastingPanelComponent();
        if (castingPanelComponent != null) {
            assembler2.vQ2(this.LL, new AwS581S0100000_2((C13IQ) castingPanelComponent, (C13IQ<? extends UISlotAssem>) 387));
        }
        if (C0BIE.LIZ && !C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(this.LL.getPanelContext().LJ)) {
            assembler2.vQ2(this.LL, AFwS257S0000000_19.get$arr$(555));
        }
        if (((Number) C283220B8e.LIZ.getValue()).intValue() == 1) {
            assembler2.vQ2(this.LL, AFwS240S0000000_9.get$arr$(704));
        }
        if (C299770Bp1.LIZ() > 0) {
            assembler2.vQ2(this.LL, new C0OCJ());
        }
        assembler2.QQ2(this.LL, AFwS243S0000000_11.get$arr$(594));
        if (C0BT9.LIZ()) {
            assembler2.vQ2(this.LL, new C1216960hm2());
        }
        if (((FeedDynamicBugfixConfig) C20589115hR.LIZIZ.getValue()).enablePlayerPanel) {
            assembler2.vQ2(this.LL, AFwS257S0000000_19.get$arr$(556));
        }
        if (((Boolean) C283980BBc.LIZ.getValue()).booleanValue()) {
            assembler2.vQ2(this.LL, AFwS264S0000000_24.get$arr$(559));
        }
        return Unit.LIZ;
    }
}
