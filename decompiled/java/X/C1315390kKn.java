package X;

import android.graphics.drawable.Drawable;
import com.bytedance.lynx.service.text.TextResourceLoader;
import com.lynx.tasm.LynxError;
import j27.s;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0kKn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315390kKn {
    public final C1315380kKm LIZ;
    public final InterfaceC1315420kKq LIZIZ;
    public WeakReference<Drawable.Callback> LIZJ;
    public boolean LIZLLL;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0kKm, X.0kLG] */
    public C1315390kKn(String str, float f, float f2, s sVar, C1315410kKp c1315410kKp) {
        this.LIZIZ = c1315410kKp;
        ?? r1 = new C1315680kLG(sVar) { // from class: X.0kKm
            @Override // X.C1315680kLG
            public final void LJ() {
                Drawable.Callback callback;
                WeakReference<Drawable.Callback> weakReference = this.LLLLLLIL.LIZJ;
                if (weakReference == null || (callback = weakReference.get()) == null) {
                    return;
                }
                callback.invalidateDrawable(null);
            }

            @Override // X.C1315680kLG
            public final void LJIIIZ(int i, int i2) {
                this.LLLLLLIL.getClass();
                C1315390kKn c1315390kKn = this.LLLLLLIL;
                InterfaceC1315420kKq interfaceC1315420kKq = c1315390kKn.LIZIZ;
                if (interfaceC1315420kKq != null && !c1315390kKn.LIZLLL) {
                    c1315390kKn.LIZLLL = true;
                    TextResourceLoader.onImageLoaded(((C1315410kKp) interfaceC1315420kKq).LIZ);
                }
            }

            @Override // X.C1315680kLG
            public final void LJIIIIZZ(LynxError lynxError, int i, int i2) {
                super.LJIIIIZZ(lynxError, i, i2);
                C1315390kKn c1315390kKn = this.LLLLLLIL;
                InterfaceC1315420kKq interfaceC1315420kKq = c1315390kKn.LIZIZ;
                if (interfaceC1315420kKq != null && !c1315390kKn.LIZLLL) {
                    c1315390kKn.LIZLLL = true;
                    TextResourceLoader.onImageError(((C1315410kKp) interfaceC1315420kKq).LIZ);
                }
            }
        };
        this.LIZ = r1;
        r1.LJIJJ(str);
        r1.LJIIJ((int) f, (int) f2, 0, 0, 0, 0);
        r1.LLJLILLLLZIIL = true;
        r1.LJJ();
    }
}
