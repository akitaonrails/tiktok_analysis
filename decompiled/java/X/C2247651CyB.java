package X;

import java.util.LinkedList;

/* JADX INFO: renamed from: X.1CyB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247651CyB<T> {
    public final int LIZ;
    public final LinkedList<T> LIZIZ = new LinkedList<>();

    public final synchronized void LIZ() {
        if (!this.LIZIZ.isEmpty()) {
            this.LIZIZ.clear();
        }
    }

    public C2247651CyB(int i) {
        this.LIZ = i;
    }
}
