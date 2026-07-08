package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0C7X, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C7X {
    public int LIZ;
    public List<String> LIZIZ;

    public C0C7X() {
        this(0);
    }

    public /* synthetic */ C0C7X(int i) {
        ArrayList arrayList = new ArrayList(256);
        int i2 = 0;
        do {
            arrayList.add("");
            i2++;
        } while (i2 < 256);
        this(256, arrayList);
    }

    public C0C7X(int i, List<String> list) {
        this.LIZ = i;
        this.LIZIZ = list;
    }
}
