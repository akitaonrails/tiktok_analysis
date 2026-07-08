package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;

/* JADX INFO: renamed from: X.0kV3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class DialogC1321750kV3 extends DialogC19728412Gs {
    public static final String LL = DialogC1321750kV3.class.getSimpleName();

    public final int LJJLJ() throws Throwable {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display displayLLILZIL = C2204961BRm.LLILZIL(getWindow().getWindowManager(), new C0WZX("dzBzEg4jUdKSQVYySFyGY8HACamMoezk3VeynIJIdVxFxzzTWMk=", null));
        Point point = new Point();
        Point point2 = new Point();
        displayLLILZIL.getCurrentSizeRange(point, point2);
        displayLLILZIL.getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int rotation = displayLLILZIL.getRotation();
        if (rotation != 0 && rotation != 2) {
            return i;
        }
        int i2 = point2.y;
        if (i2 < i) {
            i = i2;
        }
        int iN3 = C786410Ut5.n3(getContext().getResources(), "status_bar_height", "dimen", "android");
        return i + (iN3 > 0 ? getContext().getResources().getDimensionPixelSize(iN3) : 0);
    }

    public final View LJJLIIJ() {
        return getWindow().getDecorView();
    }

    public DialogC1321750kV3(Context context) {
        super(context);
    }

    public static Activity LJJLIIIJLLLLLLLZ(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return LJJLIIIJLLLLLLLZ(((ContextWrapper) context).getBaseContext());
        }
        throw new IllegalArgumentException();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setGravity(3);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setLayout(2, -1);
        getWindow().setSoftInputMode(16);
        getWindow().addFlags(32);
        getWindow().addFlags(8);
        getWindow().addFlags(131072);
        getWindow().clearFlags(2);
        getWindow().clearFlags(1024);
        getWindow().clearFlags(67108864);
        getWindow().clearFlags(256);
        getWindow().clearFlags(134217728);
        LJJLIIJ().setSystemUiVisibility(0);
        LJJLIIJ().setOutlineProvider(null);
        LJJLIIJ().setElevation(0.0f);
        LJJLIIJ().setTranslationZ(0.0f);
    }
}
