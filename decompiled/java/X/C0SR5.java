package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SR5, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SR5 extends C713370RyZ implements InterfaceC21605219gw {
    public final C0SR8 LLJL;
    public final C01GW LLJLIL;

    @Override // X.C713370RyZ, X.C0SR4
    public final String LJJJLIIL() {
        return "fyp_feed";
    }

    @Override // X.InterfaceC21605219gw
    public final void LJI() {
        this.LLJL.fu(true);
    }

    @Override // X.C0SR4, X.InterfaceC692440REc
    public final int LJIILJJIL(String str) {
        Aweme awemeLLILZ;
        IAwemeService iAwemeService = (IAwemeService) this.LLJLIL.getValue();
        if (iAwemeService != null && (awemeLLILZ = iAwemeService.LLILZ(str)) != null && this.LLJL.au(awemeLLILZ) >= 0) {
            return this.LLJL.au(awemeLLILZ);
        }
        if (str != null && this.LLJL.du(str) >= 0) {
            return this.LLJL.du(str);
        }
        List<Aweme> list = this.LLJL.getList();
        if (list == null) {
            return -1;
        }
        Iterator<Aweme> it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().getAid(), str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // X.C713370RyZ, X.C0SR4, androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        String uniqueId;
        String uniqueId2;
        C0SZ8 c0sz8LJJLIIIIJ = C0SR4.LJJLIIIIJ((View) obj);
        if (c0sz8LJJLIIIIJ != null && c0sz8LJJLIIIIJ.getAweme() != null) {
            Aweme aweme = c0sz8LJJLIIIIJ.getAweme();
            C01GW c01gw = C1594720rbK.LIZ;
            if (!C1594720rbK.LIZIZ(c0sz8LJJLIIIIJ.getAweme())) {
                int iLJJLIIIJ = LJJLIIIJ(aweme);
                if (iLJJLIIIJ < 0) {
                    return -2;
                }
                Aweme item = getItem(iLJJLIIIJ);
                if (C274210Aot.LIZ && !C729510SjV.LJJIIZ(aweme) && (aweme != item || !aweme.equals(item))) {
                    c0sz8LJJLIIIIJ.L0(iLJJLIIIJ, item);
                }
                return iLJJLIIIJ;
            }
            int iLJJLIIIJ2 = LJJLIIIJ(c0sz8LJJLIIIIJ.getAweme());
            Aweme item2 = getItem(iLJJLIIIJ2);
            if (item2 != null) {
                uniqueId = AwemeSaaSExtKt.getUniqueId(item2);
            } else {
                uniqueId = null;
            }
            if (Intrinsics.LJFF(uniqueId, AwemeSaaSExtKt.getUniqueId(c0sz8LJJLIIIIJ.getAweme()))) {
                return iLJJLIIIJ2;
            }
            for (int count = getCount() - 1; -1 < count; count--) {
                Aweme item3 = getItem(count);
                if (item3 != null) {
                    uniqueId2 = AwemeSaaSExtKt.getUniqueId(item3);
                } else {
                    uniqueId2 = null;
                }
                if (Intrinsics.LJFF(uniqueId2, AwemeSaaSExtKt.getUniqueId(c0sz8LJJLIIIIJ.getAweme()))) {
                    return count;
                }
            }
        }
        return -2;
    }

    @Override // X.C0SR4
    public final int LJJLIIIJ(Aweme aweme) {
        return this.LLJL.au(aweme);
    }

    @Override // X.C0SR4
    @InterfaceC1294060jmO
    public final void LJJLIIIJLJLI(List<? extends Aweme> list) {
        LJJLJLI(list, false);
    }

    @Override // X.InterfaceC21605219gw
    public final void LJIIL(int i, int i2) {
        this.LLJL.fu(false);
        if (i != i2) {
            boolean z = C0SRA.LIZ;
            Exception excHu = this.LLJL.hu();
            if (C0SRA.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("expectedAdapterCount: ");
                sbLIZ.append(i);
                sbLIZ.append(", currentAdapterCount: ");
                sbLIZ.append(i2);
                C1AF0.LJFF(new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ), excHu), "ObservableArrayList");
            }
        }
    }

    @Override // X.C0SR4
    public final void LJJLJLI(List<? extends Aweme> list, boolean z) {
        List<Aweme> listLJJJLZIJ = LJJJLZIJ();
        if (z) {
            LJJL().LJFF();
            Iterator it2 = ((Collection) this.LLJJJ.getValue()).iterator();
            while (it2.hasNext()) {
                ((C0SR9) it2.next()).LJFF();
            }
        }
        LJJL().LIZJ(listLJJJLZIJ);
        Iterator it3 = ((Collection) this.LLJJJ.getValue()).iterator();
        while (it3.hasNext()) {
            ((C0SR9) it3.next()).LIZJ(listLJJJLZIJ);
        }
        notifyDataSetChanged();
    }

    @Override // X.C0SR4
    @InterfaceC1294060jmO
    public final void LJJLIIIJILLIZJL(int i, int i2, List list) {
        if (list != null && !list.isEmpty() && i >= 0 && i <= getCount()) {
            this.LLJL.gu(i, C13LP.LJJJJLI(list));
            notifyDataSetChanged();
        }
    }

    public C0SR5(Context context, LayoutInflater layoutInflater, C0HTT c0htt, Fragment fragment, C714460S0u c714460S0u, BaseFeedPageParams baseFeedPageParams, C0R9L c0r9l, final C0SR8 c0sr8) {
        super(context, layoutInflater, c0htt, fragment, c714460S0u, baseFeedPageParams, c0r9l);
        this.LLJL = c0sr8;
        this.LLJILJIL = new C0SR6(c0sr8) { // from class: X.0SR7
            public final C0SR8 LIZIZ;

            @Override // X.C0SR6
            public final void LIZ() {
                this.LIZIZ.clear();
            }

            @Override // X.C0SR6
            public final int LIZJ() {
                return this.LIZIZ.getSize();
            }

            @Override // X.C0SR6
            public final List<Aweme> LJ() {
                return this.LIZIZ.getList();
            }

            {
                this.LIZIZ = c0sr8;
            }

            @Override // X.C0SR6
            public final Aweme LIZIZ(int i) {
                try {
                    return this.LIZIZ.eu(i);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }

            @Override // X.C0SR6
            public final Aweme LIZLLL(int i) {
                try {
                    return this.LIZIZ.getItem(i);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }

            @Override // X.C0SR6
            public final void LJI(List<? extends Aweme> list) {
                if (list == null) {
                    return;
                }
                this.LIZIZ.setData(C13LP.LJJJJLI(list));
            }

            @Override // X.C0SR6
            public final void LJFF(int i, Aweme aweme) {
                try {
                    this.LIZIZ.bu(i, aweme);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }

            @Override // X.C0SR6
            public final void LJII(int i, Aweme aweme) {
                try {
                    this.LIZIZ.iu(i, aweme);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        };
        this.LLJLIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(398));
    }
}
