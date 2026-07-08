package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: X.12y5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19927912y5 {
    public static final /* synthetic */ int LJFF = 0;
    public C19888812rm LIZ;
    public C19889012ro LIZIZ;
    public C19888812rm LIZJ;
    public List<AbstractC19922812xG> LIZLLL;
    public List<C19927612y2> LJ;

    static {
        new C19918612wa().LIZJ();
    }

    public final int hashCode() {
        return ((((((((Objects.hashCode(this.LIZ) + 31) * 31) + Objects.hashCode(this.LIZIZ)) * 31) + Objects.hashCode(this.LIZJ)) * 31) + Objects.hashCode(this.LIZLLL)) * 31) + Objects.hashCode(this.LJ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19927912y5)) {
            return false;
        }
        C19927912y5 c19927912y5 = (C19927912y5) obj;
        if (Objects.equals(this.LIZ, c19927912y5.LIZ) && Objects.equals(this.LIZIZ, c19927912y5.LIZIZ) && Objects.equals(this.LIZJ, c19927912y5.LIZJ) && Objects.equals(this.LIZLLL, c19927912y5.LIZLLL) && Objects.equals(this.LJ, c19927912y5.LJ)) {
            return true;
        }
        return false;
    }

    public final void LIZ(int i, InterfaceC19361110or interfaceC19361110or) {
        interfaceC19361110or.getClass();
        if (EnumC19361010oq.ASCENDING == EnumC19361010oq.DESCENDING) {
            for (int size = this.LIZLLL.size() - 1; size >= 0; size--) {
                ((C19929012yG) interfaceC19361110or).LJIILJJIL(i, ListProtector.get(this.LIZLLL, size));
            }
            return;
        }
        for (int i2 = 0; i2 < this.LIZLLL.size(); i2++) {
            ((C19929012yG) interfaceC19361110or).LJIILJJIL(i, ListProtector.get(this.LIZLLL, i2));
        }
    }

    public final void LIZIZ(int i, InterfaceC19361110or interfaceC19361110or) {
        C19929012yG c19929012yG = (C19929012yG) interfaceC19361110or;
        c19929012yG.LJIIL(i, false, this.LIZ);
        c19929012yG.LJFF(i, false, this.LIZIZ);
        c19929012yG.LJII(i, false, this.LIZJ);
        List<AbstractC19922812xG> list = this.LIZLLL;
        for (int i2 = 0; i2 < list.size(); i2++) {
            c19929012yG.LIZ.LJIJI(i, (AbstractC19922812xG) ListProtector.get(list, i2));
        }
        for (int i3 = 0; i3 < this.LJ.size(); i3++) {
            c19929012yG.LIZ.LJJIJIIJIL(i, 3);
            ((C19927612y2) ListProtector.get(this.LJ, i3)).LIZJ(c19929012yG);
            c19929012yG.LIZ.LJJIJIIJIL(i, 4);
        }
    }
}
