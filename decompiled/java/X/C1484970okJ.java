package X;

import com.ss.android.ugc.effectmanager.effect.model.Asset;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0okJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1484970okJ {
    public final String LIZ;
    public final Pair<Asset, InterfaceC1419170n2B> LIZIZ;
    public final C1425280nC2 LIZJ;
    public final int LIZLLL;
    public final float LJ;
    public final C1484990okL LJFF;

    public final int hashCode() {
        return Objects.hash(this.LIZ, this.LIZJ, Integer.valueOf(this.LIZLLL));
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C1484970okJ.class, cls)) {
            return false;
        }
        C1484970okJ c1484970okJ = (C1484970okJ) obj;
        if (Intrinsics.LJFF(this.LIZ, c1484970okJ.LIZ) && Intrinsics.LJFF(this.LIZJ, c1484970okJ.LIZJ) && this.LIZLLL == c1484970okJ.LIZLLL) {
            return true;
        }
        return false;
    }

    public static C1484970okJ LIZ(C1484970okJ c1484970okJ, C1484990okL c1484990okL) {
        return new C1484970okJ(c1484970okJ.LIZ, c1484970okJ.LIZIZ, c1484970okJ.LIZJ, c1484970okJ.LIZLLL, c1484970okJ.LJ, c1484990okL);
    }

    public /* synthetic */ C1484970okJ(String str, Pair pair, C1425280nC2 c1425280nC2, int i, float f) {
        this(str, pair, c1425280nC2, i, f, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1484970okJ(String str, Pair<Asset, ? extends InterfaceC1419170n2B> pair, C1425280nC2 c1425280nC2, int i, float f, C1484990okL c1484990okL) {
        this.LIZ = str;
        this.LIZIZ = pair;
        this.LIZJ = c1425280nC2;
        this.LIZLLL = i;
        this.LJ = f;
        this.LJFF = c1484990okL;
    }
}
