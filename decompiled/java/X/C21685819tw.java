package X;

import android.view.View;

/* JADX INFO: renamed from: X.19tw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21685819tw extends AbstractC21685919tx {
    public static final int LJIJJLI = View.MeasureSpec.makeMeasureSpec(0, 0);
    public int LJIIJJI;
    public int LJIILIIL;
    public int LJIILJJIL;
    public final C21687719uF LJIILLIIL;
    public View[] LJIIZILJ;
    public int[] LJIJ;
    public int[] LJIJI;
    public boolean LJIJJ;
    public boolean LJIIL = true;
    public final float[] LJIILL = new float[0];

    public final void LJJ() {
        View[] viewArr = this.LJIIZILJ;
        if (viewArr == null || viewArr.length != this.LJIIJJI) {
            this.LJIIZILJ = new View[this.LJIIJJI];
        }
        int[] iArr = this.LJIJ;
        if (iArr == null || iArr.length != this.LJIIJJI) {
            this.LJIJ = new int[this.LJIIJJI];
        }
        int[] iArr2 = this.LJIJI;
        if (iArr2 == null || iArr2.length != this.LJIIJJI) {
            this.LJIJI = new int[this.LJIIJJI];
        }
    }

    @Override // X.AbstractC21686119tz
    public final void LJII() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleItemsUpdate. range=");
        sbLIZ.append(this.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LJIILLIIL.LIZ.clear();
    }

    @Override // X.AbstractC21685919tx
    public final void LJIL(InterfaceC21686919u7 interfaceC21686919u7) {
        this.LJIILLIIL.LIZ.clear();
    }

    @Override // X.AbstractC21686119tz
    public final void LJIIIZ(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Handle range change: ");
        sbLIZ.append(i);
        sbLIZ.append(" to ");
        sbLIZ.append(i2);
        C2188811AlT.LIZIZ(sbLIZ);
        C21687719uF c21687719uF = this.LJIILLIIL;
        c21687719uF.LIZJ = i;
        c21687719uF.LIZ.clear();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.19u8, X.19uF] */
    public C21685819tw(int i, int i2, int i3) {
        int i4;
        this.LJIIJJI = 2;
        ?? r1 = new AbstractC21687019u8() { // from class: X.19uF
        };
        this.LJIILLIIL = r1;
        this.LJIJJ = false;
        if (i != this.LJIIJJI) {
            if (i >= 1) {
                this.LJIIJJI = i;
                r1.LIZ.clear();
                LJJ();
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Column count must be at least 1. Provided: ");
                sbLIZ.append(i);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        r1.LIZIZ = true;
        this.LJI = i2;
        if (i3 < 0) {
            i4 = 0;
        } else {
            i4 = i3;
        }
        this.LJIILIIL = i4;
        this.LJIILJJIL = i3 < 0 ? 0 : i3;
    }

    @Override // X.AbstractC21686119tz
    public final void LJIIZILJ(C21673919s1 c21673919s1, C21686719u5 c21686719u5, InterfaceC21686919u7 interfaceC21686919u7) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("validateAnchorPosition:");
        sbLIZ.append(c21686719u5.LIZ);
        sbLIZ.append(", layoutFromEnd=");
        sbLIZ.append(c21686719u5.LIZJ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c21673919s1.LIZIZ() > 0 && !c21673919s1.LJI) {
            int iLIZ = LIZ(c21686719u5.LIZ, this.LJIIJJI);
            if (c21686719u5.LIZJ) {
                while (iLIZ < this.LJIIJJI - 1 && c21686719u5.LIZ < ((Integer) this.LIZ.LIZIZ).intValue()) {
                    int i = c21686719u5.LIZ + 1;
                    c21686719u5.LIZ = i;
                    iLIZ = LIZ(i, this.LJIIJJI);
                }
            } else {
                while (iLIZ > 0) {
                    int i2 = c21686719u5.LIZ;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c21686719u5.LIZ = i3;
                    iLIZ = LIZ(i3, this.LJIIJJI);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Adjust anchor: newPos=");
                    sbLIZ2.append(c21686719u5.LIZ);
                    sbLIZ2.append(", SpanIndex=");
                    sbLIZ2.append(iLIZ);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
            this.LJIJJ = true;
        }
    }

    public final int LJJIFFI(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        if (!c21673919s1.LJI) {
            getClass();
            return 1;
        }
        if (c21673319rv.LJ(i) == -1) {
            return 0;
        }
        getClass();
        return 1;
    }

    @Override // X.AbstractC21686119tz
    public final int LIZJ(int i, boolean z, boolean z2, InterfaceC21686919u7 interfaceC21686919u7) {
        boolean z3;
        int i2;
        int i3;
        if (interfaceC21686919u7.getOrientation() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z) {
            if (i != this.LJI - 1) {
                return 0;
            }
            if (z3) {
                i3 = this.LJ;
            } else {
                i3 = this.LIZJ;
            }
            return 0 + i3;
        }
        if (i != 0) {
            return 0;
        }
        if (z3) {
            i2 = this.LIZLLL;
        } else {
            i2 = this.LIZIZ;
        }
        return 0 - i2;
    }

    public final int LJJI(float f, int i, int i2, int i3) {
        if (!Float.isNaN(f) && f > 0.0f && i3 > 0) {
            return View.MeasureSpec.makeMeasureSpec((int) ((i3 / f) + 0.5f), 1073741824);
        }
        if (!Float.isNaN(this.LJIIJ)) {
            float f2 = this.LJIIJ;
            if (f2 > 0.0f) {
                return View.MeasureSpec.makeMeasureSpec((int) ((i2 / f2) + 0.5f), 1073741824);
            }
        }
        if (i < 0) {
            return LJIJJLI;
        }
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0438  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:83:0x0270
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // X.AbstractC21685919tx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(X.C21673319rv r32, X.C21673919s1 r33, X.C21686319u1 r34, X.C21687819uG r35, X.InterfaceC21686919u7 r36) {
        /*
            Method dump skipped, instruction units count: 1982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21685819tw.LJIJI(X.19rv, X.19s1, X.19u1, X.19uG, X.19u7):void");
    }
}
