package Y;

import X.C0IJT;
import X.C474500IjA;
import android.os.SystemClock;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes5.dex */
public class ACListenerS6S0101100_4 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public long j2;
    public Object l0;

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

    public static final void onClick$0(ACListenerS6S0101100_4 aCListenerS6S0101100_4, View view) {
        Long l;
        long jLongValue;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Object tag = view.getTag(aCListenerS6S0101100_4.i1);
        if (tag == null) {
            tag = 0;
        }
        if (tag instanceof Long) {
            l = (Long) tag;
        } else {
            l = null;
        }
        view.setTag(aCListenerS6S0101100_4.i1, Long.valueOf(jUptimeMillis));
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (jUptimeMillis - jLongValue > aCListenerS6S0101100_4.j2) {
            ((Function1) aCListenerS6S0101100_4.l0).invoke(view);
        }
    }

    public static final void onClick$1(ACListenerS6S0101100_4 aCListenerS6S0101100_4, View view) {
        Long l;
        long jLongValue;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Object tag = view.getTag(aCListenerS6S0101100_4.i1);
        if (tag instanceof Long) {
            l = (Long) tag;
        } else {
            l = null;
        }
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        view.setTag(aCListenerS6S0101100_4.i1, Long.valueOf(jUptimeMillis));
        long j = jUptimeMillis - jLongValue;
        if (jLongValue != 0 && j <= aCListenerS6S0101100_4.j2) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_wallet_recharge_click_debounced");
            c474500IjALIZ.LJJII(Long.valueOf(aCListenerS6S0101100_4.j2), "debounce_duration_ms");
            c474500IjALIZ.LJJII(Long.valueOf(j), "time_since_last_click_ms");
            c474500IjALIZ.LIZ();
            return;
        }
        ((Function1) aCListenerS6S0101100_4.l0).invoke(view);
    }

    public ACListenerS6S0101100_4(long j, AwS606S0100000_27 awS606S0100000_27, int i) {
        this.$t = i;
        this.i1 = R.id.dol;
        this.j2 = j;
        this.l0 = awS606S0100000_27;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0007: IPUT (r5 I:java.lang.Object), (r0 I:Y.ACListenerS6S0101100_4) (LINE:67108871) Y.ACListenerS6S0101100_4.l0 java.lang.Object, block:B:2:0x0000 */
    public ACListenerS6S0101100_4(int i, int i2, long j, Function1<? super View, Unit> function1) {
        Object obj;
        this.$t = function1;
        this.i1 = i;
        this.j2 = i2;
        this.l0 = obj;
    }
}
