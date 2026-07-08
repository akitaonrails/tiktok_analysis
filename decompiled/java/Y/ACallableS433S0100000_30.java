package Y;

import X.AbstractC20156113tn;
import X.AnonymousClass1455;
import X.C093Z;
import X.C10UI;
import X.C1325710kbR;
import X.C1334160kp4;
import X.C13TF;
import X.C13TL;
import X.C148I;
import X.C148M;
import X.C14U0;
import X.C1BLW;
import X.C1C7U;
import X.C20155213te;
import X.C20155613ti;
import X.C20157013tw;
import X.C202035143l;
import X.C202043143t;
import X.InterfaceC202028143e;
import X.InterfaceC2203391BLl;
import android.net.Uri;
import android.util.LruCache;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.pitaya.api.feature.IFeatureCore;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.comment.pitaya.M18nClientAiPitayaDownloadSettings;
import com.ss.android.ugc.aweme.ecommerce.image.EcomImageXConfigModel;
import com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public class ACallableS433S0100000_30 implements Callable {
    public final int $t;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS433S0100000_30 aCallableS433S0100000_30) {
        C1C7U.LIZ("LegacyMusicFetcher@caed.fetchInternal$2");
        ((InterfaceC202028143e) aCallableS433S0100000_30.l0).LIZJ(new C202035143l(4, "MusicFetcher music id is empty"));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LegacyMusicFetcher@caed.fetchInternal$2");
        return unit;
    }

    public static final Object call$1(ACallableS433S0100000_30 aCallableS433S0100000_30) {
        C1C7U.LIZ("LegacyMusicFetcher@caed.fetchInternal$3");
        ((InterfaceC202028143e) aCallableS433S0100000_30.l0).LIZJ(new C202035143l(6, "MusicFetcher download not online music"));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LegacyMusicFetcher@caed.fetchInternal$3");
        return unit;
    }

    public static final Object call$2(ACallableS433S0100000_30 aCallableS433S0100000_30) {
        C1C7U.LIZ("MainThreadMusicDownloadListener@7489.onCancel$1");
        ((C202043143t) aCallableS433S0100000_30.l0).LIZ.onCancel();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MainThreadMusicDownloadListener@7489.onCancel$1");
        return unit;
    }

    public static final Object call$3(ACallableS433S0100000_30 aCallableS433S0100000_30) {
        C1C7U.LIZ("MainThreadMusicDownloadListener@7489.onStart$1");
        ((C202043143t) aCallableS433S0100000_30.l0).LIZ.onStart();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MainThreadMusicDownloadListener@7489.onStart$1");
        return unit;
    }

    public static final Object call$4(ACallableS433S0100000_30 aCallableS433S0100000_30) {
        C1C7U.LIZ("DiskLruCache@9288.<field>$5");
        synchronized (((C13TF) aCallableS433S0100000_30.l0)) {
            try {
                C13TF c13tf = (C13TF) aCallableS433S0100000_30.l0;
                if (c13tf.LLJ != null) {
                    c13tf.LJJIL();
                    if (((C13TF) aCallableS433S0100000_30.l0).LJI()) {
                        ((C13TF) aCallableS433S0100000_30.l0).LJIJJ();
                        ((C13TF) aCallableS433S0100000_30.l0).LLJIJIL = 0;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1C7U.LIZIZ("DiskLruCache@9288.<field>$5");
        return null;
    }

    public static final Object call$5(ACallableS433S0100000_30 aCallableS433S0100000_30) throws JSONException {
        List<String> list;
        Object objOpt;
        C1C7U.LIZ("AdPitayaService@503a.cachePitayaKVData$1");
        if (!C10UI.LIZ()) {
            ((C148I) aCallableS433S0100000_30.l0).getClass();
            if (C148I.LIZIZ()) {
                ((C148I) aCallableS433S0100000_30.l0).getClass();
                IFeatureCore iFeatureCoreLIZ = C148I.LIZ();
                if (iFeatureCoreLIZ != null) {
                    JSONObject kVData = iFeatureCoreLIZ.createInMemoryKVStore("tiktok_clientai_cloud_local_predict").getKVData();
                    M18nClientAiPitayaDownloadSettings.PitayaKeyNameModel pitayaKeyNameModelLIZ = M18nClientAiPitayaDownloadSettings.LIZ();
                    if (pitayaKeyNameModelLIZ != null) {
                        list = pitayaKeyNameModelLIZ.keyNameList;
                    } else {
                        list = null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    if (list != null) {
                        for (String str : list) {
                            if (kVData != null) {
                                objOpt = kVData.opt(str);
                            } else {
                                objOpt = null;
                            }
                            jSONObject.put(str, objOpt);
                        }
                    }
                    C148M.LIZ.storeString("client_ai_download_json_str", String.valueOf(jSONObject));
                }
            }
        } else {
            AnonymousClass1455 anonymousClass1455 = AnonymousClass1455.LIZ;
            new AwS574S0100000_30((C148I) aCallableS433S0100000_30.l0, 19);
            anonymousClass1455.getClass();
            IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
            if (iPluginService != null && iPluginService.LIZLLL() != null) {
                C1BLW.LIZJ("com.ss.android.ugc.aweme.pitaya", new InterfaceC2203391BLl() { // from class: X.148L
                    @Override // X.InterfaceC2203391BLl
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC2425409eu
                    public final void LIZ(AbstractC2457909k9 abstractC2457909k9) {
                        abstractC2457909k9.LJII();
                    }
                });
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdPitayaService@503a.cachePitayaKVData$1");
        return unit;
    }

    public static final Object call$6(ACallableS433S0100000_30 aCallableS433S0100000_30) {
        Unit unit;
        C1C7U.LIZ("ImageChooseUploadActivity@57f9.upload$2");
        C14U0 c14u0 = ImageChooseUploadActivity.LLJILLL;
        if (c14u0 != null) {
            ImageChooseUploadActivity imageChooseUploadActivity = (ImageChooseUploadActivity) aCallableS433S0100000_30.l0;
            c14u0.multiUploadImages(imageChooseUploadActivity.LLIZ, new AwS574S0100000_30(imageChooseUploadActivity, 315));
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("ImageChooseUploadActivity@57f9.upload$2");
        return unit;
    }

    public static final Object call$7(ACallableS433S0100000_30 aCallableS433S0100000_30) {
        C1C7U.LIZ("DiskLruCache@6835.<field>$5");
        synchronized (((C13TL) aCallableS433S0100000_30.l0)) {
            try {
                C13TL c13tl = (C13TL) aCallableS433S0100000_30.l0;
                if (c13tl.LLJ != null) {
                    c13tl.LJJ();
                    if (((C13TL) aCallableS433S0100000_30.l0).LJI()) {
                        ((C13TL) aCallableS433S0100000_30.l0).LJIJJ();
                        ((C13TL) aCallableS433S0100000_30.l0).LLJIJIL = 0;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1C7U.LIZIZ("DiskLruCache@6835.<field>$5");
        return null;
    }

    public static final Object call$8(ACallableS433S0100000_30 aCallableS433S0100000_30) {
        Uri uri;
        String str;
        C1C7U.LIZ("EcomImageMonitorHookerKt@ac24.provideMonitorHook$1$2");
        C1325710kbR c1325710kbR = (C1325710kbR) aCallableS433S0100000_30.l0;
        if (c1325710kbR != null && (uri = c1325710kbR.LIZIZ) != null) {
            LruCache<String, Boolean> lruCache = C20155213te.LIZ;
            String encodedPath = uri.getEncodedPath();
            if (C20155213te.LIZIZ.get(encodedPath) == null) {
                LruCache<String, C20155613ti> lruCache2 = C20155613ti.LJIIL;
                C20155613ti c20155613tiLIZIZ = C1334160kp4.LIZIZ(uri);
                if (c20155613tiLIZIZ != null) {
                    C20157013tw.LIZIZ.getClass();
                    Iterator<AbstractC20156113tn> it2 = C20157013tw.LIZLLL.iterator();
                    while (it2.hasNext()) {
                        List<EcomImageXConfigModel> listLIZJ = it2.next().LIZJ(c20155613tiLIZIZ.LIZJ);
                        if (listLIZJ != null) {
                            for (EcomImageXConfigModel ecomImageXConfigModel : listLIZJ) {
                                EcomImageXConfigModel ecomImageXConfigModel2 = ecomImageXConfigModel;
                                if (Intrinsics.LJFF(ecomImageXConfigModel2.template, c20155613tiLIZIZ.LIZLLL) || ((str = ecomImageXConfigModel2.f56default) != null && a0.LJJIIZI(str, c20155613tiLIZIZ.LIZLLL, false))) {
                                    if (ecomImageXConfigModel != null) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ConcurrentHashMap<String, TreeSet<C20155613ti>> concurrentHashMap = C20155213te.LIZLLL;
                    TreeSet<C20155613ti> treeSetLIZ = concurrentHashMap.get(c20155613tiLIZIZ.LIZIZ);
                    if (treeSetLIZ == null) {
                        treeSetLIZ = C093Z.LIZ(C20155213te.LIZJ, new C20155613ti[0]);
                        concurrentHashMap.put(c20155613tiLIZIZ.LIZIZ, treeSetLIZ);
                    }
                    synchronized (concurrentHashMap) {
                        try {
                            treeSetLIZ.add(c20155613tiLIZIZ);
                            C20155213te.LIZIZ.put(encodedPath, c20155613tiLIZIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcomImageMonitorHookerKt@ac24.provideMonitorHook$1$2");
        return unit;
    }

    public ACallableS433S0100000_30(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
