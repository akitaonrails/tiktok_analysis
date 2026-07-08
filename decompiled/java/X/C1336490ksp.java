package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ksp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336490ksp {
    public final Context LIZ;
    public final ViewGroup LIZIZ;
    public final C371710Ehl LIZJ;
    public TextView LIZLLL;

    public C1336490ksp(Context context) {
        this.LIZ = context;
        C1336000ks2 c1336000ks2 = new C1336000ks2(context);
        ViewGroup viewGroup = (ViewGroup) C786410Ut5.Sd(R.layout.p0, C786410Ut5.ne(context), null);
        this.LIZIZ = viewGroup;
        C371710Ehl c371710Ehl = (C371710Ehl) viewGroup.getChildAt(0);
        this.LIZJ = c371710Ehl;
        this.LIZLLL = (TextView) c371710Ehl.findViewById(R.id.az1);
        c1336000ks2.LIZJ = -1;
        LIZ(c1336000ks2);
        TextView textView = this.LIZLLL;
        if (textView != null) {
            textView.setTextAppearance(context, R.style.a_3);
        }
    }

    public final void LIZ(Drawable drawable) {
        this.LIZIZ.setBackgroundDrawable(drawable);
        if (drawable != null) {
            Rect rect = new Rect();
            drawable.getPadding(rect);
            this.LIZIZ.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            return;
        }
        this.LIZIZ.setPadding(0, 0, 0, 0);
    }
}
