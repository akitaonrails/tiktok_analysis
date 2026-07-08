package X;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS233S0300000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1606890rux extends AbstractC1608790ry1<AbstractC1606860ruu, C1606750ruj> {
    public final C1606750ruj LIZLLL;
    public LinearGradient LJ;
    public Float LJFF;
    public Float LJI;
    public Drawable LJII;
    public Drawable LJIIIIZZ;
    public Drawable LJIIIZ;
    public final EnumC1606030rtZ LJIIJ;
    public GestureDetector LJIIJJI;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIIZZ() {
        /*
            r8 = this;
            r7 = 3
            X.0rte[] r1 = new X.EnumC1606080rte[r7]
            X.0rte r0 = X.EnumC1606080rte.FYP_SKYLIGHT
            r6 = 0
            r1[r6] = r0
            X.0rte r0 = X.EnumC1606080rte.FOLLOW_SKYLIGHT
            r5 = 1
            r1[r5] = r0
            X.0rte r0 = X.EnumC1606080rte.INBOX_TOP_LIST
            r4 = 2
            r1[r4] = r0
            java.util.List r3 = X.C1697810uHb.LJIIJJI(r1)
            X.0ruj r0 = r8.LIZLLL
            r2 = 0
            if (r0 == 0) goto L49
            X.0rte r0 = r0.LIZ
            if (r0 == 0) goto L49
            int[] r1 = X.C1606730ruh.LIZIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r5) goto L46
            if (r0 == r4) goto L43
            if (r0 != r7) goto L49
            java.lang.String r0 = "inbox"
        L2f:
            boolean r0 = X.C278330AvX.LIZ(r0)
            if (r0 == 0) goto L42
            X.0ruj r0 = r8.LIZLLL
            if (r0 == 0) goto L3b
            X.0rte r2 = r0.LIZ
        L3b:
            boolean r0 = X.C13LP.LJJJJ(r2, r3)
            if (r0 == 0) goto L42
            r6 = 1
        L42:
            return r6
        L43:
            java.lang.String r0 = "follow"
            goto L2f
        L46:
            java.lang.String r0 = "fyp"
            goto L2f
        L49:
            r0 = r2
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1606890rux.LJIIIIZZ():boolean");
    }

    @Override // X.AbstractC1608790ry1
    public final /* bridge */ /* synthetic */ InterfaceC426680GoE LJ() {
        return this.LIZLLL;
    }

    public C1606890rux(C1606750ruj c1606750ruj) {
        EnumC1606030rtZ enumC1606030rtZ;
        EnumC1606080rte enumC1606080rte;
        this.LIZLLL = c1606750ruj;
        InterfaceC1605840rtG interfaceC1605840rtGLJIIIZ = C1607070rvF.LIZIZ.LJI().LJIIIZ((c1606750ruj == null || (enumC1606080rte = c1606750ruj.LIZ) == null) ? EnumC1606080rte.DEFAULT : enumC1606080rte);
        if (interfaceC1605840rtGLJIIIZ instanceof EnumC1606030rtZ) {
            enumC1606030rtZ = (EnumC1606030rtZ) interfaceC1605840rtGLJIIIZ;
        } else {
            enumC1606030rtZ = null;
        }
        this.LJIIJ = enumC1606030rtZ;
    }

    @Override // X.AbstractC1608790ry1
    public final C1606960rv4 LIZ(InterfaceC1606880ruw interfaceC1606880ruw) {
        Integer numValueOf;
        C1606820ruq c1606820ruq;
        EnumC1606740rui enumC1606740rui;
        InterfaceC1398730mVD interfaceC1398730mVDLIZ;
        AbstractC1606860ruu abstractC1606860ruu = (AbstractC1606860ruu) interfaceC1606880ruw;
        Boolean boolLIZIZ = abstractC1606860ruu.LIZIZ();
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.LJFF(boolLIZIZ, bool) || !(abstractC1606860ruu instanceof C1606800ruo)) {
            if (!Intrinsics.LJFF(abstractC1606860ruu.LIZIZ(), bool) && (interfaceC1398730mVDLIZ = abstractC1606860ruu.LIZ()) != null && interfaceC1398730mVDLIZ.LJIIJ() && (abstractC1606860ruu instanceof C1606820ruq)) {
                return LJFF(abstractC1606860ruu, EnumC1606740rui.SUB_ICON);
            }
            EnumC1606030rtZ enumC1606030rtZ = this.LJIIJ;
            if (enumC1606030rtZ != null && enumC1606030rtZ.getShowPublishEntry()) {
                EnumC1606030rtZ enumC1606030rtZ2 = this.LJIIJ;
                if (enumC1606030rtZ2 != null && enumC1606030rtZ2.getHidePublishBadge() && !(abstractC1606860ruu instanceof C1606850rut)) {
                    return null;
                }
                if (Intrinsics.LJFF(abstractC1606860ruu.LIZIZ(), bool)) {
                    if (!(abstractC1606860ruu instanceof C1606850rut)) {
                        enumC1606740rui = EnumC1606740rui.CREATE_ICON;
                    } else {
                        enumC1606740rui = EnumC1606740rui.NONE;
                    }
                    return LJFF(abstractC1606860ruu, enumC1606740rui);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getBadgeConfig: state: ");
                sbLIZ.append(abstractC1606860ruu);
                sbLIZ.append(", unReadNum: ");
                if ((abstractC1606860ruu instanceof C1606820ruq) && (c1606820ruq = (C1606820ruq) abstractC1606860ruu) != null) {
                    numValueOf = Integer.valueOf(c1606820ruq.LLILZLL);
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                C2188811AlT.LIZIZ(sbLIZ);
                return null;
            }
        }
        return null;
    }

    @Override // X.AbstractC1608790ry1
    public final C1606990rv7 LIZJ(InterfaceC1606880ruw interfaceC1606880ruw) {
        AbstractC1606860ruu abstractC1606860ruu = (AbstractC1606860ruu) interfaceC1606880ruw;
        if (Intrinsics.LJFF(abstractC1606860ruu.LIZIZ(), Boolean.TRUE) && !(abstractC1606860ruu instanceof C1606810rup) && !(abstractC1606860ruu instanceof C1606800ruo)) {
            return new C1606990rv7(new AbstractC1606980rv6() { // from class: X.0rv1
            });
        }
        return null;
    }

    @Override // X.AbstractC1608790ry1
    public final C1606950rv3 LIZLLL(InterfaceC1606880ruw interfaceC1606880ruw) {
        int iIntValue;
        Integer hasConsumedStoryColorRes;
        AbstractC1606860ruu abstractC1606860ruu = (AbstractC1606860ruu) interfaceC1606880ruw;
        C1608950ryH lottieSource = null;
        if (abstractC1606860ruu instanceof C1606820ruq) {
            EnumC1606030rtZ enumC1606030rtZ = this.LJIIJ;
            if (enumC1606030rtZ != null) {
                lottieSource = enumC1606030rtZ.getLottieSource();
            }
            return LJII(this, abstractC1606860ruu, -16777216, null, true, lottieSource, 4);
        }
        if (abstractC1606860ruu instanceof C1606790run) {
            EnumC1606030rtZ enumC1606030rtZ2 = this.LJIIJ;
            if (enumC1606030rtZ2 != null && (hasConsumedStoryColorRes = enumC1606030rtZ2.getHasConsumedStoryColorRes()) != null) {
                iIntValue = hasConsumedStoryColorRes.intValue();
            } else {
                iIntValue = R.attr.a01;
            }
            return LJII(this, abstractC1606860ruu, null, Integer.valueOf(iIntValue), false, null, 18);
        }
        if (abstractC1606860ruu instanceof C1606840rus) {
            EnumC1606030rtZ enumC1606030rtZ3 = this.LJIIJ;
            if (enumC1606030rtZ3 != null) {
                lottieSource = enumC1606030rtZ3.getLottieSource();
            }
            return LJII(this, abstractC1606860ruu, -16777216, null, true, lottieSource, 4);
        }
        if (!(abstractC1606860ruu instanceof C1606850rut)) {
            return null;
        }
        return LJII(this, abstractC1606860ruu, null, Integer.valueOf(R.attr.zs), false, null, 18);
    }

    public final C1606960rv4 LJFF(AbstractC1606860ruu abstractC1606860ruu, EnumC1606740rui enumC1606740rui) {
        return new C1606960rv4(new C1606970rv5(new C1609250ryl(C1606920rv0.LIZ, new C1608470rxV(new AwS603S0100000_24(abstractC1606860ruu, 574), new AwS603S0100000_24(abstractC1606860ruu, 575), 4), new C1608470rxV(AFwS264S0000000_24.get$arr$(686), AFwS264S0000000_24.get$arr$(687), 4), AFwS264S0000000_24.get$arr$(688), new AwS603S0100000_24(this, 576), new AwS233S0300000_24(enumC1606740rui, this, abstractC1606860ruu, 17), true, true, new AwS603S0100000_24(abstractC1606860ruu, 577), "icon", 1032)));
    }

    public final C384050F3z LJI(Context context, EnumC1606740rui enumC1606740rui) {
        C384050F3z c384050F3z = new C384050F3z();
        if (enumC1606740rui == EnumC1606740rui.SUB_ICON) {
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.ny);
        } else if (LJIIIIZZ()) {
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1h);
        } else {
            c384050F3z.LIZ = Integer.valueOf(C1607070rvF.LIZIZ.LJI().LIZJ(context));
        }
        c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
        return c384050F3z;
    }

    public static C1606950rv3 LJII(C1606890rux c1606890rux, AbstractC1606860ruu abstractC1606860ruu, Integer num, Integer num2, boolean z, C1608950ryH c1608950ryH, int i) {
        EnumC1606080rte enumC1606080rteLJII;
        boolean z2;
        C1608950ryH c1608950ryH2 = c1608950ryH;
        Integer num3 = num2;
        Integer num4 = num;
        AwS638S0100000_24 awS638S0100000_24 = null;
        if ((i & 2) != 0) {
            num4 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            c1608950ryH2 = null;
        }
        c1606890rux.getClass();
        InterfaceC1398730mVD interfaceC1398730mVDLIZ = abstractC1606860ruu.LIZ();
        if (interfaceC1398730mVDLIZ != null) {
            enumC1606080rteLJII = interfaceC1398730mVDLIZ.LJII();
        } else {
            enumC1606080rteLJII = null;
        }
        if (z) {
            awS638S0100000_24 = new AwS638S0100000_24(c1606890rux, 188);
        }
        if (c1608950ryH2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new C1606950rv3(new C1606970rv5(new C1608120rww(num4, num3, awS638S0100000_24, new AwS603S0100000_24(enumC1606080rteLJII, abstractC1606860ruu, 578), new AwS603S0100000_24(enumC1606080rteLJII, abstractC1606860ruu, 579), new AwS233S0300000_24(abstractC1606860ruu, interfaceC1398730mVDLIZ, c1606890rux, 18), c1608950ryH2, z2)));
    }
}
