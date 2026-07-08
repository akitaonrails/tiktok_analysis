package X;

import com.bytedance.goda.v2.model.dto.GodaV2Container;
import com.bytedance.goda.v2.model.dto.GodaV2Protocol;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.SeaPdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.goda.SeaGodaManagerV2;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECSeaPdpCardConfig;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECSeaPdpPreloadCardModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcSeaPdpPreloadConfigModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcSeaPdpPreloadSceneConfig;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcSeaPdpPreloadSceneModel;
import com.tiktok.myna.preload.MynaGeckoChannelPreloadInfo;
import com.tiktok.myna.preload.MynaTemplatePreloadInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vqy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1758180vqy {
    public static final C1758180vqy LIZ = new C1758180vqy();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(468));

    public static void LIZ() {
        EcSeaPdpPreloadSceneConfig ecSeaPdpPreloadSceneConfig;
        EcSeaPdpPreloadSceneModel ecSeaPdpPreloadSceneModel;
        List<ECSeaPdpPreloadCardModel> list;
        EcSeaPdpPreloadSceneConfig ecSeaPdpPreloadSceneConfig2;
        EcSeaPdpPreloadSceneModel ecSeaPdpPreloadSceneModel2;
        List<ECSeaPdpPreloadCardModel> list2;
        EcSeaPdpPreloadSceneConfig ecSeaPdpPreloadSceneConfig3;
        EcSeaPdpPreloadSceneModel ecSeaPdpPreloadSceneModel3;
        List<ECSeaPdpPreloadCardModel> list3;
        EcSeaPdpPreloadSceneConfig ecSeaPdpPreloadSceneConfig4;
        EcSeaPdpPreloadSceneModel ecSeaPdpPreloadSceneModel4;
        List<ECSeaPdpPreloadCardModel> list4;
        LinkedHashSet<ECSeaPdpPreloadCardModel> linkedHashSet = new LinkedHashSet();
        C1758190vqz.LIZ.getClass();
        EcSeaPdpPreloadConfigModel ecSeaPdpPreloadConfigModelLIZ = C1758190vqz.LIZ();
        if (ecSeaPdpPreloadConfigModelLIZ != null && (ecSeaPdpPreloadSceneConfig4 = ecSeaPdpPreloadConfigModelLIZ.preloadScene) != null && (ecSeaPdpPreloadSceneModel4 = ecSeaPdpPreloadSceneConfig4.routerJump) != null && (list4 = ecSeaPdpPreloadSceneModel4.tasks) != null) {
            linkedHashSet.addAll(list4);
        }
        EcSeaPdpPreloadConfigModel ecSeaPdpPreloadConfigModelLIZ2 = C1758190vqz.LIZ();
        if (ecSeaPdpPreloadConfigModelLIZ2 != null && (ecSeaPdpPreloadSceneConfig3 = ecSeaPdpPreloadConfigModelLIZ2.preloadScene) != null && (ecSeaPdpPreloadSceneModel3 = ecSeaPdpPreloadSceneConfig3.cacheRenderEnd) != null && (list3 = ecSeaPdpPreloadSceneModel3.tasks) != null) {
            linkedHashSet.addAll(list3);
        }
        EcSeaPdpPreloadConfigModel ecSeaPdpPreloadConfigModelLIZ3 = C1758190vqz.LIZ();
        if (ecSeaPdpPreloadConfigModelLIZ3 != null && (ecSeaPdpPreloadSceneConfig2 = ecSeaPdpPreloadConfigModelLIZ3.preloadScene) != null && (ecSeaPdpPreloadSceneModel2 = ecSeaPdpPreloadSceneConfig2.noCachePreload) != null && (list2 = ecSeaPdpPreloadSceneModel2.tasks) != null) {
            linkedHashSet.addAll(list2);
        }
        EcSeaPdpPreloadConfigModel ecSeaPdpPreloadConfigModelLIZ4 = C1758190vqz.LIZ();
        if (ecSeaPdpPreloadConfigModelLIZ4 != null && (ecSeaPdpPreloadSceneConfig = ecSeaPdpPreloadConfigModelLIZ4.preloadScene) != null && (ecSeaPdpPreloadSceneModel = ecSeaPdpPreloadSceneConfig.onlineRenderEnd) != null && (list = ecSeaPdpPreloadSceneModel.tasks) != null) {
            linkedHashSet.addAll(list);
        }
        for (ECSeaPdpPreloadCardModel eCSeaPdpPreloadCardModel : linkedHashSet) {
            C1758180vqy c1758180vqy = LIZ;
            String str = eCSeaPdpPreloadCardModel.type;
            c1758180vqy.getClass();
            Pair pairLIZIZ = LIZIZ(null, str);
            if (pairLIZIZ != null) {
                Object first = pairLIZIZ.getFirst();
                Object second = pairLIZIZ.getSecond();
                if (Intrinsics.LJFF(first, EnumC1757810vqN.MYNA.getValue())) {
                    C21322218cO.LIZ.getClass();
                    C21322218cO.LJI.LIZ.remove((String) second);
                    C1759030vsL c1759030vsL = C21322218cO.LJII;
                    synchronized (c1759030vsL) {
                        C1758200vr0 c1758200vr0 = c1759030vsL.LIZ.get(second);
                        if (c1758200vr0 != null) {
                            c1758200vr0.LIZ.clear();
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public static Pair LIZIZ(InterfaceC665370Q7z interfaceC665370Q7z, String str) {
        Map<String, ECSeaPdpCardConfig> map;
        ECSeaPdpCardConfig eCSeaPdpCardConfig;
        Object ability;
        GodaV2Protocol<?> godaV2Protocol;
        Map<String, GodaV2Container> map2;
        GodaV2Container godaV2Container;
        if (str == null) {
            return null;
        }
        if (interfaceC665370Q7z != null) {
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(interfaceC665370Q7z, SeaPdpFragmentScope.class);
            if (c0qsjLIZJ != null) {
                ability = c0qsjLIZJ.getAbility(SeaGodaManagerV2.class);
            } else {
                ability = null;
            }
            if (!(ability instanceof SeaGodaManagerV2)) {
                ability = null;
            }
            SeaGodaManagerV2 seaGodaManagerV2 = (SeaGodaManagerV2) ability;
            if (seaGodaManagerV2 != null && (godaV2Protocol = seaGodaManagerV2.LLILZ) != null && (map2 = godaV2Protocol.container) != null && (godaV2Container = map2.get(str)) != null) {
                String str2 = godaV2Container.containerType;
                String str3 = godaV2Container.template;
                if (str2 != null && str3 != null) {
                    return new Pair(str2, str3);
                }
            }
        }
        C1758190vqz.LIZ.getClass();
        EcSeaPdpPreloadConfigModel ecSeaPdpPreloadConfigModelLIZ = C1758190vqz.LIZ();
        if (ecSeaPdpPreloadConfigModelLIZ == null || (map = ecSeaPdpPreloadConfigModelLIZ.schemaConfig) == null || (eCSeaPdpCardConfig = map.get(str)) == null) {
            return null;
        }
        String str4 = eCSeaPdpCardConfig.type;
        String str5 = eCSeaPdpCardConfig.template;
        if (str4 == null || str5 == null) {
            return null;
        }
        return new Pair(str4, str5);
    }

    public static void LIZJ(EnumC1757510vpt enumC1757510vpt, InterfaceC665370Q7z interfaceC665370Q7z, AbstractC21321718cJ abstractC21321718cJ) {
        EcSeaPdpPreloadSceneConfig ecSeaPdpPreloadSceneConfig;
        EcSeaPdpPreloadSceneModel ecSeaPdpPreloadSceneModel;
        EcSeaPdpPreloadSceneConfig ecSeaPdpPreloadSceneConfig2;
        EcSeaPdpPreloadSceneConfig ecSeaPdpPreloadSceneConfig3;
        EcSeaPdpPreloadSceneConfig ecSeaPdpPreloadSceneConfig4;
        int i = C1757500vps.LIZ[enumC1757510vpt.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        C1758190vqz.LIZ.getClass();
                        EcSeaPdpPreloadConfigModel ecSeaPdpPreloadConfigModelLIZ = C1758190vqz.LIZ();
                        if (ecSeaPdpPreloadConfigModelLIZ != null && (ecSeaPdpPreloadSceneConfig4 = ecSeaPdpPreloadConfigModelLIZ.preloadScene) != null) {
                            ecSeaPdpPreloadSceneModel = ecSeaPdpPreloadSceneConfig4.onlineRenderEnd;
                        } else {
                            return;
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    C1758190vqz.LIZ.getClass();
                    EcSeaPdpPreloadConfigModel ecSeaPdpPreloadConfigModelLIZ2 = C1758190vqz.LIZ();
                    if (ecSeaPdpPreloadConfigModelLIZ2 == null || (ecSeaPdpPreloadSceneConfig3 = ecSeaPdpPreloadConfigModelLIZ2.preloadScene) == null) {
                        return;
                    } else {
                        ecSeaPdpPreloadSceneModel = ecSeaPdpPreloadSceneConfig3.cacheRenderEnd;
                    }
                }
            } else {
                C1758190vqz.LIZ.getClass();
                EcSeaPdpPreloadConfigModel ecSeaPdpPreloadConfigModelLIZ3 = C1758190vqz.LIZ();
                if (ecSeaPdpPreloadConfigModelLIZ3 == null || (ecSeaPdpPreloadSceneConfig2 = ecSeaPdpPreloadConfigModelLIZ3.preloadScene) == null) {
                    return;
                } else {
                    ecSeaPdpPreloadSceneModel = ecSeaPdpPreloadSceneConfig2.noCachePreload;
                }
            }
        } else {
            C1758190vqz.LIZ.getClass();
            EcSeaPdpPreloadConfigModel ecSeaPdpPreloadConfigModelLIZ4 = C1758190vqz.LIZ();
            if (ecSeaPdpPreloadConfigModelLIZ4 == null || (ecSeaPdpPreloadSceneConfig = ecSeaPdpPreloadConfigModelLIZ4.preloadScene) == null) {
                return;
            } else {
                ecSeaPdpPreloadSceneModel = ecSeaPdpPreloadSceneConfig.routerJump;
            }
        }
        if (ecSeaPdpPreloadSceneModel != null) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1757540vpw(ecSeaPdpPreloadSceneModel, interfaceC665370Q7z, enumC1757510vpt, abstractC21321718cJ, null), 2);
        }
    }

    public static void LIZLLL(EnumC1757490vpr enumC1757490vpr, MynaTemplatePreloadInfo mynaTemplatePreloadInfo, AbstractC21321718cJ abstractC21321718cJ) {
        int size;
        ArrayList<C21323318cZ> arrayList;
        AtomicBoolean atomicBoolean = LIZIZ;
        if (!atomicBoolean.get()) {
            C21320418c6.LIZ.LIZ();
            C2188561Al4 c2188561Al4 = C476250Ilz.LIZ;
            C1758170vqx c1758170vqx = (C1758170vqx) LIZJ.getValue();
            c2188561Al4.getClass();
            C2188561Al4.LJII(c1758170vqx);
            atomicBoolean.set(true);
        }
        int i = C1757500vps.LIZIZ[enumC1757490vpr.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C21322218cO c21322218cO = C21322218cO.LIZ;
                MynaGeckoChannelPreloadInfo mynaGeckoChannelPreloadInfo = new MynaGeckoChannelPreloadInfo(Collections.singletonList(mynaTemplatePreloadInfo));
                c21322218cO.getClass();
                C21322218cO.LJIIIIZZ("sea_pdp", mynaGeckoChannelPreloadInfo, true, abstractC21321718cJ);
                return;
            }
            return;
        }
        String str = mynaTemplatePreloadInfo.url;
        if (str == null) {
            return;
        }
        C21322218cO.LIZ.getClass();
        C1759030vsL c1759030vsL = C21322218cO.LJII;
        synchronized (c1759030vsL) {
            C1758200vr0 c1758200vr0 = c1759030vsL.LIZ.get(str);
            if (c1758200vr0 != null && (arrayList = c1758200vr0.LIZ) != null) {
                size = arrayList.size();
            } else {
                size = 0;
            }
        }
        if (mynaTemplatePreloadInfo.num <= size) {
            return;
        }
        C21322218cO.LJI("sea_pdp", C7879035x.LIZ(), new MynaGeckoChannelPreloadInfo(Collections.singletonList(new MynaTemplatePreloadInfo(mynaTemplatePreloadInfo.name, mynaTemplatePreloadInfo.url, mynaTemplatePreloadInfo.num - size))), true, abstractC21321718cJ);
    }
}
