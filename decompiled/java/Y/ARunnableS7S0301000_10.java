package Y;

import X.C1C7U;
import X.C486180J4u;
import X.C653660PkS;
import X.C655840Pny;
import X.C688690Qzr;
import android.text.Layout;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public class ARunnableS7S0301000_10 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public final void LIZ$0() {
        C655840Pny c655840Pny = new C655840Pny();
        c655840Pny.LJIIZILJ("search_id", ((C653660PkS) this.l0).LJIIJ);
        c655840Pny.LJIIZILJ("search_keyword", ((C653660PkS) this.l0).LJFF);
        c655840Pny.LJIIZILJ("search_type", ((C653660PkS) this.l0).LIZLLL);
        c655840Pny.LJIJI("search_result_id", ((C653660PkS) this.l0).LJIJI);
        User user = (User) this.l1;
        c655840Pny.LJIIZILJ("list_item_id", String.valueOf(user != null ? Long.valueOf(C486180J4u.LIZ(user)) : null));
        c655840Pny.LJIIZILJ("enter_from_merge", "general_search");
        c655840Pny.LJIIZILJ("enter_method", "live_cell");
        c655840Pny.LJIIZILJ("action_type", "click");
        User user2 = (User) this.l1;
        c655840Pny.LJIIZILJ("anchor_id", user2 != null ? user2.getUid() : null);
        User user3 = (User) this.l1;
        c655840Pny.LJIIZILJ("room_id", String.valueOf(user3 != null ? Long.valueOf(C486180J4u.LIZ(user3)) : null));
        c655840Pny.LJIIZILJ("request_id", ((C653660PkS) this.l0).LJIIJ);
        User user4 = (User) this.l1;
        c655840Pny.LJJIJL(user4 != null ? user4.getFollowStatus() : 0);
        c655840Pny.LJIIZILJ("realtime_watch_user", String.valueOf(this.i3));
        Map map = (Map) this.l2;
        if (map != null) {
            c655840Pny.LJIJ(map);
        }
        c655840Pny.LJIILJJIL();
    }

    public static final void run$0(ARunnableS7S0301000_10 aRunnableS7S0301000_10) {
        boolean zLIZ;
        int i;
        C1C7U.LIZ("SearchTruncateMarkdownTextViewV2@597f.formatText$lambda$1$$inlined$doOnPreDraw$1");
        try {
            Layout layoutLJIIIIZZ = ((C688690Qzr) aRunnableS7S0301000_10.l1).LJIIIIZZ();
            if (layoutLJIIIIZZ != null || (layoutLJIIIIZZ = ((C688690Qzr) aRunnableS7S0301000_10.l1).getLayout()) != null) {
                if (layoutLJIIIIZZ.getWidth() <= 0 && (i = aRunnableS7S0301000_10.i3) < 3) {
                    ((C688690Qzr) aRunnableS7S0301000_10.l1).LJJJLIIL(i + 1, (Function1) aRunnableS7S0301000_10.l2);
                } else {
                    ((Function1) aRunnableS7S0301000_10.l2).invoke(((C688690Qzr) aRunnableS7S0301000_10.l1).LJJLIIIJJI(layoutLJIIIIZZ));
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchTruncateMarkdownTextViewV2@597f.formatText$lambda$1$$inlined$doOnPreDraw$1");
    }

    public static final void run$1(ARunnableS7S0301000_10 aRunnableS7S0301000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchLiveWithVideoItemViewHolder$Companion@73f7.mobShowOrClick$5");
        try {
            aRunnableS7S0301000_10.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchLiveWithVideoItemViewHolder$Companion@73f7.mobShowOrClick$5");
    }

    public ARunnableS7S0301000_10(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i3 = i;
        this.l2 = obj3;
    }
}
