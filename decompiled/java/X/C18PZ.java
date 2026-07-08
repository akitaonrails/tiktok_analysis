package X;

import Y.ARunnableS36S1100000_32;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.bytedance.hox.Hox;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IPdpPreviewService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgPromotionLabel;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSACardsResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.EcUgVSAData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.18PZ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18PZ {
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;
    public static volatile boolean LJFF;
    public static volatile boolean LJI;
    public static C21279918Pl LJII;
    public static ScheduledFuture<?> LJIIIIZZ;
    public static final C18PZ LIZ = new C18PZ();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C21280818Pu());
    public static final List<String> LJIIIZ = C1697810uHb.LJIIJJI("homepage_hot", "homepage_follow", "homepage_friends");

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZIZ(android.content.Context r15) {
        /*
            X.0sDV r0 = X.C1618390sDV.LIZ
            r0.getClass()
            r7 = r15
            boolean r0 = X.C1618390sDV.LIZIZ(r7)
            if (r0 == 0) goto L11
            java.util.Map r0 = X.C2097608Jq.LJ()
            return r0
        L11:
            X.01GW r0 = X.C18Q0.LIZIZ
            java.lang.Object r1 = r0.getValue()
            int[] r1 = (int[]) r1
            r13 = 0
            r4 = 1
            if (r1 == 0) goto L34
            int r0 = X.C294640Bgk.LIZ()
            int r0 = X.C13LQ.LJJIJ(r0, r1)
            if (r0 < 0) goto L32
            r0 = 1
        L28:
            if (r0 != r4) goto L34
            r0 = 1
        L2b:
            if (r0 == 0) goto L36
            java.util.Map r0 = X.C2097608Jq.LJ()
            return r0
        L32:
            r0 = 0
            goto L28
        L34:
            r0 = 0
            goto L2b
        L36:
            X.01GW r0 = X.C21278818Pa.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = X.C21278818Pa.LIZIZ
            if (r9 == 0) goto Lb1
            r8 = 0
            X.18Pf r3 = X.C21278818Pa.LIZJ(r9, r8)
            if (r3 == 0) goto Lb1
            boolean r0 = r3.LJIILL
            if (r0 == 0) goto Lb1
            boolean r0 = r3.LJIIL
            if (r0 != 0) goto Lb1
            r3.LJIIL = r4
            X.C21278818Pa.LJIILIIL(r9, r8)
            java.util.concurrent.ExecutorService r2 = X.C823050WQl.LIZJ()     // Catch: java.lang.Throwable -> L5f
            Y.ARunnableS65S0300000_32 r1 = new Y.ARunnableS65S0300000_32     // Catch: java.lang.Throwable -> L5f
            r0 = 10
            r1.<init>(r7, r9, r3, r0)     // Catch: java.lang.Throwable -> L5f
            r2.execute(r1)     // Catch: java.lang.Throwable -> L5f
            goto L63
        L5f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L63:
            com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSACardsResponse$VSACardData r0 = r3.LJFF
            if (r0 == 0) goto Laf
            java.util.List<com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct> r0 = r0.productList
            if (r0 == 0) goto Laf
            java.lang.Object r5 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct r5 = (com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct) r5
        L71:
            if (r5 == 0) goto Lad
            java.lang.String r0 = r5.productId
        L75:
            java.lang.String r11 = X.C123500dV.LIZIZ(r0)
            X.18Ow r6 = X.C21278418Ow.LIZ
            X.18Pg r12 = X.EnumC21279418Pg.SHOP_TAB_ICON
            r15 = 194(0xc2, float:2.72E-43)
            r10 = r8
            r14 = r8
            java.lang.String r2 = X.C21278418Ow.LJII(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = 2
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "video_shop_guide_schema"
            r1.<init>(r0, r2)
            r3[r13] = r1
            if (r5 == 0) goto L9b
            com.ss.android.ugc.aweme.ecommerce.ug.btm.BcmStandardTrackData r0 = r5.bcmStandardTrack
            if (r0 == 0) goto L9b
            java.util.Map r8 = X.C1768380w7Q.LIZ(r0)
        L9b:
            java.lang.String r2 = java.lang.String.valueOf(r8)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "chain_param"
            r1.<init>(r0, r2)
            r3[r4] = r1
            java.util.Map r0 = X.C2097608Jq.LJIIIIZZ(r3)
            return r0
        Lad:
            r0 = r8
            goto L75
        Laf:
            r5 = r8
            goto L71
        Lb1:
            java.util.Map r0 = X.C2097608Jq.LJ()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18PZ.LIZIZ(android.content.Context):java.util.Map");
    }

    public static boolean LIZJ(String str) {
        return C13LP.LJJJJ(str, LJIIIZ);
    }

    public static void LJFF(C21279318Pf c21279318Pf) {
        List<EcUgProduct> list;
        EcUgProduct ecUgProduct;
        Image image;
        List<String> urls;
        int iIntValue;
        try {
            VSACardsResponse.VSACardData vSACardData = c21279318Pf.LJFF;
            if (vSACardData != null && (list = vSACardData.productList) != null && (ecUgProduct = (EcUgProduct) C13LP.LJJJLL(list)) != null && (image = ecUgProduct.firstImage) != null && (urls = image.getUrls()) != null) {
                String str = (String) C13LP.LJJJLL(urls);
                int iIntValue2 = 0;
                if (str != null && !a0.LJJJIL(str) && !c21279318Pf.LJIIJJI && c21279318Pf.LJIIIIZZ == null) {
                    c21279318Pf.LJIIJJI = true;
                    C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(image.toImageUrlModel());
                    Integer width = image.getWidth();
                    if (width != null) {
                        iIntValue = width.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    Integer height = image.getHeight();
                    if (height != null) {
                        iIntValue2 = height.intValue();
                    }
                    if (iIntValue > 0 && iIntValue2 > 0) {
                        c1331670kl3LJIIJ.LJIIJJI = iIntValue;
                        c1331670kl3LJIIJ.LJIIL = iIntValue2;
                    }
                    c1331670kl3LJIIJ.LJJIII = EnumC1334360kpO.HIGH;
                    c1331670kl3LJIIJ.LIZLLL("ec_ug_vsa");
                    c1331670kl3LJIIJ.LJJII(new C20747816Gu(c21279318Pf, 0));
                    LJI(c21279318Pf);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJI(C21279318Pf c21279318Pf) {
        String str;
        int iIntValue;
        int iIntValue2;
        List listLL;
        Collection<List<EcUgPromotionLabel>> collectionValues;
        List listLJIJJLI;
        List listLL2;
        try {
            VSACardsResponse.VSACardData vSACardData = c21279318Pf.LJFF;
            if (vSACardData != null) {
                C18PS.LLJILJILJ.getClass();
                int iLIZ = C18PV.LIZ(vSACardData);
                List<EcUgProduct> list = vSACardData.productList;
                ArrayList<Image> arrayList = null;
                if (list != null && (listLL2 = C13LP.LL(list, iLIZ)) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = listLL2.iterator();
                    while (it2.hasNext()) {
                        Image image = ((EcUgProduct) it2.next()).firstImage;
                        if (image != null) {
                            arrayList2.add(image);
                        }
                    }
                    arrayList = new ArrayList(arrayList2);
                }
                List<EcUgProduct> list2 = vSACardData.productList;
                if (list2 != null && (listLL = C13LP.LL(list2, iLIZ)) != null) {
                    ArrayList<List> arrayList3 = new ArrayList();
                    Iterator it3 = listLL.iterator();
                    while (it3.hasNext()) {
                        Map<String, List<EcUgPromotionLabel>> map = ((EcUgProduct) it3.next()).productLabels;
                        if (map != null && (collectionValues = map.values()) != null && (listLJIJJLI = C15438062q.LJIJJLI(collectionValues)) != null) {
                            arrayList3.add(listLJIJJLI);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (List<EcUgPromotionLabel> list3 : arrayList3) {
                        ArrayList arrayList5 = new ArrayList();
                        for (EcUgPromotionLabel ecUgPromotionLabel : list3) {
                            ArrayList arrayList6 = new ArrayList();
                            Image image2 = ecUgPromotionLabel.image;
                            if (image2 != null) {
                                arrayList6.add(image2);
                            }
                            Image image3 = ecUgPromotionLabel.icon;
                            if (image3 != null) {
                                arrayList6.add(image3);
                            }
                            C19719612Di.LJJI(arrayList6, arrayList5);
                        }
                        C19719612Di.LJJI(arrayList5, arrayList4);
                    }
                    ArrayList arrayList7 = new ArrayList(arrayList4);
                    if (arrayList != null) {
                        arrayList.addAll(arrayList7);
                    } else {
                        return;
                    }
                } else if (arrayList == null) {
                    return;
                }
                if (!arrayList.isEmpty()) {
                    for (Image image4 : arrayList) {
                        List<String> urls = image4.getUrls();
                        if (urls != null && (str = (String) C13LP.LJJJLL(urls)) != null && !a0.LJJJIL(str)) {
                            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(image4.toImageUrlModel());
                            Integer width = image4.getWidth();
                            if (width != null) {
                                iIntValue = width.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            Integer height = image4.getHeight();
                            if (height != null) {
                                iIntValue2 = height.intValue();
                            } else {
                                iIntValue2 = 0;
                            }
                            if (iIntValue > 0 && iIntValue2 > 0) {
                                c1331670kl3LJIIJ.LJIIJJI = iIntValue;
                                c1331670kl3LJIIJ.LJIIL = iIntValue2;
                            }
                            c1331670kl3LJIIJ.LIZLLL("ec_ug_vsa");
                            c1331670kl3LJIIJ.LJIILIIL();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJIIJ(Context context) {
        C19EG c19egLIZIZ;
        C21279918Pl c21279918Pl = LJII;
        if (c21279918Pl != null && context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            try {
                Hox.LLJILJIL.LIZ(c19egLIZIZ).PQ2("page_profile", c21279918Pl);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static Aweme LIZ(Aweme aweme, String str) {
        String aid;
        C01GW c01gw = C21278818Pa.LIZ;
        Aweme aweme2 = C21278818Pa.LIZIZ;
        if (LIZJ(str) && LIZJ && C21278818Pa.LJIIIZ(aweme, str) && aweme2 != null) {
            String aid2 = aweme2.getAid();
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(aid2, aid)) {
                return aweme2;
            }
        }
        return null;
    }

    public static void LJ(String str, String str2) {
        C21278918Pb.LIZ.getClass();
        C21278918Pb.LJ();
        C207296169u c207296169u = C207296169u.LIZ;
        EnumC207181165j enumC207181165j = EnumC207181165j.CARD_SHOW_FAIL;
        c207296169u.getClass();
        C207296169u.LIZ(enumC207181165j);
        C01GW c01gw = C21278818Pa.LIZ;
        C21279318Pf c21279318PfLIZJ = C21278818Pa.LIZJ(C21278818Pa.LIZIZ, str2);
        String str3 = "";
        if (c21279318PfLIZJ != null) {
            C18PM c18pm = C18PM.LIZ;
            String value = EnumC21279818Pk.SHOW.getValue();
            VSACardsResponse.VSACardData vSACardData = c21279318PfLIZJ.LJFF;
            Map<String, String> map = c21279318PfLIZJ.LJI;
            if (str2 != null) {
                str3 = str2;
            }
            C18PM.LJI(c18pm, value, false, 0, str, null, str3, vSACardData, map, 20);
            return;
        }
        C18PM c18pm2 = C18PM.LIZ;
        String value2 = EnumC21279818Pk.SHOW.getValue();
        if (str2 != null) {
            str3 = str2;
        }
        C18PM.LJI(c18pm2, value2, false, 0, str, null, str3, null, null, 212);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0rJg, X.18Pl] */
    public static void LJIIIIZZ(final Context context, final String str) {
        C19EG c19egLIZIZ;
        if (LIZJ && context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            ?? r2 = new InterfaceC1055110dYz() { // from class: X.18Pl
                @Override // X.InterfaceC1583780rJg
                public final String getHoxNodeTag() {
                    return "";
                }

                @Override // X.InterfaceC1055110dYz
                public final void onNodeHide(Bundle bundle) {
                    C18PZ.LJ = false;
                    C18PZ.LJFF = true;
                    try {
                        C823050WQl.LJ().schedule(new ARunnableS36S1100000_32(context, str, 2), 300L, TimeUnit.MILLISECONDS);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }

                @Override // X.InterfaceC1055110dYz
                public final void onNodeShow(Bundle bundle) {
                    C18PZ.LJ = true;
                    try {
                        C823050WQl.LIZJ().execute(new ARunnableS36S1100000_32(context, str, 3));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            };
            LIZ.getClass();
            LJIIJ(c19egLIZIZ);
            LJII = r2;
            try {
                Hox.LLJILJIL.LIZ(c19egLIZIZ).wQ2("page_profile", r2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.ss.android.ugc.aweme.ecommerce.service.IPdpPreviewService] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    public static void LJII(C21279318Pf c21279318Pf, Aweme aweme, List list) {
        AwemeRawAd awemeRawAd;
        EcUgVSAData ecUgVSAData;
        String str;
        List<EcUgProduct> list2;
        ?? arrayList = list;
        if (c21279318Pf.LJIILLIIL) {
            return;
        }
        c21279318Pf.LJIILLIIL = true;
        VSACardsResponse.VSACardData vSACardData = c21279318Pf.LJFF;
        if (((vSACardData != null && (str = vSACardData.cardSchema) != null) || (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (ecUgVSAData = awemeRawAd.getEcUgVSAData()) != null && (str = ecUgVSAData.openUrl) != null)) && !a0.LJJJIL(str) && C1740930vP9.LIZJ(str)) {
            if (arrayList == 0) {
                VSACardsResponse.VSACardData vSACardData2 = c21279318Pf.LJFF;
                if (vSACardData2 != null && (list2 = vSACardData2.productList) != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator<EcUgProduct> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(C123500dV.LIZIZ(it2.next().productId));
                    }
                } else {
                    return;
                }
            }
            ?? r1 = (IPdpPreviewService) ServiceManager.get().getService(IPdpPreviewService.class);
            boolean zLJI = MethodIDManager.LJI(137963);
            r1.LIZ(arrayList, null, null, null, "vsa");
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    public static void LJIIIZ(Context context, Aweme aweme, String str) {
        C21279318Pf c21279318PfLIZJ;
        Bitmap bitmap;
        C21278918Pb c21278918Pb = C21278918Pb.LIZ;
        c21278918Pb.getClass();
        if (((Boolean) C21278918Pb.LIZ(context, aweme, str).getFirst()).booleanValue() && (c21279318PfLIZJ = C21278818Pa.LIZJ(aweme, str)) != null) {
            boolean z = c21279318PfLIZJ.LJIILJJIL;
            if (c21279318PfLIZJ.LJIILJJIL) {
                bitmap = c21279318PfLIZJ.LJIIIIZZ;
            } else {
                bitmap = null;
            }
            c21278918Pb.getClass();
            C21278918Pb.LIZLLL(context, c21279318PfLIZJ, z, bitmap);
        }
    }

    public static void LJIIJJI(Context context, C21279218Pe c21279218Pe, String str) {
        C21278918Pb c21278918Pb = C21278918Pb.LIZ;
        C01GW c01gw = C21278818Pa.LIZ;
        Aweme aweme = C21278818Pa.LIZIZ;
        c21278918Pb.getClass();
        C21278918Pb.LIZJ(context, aweme, str, true);
        LJIIJ(context);
        if (c21279218Pe != null) {
            try {
                EventBus eventBusLIZLLL = EventBus.LIZLLL();
                if (eventBusLIZLLL.LJIIJ(c21279218Pe)) {
                    eventBusLIZLLL.LJJI(c21279218Pe);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        C01GW c01gw2 = C21278818Pa.LIZ;
        C21279318Pf c21279318PfLIZJ = C21278818Pa.LIZJ(C21278818Pa.LIZIZ, str);
        if (c21279318PfLIZJ != null) {
            try {
                C18PX c18px = c21279318PfLIZJ.LJIIIZ;
                if (c18px != null) {
                    c18px.LIZJ();
                }
                c21279318PfLIZJ.LJIIJJI = false;
                c21279318PfLIZJ.LJIIL = false;
                c21279318PfLIZJ.LJIILIIL = false;
                c21279318PfLIZJ.LJIILJJIL = false;
                c21279318PfLIZJ.LJIILL = false;
                c21279318PfLIZJ.LJIILLIIL = false;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        C21278818Pa.LJIIL(null);
        LIZLLL = false;
        LJ = false;
        LJFF = false;
        LJI = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095 A[FALL_THROUGH] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, com.ss.android.ugc.aweme.feed.model.Aweme] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(X.C18PZ r8, android.content.Context r9, java.lang.String r10, com.ss.android.ugc.aweme.feed.model.Aweme r11, java.lang.Integer r12, java.lang.String r13, int r14) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18PZ.LIZLLL(X.18PZ, android.content.Context, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Integer, java.lang.String, int):java.lang.String");
    }
}
