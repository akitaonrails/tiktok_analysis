package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0PIj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C642590PIj {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(478));

    public static final void LIZ(List<? extends SearchChallenge> list) {
        if (list == null) {
            return;
        }
        Iterator<? extends SearchChallenge> it2 = list.iterator();
        while (it2.hasNext()) {
            List<Aweme> awemes = it2.next().getAwemes();
            if (awemes != null) {
                int i = 0;
                for (Aweme aweme : awemes) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        ListProtector.set(awemes, i, ((IAwemeService) LIZ.getValue()).LLILLL(aweme));
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
    }
}
