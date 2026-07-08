package Y;

import X.C238400w2;
import X.C761590Tu9;
import android.os.SystemClock;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS98S0201000_12;

/* JADX INFO: loaded from: classes13.dex */
public class ACListenerS22S0200100_12 implements View.OnClickListener {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

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

    public static final void onClick$0(ACListenerS22S0200100_12 aCListenerS22S0200100_12, View view) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C238400w2 c238400w2 = (C238400w2) aCListenerS22S0200100_12.l0;
        if (jElapsedRealtime - c238400w2.element >= aCListenerS22S0200100_12.j2) {
            c238400w2.element = jElapsedRealtime;
            ((View.OnClickListener) aCListenerS22S0200100_12.l1).onClick(view);
        }
    }

    public static final void onClick$1(ACListenerS22S0200100_12 aCListenerS22S0200100_12, View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = ((C761590Tu9) aCListenerS22S0200100_12.l0).LLIZLLLIL;
        if (j == -1 || jCurrentTimeMillis - j >= aCListenerS22S0200100_12.j2) {
            ((Function1) aCListenerS22S0200100_12.l1).invoke(view);
        }
        ((C761590Tu9) aCListenerS22S0200100_12.l0).LLIZLLLIL = jCurrentTimeMillis;
    }

    public ACListenerS22S0200100_12(C761590Tu9 c761590Tu9, AwS98S0201000_12 awS98S0201000_12, int i) {
        this.$t = i;
        this.l0 = c761590Tu9;
        this.j2 = 200L;
        this.l1 = awS98S0201000_12;
    }

    public ACListenerS22S0200100_12(C238400w2 c238400w2, long j, ACListenerS147S0100000_12 aCListenerS147S0100000_12, int i) {
        this.$t = i;
        this.l0 = c238400w2;
        this.j2 = j;
        this.l1 = aCListenerS147S0100000_12;
    }
}
