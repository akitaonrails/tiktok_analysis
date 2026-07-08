package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.19LA, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19LA {
    public final View LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 779));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 778));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 776));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 777));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS576S0100000_32(this, 775));
    public final C19LL LJI = new C19LL(Integer.TYPE, 15);

    public final int LIZ() {
        Context context;
        Integer numValueOf;
        View view = this.LIZ;
        if (view == null || (context = view.getContext()) == null) {
            return -14625300;
        }
        if (C960203pA.LIZIZ(context)) {
            numValueOf = C1308910kAL.LIZJ(R.attr.a0c, context);
        } else {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a09, context);
            numValueOf = Integer.valueOf(numLIZJ != null ? numLIZJ.intValue() : -14625300);
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return -14625300;
    }

    public C19LA(View view) {
        this.LIZ = view;
    }
}
