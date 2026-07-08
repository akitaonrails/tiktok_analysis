package X;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.compression.zstd.ZstdDecompress;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.search.lynx.core.config.SearchSsrPassthroughConfig;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.LynxSSRInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SSRResult;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qA7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1539410qA7 {
    public static final C1539410qA7 LIZ = new C1539410qA7();

    public static String LIZIZ() {
        Map linkedHashMap;
        EnumC1539420qA8 enumC1539420qA8 = EnumC1539420qA8.GLOBAL_PROPS;
        C1539440qAA.LIZ.getClass();
        C01GW c01gw = C1539440qAA.LIZJ;
        int i = 1;
        final Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair(enumC1539420qA8, ((SearchSsrPassthroughConfig) c01gw.getValue()).globalPropsEnableList), new Pair(EnumC1539420qA8.RUNTIME_INFO, ((SearchSsrPassthroughConfig) c01gw.getValue()).runtimeInfoEnableList), new Pair(EnumC1539420qA8.SYSTEM_INFO, ((SearchSsrPassthroughConfig) c01gw.getValue()).systemInfoEnableList));
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        SparkContext sparkContext = new SparkContext();
        C1538590q8n c1538590q8n = new C1538590q8n();
        c1538590q8n.LIZ = true;
        sparkContext.liteLynxConfig = c1538590q8n;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        InterfaceC1539100q9c interfaceC1539100q9c = new InterfaceC1539100q9c() { // from class: X.0qA9
            @Override // X.InterfaceC1539100q9c
            public final boolean LIZ(EnumC1539420qA8 enumC1539420qA82, String str) {
                List<String> list = mapLJIIIIZZ.get(enumC1539420qA82);
                if (list != null && list.contains(str)) {
                    return true;
                }
                return false;
            }
        };
        C1536670q5h.LIZ.getClass();
        if (!C1536670q5h.LIZJ) {
            C1536660q5g.LIZ.LIZLLL(null);
        }
        InterfaceC1535780q4G.LIZ.getClass();
        InterfaceC1535780q4G interfaceC1535780q4G = C1535770q4F.LIZIZ;
        if (interfaceC1535780q4G == null || (linkedHashMap = interfaceC1535780q4G.LIZ(contextLIZ, linkedHashMap2, interfaceC1539100q9c, sparkContext, sparkContext.LJJJI(-1))) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        String strConcat = Intrinsics.LJFF(((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getSearchDebugSwitch(), Boolean.TRUE) ? "&cluster=".concat(Intrinsics.LJFF(C1552050qUV.LJIIJ(), "online") ? "default" : "test") : "";
        StringBuilder sb = new StringBuilder(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        int size = linkedHashMap.size();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Map map = (Map) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(key);
            sb2.append('=');
            sb2.append(new JSONObject(map));
            sb.append(sb2.toString());
            if (i < size) {
                sb.append("&");
            }
            i++;
        }
        sb.append(strConcat);
        return sb.toString();
    }

    public static C650530PfP LIZ(LynxSSRInfo lynxSSRInfo) {
        SSRResult sSRResult;
        String str;
        byte[] bArrDecode;
        SSRResult sSRResult2;
        String str2;
        String upperCase;
        Object objDecompress;
        byte[] bArr;
        String str3;
        SSRResult sSRResult3;
        if (lynxSSRInfo != null && (sSRResult = lynxSSRInfo.ssrResult) != null && sSRResult.ssrSource != null) {
            if (lynxSSRInfo == null) {
                str = null;
            } else {
                try {
                    str = lynxSSRInfo.extra;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return new C650530PfP(null);
                }
            }
            Map mapLIZJ = LIZJ(str);
            if (Intrinsics.LJFF(mapLIZJ.get("encode"), "base64")) {
                if (lynxSSRInfo != null && (sSRResult3 = lynxSSRInfo.ssrResult) != null) {
                    str3 = sSRResult3.ssrSource;
                } else {
                    str3 = null;
                }
                bArrDecode = Base64.decode(str3, 2);
            } else if (lynxSSRInfo != null && (sSRResult2 = lynxSSRInfo.ssrResult) != null && (str2 = sSRResult2.ssrSource) != null && (upperCase = str2.toUpperCase(Locale.ROOT)) != null && !Intrinsics.LJFF(upperCase, "")) {
                int length = upperCase.length() / 2;
                char[] charArray = upperCase.toCharArray();
                bArrDecode = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    bArrDecode[i] = (byte) (((byte) a0.LJJIZ("0123456789ABCDEF", charArray[i2 + 1], 0, false, 6)) | (((byte) a0.LJJIZ("0123456789ABCDEF", charArray[i2], 0, false, 6)) << 4));
                }
            } else {
                bArrDecode = null;
            }
            if (!Intrinsics.LJFF(mapLIZJ.get("enable_zstd_compress"), "1")) {
                return new C650530PfP(bArrDecode);
            }
            try {
                objDecompress = ZstdDecompress.decompress(bArrDecode);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                objDecompress = Unit.LIZ;
            }
            if (objDecompress instanceof byte[]) {
                bArr = (byte[]) objDecompress;
            } else {
                bArr = null;
            }
            return new C650530PfP(bArr);
        }
        return new C650530PfP(null);
    }

    public static Map LIZJ(String str) {
        if (str != null && str.length() != 0) {
            Uri uriBuild = new Uri.Builder().encodedQuery(str).build();
            return C2097608Jq.LJIIIIZZ(new Pair("enable_zstd_compress", String.valueOf(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriBuild, "enable_zstd_compress"))), new Pair("encode", String.valueOf(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriBuild, "encode"))), new Pair("hydrateUrl", String.valueOf(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriBuild, "hydrateUrl"))));
        }
        return C2097608Jq.LJ();
    }

    public static boolean LIZLLL(InterfaceC1541990qEH interfaceC1541990qEH) {
        C1539580qAO c1539580qAO;
        EnumC1539690qAZ enumC1539690qAZ;
        if (interfaceC1541990qEH == null || (c1539580qAO = (C1539580qAO) interfaceC1541990qEH.getHybridContext().LJFF(C1539580qAO.class)) == null || (enumC1539690qAZ = c1539580qAO.LJI) == null || enumC1539690qAZ == EnumC1539690qAZ.HYDRATION_SUCCESS) {
            return true;
        }
        return false;
    }
}
