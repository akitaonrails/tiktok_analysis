package X;

import java.io.File;
import java.util.Set;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13VD, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13VD implements C13VG {
    public final Set<String> LIZ;
    public final Set<String> LIZIZ;
    public long LIZJ;

    @Override // X.C13VG
    public final void LIZ(File file, boolean z) {
        if (file.isFile()) {
            int i = 0;
            for (Object obj : this.LIZ) {
                if (i >= 0) {
                    if (!u.LJJIIJZLJL(file.getPath(), (String) obj, false)) {
                        i++;
                    } else {
                        return;
                    }
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            int i2 = 0;
            for (Object obj2 : this.LIZIZ) {
                if (i2 >= 0) {
                    if (!a0.LJJIIZI(file.getPath(), (String) obj2, false)) {
                        i2++;
                    } else {
                        return;
                    }
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            this.LIZJ += file.length();
        }
    }

    public C13VD(Set set, Set set2, int i) {
        set = (i & 1) != 0 ? C08CX.INSTANCE : set;
        set2 = (i & 2) != 0 ? C08CX.INSTANCE : set2;
        this.LIZ = set;
        this.LIZIZ = set2;
    }
}
