package X;

import com.bytedance.android.livesdk.livesetting.other.SlardarSampleSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletLoadingIndicatorSetting;
import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0wqj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1796470wqj implements InterfaceC1794730wnv, InterfaceC1796900wrQ {
    public InterfaceC1796910wrR LIZ;
    public boolean LIZIZ = true;

    @Override // X.InterfaceC1794730wnv
    public final /* synthetic */ void LIZJ(EnumC1791830wjF enumC1791830wjF, String str) {
    }

    @Override // X.InterfaceC1796900wrQ
    public final void LJFF() {
        this.LIZ = null;
    }

    @Override // X.InterfaceC1794730wnv
    public final /* synthetic */ void LJII(EnumC1791830wjF enumC1791830wjF, C1792840wks c1792840wks) {
    }

    @Override // X.InterfaceC1794730wnv
    public final /* synthetic */ void LJIIIIZZ(C1792840wks c1792840wks, List list) {
    }

    @Override // X.InterfaceC1794730wnv
    public final void LIZ() {
        InterfaceC1796910wrR interfaceC1796910wrR;
        if (!LiveWalletLoadingIndicatorSetting.INSTANCE.getValue() || (interfaceC1796910wrR = this.LIZ) == null) {
            return;
        }
        interfaceC1796910wrR.LJIIJ(true);
    }

    @Override // X.InterfaceC1796900wrQ
    public final InterfaceC1796910wrR LIZIZ() {
        return this.LIZ;
    }

    public C1796470wqj(InterfaceC1796910wrR interfaceC1796910wrR) {
        this.LIZ = interfaceC1796910wrR;
    }

    @Override // X.InterfaceC1794730wnv
    public final void LIZLLL(boolean z) {
        InterfaceC1796910wrR interfaceC1796910wrR = this.LIZ;
        if (interfaceC1796910wrR != null) {
            interfaceC1796910wrR.LJIIJ(z);
        }
    }

    @Override // X.InterfaceC1794730wnv
    public void LJ(C1792840wks c1792840wks, List<? extends AbstractC1791620wiu> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        LJIILL(this.LIZ, c1792840wks, list);
    }

    @Override // X.InterfaceC1794730wnv
    public void LJI(C1792840wks c1792840wks, C1793950wmf c1793950wmf) {
        LJIIJJI(this.LIZ, c1792840wks, c1793950wmf);
    }

    @Override // X.InterfaceC1794730wnv
    public void LJIIIZ(C1792840wks c1792840wks, C1793950wmf c1793950wmf) {
        HashMap<String, String> map;
        String str;
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
        C474010IiN.LIZIZ(EnumC474020IiO.IAP_CALLBACK);
        LJIILIIL(this.LIZ, c1792840wks, c1793950wmf);
        if (c1793950wmf != null && (str = c1793950wmf.LIZIZ) != null) {
            C1803660x2K.LIZJ.remove(str);
            C1803660x2K.LIZIZ.remove(str);
        }
    }

    @Override // X.InterfaceC1794730wnv
    public void LJIIJ(EnumC1791830wjF enumC1791830wjF, C1792840wks c1792840wks, List<? extends AbstractC1791620wiu> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        LJIILJJIL(this.LIZ, enumC1791830wjF, c1792840wks, list);
    }

    public final void LJIIJJI(InterfaceC1796910wrR interfaceC1796910wrR, C1792840wks c1792840wks, C1793950wmf c1793950wmf) {
        int i;
        String str;
        String str2;
        int i2;
        String str3;
        String str4;
        String str5;
        C1797010wrb c1797010wrb;
        HashMap<String, ?> map;
        C1792170wjn c1792170wjn;
        if (c1792840wks != null && (c1792170wjn = c1792840wks.LJIIJJI) != null && c1792170wjn.LJII) {
            i = 5;
        } else {
            i = 2;
        }
        if (c1792840wks != null && c1793950wmf != null) {
            if (c1792840wks.LIZ == 0 && (str5 = c1793950wmf.LIZIZ) != null && str5.length() != 0) {
                HashMap map2 = new HashMap();
                String str6 = c1793950wmf.LIZIZ;
                String str7 = "";
                if (str6 == null) {
                    str6 = "";
                }
                map2.put("order_id", str6);
                String str8 = c1793950wmf.LIZ;
                if (str8 == null) {
                    str8 = "";
                }
                map2.put("product_id", str8);
                String str9 = c1793950wmf.LIZJ;
                if (str9 == null) {
                    str9 = "";
                }
                map2.put("channel_order_id", str9);
                String str10 = c1793950wmf.LIZLLL;
                if (str10 != null) {
                    str7 = str10;
                }
                map2.put("user_id", str7);
                C1792170wjn c1792170wjn2 = c1792840wks.LJIIJJI;
                if (c1792170wjn2 != null && (map = c1792170wjn2.LJI) != null) {
                    map2.putAll(map);
                }
                if (this.LIZIZ) {
                    C1796590wqv.LIZ("ttlive_wallet_supplement_order", map2);
                }
                C1792170wjn c1792170wjn3 = c1792840wks.LJIIJJI;
                if (c1792170wjn3 != null && c1792170wjn3.LJII) {
                    c1797010wrb = new C1797010wrb(i, null, null, null, null, new C1796560wqs(c1793950wmf.LJ, c1793950wmf.LIZ, c1793950wmf.LIZIZ, c1793950wmf.LIZLLL, false, 16), 478);
                } else {
                    c1797010wrb = new C1797010wrb(i, null, new C1796560wqs(c1793950wmf.LJ, c1793950wmf.LIZ, c1793950wmf.LIZIZ, c1793950wmf.LIZLLL, false, 16), null, null, null, 506);
                }
                LJIILLIIL(interfaceC1796910wrR, i, c1797010wrb, map2, true);
                return;
            }
            int i3 = c1792840wks.LIZ;
            if (i3 != 0) {
                LJIIL(this, interfaceC1796910wrR, i, i3, c1792840wks.LIZIZ, c1792840wks.LJI, c1792840wks.LJII, "ttlive_wallet_supplement_order", c1792840wks.LJ, c1792840wks, c1793950wmf.LIZ, c1793950wmf.LIZIZ, c1793950wmf.LJ, c1792840wks.LJIIJJI, true, 0, null, 49152);
                return;
            }
        }
        C1792170wjn c1792170wjn4 = null;
        if (c1793950wmf != null) {
            str = c1793950wmf.LIZ;
        } else {
            str = null;
        }
        String strValueOf = String.valueOf(str);
        if (c1793950wmf != null) {
            str2 = c1793950wmf.LIZIZ;
        } else {
            str2 = null;
        }
        String strValueOf2 = String.valueOf(str2);
        if (c1793950wmf != null) {
            i2 = c1793950wmf.LJ;
        } else {
            i2 = 1;
        }
        if (c1792840wks != null) {
            str3 = c1792840wks.LJI;
            str4 = c1792840wks.LJII;
        } else {
            str3 = null;
            str4 = null;
        }
        if (c1792840wks != null) {
            c1792170wjn4 = c1792840wks.LJIIJJI;
        }
        LJIIL(this, interfaceC1796910wrR, i, 51, -1, str3, str4, "ttlive_wallet_supplement_order", "extra supplement order_fail", c1792840wks, strValueOf, strValueOf2, i2, c1792170wjn4, true, 0, null, 49152);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0140 A[PHI: r3
      0x0140: PHI (r3v2 X.0wjn) = (r3v1 X.0wjn), (r3v4 X.0wjn) binds: [B:71:0x0138, B:73:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(X.InterfaceC1796910wrR r27, X.C1792840wks r28, X.C1793950wmf r29) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1796470wqj.LJIILIIL(X.0wrR, X.0wks, X.0wmf):void");
    }

    public final void LJIILL(InterfaceC1796910wrR interfaceC1796910wrR, C1792840wks c1792840wks, List<? extends AbstractC1791620wiu> list) {
        if (c1792840wks != null) {
            if (c1792840wks.LIZ == 0 && !C086I.LIZIZ(list)) {
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (AbstractC1791620wiu abstractC1791620wiu : list) {
                    if (abstractC1791620wiu != null) {
                        arrayList.add(new Diamond(abstractC1791620wiu.LIZ, abstractC1791620wiu.LIZ(), abstractC1791620wiu.LIZJ(), abstractC1791620wiu.LIZIZ(), abstractC1791620wiu.LIZLLL));
                        linkedHashMap.put(abstractC1791620wiu.LIZ, C1791610wit.LIZ(abstractC1791620wiu));
                    }
                }
                HashMap map = new HashMap();
                map.put("item_size", Integer.valueOf(list.size()));
                map.put("product_list", C2348809Ig.LJIIIIZZ(arrayList));
                if (this.LIZIZ) {
                    C1796590wqv.LIZ("ttlive_fetch_subscription_products", map);
                }
                Diamond diamond = (Diamond) C13LP.LJJJLZIJ(0, arrayList);
                if (diamond != null) {
                    C01GW c01gw = C1796440wqg.LIZ;
                    String str = diamond.LIZIZ;
                    if (!C2093608Ic.LIZJ(C1796440wqg.LIZIZ, str)) {
                        C1796440wqg.LIZIZ = str;
                        ((ArrayList) C1796440wqg.LIZJ).clear();
                    }
                }
                LJIILLIIL(interfaceC1796910wrR, 4, new C1797010wrb(4, null, null, null, new C1796490wql(arrayList, linkedHashMap), null, 494), map, false);
                return;
            }
            if (c1792840wks.LIZ == 0 && C086I.LIZIZ(list)) {
                LJIIL(this, interfaceC1796910wrR, 4, 21, -1, c1792840wks.LJI, c1792840wks.LJII, "ttlive_fetch_subscription_products", "query pipo product empty", c1792840wks, null, null, 0, null, false, 0, null, 65024);
                return;
            }
            int i = c1792840wks.LIZ;
            if (i != 0) {
                LJIIL(this, interfaceC1796910wrR, 4, i, c1792840wks.LIZIZ, c1792840wks.LJI, c1792840wks.LJII, "ttlive_fetch_subscription_products", c1792840wks.LJ, c1792840wks, null, null, 0, null, false, 0, null, 65024);
                return;
            }
        }
        LJIIL(this, interfaceC1796910wrR, 4, 21, -1, "1-10-10-00", "Empty Product Detail from google", "ttlive_fetch_subscription_products", "query pipo product null", c1792840wks, null, null, 0, null, false, 0, null, 65024);
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.0wqo] */
    public final void LJIILJJIL(InterfaceC1796910wrR interfaceC1796910wrR, EnumC1791830wjF enumC1791830wjF, C1792840wks c1792840wks, List<? extends AbstractC1791620wiu> list) {
        Object obj;
        if (c1792840wks != null) {
            if (c1792840wks.LIZ == 0 && !C086I.LIZIZ(list)) {
                ArrayList arrayList = new ArrayList();
                for (AbstractC1791620wiu abstractC1791620wiu : list) {
                    if (abstractC1791620wiu != null) {
                        Diamond diamond = new Diamond(abstractC1791620wiu.LIZ, abstractC1791620wiu.LIZ(), abstractC1791620wiu.LIZJ(), abstractC1791620wiu.LIZIZ(), abstractC1791620wiu.LIZLLL);
                        diamond.LJFF = abstractC1791620wiu.LIZIZ() / 1000000.0d;
                        diamond.LJII = EnumC586400MzG.GOOGLE;
                        C1792610wkV c1792610wkV = abstractC1791620wiu.LJI;
                        if (c1792610wkV != null) {
                            c1792610wkV.getClass();
                            diamond.LJ = new Object() { // from class: X.0wqo
                            };
                        }
                        arrayList.add(diamond);
                    }
                }
                HashMap map = new HashMap();
                map.put("item_size", Integer.valueOf(list.size()));
                if (enumC1791830wjF == null || (obj = enumC1791830wjF.channelName) == null) {
                    obj = EnumC1791830wjF.UNKNOWN;
                }
                map.put("payment_method", obj);
                map.put("product_list", C2348809Ig.LJIIIIZZ(arrayList));
                SlardarSampleSetting slardarSampleSetting = SlardarSampleSetting.INSTANCE;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ttlive_query_pipo_purchase");
                sbLIZ.append("_all");
                if (slardarSampleSetting.isReport(C2188811AlT.LIZIZ(sbLIZ), 0.01d) && this.LIZIZ) {
                    C1796590wqv.LIZ("ttlive_query_pipo_purchase", map);
                }
                Diamond diamond2 = (Diamond) C13LP.LJJJLZIJ(0, arrayList);
                if (diamond2 != null) {
                    C01GW c01gw = C1796440wqg.LIZ;
                    String str = diamond2.LIZIZ;
                    if (!C2093608Ic.LIZJ(C1796440wqg.LIZIZ, str)) {
                        C1796440wqg.LIZIZ = str;
                        ((ArrayList) C1796440wqg.LIZJ).clear();
                    }
                }
                LJIILLIIL(interfaceC1796910wrR, 1, new C1797010wrb(1, arrayList, null, null, null, null, 508), map, false);
                return;
            }
            if (c1792840wks.LIZ == 0 && C086I.LIZIZ(list)) {
                LJIIL(this, interfaceC1796910wrR, 1, 21, -1, c1792840wks.LJI, c1792840wks.LJII, "ttlive_query_pipo_purchase", "query pipo product empty", c1792840wks, null, null, 0, null, false, 0, null, 65024);
                return;
            }
            int i = c1792840wks.LIZ;
            if (i != 0) {
                LJIIL(this, interfaceC1796910wrR, 1, i, c1792840wks.LIZIZ, c1792840wks.LJI, c1792840wks.LJII, "ttlive_query_pipo_purchase", c1792840wks.LJ, c1792840wks, "", "", 0, null, false, c1792840wks.LIZLLL, null, 47104);
                return;
            }
            return;
        }
        LJIIL(this, interfaceC1796910wrR, 1, 21, -1, "1-10-10-00", "Empty Product Detail from google", "ttlive_query_pipo_purchase", "query pipo product null", null, null, null, 0, null, false, 0, null, 65024);
    }

    public static void LJIILLIIL(InterfaceC1796910wrR interfaceC1796910wrR, int i, C1797010wrb c1797010wrb, HashMap map, boolean z) {
        if (interfaceC1796910wrR != null) {
            interfaceC1796910wrR.LJIILJJIL(i, c1797010wrb);
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 2 && i != 5) {
                            return;
                        }
                    } else if (interfaceC1796910wrR != null) {
                        interfaceC1796910wrR.LJI(i, c1797010wrb);
                    }
                } else {
                    if (interfaceC1796910wrR == null) {
                        return;
                    }
                    interfaceC1796910wrR.LIZJ(i, c1797010wrb);
                    return;
                }
            } else {
                if (interfaceC1796910wrR != null) {
                    interfaceC1796910wrR.LJIIIIZZ(i, c1797010wrb);
                }
                if (C1797270ws1.LIZIZ().LIZIZ().length() != 0) {
                    C1797270ws1.LIZIZ().LIZ();
                }
            }
            if (z) {
                C1796530wqp.LJIIIZ(c1797010wrb.LIZJ.LIZIZ, map);
                return;
            }
            InterfaceC1803290x1j interfaceC1803290x1jLIZJ = C1797270ws1.LIZJ();
            String str = c1797010wrb.LIZJ.LIZIZ;
            if (str == null) {
                str = "";
            }
            interfaceC1803290x1jLIZJ.LJIIIZ(true, null, -1, null, -1, null, str, null);
            C1796530wqp.LJII(c1797010wrb.LIZJ.LIZIZ, map);
            return;
        }
        if (interfaceC1796910wrR == null) {
            return;
        }
        interfaceC1796910wrR.LJIILLIIL(i, c1797010wrb);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIL(X.C1796470wqj r27, X.InterfaceC1796910wrR r28, int r29, int r30, int r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, X.C1792840wks r36, java.lang.String r37, java.lang.String r38, int r39, X.C1792170wjn r40, boolean r41, int r42, java.util.List r43, int r44) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1796470wqj.LJIIL(X.0wqj, X.0wrR, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.0wks, java.lang.String, java.lang.String, int, X.0wjn, boolean, int, java.util.List, int):void");
    }
}
