package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0gZz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1171050gZz {
    public final Aweme LIZ;
    public final int LIZIZ;

    public C1171050gZz() {
        this(0, 7, null);
    }

    public C1171050gZz(int i, int i2, Aweme aweme) {
        aweme = (i2 & 1) != 0 ? new Aweme() : aweme;
        i = (i2 & 2) != 0 ? 0 : i;
        this.LIZ = aweme;
        this.LIZIZ = i;
    }
}
