package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0OAE, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OAE {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(Aweme aweme, String str, int i, Map<String, String> map) {
        C737030Svd c737030Svd = new C737030Svd(21, aweme);
        c737030Svd.LJ = str;
        c737030Svd.LJII = i;
        if (map != null) {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new Pair(entry.getKey(), entry.getValue()));
            }
            Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            c737030Svd.LIZJ = C799520VXy.LIZ((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
        C1440005kM.LIZ(c737030Svd);
    }
}
