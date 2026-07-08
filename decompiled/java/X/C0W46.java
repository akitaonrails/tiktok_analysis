package X;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0W46, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W46 {
    public static AbstractC19852312lt<InterfaceC813010Vut> LIZ(Context context) {
        AbstractC19852312lt abstractC19852312ltAbsent;
        AbstractC19852312lt<InterfaceC813010Vut> abstractC19852312ltAbsent2;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            try {
                C0VSJ c0vsj = new C0VSJ(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                if (c0vsj.exists()) {
                    abstractC19852312ltAbsent = AbstractC19852312lt.of(c0vsj);
                } else {
                    abstractC19852312ltAbsent = AbstractC19852312lt.absent();
                }
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                abstractC19852312ltAbsent = AbstractC19852312lt.absent();
            }
            if (abstractC19852312ltAbsent.isPresent()) {
                abstractC19852312ltAbsent2 = AbstractC19852312lt.of(LIZIZ((File) abstractC19852312ltAbsent.get()));
            } else {
                abstractC19852312ltAbsent2 = AbstractC19852312lt.absent();
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return abstractC19852312ltAbsent2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Vus] */
    public static C813000Vus LIZIZ(File file) {
        BufferedReader bufferedReader;
        final C830530Wi3 c830530Wi3;
        HashMap map;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new C0VSP(file)));
            try {
                c830530Wi3 = new C830530Wi3();
                map = new HashMap();
            } finally {
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line != null) {
                String[] strArrSplit = line.split(" ", 3);
                if (strArrSplit.length == 3) {
                    String str = new String(strArrSplit[0]);
                    String strDecode = Uri.decode(new String(strArrSplit[1]));
                    String strDecode2 = (String) map.get(strArrSplit[2]);
                    if (strDecode2 == null) {
                        String str2 = new String(strArrSplit[2]);
                        strDecode2 = Uri.decode(str2);
                        if (strDecode2.length() < 1024 || strDecode2 == str2) {
                            map.put(str2, strDecode2);
                        }
                    }
                    C830530Wi3 c830530Wi32 = (C830530Wi3) c830530Wi3.get(str);
                    if (c830530Wi32 == null) {
                        c830530Wi32 = new C830530Wi3();
                        c830530Wi3.put(str, c830530Wi32);
                    }
                    c830530Wi32.put(strDecode, strDecode2);
                }
            } else {
                ?? r0 = new InterfaceC813010Vut(c830530Wi3) { // from class: X.0Vus
                    public final C830530Wi3<String, C830530Wi3<String, String>> LIZ;

                    {
                        this.LIZ = c830530Wi3;
                    }

                    @Override // X.InterfaceC813010Vut
                    public final String LIZ(Uri uri, String str3, String str4, String str5) {
                        C830530Wi3<String, String> c830530Wi33;
                        if (uri != null) {
                            str3 = uri.toString();
                        } else {
                            if (str3 != null) {
                            }
                            return null;
                        }
                        C830530Wi3<String, C830530Wi3<String, String>> c830530Wi34 = this.LIZ;
                        if (c830530Wi34 != null && (c830530Wi33 = c830530Wi34.get(str3)) != null) {
                            if (str4 != null) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(str4);
                                sbLIZ.append(str5);
                                str5 = C2188811AlT.LIZIZ(sbLIZ);
                            }
                            return c830530Wi33.get(str5);
                        }
                        return null;
                    }
                };
                bufferedReader.close();
                return r0;
            }
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }
}
