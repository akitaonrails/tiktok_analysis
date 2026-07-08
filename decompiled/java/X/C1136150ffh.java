package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ffh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136150ffh implements InterfaceC177000m8 {
    public final /* synthetic */ ImageView LIZ;
    public final /* synthetic */ EnumC1137240fhS LIZIZ;
    public final /* synthetic */ C1136110ffd LIZJ;
    public final /* synthetic */ int LIZLLL;

    @Override // X.InterfaceC177000m8
    public final void LIZ(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap);
            if (bitmapCreateBitmap != null && !bitmapCreateBitmap.isRecycled()) {
                ImageView imageView = this.LIZ;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmapCreateBitmap);
                }
                if (this.LIZIZ == EnumC1137240fhS.LOCAL && this.LIZ == this.LIZJ.LJFF) {
                    C1136140ffg c1136140ffg = C1136940fgy.LIZ;
                    int i = this.LIZLLL;
                    c1136140ffg.LIZIZ = false;
                    C1136860fgq c1136860fgqLJ = c1136140ffg.LIZ.LJ(i);
                    if (c1136860fgqLJ != null) {
                        c1136860fgqLJ.LIZIZ = C158B.LIZ() - c1136860fgqLJ.LIZLLL;
                        c1136860fgqLJ.LJFF = 1;
                    }
                    C1135810ff9 c1135810ff9 = this.LIZJ.LIZIZ;
                    if (c1135810ff9 != null) {
                        c1135810ff9.LJJJ = System.currentTimeMillis();
                    }
                    C1135810ff9 c1135810ff92 = this.LIZJ.LIZIZ;
                    if (c1135810ff92 != null) {
                        c1135810ff92.LJJJI = 0;
                    }
                }
                this.LIZJ.LIZ.invalidate();
            }
        } catch (OutOfMemoryError e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C1136150ffh(C1126540fQC c1126540fQC, EnumC1137240fhS enumC1137240fhS, C1136110ffd c1136110ffd, int i) {
        this.LIZ = c1126540fQC;
        this.LIZIZ = enumC1137240fhS;
        this.LIZJ = c1136110ffd;
        this.LIZLLL = i;
    }
}
