package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.ClickSearchResponse;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.ClickSearchWord;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.repo.SuggestWordsApi;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PTt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C645550PTt implements C0PR3 {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(726));

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

    @Override // X.C0PR3
    public final void LIZJ(Fragment fragment, Observer observer, boolean z, boolean z2) {
        if (z) {
            C325901Of.LIZLLL(LIZLLL(), fragment, observer);
        } else {
            C325901Of.LIZJ(LIZLLL(), fragment, observer);
        }
    }

    @Override // X.C0PR3
    public final void LIZ(final EnumC645610PTz enumC645610PTz, final String str, final String str2, final int i, Map<String, ? extends Object> map, final Function0<Boolean> function0, final C0PUB c0pub, Function0<Unit> function02) {
        int size;
        Integer num;
        String str3;
        String str4;
        String str5;
        Integer numValueOf;
        ClickSearchResponse clickSearchResponse;
        List<ClickSearchWord> list;
        C0QRC<ClickSearchResponse> c0qrc;
        ClickSearchResponse clickSearchResponse2;
        List<ClickSearchWord> list2;
        if (!C07F3.LIZ()) {
            return;
        }
        C0PQX value = LIZLLL().getValue();
        boolean z = false;
        if (value != null && (c0qrc = value.LJFF) != null && (clickSearchResponse2 = c0qrc.LIZIZ) != null && (list2 = clickSearchResponse2.wordsList) != null) {
            size = list2.size();
        } else {
            size = 0;
        }
        String str6 = null;
        if (value != null && size > 0) {
            int i2 = value.LJIIJ;
            if (c0pub != null) {
                str5 = c0pub.LIZJ;
            } else {
                str5 = null;
            }
            if (i2 == C1822907Bz.LIZLLL(str5) && value.LIZLLL == i && Intrinsics.LJFF(value.LIZJ, str2)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Data exists for Aweme #");
                sbLIZ.append(i);
                sbLIZ.append(", (size=");
                C0QRC<ClickSearchResponse> c0qrc2 = value.LJFF;
                if (c0qrc2 != null && (clickSearchResponse = c0qrc2.LIZIZ) != null && (list = clickSearchResponse.wordsList) != null) {
                    numValueOf = Integer.valueOf(list.size());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append(')');
                C2188811AlT.LIZIZ(sbLIZ);
                if (function0.invoke().booleanValue()) {
                    NextLiveData<C0PQX> nextLiveDataLIZLLL = LIZLLL();
                    C0QRC<ClickSearchResponse> c0qrc3 = value.LJFF;
                    if (c0pub != null) {
                        str6 = c0pub.LIZJ;
                    }
                    nextLiveDataLIZLLL.postValue(new C0PQX(enumC645610PTz, str, str2, i, (String) null, c0qrc3, (C0QRC) null, (C0QRC) null, c0pub, C1822907Bz.LIZLLL(str6), 384));
                    return;
                }
                return;
            }
        }
        SuggestWordsApi suggestWordsApi = SuggestWordsApi.LIZ;
        C645950PVh c645950PVh = new C645950PVh();
        c645950PVh.LIZJ = str;
        c645950PVh.LIZLLL = str2;
        if (ComplianceServiceProvider.LJI().LJJII()) {
            num = 1;
        } else {
            num = null;
        }
        c645950PVh.LJIIIZ = num;
        if (c0pub != null) {
            str3 = c0pub.LIZJ;
        } else {
            str3 = null;
        }
        c645950PVh.LJIIJ = Integer.valueOf(C1822907Bz.LIZLLL(str3));
        if (c0pub != null) {
            str4 = c0pub.LIZJ;
        } else {
            str4 = null;
        }
        if (!C1822907Bz.LIZJ(str4) && ((Number) C1822807By.LIZ.getValue()).intValue() == 1) {
            z = true;
        }
        c645950PVh.LJIILIIL = z;
        suggestWordsApi.getClass();
        SuggestWordsApi.SuggestApi suggestApi = (SuggestWordsApi.SuggestApi) SuggestWordsApi.LIZIZ.getValue();
        String str7 = c645950PVh.LIZJ;
        String str8 = c645950PVh.LIZLLL;
        C0Q2M.LIZ.getClass();
        suggestApi.fetchClickSearchData(str7, str8, C0Q2M.LJIIL(), c645950PVh.LJIIIZ, c645950PVh.LJIIJ, Boolean.valueOf(c645950PVh.LJIILIIL)).LJ(new InterfaceC2385309Wh() { // from class: X.0PTs
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                Integer numValueOf2;
                List<ClickSearchWord> list3;
                C1C7U.LIZ("ClickSearchDataExecutor@5384.fetchData$2");
                if (c15o7.LJIILJJIL()) {
                    ClickSearchResponse clickSearchResponse3 = (ClickSearchResponse) c15o7.LJIIL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Fetch completed for Aweme #");
                    sbLIZ2.append(i);
                    sbLIZ2.append(", words: ");
                    String str9 = null;
                    if (clickSearchResponse3 != null && (list3 = clickSearchResponse3.wordsList) != null) {
                        numValueOf2 = Integer.valueOf(list3.size());
                    } else {
                        numValueOf2 = null;
                    }
                    sbLIZ2.append(numValueOf2);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    if (clickSearchResponse3 != null && function0.invoke().booleanValue()) {
                        NextLiveData<C0PQX> nextLiveDataLIZLLL2 = this.LIZLLL();
                        EnumC645610PTz enumC645610PTz2 = enumC645610PTz;
                        String str10 = str;
                        String str11 = str2;
                        int i3 = i;
                        C0QRC c0qrc4 = new C0QRC(clickSearchResponse3);
                        C0PUB c0pub2 = c0pub;
                        if (c0pub2 != null) {
                            str9 = c0pub2.LIZJ;
                        }
                        nextLiveDataLIZLLL2.postValue(new C0PQX(enumC645610PTz2, str10, str11, i3, (String) null, c0qrc4, (C0QRC) null, (C0QRC) null, c0pub2, C1822907Bz.LIZLLL(str9), 384));
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ClickSearchDataExecutor@5384.fetchData$2");
                return unit;
            }
        }, C15O7.LJIIIIZZ, null);
    }
}
