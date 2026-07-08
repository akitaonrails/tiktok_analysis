package X;

import com.bytedance.android.bcm.impl.model.BcmUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18AL, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18AL {
    public static final HashSet<String> LIZ = new HashSet<>();
    public static final HashSet<String> LIZIZ = new HashSet<>();
    public static boolean LIZJ;

    public static void LIZ(HashMap map, HashSet hashSet) {
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Iterator it2 = ((ArrayList) ((C18AM) entry.getValue()).LIZ).iterator();
            while (true) {
                if (it2.hasNext()) {
                    BcmUnit bcmUnit = (BcmUnit) it2.next();
                    if (Intrinsics.LJFF(bcmUnit.bizType, "ecom_entrance") && Intrinsics.LJFF(bcmUnit.bcmFieldName, "bst_group_type")) {
                        hashSet.add(key);
                        break;
                    }
                }
            }
        }
    }
}
