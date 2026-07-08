package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.tako.model.TakoPageContext;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.141H, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C141H {
    public static final C141H LIZ = new C141H();

    public static boolean LIZ(String str) {
        Uri uri;
        String scheme = null;
        if (str != null && str.length() > 0 && (uri = UriProtector.parse(str)) != null) {
            scheme = uri.getScheme();
        }
        return Intrinsics.LJFF("aweme", scheme);
    }

    public static boolean LIZIZ(Context context, String str, final Map map, final String str2, final long j, boolean z, TakoPageContext takoPageContext) {
        Uri uri;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Uri uri2;
        if (str == null || str.length() <= 0 || (uri = UriProtector.parse(str)) == null) {
            return false;
        }
        if (Intrinsics.LJFF(uri.getHost(), "tako") && Intrinsics.LJFF(uri.getPath(), "/settings") && ((Number) C076N.LIZ.getValue()).intValue() == 1) {
            if (z) {
                return false;
            }
            C1864020ybg.LJIIIZ(context, C2097908Jt.LIZJ(new Pair("intent_type", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "intent_type"))), map);
            return true;
        }
        C201996141y.LIZ.getClass();
        if (Intrinsics.LJFF(uri.getHost(), "webview") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url")) != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() > 0 && (uri2 = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null && Intrinsics.LJFF(uri2.getScheme(), "https") && Intrinsics.LJFF(URLDecoder.decode(uri2.getHost(), "UTF-8"), "inapp.tiktokv.com") && Intrinsics.LJFF(URLDecoder.decode(uri2.getPath(), "UTF-8"), "/web-inapp/search-web-inapp/tako-management")) {
            if (z) {
                return false;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Object obj = map.get("enter_from");
            Object obj2 = "";
            if (obj == null) {
                obj = "";
            }
            linkedHashMap.put("enter_from", obj);
            Object obj3 = map.get("enter_method");
            if (obj3 == null) {
                obj3 = "";
            }
            linkedHashMap.put("enter_method", obj3);
            Object obj4 = map.get("process_id");
            if (obj4 == null) {
                obj4 = "";
            }
            linkedHashMap.put("process_id", obj4);
            Object obj5 = map.get("tako_session_id");
            if (obj5 == null) {
                obj5 = "";
            }
            linkedHashMap.put("tako_session_id", obj5);
            Object obj6 = map.get("tako_chat_id");
            if (obj6 != null) {
                obj2 = obj6;
            }
            linkedHashMap.put("tako_chat_id", obj2);
            C201996141y.LIZLLL(context, linkedHashMap);
            return true;
        }
        if (C1852640yJK.LIZJ(uri)) {
            if (z) {
                return false;
            }
            C1852640yJK.LJFF(context, uri, takoPageContext, null, 56);
            return true;
        }
        if (C1852640yJK.LIZIZ(uri)) {
            if (z) {
                return false;
            }
            C1852640yJK.LJ(context, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "template_id"), takoPageContext, null, null, null, null, 24);
            return true;
        }
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(str);
        sparkContext.LJJLIIIJJI(new InterfaceC2217701Bqy() { // from class: X.0R2v
            public long LL;

            @Override // X.InterfaceC2217701Bqy
            public final Context LIZJ(Context context2) {
                return context2;
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJIILLIIL(boolean z2) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJIL(Activity activity, Context context2) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIII(SparkActivity sparkActivity, boolean z2) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIIJZLJL(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIJIIJI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIL(SparkActivity sparkActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIZ(SparkActivity sparkActivity, int i, String[] strArr, int[] iArr) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJ(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJJ(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJLL(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJZI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJJI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity) {
                return false;
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIJ(SparkActivity sparkActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLJLI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLL(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void onActivityResult(int i, int i2, Intent intent) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void onRestoreInstanceState(Bundle bundle) {
            }

            @Override // X.InterfaceC1163130gND
            public final void release() {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void finish() {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LL;
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                String str3 = str2;
                long j2 = j;
                Map<String, String> map2 = map;
                C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
                c1862330yYx.getClass();
                Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("message_id", str3), new Pair("duration", String.valueOf(jCurrentTimeMillis)), new Pair("tako_session_id", map2.get("tako_session_id")), new Pair("tako_chat_id", map2.get("tako_chat_id")));
                Long lValueOf = Long.valueOf(j2);
                if (!(lValueOf.longValue() > 0)) {
                    lValueOf = null;
                }
                if (lValueOf != null) {
                    lValueOf.longValue();
                    mapLJIIJ.put("action_item_id", String.valueOf(j2));
                }
                c20235014FoLIZ.LIZ("tikbot_webpage_stay_time", C2097608Jq.LJIIL(map2, mapLJIIJ));
                String str4 = str2;
                long j3 = j;
                Map<String, String> map3 = map;
                C20235014Fo c20235014FoLIZ2 = C597050NbL.LIZ();
                Map mapLJIIJ2 = C2097608Jq.LJIIJ(new Pair("message_id", str4));
                Long lValueOf2 = Long.valueOf(j3);
                if (lValueOf2.longValue() > 0) {
                    lValueOf2.longValue();
                    mapLJIIJ2.put("action_item_id", String.valueOf(j3));
                }
                c20235014FoLIZ2.LIZ("tikbot_webpage_close", C2097608Jq.LJIIL(map3, mapLJIIJ2));
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle) {
                this.LL = System.currentTimeMillis();
            }
        });
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
        return true;
    }
}
