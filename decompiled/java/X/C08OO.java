package X;

import android.os.Build;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;

/* JADX INFO: renamed from: X.08OO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08OO {
    public static String LIZ(C0VSJ c0vsj, String str, String str2) {
        InputStream inputStream;
        C09NU c09nu;
        C0VSV c0vsv = null;
        try {
            c09nu = new C09NU(new C0VSJ(str));
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("lib/");
                String str3 = Build.CPU_ABI;
                sbLIZ.append(str3);
                sbLIZ.append("/");
                sbLIZ.append(System.mapLibraryName(str2));
                ZipEntry entry = c09nu.getEntry(C2188811AlT.LIZIZ(sbLIZ));
                if (entry == null) {
                    int iIndexOf = str3.indexOf(45);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("lib/");
                    if (iIndexOf <= 0) {
                        iIndexOf = str3.length();
                    }
                    sbLIZ2.append(str3.substring(0, iIndexOf));
                    sbLIZ2.append("/");
                    sbLIZ2.append(System.mapLibraryName(str2));
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    entry = c09nu.getEntry(strLIZIZ);
                    if (entry == null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Library entry not found:");
                        sbLIZ3.append(strLIZIZ);
                        return C2188811AlT.LIZIZ(sbLIZ3);
                    }
                }
                c0vsj.createNewFile();
                inputStream = c09nu.getInputStream(entry);
                try {
                    C0VSV c0vsv2 = new C0VSV(c0vsj);
                    try {
                        byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                        while (true) {
                            int i = inputStream.read(bArr);
                            if (i > 0) {
                                c0vsv2.write(bArr, 0, i);
                            } else {
                                C2112008Pe.LJI(c0vsj.getAbsolutePath());
                                C2112008Pe.LIZ(c0vsv2);
                                C2112008Pe.LIZ(inputStream);
                                return null;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        c0vsv = c0vsv2;
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            String message = th.getMessage();
                            C2112008Pe.LIZ(c0vsv);
                            C2112008Pe.LIZ(inputStream);
                            if (c09nu == null) {
                                try {
                                    throw new NullPointerException("close");
                                } catch (IOException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    return message;
                                }
                            }
                            return message;
                        } finally {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            c09nu = null;
        }
    }
}
