package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DOm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338420DOm {
    public static C1749280vcc LIZ(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        C1749280vcc c1749280vcc = new C1749280vcc(context, null, 6);
        C786410Ut5.U6(c1749280vcc, new ViewGroup.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(240))));
        c1749280vcc.setLayoutVariant(1);
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.ng;
        Drawable drawableLIZ = c0hti.LIZ(context);
        c1722300uv6.LIZJ = 2;
        c1722300uv6.LIZ = drawableLIZ;
        c1722300uv6.LJI = context.getString(2131834733);
        c1722300uv6.LJIIIIZZ = context.getString(2131834842);
        c1749280vcc.setStatus(c1722300uv6);
        return c1749280vcc;
    }
}
