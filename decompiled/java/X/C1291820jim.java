package X;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;

/* JADX INFO: renamed from: X.0jim, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1291820jim extends AbstractC1291220jho {
    public final int LIZ;
    public final int LIZIZ;
    public C592490NLr LIZJ;

    @Override // X.AbstractC1291220jho, X.InterfaceC1291910jiv
    public final String getName() {
        return "IterativeBoxBlurPostProcessor";
    }

    @Override // X.AbstractC1291220jho, X.InterfaceC1291910jiv
    public final InterfaceC1324680kZm getPostprocessorCacheKey() {
        if (this.LIZJ == null) {
            this.LIZJ = new C592490NLr(C786410Ut5.k4(null, "i%dr%d", new Object[]{Integer.valueOf(this.LIZ), Integer.valueOf(this.LIZIZ)}));
        }
        return this.LIZJ;
    }

    public C1291820jim(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LIZIZ(z);
        this.LIZ = 3;
        this.LIZIZ = i;
    }

    @Override // X.AbstractC1291220jho
    public void process(Bitmap bitmap) {
        NativeBlurFilter.iterativeBoxBlur(bitmap, this.LIZ, this.LIZIZ);
    }
}
