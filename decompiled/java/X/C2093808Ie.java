package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.childhook.MajorComponentsAllowList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.08Ie, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2093808Ie {
    public static final C2093808Ie LIZ = new C2093808Ie();
    public static MajorComponentsAllowList LIZIZ;

    public static void LIZ(Context context) throws Throwable {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open("kids_mode_allowlist.json")));
        Throwable th = null;
        try {
            Sequence<String> sequenceLIZIZ = C08KC.LIZIZ(bufferedReader);
            StringBuilder sb = new StringBuilder();
            Iterator<String> it2 = sequenceLIZIZ.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next());
            }
            String string = sb.toString();
            C2107108Nh.LIZ(bufferedReader, null);
            LIZIZ = (MajorComponentsAllowList) GsonProtectorUtils.fromJson(new Gson(), string, MajorComponentsAllowList.class);
        } catch (Throwable th2) {
            try {
                TryCatchGuardChecker.doCheck(th2);
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                throw th2;
            } catch (Throwable th4) {
                th = th4;
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                C2107108Nh.LIZ(bufferedReader, th);
                throw th;
            }
        }
    }
}
