package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.SearchTabInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CCb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C309710CCb {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(List list) {
        ArrayList arrayList;
        if (C284360BCo.LIZ()) {
            synchronized (list) {
                try {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((SearchTabInfo) it2.next()).tabName);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList.add(((SearchTabInfo) it3.next()).tabName);
            }
        }
        return arrayList;
    }

    public static int LIZIZ(String str, List list) {
        int i = -1;
        int i2 = 0;
        if (C284360BCo.LIZ()) {
            synchronized (list) {
                try {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (!Intrinsics.LJFF(((SearchTabInfo) it2.next()).tabName, str)) {
                            i2++;
                        } else {
                            i = i2;
                            break;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return i;
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            if (Intrinsics.LJFF(((SearchTabInfo) it3.next()).tabName, str)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static void LIZJ(List list, List list2) {
        if (C284360BCo.LIZ()) {
            synchronized (list) {
                try {
                    list.clear();
                    list.addAll(list2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        list.clear();
        list.addAll(list2);
    }
}
