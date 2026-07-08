package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HUF, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HUF {
    public final Context LIZ;
    public ViewGroup LIZIZ;
    public ValueAnimator LIZJ;

    public final void LIZ() {
        ViewGroup viewGroup;
        Window window;
        Activity activityLIZJ = C0H0N.LIZJ(this.LIZ);
        Object obj = null;
        View decorView = (activityLIZJ == null || (window = activityLIZJ.getWindow()) == null) ? null : window.getDecorView();
        if (!(decorView instanceof ViewGroup) || (viewGroup = (ViewGroup) decorView) == null) {
            return;
        }
        C08QT c08qt = new C08QT(C09RB.LJIIIZ(new C09RD(viewGroup), new Function1<Object, Boolean>() { // from class: X.0HUG
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj2) {
                return Boolean.valueOf(obj2 instanceof ViewGroup);
            }
        }));
        while (true) {
            if (!c08qt.hasNext()) {
                break;
            }
            Object next = c08qt.next();
            if (Intrinsics.LJFF(((View) next).getTag(R.id.ymg), "SliderInspector")) {
                obj = next;
                break;
            }
        }
        ViewGroup viewGroup2 = (ViewGroup) obj;
        if (viewGroup2 != null) {
            this.LIZIZ = viewGroup2;
            return;
        }
        LinearLayout linearLayout = new LinearLayout(this.LIZ);
        C786410Ut5.W5(linearLayout, new FrameLayout.LayoutParams(-2, -2));
        AFwS236S0000000_6.get$arr$(573).invoke(linearLayout);
        C786410Ut5.W4(linearLayout, 0.0f);
        linearLayout.setTag(R.id.ymg, "SliderInspector");
        viewGroup.addView(linearLayout);
        this.LIZIZ = linearLayout;
    }

    public final void LIZIZ() {
        ViewGroup viewGroup = this.LIZIZ;
        if (viewGroup != null) {
            ValueAnimator valueAnimator = this.LIZJ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.LIZJ = new C0HUJ().LIZIZ(viewGroup, new AwS550S0100000_6(this, 1618));
        }
    }

    public final void LIZLLL() {
        ViewGroup viewGroup = this.LIZIZ;
        if (viewGroup != null) {
            ValueAnimator valueAnimator = this.LIZJ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.LIZJ = new C0HUJ().LIZ(viewGroup, new AwS550S0100000_6(this, 1619));
        }
    }

    public C0HUF(Context context) {
        this.LIZ = context;
    }

    public final void LIZJ(String str, final C0GX1 c0gx1, final float f) {
        View view;
        final TextView textView;
        Object next;
        ViewGroup viewGroup = this.LIZIZ;
        if (viewGroup != null) {
            Iterator<View> it2 = new C09RD(viewGroup).iterator();
            while (true) {
                C09RE c09re = (C09RE) it2;
                if (c09re.hasNext()) {
                    next = c09re.next();
                    if (next instanceof TextView) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            view = (View) next;
        } else {
            view = null;
        }
        if ((view instanceof TextView) && (textView = (TextView) view) != null) {
            textView.setText(str);
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(textView, new Runnable() { // from class: X.0GbI
                public final void LIZ() {
                    Rect rectLJ = C0H0N.LJ(c0gx1);
                    SeekBar seekBar = c0gx1;
                    int width = (((seekBar.getWidth() - seekBar.getPaddingStart()) - seekBar.getPaddingEnd()) - seekBar.getThumb().getIntrinsicWidth()) + (seekBar.getThumbOffset() * 2);
                    ViewGroup viewGroup2 = this.LIZIZ;
                    if (viewGroup2 != null) {
                        float width2 = (rectLJ.left - (viewGroup2.getWidth() / 2.0f)) + (c0gx1.getThumb().getIntrinsicWidth() / 2.0f) + (f * width);
                        SeekBar seekBar2 = c0gx1;
                        C786410Ut5.Gc(width2 + (seekBar2.getPaddingStart() - seekBar2.getThumbOffset()), viewGroup2);
                        ViewGroup viewGroup3 = this.LIZIZ;
                        if (viewGroup3 != null) {
                            C786410Ut5.bd((rectLJ.top - viewGroup2.getHeight()) - C416920GWk.LIZ(12.0f), viewGroup3);
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SliderInspector@ecca.notifyInfo$lambda$7$$inlined$doOnPreDraw$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SliderInspector@ecca.notifyInfo$lambda$7$$inlined$doOnPreDraw$1");
                }
            });
        }
    }
}
