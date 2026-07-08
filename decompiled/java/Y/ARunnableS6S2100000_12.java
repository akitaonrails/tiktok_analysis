package Y;

import X.C0T6Q;
import X.C1C7U;
import X.C2188811AlT;
import X.C2197011Ayh;
import android.content.Context;
import android.widget.TextView;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MiniGameFragment;

/* JADX INFO: loaded from: classes13.dex */
public class ARunnableS6S2100000_12 implements Runnable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

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
        MiniGameFragment miniGameFragment;
        TextView textView;
        MiniGameFragment miniGameFragment2 = (MiniGameFragment) this.l2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((MiniGameFragment) this.l2).q);
        sbLIZ.append('\n');
        sbLIZ.append(this.s0);
        sbLIZ.append(": ");
        sbLIZ.append(this.s1);
        miniGameFragment2.q = C2188811AlT.LIZIZ(sbLIZ);
        C2197011Ayh.LIZ.getClass();
        if (!C2197011Ayh.LIZJ() || (textView = (miniGameFragment = (MiniGameFragment) this.l2).p) == null) {
            return;
        }
        textView.setText(miniGameFragment.q);
    }

    public static final void run$0(ARunnableS6S2100000_12 aRunnableS6S2100000_12) {
        boolean zLIZ;
        C1C7U.LIZ("CacheRepository@34a7.removeKey$1");
        try {
            C0T6Q.LIZJ((Context) aRunnableS6S2100000_12.l2, aRunnableS6S2100000_12.s0).edit().remove(aRunnableS6S2100000_12.s1).apply();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CacheRepository@34a7.removeKey$1");
    }

    public static final void run$1(ARunnableS6S2100000_12 aRunnableS6S2100000_12) {
        boolean zLIZ;
        C1C7U.LIZ("MiniGameFragment@6eb9.updateLogText$2");
        try {
            aRunnableS6S2100000_12.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MiniGameFragment@6eb9.updateLogText$2");
    }

    public ARunnableS6S2100000_12(MiniGameFragment miniGameFragment, String str, int i) {
        this.$t = i;
        this.l2 = miniGameFragment;
        this.s0 = "minis-MiniGameFragment";
        this.s1 = str;
    }

    public ARunnableS6S2100000_12(Context context, String str, String str2, int i) {
        this.$t = i;
        this.l2 = context;
        this.s0 = str;
        this.s1 = str2;
    }
}
