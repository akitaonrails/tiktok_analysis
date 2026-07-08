package X;

import com.bytedance.android.livesdk.model.message.PollMessage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01C1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01C1 {
    public final long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public PollMessage LJFF;
    public EnumC1085350eLl LJI;
    public boolean LJII;

    public C01C1(long j) {
        EnumC1085350eLl enumC1085350eLl = EnumC1085350eLl.NULL;
        this.LIZ = j;
        this.LIZIZ = 0L;
        this.LIZJ = 0L;
        this.LIZLLL = false;
        this.LJ = false;
        this.LJFF = null;
        this.LJI = enumC1085350eLl;
        this.LJII = false;
    }

    public final boolean equals(Object obj) {
        PollMessage pollMessage;
        if (this != obj) {
            if ((obj instanceof C01C1) && (pollMessage = this.LJFF) != null) {
                Long lValueOf = null;
                Long lValueOf2 = Long.valueOf(pollMessage.pollId);
                PollMessage pollMessage2 = ((C01C1) obj).LJFF;
                if (pollMessage2 != null) {
                    lValueOf = Long.valueOf(pollMessage2.pollId);
                }
                if (Intrinsics.LJFF(lValueOf2, lValueOf)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
