package X;

import android.os.Build;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.aweme.resource.TemplateApi;
import com.ss.android.ugc.aweme.tools.AVApi;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetItemInfo;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetCondition;
import com.ss.android.ugc.effectmanager.effect.model.Author;
import com.ss.android.ugc.effectmanager.effect.model.BusinessExtra;
import com.ss.android.ugc.effectmanager.effect.model.CoverInfo;
import com.ss.android.ugc.effectmanager.effect.model.FileInf;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsQueryAdditionalParameters;
import com.ss.android.ugc.effectmanager.effect.model.MixedItemAssetsRequestBodyInfo;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetItemResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0myf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1416990myf {
    public static final C1416990myf LIZ = new C1416990myf();
    public static final TemplateApi LIZIZ;
    public static final C01GW LIZJ;

    static {
        NLE.loadNLELibrary$default(NLE.INSTANCE, true, C293550Bez.LIZ(), false, 4, null);
        new C11PQ();
        C0CHQ.LIZ().getApplicationService().getClass();
        LIZIZ = (TemplateApi) C0CHQ.LIZ().getNetworkService().createRetrofit(((AVApi) ServiceManager.get().getService(AVApi.class)).LIZ(), true, TemplateApi.class);
        LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(485));
    }

    public static C532330KuF LIZ(Asset asset) {
        String str;
        String uri;
        String str2;
        String name;
        String nle_summary;
        String music_id;
        List<String> hashtag;
        List<String> url_list;
        List<String> url_list2;
        FileInf file = asset.getFile();
        ArrayList arrayList = null;
        if (file != null && (url_list2 = file.getUrl_list()) != null) {
            str = (String) C13LP.LJJJLL(url_list2);
        } else {
            str = null;
        }
        FileInf file2 = asset.getFile();
        if (file2 != null) {
            uri = file2.getUri();
        } else {
            uri = null;
        }
        Long lValueOf = Long.valueOf(asset.getAsset_type());
        CoverInfo cover = asset.getCover();
        if (cover != null && (url_list = cover.getUrl_list()) != null) {
            str2 = (String) C13LP.LJJJLL(url_list);
        } else {
            str2 = null;
        }
        String title = asset.getTitle();
        Author author = asset.getAuthor();
        if (author != null) {
            name = author.getName();
        } else {
            name = null;
        }
        String extra = asset.getExtra();
        BusinessExtra business_extra = asset.getBusiness_extra();
        if (business_extra != null) {
            nle_summary = business_extra.getNle_summary();
        } else {
            nle_summary = null;
        }
        BusinessExtra business_extra2 = asset.getBusiness_extra();
        if (business_extra2 != null) {
            music_id = business_extra2.getMusic_id();
        } else {
            music_id = null;
        }
        List<String> tags = asset.getTags();
        BusinessExtra business_extra3 = asset.getBusiness_extra();
        if (business_extra3 != null && (hashtag = business_extra3.getHashtag()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (String str3 : hashtag) {
                if (str3.length() > 0) {
                    arrayList2.add(str3);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new C532330KuF(str, uri, lValueOf, str2, title, name, extra, nle_summary, music_id, tags, arrayList);
    }

    public static C11NZ LIZIZ(List list, Pair pair, int i, String str, String str2) {
        TemplateApi templateApi = LIZIZ;
        String json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), list);
        String str3 = (String) pair.getFirst();
        String str4 = (String) pair.getSecond();
        C1429050nI7.LIZ.getClass();
        Map<C0CIJ, C311200CHu> map = C311170CHr.LIZ;
        C0CHQ.LIZ().getApplicationService();
        String strValueOf = String.valueOf(C19221910Hx.LIZ());
        C0CHQ.LIZ().getApplicationService();
        String strLIZIZ = C19221910Hx.LIZIZ();
        String effectSDKVersion = C0CHQ.LIZ().LJJJ().getEffectSDKVersion();
        C0CHQ.LIZ().getRegionService();
        String strLIZ = C20186013yc.LIZ();
        C0CHQ.LIZ().getApplicationService().getClass();
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        if (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId == null) {
            strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = "";
        }
        return templateApi.requestTemplateDetail(json, str3, str4, "2", i, "fae2a2a24fb82f388aec1c50610d522e", strValueOf, strLIZIZ, effectSDKVersion, Build.VERSION.RELEASE, strLIZ, strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId, "android", Build.MODEL, str, new HashMap<>(), str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZJ(final List<String> list, Pair<String, String> pair, String str, String str2, final Function1<? super Map<String, C532330KuF>, Unit> function1, final Function2<? super String, ? super String, Unit> function2, final InterfaceC1631620sYq<? super Integer, ? super String, ? super String, Unit> interfaceC1631620sYq) {
        String str3;
        Long lLJIILIIL = null;
        InterfaceC1635410sex interfaceC1635410sexLIZ = C1633850scR.LIZ(C0CHQ.LIZ, null);
        IToolsDebugGpService iToolsDebugGpService = (IToolsDebugGpService) PluggableExtentionKt.pluggableSpi$default(IToolsDebugGpService.class, false, false, false, 14, null);
        if (iToolsDebugGpService != null) {
            iToolsDebugGpService.isOpen();
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (String str4 : list) {
            if (C296620Bjw.LIZ()) {
                str3 = lLJIILIIL;
            } else {
                str3 = str4;
            }
            if (C296620Bjw.LIZ()) {
                lLJIILIIL = C2095008Iq.LJIILIIL(str4);
            }
            arrayList.add(new AssetCondition(str3, lLJIILIIL, "tt_template", null, null, null));
            lLJIILIIL = null;
        }
        MixedItemAssetsRequestBodyInfo mixedItemAssetsRequestBodyInfo = new MixedItemAssetsRequestBodyInfo(arrayList, null, null, null, null, "", null, null, Boolean.FALSE, "", null);
        C1429050nI7.LIZ.getClass();
        Map<C0CIJ, C311200CHu> map = C311170CHr.LIZ;
        interfaceC1635410sexLIZ.LJJIL(new MixedAssetsQueryAdditionalParameters(pair, "2", null, "tt_template", null, false, str, str2, false), mixedItemAssetsRequestBodyInfo, new IFetchAssetItemInfo() { // from class: X.05cO
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetItemInfo
            public final void onFailed(ExceptionResult exceptionResult) {
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1390505cN(interfaceC1631620sYq, exceptionResult, function2, null), 3);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(AssetItemResponse assetItemResponse) {
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C533060KvQ(assetItemResponse, interfaceC1631620sYq, function2, list, function1, null), 3);
            }
        });
    }
}
