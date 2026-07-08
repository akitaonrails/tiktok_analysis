package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0oXr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1477250oXr implements InterfaceC1477990oZ3 {
    public final List<InterfaceC1477240oXq> LIZ;
    public final C1477270oXt LIZIZ;
    public final C1478000oZ4 LIZJ;
    public final C1478010oZ5 LIZLLL;
    public int LJ;

    @Override // X.InterfaceC1477990oZ3
    public final C1478010oZ5 LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1477990oZ3
    public final C1477210oXn LIZIZ(C1478010oZ5 c1478010oZ5) {
        if (this.LJ >= this.LIZ.size()) {
            return null;
        }
        InterfaceC1477240oXq interfaceC1477240oXq = (InterfaceC1477240oXq) ListProtector.get(this.LIZ, this.LJ);
        if (!interfaceC1477240oXq.isValid()) {
            this.LJ++;
            return LIZIZ(c1478010oZ5);
        }
        return interfaceC1477240oXq.LIZJ(new C1477250oXr(this.LIZ, c1478010oZ5, this.LJ + 1));
    }

    public final C1477210oXn LIZJ(C1478000oZ4 c1478000oZ4) {
        if (this.LJ >= this.LIZ.size()) {
            return null;
        }
        InterfaceC1477240oXq interfaceC1477240oXq = (InterfaceC1477240oXq) ListProtector.get(this.LIZ, this.LJ);
        if (!interfaceC1477240oXq.isValid()) {
            this.LJ++;
            return LIZJ(c1478000oZ4);
        }
        return interfaceC1477240oXq.LIZ(new C1477250oXr(this.LIZ, c1478000oZ4, this.LJ + 1));
    }

    public final C1477210oXn LIZLLL(C1477270oXt c1477270oXt) {
        if (this.LJ >= this.LIZ.size()) {
            return null;
        }
        InterfaceC1477240oXq interfaceC1477240oXq = (InterfaceC1477240oXq) ListProtector.get(this.LIZ, this.LJ);
        if (!interfaceC1477240oXq.isValid()) {
            this.LJ++;
            return LIZLLL(c1477270oXt);
        }
        return interfaceC1477240oXq.LIZLLL(new C1477250oXr(this.LIZ, c1477270oXt, this.LJ + 1));
    }

    public C1477250oXr(List<InterfaceC1477240oXq> list, C1477270oXt c1477270oXt, int i) {
        this.LIZ = list;
        this.LIZIZ = c1477270oXt;
        this.LJ = i;
    }

    public C1477250oXr(List<InterfaceC1477240oXq> list, C1478000oZ4 c1478000oZ4, int i) {
        this.LIZ = list;
        this.LJ = i;
        this.LIZJ = c1478000oZ4;
    }

    public C1477250oXr(List<InterfaceC1477240oXq> list, C1478010oZ5 c1478010oZ5, int i) {
        this.LIZ = list;
        this.LJ = i;
        this.LIZLLL = c1478010oZ5;
    }
}
