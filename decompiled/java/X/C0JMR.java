package X;

import com.bytedance.android.livesdk.chatroom.api.SMBCourseVideo;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0JMR, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JMR {
    public final long LIZ;
    public final SMBCourseVideo LIZIZ;
    public final C0JMN LIZJ;
    public Aweme LIZLLL;

    public final Aweme LIZIZ() {
        SMBCourseVideo sMBCourseVideo = this.LIZIZ;
        String str = sMBCourseVideo != null ? sMBCourseVideo.awemeStructStr : null;
        Aweme aweme = this.LIZLLL;
        if (aweme != null) {
            return aweme;
        }
        Aweme awemeLIZLLL = str != null ? C490750JMj.LIZLLL(str) : null;
        this.LIZLLL = awemeLIZLLL;
        return awemeLIZLLL;
    }

    public final boolean LIZJ() {
        return this.LIZJ == C0JMN.AVAILABLE && LIZIZ() != null;
    }

    public C0JMR(long j, SMBCourseVideo sMBCourseVideo, C0JMN c0jmn) {
        this.LIZ = j;
        this.LIZIZ = sMBCourseVideo;
        this.LIZJ = c0jmn;
    }

    public static C0JMR LIZ(C0JMR c0jmr, C0JMN c0jmn, int i) {
        long j;
        SMBCourseVideo sMBCourseVideo;
        if ((i & 1) != 0) {
            j = c0jmr.LIZ;
        } else {
            j = 0;
        }
        if ((i & 2) != 0) {
            sMBCourseVideo = c0jmr.LIZIZ;
        } else {
            sMBCourseVideo = null;
        }
        if ((i & 4) != 0) {
            c0jmn = c0jmr.LIZJ;
        }
        c0jmr.getClass();
        return new C0JMR(j, sMBCourseVideo, c0jmn);
    }
}
