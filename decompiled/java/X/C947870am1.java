package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0am1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C947870am1 implements InterfaceC930220aJY {
    public int LIZ;
    public int LIZIZ;
    public Integer LIZJ;
    public final Map<Integer, Integer> LIZLLL = new LinkedHashMap();

    @Override // X.InterfaceC930220aJY
    public final void LJ(int i, int i2) {
    }

    @Override // X.InterfaceC930220aJY
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC930220aJY
    public final void LJI() {
        int i;
        C942210act c942210act = C942210act.LIZ;
        int i2 = this.LIZ;
        c942210act.getClass();
        this.LIZJ = (i2 == 1 || i2 == 2 || i2 == 4 || i2 == 5 || i2 == 3 || (i = this.LIZ) <= 0) ? this.LIZJ : Integer.valueOf(i);
    }

    @Override // X.InterfaceC930220aJY
    public final int LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC930220aJY
    public final Integer LJFF() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC930220aJY
    public final int getPanelLayoutType() {
        return this.LIZ;
    }

    @Override // X.InterfaceC930220aJY
    public final void LIZLLL(int i) {
        this.LIZLLL.put(Integer.valueOf(this.LIZ), Integer.valueOf(i));
        this.LIZIZ = i;
    }

    @Override // X.InterfaceC930220aJY
    public final int LJII(int i) {
        Integer num = (Integer) ((LinkedHashMap) this.LIZLLL).get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        C942210act.LIZ.getClass();
        return C942210act.LJFF(i);
    }

    @Override // X.InterfaceC930220aJY
    public final void LJIIIZ(int i) {
        this.LIZ = i;
    }
}
