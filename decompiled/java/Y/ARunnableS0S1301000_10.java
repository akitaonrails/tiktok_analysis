package Y;

import X.C1C7U;
import X.C430210Gtv;
import X.C658320Pry;
import X.ViewOnClickListenerC662370PyV;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes11.dex */
public class ARunnableS0S1301000_10 implements Runnable {
    public final int $t;
    public int i4;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS0S1301000_10 aRunnableS0S1301000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchUserViewHolder@dde6.loadAvatarView$1$1");
        try {
            ViewOnClickListenerC662370PyV.d6((C430210Gtv) aRunnableS0S1301000_10.l2, (User) aRunnableS0S1301000_10.l3, aRunnableS0S1301000_10.i4, aRunnableS0S1301000_10.s0, ((C658320Pry) aRunnableS0S1301000_10.l1).LIZ());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchUserViewHolder@dde6.loadAvatarView$1$1");
    }

    public static final void run$1(ARunnableS0S1301000_10 aRunnableS0S1301000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchUserViewHolder@dde6.loadAvatarView$1$2");
        try {
            ViewOnClickListenerC662370PyV.d6((C430210Gtv) aRunnableS0S1301000_10.l2, (User) aRunnableS0S1301000_10.l3, aRunnableS0S1301000_10.i4, aRunnableS0S1301000_10.s0, ((C658320Pry) aRunnableS0S1301000_10.l1).LIZ());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchUserViewHolder@dde6.loadAvatarView$1$2");
    }

    public ARunnableS0S1301000_10(C658320Pry c658320Pry, C430210Gtv c430210Gtv, User user, int i, String str, int i2) {
        this.$t = i2;
        this.l1 = c658320Pry;
        this.l2 = c430210Gtv;
        this.l3 = user;
        this.i4 = i;
        this.s0 = str;
    }
}
