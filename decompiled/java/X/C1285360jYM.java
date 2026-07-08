package X;

import android.media.MediaFormat;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0jYM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285360jYM {
    public boolean LIZIZ;
    public boolean LIZJ;
    public int LJI;
    public final String LJII;
    public ArrayList<byte[]> LIZ = new ArrayList<>();
    public int LIZLLL = -1;
    public int LJ = -1;
    public int LJFF = -1;
    public int LJIIIIZZ = -1;
    public int LJIIIZ = -1;

    public C1285360jYM(String str) {
        this.LJII = str;
    }

    public static C1285360jYM LIZ(MediaFormat mediaFormat) {
        C1285360jYM c1285360jYM = new C1285360jYM(mediaFormat.getString("mime"));
        try {
            c1285360jYM.LJFF = LIZIZ("max-input-size", mediaFormat);
            ArrayList<byte[]> arrayList = new ArrayList<>();
            int i = 0;
            while (true) {
                String[] strArr = C1285010jXn.LIZ;
                if (i >= strArr.length) {
                    break;
                }
                ByteBuffer byteBuffer = mediaFormat.getByteBuffer(strArr[i]);
                if (byteBuffer != null) {
                    arrayList.add(byteBuffer.array());
                }
                i++;
            }
            c1285360jYM.LIZ = arrayList;
            if (!c1285360jYM.LIZJ) {
                c1285360jYM.LIZJ = true;
                c1285360jYM.LIZIZ = c1285360jYM.LJII.contains("video");
            }
            if (c1285360jYM.LIZIZ) {
                c1285360jYM.LJI = LIZIZ("rotation-degrees", mediaFormat);
                c1285360jYM.LJIIIIZZ = LIZIZ("width", mediaFormat);
                c1285360jYM.LJIIIZ = LIZIZ("height", mediaFormat);
                c1285360jYM.LIZLLL = LIZIZ("max-width", mediaFormat);
                c1285360jYM.LJ = LIZIZ("max-height", mediaFormat);
                return c1285360jYM;
            }
            LIZIZ("sample-rate", mediaFormat);
            LIZIZ("channel-count", mediaFormat);
            return c1285360jYM;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return c1285360jYM;
        }
    }

    public static int LIZIZ(String str, MediaFormat mediaFormat) {
        if (mediaFormat.containsKey(str)) {
            return mediaFormat.getInteger(str);
        }
        return 0;
    }
}
