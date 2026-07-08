package X;

/* JADX INFO: renamed from: X.0U7G, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U7G {
    public final String LIZ;

    public C0U7G(String str) {
        this.LIZ = str;
    }

    public final void LIZ(C0U74 c0u74) {
        boolean z;
        C770170UJb.LIZJ("Sticker");
        C770170UJb.LIZLLL = "";
        for (T t : c0u74.LIZIZ) {
            C0U7C.LIZ(t, this.LIZ);
            if (!C766720U5u.LJIILLIIL(t) && !C0U7C.LJIILIIL(t)) {
                z = false;
            } else {
                z = true;
            }
            t.LJJLIL(z);
        }
    }
}
