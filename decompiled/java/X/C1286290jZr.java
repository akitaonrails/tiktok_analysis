package X;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0jZr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1286290jZr {
    public static final Map<String, Integer> LIZ;

    static {
        HashMap map = new HashMap();
        LIZ = map;
        map.put("sdm660", 120);
        map.put("msm8994", 120);
        map.put("sdm845", 240);
        map.put("sm8150", 480);
    }

    public static String LIZ() {
        BufferedReader bufferedReader;
        String str;
        try {
            bufferedReader = new BufferedReader(new C0VSF("/proc/cpuinfo"));
            str = "";
        } catch (FileNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            str = line;
            return Build.HARDWARE;
        }
        if (str.contains("Hardware")) {
            return str.split(":\\s+", 2)[1];
        }
        return Build.HARDWARE;
    }
}
