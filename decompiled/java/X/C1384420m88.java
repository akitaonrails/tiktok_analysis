package X;

import android.graphics.Typeface;
import kotlin.jvm.internal.AwS9S0000001_21;

/* JADX INFO: renamed from: X.0m88, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1384420m88 {
    public float LIZ = 48.0f;
    public int LIZIZ = -1;
    public Typeface LIZJ = Typeface.DEFAULT;
    public final /* synthetic */ C1384500m8G LIZLLL;

    public C1384420m88(C1384500m8G c1384500m8G) {
        this.LIZLLL = c1384500m8G;
    }

    public final void LIZ(float f) {
        if (f == 0.0f) {
            return;
        }
        this.LIZ = f;
        this.LIZLLL.LIZIZ(new AwS9S0000001_21(f, 2));
        C1384500m8G.LIZJ(this.LIZLLL);
    }
}
