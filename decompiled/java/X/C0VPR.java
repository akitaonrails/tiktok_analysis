package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0VPR, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VPR {
    public static final /* synthetic */ int LJFF = 0;
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;
    public final boolean LJ;

    public C0VPR() {
        this(null, 0, 0, 0L, 2047);
    }

    public C0VPR(String str, int i, int i2, long j, int i3) {
        str = (i3 & 1) != 0 ? CardStruct.IStatusCode.DEFAULT : str;
        i = (i3 & 4) != 0 ? 2 : i;
        i2 = (i3 & 16) != 0 ? 2 : i2;
        j = (i3 & 64) != 0 ? 0L : j;
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = j;
        this.LJ = false;
    }
}
