package X;

import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: X.19OG, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19OG {
    public HashSet<C19OG> LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public final C19OA LIZLLL;
    public final C19OV LJ;
    public C19OG LJFF;
    public int LJI;
    public int LJII = -1;
    public C21531519Of LJIIIIZZ;

    public final int LIZLLL() {
        if (this.LIZJ) {
            return this.LIZIZ;
        }
        return 0;
    }

    public final int LJ() {
        C19OG c19og;
        if (this.LIZLLL.mVisibility == 8) {
            return 0;
        }
        int i = this.LJII;
        return (i <= -1 || (c19og = this.LJFF) == null || c19og.LIZLLL.mVisibility != 8) ? this.LJI : i;
    }

    public final C19OG LJFF() {
        switch (C19OT.LIZ[this.LJ.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
                return null;
            case 2:
                return this.LIZLLL.mRight;
            case 3:
                return this.LIZLLL.mLeft;
            case 4:
                return this.LIZLLL.mBottom;
            case 5:
                return this.LIZLLL.mTop;
            default:
                throw new AssertionError(this.LJ.name());
        }
    }

    public final boolean LJI() {
        HashSet<C19OG> hashSet = this.LIZ;
        if (hashSet == null) {
            return false;
        }
        Iterator<C19OG> it2 = hashSet.iterator();
        while (it2.hasNext()) {
            if (it2.next().LJFF().LJII()) {
                return true;
            }
        }
        return false;
    }

    public final boolean LJII() {
        return this.LJFF != null;
    }

    public final void LJIIIZ() {
        HashSet<C19OG> hashSet;
        C19OG c19og = this.LJFF;
        if (c19og != null && (hashSet = c19og.LIZ) != null) {
            hashSet.remove(this);
            if (this.LJFF.LIZ.size() == 0) {
                this.LJFF.LIZ = null;
            }
        }
        this.LIZ = null;
        this.LJFF = null;
        this.LJI = 0;
        this.LJII = -1;
        this.LIZJ = false;
        this.LIZIZ = 0;
    }

    public final void LJIIJ() {
        C21531519Of c21531519Of = this.LJIIIIZZ;
        if (c21531519Of == null) {
            this.LJIIIIZZ = new C21531519Of(EnumC21531919Oj.UNRESTRICTED);
        } else {
            c21531519Of.LIZJ();
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZLLL.mDebugName);
        sbLIZ.append(":");
        sbLIZ.append(this.LJ.toString());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LJIIIIZZ(C19OG c19og) {
        boolean z;
        boolean z2;
        if (c19og == null) {
            return false;
        }
        C19OV c19ov = c19og.LJ;
        C19OV c19ov2 = this.LJ;
        if (c19ov == c19ov2) {
            if (c19ov2 == C19OV.BASELINE && (!c19og.LIZLLL.hasBaseline || !this.LIZLLL.hasBaseline)) {
                return false;
            }
            return true;
        }
        switch (C19OT.LIZ[c19ov2.ordinal()]) {
            case 1:
                if (c19ov == C19OV.BASELINE || c19ov == C19OV.CENTER_X || c19ov == C19OV.CENTER_Y) {
                    return false;
                }
                return true;
            case 2:
            case 3:
                if (c19ov != C19OV.LEFT && c19ov != C19OV.RIGHT) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (c19og.LIZLLL instanceof C19OI) {
                    if (!z2 && c19ov != C19OV.CENTER_X) {
                        return false;
                    }
                    return true;
                }
                return z2;
            case 4:
            case 5:
                if (c19ov != C19OV.TOP && c19ov != C19OV.BOTTOM) {
                    z = false;
                } else {
                    z = true;
                }
                if (c19og.LIZLLL instanceof C19OI) {
                    if (!z && c19ov != C19OV.CENTER_Y) {
                        return false;
                    }
                    return true;
                }
                return z;
            case 6:
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
                return false;
            default:
                throw new AssertionError(this.LJ.name());
        }
    }

    public final void LJIIJJI(int i) {
        this.LIZIZ = i;
        this.LIZJ = true;
    }

    public C19OG(C19OA c19oa, C19OV c19ov) {
        this.LIZLLL = c19oa;
        this.LJ = c19ov;
    }

    public final void LIZ(C19OG c19og, int i) {
        LIZIZ(c19og, i, -1, false);
    }

    public final void LIZJ(int i, C19OK c19ok, ArrayList arrayList) {
        HashSet<C19OG> hashSet = this.LIZ;
        if (hashSet != null) {
            Iterator<C19OG> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                C19ON.LIZ(it2.next().LIZLLL, i, arrayList, c19ok);
            }
        }
    }

    public final boolean LIZIZ(C19OG c19og, int i, int i2, boolean z) {
        if (c19og == null) {
            LJIIIZ();
            return true;
        }
        if (!z && !LJIIIIZZ(c19og)) {
            return false;
        }
        this.LJFF = c19og;
        if (c19og.LIZ == null) {
            c19og.LIZ = new HashSet<>();
        }
        HashSet<C19OG> hashSet = this.LJFF.LIZ;
        if (hashSet != null) {
            hashSet.add(this);
        }
        if (i > 0) {
            this.LJI = i;
        } else {
            this.LJI = 0;
        }
        this.LJII = i2;
        return true;
    }
}
