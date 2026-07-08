package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.136Q, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C136Q extends C136P {
    public C136Q LIZJ() {
        this.LIZLLL = "https://www.googleapis.com/";
        return this;
    }

    public C136Q LIZLLL() {
        this.LJ = C136O.LIZ("youtube/v3/");
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.136R] */
    public C136Q(C1498060p5Q c1498060p5Q, C2193901Atg c2193901Atg, C2193811AtX c2193811AtX) {
        final C136S c136s = new C136S(c2193901Atg);
        c136s.LIZIZ = Collections.emptySet();
        super(c1498060p5Q, new InterfaceC199535135h(c136s) { // from class: X.136R
            public final Set<String> LIZ;

            {
                this.LIZ = new HashSet(c136s.LIZIZ);
            }
        }, c2193811AtX);
    }
}
