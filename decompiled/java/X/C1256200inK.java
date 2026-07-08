package X;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0inK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1256200inK {
    public static final List<InterfaceC1250980ieu> LJ = new ArrayList();
    public final Context LIZ;
    public C1287400jbe LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    public final int LIZ(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        float f = fArr[1];
        if (f > 0.25f) {
            f = 0.25f;
        }
        fArr[1] = f;
        if (C960203pA.LIZIZ(this.LIZ)) {
            float f2 = fArr[2];
            if (f2 > 0.6f) {
                f2 = 0.6f;
            }
            fArr[2] = f2;
        } else {
            float f3 = fArr[2];
            if (f3 < 0.95f) {
                f3 = 0.95f;
            }
            fArr[2] = f3;
        }
        return Color.HSVToColor(fArr);
    }

    public C1256200inK(Context context, int i) {
        this.LIZ = context;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0052: MOVE (r4 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:33554514), block:B:31:0x0052 */
    public static String LIZIZ(int i, Context context) throws Throwable {
        InputStream inputStreamOpenRawResource;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader3 = null;
        try {
            try {
                try {
                    inputStreamOpenRawResource = context.getResources().openRawResource(i);
                } catch (Throwable th) {
                    th = th;
                    bufferedReader3 = bufferedReader2;
                }
            } catch (IOException e) {
                e = e;
                bufferedReader = null;
                inputStreamOpenRawResource = null;
            } catch (Throwable th2) {
                th = th2;
                inputStreamOpenRawResource = null;
            }
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                        sb.append("\n");
                    } catch (IOException e2) {
                        e = e2;
                        TryCatchGuardChecker.doCheck(e);
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        if (inputStreamOpenRawResource != null) {
                        }
                        return sb.toString();
                    }
                }
                bufferedReader.close();
            } catch (IOException e3) {
                e = e3;
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        break;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                if (bufferedReader3 != null) {
                    try {
                        bufferedReader3.close();
                    } catch (IOException e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        throw th;
                    }
                }
                if (inputStreamOpenRawResource != null) {
                    inputStreamOpenRawResource.close();
                    throw th;
                }
                throw th;
            }
            if (inputStreamOpenRawResource != null) {
                inputStreamOpenRawResource.close();
            }
        } catch (IOException e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        return sb.toString();
    }
}
