package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nmC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1447700nmC {
    public final PublishModel LIZ;
    public Aweme LIZJ;
    public final boolean LIZLLL;
    public final String LIZIZ = "";
    public C1434650nR9 LJ = null;
    public String LJFF = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1447700nmC)) {
            return false;
        }
        C1447700nmC c1447700nmC = (C1447700nmC) obj;
        return Intrinsics.LJFF(this.LIZ, c1447700nmC.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1447700nmC.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1447700nmC.LIZJ) && this.LIZLLL == c1447700nmC.LIZLLL && Intrinsics.LJFF(this.LJ, c1447700nmC.LJ) && Intrinsics.LJFF(this.LJFF, c1447700nmC.LJFF);
    }

    public C1447700nmC(PublishModel publishModel, Aweme aweme, boolean z) {
        this.LIZ = publishModel;
        this.LIZJ = aweme;
        this.LIZLLL = z;
    }
}
