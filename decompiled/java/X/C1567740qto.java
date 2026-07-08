package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0qto, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1567740qto implements InterfaceC20090813jG, InterfaceC1392705cj {
    public final /* synthetic */ InterfaceC1392705cj LIZ;
    public final /* synthetic */ C1690080u58 LIZIZ;

    @Override // X.InterfaceC1392705cj
    public final float LIZJ(float f) {
        return this.LIZ.LIZJ(f);
    }

    @Override // X.InterfaceC20090813jG
    public final int LIZIZ() {
        return this.LIZIZ.LJIIIIZZ();
    }

    @Override // X.InterfaceC20090813jG
    public final int LIZLLL() {
        return this.LIZIZ.LJII();
    }

    @Override // X.InterfaceC20090813jG
    public final int LJ() {
        C06XG c06xg = (C06XG) C13LP.LJJLIIIJL(this.LIZIZ.LJIIIZ().LJII());
        if (c06xg != null) {
            return c06xg.getIndex();
        }
        return 0;
    }

    @Override // X.InterfaceC20090813jG
    public final int getItemCount() {
        return this.LIZIZ.LJIIIZ().LJFF();
    }

    public C1567740qto(InterfaceC1392705cj interfaceC1392705cj, C1690080u58 c1690080u58) {
        this.LIZIZ = c1690080u58;
        this.LIZ = interfaceC1392705cj;
    }

    @Override // X.InterfaceC20090813jG
    public final int LIZ(int i, int i2) {
        Object obj;
        InterfaceC1564820qp6 interfaceC1564820qp6LJIIIZ = this.LIZIZ.LJIIIZ();
        int iLIZ = 0;
        if (interfaceC1564820qp6LJIIIZ.LJII().isEmpty()) {
            return 0;
        }
        int iLIZLLL = LIZLLL();
        if (i <= LJ() && iLIZLLL <= i) {
            List<C06XG> listLJII = interfaceC1564820qp6LJIIIZ.LJII();
            int size = listLJII.size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    obj = ListProtector.get(listLJII, i3);
                    if (((C06XG) obj).getIndex() == i) {
                        break;
                    }
                    i3++;
                } else {
                    obj = null;
                    break;
                }
            }
            C06XG c06xg = (C06XG) obj;
            if (c06xg != null) {
                iLIZ = c06xg.getOffset();
            }
        } else {
            iLIZ = (C1564800qp4.LIZ(interfaceC1564820qp6LJIIIZ) * (i - LIZLLL())) - LIZIZ();
        }
        return iLIZ + i2;
    }

    @Override // X.InterfaceC20090813jG
    public final void LJFF(int i, int i2) {
        this.LIZIZ.LJIIJJI(i, i2);
    }
}
