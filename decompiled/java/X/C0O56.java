package X;

import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.ss.android.ugc.aweme.ecommerce.dependency.HybridDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O56, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O56 {
    public static final C0O56 LIZ = new C0O56();
    public static final ConcurrentHashMap<String, Boolean> LIZIZ = new ConcurrentHashMap<>();
    public static final C054G LIZJ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public static final ConcurrentHashMap<String, C09AE> LIZLLL = new ConcurrentHashMap<>();

    static {
        new BPEAHandler(Looper.getMainLooper());
    }

    public static void LIZ(final String str) {
        AnonymousClass0317 anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = HybridDependencyService.createIHybridDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IHybridDependencyService.class.getName();
            if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IHybridDependencyService.class);
        }
        IHybridDependencyService iHybridDependencyService = (IHybridDependencyService) anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin;
        final String accessKey = iHybridDependencyService.getAccessKey();
        if (accessKey != null && accessKey.length() != 0) {
            if (iHybridDependencyService.isGeckoBundleExists(str)) {
                LIZIZ.put(str, Boolean.TRUE);
                return;
            }
            C1551330qTL.LIZ.getClass();
            if (C1551330qTL.LJIIIIZZ(accessKey, str)) {
                LIZIZ.put(str, Boolean.TRUE);
                return;
            }
            C1551950qUL c1551950qULInitGeckoXMultiClient = iHybridDependencyService.initGeckoXMultiClient();
            if (c1551950qULInitGeckoXMultiClient == null) {
                return;
            }
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setEnableDownloadAutoRetry(true);
            optionCheckUpdateParams.setChannelUpdatePriority(3);
            optionCheckUpdateParams.setFrom("ec_search_loading_preload");
            optionCheckUpdateParams.setListener(new AbstractC1552040qUU() { // from class: X.09aY
                public final AtomicBoolean LIZ = new AtomicBoolean(false);

                @Override // X.AbstractC1552040qUU
                public final void LJJ(long j, String str2) {
                }

                public final void LJJI() {
                    if (this.LIZ.compareAndSet(false, true)) {
                        C0O56.LIZ.getClass();
                    }
                }

                @Override // X.AbstractC1552040qUU
                public final void LJIILLIIL(LocalPackageModel localPackageModel) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onLocalNewestVersion: channel=");
                    sbLIZ.append(localPackageModel.getChannel());
                    C2188811AlT.LIZIZ(sbLIZ);
                    String channel = localPackageModel.getChannel();
                    if (channel != null) {
                        C0O56.LIZIZ.put(channel, Boolean.TRUE);
                    }
                    LJJI();
                }

                @Override // X.AbstractC1552040qUU
                public final void LJ(UpdatePackage updatePackage, Throwable th) {
                    String channel;
                    String message;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onActivateFail: channel=");
                    String message2 = null;
                    if (updatePackage != null) {
                        channel = updatePackage.getChannel();
                    } else {
                        channel = null;
                    }
                    sbLIZ.append(channel);
                    sbLIZ.append(", error=");
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    sbLIZ.append(message);
                    C2188811AlT.LIZIZ(sbLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("activate failed: ");
                    if (th != null) {
                        message2 = th.getMessage();
                    }
                    sbLIZ2.append(message2);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    LJJI();
                }

                @Override // X.AbstractC1552040qUU
                public final void LJII(Throwable th, Map map) {
                    String message;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onCheckServerVersionFail: ");
                    String message2 = null;
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    sbLIZ.append(message);
                    C2188811AlT.LIZIZ(sbLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("check server version failed: ");
                    if (th != null) {
                        message2 = th.getMessage();
                    }
                    sbLIZ2.append(message2);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    LJJI();
                }

                @Override // X.AbstractC1552040qUU
                public final void LJIIIIZZ(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
                    List<UpdatePackage> list;
                    List<Pair<String, Long>> list2;
                    if (map != null && (list2 = map.get(accessKey)) != null) {
                        String str2 = str;
                        Iterator<Pair<String, Long>> it2 = list2.iterator();
                        while (it2.hasNext() && !Intrinsics.LJFF(it2.next().first, str2)) {
                        }
                    }
                    if (map2 != null && (list = map2.get(accessKey)) != null) {
                        String str3 = str;
                        Iterator<UpdatePackage> it3 = list.iterator();
                        while (it3.hasNext() && !Intrinsics.LJFF(it3.next().getChannel(), str3)) {
                        }
                    }
                }

                @Override // X.AbstractC1552040qUU
                public final void LJIIJJI(UpdatePackage updatePackage, Throwable th) {
                    String channel;
                    String message;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onDownloadFail: channel=");
                    String message2 = null;
                    if (updatePackage != null) {
                        channel = updatePackage.getChannel();
                    } else {
                        channel = null;
                    }
                    sbLIZ.append(channel);
                    sbLIZ.append(", error=");
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    sbLIZ.append(message);
                    C2188811AlT.LIZIZ(sbLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("download failed: ");
                    if (th != null) {
                        message2 = th.getMessage();
                    }
                    sbLIZ2.append(message2);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    LJJI();
                }

                @Override // X.AbstractC1552040qUU
                public final void LJIJ(UpdatePackage updatePackage, Throwable th) {
                    String channel;
                    String message;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onUpdateFailed: channel=");
                    String message2 = null;
                    if (updatePackage != null) {
                        channel = updatePackage.getChannel();
                    } else {
                        channel = null;
                    }
                    sbLIZ.append(channel);
                    sbLIZ.append(", error=");
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    sbLIZ.append(message);
                    C2188811AlT.LIZIZ(sbLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("update failed: ");
                    if (th != null) {
                        message2 = th.getMessage();
                    }
                    sbLIZ2.append(message2);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    LJJI();
                }

                @Override // X.AbstractC1552040qUU
                public final void LJIL(long j, UpdatePackage updatePackage) {
                    String channel;
                    String channel2;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onUpdateSuccess(UpdatePackage): channel=");
                    if (updatePackage != null) {
                        channel = updatePackage.getChannel();
                    } else {
                        channel = null;
                    }
                    sbLIZ.append(channel);
                    sbLIZ.append(", version=");
                    sbLIZ.append(j);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (updatePackage != null && (channel2 = updatePackage.getChannel()) != null) {
                        C0O56.LIZIZ.put(channel2, Boolean.TRUE);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("update success, version=");
                    sbLIZ2.append(j);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    LJJI();
                }

                @Override // X.AbstractC1552040qUU
                public final void LJI(int i, Throwable th, Map map) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onCheckRequestIntercept: code=");
                    sbLIZ.append(i);
                    sbLIZ.append(", error=");
                    sbLIZ.append(th.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("request intercepted: code=");
                    sbLIZ2.append(i);
                    sbLIZ2.append(", ");
                    sbLIZ2.append(th.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ2);
                    LJJI();
                }

                @Override // X.AbstractC1552040qUU
                public final void LJIIIZ(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2, C1551680qTu c1551680qTu) {
                    List<Pair<String, Long>> list;
                    if (map != null && (list = map.get(accessKey)) != null) {
                        String str2 = str;
                        Iterator<Pair<String, Long>> it2 = list.iterator();
                        while (it2.hasNext() && !Intrinsics.LJFF(it2.next().first, str2)) {
                        }
                    }
                    List list2 = (List) ((HashMap) map2).get(accessKey);
                    if (list2 != null) {
                        String str3 = str;
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext() && !Intrinsics.LJFF(((UpdatePackage) it3.next()).getChannel(), str3)) {
                        }
                    }
                }
            });
            c1551950qULInitGeckoXMultiClient.LIZ(null, C2097908Jt.LIZJ(new kotlin.Pair(accessKey, Collections.singletonList(new CheckRequestBodyModel.TargetChannel(str)))), optionCheckUpdateParams);
        }
    }
}
