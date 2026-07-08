package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashSet;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.14ZP, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14ZP {
    public static final HashSet<String> LIZ = new HashSet<>();
    public static final HashSet<String> LIZIZ = new HashSet<>();
    public static final HashSet<String> LIZJ;

    static {
        new HashSet();
        LIZJ = new HashSet<>();
    }

    public static final void LIZ(Aweme aweme) {
        if (aweme == null) {
            return;
        }
        HashSet<String> hashSet = LIZIZ;
        if (hashSet.contains(aweme.getAid())) {
            return;
        }
        hashSet.add(aweme.getAid());
        C20684815ws.LJFF().execute(new RunnableC173800lc(new AwS574S0100000_30(aweme, 309)));
        C20291714aZ c20291714aZ = C20291714aZ.LIZ;
        AwS574S0100000_30 awS574S0100000_30 = new AwS574S0100000_30(aweme, 308);
        c20291714aZ.getClass();
        C20291714aZ.LIZIZ(awS574S0100000_30);
    }
}
