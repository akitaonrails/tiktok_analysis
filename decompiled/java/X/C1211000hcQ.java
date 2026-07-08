package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0hcQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1211000hcQ {
    public static boolean LIZ(Aweme aweme) {
        Object next;
        boolean z;
        boolean z2;
        CopyOnWriteArrayList<C1210990hcP> copyOnWriteArrayList = FeedPipViewModel.LLJJJIL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C1210990hcP c1210990hcP : copyOnWriteArrayList) {
            EnumC1216720hle enumC1216720hle = c1210990hcP.LIZIZ;
            Object arrayList = linkedHashMap.get(enumC1216720hle);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(enumC1216720hle, arrayList);
            }
            ((List) arrayList).add(c1210990hcP);
        }
        List list = (List) linkedHashMap.get(EnumC1216720hle.ALLOW);
        Object next2 = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Boolean.valueOf(((C1210990hcP) it2.next()).LIZJ.invoke(aweme).booleanValue()));
            }
            Iterator it3 = arrayList2.iterator();
            if (!it3.hasNext()) {
                next = null;
            } else {
                next = it3.next();
                while (it3.hasNext()) {
                    boolean zBooleanValue = ((Boolean) it3.next()).booleanValue();
                    if (!((Boolean) next).booleanValue() && !zBooleanValue) {
                        z = false;
                    } else {
                        z = true;
                    }
                    next = Boolean.valueOf(z);
                }
            }
            Boolean bool = (Boolean) next;
            if (bool != null && bool.booleanValue()) {
                List list2 = (List) linkedHashMap.get(EnumC1216720hle.BLOCK);
                if (list2 != null) {
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(Boolean.valueOf(((C1210990hcP) it4.next()).LIZJ.invoke(aweme).booleanValue()));
                    }
                    Iterator it5 = arrayList3.iterator();
                    if (it5.hasNext()) {
                        next2 = it5.next();
                        while (it5.hasNext()) {
                            boolean zBooleanValue2 = ((Boolean) it5.next()).booleanValue();
                            if (!((Boolean) next2).booleanValue() && !zBooleanValue2) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            next2 = Boolean.valueOf(z2);
                        }
                    }
                    Boolean bool2 = (Boolean) next2;
                    if (bool2 != null && bool2.booleanValue()) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LIZIZ(C1210990hcP c1210990hcP) {
        try {
            CopyOnWriteArrayList<C1210990hcP> copyOnWriteArrayList = FeedPipViewModel.LLJJJIL;
            String str = c1210990hcP.LIZ;
            CopyOnWriteArrayList<C1210990hcP> copyOnWriteArrayList2 = FeedPipViewModel.LLJJJIL;
            C19719612Di.LJJIIJ(copyOnWriteArrayList2, new C1210980hcO(str), true);
            C189200o6.m2constructorimpl(Boolean.valueOf(copyOnWriteArrayList2.add(c1210990hcP)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
