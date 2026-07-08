package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.ecommercebase.preload.ECAsyncInflaterV2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0uNN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701390uNN {
    public final Activity LIZ;
    public final ECAsyncInflaterV2 LIZIZ;
    public final EnumC1153500g7g LIZJ;
    public final Long LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1326));
    public final List<Pair<Integer, Integer>> LJFF = new ArrayList();

    public final void LIZ(Function2<? super Integer, ? super Integer, Unit> function2) {
        for (Pair pair : (ArrayList) this.LJFF) {
            function2.invoke(pair.getFirst(), pair.getSecond());
        }
    }

    public C1701390uNN(Activity activity, ECAsyncInflaterV2 eCAsyncInflaterV2, EnumC1153500g7g enumC1153500g7g, Long l) {
        this.LIZ = activity;
        this.LIZIZ = eCAsyncInflaterV2;
        this.LIZJ = enumC1153500g7g;
        this.LIZLLL = l;
    }
}
