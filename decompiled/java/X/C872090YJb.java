package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YJb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C872090YJb {
    public final String LIZ;
    public final long LIZIZ;
    public final Set<Long> LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C872090YJb)) {
            return false;
        }
        C872090YJb c872090YJb = (C872090YJb) obj;
        return Intrinsics.LJFF(this.LIZ, c872090YJb.LIZ) && this.LIZIZ == c872090YJb.LIZIZ && Intrinsics.LJFF(this.LIZJ, c872090YJb.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c872090YJb.LIZLLL);
    }

    public /* synthetic */ C872090YJb(String str, long j, Set set) {
        this(str, j, set, null);
    }

    public static C872090YJb LIZ(C872090YJb c872090YJb, Set set, int i) {
        String str;
        long j;
        Set set2 = set;
        String str2 = null;
        if ((i & 1) != 0) {
            str = c872090YJb.LIZ;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            j = c872090YJb.LIZIZ;
        } else {
            j = 0;
        }
        if ((i & 4) != 0) {
            set2 = c872090YJb.LIZJ;
        }
        if ((i & 8) != 0) {
            str2 = c872090YJb.LIZLLL;
        }
        return new C872090YJb(str, j, set2, str2);
    }

    public C872090YJb(String str, long j, Set<Long> set, String str2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = set;
        this.LIZLLL = str2;
    }
}
