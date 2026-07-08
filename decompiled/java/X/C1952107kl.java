package X;

import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07kl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1952107kl {
    public static final C1952107kl LIZ = new C1952107kl();
    public static final List<String> LIZIZ = new ArrayList();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1263));

    public static Keva LIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        return Keva.getRepo(C786410Ut5.j4("inbox_repost_record_%s_repo_v2", Arrays.copyOf(new Object[]{curUserId}, 1)));
    }
}
