package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.13oz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20126313oz {
    public C0VSJ LIZ;
    public final C818880WAk LIZIZ;

    public final File LIZIZ() {
        if (this.LIZ == null) {
            synchronized (this) {
                try {
                    if (this.LIZ == null) {
                        C818880WAk c818880WAk = this.LIZIZ;
                        c818880WAk.LIZ();
                        File fileLIZ = LIZ(c818880WAk.LIZ);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PersistedInstallation.");
                        sbLIZ.append(this.LIZIZ.LIZJ());
                        sbLIZ.append(".json");
                        this.LIZ = new C0VSJ(fileLIZ, C2188811AlT.LIZIZ(sbLIZ));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZ;
    }

    public final C20126713p3 LIZLLL() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            C0VSP c0vsp = new C0VSP(LIZIZ());
            while (true) {
                try {
                    int i = c0vsp.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        c0vsp.close();
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            c0vsp.close();
        } catch (IOException | JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        EnumC20127313p9 enumC20127313p9 = EnumC20127313p9.ATTEMPT_MIGRATION;
        int iOptInt = jSONObject.optInt("Status", enumC20127313p9.ordinal());
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = AbstractC20126913p5.LIZ;
        C20126613p2 c20126613p2 = new C20126613p2();
        c20126613p2.LJFF = 0L;
        c20126613p2.LIZIZ(enumC20127313p9);
        c20126613p2.LJ = 0L;
        c20126613p2.LIZ = strOptString;
        c20126613p2.LIZIZ(EnumC20127313p9.values()[iOptInt]);
        c20126613p2.LIZJ = strOptString2;
        c20126613p2.LIZLLL = strOptString3;
        c20126613p2.LJFF = Long.valueOf(jOptLong);
        c20126613p2.LJ = Long.valueOf(jOptLong2);
        c20126613p2.LJI = strOptString4;
        return c20126613p2.LIZ();
    }

    public C20126313oz(C818880WAk c818880WAk) {
        this.LIZIZ = c818880WAk;
    }

    public static File LIZ(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public final void LIZJ(C20126713p3 c20126713p3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c20126713p3.LIZIZ);
            jSONObject.put("Status", c20126713p3.LIZJ.ordinal());
            jSONObject.put("AuthToken", c20126713p3.LIZLLL);
            jSONObject.put("RefreshToken", c20126713p3.LJ);
            jSONObject.put("TokenCreationEpochInSecs", c20126713p3.LJI);
            jSONObject.put("ExpiresInSecs", c20126713p3.LJFF);
            jSONObject.put("FisError", c20126713p3.LJII);
            C818880WAk c818880WAk = this.LIZIZ;
            c818880WAk.LIZ();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", LIZ(c818880WAk.LIZ));
            C0VSV c0vsv = new C0VSV(fileCreateTempFile);
            c0vsv.write(C786410Ut5.J3(jSONObject).getBytes("UTF-8"));
            c0vsv.close();
            if (!fileCreateTempFile.renameTo(LIZIZ())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
