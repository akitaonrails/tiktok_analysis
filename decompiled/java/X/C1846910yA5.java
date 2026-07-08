package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.rank.LiveRankPostStickerCenterDataEnableSetting;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yA5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846910yA5 {
    public final DataChannel LIZ;
    public final RankTypeV2 LIZIZ;
    public C1846920yA6 LIZJ;

    public final C1119420fEi LIZ() {
        C1846920yA6 c1846920yA6 = this.LIZJ;
        if (c1846920yA6 != null) {
            return c1846920yA6.LIZ;
        }
        return null;
    }

    public final void LIZLLL() {
        if (LiveRankPostStickerCenterDataEnableSetting.INSTANCE.getValue()) {
            C1119210fEN c1119210fEN = C1119210fEN.LIZ;
            DataChannel dataChannel = this.LIZ;
            RankTypeV2 rankTypeV2 = this.LIZIZ;
            c1119210fEN.getClass();
            InterfaceC1846850y9z interfaceC1846850y9zLIZIZ = C1119210fEN.LIZIZ(dataChannel, rankTypeV2);
            if (interfaceC1846850y9zLIZIZ != null) {
                interfaceC1846850y9zLIZIZ.LJFF();
            }
        }
    }

    public final void LIZIZ(Function1 function1) {
        C1846810y9v c1846810y9v;
        String strLJIJI;
        C1119420fEi c1119420fEi;
        C1846920yA6 c1846920yA6 = this.LIZJ;
        Integer numValueOf = null;
        if (c1846920yA6 != null) {
            numValueOf = Integer.valueOf(c1846920yA6.LIZIZ);
        }
        C1846920yA6 c1846920yA62 = this.LIZJ;
        if (c1846920yA62 != null) {
            if (C1846800y9u.LJIIZILJ(numValueOf, 2) || TextUtils.equals("client_settled", "client_settled")) {
                c1846920yA62.LIZIZ = 2;
                C1119420fEi c1119420fEi2 = c1846920yA62.LIZ;
                if (c1119420fEi2 != null) {
                    C1846930yA7 c1846930yA7 = c1119420fEi2.LJIIIZ;
                    if (c1846930yA7 == null) {
                        c1846930yA7 = new C1846930yA7(0, 0L);
                    }
                    C1846920yA6 c1846920yA63 = this.LIZJ;
                    if (c1846920yA63 == null || (c1119420fEi = c1846920yA63.LIZ) == null || (c1846810y9v = c1119420fEi.LJIIIIZZ) == null) {
                        int i = c1846930yA7.LIZ;
                        long j = c1846930yA7.LIZIZ;
                        c1846810y9v = new C1846810y9v(0, new C1846930yA7(i, j), new C1846930yA7(i, j));
                    }
                    C1846930yA7 c1846930yA72 = c1846810y9v.LIZIZ;
                    if (c1846930yA72 == null) {
                        c1846930yA72 = new C1846930yA7(c1846930yA7.LIZ, c1846930yA7.LIZIZ);
                    }
                    c1846810y9v.LIZIZ = c1846930yA72;
                    c1846810y9v.LIZ = 2;
                    C1119420fEi c1119420fEi3 = new C1119420fEi(c1119420fEi2.LIZ, c1119420fEi2.LIZIZ, c1119420fEi2.LIZJ, c1119420fEi2.LIZLLL, c1119420fEi2.LJ, c1119420fEi2.LJFF, c1119420fEi2.LJI, c1119420fEi2.LJII, c1846810y9v, c1119420fEi2.LJIIIZ, c1119420fEi2.LJIIJ);
                    if (Intrinsics.LJFF(this.LIZIZ, RankTypeV2.LJIL)) {
                        strLJIJI = C497740JfY.LJIJI(2131855528);
                    } else {
                        strLJIJI = C497740JfY.LJIJI(2131855527);
                    }
                    c1119420fEi3.LJIILIIL = strLJIJI;
                    c1846920yA62.LIZ = c1119420fEi3;
                    function1.invoke(c1119420fEi3);
                    C1119210fEN c1119210fEN = C1119210fEN.LIZ;
                    DataChannel dataChannel = this.LIZ;
                    RankTypeV2 rankTypeV2 = this.LIZIZ;
                    c1119210fEN.getClass();
                    InterfaceC1846850y9z interfaceC1846850y9zLIZIZ = C1119210fEN.LIZIZ(dataChannel, rankTypeV2);
                    if (interfaceC1846850y9zLIZIZ != null) {
                        interfaceC1846850y9zLIZIZ.LIZJ(c1119420fEi3.LJIILIIL);
                    }
                }
            }
        }
    }

    public final void LIZJ(Function1<? super C1119420fEi, Unit> function1) {
        Integer numValueOf;
        C1846920yA6 c1846920yA6;
        C1846930yA7 c1846930yA7;
        C1846920yA6 c1846920yA62 = this.LIZJ;
        C1846930yA7 c1846930yA72 = null;
        if (c1846920yA62 != null) {
            numValueOf = Integer.valueOf(c1846920yA62.LIZIZ);
        } else {
            numValueOf = null;
        }
        if ((numValueOf != null && (numValueOf.intValue() == 1 || numValueOf.intValue() == 2)) || (c1846920yA6 = this.LIZJ) == null || !C1846800y9u.LJIIZILJ(numValueOf, 1)) {
            return;
        }
        c1846920yA6.LIZIZ = 1;
        C1119420fEi c1119420fEi = c1846920yA6.LIZ;
        if (c1119420fEi == null) {
            return;
        }
        C1846810y9v c1846810y9v = c1119420fEi.LJIIIIZZ;
        if (c1846810y9v != null) {
            c1846930yA7 = c1846810y9v.LIZIZ;
            c1846930yA72 = c1846810y9v.LIZJ;
        } else {
            c1846930yA7 = null;
        }
        C1119420fEi c1119420fEi2 = new C1119420fEi(c1119420fEi.LIZ, c1119420fEi.LIZIZ, c1119420fEi.LIZJ, c1119420fEi.LIZLLL, c1119420fEi.LJ, c1119420fEi.LJFF, c1119420fEi.LJI, c1119420fEi.LJII, new C1846810y9v(1, c1846930yA7, c1846930yA72), c1119420fEi.LJIIIZ, c1119420fEi.LJIIJ);
        c1119420fEi2.LJIILIIL = C497740JfY.LJIJI(2131855522);
        c1846920yA6.LIZ = c1119420fEi2;
        function1.invoke(c1119420fEi2);
        C1119210fEN c1119210fEN = C1119210fEN.LIZ;
        DataChannel dataChannel = this.LIZ;
        RankTypeV2 rankTypeV2 = this.LIZIZ;
        c1119210fEN.getClass();
        InterfaceC1846850y9z interfaceC1846850y9zLIZIZ = C1119210fEN.LIZIZ(dataChannel, rankTypeV2);
        if (interfaceC1846850y9zLIZIZ == null) {
            return;
        }
        interfaceC1846850y9zLIZIZ.LJI();
    }

    public final boolean LJ(C1119420fEi c1119420fEi) {
        int i;
        C1119420fEi c1119420fEi2;
        C1846920yA6 c1846920yA6 = this.LIZJ;
        int i2 = 0;
        if (c1846920yA6 == null) {
            C1846810y9v c1846810y9v = c1119420fEi.LJIIIIZZ;
            if (c1846810y9v != null) {
                i2 = c1846810y9v.LIZ;
            }
            this.LIZJ = new C1846920yA6(c1119420fEi, i2);
            return true;
        }
        Integer numValueOf = Integer.valueOf(c1846920yA6.LIZIZ);
        C1846810y9v c1846810y9v2 = c1119420fEi.LJIIIIZZ;
        if (c1846810y9v2 != null) {
            i = c1846810y9v2.LIZ;
        } else {
            i = 0;
        }
        boolean zLJIIZILJ = C1846800y9u.LJIIZILJ(numValueOf, Integer.valueOf(i));
        if (zLJIIZILJ) {
            C1846920yA6 c1846920yA62 = this.LIZJ;
            if (c1846920yA62 != null) {
                c1846920yA62.LIZ = c1119420fEi;
                C1846810y9v c1846810y9v3 = c1119420fEi.LJIIIIZZ;
                if (c1846810y9v3 != null) {
                    i2 = c1846810y9v3.LIZ;
                }
                c1846920yA62.LIZIZ = i2;
            }
            return zLJIIZILJ;
        }
        DataChannel dataChannel = this.LIZ;
        C1846920yA6 c1846920yA63 = this.LIZJ;
        if (c1846920yA63 != null) {
            c1119420fEi2 = c1846920yA63.LIZ;
        } else {
            c1119420fEi2 = null;
        }
        C1119440fEk.LIZ(dataChannel, c1119420fEi2, c1119420fEi, this.LIZIZ, "sticker_view");
        return zLJIIZILJ;
    }

    public C1846910yA5(DataChannel dataChannel, RankTypeV2 rankTypeV2) {
        this.LIZ = dataChannel;
        this.LIZIZ = rankTypeV2;
    }
}
