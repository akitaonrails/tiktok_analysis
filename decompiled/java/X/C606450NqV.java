package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NqV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C606450NqV implements InterfaceC606850Nr9 {
    public final DataLayerAbility LIZ;
    public final AtomicInteger LIZIZ = new AtomicInteger(0);

    @Override // X.InterfaceC606850Nr9
    public final void LIZLLL(int i, Aweme aweme, String str) {
    }

    @Override // X.InterfaceC606850Nr9
    public final void LJFF() {
    }

    @Override // X.InterfaceC606850Nr9
    public final void LJII(Map map) {
    }

    public C606450NqV(DataLayerAbility dataLayerAbility) {
        this.LIZ = dataLayerAbility;
    }

    @Override // X.InterfaceC606850Nr9
    public final void LIZ(List<? extends Aweme> list) {
        LJ("refresh", "feed_refresh");
    }

    @Override // X.InterfaceC606850Nr9
    public final void LJIIJ(List<? extends Aweme> list) {
        LJ("load_more", "feed_loadmore");
    }

    public final void LJ(final String str, final String str2) {
        final List<Aweme> items = this.LIZ.getItems();
        C2113808Pw.LIZ().submit(new Runnable() { // from class: X.00sq
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DuplicateObserver@e4b1.postCheckDuplicate$1");
                try {
                    try {
                        this.LL.LIZJ(str, str2, items);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DuplicateObserver@e4b1.postCheckDuplicate$1");
            }
        });
    }

    @Override // X.InterfaceC606850Nr9
    public final void LIZIZ(int i, String str, List list) {
        LJ("insert", str);
    }

    public final void LIZJ(String str, String str2, List list) {
        int i;
        int size = list.size();
        HashSet hashSet = new HashSet(size);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Aweme) it2.next()).getAid());
        }
        hashSet.addAll(arrayList);
        int size2 = size - hashSet.size();
        if (Intrinsics.LJFF(str, "refresh")) {
            i = size2;
        } else {
            i = size2 - this.LIZIZ.get();
        }
        if (i > 0) {
            C20684815ws.LJIJ("feed_data_change_error", C591500NHw.LIZ(new Pair("enter_from", "homepage_hot"), new Pair("rule", str), new Pair("diff_type", str2), new Pair("error_type", 2), new Pair("duplicate_count", Integer.valueOf(i))));
        }
        this.LIZIZ.set(size2);
    }

    @Override // X.InterfaceC606850Nr9
    public final void LJIIJJI(int i, int i2, String str, List list, List list2) {
        LJ("replace", str);
    }
}
