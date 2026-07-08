package X;

import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0woT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1795070woT implements InterfaceC1796310wqT {
    public final /* synthetic */ InterfaceC1794840wo6 LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ C1795340wou LIZJ;

    @Override // X.InterfaceC1796310wqT
    public final void LIZIZ() {
        final C1795340wou c1795340wou = this.LIZJ;
        final InterfaceC1794840wo6 interfaceC1794840wo6 = this.LIZ;
        final String str = this.LIZIZ;
        c1795340wou.getClass();
        System.currentTimeMillis();
        C1795090woV c1795090woV = new C1795090woV();
        c1795090woV.LIZ = "inapp";
        c1795340wou.LJIILIIL.LJIIL(c1795090woV.LIZ(), new InterfaceC1796090wq7() { // from class: X.0woR
            @Override // X.InterfaceC1796090wq7
            public final void LJFF(C19885612rG c19885612rG, List<Purchase> list) {
                boolean z;
                ArrayList arrayList = new ArrayList();
                for (Purchase purchase : list) {
                    if (purchase.LIZIZ() == null || !purchase.LIZJ.optBoolean("acknowledged", true)) {
                        arrayList.add(purchase);
                    }
                }
                if (c19885612rG.LIZ == 0) {
                    c1795340wou.LJIIJJI(arrayList);
                }
                InterfaceC1794840wo6 interfaceC1794840wo62 = interfaceC1794840wo6;
                EnumC1791830wjF enumC1791830wjF = EnumC1791830wjF.GOOGLE;
                C1792840wks c1792840wks = new C1792840wks(0, -1, "query success.");
                C1795340wou c1795340wou2 = c1795340wou;
                Boolean bool = Boolean.FALSE;
                c1795340wou2.getClass();
                interfaceC1794840wo62.onQueryFinished(enumC1791830wjF, c1792840wks, C1795340wou.LIZIZ(bool, arrayList), str);
                C1794700wns c1794700wnsLJ = C1794700wns.LJ();
                if (c19885612rG.LIZ == 0) {
                    z = true;
                } else {
                    z = false;
                }
                c1794700wnsLJ.LJFF(c19885612rG.toString(), "inapp", c1795340wou.LJ(), str, z, list);
            }
        });
        C1795090woV c1795090woV2 = new C1795090woV();
        c1795090woV2.LIZ = "subs";
        C1795120woY c1795120woYLIZ = c1795090woV2.LIZ();
        if (c1795340wou.LJIILIIL.LJII("subscriptions").LIZ == 0) {
            c1795340wou.LJIILIIL.LJIIL(c1795120woYLIZ, new InterfaceC1796090wq7() { // from class: X.0woQ
                @Override // X.InterfaceC1796090wq7
                public final void LJFF(C19885612rG c19885612rG, List<Purchase> list) {
                    boolean z;
                    if (c19885612rG.LIZ == 0) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (Purchase purchase : list) {
                            if (!purchase.LIZJ.optBoolean("acknowledged", true)) {
                                arrayList.add(purchase);
                                arrayList2.add(new C1794710wnt(purchase, false));
                            }
                        }
                        C1795360wow.LIZIZ().LIZJ(arrayList2);
                        c1795340wou.LJIIJJI(arrayList);
                        if (arrayList.size() > 0) {
                            ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZLLL().getClass();
                            if (C1795410wp1.LIZJ("live_iap_sub_assemble_exp", 0) == 1) {
                                InterfaceC1794840wo6 interfaceC1794840wo62 = interfaceC1794840wo6;
                                EnumC1791830wjF enumC1791830wjF = EnumC1791830wjF.GOOGLE;
                                C1792840wks c1792840wks = new C1792840wks(0, -1, "query success.");
                                C1795340wou c1795340wou2 = c1795340wou;
                                Boolean bool = Boolean.TRUE;
                                c1795340wou2.getClass();
                                interfaceC1794840wo62.onQueryFinished(enumC1791830wjF, c1792840wks, C1795340wou.LIZIZ(bool, arrayList), str);
                            }
                        }
                    }
                    C1794700wns c1794700wnsLJ = C1794700wns.LJ();
                    if (c19885612rG.LIZ == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1794700wnsLJ.LJFF(c19885612rG.toString(), "subs", c1795340wou.LJ(), str, z, list);
                }
            });
        }
    }

    @Override // X.InterfaceC1796310wqT
    public final void LIZ(C1792840wks c1792840wks) {
        InterfaceC1794840wo6 interfaceC1794840wo6 = this.LIZ;
        if (interfaceC1794840wo6 != null) {
            interfaceC1794840wo6.onQueryFinished(EnumC1791830wjF.GOOGLE, c1792840wks, Collections.emptyList(), this.LIZIZ);
        }
        String string = c1792840wks.toString();
        C1794700wns.LJ().LJFF(string, "BillingSetUpFailed", this.LIZJ.LJ(), this.LIZIZ, false, new ArrayList());
    }

    public C1795070woT(C1795340wou c1795340wou, InterfaceC1794840wo6 interfaceC1794840wo6, String str) {
        this.LIZJ = c1795340wou;
        this.LIZ = interfaceC1794840wo6;
        this.LIZIZ = str;
    }
}
