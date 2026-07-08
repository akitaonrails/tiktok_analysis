package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveShowVideoBorderExp;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ImD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C476390ImD {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(final float f, final int i, final View view) {
        if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest() || LiveShowVideoBorderExp.INSTANCE.disable()) {
            return;
        }
        Logger.setLogLevel(3);
        Object tag = view.getTag(R.integer.h);
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(tag, bool)) {
            return;
        }
        view.setTag(R.integer.h, bool);
        C786410Ut5.x3(view.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0Gmc
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                try {
                    C786410Ut5.C3(view.getViewTreeObserver(), this);
                    Drawable drawable = new Drawable(i, f) { // from class: X.0GQp
                        public final Paint LIZ;

                        @Override // android.graphics.drawable.Drawable
                        @InterfaceC1294060jmO
                        public final int getOpacity() {
                            return -3;
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void draw(Canvas canvas) {
                            Rect bounds = getBounds();
                            canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.LIZ);
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void setAlpha(int i2) {
                            this.LIZ.setAlpha(i2);
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void setColorFilter(ColorFilter colorFilter) {
                            this.LIZ.setColorFilter(colorFilter);
                        }

                        {
                            Paint paint = new Paint(1);
                            paint.setStyle(Paint.Style.STROKE);
                            paint.setStrokeWidth(f);
                            paint.setColor(i);
                            this.LIZ = paint;
                        }
                    };
                    View view2 = view;
                    if (view2 instanceof ViewGroup) {
                        ((ViewGroup) view2).setForeground(drawable);
                    } else {
                        view2.setBackground(drawable);
                    }
                    view.setTag(R.integer.i, drawable);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        });
    }
}
