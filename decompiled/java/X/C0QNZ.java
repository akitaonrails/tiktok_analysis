package X;

import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.search.middle.BaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QNZ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QNZ {
    public static C0QH7 LIZ;
    public static int LIZLLL;
    public static boolean LJ;
    public static String LJFF;
    public static String LJI;
    public static volatile C669330QNf LJIIIIZZ;
    public static AnonymousClass0956 LJIIL;
    public static final Map<Lifecycle, LifecycleObserver> LIZIZ = new LinkedHashMap();
    public static final C054G LIZJ = C2296808zG.LIZ(C0PEM.LIZJ);
    public static final List<String> LJII = new ArrayList();
    public static long LJIIIZ = -1;
    public static long LJIIJ = 200;
    public static String LJIIJJI = "";

    public static void LIZ(String str) {
        C0QH7 c0qh7 = LIZ;
        if (c0qh7 != null) {
            BaseDiscoverAndSearchFragmentNew baseDiscoverAndSearchFragmentNew = ((C0QM0) c0qh7).LIZ;
            baseDiscoverAndSearchFragmentNew.getClass();
            if (!TextUtils.isEmpty(str)) {
                SearchResultParam searchResultParam = new SearchResultParam();
                searchResultParam.setKeyword(str);
                searchResultParam.setSearchFrom("search_sug");
                searchResultParam.setOpenNewSearchContainer(false);
                C0POX.LIZ.getClass();
                searchResultParam.setPrefetchId(C0POX.LIZJ());
                searchResultParam.setPrefetchType("sug_ahead");
                searchResultParam.setSugIntentPrefetch(Boolean.TRUE);
                C1ER1.LIZIZ.LLJJJJLIIL(baseDiscoverAndSearchFragmentNew.getActivity(), baseDiscoverAndSearchFragmentNew, searchResultParam);
            }
        }
    }

    public static void LIZIZ(int i) {
        System.currentTimeMillis();
        AnonymousClass0956 anonymousClass0956 = LJIIL;
        C669330QNf c669330QNf = null;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C669330QNf c669330QNf2 = LJIIIIZZ;
        if (c669330QNf2 != null) {
            double[] dArrLIZ = C669290QNb.LIZ(c669330QNf2, LJIIJ);
            C669290QNb.LIZIZ();
            double dLIZJ = ((double) i) - C669290QNb.LIZJ(dArrLIZ);
            boolean[] zArrLIZ = AnonymousClass0503.LIZ();
            int length = C669290QNb.LIZ.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (Intrinsics.LJFF(C13LQ.LJJII(i2, zArrLIZ), Boolean.TRUE)) {
                    double[] dArr = C669290QNb.LIZ;
                    double d = dArr[i2];
                    dArr[i2] = d - ((((-dLIZJ) * dArrLIZ[i2]) + (0.001d * d)) * 0.01d);
                }
            }
            double[] dArr2 = C669290QNb.LIZ;
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            int i3 = 0;
            for (double d2 : dArr2) {
                i3++;
                if (i3 > 1) {
                    sb.append((CharSequence) ",");
                }
                sb.append((CharSequence) String.valueOf(d2));
            }
            sb.append((CharSequence) "");
            ((Keva) C669290QNb.LIZJ.getValue()).storeString("sug_model_weights_key", sb.toString());
            C669290QNb.LIZIZ();
            double[] dArr3 = C669290QNb.LIZ;
            if (dArr3.length >= 6) {
                C669310QNd.LIZ(new C669320QNe(-1.0f, (float) dArr3[0], (float) dArr3[1], (float) dArr3[2], (float) dArr3[3], (float) dArr3[4], (float) dArr3[5], 0, i));
            }
            c669330QNf = null;
        }
        LJIIIIZZ = c669330QNf;
        C669340QNg.LIZ = -1L;
        C669340QNg.LIZIZ = 0;
        C669340QNg.LIZJ = 0;
        C669340QNg.LIZLLL = 0;
    }
}
