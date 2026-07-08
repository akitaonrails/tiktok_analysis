package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jnD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294570jnD implements InterfaceC1295810jpD, InterfaceC1294590jnF {
    public final boolean LIZ;
    public final List<InterfaceC1294590jnF> LIZIZ = new ArrayList();
    public final EnumC994250byp LIZJ;
    public final C1295230joH LIZLLL;
    public final C1295230joH LJ;
    public final C1295230joH LJFF;

    @Override // X.InterfaceC1294590jnF
    public final void LIZJ() {
        for (int i = 0; i < ((ArrayList) this.LIZIZ).size(); i++) {
            ((InterfaceC1294590jnF) ListProtector.get(this.LIZIZ, i)).LIZJ();
        }
    }

    @Override // X.InterfaceC1295810jpD
    public final void LIZLLL(List<InterfaceC1295810jpD> list, List<InterfaceC1295810jpD> list2) {
    }

    public final void LIZIZ(InterfaceC1294590jnF interfaceC1294590jnF) {
        ((ArrayList) this.LIZIZ).add(interfaceC1294590jnF);
    }

    public C1294570jnD(AbstractC1295030jnx abstractC1295030jnx, C1294560jnC c1294560jnC) {
        this.LIZ = c1294560jnC.LJFF;
        this.LIZJ = c1294560jnC.LIZIZ;
        AbstractC1295190joD<Float, Float> abstractC1295190joDLIZ = c1294560jnC.LIZJ.LIZ();
        this.LIZLLL = (C1295230joH) abstractC1295190joDLIZ;
        AbstractC1295190joD<Float, Float> abstractC1295190joDLIZ2 = c1294560jnC.LIZLLL.LIZ();
        this.LJ = (C1295230joH) abstractC1295190joDLIZ2;
        AbstractC1295190joD<Float, Float> abstractC1295190joDLIZ3 = c1294560jnC.LJ.LIZ();
        this.LJFF = (C1295230joH) abstractC1295190joDLIZ3;
        abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ);
        abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ2);
        abstractC1295030jnx.LIZIZ(abstractC1295190joDLIZ3);
        abstractC1295190joDLIZ.LIZ(this);
        abstractC1295190joDLIZ2.LIZ(this);
        abstractC1295190joDLIZ3.LIZ(this);
    }
}
