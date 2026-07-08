package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.minis.performance.video.MinisPreloadVideoMetadata;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.08CZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08CZ {
    public static final /* synthetic */ int LIZ = 0;

    public static MinisPreloadVideoMetadata LIZIZ(File file) {
        int i = C2187451AjH.LIZ;
        if (file == null || !file.exists()) {
            return null;
        }
        C1227904rF.LIZ.getClass();
        return (MinisPreloadVideoMetadata) GsonProtectorUtils.fromJson(C1227904rF.LIZLLL(), C09BH.LJI(file, Charsets.UTF_8), MinisPreloadVideoMetadata.class);
    }

    public static File LIZ(Context context, String str, String str2, String str3) {
        String absolutePath;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resourceUrl:");
        sbLIZ.append(str2);
        sbLIZ.append(", clientKey:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        File fileW2 = C786410Ut5.w2(context);
        if (fileW2 == null || (absolutePath = fileW2.getAbsolutePath()) == null || absolutePath.length() == 0) {
            return null;
        }
        File c0vsj = new C0VSJ(absolutePath);
        Iterator it2 = C1697810uHb.LJIIJJI("minis", str, "video").iterator();
        while (it2.hasNext()) {
            c0vsj = C08QA.LJIL(c0vsj, (String) it2.next());
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        Uri uri = UriProtector.parse(str2);
        List<String> listLJLLJ = C13LP.LJLLJ(UriProtector.getQueryParameterNames(uri));
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJLLJ, 10));
        for (String str4 : listLJLLJ) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str4);
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
            }
            arrayList.add(new Pair(str4, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri.getScheme());
        sb.append("://");
        sb.append(uri.getHost());
        Integer numValueOf = Integer.valueOf(uri.getPort());
        if (numValueOf.intValue() != -1) {
            int iIntValue = numValueOf.intValue();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(':');
            sbLIZ3.append(iIntValue);
            sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        }
        sb.append(uri.getPath());
        if (!arrayList.isEmpty()) {
            sb.append("?");
            sb.append(C13LP.LJJLIIIJ(arrayList, "&", null, null, 0, null, AnonymousClass0207.get$arr$(97), 30));
        }
        String strLIZ = C2084808Es.LIZ(sb.toString());
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("resourceUrl:");
        sbLIZ4.append(str2);
        sbLIZ4.append(", result:");
        sbLIZ4.append(strLIZ);
        C2188811AlT.LIZIZ(sbLIZ4);
        sbLIZ2.append(strLIZ);
        sbLIZ2.append('.');
        sbLIZ2.append(str3);
        File fileLJIL = C08QA.LJIL(c0vsj, C2188811AlT.LIZIZ(sbLIZ2));
        File parentFile = fileLJIL.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        return fileLJIL;
    }
}
