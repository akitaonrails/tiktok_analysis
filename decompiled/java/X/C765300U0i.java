package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.KaraokeSong;

/* JADX INFO: renamed from: X.0U0i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C765300U0i {
    public final long LIZ;
    public final long LIZIZ;

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final boolean equals(Object obj) {
        User user;
        C0U2X c0u2x;
        if (obj instanceof C765300U0i) {
            C765300U0i c765300U0i = (C765300U0i) obj;
            if (this.LIZ == c765300U0i.LIZ && this.LIZIZ == c765300U0i.LIZIZ) {
                return true;
            }
            return false;
        }
        if (obj instanceof C0U22) {
            C0U22 c0u22 = (C0U22) obj;
            if (this.LIZ == c0u22.LIZ && (c0u2x = c0u22.LJIILLIIL) != null && this.LIZIZ == c0u2x.LIZIZ) {
                return true;
            }
            return false;
        }
        if (obj instanceof KaraokeSong) {
            KaraokeSong karaokeSong = (KaraokeSong) obj;
            if (this.LIZ == karaokeSong.id && (user = karaokeSong.singer) != null && this.LIZIZ == user.getId()) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    public C765300U0i(long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
    }
}
