package X;

import com.bytedance.android.livesdk.iap.IapProductDetail;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0wjq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1792200wjq extends C1792210wjr implements InterfaceC1794730wnv {
    public static final /* synthetic */ int LJ = 0;
    public final InterfaceC1791670wiz LIZ;
    public final InterfaceC1791300wiO LIZIZ;
    public final InterfaceC1791700wj2 LIZJ;
    public final InterfaceC518110KTp LIZLLL;

    @Override // X.InterfaceC1794730wnv
    public final void LIZ() {
    }

    @Override // X.InterfaceC1794730wnv
    public final /* synthetic */ void LIZJ(EnumC1791830wjF enumC1791830wjF, String str) {
    }

    @Override // X.InterfaceC1794730wnv
    public final /* synthetic */ void LIZLLL(boolean z) {
    }

    @Override // X.InterfaceC1794730wnv
    public final /* synthetic */ void LJII(EnumC1791830wjF enumC1791830wjF, C1792840wks c1792840wks) {
    }

    @Override // X.InterfaceC1794730wnv
    public final void LJ(C1792840wks c1792840wks, List<AbstractC1791620wiu> list) {
        C518160KTu c518160KTu = new C518160KTu();
        C1791760wj8.LIZ(c518160KTu, c1792840wks);
        if (c1792840wks != null && c1792840wks.LIZ == 0 && !C086I.LIZIZ(list)) {
            LJIIL(c518160KTu, list);
        } else {
            LJIIJJI(4, c518160KTu, c1792840wks, list);
        }
    }

    @Override // X.InterfaceC1794730wnv
    public final void LJI(C1792840wks c1792840wks, C1793950wmf c1793950wmf) {
        String str;
        if (c1792840wks != null) {
            C1792170wjn c1792170wjn = c1792840wks.LJIIJJI;
        }
        C518140KTs c518140KTs = new C518140KTs();
        C1791760wj8.LIZ(c518140KTs, c1792840wks);
        if (c1792840wks != null && c1793950wmf != null && c1792840wks.LIZ == 0 && (str = c1793950wmf.LIZIZ) != null && str.length() != 0) {
            c518140KTs.LIZ = 1;
            LJFF(c518140KTs, c1793950wmf, true);
        } else {
            c518140KTs.LIZ = 0;
            LIZIZ(c518140KTs, c1792840wks, c1793950wmf, true);
        }
    }

    @Override // X.InterfaceC1794730wnv
    public final void LJIIIIZZ(C1792840wks c1792840wks, List list) {
        C518090KTn c518090KTn = new C518090KTn();
        C1791760wj8.LIZ(c518090KTn, c1792840wks);
        String str = "";
        if (c1792840wks != null && list != null && c1792840wks.LIZIZ()) {
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AbstractC1794600wni abstractC1794600wni = (AbstractC1794600wni) it2.next();
                String str2 = abstractC1794600wni.LIZJ;
                String str3 = abstractC1794600wni.LJFF;
                abstractC1794600wni.LJ();
                map.put(str2, new C515620KKa(str3));
                if (map2.size() < 5) {
                    String str4 = abstractC1794600wni.LIZJ;
                    String str5 = abstractC1794600wni.LJFF;
                    abstractC1794600wni.LJ();
                    map2.put(str4, new C515620KKa(str5));
                }
            }
            c518090KTn.LJIIJ = map;
            c518090KTn.LIZ = 1;
            HashMap map3 = new HashMap();
            map3.put("item_size", Integer.valueOf(map.size()));
            String strLIZLLL = C1516000pYM.LIZLLL(map2);
            if (strLIZLLL != null) {
                str = strLIZLLL;
            }
            map3.put("subs_history_items", str);
            C1796540wqq.LIZ.LIZ(EnumC1796260wqO.BOTH, "livesdk_wallet_recharge_query_subscription_history_success", C2348809Ig.LIZLLL(map3), null, null, null, "wallet");
            InterfaceC518110KTp interfaceC518110KTp = this.LIZLLL;
            if (interfaceC518110KTp != null) {
                interfaceC518110KTp.LIZ(c518090KTn);
                return;
            }
            return;
        }
        c518090KTn.LIZ = 0;
        int i = c518090KTn.LIZIZ;
        int i2 = c518090KTn.LIZJ;
        String str6 = c518090KTn.LJFF;
        HashMap map4 = new HashMap();
        map4.put("error_code", Integer.valueOf(i));
        map4.put("detail_code", Integer.valueOf(i2));
        if (str6 != null) {
            str = str6;
        }
        map4.put("error_message", str);
        C1796540wqq.LIZ.LIZ(EnumC1796260wqO.BOTH, "livesdk_wallet_recharge_query_subscription_history_failed", C2348809Ig.LIZLLL(map4), null, null, null, "wallet");
        InterfaceC518110KTp interfaceC518110KTp2 = this.LIZLLL;
        if (interfaceC518110KTp2 != null) {
            interfaceC518110KTp2.onFailure();
        }
    }

    @Override // X.InterfaceC1794730wnv
    public final void LJIIIZ(C1792840wks c1792840wks, C1793950wmf c1793950wmf) {
        HashMap<String, String> map;
        C1791850wjH c1791850wjH;
        String str;
        HashMap<String, String> map2;
        if (c1792840wks != null) {
            map = c1792840wks.LJFF;
        } else {
            map = null;
        }
        if (C1797030wrd.LIZIZ) {
            if (map == null) {
                map = new HashMap<>();
            }
            C1797030wrd.LJIILJJIL = map;
        }
        if (c1792840wks != null) {
            C1792170wjn c1792170wjn = c1792840wks.LJIIJJI;
        }
        C518140KTs c518140KTs = new C518140KTs();
        if (c1792840wks != null && (map2 = c1792840wks.LJFF) != null) {
            c518140KTs.LJI.putAll(map2);
        }
        if (c1792840wks != null && c1793950wmf != null && c1792840wks.LIZ == 0 && (str = c1793950wmf.LIZIZ) != null && str.length() != 0) {
            c518140KTs.LIZ = 1;
            C1791760wj8.LIZ(c518140KTs, c1792840wks);
            LJFF(c518140KTs, c1793950wmf, false);
            return;
        }
        c518140KTs.LIZ = 0;
        C1791760wj8.LIZ(c518140KTs, c1792840wks);
        if (c1792840wks != null && (c1791850wjH = c1792840wks.LJIIIIZZ) != null) {
            c518140KTs.LJIIIIZZ = Integer.valueOf(c1791850wjH.LIZ.getValue());
            c518140KTs.LJIIIZ = c1791850wjH.LIZIZ;
        }
        LIZIZ(c518140KTs, c1792840wks, c1793950wmf, false);
    }

    public final void LJIIL(C518160KTu c518160KTu, List list) {
        LinkedHashMap linkedHashMap;
        c518160KTu.LIZ = 1;
        int i = 16;
        if (list != null) {
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            linkedHashMap = new LinkedHashMap(iLIZIZ);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AbstractC1791620wiu abstractC1791620wiu = (AbstractC1791620wiu) it2.next();
                Pair pair = new Pair(abstractC1791620wiu.LIZ, C1791610wit.LIZ(abstractC1791620wiu));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
        } else {
            linkedHashMap = null;
        }
        C518150KTt c518150KTt = new C518150KTt(true, linkedHashMap, null, 4);
        if (list != null) {
            int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
            if (iLIZIZ2 >= 16) {
                i = iLIZIZ2;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                AbstractC1791620wiu abstractC1791620wiu2 = (AbstractC1791620wiu) it3.next();
                Pair pair2 = new Pair(abstractC1791620wiu2.LIZ, C1791610wit.LIZ(abstractC1791620wiu2));
                linkedHashMap2.put(pair2.getFirst(), pair2.getSecond());
            }
            c518160KTu.LJIIJ = linkedHashMap2;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList.add(C1791610wit.LIZ((AbstractC1791620wiu) it4.next()));
            }
            ((InterfaceC1321570kUl) C1287270jbR.LIZ.getValue()).LIZJ(EnumC1803160x1W.USE, C13BV.INSTANCE, arrayList);
        }
        Map<String, IapProductDetail> map = c518160KTu.LJIIJ;
        if (map != null) {
            map.get("product_id");
        }
        InterfaceC1791670wiz interfaceC1791670wiz = this.LIZ;
        if (interfaceC1791670wiz != null) {
            interfaceC1791670wiz.LIZLLL(c518160KTu);
        }
        InterfaceC1791300wiO interfaceC1791300wiO = this.LIZIZ;
        if (interfaceC1791300wiO != null) {
            interfaceC1791300wiO.LIZLLL(c518150KTt);
        }
    }

    public final void LJFF(C518140KTs c518140KTs, C1793950wmf c1793950wmf, boolean z) {
        c518140KTs.LJIIJJI = c1793950wmf.LIZIZ;
        c518140KTs.LJIIJ = c1793950wmf.LIZ;
        c518140KTs.LIZ = 1;
        HashMap map = new HashMap();
        String str = c1793950wmf.LIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        map.put("sku_id", str);
        String str3 = c1793950wmf.LIZ;
        if (str3 == null) {
            str3 = "";
        }
        map.put("product_id", str3);
        String str4 = c1793950wmf.LIZJ;
        if (str4 == null) {
            str4 = "";
        }
        map.put("channel_order_id", str4);
        String str5 = c1793950wmf.LIZIZ;
        if (str5 == null) {
            str5 = "";
        }
        map.put("order_id", str5);
        String str6 = c1793950wmf.LIZLLL;
        if (str6 != null) {
            str2 = str6;
        }
        map.put("user_id", str2);
        map.put("quantity", Integer.valueOf(c1793950wmf.LJ));
        if (z) {
            C1796530wqp.LJIIIZ(c1793950wmf.LIZIZ, map);
        } else {
            C1796530wqp.LJII(c1793950wmf.LIZIZ, map);
        }
        InterfaceC1791700wj2 interfaceC1791700wj2 = this.LIZJ;
        if (interfaceC1791700wj2 != null) {
            interfaceC1791700wj2.LIZIZ(c518140KTs);
        }
    }

    @Override // X.InterfaceC1794730wnv
    public final void LJIIJ(EnumC1791830wjF enumC1791830wjF, C1792840wks c1792840wks, List<AbstractC1791620wiu> list) {
        C518160KTu c518160KTu = new C518160KTu();
        C1791760wj8.LIZ(c518160KTu, c1792840wks);
        if (c1792840wks != null && c1792840wks.LIZ == 0 && !C086I.LIZIZ(list)) {
            LJIIL(c518160KTu, list);
        } else {
            LJIIJJI(1, c518160KTu, c1792840wks, list);
        }
    }

    public final void LIZIZ(C518140KTs c518140KTs, C1792840wks c1792840wks, C1793950wmf c1793950wmf, boolean z) {
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        int i3;
        String str4;
        String str5;
        int i4;
        String str6;
        String str7;
        HashMap map = new HashMap();
        String str8 = "";
        if (c1793950wmf == null || (str = c1793950wmf.LIZIZ) == null) {
            str = "";
        }
        map.put("order_id", str);
        if (c1793950wmf == null || (str2 = c1793950wmf.LIZ) == null) {
            str2 = "";
        }
        map.put("product_id", str2);
        if (c1793950wmf == null || (str3 = c1793950wmf.LIZJ) == null) {
            str3 = "";
        }
        map.put("channel_order_id", str3);
        if (c1793950wmf != null && (str7 = c1793950wmf.LIZ) != null) {
            str8 = str7;
        }
        map.put("sku_id", str8);
        if (c1793950wmf != null) {
            i = c1793950wmf.LJ;
        } else {
            i = 1;
        }
        map.put("quantity", Integer.valueOf(i));
        if (c1792840wks != null) {
            i2 = c1792840wks.LIZ;
        } else {
            i2 = 32;
        }
        if (c1792840wks != null) {
            i3 = c1792840wks.LIZIZ;
        } else {
            i3 = -1;
        }
        if (c1792840wks == null || (str4 = c1792840wks.LJ) == null) {
            str4 = "create pipo order fail";
        }
        String str9 = null;
        if (c1792840wks != null) {
            str9 = c1792840wks.LJI;
            str5 = c1792840wks.LJII;
        } else {
            str5 = null;
        }
        if (z) {
            C1796530wqp.LJIIIIZZ(i2, i3, str4, map);
        } else {
            if (c1793950wmf != null && (str6 = c1793950wmf.LIZIZ) != null && str6.length() == 0) {
                i4 = 1;
            } else {
                i4 = 2;
            }
            C1796530wqp.LJI(i2, i3, i4, str4, str9, str5, map);
        }
        String strValueOf = String.valueOf(i2);
        String strValueOf2 = String.valueOf(i3);
        if (C1797030wrd.LIZIZ) {
            C1803540x28.LJII(strValueOf, strValueOf2, str4);
        }
        InterfaceC1791700wj2 interfaceC1791700wj2 = this.LIZJ;
        if (interfaceC1791700wj2 != null) {
            interfaceC1791700wj2.LIZJ(c518140KTs);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(int r7, X.C518160KTu r8, X.C1792840wks r9, java.util.List<X.AbstractC1791620wiu> r10) {
        /*
            r6 = this;
            r4 = 0
            r8.LIZ = r4
            if (r9 == 0) goto L19
            X.0wjH r1 = r9.LJIIIIZZ
            if (r1 == 0) goto L19
            X.0wja r0 = r1.LIZ
            int r0 = r0.getValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.LJIIIIZZ = r0
            java.lang.String r0 = r1.LIZIZ
            r8.LJIIIZ = r0
        L19:
            r5 = -1
            r1 = 21
            if (r9 == 0) goto L66
            int r0 = r9.LIZ
            if (r0 != 0) goto L5c
            boolean r0 = X.C086I.LIZIZ(r10)
            if (r0 == 0) goto L5c
            java.lang.String r3 = "query pipo product empty"
        L2a:
            r0 = 1
            if (r7 != r0) goto L58
            X.C1796530wqp.LIZ(r1, r5, r3)
        L30:
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            boolean r0 = X.C1797030wrd.LIZIZ
            if (r0 == 0) goto L3f
            X.C1803540x28.LJII(r2, r1, r3)
        L3f:
            X.0wiz r0 = r6.LIZ
            if (r0 == 0) goto L46
            r0.LJ(r8)
        L46:
            X.0wiO r3 = r6.LIZIZ
            if (r3 == 0) goto L57
            X.0KTt r2 = new X.0KTt
            X.0KQW r1 = X.C1792030wjZ.LIZIZ(r8)
            r0 = 0
            r2.<init>(r4, r0, r1)
            r3.LIZLLL(r2)
        L57:
            return
        L58:
            X.C1796530wqp.LIZJ(r1, r5, r3)
            goto L30
        L5c:
            int r0 = r9.LIZ
            if (r0 == 0) goto L66
            int r5 = r9.LIZIZ
            java.lang.String r3 = r9.LJ
            r1 = r0
            goto L2a
        L66:
            java.lang.String r3 = "query pipo product null"
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1792200wjq.LJIIJJI(int, X.0KTu, X.0wks, java.util.List):void");
    }

    public C1792200wjq(C1791660wiy c1791660wiy, C1791590wir c1791590wir, InterfaceC1791700wj2 interfaceC1791700wj2, InterfaceC518110KTp interfaceC518110KTp, int i) {
        c1791660wiy = (i & 1) != 0 ? null : c1791660wiy;
        c1791590wir = (i & 2) != 0 ? null : c1791590wir;
        interfaceC1791700wj2 = (i & 4) != 0 ? null : interfaceC1791700wj2;
        interfaceC518110KTp = (i & 8) != 0 ? null : interfaceC518110KTp;
        this.LIZ = c1791660wiy;
        this.LIZIZ = c1791590wir;
        this.LIZJ = interfaceC1791700wj2;
        this.LIZLLL = interfaceC518110KTp;
    }
}
