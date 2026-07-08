package X;

import android.graphics.Path;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jnE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294580jnE {
    public final List<C1294570jnD> LIZ = new ArrayList();

    public final void LIZ(Path path) {
        int size = ((ArrayList) this.LIZ).size();
        while (true) {
            size--;
            if (size >= 0) {
                C1294570jnD c1294570jnD = (C1294570jnD) ListProtector.get(this.LIZ, size);
                if (c1294570jnD != null && !c1294570jnD.LIZ) {
                    C1294350jmr.LIZ(path, c1294570jnD.LIZLLL.LJIIJJI() / 100.0f, c1294570jnD.LJ.LJIIJJI() / 100.0f, c1294570jnD.LJFF.LJIIJJI() / 360.0f);
                }
            } else {
                return;
            }
        }
    }
}
