package X;

import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0P4B, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P4B extends AbstractC1552040qUU {
    public final int $t;

    public static final void LJ$0(C0P4B c0p4b, UpdatePackage updatePackage, Throwable th) {
    }

    public static final void LJFF$0(C0P4B c0p4b, UpdatePackage updatePackage) {
    }

    public static final void LJIIIIZZ$0(C0P4B c0p4b, Map map, Map map2) {
    }

    public static final void LJIIIIZZ$1(C0P4B c0p4b, Map map, Map map2) {
    }

    public static final void LJIIJJI$0(C0P4B c0p4b, UpdatePackage updatePackage, Throwable th) {
    }

    public static final void LJIIZILJ$0(C0P4B c0p4b, UpdatePackage updatePackage, EnumC0335009t enumC0335009t) {
    }

    public static final void LJIJJLI$0(C0P4B c0p4b, UpdatePackage updatePackage) {
    }

    public static final void LJIL$0(C0P4B c0p4b, long j, UpdatePackage updatePackage) {
    }

    @Override // X.AbstractC1552040qUU
    public final void LJ(UpdatePackage updatePackage, Throwable th) {
        if (this.$t != 0) {
            super.LJ(updatePackage, th);
        } else {
            LJ$0(this, updatePackage, th);
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJFF(UpdatePackage updatePackage) {
        if (this.$t != 0) {
            super.LJFF(updatePackage);
        } else {
            LJFF$0(this, updatePackage);
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJII(Throwable th, Map map) {
        switch (this.$t) {
            case 0:
                LJII$0(this, th, map);
                break;
            case 1:
                LJII$1(this, th, map);
                break;
            default:
                super.LJII(th, map);
                break;
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIIIIZZ(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
        switch (this.$t) {
            case 0:
                LJIIIIZZ$0(this, map, map2);
                break;
            case 1:
                LJIIIIZZ$1(this, map, map2);
                break;
            default:
                super.LJIIIIZZ(map, map2);
                break;
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIIJJI(UpdatePackage updatePackage, Throwable th) {
        if (this.$t != 0) {
            super.LJIIJJI(updatePackage, th);
        } else {
            LJIIJJI$0(this, updatePackage, th);
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIIZILJ(UpdatePackage updatePackage, EnumC0335009t enumC0335009t) {
        if (this.$t != 0) {
            super.LJIIZILJ(updatePackage, enumC0335009t);
        } else {
            LJIIZILJ$0(this, updatePackage, enumC0335009t);
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIJJLI(UpdatePackage updatePackage) {
        if (this.$t != 0) {
            super.LJIJJLI(updatePackage);
        } else {
            LJIJJLI$0(this, updatePackage);
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIL(long j, UpdatePackage updatePackage) {
        switch (this.$t) {
            case 0:
                LJIL$0(this, j, updatePackage);
                break;
            case 1:
                LJIL$1(this, j, updatePackage);
                break;
            default:
                super.LJIL(j, updatePackage);
                break;
        }
    }

    public C0P4B(int i) {
        this.$t = i;
    }

    public static final void LJII$0(C0P4B c0p4b, Throwable th, Map map) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Gecko check failed");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LJII$1(C0P4B c0p4b, Throwable th, Map map) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Gecko check failed");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LJIL$1(C0P4B c0p4b, long j, UpdatePackage updatePackage) {
        C0O50.LIZ.getClass();
        C0O50.LIZ();
    }
}
