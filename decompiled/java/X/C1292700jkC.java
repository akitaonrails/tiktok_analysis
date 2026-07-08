package X;

import android.graphics.Path;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jkC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292700jkC {
    public final List<AbstractC1293310jlB<C1293350jlF, Path>> LIZ;
    public final List<AbstractC1293310jlB<Integer, Integer>> LIZIZ;
    public final List<C1292710jkD> LIZJ;

    public C1292700jkC(List<C1292710jkD> list) {
        this.LIZJ = list;
        this.LIZ = new ArrayList(list.size());
        this.LIZIZ = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.LIZ.add(((C1292710jkD) ListProtector.get(list, i)).LIZIZ.LIZ());
            this.LIZIZ.add(((C1292710jkD) ListProtector.get(list, i)).LIZJ.LIZ());
        }
    }
}
