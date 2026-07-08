package X;

import android.net.Uri;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.dsp.experiment.TTSynergyGeckoPreloadItem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.15am, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20547815am {
    public static final C20547815am LIZ = new C20547815am();

    public static void LIZ(String str, EnumC20548115ap enumC20548115ap) {
        TTSynergyGeckoPreloadItem tTSynergyGeckoPreloadItem;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        switch (C20548015ao.LIZ[enumC20548115ap.ordinal()]) {
            case 1:
                tTSynergyGeckoPreloadItem = C20547915an.LIZJ;
                break;
            case 2:
                tTSynergyGeckoPreloadItem = C20547915an.LJI;
                break;
            case 3:
                tTSynergyGeckoPreloadItem = C20547915an.LIZLLL;
                break;
            case 4:
                tTSynergyGeckoPreloadItem = C20547915an.LJ;
                break;
            case 5:
                tTSynergyGeckoPreloadItem = C20547915an.LJFF;
                break;
            case 6:
                tTSynergyGeckoPreloadItem = C20547915an.LJII;
                break;
            case 7:
                tTSynergyGeckoPreloadItem = C20547915an.LJIIIIZZ;
                break;
            case 8:
                tTSynergyGeckoPreloadItem = C20547915an.LJIIIZ;
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                tTSynergyGeckoPreloadItem = C20547915an.LJIIJ;
                break;
            default:
                tTSynergyGeckoPreloadItem = C20547915an.LJIIJJI;
                break;
        }
        if (!tTSynergyGeckoPreloadItem.LIZ) {
            try {
                Uri uri = UriProtector.parse(str);
                if (C13LP.LJJJJ(uri.getHost(), C1697810uHb.LJIIJJI("lynxview", "lynxview_popup"))) {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "channel");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                        str2 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (tTSynergyGeckoPreloadItem.enablePreloadFromSchema && C123100dR.LIZ(str2)) {
                LIZIZ(Collections.singletonList(str2), tTSynergyGeckoPreloadItem);
            } else if (tTSynergyGeckoPreloadItem.enablePreloadChannels) {
                List<String> list = tTSynergyGeckoPreloadItem.predefinedGeckoChannels;
                if (!list.isEmpty()) {
                    LIZIZ(list, tTSynergyGeckoPreloadItem);
                }
            }
        }
    }

    public static void LIZIZ(List list, TTSynergyGeckoPreloadItem tTSynergyGeckoPreloadItem) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (str != null && str.length() != 0) {
                    arrayList.add(new CheckRequestBodyModel.TargetChannel(str));
                }
            }
            if (!arrayList.isEmpty()) {
                try {
                    OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
                    optionCheckUpdateParams.setLazyUpdate(true);
                    String accessKey = ((IMainService) ServiceManager.get().getService(IMainService.class)).getAccessKey();
                    C1537050q6J.LIZ.getClass();
                    C1551950qUL c1551950qULLIZ = C1537050q6J.LIZ(accessKey);
                    if (c1551950qULLIZ != null) {
                        c1551950qULLIZ.LIZ(null, C2097908Jt.LIZJ(new Pair(accessKey, arrayList)), optionCheckUpdateParams);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                if (C20547915an.LJIIL) {
                    tTSynergyGeckoPreloadItem.LIZ = true;
                }
            }
        }
    }
}
