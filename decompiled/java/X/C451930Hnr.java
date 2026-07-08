package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS215S0300000_6;

/* JADX INFO: renamed from: X.0Hnr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451930Hnr {
    public static final C1749280vcc LIZ(Context context, boolean z, float f, Function0<Unit> function0) {
        C1749280vcc c1749280vcc = new C1749280vcc(context, null, 6);
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        c1722300uv6.LJI = context.getString(2131830393);
        c1722300uv6.LJIIIIZZ = context.getString(2131830392);
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.n4;
        Drawable drawableLIZ = c0hti.LIZ(context);
        c1722300uv6.LIZJ = 2;
        c1722300uv6.LIZ = drawableLIZ;
        if (z) {
            c1722300uv6.LJIIIZ = new AwS215S0300000_6(context, (Context) c1749280vcc, (C1749280vcc) function0, (Function0<Unit>) 13);
        }
        c1749280vcc.setStatus(c1722300uv6);
        if (z) {
            c1749280vcc.setButtonTopMargin(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        }
        c1749280vcc.setTopMargin(f);
        return c1749280vcc;
    }
}
