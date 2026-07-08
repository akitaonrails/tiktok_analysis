package X;

import com.bytedance.android.starship.engine.graph.config.GraphConfig;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0k7V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1307150k7V {
    public final String LIZ;
    public final GraphConfig LIZIZ;
    public final HashSet<InterfaceC1307210k7b> LIZJ = new HashSet<>();
    public final Long LIZLLL;
    public final Long LJ;
    public InterfaceC1307210k7b LJFF;
    public InterfaceC1307210k7b LJI;

    public C1307150k7V(String str, GraphConfig graphConfig) {
        Long lLJIILIIL;
        this.LIZ = str;
        this.LIZIZ = graphConfig;
        String str2 = graphConfig.config.startNode;
        if (str2 != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(str2);
        } else {
            lLJIILIIL = null;
        }
        this.LIZLLL = lLJIILIIL;
        String str3 = graphConfig.config.endNode;
        this.LJ = str3 != null ? C2095008Iq.LJIILIIL(str3) : null;
    }
}
