package X;

import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.BadgeRedDotStrongToWeakCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CountCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgDataTransfer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w8Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1769090w8Z extends AbstractC1769070w8X {
    public EnumC1768240w7C LJIIL;
    public C1769130w8d LJIILIIL;
    public C11JF LJIILJJIL;
    public AnonymousClass0956 LJIILL;
    public AnonymousClass0956 LJIILLIIL;
    public long LJIIZILJ;

    @Override // X.InterfaceC1769490w9D
    public final Object LIZIZ(InterfaceC1364105Vn<? super EnumC1768880w8E> interfaceC1364105Vn) {
        return LJIIIZ(this, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x02b6  */
    @Override // X.AbstractC1769070w8X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> LIZJ() {
        /*
            Method dump skipped, instruction units count: 1175
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1769090w8Z.LIZJ():java.util.Map");
    }

    @Override // X.AbstractC1769070w8X
    public final EnumC1768240w7C LIZLLL() {
        return this.LJIIL;
    }

    @Override // X.AbstractC1769070w8X
    public final EnumC1768880w8E LJ() {
        return EnumC1768880w8E.TAB_BADGE;
    }

    @Override // X.InterfaceC1769490w9D
    public final void LIZ(EnumC1769260w8q enumC1769260w8q) {
        if (this.LJIIJ == EnumC1769280w8s.SHOWING) {
            C1769130w8d c1769130w8d = this.LJIILIIL;
            if (c1769130w8d != null) {
                LJII(EnumC1769280w8s.HIDING);
                this.LIZIZ.mJ0(C1769130w8d.LIZ(c1769130w8d, this.LJIIL, null, LIZJ(), enumC1769260w8q, null, null, 32572));
            }
            C11JF c11jf = this.LJIILJJIL;
            if (c11jf != null) {
                c11jf.dispose();
                this.LJIILJJIL = null;
            }
            AnonymousClass0956 anonymousClass0956 = this.LJIILL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LJIILL = null;
            AnonymousClass0956 anonymousClass09562 = this.LJIILLIIL;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            this.LJIILLIIL = null;
        }
    }

    public void LJIIJ(C1769130w8d c1769130w8d) {
        LJII(EnumC1769280w8s.SHOWING);
        this.LJIIZILJ = System.currentTimeMillis();
        this.LIZIZ.mJ0(C1769130w8d.LIZ(c1769130w8d, this.LJIIL, null, LIZJ(), null, null, null, 32701));
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0330  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LJIIIZ(X.AbstractC1769090w8Z r28, X.InterfaceC1364105Vn<? super X.EnumC1768880w8E> r29) {
        /*
            Method dump skipped, instruction units count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1769090w8Z.LJIIIZ(X.0w8Z, X.05Vn):java.lang.Object");
    }

    public AbstractC1769090w8Z(InterfaceC497601wk interfaceC497601wk, InterfaceC1769150w8f interfaceC1769150w8f, EnumC341090DYt enumC341090DYt, ReachCfgDataTransfer reachCfgDataTransfer, InterfaceC1769450w99 interfaceC1769450w99) {
        EnumC1768240w7C enumC1768240w7C;
        BadgeRedDotStrongToWeakCfg badgeRedDotStrongToWeakCfg;
        super(interfaceC497601wk, interfaceC1769150w8f, enumC341090DYt, reachCfgDataTransfer, null, interfaceC1769450w99);
        CountCfg countCfg = this.LJII;
        if (countCfg != null && (badgeRedDotStrongToWeakCfg = countCfg.redDotStrongToWeakCfg) != null && Intrinsics.LJFF(badgeRedDotStrongToWeakCfg.enable, Boolean.TRUE) && badgeRedDotStrongToWeakCfg.strongDuration != null) {
            if (this.LJIIIIZZ) {
                enumC1768240w7C = EnumC1768240w7C.REDDOT_WEAK_WILL;
            } else {
                enumC1768240w7C = EnumC1768240w7C.REDDOT_STRONG_WILL;
            }
        } else {
            enumC1768240w7C = EnumC1768240w7C.REDDOT_DEFAULT;
        }
        this.LJIIL = enumC1768240w7C;
        this.LJIIZILJ = -1L;
    }
}
