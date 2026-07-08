package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.0u2n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688630u2n implements Sequence<C1688640u2o> {
    public final List<C1688640u2o> LIZ = new ArrayList();

    @Override // kotlin.sequences.Sequence
    public final Iterator<C1688640u2o> iterator() {
        return ((ArrayList) this.LIZ).iterator();
    }

    public final void LIZJ(final Object obj) {
        ((ArrayList) this.LIZ).add(new Object(obj) { // from class: X.0u2o
            public final Object LIZ;

            {
                this.LIZ = obj;
            }
        });
    }
}
