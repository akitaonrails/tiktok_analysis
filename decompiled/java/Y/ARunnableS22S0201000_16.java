package Y;

import X.C0P0T;
import X.C1035880d3y;
import X.C1038790d8f;
import X.C1073910e3J;
import X.C1388190mED;
import X.C1391600mJi;
import X.C1637780sim;
import X.C1651690t5D;
import X.C196868120s;
import X.C19EG;
import X.C1C7U;
import X.C2214201BlK;
import X.C304890BxH;
import X.C450720Hlu;
import X.C786410Ut5;
import X.EnumC1235690iGF;
import X.InterfaceC1036110d4L;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.ffp.ui.RecFriendsFragment;
import com.ss.android.ugc.aweme.tracker.TrackerImpl;
import com.ss.android.ugc.aweme.web.service.IAdWebUIUtils;
import com.ss.android.ugc.profile.business.ur.following.ui.SuggestRelationFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS22S0201000_16 implements Runnable {
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Activity activityLJFF;
        C19EG c19egLIZIZ;
        String uid;
        User currentUser;
        InterfaceC1036110d4L interfaceC1036110d4L;
        C1038790d8f c1038790d8f = C1038790d8f.LIZ;
        TuxIconView tuxIconView = (TuxIconView) this.l0;
        int i = this.i2;
        SparkContext sparkContext = (SparkContext) this.l1;
        c1038790d8f.getClass();
        C1035880d3y c1035880d3y = null;
        IAdWebUIUtils iAdWebUIUtils = (IAdWebUIUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUIUtils.class, false, false, false, 14, null);
        if (iAdWebUIUtils == null || !iAdWebUIUtils.LIZ(sparkContext, null)) {
            if (sparkContext != null) {
                try {
                    c1035880d3y = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            if (!((IAdWebUIUtils) ServiceManager.get().getService(IAdWebUIUtils.class)).LIZJ(c1035880d3y) || tuxIconView == null || tuxIconView.getVisibility() != 0 || (activityLJFF = C2214201BlK.LJFF()) == null || (c19egLIZIZ = C1388190mED.LIZIZ(activityLJFF)) == null) {
                return;
            }
            C450720Hlu c450720Hlu = new C450720Hlu(c19egLIZIZ);
            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
            c1391600mJi.LIZIZ = tuxIconView;
            c1391600mJi.LIZLLL = i == 1 ? EnumC1235690iGF.BOTTOM : EnumC1235690iGF.TOP;
            c450720Hlu.LJII(R.attr.a0d);
            c450720Hlu.LLILZ = tuxIconView.getContext().getString(2131821699);
            C1391600mJi c1391600mJi2 = c450720Hlu.LLILLJJLI;
            c1391600mJi2.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
            c1391600mJi2.LJIJJ = true;
            c450720Hlu.LJIIIZ(true, null);
            C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
            C1038790d8f.LIZIZ = c0p0tLIZIZ;
            c0p0tLIZIZ.show();
            if (c1035880d3y != null) {
                c1035880d3y.setShouldShowHistoryTips(false);
                c1035880d3y.setShowedHistoryTips(true);
            }
            if (sparkContext != null && (interfaceC1036110d4L = (InterfaceC1036110d4L) sparkContext.LJFF(InterfaceC1036110d4L.class)) != null) {
                interfaceC1036110d4L.LJJJJJ();
            }
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (uid = currentUser.getUid()) == null) {
                uid = "default";
            }
            Keva.getRepo("iab_history_tips").storeBoolean(uid, true);
        }
    }

    public static final void run$0(ARunnableS22S0201000_16 aRunnableS22S0201000_16) {
        boolean zLIZ;
        C1C7U.LIZ("AdPopUpWebBottomSheetBehavior@e11a.setState$1");
        try {
            ((AdPopUpWebBottomSheetBehavior) aRunnableS22S0201000_16.l1).startSettlingAnimation((View) aRunnableS22S0201000_16.l0, aRunnableS22S0201000_16.i2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdPopUpWebBottomSheetBehavior@e11a.setState$1");
    }

    public static final void run$1(ARunnableS22S0201000_16 aRunnableS22S0201000_16) {
        DetailFragmentPanel detailFragmentPanel = (DetailFragmentPanel) aRunnableS22S0201000_16.l0;
        Aweme aweme = (Aweme) aRunnableS22S0201000_16.l1;
        int i = aRunnableS22S0201000_16.i2;
        detailFragmentPanel.getClass();
        C1C7U.LIZ("DetailFragmentPanel@5b0b.showDonationDialog$1L");
        detailFragmentPanel.u0(i + 1, aweme);
        C1C7U.LIZIZ("DetailFragmentPanel@5b0b.showDonationDialog$1L");
    }

    public static final void run$2(ARunnableS22S0201000_16 aRunnableS22S0201000_16) {
        boolean zLIZ;
        C1C7U.LIZ("DuetLayoutHelper@4e9b.showBubbleHintView$1");
        try {
            if (!((Activity) aRunnableS22S0201000_16.l0).isFinishing()) {
                ((C0P0T) aRunnableS22S0201000_16.l1).show();
                C1637780sim c1637780sim = C1651690t5D.LIZ;
                int i = aRunnableS22S0201000_16.i2 + 1;
                if (c1637780sim.LIZIZ == null) {
                    c1637780sim.LIZIZ = c1637780sim.LIZ.edit();
                }
                c1637780sim.LIZIZ.putInt("duet_layout_tool_bar_bubble_hint", i).apply();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DuetLayoutHelper@4e9b.showBubbleHintView$1");
    }

    public static final void run$3(ARunnableS22S0201000_16 aRunnableS22S0201000_16) {
        C196868120s c196868120s = (C196868120s) aRunnableS22S0201000_16.l0;
        View view = (View) aRunnableS22S0201000_16.l1;
        int i = aRunnableS22S0201000_16.i2;
        c196868120s.getClass();
        C1C7U.LIZ("InfoStickerHelper@8ef8.initBorderLineView$1L$1L");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).topMargin = i;
            C786410Ut5.W5(view, layoutParams);
        }
        C1C7U.LIZIZ("InfoStickerHelper@8ef8.initBorderLineView$1L$1L");
    }

    public static final void run$4(ARunnableS22S0201000_16 aRunnableS22S0201000_16) {
        boolean zLIZ;
        C1C7U.LIZ("TrackerImpl@f2d4.requestParentReportPrfInfoInternal$3");
        try {
            ((TrackerImpl) aRunnableS22S0201000_16.l0).LJL(aRunnableS22S0201000_16.i2 + 1, (Long) aRunnableS22S0201000_16.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TrackerImpl@f2d4.requestParentReportPrfInfoInternal$3");
    }

    public static final void run$5(ARunnableS22S0201000_16 aRunnableS22S0201000_16) {
        boolean zLIZ;
        C1C7U.LIZ("IABHistoryUtils@9775.showHistoryTips$1");
        try {
            aRunnableS22S0201000_16.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IABHistoryUtils@9775.showHistoryTips$1");
    }

    public static final void run$6(ARunnableS22S0201000_16 aRunnableS22S0201000_16) {
        boolean zLIZ;
        Context context;
        C1C7U.LIZ("RecFriendsFragment@8dbb.handleRecMoreInsertedScroll$1");
        try {
            if (((RecFriendsFragment) aRunnableS22S0201000_16.l0).isActive() && (context = ((RecFriendsFragment) aRunnableS22S0201000_16.l0).getContext()) != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) aRunnableS22S0201000_16.l1;
                int i = aRunnableS22S0201000_16.i2;
                C1073910e3J c1073910e3J = new C1073910e3J(context, C304890BxH.LIZLLL(), true);
                c1073910e3J.LIZ = i;
                linearLayoutManager.startSmoothScroll(c1073910e3J);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecFriendsFragment@8dbb.handleRecMoreInsertedScroll$1");
    }

    public static final void run$7(ARunnableS22S0201000_16 aRunnableS22S0201000_16) {
        boolean zLIZ;
        Context context;
        C1C7U.LIZ("SuggestRelationFragment@9630.handleRecMoreInsertedScroll$1");
        try {
            if (((SuggestRelationFragment) aRunnableS22S0201000_16.l0).isActive() && (context = ((SuggestRelationFragment) aRunnableS22S0201000_16.l0).getContext()) != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) aRunnableS22S0201000_16.l1;
                int i = aRunnableS22S0201000_16.i2;
                C1073910e3J c1073910e3J = new C1073910e3J(context, C304890BxH.LIZLLL(), false);
                c1073910e3J.LIZ = i;
                linearLayoutManager.startSmoothScroll(c1073910e3J);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SuggestRelationFragment@9630.handleRecMoreInsertedScroll$1");
    }

    public ARunnableS22S0201000_16(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj2;
        this.i2 = i;
        this.l1 = obj;
    }
}
