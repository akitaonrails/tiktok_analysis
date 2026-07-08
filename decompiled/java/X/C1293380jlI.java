package X;

import android.graphics.Path;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jlI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293380jlI implements InterfaceC1292610jk3, InterfaceC1293690jln {
    public final Path LIZ = new Path();
    public final C1291430ji9 LIZIZ;
    public final C1293300jlA LIZJ;
    public boolean LIZLLL;
    public C1293500jlU LJ;

    @Override // X.InterfaceC1293690jln
    public final void LIZJ() {
        this.LIZLLL = false;
        this.LIZIZ.invalidateSelf();
    }

    @Override // X.InterfaceC1292610jk3
    public final Path getPath() {
        if (this.LIZLLL) {
            return this.LIZ;
        }
        this.LIZ.reset();
        this.LIZ.set(LJ());
        this.LIZ.setFillType(Path.FillType.EVEN_ODD);
        C1293420jlM.LIZIZ(this.LIZ, this.LJ);
        this.LIZLLL = true;
        return this.LIZ;
    }

    @Override // X.InterfaceC1291780jii
    public final void LIZLLL(List<InterfaceC1291780jii> list, List<InterfaceC1291780jii> list2) {
        for (int i = 0; i < ((ArrayList) list).size(); i++) {
            InterfaceC1291780jii interfaceC1291780jii = (InterfaceC1291780jii) ListProtector.get(list, i);
            if (interfaceC1291780jii instanceof C1293500jlU) {
                C1293500jlU c1293500jlU = (C1293500jlU) interfaceC1291780jii;
                if (c1293500jlU.LIZIZ == EnumC994260byq.Simultaneously) {
                    this.LJ = c1293500jlU;
                    c1293500jlU.LIZIZ(this);
                }
            }
        }
    }

    public C1293380jlI(C1291430ji9 c1291430ji9, AbstractC1292630jk5 abstractC1292630jk5, C1293370jlH c1293370jlH) {
        this.LIZIZ = c1291430ji9;
        AbstractC1293310jlB<C1293350jlF, Path> abstractC1293310jlBLIZ = c1293370jlH.LIZJ.LIZ();
        this.LIZJ = (C1293300jlA) abstractC1293310jlBLIZ;
        abstractC1292630jk5.LIZIZ(abstractC1293310jlBLIZ);
        abstractC1293310jlBLIZ.LIZ(this);
    }
}
