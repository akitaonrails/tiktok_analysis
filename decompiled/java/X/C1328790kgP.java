package X;

import android.util.SparseIntArray;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0kgP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328790kgP {
    public final C1329300khE LIZ;
    public final C1330500kjA LIZIZ;
    public final C1329300khE LIZJ;
    public final InterfaceC1328250kfX LIZLLL;
    public final C1329300khE LJ;
    public final C1330500kjA LJFF;
    public final C1329300khE LJI;
    public final C1330500kjA LJII;
    public final String LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;

    public C1328790kgP(C1330060kiS c1330060kiS) {
        int i;
        int i2;
        C1336010ks3.LIZIZ();
        c1330060kiS.getClass();
        this.LIZ = C1329220kh6.LIZ();
        this.LIZIZ = C1330500kjA.LJII();
        int i3 = C1330380kiy.LIZ;
        int i4 = i3 * 4194304;
        SparseIntArray sparseIntArray = new SparseIntArray();
        int i5 = 131072;
        do {
            sparseIntArray.put(i5, i3);
            i5 *= 2;
        } while (i5 <= 4194304);
        this.LIZJ = new C1329300khE(4194304, i4, sparseIntArray, C1330380kiy.LIZ);
        InterfaceC1328250kfX interfaceC1328250kfX = c1330060kiS.LIZ;
        this.LIZLLL = interfaceC1328250kfX == null ? C1328220kfU.LIZIZ() : interfaceC1328250kfX;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(1024, 5);
        sparseIntArray2.put(SpeechEngineDefines.ASR_WORK_MODE_OFFLINE, 5);
        sparseIntArray2.put(SpeechEngineDefines.TTS_WORK_MODE_BOTH, 5);
        sparseIntArray2.put(8192, 5);
        sparseIntArray2.put(16384, 5);
        sparseIntArray2.put(32768, 5);
        sparseIntArray2.put(65536, 5);
        sparseIntArray2.put(131072, 5);
        sparseIntArray2.put(262144, 2);
        sparseIntArray2.put(524288, 2);
        sparseIntArray2.put(1048576, 2);
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (iMin < 16777216) {
            i = 3145728;
        } else if (iMin < 33554432) {
            i = 6291456;
        } else {
            i = 12582912;
        }
        int iMin2 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (iMin2 < 16777216) {
            i2 = iMin2 / 2;
        } else {
            i2 = (iMin2 / 4) * 3;
        }
        this.LJ = new C1329300khE(i, i2, sparseIntArray2, -1);
        this.LJFF = C1330500kjA.LJII();
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        sparseIntArray3.put(16384, 5);
        this.LJI = new C1329300khE(81920, 1048576, sparseIntArray3, -1);
        this.LJII = C1330500kjA.LJII();
        this.LJIIIIZZ = "legacy";
        this.LJIIIZ = c1330060kiS.LIZIZ;
        this.LJIIJ = 4194304;
        C1336010ks3.LIZIZ();
    }
}
