package X;

import Y.AObjectS404S0100000_30;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Gz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19983913Gz implements InterfaceC19983313Gt, InterfaceC1865240yde {
    public final String LIZ;
    public final C13H1<?> LIZIZ;
    public final int LIZJ;
    public int LIZLLL = -1;
    public final String[] LJ;
    public final List<Annotation>[] LJFF;
    public final boolean[] LJI;
    public Map<String, Integer> LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;

    @Override // X.InterfaceC19983313Gt
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC19983313Gt
    public /* synthetic */ boolean isInline() {
        return false;
    }

    @Override // X.InterfaceC1865240yde
    public final Set<String> LIZLLL() {
        return this.LJII.keySet();
    }

    public int hashCode() {
        return ((Number) this.LJIIJ.getValue()).intValue();
    }

    public String toString() {
        return C19983713Gx.LIZIZ(this);
    }

    @Override // X.InterfaceC19983313Gt
    public C13GW LIZIZ() {
        return C19982513Gl.LIZ;
    }

    @Override // X.InterfaceC19983313Gt
    public final int LJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC19983313Gt
    public final String LJI() {
        return this.LIZ;
    }

    @Override // X.InterfaceC19983313Gt
    public final List<Annotation> getAnnotations() {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC19983313Gt
    public final String LIZJ(int i) {
        return this.LJ[i];
    }

    @Override // X.InterfaceC19983313Gt
    public final List<Annotation> LJFF(int i) {
        List<Annotation> list = this.LJFF[i];
        if (list == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }

    @Override // X.InterfaceC19983313Gt
    public final int LJII(String str) {
        Integer num = this.LJII.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // X.InterfaceC19983313Gt
    public InterfaceC19983313Gt LJIIIIZZ(int i) {
        return ((C13HG[]) this.LJIIIIZZ.getValue())[i].getDescriptor();
    }

    @Override // X.InterfaceC19983313Gt
    public final boolean LJIIIZ(int i) {
        return this.LJI[i];
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C19983913Gz)) {
                return false;
            }
            InterfaceC19983313Gt interfaceC19983313Gt = (InterfaceC19983313Gt) obj;
            if (!Intrinsics.LJFF(this.LIZ, interfaceC19983313Gt.LJI()) || !Arrays.equals((Object[]) this.LJIIIZ.getValue(), (Object[]) ((C19983913Gz) obj).LJIIIZ.getValue()) || this.LIZJ != interfaceC19983313Gt.LJ()) {
                return false;
            }
            int i = this.LIZJ;
            for (int i2 = 0; i2 < i; i2++) {
                if (!Intrinsics.LJFF(LJIIIIZZ(i2).LJI(), interfaceC19983313Gt.LJIIIIZZ(i2).LJI()) || !Intrinsics.LJFF(LJIIIIZZ(i2).LIZIZ(), interfaceC19983313Gt.LJIIIIZZ(i2).LIZIZ())) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void LJIIJ(String str, boolean z) {
        String[] strArr = this.LJ;
        int i = this.LIZLLL + 1;
        this.LIZLLL = i;
        strArr[i] = str;
        this.LJI[i] = z;
        this.LJFF[i] = null;
        if (i == this.LIZJ - 1) {
            HashMap map = new HashMap();
            int length = this.LJ.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(this.LJ[i2], Integer.valueOf(i2));
            }
            this.LJII = map;
        }
    }

    public C19983913Gz(String str, C13H1<?> c13h1, int i) {
        this.LIZ = str;
        this.LIZIZ = c13h1;
        this.LIZJ = i;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.LJ = strArr;
        int i3 = this.LIZJ;
        this.LJFF = new List[i3];
        this.LJI = new boolean[i3];
        this.LJII = C2097608Jq.LJ();
        EnumC452301pR enumC452301pR = EnumC452301pR.PUBLICATION;
        this.LJIIIIZZ = C452501pT.LIZ(enumC452301pR, new AObjectS404S0100000_30(this, 1));
        this.LJIIIZ = C452501pT.LIZ(enumC452301pR, new AObjectS404S0100000_30(this, 2));
        this.LJIIJ = C452501pT.LIZ(enumC452301pR, new AObjectS404S0100000_30(this, 3));
    }
}
