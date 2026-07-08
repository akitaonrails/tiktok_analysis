package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0Qkz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679470Qkz extends C0DXR {
    public static final float LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public final Integer LL;
    public final C679880Qle LLILLJJLI = new C679880Qle();

    public C679470Qkz(Integer num) {
        this.LL = num;
    }

    @Override // X.C0DXR
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        this.LLILLJJLI.LIZIZ(canvas, recyclerView);
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        if (view instanceof C679690QlL) {
            C0HXV.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), view);
            C0HXV.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), view);
            Integer num = this.LL;
            if (num != null) {
                view.setBackgroundColor(num.intValue());
            }
            float f = LLILLL;
            C21565319aV.LIZJ(view, null, null, null, Float.valueOf(f), Float.valueOf(f));
        }
        this.LLILLJJLI.getClass();
        C679880Qle.LIZ(rect, view);
    }
}
