package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jlU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293500jlU implements InterfaceC1291780jii, InterfaceC1293690jln {
    public final List<InterfaceC1293690jln> LIZ = new ArrayList();
    public final EnumC994260byq LIZIZ;
    public final C1293040jkk LIZJ;
    public final C1293040jkk LIZLLL;
    public final C1293040jkk LJ;

    @Override // X.InterfaceC1293690jln
    public final void LIZJ() {
        for (int i = 0; i < ((ArrayList) this.LIZ).size(); i++) {
            ((InterfaceC1293690jln) ListProtector.get(this.LIZ, i)).LIZJ();
        }
    }

    @Override // X.InterfaceC1291780jii
    public final void LIZLLL(List<InterfaceC1291780jii> list, List<InterfaceC1291780jii> list2) {
    }

    public final void LIZIZ(InterfaceC1293690jln interfaceC1293690jln) {
        ((ArrayList) this.LIZ).add(interfaceC1293690jln);
    }

    public C1293500jlU(AbstractC1292630jk5 abstractC1292630jk5, C1293520jlW c1293520jlW) {
        this.LIZIZ = c1293520jlW.LIZIZ;
        AbstractC1293310jlB<Float, Float> abstractC1293310jlBLIZ = c1293520jlW.LIZJ.LIZ();
        this.LIZJ = (C1293040jkk) abstractC1293310jlBLIZ;
        AbstractC1293310jlB<Float, Float> abstractC1293310jlBLIZ2 = c1293520jlW.LIZLLL.LIZ();
        this.LIZLLL = (C1293040jkk) abstractC1293310jlBLIZ2;
        AbstractC1293310jlB<Float, Float> abstractC1293310jlBLIZ3 = c1293520jlW.LJ.LIZ();
        this.LJ = (C1293040jkk) abstractC1293310jlBLIZ3;
        abstractC1292630jk5.LIZIZ(abstractC1293310jlBLIZ);
        abstractC1292630jk5.LIZIZ(abstractC1293310jlBLIZ2);
        abstractC1292630jk5.LIZIZ(abstractC1293310jlBLIZ3);
        abstractC1293310jlBLIZ.LIZ(this);
        abstractC1293310jlBLIZ2.LIZ(this);
        abstractC1293310jlBLIZ3.LIZ(this);
    }
}
