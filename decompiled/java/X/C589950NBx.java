package X;

import Y.ACListenerS113S0200000_9;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: renamed from: X.0NBx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C589950NBx {
    public final Function2<Float, Boolean, Unit> LIZ;
    public final Map<Float, View> LIZIZ;
    public float LIZJ;

    public final void LIZ(float f) {
        for (Map.Entry<Float, View> entry : this.LIZIZ.entrySet()) {
            View value = entry.getValue();
            float fFloatValue = entry.getKey().floatValue();
            int i = 0;
            if (f == fFloatValue) {
                i = R.drawable.ba3;
            }
            value.setBackgroundResource(i);
        }
    }

    public C589950NBx(View view, AwS623S0100000_9 awS623S0100000_9) {
        this.LIZ = awS623S0100000_9;
        Map<Float, View> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair(Float.valueOf(0.5f), C520680KbS.LIZ(R.id.vtq, view)), new Pair(Float.valueOf(1.0f), C520680KbS.LIZ(R.id.vts, view)), new Pair(Float.valueOf(1.5f), C520680KbS.LIZ(R.id.vtr, view)), new Pair(Float.valueOf(2.0f), C520680KbS.LIZ(R.id.vtt, view)));
        this.LIZIZ = mapLJIIIIZZ;
        this.LIZJ = 1.0f;
        for (Map.Entry<Float, View> entry : mapLJIIIIZZ.entrySet()) {
            C786410Ut5.I7(new ACListenerS113S0200000_9(this, entry, 25), entry.getValue());
        }
    }
}
