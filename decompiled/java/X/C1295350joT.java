package X;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0joT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1295350joT {
    public final AssetManager LIZLLL;
    public C1295870jpJ LJ;
    public final C820950WIj<String> LIZ = new C820950WIj<>();
    public final Map<C820950WIj<String>, Typeface> LIZIZ = new HashMap();
    public final Map<String, Typeface> LIZJ = new HashMap();
    public String LJFF = ".ttf";

    public C1295350joT(Drawable.Callback callback, C1295870jpJ c1295870jpJ) {
        this.LJ = c1295870jpJ;
        if (!(callback instanceof View)) {
            C1292050jj9.LIZIZ("LottieDrawable must be inside of a view for images to work.");
            this.LIZLLL = null;
        } else {
            this.LIZLLL = ((View) callback).getContext().getAssets();
        }
    }
}
