package X;

import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CountCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionEntranceRes;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionEntranceResCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgData;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgDataTransfer;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0w8X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1769070w8X implements InterfaceC1769490w9D {
    public final InterfaceC497601wk LIZ;
    public final InterfaceC1769150w8f LIZIZ;
    public final EnumC341090DYt LIZJ;
    public final ReachCfgDataTransfer LIZLLL;
    public final EnumC1768880w8E LJ;
    public final InterfaceC1769450w99 LJFF;
    public Map<String, ? extends Object> LJI;
    public final CountCfg LJII;
    public final boolean LJIIIIZZ;
    public final EnumC1768240w7C LJIIIZ;
    public EnumC1769280w8s LJIIJ;
    public final Set<EnumC1769280w8s> LJIIJJI;

    public abstract EnumC1768880w8E LJ();

    public final boolean LJFF() {
        return this.LJIIJJI.contains(EnumC1769280w8s.SHOWING);
    }

    public final boolean LJI() {
        return this.LJIIJ == EnumC1769280w8s.SHOWING;
    }

    public Map<String, Object> LIZJ() {
        return this.LJI;
    }

    public EnumC1768240w7C LIZLLL() {
        return this.LJIIIZ;
    }

    public final void LJII(EnumC1769280w8s enumC1769280w8s) {
        EnumC1768230w7B enumC1768230w7B;
        this.LJIIJ = enumC1769280w8s;
        this.LJIIJJI.add(enumC1769280w8s);
        if (enumC1769280w8s == EnumC1769280w8s.SHOWING) {
            int i = C1768890w8F.LIZ[LJ().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        enumC1768230w7B = EnumC1768230w7B.REDDOT;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    enumC1768230w7B = EnumC1768230w7B.ICON;
                }
            } else {
                enumC1768230w7B = EnumC1768230w7B.BUBBLE;
            }
            this.LJFF.LIZJ(enumC1768230w7B);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.1BqJ, X.1BqM, X.1BqT] */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.1BqJ] */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.1BqJ] */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.1BqJ] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object LJIIIIZZ(X.AbstractC1769070w8X r6, X.C2217391BqT r7, java.lang.Long r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C1769190w8j
            if (r0 == 0) goto La3
            r4 = r9
            X.0w8j r4 = (X.C1769190w8j) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La3
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r2 = r4.LLILLL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r6 = 2
            r3 = 0
            r1 = 1
            if (r0 == 0) goto L48
            if (r0 == r1) goto L7a
            if (r0 != r6) goto Laa
            java.lang.Object r8 = r4.LLILLJJLI
            X.1BqJ r7 = r4.LL
            X.C155000ia.LIZIZ(r2)
        L2a:
            X.09Fh r2 = X.C2341109Fh.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "ShopByteSync TabUITask==== suspend with ui callback with timeout: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.getClass()
            X.C2341109Fh.LIZ(r0)
            r7.set(r3)
        L45:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L48:
            X.C155000ia.LIZIZ(r2)
            if (r8 != 0) goto L8d
            r4.LL = r7
            r4.LLILZIL = r1
            X.1DEt r2 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r4)
            r2.<init>(r1, r0)
            r2.LJIJJ()
            r7.set(r2)
            kotlin.jvm.internal.AwS370S0200000_4 r1 = new kotlin.jvm.internal.AwS370S0200000_4
            r0 = 79
            r1.<init>(r2, r7, r0)
            r2.LJJII(r1)
            java.lang.Object r1 = r2.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L77
            X.C099Q.LIZJ(r4)
        L77:
            if (r1 != r5) goto L7f
            return r5
        L7a:
            X.1BqJ r7 = r4.LL
            X.C155000ia.LIZIZ(r2)
        L7f:
            X.09Fh r0 = X.C2341109Fh.LIZ
            r0.getClass()
            java.lang.String r0 = "ShopByteSync TabUITask==== suspend with ui callback without timeout"
            X.C2341109Fh.LIZ(r0)
            r7.set(r3)
            goto L45
        L8d:
            long r1 = r8.longValue()
            X.0CnH r0 = new X.0CnH
            r0.<init>(r7, r8, r3)
            r4.LL = r7
            r4.LLILLJJLI = r8
            r4.LLILZIL = r6
            java.lang.Object r0 = X.C099A.LIZIZ(r1, r0, r4)
            if (r0 != r5) goto L2a
            return r5
        La3:
            X.0w8j r4 = new X.0w8j
            r4.<init>(r6, r9)
            goto L12
        Laa:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1769070w8X.LJIIIIZZ(X.0w8X, X.1BqT, java.lang.Long, X.05Vn):java.lang.Object");
    }

    public AbstractC1769070w8X(InterfaceC497601wk interfaceC497601wk, InterfaceC1769150w8f interfaceC1769150w8f, EnumC341090DYt enumC341090DYt, ReachCfgDataTransfer reachCfgDataTransfer, EnumC1768880w8E enumC1768880w8E, InterfaceC1769450w99 interfaceC1769450w99) {
        CountCfg countCfg;
        boolean zBooleanValue;
        Boolean boolIsNewSession;
        ReachCfgData reachCfgData;
        DiversionEntranceRes diversionEntranceResLIZ;
        DiversionEntranceResCfg diversionEntranceResCfg;
        this.LIZ = interfaceC497601wk;
        this.LIZIZ = interfaceC1769150w8f;
        this.LIZJ = enumC341090DYt;
        this.LIZLLL = reachCfgDataTransfer;
        this.LJ = enumC1768880w8E;
        this.LJFF = interfaceC1769450w99;
        if (reachCfgDataTransfer != null && (reachCfgData = reachCfgDataTransfer.reachCfgData) != null && (diversionEntranceResLIZ = C1767520w62.LIZ(reachCfgData)) != null && (diversionEntranceResCfg = diversionEntranceResLIZ.config) != null) {
            countCfg = diversionEntranceResCfg.redDot;
        } else {
            countCfg = null;
        }
        this.LJII = countCfg;
        if (reachCfgDataTransfer != null && (boolIsNewSession = reachCfgDataTransfer.isNewSession()) != null) {
            zBooleanValue = boolIsNewSession.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LJIIIIZZ = zBooleanValue;
        this.LJIIIZ = EnumC1768240w7C.DEFAULT;
        this.LJIIJ = EnumC1769280w8s.UNEXECUTED;
        this.LJIIJJI = new LinkedHashSet();
    }
}
