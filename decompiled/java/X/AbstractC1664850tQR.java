package X;

import X.InterfaceC1461640o8g;
import X.InterfaceC1660190tIv;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS124S0201000_25;

/* JADX INFO: renamed from: X.0tQR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1664850tQR<T extends InterfaceC1660190tIv, U extends InterfaceC1461640o8g<? extends T>> implements InterfaceC1664980tQe<T, U> {
    public final C05P0<Boolean> LIZ = C20028913Yh.LJI(Boolean.FALSE);
    public final C1661980tLo<U> LIZIZ = new C1661980tLo<>();
    public View LIZJ;

    public abstract void LIZIZ();

    public abstract void LJ(U u);

    public abstract View LJFF(Context context, U u);

    public final void LIZLLL(C2217381BqS c2217381BqS, Function2 function2) {
        U u;
        C1661980tLo<U> c1661980tLo = this.LIZIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c1661980tLo.LIZIZ;
        Object arrayList = linkedHashMap.get(c2217381BqS);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(c2217381BqS, arrayList);
        }
        C19719512Dh.LJ(2, function2);
        ((List) arrayList).add(function2);
        if (c1661980tLo.LIZ && (u = c1661980tLo.LIZJ) != null) {
            function2.invoke(c2217381BqS.get(u), u);
        }
    }

    @Override // X.InterfaceC1664980tQe
    public final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-222694350);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else if (((Boolean) ((C13FE) this.LIZ).getValue()).booleanValue()) {
            LIZIZ();
            C1665970tSF.LIZJ((i2 << 3) & 112, 0, c13zcLJIIJ, interfaceC1685750ty9, C0MBB.LIZIZ(2131820718, c13zcLJIIJ));
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25((AbstractC1664850tQR) this, interfaceC1685750ty9, (InterfaceC1685750ty9) i, 76);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    @Override // X.InterfaceC1664980tQe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(U r21, X.InterfaceC1685750ty9 r22, X.InterfaceC1680500tpg r23, int r24) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1664850tQR.LIZJ(X.0o8g, X.0ty9, X.0tpg, int):void");
    }
}
