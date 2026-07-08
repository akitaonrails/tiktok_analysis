package bc;

import X.AbstractC1320320kSk;
import X.C1320390kSr;
import X.C1322110kVd;
import X.C1331100kk8;
import X.C2188811AlT;
import X.InterfaceC1320380kSq;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes21.dex */
public final class a {
    public Drawable LIZ;
    public Drawable LIZIZ;
    public AbstractC1320320kSk LIZJ;
    public AbstractC1320320kSk LIZLLL;
    public float LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;

    public a() {
        C1320390kSr c1320390kSr = InterfaceC1320380kSq.LJFF;
        this.LIZJ = c1320390kSr;
        this.LIZLLL = c1320390kSr;
        this.LJI = true;
        this.LJII = true;
        this.LJIIIIZZ = true;
        this.LJIIIZ = true;
    }

    public static C1331100kk8 LIZ(C1322110kVd c1322110kVd) {
        C1331100kk8 c1331100kk8 = c1322110kVd.getHierarchy().LIZJ;
        if (c1331100kk8 == null) {
            C1331100kk8 c1331100kk82 = new C1331100kk8();
            c1322110kVd.getHierarchy().LJJIII(c1331100kk82);
            return c1331100kk82;
        }
        return c1331100kk8;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static AbstractC1320320kSk LIZIZ(String str) {
        switch (str.hashCode()) {
            case -1928367066:
                if (str.equals("fitBottomStart")) {
                    return InterfaceC1320380kSq.LJIIIIZZ;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    return InterfaceC1320380kSq.LJ;
                }
                break;
            case -1274298614:
                if (str.equals("fitEnd")) {
                    return InterfaceC1320380kSq.LIZLLL;
                }
                break;
            case -522179887:
                if (str.equals("fitStart")) {
                    return InterfaceC1320380kSq.LIZIZ;
                }
                break;
            case -340708175:
                if (str.equals("centerInside")) {
                    return InterfaceC1320380kSq.LJFF;
                }
                break;
            case 97441490:
                if (str.equals("fitXY")) {
                    return InterfaceC1320380kSq.LIZ;
                }
                break;
            case 520762310:
                if (str.equals("fitCenter")) {
                    return InterfaceC1320380kSq.LIZJ;
                }
                break;
            case 1161480325:
                if (str.equals("centerCrop")) {
                    return InterfaceC1320380kSq.LJI;
                }
                break;
            case 1628133256:
                if (str.equals("focusCrop")) {
                    return InterfaceC1320380kSq.LJII;
                }
                break;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fresco unsupported scale attr ");
        sbLIZ.append(str);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZJ(C1322110kVd c1322110kVd) {
        float f;
        float f2;
        float f3;
        Drawable drawable = this.LIZ;
        if (drawable != null) {
            c1322110kVd.getHierarchy().LJJIFFI(drawable, this.LIZJ);
        }
        if (this.LIZIZ != null) {
            c1322110kVd.getHierarchy().LJIJJLI(this.LIZIZ, this.LIZLLL);
        }
        if (this.LJFF) {
            float f4 = 0.0f;
            if (this.LJI) {
                f = this.LJ;
            } else {
                f = 0.0f;
            }
            if (this.LJII) {
                f2 = this.LJ;
            } else {
                f2 = 0.0f;
            }
            if (this.LJIIIIZZ) {
                f3 = this.LJ;
            } else {
                f3 = 0.0f;
            }
            if (this.LJIIIZ) {
                f4 = this.LJ;
            }
            LIZ(c1322110kVd).LJI(f, f2, f4, f3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r3.equals("roundBottomStart") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        r4.LJFF = true;
        r4.LJIIIIZZ = java.lang.Boolean.parseBoolean(r6.LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r3.equals("roundBottomRight") != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
    
        if (r3.equals("roundTopStart") != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d2, code lost:
    
        if (r3.equals("roundTopRight") != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012e, code lost:
    
        if (r3.equals("roundTopLeft") != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0130, code lost:
    
        r4.LJFF = true;
        r4.LJI = java.lang.Boolean.parseBoolean(r6.LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016a, code lost:
    
        if (r3.equals("roundBottomEnd") != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016c, code lost:
    
        r4.LJFF = true;
        r4.LJIIIZ = java.lang.Boolean.parseBoolean(r6.LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0176, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r3.equals("roundBottomLeft") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018c, code lost:
    
        if (r3.equals("roundTopEnd") != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x018e, code lost:
    
        r4.LJFF = true;
        r4.LJII = java.lang.Boolean.parseBoolean(r6.LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0198, code lost:
    
        return;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String r5, dc.a r6, X.C1322110kVd r7) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bc.a.LIZLLL(java.lang.String, dc.a, X.0kVd):void");
    }
}
