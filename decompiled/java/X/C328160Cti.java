package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C328160Cti {
    public static final C328160Cti LIZ = new C328160Cti();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicReference<String> LIZJ = new AtomicReference<>(null);
    public static final C054G LIZLLL = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));

    public static boolean LIZIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        AtomicReference<String> atomicReference = LIZJ;
        if (!Intrinsics.LJFF(atomicReference.get(), curUserId)) {
            LIZIZ.set(false);
            atomicReference.set(curUserId);
        }
        return LIZIZ.compareAndSet(false, true);
    }

    public static void LIZ(List list) {
        int i = C328170Ctj.LIZ.preloadStoryCount;
        if (i > 0 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(Math.min(i, list.size()));
            HashSet hashSet = new HashSet(Math.min(list.size(), i * 2));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String aid = ((Aweme) it2.next()).getAid();
                if (aid != null && aid.length() != 0 && hashSet.add(aid)) {
                    arrayList.add(aid);
                    if (arrayList.size() >= i) {
                        break;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                C23250099c.LIZLLL(LIZLLL, null, null, new C328180Ctk(arrayList, null), 3);
            }
        }
    }
}
