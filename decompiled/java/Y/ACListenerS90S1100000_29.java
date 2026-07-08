package Y;

import X.AbstractC19417810y0;
import X.C0IJT;
import X.C0IQ1;
import X.C12OF;
import X.C12OY;
import X.C16FV;
import X.C19416210xk;
import X.C19416710xp;
import X.C1954807lC;
import X.C474500IjA;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes30.dex */
public class ACListenerS90S1100000_29 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS90S1100000_29 aCListenerS90S1100000_29, View view) {
        ((AbstractC19417810y0) aCListenerS90S1100000_29.l1).LIZLLL(aCListenerS90S1100000_29.s0);
    }

    public static final void onClick$1(ACListenerS90S1100000_29 aCListenerS90S1100000_29, View view) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C19416210xk c19416210xk = (C19416210xk) aCListenerS90S1100000_29.l1;
        long j = jElapsedRealtime - c19416210xk.LJIIJ;
        if (j < 0) {
            j = 0;
        }
        DataChannel dataChannelLJ = c19416210xk.LJ();
        C0IQ1 c0iq1 = ((C19416210xk) aCListenerS90S1100000_29.l1).LJ;
        String str = aCListenerS90S1100000_29.s0;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("live_status_icon_banner_click");
        c474500IjALIZ.LJIJJLI(dataChannelLJ);
        C19416710xp c19416710xpLJIIIIZZ = C12OY.LJIIIIZZ(dataChannelLJ);
        int i = 1;
        C12OY.LIZIZ(c474500IjALIZ, c19416710xpLJIIIIZZ, true);
        int i2 = C12OF.LIZIZ[c0iq1.LIZ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    i = 2;
                } else {
                    throw new C1954807lC();
                }
            }
        } else {
            i = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "notification_type");
        c474500IjALIZ.LJJII(str, "notification_content");
        c474500IjALIZ.LJJII(Long.valueOf(j), "exposure_duration");
        c474500IjALIZ.LIZ();
        C16FV c16fv = ((C19416210xk) aCListenerS90S1100000_29.l1).LJFF;
        if (c16fv != null) {
            c16fv.performClick();
        }
    }

    public ACListenerS90S1100000_29(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
