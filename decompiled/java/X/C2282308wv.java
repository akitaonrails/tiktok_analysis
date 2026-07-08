package X;

import android.net.Uri;
import com.bytedance.hybrid.spark.roma.config.ShortLinkConfig;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.08wv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2282308wv extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2282508wx LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Uri LLILLL;
    public final /* synthetic */ ShortLinkConfig LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2282308wv(C2282508wx c2282508wx, String str, Uri uri, ShortLinkConfig shortLinkConfig, Map<String, String> map) {
        super(0);
        this.LL = c2282508wx;
        this.LLILLJJLI = str;
        this.LLILLL = uri;
        this.LLILZ = shortLinkConfig;
        this.LLILZIL = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws C2282708wz {
        Object c098200Yq;
        C2282508wx c2282508wx = this.LL;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = this.LLILLJJLI;
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            C2282208wu c2282208wu = C2282208wu.LIZ;
            Uri uri = this.LLILLL;
            c2282208wu.getClass();
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "spark_page");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null || a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                throw new C2282708wz(EnumC2282608wy.SYNTAX, "The page key is blank!");
            }
        }
        c2282508wx.LIZIZ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        this.LL.LJIIL = System.currentTimeMillis();
        ShortLinkConfig shortLinkConfig = this.LLILZ;
        if (shortLinkConfig == null) {
            C2282208wu c2282208wu2 = C2282208wu.LIZ;
            String str = this.LL.LIZIZ;
            c2282208wu2.getClass();
            C1550290qRf.LIZ.getClass();
            Object objLIZ = C1550290qRf.LIZ(str);
            C155000ia.LIZIZ(objLIZ);
            shortLinkConfig = (ShortLinkConfig) objLIZ;
        }
        C2282508wx c2282508wx2 = this.LL;
        c2282508wx2.LJFF = shortLinkConfig;
        c2282508wx2.LJIILIIL = System.currentTimeMillis();
        C2282208wu c2282208wu3 = C2282208wu.LIZ;
        Uri uri2 = this.LLILLL;
        c2282208wu3.getClass();
        Map mapLJIIIIZZ = C2282208wu.LJIIIIZZ(uri2);
        C2282508wx c2282508wx3 = this.LL;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(mapLJIIIIZZ.size()));
        for (Map.Entry entry : ((LinkedHashMap) mapLJIIIIZZ).entrySet()) {
            linkedHashMap.put(entry.getKey(), Integer.valueOf(((String) entry.getValue()).length()));
        }
        c2282508wx3.LJIIIZ = linkedHashMap;
        this.LL.LJIILJJIL = System.currentTimeMillis();
        Map<String, String> map = this.LLILZIL;
        try {
            C1924607gK c1924607gK = C1924607gK.LIZ;
            Map mapLJIIL = C2097608Jq.LJIIL(map, mapLJIIIIZZ);
            c1924607gK.getClass();
            c098200Yq = C1924607gK.LIZ(shortLinkConfig, mapLJIIL);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C2282508wx c2282508wx4 = this.LL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            EnumC2282608wy enumC2282608wy = EnumC2282608wy.REAL_TIME_CONDITION;
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            c2282508wx4.LIZLLL = new C2282708wz(enumC2282608wy, message);
            C2282208wu.LJ(c2282508wx4);
        }
        C2282508wx c2282508wx5 = this.LL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            c2282508wx5.LJFF = (ShortLinkConfig) c098200Yq;
        }
        this.LL.LJIILL = System.currentTimeMillis();
        if (this.LL.LJFF.version > 1) {
            throw new C2282708wz(EnumC2282608wy.SETTINGS, "Unsupported version!");
        }
        C2282208wu c2282208wu4 = C2282208wu.LIZ;
        Map<String, ShortLinkConfig.ParamsDesc> map2 = shortLinkConfig.paramsDesc;
        c2282208wu4.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ShortLinkConfig.ParamsDesc> entry2 : map2.entrySet()) {
            String key = entry2.getKey();
            ShortLinkConfig.ParamsDesc value = entry2.getValue();
            String str2 = value.defaultValue;
            if (str2 != null && str2.length() > 0) {
                arrayList.add(new Pair(key, value.defaultValue));
            }
        }
        Map mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList);
        Map<String, String> mapLJIILL = C1550300qRg.LIZIZ.LJIILL(shortLinkConfig.schemeTemplate);
        boolean z = C1550300qRg.LIZIZ().enableWithParams;
        boolean zLJFF = Intrinsics.LJFF(this.LLILZIL.get("roma_enable_with_param"), "1");
        if (z || zLJFF) {
            this.LL.LJ = C2097608Jq.LJIIL(C2097608Jq.LJIIL(C2097608Jq.LJIIL(mapLJIILLIIL, mapLJIILL), this.LLILZIL), mapLJIIIIZZ);
        } else {
            this.LL.LJ = C2097608Jq.LJIIL(C2097608Jq.LJIIL(mapLJIILLIIL, mapLJIILL), mapLJIIIIZZ);
        }
        return Unit.LIZ;
    }
}
