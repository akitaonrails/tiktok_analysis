package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0vFX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1734970vFX {
    public static final /* synthetic */ int LIZ = 0;

    public static C1722300uv6 LIZ(Function0 function0) {
        return LIZIZ(R.drawable.nl, 2131836593, null, function0);
    }

    public static C1722300uv6 LIZIZ(int i, int i2, Integer num, Function0 function0) {
        Drawable drawableLIZ;
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        Context contextLIZ = C176600m4.LIZ();
        if (contextLIZ != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = i;
            drawableLIZ = c0hti.LIZ(contextLIZ);
        } else {
            drawableLIZ = null;
        }
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZ = drawableLIZ;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
        c1722300uv6.LIZLLL = iLIZIZ;
        c1722300uv6.LJ = iLIZIZ2;
        c1722300uv6.LJFF = Integer.valueOf(i2);
        if (num != null) {
            c1722300uv6.LJII = num;
        }
        if (function0 != null) {
            c1722300uv6.LJIIIZ = new AwS605S0100000_26(function0, (Function0<Unit>) 576);
        }
        return c1722300uv6;
    }
}
