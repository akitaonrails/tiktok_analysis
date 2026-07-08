package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.1D3C, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public abstract class C1D3C {
    public final ConcurrentHashMap<String, C1D3D> LIZ = new ConcurrentHashMap<>();

    public final void LIZ(C2252061DCq c2252061DCq) {
        C1D3D c1d3d = this.LIZ.get(c2252061DCq.LIZ);
        if (c1d3d != null) {
            c1d3d.LIZIZ();
            if (c1d3d.LIZ()) {
                this.LIZ.remove(c2252061DCq.LIZ);
            }
        }
    }
}
