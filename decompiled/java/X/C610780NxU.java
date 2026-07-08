package X;

import com.ss.android.ugc.aweme.dc.core.SnapshotEntry;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NxU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C610780NxU {
    public final String LIZ;
    public final List<SnapshotEntry> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C610780NxU)) {
            return false;
        }
        C610780NxU c610780NxU = (C610780NxU) obj;
        return Intrinsics.LJFF(this.LIZ, c610780NxU.LIZ) && Intrinsics.LJFF(this.LIZIZ, c610780NxU.LIZIZ);
    }

    public C610780NxU(String str, List<SnapshotEntry> list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }
}
