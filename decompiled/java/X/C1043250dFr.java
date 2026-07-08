package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.ad.settings.UploadAdWebPreloadInfoConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.log.IAdWebEventLogger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dFr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1043250dFr {
    public static void LIZ(final C1043270dFt c1043270dFt, final String str, final InterfaceC1041500dD2 interfaceC1041500dD2, final C1043260dFs c1043260dFs) {
        String strK0;
        String strLJ;
        IAdLandPagePreloadService iAdLandPagePreloadService;
        JSONObject jSONObjectW0;
        if (interfaceC1041500dD2.getPreloadAdWeb() == 4 || interfaceC1041500dD2.isPreloadSecondPage() == 1) {
            if ((!c1043260dFs.LJFF.isEmpty() || c1043260dFs.LJIIIIZZ != 0) && TextUtils.equals(c1043270dFt.LIZJ, c1043260dFs.LIZLLL)) {
                final int preloadWebStatus = interfaceC1041500dD2.getPreloadWebStatus();
                C01GW c01gw = UploadAdWebPreloadInfoConfig.LIZIZ;
                int i = 0;
                if (((UploadAdWebPreloadInfoConfig.UAWPIConfig) c01gw.getValue()).samplingRate < 1 || new Random().nextInt(((UploadAdWebPreloadInfoConfig.UAWPIConfig) c01gw.getValue()).samplingRate) == 0) {
                    IAdLandPagePreloadService iAdLandPagePreloadService2 = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
                    if (iAdLandPagePreloadService2 != null && (strK0 = iAdLandPagePreloadService2.K0("feed")) != null && (strLJ = C1552050qUV.LJ(strK0, c1043260dFs.LIZ)) != null && (iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)) != null && (jSONObjectW0 = iAdLandPagePreloadService.w0(strLJ)) != null) {
                        c1043260dFs.LJIIJ = ((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).F0(strLJ);
                        c1043260dFs.LJIIJJI = ((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).D0(strLJ);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C13BV c13bv = C13BV.INSTANCE;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : c13bv) {
                            obj.getClass();
                            String strLIZ = C08HG.LIZ(null);
                            if (jSONObjectW0.has(strLIZ)) {
                                obj.getClass();
                                linkedHashMap.put(null, strLIZ);
                            } else {
                                obj.getClass();
                                String strLIZJ = C1043460dGC.LIZJ(null);
                                if (jSONObjectW0.has(strLIZJ)) {
                                    linkedHashMap.put(strLIZJ, strLIZJ);
                                }
                            }
                            arrayList.add(obj);
                        }
                        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                        for (Object obj2 : arrayList) {
                            obj2.getClass();
                            arrayList2.add(new Pair(null, obj2));
                        }
                        for (Map.Entry entry : new LinkedHashMap(C2097608Jq.LJIILLIIL(arrayList2)).entrySet()) {
                            if (linkedHashMap.get(entry.getKey()) != null) {
                                c1043260dFs.LJFF.add(new C1043320dFy((String) entry.getKey(), i, 6));
                            }
                        }
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    final ArrayList arrayList3 = new ArrayList();
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    for (C1043320dFy c1043320dFy : c1043260dFs.LJI) {
                        if (linkedHashSet.add(c1043320dFy.LIZ)) {
                            arrayList3.add(c1043320dFy);
                            if (!c1043320dFy.LIZIZ) {
                                i2++;
                            }
                            int i5 = c1043320dFy.LIZJ;
                            if (i5 == EnumC1043330dFz.DOMAIN.ordinal()) {
                                i4++;
                            } else if (i5 == EnumC1043330dFz.PREFETCH.ordinal()) {
                                i3++;
                            } else {
                                EnumC1043330dFz.OFFLINE.ordinal();
                            }
                        }
                    }
                    Integer numValueOf = Integer.valueOf(i2);
                    final C1074600e4Q c1074600e4Q = new C1074600e4Q(arrayList3, numValueOf, Integer.valueOf(i3), Integer.valueOf(i4));
                    final int iIntValue = numValueOf.intValue();
                    CopyOnWriteArrayList<C1043320dFy> copyOnWriteArrayList = c1043260dFs.LJFF;
                    HashSet hashSet = new HashSet();
                    final ArrayList arrayList4 = new ArrayList();
                    for (C1043320dFy c1043320dFy2 : copyOnWriteArrayList) {
                        if (hashSet.add(c1043320dFy2.LIZ)) {
                            arrayList4.add(c1043320dFy2);
                        }
                    }
                    boolean z = c1043260dFs.LJIIL;
                    InterfaceC1009950cO9 interfaceC1009950cO9 = (InterfaceC1009950cO9) ServiceManager.get().getService(IAdWebEventLogger.class);
                    C1023960ckk c1023960ckk = C2266321DnC.LIZ;
                    String strValueOf = String.valueOf(interfaceC1041500dD2.getRealCreativeId());
                    String realLogExtra = interfaceC1041500dD2.getRealLogExtra();
                    final int i6 = z ? 1 : 0;
                    interfaceC1009950cO9.logAd(c1023960ckk, strValueOf, realLogExtra, null, new Function1() { // from class: X.0dFw
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            String str2;
                            String str3 = str;
                            C1043260dFs c1043260dFs2 = c1043260dFs;
                            int i7 = preloadWebStatus;
                            InterfaceC1041500dD2 interfaceC1041500dD22 = interfaceC1041500dD2;
                            List list = arrayList3;
                            List list2 = arrayList4;
                            C1074600e4Q c1074600e4Q2 = c1074600e4Q;
                            int i8 = i6;
                            int i9 = iIntValue;
                            C1023640ckE c1023640ckE = (C1023640ckE) obj3;
                            C2266311DnB.LIZ.getClass();
                            c1023640ckE.withParam(C2266311DnB.LJII, str3);
                            c1023640ckE.withParam(C2266311DnB.LJIILJJIL, c1043260dFs2.LIZ);
                            c1023640ckE.withParam(C2266311DnB.LJFF, Long.valueOf(i7));
                            C1002190cBd c1002190cBd = C2266311DnB.LJIJI;
                            if (interfaceC1041500dD22.getIsFromJsb()) {
                                str2 = "1";
                            } else {
                                str2 = CardStruct.IStatusCode.DEFAULT;
                            }
                            c1023640ckE.withParam(c1002190cBd, str2);
                            c1023640ckE.withParam(C2266311DnB.LJIIL, Long.valueOf(interfaceC1041500dD22.getIsFirstPage()));
                            C1002190cBd c1002190cBd2 = C2266311DnB.LJIILL;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("{\"total_request\":");
                            sbLIZ.append(list.size() + list2.size());
                            sbLIZ.append(",\"successCount\":");
                            sbLIZ.append(list2.size());
                            sbLIZ.append(",\"prefetchCount\":");
                            sbLIZ.append(c1074600e4Q2.LIZJ);
                            sbLIZ.append(",\"hit_html\":");
                            sbLIZ.append(i8);
                            sbLIZ.append(",\"domainCount\":");
                            sbLIZ.append(c1074600e4Q2.LIZLLL);
                            sbLIZ.append(",\"hitPrefetchCount\":");
                            sbLIZ.append(c1043260dFs2.LJIIIZ);
                            sbLIZ.append(",\"failCount\":");
                            sbLIZ.append(list.size());
                            sbLIZ.append(",\"failResourceCount\":");
                            sbLIZ.append(i9);
                            sbLIZ.append(",\"package_id\":");
                            sbLIZ.append(c1043260dFs2.LJ);
                            sbLIZ.append(",\"channel_response\":");
                            sbLIZ.append(c1043260dFs2.LJII);
                            sbLIZ.append(",\"channel_prefetch\":");
                            sbLIZ.append(c1043260dFs2.LJIIJ);
                            sbLIZ.append(",\"channel_domain\":");
                            sbLIZ.append(c1043260dFs2.LJIIJJI);
                            sbLIZ.append(",\"preload_success_requests\":");
                            sbLIZ.append(list2);
                            sbLIZ.append(",\"preload_fail_requests\":");
                            sbLIZ.append(list);
                            sbLIZ.append("}");
                            c1023640ckE.withParam(c1002190cBd2, C2188811AlT.LIZIZ(sbLIZ));
                            return null;
                        }
                    });
                }
                C01GW c01gw2 = UploadAdWebPreloadInfoConfig.LIZIZ;
                if (((UploadAdWebPreloadInfoConfig.UAWPIConfig) c01gw2.getValue()).perfRate < 1 || new Random().nextInt(((UploadAdWebPreloadInfoConfig.UAWPIConfig) c01gw2.getValue()).perfRate) == 0) {
                    ((InterfaceC1009950cO9) ServiceManager.get().getService(IAdWebEventLogger.class)).logAd(C1043510dGH.LJIIJ, String.valueOf(interfaceC1041500dD2.getRealCreativeId()), interfaceC1041500dD2.getRealLogExtra(), null, new Function1() { // from class: X.0dFx
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            String str2 = str;
                            C1043260dFs c1043260dFs2 = c1043260dFs;
                            int i7 = preloadWebStatus;
                            InterfaceC1041500dD2 interfaceC1041500dD22 = interfaceC1041500dD2;
                            C1043270dFt c1043270dFt2 = c1043270dFt;
                            C1023640ckE c1023640ckE = (C1023640ckE) obj3;
                            C1043500dGG.LIZ.getClass();
                            c1023640ckE.withParam(C1043500dGG.LJJII, str2);
                            c1023640ckE.withParam(C1043500dGG.LJJJI, c1043260dFs2.LIZ);
                            c1023640ckE.withParam(C1043500dGG.LJJJ, Integer.valueOf(i7));
                            c1023640ckE.withParam(C1043500dGG.LJIIJJI, Integer.valueOf(interfaceC1041500dD22.getIsFromJsb() ? 1 : 0));
                            c1023640ckE.withParam(C1043500dGG.LJIILJJIL, Integer.valueOf(interfaceC1041500dD22.getIsFirstPage()));
                            c1023640ckE.withParam(C1043500dGG.LJJJJ, Long.valueOf(c1043270dFt2.LJII));
                            c1023640ckE.withParam(C1043500dGG.LJJJJI, Long.valueOf(c1043270dFt2.LJIIIIZZ));
                            c1023640ckE.withParam(C1043500dGG.LJJJJIZL, Long.valueOf(c1043270dFt2.LJIIIZ));
                            c1023640ckE.withParam(C1043500dGG.LJJJJJ, Long.valueOf(c1043270dFt2.LJIIJ));
                            c1023640ckE.withParam(C1043500dGG.LJJJJJL, Long.valueOf(c1043270dFt2.LJIIJJI));
                            c1023640ckE.withParam(C1043500dGG.LJJJJL, Long.valueOf(c1043270dFt2.LJIIL));
                            c1023640ckE.withParam(C1043500dGG.LJJJJLI, Long.valueOf(c1043260dFs2.LJIILL));
                            c1023640ckE.withParam(C1043500dGG.LJJJJLL, Long.valueOf(c1043260dFs2.LJIILJJIL));
                            return null;
                        }
                    });
                }
                c1043260dFs.LJII = 0;
                c1043260dFs.LJIIIIZZ = 0;
                c1043260dFs.LJIIJ = 0;
                c1043260dFs.LJIIIZ = 0;
                c1043260dFs.LJIIJJI = 0;
                c1043260dFs.LJFF.clear();
                c1043260dFs.LJI.clear();
            }
        }
    }
}
