package X;

import Y.ARunnableS14S1000000_23;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: renamed from: X.0pZ3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516430pZ3 implements InterfaceC427710Gpt {
    public static final C1516430pZ3 LL = new C1516430pZ3();
    public static final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(71));
    public static final Keva LLILLL = Keva.getRepo("friends_feed_list");
    public static String LLILZ = C0XQ7.LJFF().getCurUserId();

    public static final String LIZ() {
        Keva keva = LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("page_token_");
        sbLIZ.append(LLILZ);
        return keva.getString(C2188811AlT.LIZIZ(sbLIZ), "");
    }

    public static void LIZIZ(String str) {
        ((ExecutorService) LLILLJJLI.getValue()).submit(new ARunnableS14S1000000_23(str, 0));
    }

    @Override // X.InterfaceC427710Gpt
    public final void LLLLLLZZ(int i, User user, User user2) {
        if (user2 != null) {
            LLILZ = user2.getUid();
        }
    }
}
