package X;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.19Pm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21534819Pm extends Drawable implements Animatable {
    public static final C21535119Pp LLJIJIL;
    public final Context LL;
    public final C19PH LLILLJJLI;
    public ValueAnimator LLILZ;
    public ValueAnimator LLILZIL;
    public List<AbstractC21534319Ph> LLILZLL;
    public boolean LLIZ;
    public float LLIZLLLIL;
    public int LLJI;
    public final Paint LLJ = new Paint();
    public C21534419Pi LLILLL = new C21534419Pi();

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        LJFF(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        LJFF(false, true, false);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.19Pp] */
    static {
        final Class<Float> cls = Float.class;
        LLJIJIL = new Property<AbstractC21534819Pm, Float>(cls) { // from class: X.19Pp
            @Override // android.util.Property
            public final Float get(AbstractC21534819Pm abstractC21534819Pm) {
                return Float.valueOf(abstractC21534819Pm.LIZIZ());
            }

            @Override // android.util.Property
            public final void set(AbstractC21534819Pm abstractC21534819Pm, Float f) {
                AbstractC21534819Pm abstractC21534819Pm2 = abstractC21534819Pm;
                float fFloatValue = f.floatValue();
                if (abstractC21534819Pm2.LLIZLLLIL != fFloatValue) {
                    abstractC21534819Pm2.LLIZLLLIL = fFloatValue;
                    abstractC21534819Pm2.invalidateSelf();
                }
            }
        };
    }

    public final float LIZIZ() {
        C19PH c19ph = this.LLILLJJLI;
        if (c19ph.LJ == 0 && c19ph.LJFF == 0) {
            return 1.0f;
        }
        return this.LLIZLLLIL;
    }

    public final boolean LIZJ() {
        ValueAnimator valueAnimator = this.LLILZIL;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public final boolean LIZLLL() {
        ValueAnimator valueAnimator = this.LLILZ;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return LIZLLL() || LIZJ();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LLJI;
    }

    public final void LJI(C21534119Pf c21534119Pf) {
        List<AbstractC21534319Ph> list = this.LLILZLL;
        if (list != null && ((ArrayList) list).contains(c21534119Pf)) {
            ((ArrayList) this.LLILZLL).remove(c21534119Pf);
            if (((ArrayList) this.LLILZLL).isEmpty()) {
                this.LLILZLL = null;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LLJI = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LLJ.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public AbstractC21534819Pm(Context context, C19PH c19ph) {
        this.LL = context;
        this.LLILLJJLI = c19ph;
        setAlpha(255);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return LJ(z, z2, true);
    }

    public final boolean LJ(boolean z, boolean z2, boolean z3) {
        boolean z4;
        C21534419Pi c21534419Pi = this.LLILLL;
        ContentResolver contentResolver = this.LL.getContentResolver();
        c21534419Pi.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z3 && f > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        return LJFF(z, z2, z4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b1, code lost:
    
        if (r5.LLILLJJLI.LJ != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b3, code lost:
    
        if (r7 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b9, code lost:
    
        if (r2.isPaused() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bb, code lost:
    
        r2.resume();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00be, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c6, code lost:
    
        if (r5.LLILLJJLI.LJFF != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c9, code lost:
    
        r2.start();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cc, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cd, code lost:
    
        r0 = r5.LLIZ;
        r5.LLIZ = true;
        r2.end();
        r5.LLIZ = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d6, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LJFF(boolean r6, boolean r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC21534819Pm.LJFF(boolean, boolean, boolean):boolean");
    }
}
