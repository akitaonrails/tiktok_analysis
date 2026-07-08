package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.perf.prefetch.model.MinisPrefetchParam;
import com.ss.android.ugc.aweme.minis.perf.prefetch.model.MinisPrefetchQuery;
import com.ss.android.ugc.aweme.minis.perf.prefetch.model.MinisPrefetchRouteConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0pFX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1504330pFX {
    public final String LIZ;
    public final SchemaParserData LIZIZ;
    public final MinisPrefetchRouteConfig LIZJ;
    public final C1504460pFk LIZLLL;
    public Function1<? super C1504480pFm, Unit> LJ;
    public C1504480pFm LJFF;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    public final String LIZ() {
        MinisPrefetchParam next;
        Uri uri = UriProtector.parse(this.LIZJ.url);
        Uri.Builder builderBuildUpon = uri.buildUpon();
        List<String> pathSegments = uri.getPathSegments();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(pathSegments, 10));
        for (String strLIZJ : pathSegments) {
            if (u.LJJIIJZLJL(strLIZJ, ":", false)) {
                String strSubstring = strLIZJ.substring(1);
                Iterator<MinisPrefetchParam> it2 = this.LIZJ.paramsList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (Intrinsics.LJFF(next.name, strSubstring)) {
                        break;
                    }
                }
                MinisPrefetchParam minisPrefetchParam = next;
                if (minisPrefetchParam != null) {
                    String str = minisPrefetchParam.from;
                    Locale locale = Locale.ROOT;
                    String lowerCase = str.toLowerCase(locale);
                    if (Intrinsics.LJFF(lowerCase, "MinisPath".toLowerCase(locale))) {
                        strLIZJ = LIZIZ(minisPrefetchParam.key, minisPrefetchParam.type);
                    } else {
                        if (!Intrinsics.LJFF(lowerCase, "MinisQuery".toLowerCase(locale))) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("[MinisPrefetch] unsupported params from: ");
                            sbLIZ.append(minisPrefetchParam.from);
                            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        strLIZJ = LIZJ(minisPrefetchParam.key, minisPrefetchParam.type);
                    }
                    if (strLIZJ != 0) {
                    }
                }
                throw new RuntimeException("[MinisPrefetch] Value not found for url path variable");
            }
            arrayList.add(strLIZJ);
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, "/", null, null, 0, null, null, 62);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("mapped path components: ");
        sbLIZ2.append(strLJJLIIIJ);
        C2188811AlT.LIZIZ(sbLIZ2);
        builderBuildUpon.path(strLJJLIIIJ);
        for (MinisPrefetchQuery minisPrefetchQuery : this.LIZJ.queryList) {
            if (minisPrefetchQuery.name.length() == 0) {
                throw new RuntimeException("[MinisPrefetch] query name is empty");
            }
            String str2 = minisPrefetchQuery.value;
            if (str2 == null || str2.length() == 0) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("[MinisPrefetch] query (");
                sbLIZ3.append(minisPrefetchQuery.name);
                sbLIZ3.append(") value is empty");
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
            }
            builderBuildUpon.appendQueryParameter(minisPrefetchQuery.name, minisPrefetchQuery.value);
        }
        return builderBuildUpon.build().toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1504330pFX.LIZLLL(java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Object LIZIZ(String str, String str2) {
        String strLIZIZ;
        List listLJJLIIIJILLIZJL;
        List listLJJLIIIJILLIZJL2;
        int iIndexOf;
        String lowerCase;
        if (u.LJJIIJZLJL(str, ":", false)) {
            strLIZIZ = str;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(':');
            sbLIZ.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        String strLIZ = C162400jm.LIZ(this.LIZIZ.pathWithOutParams);
        if (strLIZ == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLIZ, new String[]{"/"}, 0, 6)) == null) {
            listLJJLIIIJILLIZJL = C13BV.INSTANCE;
        }
        String strLIZ2 = C162400jm.LIZ(this.LIZ);
        if (strLIZ2 != null && (listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(strLIZ2, new String[]{"/"}, 0, 6)) != null && (iIndexOf = listLJJLIIIJILLIZJL2.indexOf(strLIZIZ)) >= 0 && listLJJLIIIJILLIZJL.size() > iIndexOf) {
            String str3 = (String) ListProtector.get(listLJJLIIIJILLIZJL, iIndexOf);
            if (str2 != null && (lowerCase = str2.toLowerCase(Locale.ROOT)) != null) {
                switch (lowerCase.hashCode()) {
                    case -1325958191:
                        if (lowerCase.equals("double")) {
                            return C2327809Ae.LJII(str3);
                        }
                        break;
                    case 104431:
                        if (lowerCase.equals("int")) {
                            return C2095008Iq.LJIIJJI(str3);
                        }
                        break;
                    case 64711720:
                        if (lowerCase.equals("boolean")) {
                            return a0.LJLI(str3);
                        }
                        break;
                    case 97526364:
                        if (lowerCase.equals("float")) {
                            return C2327809Ae.LJIIIIZZ(str3);
                        }
                        break;
                }
            }
            return str3;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[MinisPrefetch] path value not found for key (");
        sbLIZ2.append(str);
        sbLIZ2.append(") ");
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Object LIZJ(String str, String str2) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String lowerCase;
        Uri uri = this.LIZIZ.schemaUri;
        if (uri != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
            if (str2 != null && (lowerCase = str2.toLowerCase(Locale.ROOT)) != null) {
                switch (lowerCase.hashCode()) {
                    case -1325958191:
                        if (lowerCase.equals("double")) {
                            return C2327809Ae.LJII(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                        }
                        break;
                    case 104431:
                        if (lowerCase.equals("int")) {
                            return C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                        }
                        break;
                    case 64711720:
                        if (lowerCase.equals("boolean")) {
                            return a0.LJLI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                        }
                        break;
                    case 97526364:
                        if (lowerCase.equals("float")) {
                            return C2327809Ae.LJIIIIZZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                        }
                        break;
                }
            }
            return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[MinisPrefetch] query value not found for key (");
        sbLIZ.append(str);
        sbLIZ.append(')');
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C1504330pFX(String str, SchemaParserData schemaParserData, MinisPrefetchRouteConfig minisPrefetchRouteConfig, C1504460pFk c1504460pFk) {
        this.LIZ = str;
        this.LIZIZ = schemaParserData;
        this.LIZJ = minisPrefetchRouteConfig;
        this.LIZLLL = c1504460pFk;
    }
}
