package X;

import Y.ARunnableS36S0300000_3;
import android.app.Activity;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickSearchResponse;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickSearchWord;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS150S0101000_10;
import kotlin.jvm.internal.AwS50S1300000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PQW, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PQW implements C0PR3 {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(571));

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
                    C2487409ou.LIZJ(new ARunnableS36S0300000_3(nextLiveDataLIZLLL, fragment, observer, 10));
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
            ((Activity) fragment).runOnUiThread(new ARunnableS36S0300000_3(nextLiveDataLIZLLL2, fragment, observer, 8));
        } else if (z2) {
            C2487409ou.LIZJ(new ARunnableS36S0300000_3(nextLiveDataLIZLLL2, fragment, observer, 9));
        } else {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LJ(C2107308Nj.LIZ, new C312801Je(nextLiveDataLIZLLL2, fragment, observer, null));
        }
    }

    @Override // X.C0PR3
    public final void LIZ(EnumC645610PTz enumC645610PTz, String str, String str2, int i, Map<String, ? extends Object> map, Function0<Boolean> function0, C0PUB c0pub, Function0<Unit> function02) {
        C0QRC<EcClickSearchResponse> c0qrc;
        EcClickSearchResponse ecClickSearchResponse;
        List<EcClickSearchWord> list;
        Integer numValueOf;
        EcClickSearchResponse ecClickSearchResponse2;
        List<EcClickSearchWord> list2;
        C1202104n5.LIZ().LJJ(enumC645610PTz, str2, "begin", "", Boolean.TRUE);
        if (((Number) C1842007Ji.LIZ.getValue()).intValue() != 0) {
            C0PQX value = LIZLLL().getValue();
            if (value != null && (c0qrc = value.LJI) != null && (ecClickSearchResponse = c0qrc.LIZIZ) != null && (list = ecClickSearchResponse.wordsList) != null && list.size() > 0 && value.LIZ == enumC645610PTz && value.LIZLLL == i && Intrinsics.LJFF(value.LIZJ, str2)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Data exists cardIndex ");
                sbLIZ.append(i);
                sbLIZ.append(", size: ");
                C0QRC<EcClickSearchResponse> c0qrc2 = value.LJI;
                if (c0qrc2 != null && (ecClickSearchResponse2 = c0qrc2.LIZIZ) != null && (list2 = ecClickSearchResponse2.wordsList) != null) {
                    numValueOf = Integer.valueOf(list2.size());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                C2188811AlT.LIZIZ(sbLIZ);
                C1202104n5.LIZ().LJJ(enumC645610PTz, str2, "request", "use cache livedata", Boolean.TRUE);
                if (((Boolean) ((AwS150S0101000_10) function0).invoke()).booleanValue()) {
                    LIZLLL().postValue(new C0PQX(enumC645610PTz, str, str2, i, (String) null, (C0QRC) null, value.LJI, (C0QRC) null, (C0PUB) null, 0, 1920));
                    return;
                }
                return;
            }
            C0PUO c0puo = C0PUO.LIZ;
            AwS50S1300000_10 awS50S1300000_10 = new AwS50S1300000_10((AwS150S0101000_10) function0, this, enumC645610PTz, str2, 1);
            c0puo.getClass();
            C0PUO.LIZLLL(enumC645610PTz, str, str2, i, null, null, map, false, awS50S1300000_10);
            return;
        }
        C1202104n5.LIZ().LJJ(enumC645610PTz, str2, "networkFail", "exp disable", Boolean.TRUE);
    }
}
