package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: X.0jiT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1291630jiT {
    public final Context LIZ;
    public final String LIZIZ;

    public C1291630jiT(Context context, String str) {
        this.LIZ = C786410Ut5.N3(context);
        this.LIZIZ = str;
    }

    public final C0VSJ LIZIZ(InputStream inputStream, EnumC1291640jiU enumC1291640jiU) throws IOException {
        C0VSJ c0vsj = new C0VSJ(C786410Ut5.w2(this.LIZ), LIZ(this.LIZIZ, enumC1291640jiU, true));
        try {
            C0VSV c0vsv = new C0VSV(c0vsj);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i != -1) {
                        c0vsv.write(bArr, 0, i);
                    } else {
                        c0vsv.flush();
                        c0vsv.close();
                        inputStream.close();
                        return c0vsj;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c0vsv.close();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            inputStream.close();
            throw th2;
        }
    }

    public static String LIZ(String str, EnumC1291640jiU enumC1291640jiU, boolean z) {
        String strTempExtension;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lottie_cache_");
        sbLIZ.append(str.replaceAll("\\W+", ""));
        if (z) {
            strTempExtension = enumC1291640jiU.tempExtension();
        } else {
            strTempExtension = enumC1291640jiU.extension;
        }
        sbLIZ.append(strTempExtension);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
