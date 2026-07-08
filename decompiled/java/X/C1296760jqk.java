package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: renamed from: X.0jqk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1296760jqk {
    public final String[] LIZ;
    public final C1496870p3V LIZIZ;

    public static C1296760jqk LIZ(String... strArr) {
        try {
            ByteString[] byteStringArr = new ByteString[strArr.length];
            C1496690p3D c1496690p3D = new C1496690p3D();
            for (int i = 0; i < strArr.length; i++) {
                C1297030jrB.LJIIZILJ(c1496690p3D, strArr[i]);
                c1496690p3D.readByte();
                byteStringArr[i] = c1496690p3D.LJIJJ();
            }
            String[] strArr2 = (String[]) strArr.clone();
            C1496870p3V.LLILLL.getClass();
            return new C1296760jqk(strArr2, C1496860p3U.LIZIZ(byteStringArr));
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError(e);
        }
    }

    public C1296760jqk(String[] strArr, C1496870p3V c1496870p3V) {
        this.LIZ = strArr;
        this.LIZIZ = c1496870p3V;
    }
}
