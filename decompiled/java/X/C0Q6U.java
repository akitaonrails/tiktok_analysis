package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.Map;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS25S0001000_10;

/* JADX INFO: renamed from: X.0Q6U, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q6U {
    public static Long LIZJ;
    public static final C0Q6U LIZ = new C0Q6U();
    public static Long LIZIZ = 0L;
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(577));

    public static void LIZJ() {
        LIZJ = null;
    }

    public static void LIZLLL(Long l) {
        LIZIZ = l;
    }

    public static void LIZ(Context context, int i, SearchResultParam searchResultParam, Long l, Fragment fragment) {
        Long lValueOf;
        SearchResultParam searchResultParamLIZ;
        long jLongValue;
        ISearchContextAbility iSearchContextAbilityLJ;
        C0PCY<C0PM7> c0pcyPR;
        C0PM7 c0pm7;
        if (context == null) {
            return;
        }
        if (l != null && searchResultParam != null) {
            searchResultParam.setSearchSession(l.longValue());
        }
        LifecycleOwner lifecycleOwnerLIZ = C651290Pgd.LIZ();
        if (lifecycleOwnerLIZ != null && (iSearchContextAbilityLJ = C0Q3E.LJ(lifecycleOwnerLIZ)) != null && (c0pcyPR = iSearchContextAbilityLJ.pR()) != null && (c0pm7 = (C0PM7) c0pcyPR.LIZJ()) != null) {
            lValueOf = Long.valueOf(c0pm7.LLILLJJLI);
        } else {
            lValueOf = null;
        }
        if (C08A4.LIZIZ(lValueOf) && searchResultParam != null) {
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            } else {
                jLongValue = 0;
            }
            searchResultParam.setEndToEndSession(jLongValue);
        }
        C08LX c08lx = new C08LX(new C08LY(C09RB.LJIIIZ(C2097808Js.LJIJJLI((Map) LIZLLL.getValue()), new AwS25S0001000_10(i, 15)), AFwS241S0000000_10.get$arr$(493)));
        while (c08lx.hasNext()) {
            InterfaceC663570Q1b interfaceC663570Q1b = (InterfaceC663570Q1b) c08lx.next();
            if (searchResultParam == null) {
                searchResultParamLIZ = C641110PCr.LIZ(context, fragment);
            } else {
                searchResultParamLIZ = searchResultParam;
            }
            interfaceC663570Q1b.LIZIZ(context, fragment, searchResultParamLIZ);
        }
    }
}
