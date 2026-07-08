package Y;

import X.C0S78;
import X.C0SZ8;
import X.C1385040m98;
import X.C1388190mED;
import X.C1389890mGx;
import X.C14K4;
import X.C1570640qyU;
import X.C1575290r5z;
import X.C1575900r6y;
import X.C1575960r74;
import X.C1600710rkz;
import X.C1601400rm6;
import X.C1603970rqF;
import X.C197039127h;
import X.C19EG;
import X.C1C7U;
import X.C20244914Jj;
import X.C20246014Ju;
import X.C989150bqb;
import X.C999090c6d;
import X.C999700c7c;
import X.C999720c7e;
import X.C999880c7u;
import X.C999950c81;
import X.EnumC1575330r63;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.assems.MainActivityBusinessAssem;
import com.ss.android.ugc.aweme.series.vip.assem.SeriesVipSubscriptionAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.vibefeed.feed.component.InvitePanelAssem;
import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedInviteParam;
import com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility;
import com.ss.android.ugc.feed.platform.panel.clearmode.ClearModePanelComponent;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.jvm.internal.AwS146S0201000_24;

/* JADX INFO: loaded from: classes25.dex */
public class ARunnableS30S0201000_24 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (((C1603970rqF) this.l1).LLJ.LLILLL()) {
            return;
        }
        if (((C1603970rqF) this.l1).LLJ.LLJJIJIIJIL.m12() != 0) {
            ((C1603970rqF) this.l1).LLJ.LLJLLIL.postDelayed(this, 100L);
            return;
        }
        C999720c7e c999720c7eLJJIJIIJIL = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJIJIIJIL();
        List list = (List) this.l0;
        int i = this.i2;
        c999720c7eLJJIJIIJIL.getClass();
        C999090c6d.LIZ(c999720c7eLJJIJIIJIL, list, i);
        ((C1603970rqF) this.l1).LLJ.LLJLLIL.removeCallbacks(this);
    }

    public final void LIZ$1() {
        if (((C1603970rqF) this.l1).LLJ.LLJJIJIIJIL.m12() != 0) {
            ((C1603970rqF) this.l1).LLJ.LLJLLIL.postDelayed(this, 100L);
            return;
        }
        C999700c7c c999700c7cLJJ = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJ();
        List list = (List) this.l0;
        int i = this.i2;
        c999700c7cLJJ.getClass();
        C999090c6d.LIZ(c999700c7cLJJ, list, i);
        ((C1603970rqF) this.l1).LLJ.LLJLLIL.removeCallbacks(this);
    }

    public final void LIZ$2() {
        if (((C1603970rqF) this.l1).LLJ.LLJJIJIIJIL.m12() != 0) {
            ((C1603970rqF) this.l1).LLJ.LLJLLIL.postDelayed(this, 100L);
            return;
        }
        C999950c81 c999950c81LJJIZ = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJIZ();
        List list = (List) this.l0;
        int i = this.i2;
        c999950c81LJJIZ.getClass();
        C999090c6d.LIZ(c999950c81LJJIZ, list, i);
        ((C1603970rqF) this.l1).LLJ.LLJLLIL.removeCallbacks(this);
    }

    public final void LIZ$3() {
        if (((C1603970rqF) this.l1).LLJ.LLJJIJIIJIL.m12() != 0) {
            ((C1603970rqF) this.l1).LLJ.LLJLLIL.postDelayed(this, 100L);
            return;
        }
        ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJIJLIJ();
        C999090c6d.LIZ(C989150bqb.LIZ, (List) this.l0, this.i2);
        ((C1603970rqF) this.l1).LLJ.LLJLLIL.removeCallbacks(this);
    }

    public final void LIZ$4() {
        if (((C1603970rqF) this.l1).LLJ.LLJJIJIIJIL.m12() != 0) {
            ((C1603970rqF) this.l1).LLJ.LLJLLIL.postDelayed(this, 100L);
            return;
        }
        C999880c7u c999880c7uLJIJJ = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJIJJ();
        List list = (List) this.l0;
        int i = this.i2;
        c999880c7uLJIJJ.getClass();
        C999090c6d.LIZ(c999880c7uLJIJJ, list, i);
        ((C1603970rqF) this.l1).LLJ.LLJLLIL.removeCallbacks(this);
    }

    public final void LIZ$5() {
        Context context;
        C19EG c19egLIZIZ;
        int i = this.i2;
        if (i == 0) {
            C197039127h c197039127h = (C197039127h) this.l1;
            c197039127h.setText(c197039127h.getContext().getString(2131847977));
            IDetailBaseAbility iDetailBaseAbilityLIZ = C1600710rkz.LIZ(((C1575900r6y) this.l0).LL.LIZJ);
            if (iDetailBaseAbilityLIZ != null) {
                iDetailBaseAbilityLIZ.yF(-1, "invite_panel_dismiss");
            }
        } else if (i == 3002572) {
            C1575900r6y c1575900r6y = (C1575900r6y) this.l0;
            c1575900r6y.LLILZIL = EnumC1575330r63.ACCEPT;
            Context context2 = c1575900r6y.getContext();
            if (context2 != null) {
                ((C1575900r6y) this.l0).LIZ(C1385040m98.LIZ(context2, true));
            }
        } else {
            C1575960r74.LL.getClass();
            if (C1575960r74.LIZLLL() && (context = ((C1575900r6y) this.l0).getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
                c1389890mGx.LJIIJ("invite failed");
                c1389890mGx.LJIIJJI();
            }
        }
        C1575290r5z c1575290r5z = C1575290r5z.LIZ;
        C1575900r6y c1575900r6y2 = (C1575900r6y) this.l0;
        VibeFeedInviteParam vibeFeedInviteParam = c1575900r6y2.LLILLL;
        EnumC1575330r63 enumC1575330r63 = c1575900r6y2.LLILZIL;
        c1575290r5z.getClass();
        C1575290r5z.LIZ(vibeFeedInviteParam, enumC1575330r63, true);
        ((C197039127h) this.l1).setLoading(false);
        ((C197039127h) this.l1).setClickable(true);
    }

    public final void LIZ$6() {
        Context context;
        C19EG c19egLIZIZ;
        int i = this.i2;
        if (i == 0) {
            C197039127h c197039127h = (C197039127h) this.l1;
            c197039127h.setText(((InvitePanelAssem) this.l0).kp().getMutualFeedScene().isGroup() ? c197039127h.getContext().getString(2131835290) : c197039127h.getContext().getString(2131847977));
            ((InvitePanelAssem) this.l0).hp(true);
        } else if (i == 3002572) {
            InvitePanelAssem invitePanelAssem = (InvitePanelAssem) this.l0;
            invitePanelAssem.LLJJLIIIJLLLLLLLZ = EnumC1575330r63.ACCEPT;
            Context context2 = invitePanelAssem.getContext();
            if (context2 != null) {
                ((InvitePanelAssem) this.l0).lp(context2);
            }
        } else {
            C1575960r74.LL.getClass();
            if (C1575960r74.LIZLLL() && (context = ((InvitePanelAssem) this.l0).getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
                c1389890mGx.LJIIJ("invite failed");
                c1389890mGx.LJIIJJI();
            }
        }
        ((C197039127h) this.l1).setLoading(false);
        ((C197039127h) this.l1).setClickable(true);
    }

    public final void LIZ$7() {
        C20244914Jj c20244914JjLIZ;
        if (((View) this.l0).getParent() == null) {
            return;
        }
        int height = ((View) this.l0).getHeight();
        SeriesVipSubscriptionAssem seriesVipSubscriptionAssem = (SeriesVipSubscriptionAssem) this.l1;
        if (height != seriesVipSubscriptionAssem.LLIZLLLIL) {
            seriesVipSubscriptionAssem.LLIZLLLIL = height;
        }
        C20246014Ju c20246014JuLIZ = C14K4.LIZ(seriesVipSubscriptionAssem.LJJIJL());
        ((SeriesVipSubscriptionAssem) this.l1).LLJ = (c20246014JuLIZ == null || (c20244914JjLIZ = c20246014JuLIZ.LIZ(7)) == null) ? ((SeriesVipSubscriptionAssem) this.l1).LLJ : c20244914JjLIZ.LIZLLL;
        SeriesVipSubscriptionAssem.Lo((SeriesVipSubscriptionAssem) this.l1, this.i2);
    }

    public static final void run$0(ARunnableS30S0201000_24 aRunnableS30S0201000_24) {
        boolean zLIZ;
        C1C7U.LIZ("BaseListFragmentPanel@112.onViewCreated$3$adPreCheck$1");
        try {
            aRunnableS30S0201000_24.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseListFragmentPanel@112.onViewCreated$3$adPreCheck$1");
    }

    public static final void run$1(ARunnableS30S0201000_24 aRunnableS30S0201000_24) {
        boolean zLIZ;
        C1C7U.LIZ("BaseListFragmentPanel@112.onViewCreated$3$adPreCheck$2");
        try {
            aRunnableS30S0201000_24.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseListFragmentPanel@112.onViewCreated$3$adPreCheck$2");
    }

    public static final void run$10(ARunnableS30S0201000_24 aRunnableS30S0201000_24) {
        boolean zLIZ;
        C1C7U.LIZ("InvitePanelAssem@da9e.invite$1$1");
        try {
            aRunnableS30S0201000_24.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InvitePanelAssem@da9e.invite$1$1");
    }

    public static final void run$11(ARunnableS30S0201000_24 aRunnableS30S0201000_24) {
        boolean zLIZ;
        C1C7U.LIZ("SeriesVipSubscriptionAssem@4337.bindFooterHeightToListPadding$3");
        try {
            aRunnableS30S0201000_24.LIZ$7();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SeriesVipSubscriptionAssem@4337.bindFooterHeightToListPadding$3");
    }

    public static final void run$2(ARunnableS30S0201000_24 aRunnableS30S0201000_24) {
        boolean zLIZ;
        C1C7U.LIZ("BaseListFragmentPanel@112.onViewCreated$3$adPreCheck$3");
        try {
            aRunnableS30S0201000_24.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseListFragmentPanel@112.onViewCreated$3$adPreCheck$3");
    }

    public static final void run$3(ARunnableS30S0201000_24 aRunnableS30S0201000_24) {
        boolean zLIZ;
        C1C7U.LIZ("BaseListFragmentPanel@112.onViewCreated$3$adPreCheck$4");
        try {
            aRunnableS30S0201000_24.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseListFragmentPanel@112.onViewCreated$3$adPreCheck$4");
    }

    public static final void run$4(ARunnableS30S0201000_24 aRunnableS30S0201000_24) {
        boolean zLIZ;
        C1C7U.LIZ("BaseListFragmentPanel@112.onViewCreated$3$adPreCheck$5");
        try {
            aRunnableS30S0201000_24.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseListFragmentPanel@112.onViewCreated$3$adPreCheck$5");
    }

    public static final void run$5(ARunnableS30S0201000_24 aRunnableS30S0201000_24) {
        boolean zLIZ;
        C1C7U.LIZ("SkylightListViewModel@8bc2.listAddItemAt$$inlined$safeMutateListAlways$1");
        try {
            super/*com.bytedance.ext_power_list.AssemListViewModel*/.listAddItemAt(aRunnableS30S0201000_24.i2, (InterfaceC1891350zJl) aRunnableS30S0201000_24.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SkylightListViewModel@8bc2.listAddItemAt$$inlined$safeMutateListAlways$1");
    }

    public static final void run$6(ARunnableS30S0201000_24 aRunnableS30S0201000_24) {
        boolean zLIZ;
        C1C7U.LIZ("MainActivityBusinessAssem@dc1b.openRevisitFeedSidebar$1");
        try {
            MainActivityBusinessAssem mainActivityBusinessAssem = (MainActivityBusinessAssem) aRunnableS30S0201000_24.l0;
            if (mainActivityBusinessAssem.LLJILJILJ == aRunnableS30S0201000_24.i2 && !((ScrollSwitchStateManager) aRunnableS30S0201000_24.l1).FQ2("page_sidebar")) {
                C1570640qyU.LIZ.LIZ();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MainActivityBusinessAssem@dc1b.openRevisitFeedSidebar$1");
    }

    public static final void run$7(ARunnableS30S0201000_24 aRunnableS30S0201000_24) {
        boolean zLIZ;
        C1C7U.LIZ("ClearModePanelComponent@24bc.onParentViewCreated$1$onPageScrollStateChanged$1$1");
        try {
            ((ClearModePanelComponent) aRunnableS30S0201000_24.l0).Ao(aRunnableS30S0201000_24.i2, (C0SZ8) aRunnableS30S0201000_24.l1, "post_hide_true");
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClearModePanelComponent@24bc.onParentViewCreated$1$onPageScrollStateChanged$1$1");
    }

    public static final void run$8(ARunnableS30S0201000_24 aRunnableS30S0201000_24) {
        boolean zLIZ;
        C1C7U.LIZ("VibeEntranceInviteCell@4a6.invite$1$1");
        try {
            aRunnableS30S0201000_24.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VibeEntranceInviteCell@4a6.invite$1$1");
    }

    public static final void run$9(ARunnableS30S0201000_24 aRunnableS30S0201000_24) {
        boolean zLIZ;
        C1C7U.LIZ("FypFeedFetchOpt@ccf9.notifyFeedRendered$1");
        try {
            C0S78.LIZJ(new AwS146S0201000_24((C1601400rm6) aRunnableS30S0201000_24.l0, aRunnableS30S0201000_24.i2, (FeedItemList) aRunnableS30S0201000_24.l1, 2), true);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FypFeedFetchOpt@ccf9.notifyFeedRendered$1");
    }

    public ARunnableS30S0201000_24(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
