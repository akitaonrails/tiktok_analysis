package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS22S2000000_25;

/* JADX INFO: renamed from: X.0thx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1675710thx {
    public static final float LIZ;
    public static final float LIZIZ;
    public static final float LIZJ;

    static {
        EnumC21568119ax enumC21568119ax = EnumC21568119ax.LEFT_BOTTOM_LARGE;
        LIZ = (((enumC21568119ax.getContentInsetTop() + enumC21568119ax.getShadowOutsetTopDp()) + enumC21568119ax.getShadowOutsetBottomDp()) - enumC21568119ax.getContentInsetBottom()) / 2.0f;
        LIZIZ = ((enumC21568119ax.getShadowOutsetLeftDp() + enumC21568119ax.getShadowOutsetRightDp()) + 8) - 10;
        float shadowOutsetTopDp = (enumC21568119ax.getShadowOutsetTopDp() + enumC21568119ax.getShadowOutsetBottomDp()) - 16.0f;
        if (shadowOutsetTopDp < 0.0f) {
            shadowOutsetTopDp = 0.0f;
        }
        LIZJ = shadowOutsetTopDp;
    }

    public static final void LIZIZ(String str, String str2, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1084409365);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = AFwS266S0000000_25.get$arr$(484);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            Function1 function1 = (Function1) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean z2 = true;
            if ((i2 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 112) != 32) {
                z2 = false;
            }
            boolean z3 = z | z2;
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (z3 || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS22S2000000_25(str, str2, 1);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C20084413iE.LIZ(6, 2, c13zcLJIIJ, null, function1, (Function1) objLJJ2);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1675720thy(str, str2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(com.ss.android.ugc.aweme.social.thought.api.model.ThoughtAggregatedModel r61, int r62, boolean r63, boolean r64, final kotlin.jvm.functions.Function0<kotlin.Unit> r65, kotlin.jvm.functions.Function0<kotlin.Unit> r66, kotlin.jvm.functions.Function0<kotlin.Unit> r67, final kotlin.jvm.functions.Function1<? super X.C1378605aS, kotlin.Unit> r68, kotlin.jvm.functions.Function0<kotlin.Unit> r69, X.InterfaceC1680500tpg r70, int r71) {
        /*
            Method dump skipped, instruction units count: 1907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1675710thx.LIZ(com.ss.android.ugc.aweme.social.thought.api.model.ThoughtAggregatedModel, int, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, X.0tpg, int):void");
    }
}
