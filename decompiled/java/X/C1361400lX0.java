package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lX0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1361400lX0 extends ContextWrapper {
    public static Configuration LLILZLL;
    public int LL;
    public Resources.Theme LLILLJJLI;
    public LayoutInflater LLILLL;
    public Configuration LLILZ;
    public Resources LLILZIL;

    public C1361400lX0() {
        super(null);
    }

    public final void LIZIZ() {
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.LLILLJJLI.setTo(theme);
            }
        }
        this.LLILLJJLI.applyStyle(this.LL, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.LLILZIL
            if (r0 != 0) goto L2a
            android.content.res.Configuration r2 = r3.LLILZ
            if (r2 == 0) goto L24
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L2d
            android.content.res.Configuration r0 = X.C1361400lX0.LLILZLL
            if (r0 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r0 = 0
            r1.fontScale = r0
            X.C1361400lX0.LLILZLL = r1
        L1c:
            android.content.res.Configuration r0 = X.C1361400lX0.LLILZLL
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2d
        L24:
            android.content.res.Resources r0 = super.getResources()
            r3.LLILZIL = r0
        L2a:
            android.content.res.Resources r0 = r3.LLILZIL
            return r0
        L2d:
            android.content.res.Configuration r0 = r3.LLILZ
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.LLILZIL = r0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1361400lX0.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.LLILLJJLI;
        if (theme != null) {
            return theme;
        }
        if (this.LL == 0) {
            this.LL = R.style.sc;
        }
        LIZIZ();
        return this.LLILLJJLI;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final void LIZ(Configuration configuration) {
        if (this.LLILZIL == null) {
            if (this.LLILZ == null) {
                this.LLILZ = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.LLILLL == null) {
                this.LLILLL = C786410Ut5.ne(getBaseContext()).cloneInContext(this);
            }
            return this.LLILLL;
        }
        return C786410Ut5.H2(getBaseContext(), str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.LL != i) {
            this.LL = i;
            LIZIZ();
        }
    }

    public C1361400lX0(Context context, int i) {
        super(context);
        this.LL = i;
    }

    public C1361400lX0(Context context, Resources.Theme theme) {
        super(context);
        this.LLILLJJLI = theme;
    }
}
