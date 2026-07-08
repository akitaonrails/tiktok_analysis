package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0V2F, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V2F {
    public static final List<C0V2I> LIZ = new ArrayList(2);

    public static synchronized void LIZ(long j, boolean z, boolean z2) {
        for (C0V2I c0v2i : (ArrayList) LIZ) {
            if (c0v2i != null) {
                c0v2i.LJIILIIL(j, z, z2);
            }
        }
    }
}
