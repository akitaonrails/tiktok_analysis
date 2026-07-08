package X;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0jkR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292850jkR {
    public final AssetManager LIZLLL;
    public final C820960WIk<String> LIZ = new C820960WIk<>();
    public final Map<C820960WIk<String>, Typeface> LIZIZ = new HashMap();
    public final Map<String, Typeface> LIZJ = new HashMap();
    public final String LJ = ".ttf";

    public C1292850jkR(Drawable.Callback callback) {
        if (!(callback instanceof View)) {
            this.LIZLLL = null;
        } else {
            this.LIZLLL = ((View) callback).getContext().getAssets();
        }
    }
}
