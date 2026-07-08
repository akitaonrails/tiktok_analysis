package X;

import com.ss.android.ugc.aweme.ecommerce.mall.bean.DynamicBarStyleConfig;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.DynamicColorConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1D2e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2249341D2e {
    public static final /* synthetic */ int LIZ = 0;

    public static DynamicColorConfig LIZIZ(List list, boolean z) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            return null;
        }
        if (z) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    String str = ((DynamicColorConfig) next).activeType;
                    if (str == null) {
                        str = "always";
                    }
                    if (Intrinsics.LJFF(str, "sticky")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            DynamicColorConfig dynamicColorConfig = (DynamicColorConfig) next;
            if (dynamicColorConfig == null) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    String str2 = ((DynamicColorConfig) next2).activeType;
                    if (str2 == null) {
                        str2 = "always";
                    }
                    if (Intrinsics.LJFF(str2, "always")) {
                        obj = next2;
                        break;
                    }
                }
                return (DynamicColorConfig) obj;
            }
            return dynamicColorConfig;
        }
        Iterator it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Object next3 = it4.next();
            String str3 = ((DynamicColorConfig) next3).activeType;
            if (str3 == null) {
                str3 = "always";
            }
            if (Intrinsics.LJFF(str3, "always")) {
                obj = next3;
                break;
            }
        }
        return (DynamicColorConfig) obj;
    }

    public static DynamicBarStyleConfig LIZ(String str, boolean z, List list) {
        Object next;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.LJFF(((DynamicBarStyleConfig) obj).target, str)) {
                arrayList.add(obj);
            }
        }
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        if (z) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    String str2 = ((DynamicBarStyleConfig) next).activeType;
                    if (str2 == null) {
                        str2 = "always";
                    }
                    if (Intrinsics.LJFF(str2, "sticky")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            DynamicBarStyleConfig dynamicBarStyleConfig = (DynamicBarStyleConfig) next;
            if (dynamicBarStyleConfig == null) {
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    String str3 = ((DynamicBarStyleConfig) next2).activeType;
                    if (str3 == null) {
                        str3 = "always";
                    }
                    if (Intrinsics.LJFF(str3, "always")) {
                        obj2 = next2;
                        break;
                    }
                }
                return (DynamicBarStyleConfig) obj2;
            }
            return dynamicBarStyleConfig;
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Object next3 = it4.next();
            String str4 = ((DynamicBarStyleConfig) next3).activeType;
            if (str4 == null) {
                str4 = "always";
            }
            if (Intrinsics.LJFF(str4, "always")) {
                obj2 = next3;
                break;
            }
        }
        return (DynamicBarStyleConfig) obj2;
    }
}
