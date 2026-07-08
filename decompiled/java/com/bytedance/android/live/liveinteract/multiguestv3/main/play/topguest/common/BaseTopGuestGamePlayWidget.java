package com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common;

import X.C00FW;
import X.C01GW;
import X.C1548820qPI;
import X.C20441214yg;
import X.C2188811AlT;
import X.C23250099c;
import X.C355501Zp;
import X.C356001Zu;
import X.C452501pT;
import X.C5182020e;
import X.C5183020f;
import X.C948450amx;
import X.InterfaceC941870acL;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.TopGuestGamePlayService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayViewModel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import webcast.data.multi_guest_play.TopGuestMetaContent;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTopGuestGamePlayWidget<VM extends BaseTopGuestGamePlayViewModel> extends LiveWidget implements InterfaceC941870acL {
    public VM LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C5182020e((BaseTopGuestGamePlayWidget) this, 67));

    @Override // X.InterfaceC941870acL
    public final String LLLIZZ() {
        return "top_guests";
    }

    @Override // X.InterfaceC941870acL
    public final void end() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public abstract String y1();

    public abstract void z1();

    @Override // X.InterfaceC941870acL
    public final boolean isRunning() {
        TopGuestMetaContent topGuestMetaContent;
        VM vm = this.LL;
        return (vm == null || (topGuestMetaContent = vm.vQ2().LJIIIIZZ) == null || topGuestMetaContent.topGuestStatus != 1) ? false : true;
    }

    public final C355501Zp x1() {
        return (C355501Zp) this.LLILLJJLI.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        z1();
        VM vm = this.LL;
        if (vm != null) {
            C20441214yg.LIZIZ("TopGuestGamePlayService", "TopGuestGamePlayService create");
            C948450amx.LIZIZ.LJFF(new TopGuestGamePlayService(vm), null);
        }
        VM vm2 = this.LL;
        if (vm2 != null) {
            vm2.vQ2().LIZLLL();
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C356001Zu(this, null), 3);
        C355501Zp c355501ZpX1 = x1();
        c355501ZpX1.getClass();
        C20441214yg.LIZIZ("TopGuestBannerHelper", "register banner");
        C1548820qPI.LIZLLL("guest_point_ranking_banner_ready", c355501ZpX1.LJ);
        C1548820qPI.LIZLLL("guest_point_ranking_banner_show", c355501ZpX1.LJ);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C20441214yg.LIZIZ(y1(), "onDestroy");
        VM vm = this.LL;
        if (vm != null) {
            String strWQ2 = vm.wQ2();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onDestroy, source: ");
            sbLIZ.append("onDestroy");
            C20441214yg.LIZIZ(strWQ2, C2188811AlT.LIZIZ(sbLIZ));
            vm.vQ2().LJIIIIZZ();
            C20441214yg.LIZIZ("TopGuestGamePlayService", "TopGuestGamePlayService release");
            C948450amx.LIZIZ.LJI("TOP_GUEST");
        }
        x1().LIZIZ(null, C00FW.LIZ(0, null, false));
        C355501Zp c355501ZpX1 = x1();
        c355501ZpX1.getClass();
        C20441214yg.LIZIZ("TopGuestBannerHelper", "unregister banner");
        C1548820qPI.LJIIIIZZ("guest_point_ranking_banner_ready", c355501ZpX1.LJ);
        C1548820qPI.LJIIIIZZ("guest_point_ranking_banner_show", c355501ZpX1.LJ);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        C20441214yg.LIZIZ(y1(), "onPause");
        C355501Zp c355501ZpX1 = x1();
        c355501ZpX1.getClass();
        C20441214yg.LIZIZ("TopGuestBannerHelper", "onBackground");
        c355501ZpX1.LIZLLL = true;
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        C20441214yg.LIZIZ(y1(), "onResume");
        C355501Zp c355501ZpX1 = x1();
        c355501ZpX1.getClass();
        C20441214yg.LIZIZ("TopGuestBannerHelper", "onForeground");
        if (c355501ZpX1.LIZLLL && c355501ZpX1.LIZ.LIZJ()) {
            c355501ZpX1.LIZ("onForeground");
            c355501ZpX1.LIZ.LIZIZ(new C5183020f(c355501ZpX1, 279));
        }
        c355501ZpX1.LIZLLL = false;
    }
}
