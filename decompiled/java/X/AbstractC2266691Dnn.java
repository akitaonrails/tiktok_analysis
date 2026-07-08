package X;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.1Dnn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2266691Dnn {
    public static final Set<AbstractC2266691Dnn> LIZJ = new HashSet();
    public final String LIZ;
    public final String LIZIZ;

    public abstract boolean LIZ();

    public AbstractC2266691Dnn(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        ((HashSet) LIZJ).add(this);
    }
}
