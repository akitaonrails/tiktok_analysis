package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.touchpoint.api.model.LynxFeedBannerPicture;
import com.bytedance.touchpoint.api.model.ReferralFeedBanner;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS128S1200000_12;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zOm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1894460zOm implements InterfaceC690020R4u {
    public boolean LIZ;
    public View LIZIZ;
    public FrameLayout LIZJ;
    public View LIZLLL;
    public View LJ;
    public View LJFF;
    public View LJI;
    public LynxFeedBannerPicture LJII;
    public Context LJIIIIZZ;

    @Override // X.InterfaceC690020R4u
    public final void LIZIZ() {
        LJ(false, C056Q.SCROLLED);
    }

    @Override // X.InterfaceC690020R4u
    public final void LIZJ() {
        FrameLayout frameLayout = this.LIZJ;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        View view = this.LIZIZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LIZLLL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        View view3 = this.LJFF;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        View view4 = this.LJI;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(0, view4);
        }
        View view5 = this.LJ;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(0, view5);
        }
        this.LIZ = false;
    }

    @Override // X.InterfaceC690020R4u
    public final void LIZLLL() {
        String str;
        if (this.LIZ) {
            C1620370sGh.LIZ(100);
            return;
        }
        C01GW<C759500Tqm> c01gw = C759500Tqm.LJ;
        C759500Tqm c759500TqmLIZ = C739380SzQ.LIZ();
        LynxFeedBannerPicture lynxFeedBannerPicture = this.LJII;
        if (lynxFeedBannerPicture == null || (str = lynxFeedBannerPicture.jsSource) == null) {
            str = "";
        }
        C1894200zOM c1894200zOMLIZJ = c759500TqmLIZ.LIZJ(str);
        if (c1894200zOMLIZJ != null && Intrinsics.LJFF(c1894200zOMLIZJ.LLJIJIL, C1894260zOS.LIZIZ)) {
            c1894200zOMLIZJ.LLJIJIL = C1894240zOQ.LIZIZ;
        }
        LJ(true, C056Q.SCROLLED);
    }

    @Override // X.InterfaceC690020R4u
    public final boolean isShowing() {
        View view = this.LIZIZ;
        return view != null && view.getVisibility() == 0;
    }

    public final void LJ(boolean z, C056Q c056q) {
        String str;
        String str2;
        C01GW<C759500Tqm> c01gw = C759500Tqm.LJ;
        C759500Tqm c759500TqmLIZ = C739380SzQ.LIZ();
        LynxFeedBannerPicture lynxFeedBannerPicture = this.LJII;
        if (lynxFeedBannerPicture == null || (str = lynxFeedBannerPicture.jsSource) == null) {
            str = "";
        }
        C1894200zOM c1894200zOMLIZJ = c759500TqmLIZ.LIZJ(str);
        if (c1894200zOMLIZJ == null || this.LJIIIIZZ == null) {
            return;
        }
        if (z) {
            str2 = c1894200zOMLIZJ.LLJ;
        } else {
            str2 = c1894200zOMLIZJ.LLJI;
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("type", Integer.valueOf(c056q.getType())));
        if (z) {
            C01U6.LIZIZ(new AwS572S0100000_28(mapLJIIJ, (Map<String, Object>) LSPassThroughRecordSizeConfig.DEFAULT));
        }
        if (this.LJIIIIZZ != null) {
            C01U6.LIZIZ(new AwS128S1200000_12(c1894200zOMLIZJ, (C1894200zOM) str2, (String) mapLJIIJ, (Map<String, ? extends Object>) 4));
        }
    }

    @Override // X.InterfaceC690020R4u
    public final void LIZ(ViewStub viewStub, String str, Context context, int i, View view, View view2, View view3, View view4, String str2) {
        LynxFeedBannerPicture lynxFeedBannerPicture;
        LIZJ();
        if (context == null) {
            return;
        }
        ReferralFeedBanner referralFeedBannerLJII = C0T82.LIZJ(str2).LJII(str);
        if (referralFeedBannerLJII == null) {
            C1620370sGh.LIZIZ(101, 100, "lynx referralFeedBanner null");
            this.LIZ = true;
            return;
        }
        List<LynxFeedBannerPicture> list = referralFeedBannerLJII.LJII;
        FrameLayout frameLayout = null;
        if (list != null) {
            lynxFeedBannerPicture = (LynxFeedBannerPicture) C13LP.LJJJLZIJ(i, list);
        } else {
            lynxFeedBannerPicture = null;
        }
        this.LJII = lynxFeedBannerPicture;
        if (lynxFeedBannerPicture == null) {
            C1620370sGh.LIZIZ(102, 100, "lynx LynxFeedBannerPicture null");
            this.LIZ = true;
            return;
        }
        this.LJIIIIZZ = context;
        viewStub.setLayoutResource(R.layout.fwn);
        this.LIZLLL = view;
        this.LJ = view2;
        this.LJFF = view3;
        this.LJI = view4;
        View view5 = this.LIZIZ;
        if (view5 == null) {
            View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            this.LIZIZ = viewLJLLLL;
            if (viewLJLLLL != null) {
                frameLayout = (FrameLayout) viewLJLLLL.findViewById(R.id.ygd);
            }
            this.LIZJ = frameLayout;
            View view6 = this.LIZIZ;
            if (view6 != null) {
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0zOn
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view7) {
                    }
                }, view6);
            }
            View view7 = this.LIZIZ;
            if (view7 != null) {
                view7.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0zOo
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view8) {
                        return true;
                    }
                });
            }
        } else {
            C786410Ut5.LJLLLLLL(0, view5);
        }
        C01U6.LIZIZ(new AwS572S0100000_28(this, 1001));
    }
}
