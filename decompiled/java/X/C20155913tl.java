package X;

import android.net.Uri;
import android.util.LruCache;
import android.util.Size;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.image.EcomImageXConfigModel;
import com.ss.android.ugc.aweme.ecommerce.image.EcomPriorityData;
import com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageAdaptSizeConfigModel;
import com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageAdaptSizeGlobalBean;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS173S1100000_24;
import kotlin.jvm.internal.AwS564S0100000_20;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13tl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20155913tl implements InterfaceC20156313tp {
    public static final C20155913tl LIZ = new C20155913tl();
    public static final List<InterfaceC20156313tp> LIZIZ = C13LP.LLIIII(C1697810uHb.LJIILJJIL(new InterfaceC20156313tp() { // from class: X.0krt
        @Override // X.InterfaceC20156313tp
        public final void LIZ() {
        }

        @Override // X.InterfaceC20156313tp
        public final void LIZIZ(C20155613ti c20155613ti, C20155713tj c20155713tj) {
            Map map;
            String host = c20155613ti.LIZ.getHost();
            if (host != null && (map = (Map) ((Map) C00RU.LIZIZ.getValue()).get(host)) != null) {
                for (Map.Entry entry : map.entrySet()) {
                    c20155713tj.LJIILIIL.put((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
    }, new InterfaceC20156313tp() { // from class: X.13tk
        public static final /* synthetic */ int LIZIZ = 0;
        public final LruCache<String, C20155613ti> LIZ = new LruCache<>(50);

        @Override // X.InterfaceC20156313tp
        public final void LIZ() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:102:0x01c2  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x00ef A[EDGE_INSN: B:155:0x00ef->B:52:0x00ef BREAK  A[LOOP:1: B:38:0x00be->B:158:0x00be], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:161:0x00be A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0171  */
        @Override // X.InterfaceC20156313tp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LIZIZ(X.C20155613ti r16, X.C20155713tj r17) {
            /*
                Method dump skipped, instruction units count: 608
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C20155813tk.LIZIZ(X.13ti, X.13tj):void");
        }
    }, new InterfaceC20156313tp() { // from class: X.13tb
        public final LruCache<String, C20155613ti> LIZ;

        @Override // X.InterfaceC20156313tp
        public final void LIZ() {
        }

        {
            EcomImageAdaptSizeGlobalBean ecomImageAdaptSizeGlobalBean = C20156813tu.LIZ;
            this.LIZ = new LruCache<>(C20156813tu.LIZ.lruCacheSize);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
        @Override // X.InterfaceC20156313tp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LIZIZ(X.C20155613ti r10, X.C20155713tj r11) {
            /*
                Method dump skipped, instruction units count: 356
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C20154913tb.LIZIZ(X.13ti, X.13tj):void");
        }

        public static boolean LIZJ(C20155613ti c20155613ti, C20155713tj c20155713tj, List list) {
            Object next;
            String str;
            Uri uri = c20155613ti.LIZ;
            Iterator it2 = list.iterator();
            loop0: while (true) {
                String str2 = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    LinkedHashMap linkedHashMap = new LinkedHashMap((Map) next);
                    String str3 = (String) linkedHashMap.remove("ec_biz_scene");
                    String str4 = (String) linkedHashMap.remove("page_name");
                    if (str3 != null && str3.length() != 0) {
                        C1334140kp2 c1334140kp2 = c20155713tj.LJIIIIZZ;
                        if (c1334140kp2 != null) {
                            str = c1334140kp2.LIZ;
                        } else {
                            str = null;
                        }
                        if (!Intrinsics.LJFF(str3, str)) {
                            continue;
                        }
                    }
                    if (str4 != null && str4.length() != 0) {
                        C1334140kp2 c1334140kp22 = c20155713tj.LJIIIIZZ;
                        if (c1334140kp22 != null) {
                            str2 = c1334140kp22.LIZIZ;
                        }
                        if (!Intrinsics.LJFF(str4, str2)) {
                            continue;
                        }
                    }
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            if (!Intrinsics.LJFF(C1942307jB.LIZIZ(uri, (String) entry.getKey()), entry.getValue())) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                return false;
            }
            if (next != null) {
                return true;
            }
            return false;
        }
    }));

    @Override // X.InterfaceC20156313tp
    public final void LIZ() {
    }

    public static void LJ(String str) {
        String str2;
        if (!C1506020pIG.LIZ() || str == null) {
            return;
        }
        C1505940pI8.LIZ.getClass();
        if (C1506020pIG.LIZ() && (str2 = C1505940pI8.LJIIIZ.LIZ) != null) {
            C1066210dqt.LIZLLL(str, "log", new Pair("network_category_v2_start", str2));
        }
    }

    @Override // X.InterfaceC20156313tp
    public final void LIZIZ(C20155613ti c20155613ti, C20155713tj c20155713tj) {
        Size sizeLIZJ;
        if (C20156613ts.LIZ <= 3) {
            List<Integer> list = C20156813tu.LIZ.testConfigScreen;
            if (!list.isEmpty() && System.currentTimeMillis() - C20156613ts.LIZIZ > Mp4ScreenVideoLoadTimeout.CONTROL) {
                boolean z = true;
                C20156613ts.LIZ++;
                C20156613ts.LIZIZ = System.currentTimeMillis();
                List<String> listLJIIJJI = C1697810uHb.LJIIJJI("crop-native-heic-qv:1600:1600:q84.heic", "resize-nati-heic-qv:1600:0:q84.heic", "crop-webp:1600:1600.webp", "resize-webp:1600:0.webp");
                C20155713tj c20155713tj2 = new C20155713tj(UriProtector.parse("test://p16-oec-va.ibyteimg.com/~tplv-omjb5zjo8w-crop-webp:500:500.webp"));
                C20155613ti c20155613tiLIZ = c20155713tj2.LIZ();
                if (c20155613tiLIZ != null) {
                    sizeLIZJ = c20155613tiLIZ.LIZJ();
                } else {
                    sizeLIZJ = null;
                }
                EcomImageXConfigModel ecomImageXConfigModel = new EcomImageXConfigModel(null, "*", null, null, null, null, null, null, null, "1600", null, null);
                C1867240ygs.LIZIZ.getClass();
                for (AbstractC1869220yk4 abstractC1869220yk4 : C1867240ygs.LIZLLL) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator<Integer> it2 = list.iterator();
                    while (it2.hasNext()) {
                        int iIntValue = it2.next().intValue();
                        List<EcomImageAdaptSizeConfigModel> listLIZIZ = abstractC1869220yk4.LIZIZ();
                        ArrayList arrayList = new ArrayList();
                        for (EcomImageAdaptSizeConfigModel ecomImageAdaptSizeConfigModel : (ArrayList) listLIZIZ) {
                            List<String> listSingletonList = ecomImageAdaptSizeConfigModel.scenes;
                            if (listSingletonList == null) {
                                String str = ecomImageAdaptSizeConfigModel.scene;
                                if (str == null) {
                                    str = "";
                                }
                                listSingletonList = Collections.singletonList(str);
                            }
                            C20159013uG c20159013uGLIZ = C20158413uA.LIZ(ecomImageAdaptSizeConfigModel, Integer.valueOf(iIntValue), z);
                            if (c20159013uGLIZ != null) {
                                Integer numLIZJ = C20158413uA.LIZJ(ecomImageAdaptSizeConfigModel, Integer.valueOf(iIntValue), z);
                                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLJIIJJI, 10));
                                if (iLIZIZ < 16) {
                                    iLIZIZ = 16;
                                }
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iLIZIZ);
                                for (String str2 : listLJIIJJI) {
                                    c20155713tj2.LIZLLL(str2);
                                    C20156013tm.LIZ(c20155713tj2, ecomImageXConfigModel, sizeLIZJ, numLIZJ, c20159013uGLIZ);
                                    Pair pair = new Pair(str2, c20155713tj2.LJFF());
                                    linkedHashMap2.put(pair.getFirst(), pair.getSecond());
                                }
                                Pair[] pairArr = {new Pair("scenes", listSingletonList), new Pair("width", ecomImageAdaptSizeConfigModel.width), new Pair("type", c20159013uGLIZ.LIZ), new Pair("px", c20159013uGLIZ.LIZIZ), new Pair("template", new TreeMap(linkedHashMap2)), new Pair("adaptSize", numLIZJ)};
                                TreeMap treeMap = new TreeMap();
                                C2097608Jq.LJIILL(treeMap, pairArr);
                                arrayList.add(treeMap);
                            }
                            z = true;
                        }
                        if (!arrayList.isEmpty()) {
                            linkedHashMap.put(Integer.valueOf(iIntValue), arrayList);
                        }
                    }
                    if (!linkedHashMap.isEmpty()) {
                        String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(linkedHashMap);
                        C1018703yb.LIZIZ("rd_tiktokec_image_demo", C2097608Jq.LJIIIIZZ(new Pair("name", abstractC1869220yk4.getClass().getSimpleName()), new Pair("result", strLJIIIIZZ), new Pair("md5", C2085508Ez.LIZ(strLJIIIIZZ))));
                    }
                    z = true;
                }
            }
        }
        for (InterfaceC20156313tp interfaceC20156313tp : LIZIZ) {
            if (c20155613ti.LJI) {
                interfaceC20156313tp.LIZ();
            } else {
                interfaceC20156313tp.LIZIZ(c20155613ti, c20155713tj);
            }
        }
    }

    public final C1326860kdI LIZJ(C20155613ti c20155613ti, boolean z) {
        Uri uri;
        String path;
        C20155713tj c20155713tj = new C20155713tj(c20155613ti.LIZ, c20155613ti.LIZIZ, c20155613ti.LIZJ, c20155613ti.LIZLLL, new ArrayList(c20155613ti.LJ), c20155613ti.LJFF, c20155613ti.LJIIIZ);
        LIZIZ(c20155613ti, c20155713tj);
        C20155613ti c20155613tiLIZ = c20155713tj.LIZ();
        if (c20155613tiLIZ != null && (uri = c20155613tiLIZ.LIZ) != null && (path = uri.getPath()) != null) {
            LIZLLL(path, new AwS564S0100000_20(c20155613tiLIZ, 28), z);
        }
        LruCache<String, C20155613ti> lruCache = C20155613ti.LJIIL;
        if (c20155613tiLIZ != null) {
            C20155613ti.LJIIL.put(c20155613tiLIZ.LJIIJ, c20155613tiLIZ);
        }
        String str = c20155613ti.LJIIJ;
        String str2 = null;
        if (c20155613tiLIZ != null) {
            String str3 = c20155613tiLIZ.LJIIJ;
            if (str3 != null) {
                C01GW<C603820NmG<String, C1066220dqu>> c01gw = C1066210dqt.LIZ;
                C1066220dqu c1066220dquLIZJ = c01gw.getValue().LIZJ(str);
                if (c1066220dquLIZJ != null) {
                    c01gw.getValue().LIZLLL(str3, c1066220dquLIZJ);
                }
            }
            if (c20155613tiLIZ != null) {
                String str4 = c20155613tiLIZ.LJIIJ;
                if (str4 != null) {
                    String strLIZ = C1508050pLX.LIZ();
                    if (strLIZ == null) {
                        strLIZ = "";
                    }
                    C1066210dqt.LIZLLL(str4, "log", new Pair("network_start_btm", strLIZ));
                }
                if (c20155613tiLIZ != null) {
                    str2 = c20155613tiLIZ.LJIIJ;
                }
            }
        }
        LJ(str2);
        return new C1326860kdI(c20155713tj.toString(), c20155713tj.LJIIJJI, c20155713tj.LJIIL);
    }

    public static void LIZLLL(String str, Function0 function0, boolean z) {
        EcomPriorityData ecomPriorityData = C1326850kdH.LIZ;
        if (ecomPriorityData.enable) {
            if (ecomPriorityData.scenes.isEmpty()) {
                if (ecomPriorityData.allowPrefetch) {
                    C1561210qjH.LIZJ(str);
                    return;
                } else {
                    if (z) {
                        return;
                    }
                    C1561210qjH.LIZJ(str);
                    return;
                }
            }
            AwS173S1100000_24 awS173S1100000_24 = new AwS173S1100000_24(function0, (Function0<String>) str, (String) 13);
            if (ecomPriorityData.allowPrefetch) {
                awS173S1100000_24.invoke();
            } else {
                if (z) {
                    return;
                }
                awS173S1100000_24.invoke();
            }
        }
    }
}
