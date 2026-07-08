package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07ok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1976807ok {
    public static final Uri.Builder LIZ(Uri uri, Pair<String, ?>... pairArr) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        LIZJ(builderBuildUpon, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        return builderBuildUpon;
    }

    public static final void LIZIZ(Uri.Builder builder, Map map) {
        String string;
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj != null && (string = obj.toString()) != null && !a0.LJJJIL(string)) {
                builder.appendQueryParameter(str, string);
            }
        }
    }

    public static final void LIZJ(Uri.Builder builder, Pair... pairArr) {
        String string;
        for (Pair pair : pairArr) {
            String str = (String) pair.getFirst();
            Object second = pair.getSecond();
            if (second != null && (string = second.toString()) != null && !a0.LJJJIL(string)) {
                builder.appendQueryParameter(str, string);
            }
        }
    }

    public static final String LIZLLL(Uri uri, String str) {
        if (uri.isOpaque()) {
            return null;
        }
        return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
    }

    public static final Uri.Builder LJ(Uri uri, Pair<String, ?>... pairArr) {
        String string;
        if (uri.isOpaque()) {
            return LIZ(uri, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        Set<String> setLLIIIZ = C13LP.LLIIIZ(UriProtector.getQueryParameterNames(uri));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = false;
        for (Pair<String, ?> pair : pairArr) {
            String first = pair.getFirst();
            Object second = pair.getSecond();
            if (second != null) {
                string = second.toString();
            } else {
                string = null;
            }
            String strLIZ = C1521105xR.LIZ(string);
            if (strLIZ != null) {
                linkedHashMap.put(first, strLIZ);
                if (setLLIIIZ.remove(first)) {
                    z = true;
                }
            }
        }
        if (z) {
            builderBuildUpon.clearQuery();
            for (String str : setLLIIIZ) {
                builderBuildUpon.appendQueryParameter(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str));
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon;
    }

    public static final void LJFF(Uri.Builder builder, String str, Object obj) {
        if (obj != null) {
            builder.appendQueryParameter(str, String.valueOf(obj));
        }
    }
}
