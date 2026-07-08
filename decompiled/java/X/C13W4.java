package X;

import android.media.ExifInterface;
import android.media.MediaMetadataRetriever;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13W4, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13W4 {
    public static final /* synthetic */ int LIZ = 0;

    public static final int LIZ(String str) throws Throwable {
        ExifInterface exifInterfaceLJIILL = C2471909mP.LJIILL(str);
        if (exifInterfaceLJIILL != null) {
            int iLJLILLLLZI = C2204961BRm.LJLILLLLZI(exifInterfaceLJIILL, 1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhSwoMpcHhmFvEzk7EbinudFUbZFKzT2Cg==", null));
            if (iLJLILLLLZI != 3) {
                if (iLJLILLLLZI != 6) {
                    if (iLJLILLLLZI == 8) {
                        return 270;
                    }
                    return 0;
                }
                return 90;
            }
            return 180;
        }
        return 0;
    }

    public static final C13W2 LIZIZ(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        MediaMetadataRetriever mediaMetadataRetrieverLJJ = C2471909mP.LJJ(str);
        C13W2 c13w2 = new C13W2();
        try {
            c13w2.LIZIZ = C2204961BRm.LJLJI(mediaMetadataRetrieverLJJ, 5, new C0WZX("dzBzEgAjS8/YVFkiQFyUaP/mqC5RLlqtbe36LtVGH/KjmBqnU8Oh8UPnA3naxTYRzK3xGiG6X9+gTFYttt1eFA==", null));
            String strLIZJ = C20144413ru.LIZJ(mediaMetadataRetrieverLJJ);
            int i5 = 0;
            if (strLIZJ != null) {
                i = CastIntegerProtector.parseInt(strLIZJ);
            } else {
                i = 0;
            }
            c13w2.LJ = i;
            c13w2.LIZ = C20144413ru.LJ(mediaMetadataRetrieverLJJ);
            String strLJII = C20144413ru.LJII(mediaMetadataRetrieverLJJ);
            if (strLJII != null) {
                i2 = CastIntegerProtector.parseInt(strLJII);
            } else {
                i2 = 0;
            }
            c13w2.LIZJ = i2;
            String strLJFF = C20144413ru.LJFF(mediaMetadataRetrieverLJJ);
            if (strLJFF != null) {
                i3 = CastIntegerProtector.parseInt(strLJFF);
            } else {
                i3 = 0;
            }
            c13w2.LIZLLL = i3;
            String strLIZ = C20144413ru.LIZ(mediaMetadataRetrieverLJJ);
            if (strLIZ != null) {
                i4 = CastIntegerProtector.parseInt(strLIZ);
            } else {
                i4 = 0;
            }
            c13w2.LJI = i4;
            String strLJI = C20144413ru.LJI(mediaMetadataRetrieverLJJ);
            if (strLJI != null) {
                i5 = CastIntegerProtector.parseInt(strLJI);
            }
            c13w2.LJII = i5;
            mediaMetadataRetrieverLJJ.release();
            return c13w2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return c13w2;
        }
    }
}
