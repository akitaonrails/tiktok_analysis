package X;

import Y.ARunnableS36S0300000_3;
import android.app.Activity;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickRecommendProductsResponse;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS150S0101000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS95S1200000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PQR, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PQR implements C0PR3 {
    public static volatile String LIZIZ = "";
    public static volatile int LIZJ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(525));

    public final NextLiveData<C0PQX> LIZLLL() {
        return (NextLiveData) this.LIZ.getValue();
    }

    @Override // X.C0PR3
    public final void reset() {
        LIZLLL().setValue(new C0PQX((EnumC645610PTz) null, (String) null, (String) null, 0, (String) null, (C0QRC) null, (C0QRC) null, (C0QRC) null, (C0PUB) null, 0, 2047));
    }

    @Override // X.C0PR3
    public final void LIZIZ(int i) {
        C0PQX c0pqxLIZ;
        C0PQX value = LIZLLL().getValue();
        if (value != null && (value.LIZLLL == -1 || value.LIZLLL == i)) {
            return;
        }
        NextLiveData<C0PQX> nextLiveDataLIZLLL = LIZLLL();
        if (value != null) {
            c0pqxLIZ = C0PQX.LIZ(value);
        } else {
            c0pqxLIZ = null;
        }
        nextLiveDataLIZLLL.setValue(c0pqxLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0PR3
    public final void LIZJ(Fragment fragment, Observer observer, boolean z, boolean z2) throws Throwable {
        if (z) {
            NextLiveData<C0PQX> nextLiveDataLIZLLL = LIZLLL();
            if (nextLiveDataLIZLLL != null) {
                if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                    nextLiveDataLIZLLL.observe(fragment, observer);
                    return;
                } else {
                    C2487409ou.LIZJ(new ARunnableS36S0300000_3(nextLiveDataLIZLLL, fragment, observer, 5));
                    return;
                }
            }
            return;
        }
        NextLiveData<C0PQX> nextLiveDataLIZLLL2 = LIZLLL();
        if (nextLiveDataLIZLLL2 == null) {
            return;
        }
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            nextLiveDataLIZLLL2.observe(fragment, observer);
            return;
        }
        if (fragment instanceof Activity) {
            ((Activity) fragment).runOnUiThread(new ARunnableS36S0300000_3(nextLiveDataLIZLLL2, fragment, observer, 3));
        } else if (z2) {
            C2487409ou.LIZJ(new ARunnableS36S0300000_3(nextLiveDataLIZLLL2, fragment, observer, 4));
        } else {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LJ(C2107308Nj.LIZ, new C316101Kl(nextLiveDataLIZLLL2, fragment, observer, null));
        }
    }

    @Override // X.C0PR3
    public final void LIZ(EnumC645610PTz enumC645610PTz, String str, String str2, int i, Map<String, ? extends Object> map, Function0<Boolean> function0, C0PUB c0pub, Function0<Unit> function02) {
        C0QRC<EcClickRecommendProductsResponse> c0qrc;
        EcClickRecommendProductsResponse ecClickRecommendProductsResponse;
        C0PQX value = LIZLLL().getValue();
        if (value != null && (c0qrc = value.LJII) != null && (ecClickRecommendProductsResponse = c0qrc.LIZIZ) != null && ecClickRecommendProductsResponse.dynamicPatch != null && value.LIZLLL == i && Intrinsics.LJFF(value.LIZJ, str2)) {
            C1202104n5.LIZ().LJIILIIL("reuse", null, null);
            if (((Boolean) ((AwS150S0101000_10) function0).invoke()).booleanValue()) {
                LIZLLL().postValue(new C0PQX(EnumC645610PTz.VIDEO_IN_MIX_FEED, str, str2, i, (String) null, (C0QRC) null, (C0QRC) null, value.LJII, (C0PUB) null, 0, 1808));
                return;
            }
            return;
        }
        String str3 = ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLILLL;
        String str4 = ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLJLL;
        if (!Intrinsics.LJFF(str3, LIZIZ)) {
            LIZIZ = str3;
            LIZJ = 0;
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C0PQF(str2, new AwS554S0100000_10((C645510PTp) function02, 1032), str3, i, str, str4, LIZJ, new AwS95S1200000_10((AwS150S0101000_10) function0, this, str2, 18), null), 2);
    }
}
