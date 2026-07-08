package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.18wK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21445818wK extends ArrayList<C211400rg> {
    public final int maxSize;

    public static C21445818wK noTracking() {
        return new C21445818wK(0, 0);
    }

    public static C21445818wK tracking(int i) {
        return new C21445818wK(16, i);
    }

    public C21445818wK(int i, int i2) {
        super(i);
        this.maxSize = i2;
    }
}
