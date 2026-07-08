package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
import android.text.Html;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.0w4x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766850w4x implements Html.ImageGetter {
    public final Context LIZ;
    public final TextView LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final /* synthetic */ C1766780w4q LJFF;

    @Override // android.text.Html.ImageGetter
    public final Drawable getDrawable(final String str) {
        Drawable drawable;
        Object obj = ((LinkedHashMap) this.LJFF.LLJLL).get(str);
        if ((obj instanceof LevelListDrawable) && (drawable = (Drawable) obj) != null) {
            C1766780w4q c1766780w4q = this.LJFF;
            if (drawable.getLevel() == 1) {
                int i = c1766780w4q.LLJLILLLLZIIL + 1;
                c1766780w4q.LLJLILLLLZIIL = i;
                if (i >= c1766780w4q.LLJLIL) {
                    c1766780w4q.LJJJZ(this.LJ, this.LIZIZ.getText());
                }
            }
            return drawable;
        }
        final LevelListDrawable levelListDrawable = new LevelListDrawable();
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        final C1766780w4q c1766780w4q2 = this.LJFF;
        c1331670kl3LJIIIZ.LJJII(new InterfaceC1331910klR() { // from class: X.0w4w
            @Override // X.InterfaceC1331910klR
            public final void onCanceled() {
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
            }

            @Override // X.InterfaceC1331910klR
            public final void onProgress(float f) {
            }

            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) {
                if (bitmap == null) {
                    return;
                }
                c1766780w4q2.LLJLILLLLZIIL++;
                levelListDrawable.addLevel(1, 1, new BitmapDrawable(this.LIZ.getResources(), bitmap));
                int height = this.LIZLLL;
                if (height <= 0) {
                    height = bitmap.getHeight();
                }
                int i2 = this.LIZJ;
                if (height > i2) {
                    height = i2;
                }
                levelListDrawable.setBounds(0, 0, C814420VxA.LIZIZ((height / bitmap.getHeight()) * bitmap.getWidth()), height);
                levelListDrawable.setLevel(1);
                c1766780w4q2.LLJLL.put(str, levelListDrawable);
                C1766780w4q c1766780w4q3 = c1766780w4q2;
                try {
                    Method declaredMethod = TextView.class.getDeclaredMethod("nullLayouts", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(c1766780w4q3, new Object[0]);
                } catch (CancellationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                C1766780w4q c1766780w4q4 = c1766780w4q2;
                if (c1766780w4q4.LLJLILLLLZIIL == c1766780w4q4.LLJLIL) {
                    c1766780w4q2.LJJJZ(this.LJ, this.LIZIZ.getText());
                }
                this.LIZIZ.requestLayout();
            }
        });
        return levelListDrawable;
    }

    public C1766850w4x(C1766780w4q c1766780w4q, Context context, TextView textView, int i, int i2, int i3) {
        this.LJFF = c1766780w4q;
        this.LIZ = context;
        this.LIZIZ = textView;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
    }
}
