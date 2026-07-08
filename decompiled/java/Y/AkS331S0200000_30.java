package Y;

import X.C1331660kl2;
import X.C2344809Gs;
import X.C2427009fA;
import X.EnumC1335310kqv;
import X.EnumC1335420kr6;
import X.InterfaceC1487280oo2;
import X.InterfaceC345370DgN;
import com.ss.android.ugc.aweme.setting.page.diskmanager.compose.DiskManagerSettingsVM;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class AkS331S0200000_30 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS331S0200000_30 akS331S0200000_30, Object obj) {
        C2344809Gs.LJFF("clear-cache", "start clear temp cache with disk manager");
        C1331660kl2.LIZJ().LJIILIIL();
        ((DiskManagerSettingsVM) akS331S0200000_30.l0).getClass();
        List<InterfaceC345370DgN> listLJIIJJI = C2427009fA.LJIIJJI();
        ArrayList<InterfaceC345370DgN> arrayList = new ArrayList();
        for (Object obj2 : (ArrayList) listLJIIJJI) {
            if (EnumC1335420kr6.CACHE == ((InterfaceC345370DgN) obj2).LIZLLL()) {
                arrayList.add(obj2);
            }
        }
        EnumC1335310kqv enumC1335310kqv = (EnumC1335310kqv) akS331S0200000_30.l1;
        for (InterfaceC345370DgN interfaceC345370DgN : arrayList) {
            if (enumC1335310kqv == EnumC1335310kqv.EXTREME_LOW) {
                interfaceC345370DgN.LJ(true);
            } else {
                interfaceC345370DgN.LJII(true);
            }
        }
        C2344809Gs.LJFF("clear-cache", "finish clear temp cache with disk manager");
        return "";
    }

    public static final Object apply$1(AkS331S0200000_30 akS331S0200000_30, Object obj) {
        C2344809Gs.LJFF("clear-cache", "start clear resource cache with disk manager");
        ((DiskManagerSettingsVM) akS331S0200000_30.l0).getClass();
        List<InterfaceC345370DgN> listLJIIJJI = C2427009fA.LJIIJJI();
        ArrayList<InterfaceC345370DgN> arrayList = new ArrayList();
        for (Object obj2 : (ArrayList) listLJIIJJI) {
            if (EnumC1335420kr6.RESOURCE == ((InterfaceC345370DgN) obj2).LIZLLL()) {
                arrayList.add(obj2);
            }
        }
        EnumC1335310kqv enumC1335310kqv = (EnumC1335310kqv) akS331S0200000_30.l1;
        for (InterfaceC345370DgN interfaceC345370DgN : arrayList) {
            if (enumC1335310kqv == EnumC1335310kqv.EXTREME_LOW) {
                interfaceC345370DgN.LJ(true);
            } else {
                interfaceC345370DgN.LJII(true);
            }
        }
        C2344809Gs.LJFF("clear-cache", "finish clear resource cache with disk manager");
        return "";
    }

    public AkS331S0200000_30(DiskManagerSettingsVM diskManagerSettingsVM, EnumC1335310kqv enumC1335310kqv, int i) {
        this.$t = i;
        this.l0 = diskManagerSettingsVM;
        this.l1 = enumC1335310kqv;
    }
}
