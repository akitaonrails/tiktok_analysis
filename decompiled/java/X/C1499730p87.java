package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0p87, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1499730p87 {
    public static final Map<String, List<String>> LJII = new LinkedHashMap();
    public static final Map<String, PreloadExtraInfo> LJIIIIZZ = new LinkedHashMap();
    public final C1499720p86 LIZ;
    public PreloadExtraInfo LIZIZ = null;
    public C1499800p8E LIZJ = null;
    public boolean LIZLLL = false;
    public boolean LJ = false;
    public String LJFF = null;
    public long LJI = 0;

    public C1499730p87(C1499720p86 c1499720p86) {
        this.LIZ = c1499720p86;
    }

    public final String LIZ(Uri uri, List<String> list) {
        Map<String, List<String>> mapFields;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (String str : list) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('=');
            TypedOutput typedOutput = this.LIZ.LIZJ;
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null && (typedOutput instanceof FormUrlEncodedTypedOutput) && (mapFields = ((FormUrlEncodedTypedOutput) typedOutput).fields()) != null && !mapFields.isEmpty()) {
                List<String> list2 = mapFields.get(str);
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = list2 != null ? C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, null, 62) : null;
            }
            sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        return C13LP.LJJLIIIJ(arrayList, "&", null, null, 0, null, null, 62);
    }
}
