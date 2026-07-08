package X;

import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0woS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1795060woS implements InterfaceC1796310wqT {
    public final /* synthetic */ C1795120woY LIZ;
    public final /* synthetic */ InterfaceC1794730wnv LIZIZ;
    public final /* synthetic */ C1795340wou LIZJ;

    @Override // X.InterfaceC1796310wqT
    public final void LIZIZ() {
        this.LIZJ.LJIILIIL.LJIIL(this.LIZ, new InterfaceC1796090wq7() { // from class: X.0woP
            @Override // X.InterfaceC1796090wq7
            public final void LJFF(C19885612rG c19885612rG, List<Purchase> list) {
                if (c19885612rG.LIZ == 0) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<Purchase> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new C1794710wnt(it2.next(), true));
                    }
                    C1795360wow.LIZIZ().LIZJ(arrayList);
                    C1792840wks c1792840wks = new C1792840wks(0, -1, "query has subscription success in google service");
                    InterfaceC1794450wnT interfaceC1794450wnTLIZIZ = ((C1794630wnl) C1794630wnl.LIZLLL()).LIZIZ();
                    EnumC1791830wjF enumC1791830wjF = EnumC1791830wjF.GOOGLE;
                    ((C1794650wnn) interfaceC1794450wnTLIZIZ).LJFF(c1792840wks, this.LIZ.LIZIZ, enumC1791830wjF, arrayList);
                    ((C1794640wnm) ((C1794630wnl) C1794630wnl.LIZLLL()).LIZJ()).LJIIJJI(enumC1791830wjF, c1792840wks, arrayList);
                    return;
                }
                C1792840wks c1792840wksLIZ = C1795020woO.LIZ(c19885612rG);
                InterfaceC1794450wnT interfaceC1794450wnTLIZIZ2 = ((C1794630wnl) C1794630wnl.LIZLLL()).LIZIZ();
                EnumC1791830wjF enumC1791830wjF2 = EnumC1791830wjF.GOOGLE;
                ((C1794650wnn) interfaceC1794450wnTLIZIZ2).LJFF(c1792840wksLIZ, this.LIZ.LIZIZ, enumC1791830wjF2, null);
                ((C1794640wnm) ((C1794630wnl) C1794630wnl.LIZLLL()).LIZJ()).LJIIJJI(enumC1791830wjF2, c1792840wksLIZ, null);
            }
        });
    }

    @Override // X.InterfaceC1796310wqT
    public final void LIZ(C1792840wks c1792840wks) {
        InterfaceC1794450wnT interfaceC1794450wnTLIZIZ = ((C1794630wnl) C1794630wnl.LIZLLL()).LIZIZ();
        EnumC1791830wjF enumC1791830wjF = EnumC1791830wjF.GOOGLE;
        ((C1794650wnn) interfaceC1794450wnTLIZIZ).LJFF(c1792840wks, this.LIZIZ, enumC1791830wjF, null);
        ((C1794640wnm) ((C1794630wnl) C1794630wnl.LIZLLL()).LIZJ()).LJIIJJI(enumC1791830wjF, c1792840wks, null);
    }

    public C1795060woS(C1795340wou c1795340wou, C1795120woY c1795120woY, InterfaceC1794730wnv interfaceC1794730wnv) {
        this.LIZJ = c1795340wou;
        this.LIZ = c1795120woY;
        this.LIZIZ = interfaceC1794730wnv;
    }
}
