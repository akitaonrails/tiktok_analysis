package Y;

import X.C00IY;
import X.C19EG;
import X.C1C7U;
import X.InterfaceC1565640qqQ;
import Y.ARunnableS119S0100000_19;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.feed.platform.panel.base.EventCenter;
import com.ss.android.ugc.feed.platform.panel.digg.DiggPanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public class ARunnableS11S1300000_11 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        final C19EG c19egLIZ = ((DiggPanelComponent) this.l1).getPanelContext().LIZ();
        if (c19egLIZ == null || c19egLIZ.isFinishing()) {
            return;
        }
        Keva keva = DiggPanelComponent.LLJJJ;
        DiggPanelComponent.LLJJJ.storeBoolean("didLike", true);
        Long l = (Long) this.l2;
        final long jLongValue = (l == null || l.longValue() <= 0) ? 3000L : ((Long) this.l2).longValue();
        IViewPagerComponentAbility iViewPagerComponentAbilityMb = ((DiggPanelComponent) this.l1).Mb();
        if (iViewPagerComponentAbilityMb != null) {
            final C00IY c00iy = (C00IY) this.l3;
            final String str = this.s0;
            final DiggPanelComponent diggPanelComponent = (DiggPanelComponent) this.l1;
            iViewPagerComponentAbilityMb.postDelayed(new Runnable() { // from class: X.0iNM
                public final void LIZ() {
                    if (c00iy == C00IY.TOP_DARK) {
                        C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
                        c1389890mGx.LJFF(R.raw.icon_color_gradient_heart);
                        c1389890mGx.LJIIJ(str);
                        c1389890mGx.LIZLLL(jLongValue);
                        c1389890mGx.LJIIJJI();
                        return;
                    }
                    DialogC1240090iNL dialogC1240090iNL = new DialogC1240090iNL(c19egLIZ);
                    dialogC1240090iNL.show();
                    C785410UrT.LIZIZ(dialogC1240090iNL);
                    PopupMonitorServiceImpl.LIZ.getClass();
                    PopupMonitorServiceImpl.LJJJ(dialogC1240090iNL);
                    C816490W1f.LIZ(dialogC1240090iNL);
                    String str2 = str;
                    dialogC1240090iNL.LL.setIconRes(R.raw.icon_color_gradient_heart);
                    dialogC1240090iNL.LLILLJJLI.setText(str2);
                    IViewPagerComponentAbility iViewPagerComponentAbilityMb2 = diggPanelComponent.Mb();
                    if (iViewPagerComponentAbilityMb2 != null) {
                        iViewPagerComponentAbilityMb2.postDelayed(new ARunnableS119S0100000_19(dialogC1240090iNL, 98), jLongValue);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("DiggPanelComponent@c22c.showLikeToastIfNeeded$1$onNext$1$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("DiggPanelComponent@c22c.showLikeToastIfNeeded$1$onNext$1$1");
                }
            }, 750L);
        }
    }

    public static final void run$0(ARunnableS11S1300000_11 aRunnableS11S1300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("DiggPanelComponent@c22c.showLikeToastIfNeeded$1$onNext$1");
        try {
            aRunnableS11S1300000_11.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DiggPanelComponent@c22c.showLikeToastIfNeeded$1$onNext$1");
    }

    public static final void run$1(ARunnableS11S1300000_11 aRunnableS11S1300000_11) {
        boolean zLIZ;
        C1C7U.LIZ("EventCenter@44f6.send$1");
        try {
            ((EventCenter) aRunnableS11S1300000_11.l1).CQ2((InterfaceC1565640qqQ) aRunnableS11S1300000_11.l2, aRunnableS11S1300000_11.s0, aRunnableS11S1300000_11.l3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EventCenter@44f6.send$1");
    }

    public ARunnableS11S1300000_11(Object obj, Object obj2, String str, Object obj3, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
        this.l3 = obj3;
    }
}
