package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e4p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1074850e4p implements InterfaceC1891350zJl {
    public final User LL;
    public final int LLILLJJLI;
    public final C1074520e4I LLILLL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public int LIZ() {
        return this.LLILLJJLI;
    }

    public User LIZIZ() {
        return this.LL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return areItemTheSame(interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1074850e4p c1074850e4p;
        User userLIZIZ;
        String uid = LIZIZ().getUid();
        String uid2 = null;
        if ((interfaceC1891350zJl instanceof C1074850e4p) && (c1074850e4p = (C1074850e4p) interfaceC1891350zJl) != null && (userLIZIZ = c1074850e4p.LIZIZ()) != null) {
            uid2 = userLIZIZ.getUid();
        }
        return Intrinsics.LJFF(uid, uid2);
    }

    public C1074850e4p(User user, int i, C1074520e4I c1074520e4I) {
        this.LL = user;
        this.LLILLJJLI = i;
        this.LLILLL = c1074520e4I;
    }
}
