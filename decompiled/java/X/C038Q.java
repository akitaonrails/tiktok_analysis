package X;

import android.view.ContextThemeWrapper;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.038Q, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C038Q extends C09AY implements Function1<C197039127h, Unit> {
    public C038Q() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C197039127h c197039127h) {
        C197039127h c197039127h2 = c197039127h;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c5r, new ContextThemeWrapper(c197039127h2.getContext(), R.style.z4));
        if (numLIZJ != null) {
            c197039127h2.setTextColor(numLIZJ.intValue());
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.exp);
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
        c197039127h2.setBackground(c384050F3z.LIZ(c197039127h2.getContext()));
        c197039127h2.LJJLI(true);
        c197039127h2.setTuxFont(62);
        return Unit.LIZ;
    }
}
