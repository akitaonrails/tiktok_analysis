package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.12aN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19780912aN {
    public C19795812cm LIZ;
    public C19795812cm LIZIZ;
    public final List<C19795812cm> LIZJ;

    public final /* synthetic */ Object clone() {
        C19780912aN c19780912aN = new C19780912aN((C19795812cm) this.LIZ.clone());
        for (C19795812cm c19795812cm : (ArrayList) this.LIZJ) {
            ((ArrayList) c19780912aN.LIZJ).add(c19795812cm.clone());
        }
        return c19780912aN;
    }

    public C19780912aN() {
        this.LIZ = new C19795812cm(0L, "", null);
        this.LIZIZ = new C19795812cm(0L, "", null);
        this.LIZJ = new ArrayList();
    }

    public C19780912aN(C19795812cm c19795812cm) {
        this.LIZ = c19795812cm;
        this.LIZIZ = (C19795812cm) c19795812cm.clone();
        this.LIZJ = new ArrayList();
    }
}
