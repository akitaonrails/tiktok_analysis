package X;

import com.ss.android.ugc.aweme.friendstab.model.SingleTabCounter;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0rOy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1587060rOy implements InterfaceC1584860rLQ {
    public String LIZ = "friends";
    public final Map<String, Integer> LIZIZ = new LinkedHashMap();

    public static AbstractC1591090rVT LJI() {
        C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
        if (c19egLIZIZ != null) {
            return HomeTabViewModel.LLILZIL.LIZ(c19egLIZIZ).LLILZ;
        }
        return null;
    }

    public static final boolean LIZLLL() {
        AbstractC1591090rVT abstractC1591090rVTLJI = LJI();
        if (abstractC1591090rVTLJI != null) {
            return abstractC1591090rVTLJI.LJJIIJ("FRIENDS_TAB");
        }
        return false;
    }

    public final void LIZIZ() {
        AbstractC1591090rVT abstractC1591090rVTLJI = LJI();
        if (abstractC1591090rVTLJI != null) {
            if (abstractC1591090rVTLJI.LJIJ("FRIENDS_TAB") > 0) {
                abstractC1591090rVTLJI.LJIIJJI(0, "FRIENDS_TAB");
            } else if (LIZLLL()) {
                abstractC1591090rVTLJI.LJJIFFI("FRIENDS_TAB");
            }
        }
    }

    public final void LIZJ() {
        AbstractC1591090rVT abstractC1591090rVTLJI = LJI();
        if (abstractC1591090rVTLJI == null || !LIZLLL()) {
            return;
        }
        abstractC1591090rVTLJI.LJJIFFI("FRIENDS_TAB");
    }

    public final boolean LJ() {
        return getDotCount() > 0;
    }

    public final void LJFF() {
        AbstractC1591090rVT abstractC1591090rVTLJI;
        if (getDotCount() > 0 || StateOwner.LL.LIZIZ() == null || (abstractC1591090rVTLJI = LJI()) == null) {
            return;
        }
        abstractC1591090rVTLJI.LJJJJZI("FRIENDS_TAB");
    }

    @Override // X.InterfaceC1584860rLQ
    public final int getDotCount() {
        AbstractC1591090rVT abstractC1591090rVTLJI = LJI();
        if (abstractC1591090rVTLJI != null) {
            return abstractC1591090rVTLJI.LJIJ("FRIENDS_TAB");
        }
        return 0;
    }

    public C1587060rOy(String str) {
    }

    public final void LIZ(int i) {
        AbstractC1591090rVT abstractC1591090rVTLJI = LJI();
        if (abstractC1591090rVTLJI != null) {
            abstractC1591090rVTLJI.LJIIJJI(i, "FRIENDS_TAB");
        }
        ((LinkedHashMap) this.LIZIZ).clear();
        CopyOnWriteArrayList<SingleTabCounter> copyOnWriteArrayListLIZLLL = ((C1586770rOV) C1586750rOT.LIZ.getValue()).LIZLLL();
        if (copyOnWriteArrayListLIZLLL != null) {
            for (SingleTabCounter singleTabCounter : copyOnWriteArrayListLIZLLL) {
                this.LIZIZ.put(singleTabCounter.tag, Integer.valueOf(singleTabCounter.numberCount));
            }
        }
    }
}
