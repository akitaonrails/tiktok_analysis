package Y;

import X.AbstractC21674019s2;
import X.C1170704i1;
import X.C1330590kjJ;
import X.C1391550mJd;
import X.C13LZ;
import X.C1638280sja;
import X.C1644050sst;
import X.C1654040t90;
import X.C1656050tCF;
import X.C1C7U;
import X.C21366318jV;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C531650Kt9;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1235690iGF;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.StickerCategoryFragment;
import com.ss.android.ugc.gamora.recorder.voicechange.slideslip.g;
import com.ss.android.ugc.gamora.recorder.voicechange.slideslip.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS174S1100000_25;
import kotlin.jvm.internal.AwS37S0001000_25;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes26.dex */
public class ARunnableS36S0101000_25 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1638280sja c1638280sja = C21366318jV.LIZLLL;
        Context contextO3 = C786410Ut5.O3(((C1656050tCF) this.l0).H4());
        C1656050tCF c1656050tCF = (C1656050tCF) this.l0;
        int i = c1656050tCF.LLLLIILL;
        c1656050tCF.LLLLIILL = i + 1;
        int i2 = i < 2 ? 2131846545 : 2131846546;
        c1638280sja.getClass();
        C1638280sja.LIZ(i2, 0, contextO3).LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("process running error, error code: ");
        sbLIZ.append(this.i1);
        C1644050sst c1644050sst = new C1644050sst(C2188811AlT.LIZIZ(sbLIZ));
        c1644050sst.LIZ = 1;
        ((C1656050tCF) this.l0).h81(c1644050sst);
    }

    public final void LIZ$1() {
        String str;
        C1170704i1 c1170704i1;
        TabHost tabHost;
        LinearLayout linearLayout;
        View childAt;
        C1654040t90 c1654040t90 = (C1654040t90) this.l0;
        int i = this.i1;
        TabHost tabHost2 = c1654040t90.LLJJL;
        if (tabHost2 == null || tabHost2.getCurrentIndex() != i) {
            return;
        }
        TabHost tabHost3 = c1654040t90.LLJJL;
        IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, tabHost3 != null ? tabHost3.getTabCount() : 0);
        ArrayList arrayList = new ArrayList();
        C531650Kt9 it2 = intRangeLJIILJJIL.iterator();
        while (it2.LLILLL) {
            Object next = it2.next();
            if (((Number) next).intValue() != i) {
                arrayList.add(next);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            int iIntValue = ((Number) it3.next()).intValue();
            TabHost tabHost4 = c1654040t90.LLJJL;
            Object objLIZ = tabHost4 != null ? tabHost4.LIZ(iIntValue) : null;
            if ((objLIZ instanceof String) && (str = (String) objLIZ) != null && (c1170704i1 = (C1170704i1) ((LinkedHashMap) c1654040t90.LLJLL).get(str)) != null && (tabHost = c1654040t90.LLJJL) != null && (linearLayout = tabHost.LLIZ) != null && (childAt = linearLayout.getChildAt(iIntValue)) != null) {
                C1391550mJd c1391550mJd = new C1391550mJd(c1654040t90.requireSceneContext());
                c1391550mJd.LLILLJJLI.LIZIZ = childAt;
                c1391550mJd.LIZLLL();
                c1391550mJd.LLILLJJLI.LIZLLL = EnumC1235690iGF.TOP;
                c1391550mJd.LJI(-1);
                TuxTextView tuxTextView = new TuxTextView(childAt.getContext(), null, 6, 0);
                tuxTextView.setText(c1170704i1.LIZ);
                tuxTextView.setTuxFont(52);
                tuxTextView.setTextColor(-16777216);
                tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0);
                c1391550mJd.LLILLJJLI.LJIIZILJ = tuxTextView;
                c1391550mJd.LJ(new AwS174S1100000_25(c1654040t90, str, 6));
                c1391550mJd.LIZIZ().show();
            }
        }
    }

    public final void LIZ$2() {
        StickerCategoryFragment stickerCategoryFragment = (StickerCategoryFragment) this.l0;
        if (stickerCategoryFragment.LLJJJJJIL != this.i1) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ignore position = ");
            sbLIZ.append(this.i1);
            C1330590kjJ.LIZIZ("StickerCategoryFragment", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        int iFindFirstCompletelyVisibleItemPosition = stickerCategoryFragment.NR().findFirstCompletelyVisibleItemPosition();
        int iFindLastCompletelyVisibleItemPosition = ((StickerCategoryFragment) this.l0).NR().findLastCompletelyVisibleItemPosition();
        int i2 = this.i1;
        if (iFindFirstCompletelyVisibleItemPosition > i2 || i2 > iFindLastCompletelyVisibleItemPosition) {
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("scroll2ScreenCenterIfNeed position = ");
            sbLIZ2.append(this.i1);
            C1330590kjJ.LIZIZ("StickerCategoryFragment", C2188811AlT.LIZIZ(sbLIZ2));
            StickerCategoryFragment stickerCategoryFragment2 = (StickerCategoryFragment) this.l0;
            int i4 = this.i1;
            if (stickerCategoryFragment2.getContext() != null) {
                ((AbstractC21674019s2) stickerCategoryFragment2.LLJJIJIIJIL.getValue()).LIZ = i4;
                stickerCategoryFragment2.NR().startSmoothScroll((AbstractC21674019s2) stickerCategoryFragment2.LLJJIJIIJIL.getValue());
            }
        }
    }

    public static final void run$0(ARunnableS36S0101000_25 aRunnableS36S0101000_25) {
        boolean zLIZ;
        C1C7U.LIZ("RecordControlCoreComponent@4e10.processRunningError$1");
        try {
            aRunnableS36S0101000_25.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecordControlCoreComponent@4e10.processRunningError$1");
    }

    public static final void run$1(ARunnableS36S0101000_25 aRunnableS36S0101000_25) {
        boolean zLIZ;
        C1C7U.LIZ("ShootTopTabScene@8852.onTabHostIndexChanged$1$1");
        try {
            aRunnableS36S0101000_25.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShootTopTabScene@8852.onTabHostIndexChanged$1$1");
    }

    public static final void run$2(ARunnableS36S0101000_25 aRunnableS36S0101000_25) {
        boolean zLIZ;
        int i;
        C1C7U.LIZ("SVCBottomAndPanelAndPanelUISlotComponent@c18f.updateProgress$2");
        try {
            i = aRunnableS36S0101000_25.i1;
        } finally {
            if (!zLIZ) {
            }
        }
        if (i == 0) {
            ((g) aRunnableS36S0101000_25.l0).LLLLLJIL = 0;
        } else {
            if (i <= 0 || ((g) aRunnableS36S0101000_25.l0).LLLLLJIL != -1) {
            }
            C1C7U.LIZIZ("SVCBottomAndPanelAndPanelUISlotComponent@c18f.updateProgress$2");
        }
        ((g) aRunnableS36S0101000_25.l0).E5(new AwS37S0001000_25(i, 3));
        C1C7U.LIZIZ("SVCBottomAndPanelAndPanelUISlotComponent@c18f.updateProgress$2");
    }

    public static final void run$3(ARunnableS36S0101000_25 aRunnableS36S0101000_25) {
        boolean zLIZ;
        C1C7U.LIZ("SVCBottomAndPanelUISlotScene@854b.updateBottomView$1");
        try {
            v vVar = (v) aRunnableS36S0101000_25.l0;
            int i = aRunnableS36S0101000_25.i1;
            RecyclerView recyclerView = vVar.LLJLL;
            if (recyclerView == null) {
                recyclerView = null;
            }
            recyclerView.smoothScrollToPosition(i);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SVCBottomAndPanelUISlotScene@854b.updateBottomView$1");
    }

    public static final void run$4(ARunnableS36S0101000_25 aRunnableS36S0101000_25) {
        boolean zLIZ;
        C1C7U.LIZ("StickerCategoryFragment@6127.scroll2ScreenCenterIfNeed$1");
        try {
            aRunnableS36S0101000_25.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StickerCategoryFragment@6127.scroll2ScreenCenterIfNeed$1");
    }

    public ARunnableS36S0101000_25(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
