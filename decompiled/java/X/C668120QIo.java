package X;

import com.ss.android.ugc.aweme.search.pages.middlepage.config.NewPostLimitConfig;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0QIo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668120QIo {
    public static final NewPostLimitConfig LIZ = new NewPostLimitConfig(2, 3);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(467));
    public static final Set<String> LIZJ = new LinkedHashSet();

    public static final boolean LIZ(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return !LIZJ.contains(str);
    }
}
