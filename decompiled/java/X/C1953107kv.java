package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07kv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1953107kv {
    public static final /* synthetic */ int LIZ = 0;

    public static final Uri LIZ(Uri uri) {
        Object c098200Yq;
        if (C2203961BNq.LIZ().isUrlCompatV2Enabled) {
            try {
                c098200Yq = uri.buildUpon().appendQueryParameter("_pia_", "1").build();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Object obj = uri;
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            return (Uri) obj;
        }
        return uri;
    }

    public static final boolean LIZIZ(Uri uri) {
        String scheme;
        List listLJIIJJI = C1697810uHb.LJIIJJI("http", "https");
        if (uri != null) {
            scheme = uri.getScheme();
        } else {
            scheme = null;
        }
        return C13LP.LJJJJ(scheme, listLJIIJJI);
    }

    public static final String LIZJ(Uri uri, List<String> list) {
        List listLJJLIIIJ;
        if (uri == null || !LIZIZ(uri)) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(uri.getAuthority());
        stringBuffer.append(uri.getPath());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "_pia_vary_");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && (listLJJLIIIJ = a0.LJJLIIIJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, new char[]{','}, false, 0, 6)) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJ, 10));
            Iterator it2 = listLJJLIIIJ.iterator();
            while (it2.hasNext()) {
                arrayList.add(a0.LJLIIIL((String) it2.next()).toString());
            }
            linkedHashSet.addAll(arrayList);
        }
        if (list != null) {
            linkedHashSet.addAll(list);
        }
        List<String> listLJLLJ = C13LP.LJLLJ(linkedHashSet);
        ArrayList arrayList2 = new ArrayList();
        for (String str : listLJLLJ) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && !a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
                arrayList2.add(new Pair(str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2));
            }
        }
        if (!arrayList2.isEmpty()) {
            Pair pair = (Pair) C13LP.LJJJJZI(arrayList2);
            stringBuffer.append("?");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) pair.getFirst());
            sbLIZ.append('=');
            sbLIZ.append((String) pair.getSecond());
            stringBuffer.append(C2188811AlT.LIZIZ(sbLIZ));
            List<Pair> listLJJJJIZL = C13LP.LJJJJIZL(arrayList2, 1);
            if (listLJJJJIZL != null) {
                for (Pair pair2 : listLJJJJIZL) {
                    String str2 = (String) pair2.getFirst();
                    String str3 = (String) pair2.getSecond();
                    stringBuffer.append("&");
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str2);
                    sbLIZ2.append('=');
                    sbLIZ2.append(str3);
                    stringBuffer.append(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
        return stringBuffer.toString();
    }
}
