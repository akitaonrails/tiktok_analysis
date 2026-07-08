package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.15PJ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15PJ {
    public final Context LIZ;
    public final C15PK LIZIZ;
    public final C15PI LIZJ;
    public C15PL LIZLLL;

    public final View LIZJ() {
        View view = new View(this.LIZIZ.getContext());
        view.setId(R.id.joj);
        Rect rectLIZIZ = C148G.LIZIZ(this.LIZ);
        if (rectLIZIZ != null) {
            C786410Ut5.W5(view, new FrameLayout.LayoutParams(rectLIZIZ.width(), rectLIZIZ.height()));
        }
        view.setBackground(new ColorDrawable(C960203pA.LIZ(R.attr.e1, this.LIZ)));
        return view;
    }

    public final FrameLayout LIZLLL() {
        FrameLayout frameLayout = new FrameLayout(this.LIZIZ.getContext());
        frameLayout.setId(R.id.hzn);
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public final void LIZIZ() {
        View viewLIZJ = LIZJ();
        FrameLayout frameLayout = new FrameLayout(this.LIZIZ.getContext());
        frameLayout.setId(R.id.ugk);
        List listLIZJ = C148G.LIZJ(this.LIZ);
        if (listLIZJ != null) {
            LJ(this.LIZIZ.getOrientation(), (FrameLayout) this.LIZIZ.findViewById(R.id.hzn), frameLayout, (Rect) ListProtector.get(listLIZJ, 0), (Rect) ListProtector.get(listLIZJ, 1));
        }
        Integer numValueOf = Integer.valueOf(this.LIZJ.LIZJ);
        if (numValueOf.intValue() != -1) {
            numValueOf.intValue();
            frameLayout.addView(C786410Ut5.Td(C786410Ut5.ne(this.LIZ), this.LIZJ.LIZJ, this.LIZIZ, false));
        }
        this.LIZIZ.addView(viewLIZJ);
        this.LIZIZ.addView(frameLayout);
        this.LIZLLL = C15PL.DUAL_SCREEN;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C15PJ(android.content.Context r6, X.C15PK r7, X.C15PI r8) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15PJ.<init>(android.content.Context, X.15PK, X.15PI):void");
    }

    public final void LIZ(int i, Rect rect, Rect rect2) {
        boolean z;
        this.LIZIZ.setOrientation(i);
        View viewLIZJ = LIZJ();
        FrameLayout frameLayout = new FrameLayout(this.LIZIZ.getContext());
        frameLayout.setId(R.id.hzn);
        FrameLayout frameLayout2 = new FrameLayout(this.LIZIZ.getContext());
        frameLayout2.setId(R.id.ugk);
        LJ(i, frameLayout, frameLayout2, rect, rect2);
        Integer numValueOf = Integer.valueOf(this.LIZJ.LIZIZ);
        if (numValueOf.intValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            numValueOf.intValue();
            frameLayout.addView(C786410Ut5.Td(C786410Ut5.ne(this.LIZ), this.LIZJ.LIZIZ, this.LIZIZ, false));
        }
        Integer numValueOf2 = Integer.valueOf(this.LIZJ.LIZJ);
        if (numValueOf2.intValue() != -1) {
            numValueOf2.intValue();
            frameLayout2.addView(C786410Ut5.Td(C786410Ut5.ne(this.LIZ), this.LIZJ.LIZJ, this.LIZIZ, false));
        }
        this.LIZIZ.addView(frameLayout);
        this.LIZIZ.addView(viewLIZJ);
        this.LIZIZ.addView(frameLayout2);
    }

    public static void LJ(int i, FrameLayout frameLayout, FrameLayout frameLayout2, Rect rect, Rect rect2) {
        if (i == 1) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams.weight = 1.0f;
            C786410Ut5.a6(frameLayout, layoutParams);
            C786410Ut5.a6(frameLayout2, new LinearLayout.LayoutParams(-1, rect2.height()));
            return;
        }
        C786410Ut5.a6(frameLayout, new LinearLayout.LayoutParams(rect.width(), -1));
        C786410Ut5.a6(frameLayout2, new LinearLayout.LayoutParams(rect2.width(), -1));
    }
}
