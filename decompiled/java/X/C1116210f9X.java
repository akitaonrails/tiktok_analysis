package X;

import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.EmoteWithIndex;
import java.util.List;

/* JADX INFO: renamed from: X.0f9X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1116210f9X extends AbstractC1136060ffY {
    public final String LL;
    public final User LLILLJJLI;
    public final String LLILLL;
    public long LLILZ;
    public final long LLILZIL;
    public final int LLILZLL;
    public final String LLIZLLLIL;
    public EnumC1116160f9S LLJIJIL;
    public long LLJILJIL;
    public final String LLJILJILJ;
    public final List<EmoteWithIndex> LLJJIJI;
    public int LLIZ = 0;
    public long LLJ = 0;
    public long LLJI = 0;
    public int LLJILLL = 0;
    public boolean LLJJ = false;
    public User LLJJI = null;
    public boolean LLJJIII = false;

    public final long LIZ() {
        return ((this.LLJI - SystemClock.elapsedRealtime()) + 499) / 1000;
    }

    public C1116210f9X(String str, User user, String str2, long j, long j2, int i, String str3, EnumC1116160f9S enumC1116160f9S, long j3, String str4, List list) {
        this.LL = str;
        this.LLILLJJLI = user;
        this.LLILLL = str2;
        this.LLILZ = j;
        this.LLILZIL = j2;
        this.LLILZLL = i;
        this.LLIZLLLIL = str3;
        this.LLJIJIL = enumC1116160f9S;
        this.LLJILJIL = j3;
        this.LLJILJILJ = str4;
        this.LLJJIJI = list;
    }
}
