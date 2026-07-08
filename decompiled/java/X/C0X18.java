package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0X18, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X18 {
    public boolean LIZ;
    public String LIZIZ;
    public final Set<String> LIZJ;
    public final Set<String> LIZLLL;
    public Set<String> LJ;
    public final Set<String> LJFF;
    public Set<String> LJI;

    public C0X18(boolean z, String str, int i) {
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        LinkedHashSet linkedHashSet3;
        LinkedHashSet linkedHashSet4;
        str = (i & 8) != 0 ? null : str;
        if ((i & 16) != 0) {
            linkedHashSet = new LinkedHashSet();
        } else {
            linkedHashSet = null;
        }
        if ((i & 32) != 0) {
            linkedHashSet2 = new LinkedHashSet();
        } else {
            linkedHashSet2 = null;
        }
        if ((i & 64) != 0) {
            linkedHashSet3 = new LinkedHashSet();
        } else {
            linkedHashSet3 = null;
        }
        if ((i & 128) != 0) {
            linkedHashSet4 = new LinkedHashSet();
        } else {
            linkedHashSet4 = null;
        }
        LinkedHashSet linkedHashSet5 = (i & 256) != 0 ? new LinkedHashSet() : null;
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = linkedHashSet;
        this.LIZLLL = linkedHashSet2;
        this.LJ = linkedHashSet3;
        this.LJFF = linkedHashSet4;
        this.LJI = linkedHashSet5;
    }
}
