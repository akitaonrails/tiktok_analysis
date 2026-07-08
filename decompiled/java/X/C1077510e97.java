package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS252S0000000_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0e97, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077510e97 extends AbstractC1539010q9T {
    public final int $t;

    @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
    public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
        switch (this.$t) {
            case 0:
                LJJJLL$0(this, interfaceC1531560pxS);
                break;
            case 1:
                LJJJLL$1(this, interfaceC1531560pxS);
                break;
            case 2:
                LJJJLL$2(this, interfaceC1531560pxS);
                break;
            default:
                super.LJJJLL(interfaceC1531560pxS);
                break;
        }
    }

    public C1077510e97(int i) {
        this.$t = i;
    }

    public static final void LJJJLL$0(C1077510e97 c1077510e97, InterfaceC1531560pxS interfaceC1531560pxS) {
        if (!(interfaceC1531560pxS instanceof C1541480qDS)) {
            return;
        }
        C1541480qDS c1541480qDS = (C1541480qDS) interfaceC1531560pxS;
        final InterfaceC1047700dN2 interfaceC1047700dN2 = c1541480qDS.LJIIJJI;
        if (interfaceC1047700dN2 != null) {
            c1541480qDS.LJIIJJI = new InterfaceC1047700dN2() { // from class: X.0dN1
                @Override // X.InterfaceC1047700dN2
                public final C1040730dBn LIZ(C1040730dBn c1040730dBn) {
                    LinkedHashMap linkedHashMap;
                    C1040730dBn c1040730dBnLIZ;
                    InterfaceC1047700dN2 interfaceC1047700dN22 = interfaceC1047700dN2;
                    if (interfaceC1047700dN22 != null && (c1040730dBnLIZ = interfaceC1047700dN22.LIZ(c1040730dBn)) != null) {
                        c1040730dBn = c1040730dBnLIZ;
                    }
                    Map<String, String> map = c1040730dBn.LIZIZ;
                    if (map != null) {
                        linkedHashMap = new LinkedHashMap(map);
                        linkedHashMap.put("referer", "https://www.tiktok.com");
                        linkedHashMap.put("x-has-set-referer", "1");
                    } else {
                        linkedHashMap = null;
                    }
                    c1040730dBn.LIZIZ = linkedHashMap;
                    return c1040730dBn;
                }
            };
        } else {
            c1541480qDS.LJIIJJI = new InterfaceC1047700dN2() { // from class: X.0dN0
                @Override // X.InterfaceC1047700dN2
                public final C1040730dBn LIZ(C1040730dBn c1040730dBn) {
                    LinkedHashMap linkedHashMap;
                    Map<String, String> map = c1040730dBn.LIZIZ;
                    if (map != null) {
                        linkedHashMap = new LinkedHashMap(map);
                        linkedHashMap.put("referer", "https://www.tiktok.com");
                        linkedHashMap.put("x-has-set-referer", "1");
                    } else {
                        linkedHashMap = null;
                    }
                    c1040730dBn.LIZIZ = linkedHashMap;
                    return c1040730dBn;
                }
            };
        }
    }

    public static final void LJJJLL$1(C1077510e97 c1077510e97, InterfaceC1531560pxS interfaceC1531560pxS) {
        C1541480qDS c1541480qDS;
        if ((interfaceC1531560pxS instanceof C1541480qDS) && (c1541480qDS = (C1541480qDS) interfaceC1531560pxS) != null) {
            new C1524120plS();
            c1541480qDS.LJII(C1524120plS.class, AFwS252S0000000_16.get$arr$(743));
        }
    }

    public static final void LJJJLL$2(C1077510e97 c1077510e97, InterfaceC1531560pxS interfaceC1531560pxS) {
        if (interfaceC1531560pxS.getType() == EnumC1067640dtC.LYNX) {
            C1067460dsu c1067460dsu = new C1067460dsu();
            c1067460dsu.LIZ("initial_data", new JSONObject(C1105360es2.LIZIZ));
            ((C1537910q7h) interfaceC1531560pxS).LJIJJLI(c1067460dsu);
        }
    }
}
