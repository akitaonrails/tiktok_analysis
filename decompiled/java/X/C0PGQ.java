package X;

import android.util.ArrayMap;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0PGQ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PGQ {
    public static void LIZ(long j, long j2, boolean z, long j3, long j4, SearchJediMixFeedFragment searchJediMixFeedFragment, String str) {
        if (z) {
            ViewOnAttachStateChangeListenerC648030PbN.LLJJLIIIJLLLLLLLZ = j2;
            ViewOnAttachStateChangeListenerC648030PbN.LLJL = j;
        }
        ArrayMap<Object, C644680PQk> arrayMap = C644680PQk.LJ;
        C647660Pam.LIZ(searchJediMixFeedFragment.dS()).LIZ(UriProtector.parse(str), new C644660PQi(j3, j4));
        C644060POa c644060POa = C644060POa.LIZ;
        String strDS = searchJediMixFeedFragment.dS();
        c644060POa.getClass();
        C0PO5 c0po5LJIIIIZZ = C644060POa.LJIIIIZZ(strDS);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lynx:");
        sbLIZ.append(C647660Pam.LIZIZ(UriProtector.parse(str)));
        c0po5LJIIIIZZ.LJJJZ.add(C2188811AlT.LIZIZ(sbLIZ));
        C650460PfI<C641910PFt> c650460PfI = new C650460PfI<C641910PFt>() { // from class: X.0PFt
            public static final /* synthetic */ int LJIIZILJ = 0;
        };
        c650460PfI.LJI = true;
        Pair[] pairArr = new Pair[4];
        int i = 0;
        pairArr[0] = new Pair("type", "lynx");
        Long[] lArr = {Long.valueOf(j), Long.valueOf(j2)};
        long jLongValue = 0;
        do {
            jLongValue += lArr[i].longValue();
            i++;
        } while (i < 2);
        pairArr[1] = new Pair("total_cost", Long.valueOf(jLongValue));
        pairArr[2] = new Pair("create_view_cost", Long.valueOf(j));
        pairArr[3] = new Pair("bind_cost", Long.valueOf(j2));
        c650460PfI.LIZ(C2097608Jq.LJIIIIZZ(pairArr));
        c650460PfI.LJIILJJIL();
    }
}
