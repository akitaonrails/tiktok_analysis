package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0u1T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1687810u1T {
    public final Context LIZ;
    public final View LIZIZ;
    public final TextView LIZJ;
    public final WindowManager.LayoutParams LIZLLL;
    public final Rect LJ;
    public final int[] LJFF;
    public final int[] LJI;

    public C1687810u1T(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.LIZLLL = layoutParams;
        this.LJ = new Rect();
        this.LJFF = new int[2];
        this.LJI = new int[2];
        this.LIZ = context;
        View viewSd = C786410Ut5.Sd(R.layout.i5, C786410Ut5.ne(context), null);
        this.LIZIZ = viewSd;
        this.LIZJ = (TextView) viewSd.findViewById(R.id.o8v);
        layoutParams.setTitle(C1687810u1T.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.ap;
        layoutParams.flags = 24;
    }
}
