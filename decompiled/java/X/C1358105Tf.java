package X;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05Tf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1358105Tf {
    public static final void LIZ(Collection collection, Function2 function2) {
        if (collection.size() <= 1) {
            return;
        }
        Object objLJJJJZ = C13LP.LJJJJZ(collection);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (Object obj : collection) {
            if (!z) {
                z = true;
            } else {
                arrayList.add(function2.invoke(objLJJJJZ, obj));
                objLJJJJZ = obj;
            }
        }
    }
}
