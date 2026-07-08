package X;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.0zMY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893080zMY {
    public static final void LIZIZ(C1722300uv6 c1722300uv6) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_large_wifi_slash;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZIZ = c419910GdJ;
        c1722300uv6.LJFF = Integer.valueOf(R.string.m25);
        c1722300uv6.LJII = Integer.valueOf(R.string.f8c);
        c1722300uv6.LJIIL = C878203bw.LIZ;
    }

    public static final void LJ(C1722300uv6 c1722300uv6) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_large_magnify_glass;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZIZ = c419910GdJ;
        c1722300uv6.LJFF = Integer.valueOf(R.string.kgn);
        c1722300uv6.LJII = 2131835789;
    }

    public static final void LIZ(C1722300uv6 c1722300uv6, Function0 function0) {
        LIZIZ(c1722300uv6);
        c1722300uv6.LJIIIZ = new AwS598S0100000_19(function0, (Function0<Unit>) 854);
    }

    public static final void LJFF(C1722300uv6 c1722300uv6, Function0 function0) {
        c1722300uv6.LJFF = 2131832569;
        c1722300uv6.LJII = 2131832568;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_large_error_robot;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZIZ = c419910GdJ;
        c1722300uv6.LJIIIZ = new AwS598S0100000_19(function0, (Function0<Unit>) 854);
        c1722300uv6.LJIIL = C878203bw.LIZ;
    }

    public static final void LJI(C1722300uv6 c1722300uv6, Context context, final Function0 function0) {
        String string = context.getString(R.string.l6r);
        C444910HcX c444910HcX = new C444910HcX(string);
        c444910HcX.LIZ(51);
        C786410Ut5.s2(c444910HcX, new AbstractC426530Gnz() { // from class: X.0zMX
            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
            }

            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                function0.invoke();
            }
        }, 0, string.length(), 18);
        c1722300uv6.LJIIIIZZ = c444910HcX;
        c1722300uv6.LJIIL = C878203bw.LIZ;
    }

    public static final void LIZJ(C1722300uv6 c1722300uv6, String str, String str2, int i, int i2, int i3, Function0 function0) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i3;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZIZ = c419910GdJ;
        c1722300uv6.LIZLLL = i;
        c1722300uv6.LJ = i2;
        c1722300uv6.LJI = str;
        c1722300uv6.LJIIIIZZ = str2;
        c1722300uv6.LJIIJ = new AwS607S0100000_28(function0, (Function0<Unit>) 369);
    }
}
