package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0PCD, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PCD implements Serializable {
    public static final int $stable = 0;
    public final boolean hasBottomDivider;
    public final boolean hasTopDivider;
    public final int titleContentRes;
    public final int titleIconRes;

    public C0PCD(int i, int i2, boolean z, boolean z2) {
        this.titleIconRes = i;
        this.titleContentRes = i2;
        this.hasTopDivider = z;
        this.hasBottomDivider = z2;
    }
}
