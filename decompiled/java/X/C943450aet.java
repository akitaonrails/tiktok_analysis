package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0aet, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C943450aet {
    public final User LIZ;
    public final Pair<User, User> LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final InterfaceC945820aii LJ;
    public final BaseMessage LJFF;
    public final C943510aez LJI;
    public Pair<Integer, Integer> LJII;

    public C943450aet() {
        throw null;
    }

    public C943450aet(User user, Pair pair, long j, long j2, InterfaceC945820aii interfaceC945820aii, BaseMessage baseMessage, C943510aez c943510aez, int i) {
        j = (i & 4) != 0 ? 0L : j;
        j2 = (i & 8) != 0 ? -1L : j2;
        interfaceC945820aii = (i & 16) != 0 ? null : interfaceC945820aii;
        baseMessage = (i & 32) != 0 ? null : baseMessage;
        c943510aez = (i & 64) != 0 ? null : c943510aez;
        this.LIZ = user;
        this.LIZIZ = pair;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = interfaceC945820aii;
        this.LJFF = baseMessage;
        this.LJI = c943510aez;
        this.LJII = null;
    }
}
