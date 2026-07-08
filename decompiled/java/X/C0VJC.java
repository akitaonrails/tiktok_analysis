package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0VJC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0VJC {
    public final File LIZ;
    public final Pattern LIZIZ = LIZ();

    public abstract Pattern LIZ();

    public abstract boolean LIZIZ(String str);

    public C0VJC(C0VSJ c0vsj) {
        this.LIZ = c0vsj;
    }

    public final void LIZJ(List<String> list) {
        BufferedReader bufferedReader;
        if (!this.LIZ.exists()) {
            return;
        }
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new C0VSP(this.LIZ)));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if (LIZIZ(line)) {
                        Matcher matcher = this.LIZIZ.matcher(line);
                        if (matcher.find() && matcher.groupCount() == 1) {
                            String strGroup = matcher.group(1);
                            ArrayList arrayList = (ArrayList) list;
                            if (!arrayList.contains(strGroup)) {
                                arrayList.add(strGroup);
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
        C2112008Pe.LIZ(bufferedReader);
    }
}
