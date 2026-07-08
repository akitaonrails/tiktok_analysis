package Y;

import X.C09JN;
import X.C0UO0;
import X.C11NZ;
import X.C12ES;
import X.C13LP;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C439101nJ;
import X.C470590Icr;
import X.C480460Ism;
import X.C497740JfY;
import X.C786410Ut5;
import X.C930450aJv;
import X.C934890aR5;
import X.C937280aUw;
import X.C960890b71;
import X.EnumC952640ati;
import X.EnumC961090b7L;
import X.InterfaceC420801kM;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract;
import com.bytedance.android.livesdk.chatroom.interact.model.ReportRivalsImpressionsParams;
import com.bytedance.android.livesdk.chatroom.interact.model.ReportRivalsImpressionsResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class ARunnableS23S0400000_15 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C11NZ<C470590Icr<ReportRivalsImpressionsResponse>> c11nzReportRivalsImpressions;
        InterfaceC420801kM interfaceC420801kMLJJLL;
        ReportRivalsImpressionsParams reportRivalsImpressionsParams = new ReportRivalsImpressionsParams();
        List list = (List) this.l2;
        reportRivalsImpressionsParams.scene = 1;
        reportRivalsImpressionsParams.roomIds = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("report recommend cache impressions, section=");
        sbLIZ.append((EnumC952640ati) this.l0);
        sbLIZ.append(", dataType=");
        sbLIZ.append((EnumC961090b7L) this.l1);
        sbLIZ.append(", count=");
        sbLIZ.append(((List) this.l2).size());
        C20441214yg.LJIIIZ("MultiCoHostUpgradeListPresenter", C2188811AlT.LIZIZ(sbLIZ));
        C480460Ism.LIZ().getClass();
        CoHostApi coHostApi = (CoHostApi) C480460Ism.LIZLLL(CoHostApi.class);
        if (coHostApi == null || (c11nzReportRivalsImpressions = coHostApi.reportRivalsImpressions(reportRivalsImpressionsParams)) == null || (interfaceC420801kMLJJLL = c11nzReportRivalsImpressions.LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0b7z
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("MultiCoHostUpgradeListPresenter@7661.maybeReportRecommendCacheImpressions$1$disposable$1");
                C1C7U.LIZIZ("MultiCoHostUpgradeListPresenter@7661.maybeReportRecommendCacheImpressions$1$disposable$1");
            }
        }, new C09JN() { // from class: X.0b7p
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MultiCoHostUpgradeListPresenter@7661.maybeReportRecommendCacheImpressions$1$disposable$2");
                C20441214yg.LJIILIIL("MultiCoHostUpgradeListPresenter", "reportRivalsImpressions failed", (Throwable) obj);
                C1C7U.LIZIZ("MultiCoHostUpgradeListPresenter@7661.maybeReportRecommendCacheImpressions$1$disposable$2");
            }
        })) == null) {
            return;
        }
        ((C960890b71) this.l3).LLLL.LIZ(interfaceC420801kMLJJLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS23S0400000_15.LIZ$1():void");
    }

    public final void LIZ$2() {
        View view;
        if (((View) this.l0).getParent() == null) {
            return;
        }
        View view2 = (View) this.l0;
        View viewFindViewById = view2.findViewById(R.id.o4q);
        if ((viewFindViewById == null && (viewFindViewById = ((View) this.l0).findViewById(R.id.m__)) == null) || view2.getParent() == null) {
            return;
        }
        ((View) this.l1).measure(0, 0);
        int measuredWidth = ((View) this.l1).getMeasuredWidth();
        int measuredHeight = ((View) this.l1).getMeasuredHeight();
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        viewFindViewById.getLocationOnScreen(iArr2);
        int i3 = iArr2[0];
        if (C937280aUw.LIZ(((LayoutSettingContract) this.l2).source) && (view = ((LayoutSettingContract) this.l2).playbookContainer) != null) {
            int[] iArr3 = new int[2];
            view.getLocationOnScreen(iArr3);
            measuredHeight = Math.min(measuredHeight, (i2 - iArr3[1]) + C439101nJ.LIZ(29));
        }
        ((PopupWindow) this.l3).setHeight(measuredHeight);
        int width = view2.getLayoutDirection() == 1 ? i3 - view2.getWidth() : ((i3 + viewFindViewById.getWidth()) - i) - measuredWidth;
        int iLIZIZ = (int) C497740JfY.LIZIZ(8.0f);
        if (C937280aUw.LIZ(((LayoutSettingContract) this.l2).source)) {
            C786410Ut5.k3((PopupWindow) this.l3, view2, 8388659, i + width, (i2 - measuredHeight) - iLIZIZ);
        } else {
            C786410Ut5.i3((PopupWindow) this.l3, view2, width, C934890aR5.LIZ() ? 0 : -iLIZIZ);
        }
    }

    public static final void run$0(ARunnableS23S0400000_15 aRunnableS23S0400000_15) {
        boolean zLIZ;
        C1C7U.LIZ("MultiCoHostUpgradeListPresenter@7661.maybeReportRecommendCacheImpressions$1");
        try {
            aRunnableS23S0400000_15.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiCoHostUpgradeListPresenter@7661.maybeReportRecommendCacheImpressions$1");
    }

    public static final void run$1(ARunnableS23S0400000_15 aRunnableS23S0400000_15) {
        boolean zLIZ;
        C1C7U.LIZ("ModeratorInviteGuideHelper@dc73.showInviteGuide$1$exit$1");
        try {
            ViewGroup viewGroup = (ViewGroup) aRunnableS23S0400000_15.l0;
            if (viewGroup != null) {
                C439101nJ.LJI(viewGroup);
            }
            View view = (View) aRunnableS23S0400000_15.l1;
            if (view != null) {
                C439101nJ.LJI(view);
            }
            ViewGroup viewGroup2 = (ViewGroup) aRunnableS23S0400000_15.l2;
            if (viewGroup2 != null) {
                C12ES.LJIILL(0, viewGroup2);
            }
            ((ArrayList) ((C930450aJv) aRunnableS23S0400000_15.l3).LIZLLL).remove(aRunnableS23S0400000_15);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ModeratorInviteGuideHelper@dc73.showInviteGuide$1$exit$1");
    }

    public static final void run$2(ARunnableS23S0400000_15 aRunnableS23S0400000_15) {
        boolean zLIZ;
        C1C7U.LIZ("FollowSheetFragment@1dc6.onViewCreated$4$2");
        try {
            aRunnableS23S0400000_15.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FollowSheetFragment@1dc6.onViewCreated$4$2");
    }

    public static final void run$3(ARunnableS23S0400000_15 aRunnableS23S0400000_15) {
        boolean zLIZ;
        C1C7U.LIZ("LayoutSettingContract@73d7.showMaxPosPopup$1");
        try {
            aRunnableS23S0400000_15.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LayoutSettingContract@73d7.showMaxPosPopup$1");
    }

    public ARunnableS23S0400000_15(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
