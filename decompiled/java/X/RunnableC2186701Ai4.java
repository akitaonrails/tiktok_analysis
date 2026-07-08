package X;

import android.graphics.Bitmap;
import oo5.b;

/* JADX INFO: renamed from: X.1Ai4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class RunnableC2186701Ai4 implements Runnable {
    public final /* synthetic */ C2186531Ahn LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ C118300cf LLJ;
    public final /* synthetic */ C118300cf LLJI;

    public RunnableC2186701Ai4(C2186531Ahn c2186531Ahn, Bitmap bitmap, boolean z, int i, int i2, int i3, int i4, int i5, C118300cf c118300cf, C118300cf c118300cf2) {
        this.LL = c2186531Ahn;
        this.LLILLJJLI = bitmap;
        this.LLILLL = z;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = i3;
        this.LLIZ = i4;
        this.LLIZLLLIL = i5;
        this.LLJ = c118300cf;
        this.LLJI = c118300cf2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ScanThread@fbdf.handleSingleFrame$1");
        try {
            b bVar = b.LJIJJLI;
            Bitmap bitmap = this.LLILLJJLI;
            C2186691Ai3 c2186691Ai3 = new C2186691Ai3(this);
            bVar.getClass();
            b.LJFF(bitmap, c2186691Ai3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ScanThread@fbdf.handleSingleFrame$1");
    }
}
