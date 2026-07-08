package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.08Cq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2079408Cq extends C2073908An {
    public static volatile boolean LIZIZ;

    static {
        new ArrayList();
    }

    public static void LIZ() {
        if (LIZIZ) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("c++_shared");
        arrayList.add("bytemonitor");
        arrayList.add("worker");
        arrayList.add("bytebench");
        if (C2073808Am.LIZ(arrayList)) {
            LIZIZ = true;
        } else {
            LIZIZ = false;
        }
    }
}
