package Y;

import X.C20441214yg;
import android.view.View;

/* JADX INFO: loaded from: classes18.dex */
public class ACListenerS172S0000000_17 implements View.OnClickListener {
    public final int $t;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                C20441214yg.LIZIZ("TestTooltip", "TestTooltip clicked");
                break;
            case 1:
                C20441214yg.LIZIZ("TestTooltip", "TestTooltip clicked");
                break;
        }
    }

    public ACListenerS172S0000000_17(int i) {
        this.$t = i;
    }
}
