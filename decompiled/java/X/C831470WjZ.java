package X;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0WjZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C831470WjZ {
    public final Account LIZ;
    public final Set<Scope> LIZIZ;
    public final Set<Scope> LIZJ;
    public final Map<C832010WkR<?>, C2288641Ei6> LIZLLL;
    public final View LJ;
    public final String LJFF;
    public final String LJI;
    public final C831610Wjn LJII;
    public Integer LJIIIIZZ;

    public C831470WjZ(Account account, Set set, C830490Whz c830490Whz, String str, String str2, C831610Wjn c831610Wjn) {
        Set<Scope> setUnmodifiableSet;
        this.LIZ = account;
        if (set == null) {
            setUnmodifiableSet = Collections.emptySet();
        } else {
            setUnmodifiableSet = Collections.unmodifiableSet(set);
        }
        this.LIZIZ = setUnmodifiableSet;
        Map<C832010WkR<?>, C2288641Ei6> mapEmptyMap = c830490Whz == null ? Collections.emptyMap() : c830490Whz;
        this.LIZLLL = mapEmptyMap;
        this.LJ = null;
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = c831610Wjn == null ? C831610Wjn.LL : c831610Wjn;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator<C2288641Ei6> it2 = mapEmptyMap.values().iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
            hashSet.addAll(null);
        }
        this.LIZJ = Collections.unmodifiableSet(hashSet);
    }
}
