package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.1CuA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2245161CuA implements InterfaceC2245241CuI {
    public final C2245111Cu5 LIZ;
    public final String LIZIZ;
    public List<? extends AbstractC2245151Cu9> LIZJ = C13BV.INSTANCE;
    public int LIZLLL;

    @Override // X.InterfaceC2245241CuI
    public final C2245111Cu5 LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC2245241CuI
    public final String getToken() {
        return this.LIZIZ;
    }

    public final void LIZIZ(InterfaceC2245181CuC interfaceC2245181CuC) {
        this.LIZLLL++;
        int size = this.LIZJ.size();
        int i = this.LIZLLL;
        if (size > i) {
            AbstractC2245151Cu9 abstractC2245151Cu9 = (AbstractC2245151Cu9) ListProtector.get(this.LIZJ, i);
            abstractC2245151Cu9.getClass();
            if (this.LIZ.LJIIIZ) {
                if (interfaceC2245181CuC != null) {
                    interfaceC2245181CuC.LIZIZ(-1, "This task was canceled.", this);
                    return;
                }
                return;
            }
            abstractC2245151Cu9.LIZ(this, interfaceC2245181CuC);
        }
    }

    public C2245161CuA(C2245111Cu5 c2245111Cu5, String str) {
        this.LIZ = c2245111Cu5;
        this.LIZIZ = str;
    }
}
