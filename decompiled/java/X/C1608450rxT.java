package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS1S0000001_3;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: renamed from: X.0rxT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1608450rxT extends AbstractC1608790ry1<EnumC1608460rxU, C1257180iou> {
    public final C1257180iou LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(611));

    /* JADX WARN: Multi-variable type inference failed */
    public final C1606960rv4 LJI() {
        C1257180iou c1257180iou = this.LIZLLL;
        InterfaceC1609270ryn c1607340rvg = c1257180iou != null && c1257180iou.LIZ == 8 ? C1606920rv0.LIZ : new C1607340rvg((AnonymousClass0207) (0 == true ? 1 : 0), 3);
        C1257180iou c1257180iou2 = this.LIZLLL;
        Function1 function1LJFF = LJFF(c1257180iou2 != null ? Integer.valueOf(c1257180iou2.LIZ) : null);
        C1257180iou c1257180iou3 = this.LIZLLL;
        return new C1606960rv4(new C1606970rv5(new C1609250ryl(c1607340rvg, new C1608470rxV(function1LJFF, LJFF(c1257180iou3 != null ? Integer.valueOf(c1257180iou3.LIZ) : null), 4), null, new AwS603S0100000_24(this, 628), new AwS603S0100000_24(this, 629), null, true, true, new AwS603S0100000_24(this, 630), null, 3148)));
    }

    @Override // X.AbstractC1608790ry1
    public final /* bridge */ /* synthetic */ InterfaceC426680GoE LJ() {
        return this.LIZLLL;
    }

    public C1608450rxT(C1257180iou c1257180iou) {
        this.LIZLLL = c1257180iou;
    }

    public static Function1 LJFF(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return AFwS264S0000000_24.get$arr$(724);
            }
            if (num.intValue() == 8) {
                return AFwS264S0000000_24.get$arr$(725);
            }
        }
        return AFwS264S0000000_24.get$arr$(726);
    }

    public static float LJII(C1608740rxw c1608740rxw) {
        float fLIZIZ;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = c1608740rxw.LIZ;
        boolean zLIZ = C295310Bhp.LIZ();
        if (i7 <= C1608430rxR.LJI) {
            if (zLIZ) {
                i6 = 68;
            } else {
                i6 = 72;
            }
            fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(i6));
        } else if (i7 <= C1608430rxR.LJFF) {
            if (zLIZ) {
                i5 = 78;
            } else {
                i5 = 76;
            }
            fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(i5));
        } else if (i7 <= C1608430rxR.LJ) {
            if (zLIZ) {
                i4 = 86;
            } else {
                i4 = 82;
            }
            fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(i4));
        } else if (i7 <= C1608430rxR.LIZJ) {
            if (zLIZ) {
                i3 = 98;
            } else {
                i3 = 93;
            }
            fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(i3));
        } else if (i7 <= C1608430rxR.LIZIZ) {
            if (zLIZ) {
                i2 = 112;
            } else {
                i2 = 107;
            }
            fLIZIZ = C418440Gaw.LIZIZ(i2);
        } else if (i7 <= C1608430rxR.LIZ) {
            if (zLIZ) {
                i = 136;
            } else {
                i = 134;
            }
            fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(i));
        } else {
            fLIZIZ = C418440Gaw.LIZIZ(107);
        }
        return C19252910Tv.LIZIZ.LIZLLL().LJI().LJIILJJIL(fLIZIZ);
    }

    public static int LJIIIIZZ(C1608740rxw c1608740rxw) {
        int i = c1608740rxw.LIZ;
        if (i <= C1608430rxR.LJI) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        }
        if (i <= C1608430rxR.LIZIZ) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
        }
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
    }

    @Override // X.AbstractC1608790ry1
    public final C1606960rv4 LIZ(InterfaceC1606880ruw interfaceC1606880ruw) {
        C1257180iou c1257180iou;
        int i;
        EnumC1994907rf enumC1994907rf = null;
        if (interfaceC1606880ruw == EnumC1608460rxU.LIVE && (c1257180iou = this.LIZLLL) != null) {
            int i2 = c1257180iou.LIZ;
            if (i2 != 1 && i2 != 2) {
                if (i2 == 4 || i2 == 8) {
                    return LJI();
                }
            } else {
                if (c1257180iou != null) {
                    enumC1994907rf = c1257180iou.LIZIZ;
                }
                if (enumC1994907rf == EnumC1994907rf.ANIM_BADGE) {
                    return LJI();
                }
                if (C295310Bhp.LIZ()) {
                    i = R.drawable.f6o;
                } else {
                    i = R.drawable.f6m;
                }
                return new C1606960rv4(new C1606970rv5(new C1609230ryj(2131842717, i, new AwS603S0100000_24(this, 634), Integer.valueOf(R.attr.ee), new AwS638S0100000_24(this, 195), new AwS638S0100000_24(this, 196), new C1557920qdy(81, new AwS603S0100000_24(this, 631), 4), new C1608470rxV(new AwS603S0100000_24(this, 632), new AwS603S0100000_24(this, 633), 4))));
            }
        }
        return null;
    }

    @Override // X.AbstractC1608790ry1
    public final C1606950rv3 LIZLLL(InterfaceC1606880ruw interfaceC1606880ruw) {
        C1257180iou c1257180iou;
        float fLIZIZ;
        AFwS264S0000000_24 aFwS264S0000000_24 = null;
        if (interfaceC1606880ruw == EnumC1608460rxU.LIVE && (c1257180iou = this.LIZLLL) != null) {
            int i = c1257180iou.LIZ;
            if (i != 1 && i != 2) {
                if (i == 4 || i == 8) {
                    if (((Boolean) C275280Aqc.LIZ.getValue()).booleanValue()) {
                        fLIZIZ = C418440Gaw.LIZIZ(3);
                    } else {
                        fLIZIZ = C418440Gaw.LIZIZ(2);
                    }
                    return new C1606950rv3(new C1606970rv5(new C1608120rww(new AwS638S0100000_24(this, 197), aFwS264S0000000_24, new AwS1S0000001_3(fLIZIZ, 0), 235)));
                }
            } else {
                return new C1606950rv3(new C1606970rv5(new C1609250ryl(new C1557920qdy(17, null, 6), new C1608470rxV(new AwS603S0100000_24(this, 635), new AwS603S0100000_24(this, 636), 4), null, AFwS264S0000000_24.get$arr$(727), new AwS603S0100000_24(this, 637), null, true, false, null, null, 3908)));
            }
        }
        return null;
    }
}
