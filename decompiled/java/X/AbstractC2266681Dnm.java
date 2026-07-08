package X;

import java.util.HashSet;
import java.util.Set;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: renamed from: X.1Dnm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2266681Dnm implements InterfaceC2266791Dnx {
    public static final Set<AbstractC2266681Dnm> LIZJ = new HashSet();
    public final String LIZ;
    public final String LIZIZ;

    public abstract boolean LIZIZ();

    public boolean LIZJ() {
        return BoundaryInterfaceReflectionUtil.containsFeature(C085I.LIZ, this.LIZIZ);
    }

    @Override // X.InterfaceC2266791Dnx
    public final boolean isSupported() {
        return LIZIZ() || LIZJ();
    }

    @Override // X.InterfaceC2266791Dnx
    public final String LIZ() {
        return this.LIZ;
    }

    public AbstractC2266681Dnm(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        ((HashSet) LIZJ).add(this);
    }
}
