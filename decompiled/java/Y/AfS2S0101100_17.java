package Y;

import X.C09JN;
import X.C1087930ePv;
import X.C19EG;
import X.C1C7U;
import X.C497740JfY;
import X.C501540Jlg;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: loaded from: classes18.dex */
public class AfS2S0101100_17 implements C09JN {
    public final int $t;
    public int i1;
    public long j2;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS2S0101100_17 afS2S0101100_17, Object obj) {
        LikeHelper likeHelper = (LikeHelper) afS2S0101100_17.l0;
        int i = afS2S0101100_17.i1;
        long j = afS2S0101100_17.j2;
        int i2 = LikeHelper.LLLJL;
        likeHelper.getClass();
        C1C7U.LIZ("LikeHelper@13b2.sendLikeWithTarget$1L");
        Room room = likeHelper.LLILLL;
        C1087930ePv.LIZIZ("profile", i, room, String.valueOf(room.getOwnerUserId()), j, 0, 0, 1, 0);
        C1C7U.LIZIZ("LikeHelper@13b2.sendLikeWithTarget$1L");
    }

    public static final void accept$1(AfS2S0101100_17 afS2S0101100_17, Object obj) {
        LikeHelper likeHelper = (LikeHelper) afS2S0101100_17.l0;
        int i = afS2S0101100_17.i1;
        long j = afS2S0101100_17.j2;
        Throwable th = (Throwable) obj;
        int i2 = LikeHelper.LLLJL;
        likeHelper.getClass();
        C1C7U.LIZ("LikeHelper@13b2.sendLikeWithTarget$2L");
        C19EG c19eg = likeHelper.LLILLJJLI;
        if (c19eg != null && !c19eg.isFinishing()) {
            C501540Jlg.LIZJ(likeHelper.LLILLJJLI, th);
        } else {
            C501540Jlg.LIZJ(C497740JfY.LJII(), th);
        }
        if (th instanceof Exception) {
            Room room = likeHelper.LLILLL;
            LikeHelper.LJJIJIIJIL((Exception) th, "profile", i, room, String.valueOf(room.getOwnerUserId()), j, 0, 0);
        }
        C1C7U.LIZIZ("LikeHelper@13b2.sendLikeWithTarget$2L");
    }

    public AfS2S0101100_17(LikeHelper likeHelper, int i, long j, int i2) {
        this.$t = i2;
        this.l0 = likeHelper;
        this.i1 = i;
        this.j2 = j;
    }
}
