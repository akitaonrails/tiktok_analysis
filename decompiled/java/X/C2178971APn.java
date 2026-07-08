package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/* JADX INFO: renamed from: X.1APn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2178971APn {
    public final String LIZ;
    public final InterfaceC2179021APs LIZIZ;
    public final List<Pair<String, String>> LIZJ;

    public C2178971APn(C2178941APk c2178941APk) {
        this.LIZ = c2178941APk.LIZ;
        this.LIZIZ = c2178941APk.LIZIZ;
        this.LIZJ = c2178941APk.LIZJ;
    }

    public static String LIZ(String str, List<Pair<String, String>> list) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) < 0) {
            if (list.size() > 0) {
                sb.append("?");
            }
        } else {
            sb.append("&");
        }
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append("&");
            }
            Pair pair = (Pair) ListProtector.get(list, i);
            sb.append((String) pair.first);
            sb.append('=');
            try {
                sb.append(URLEncoder.encode((String) pair.second, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new IllegalArgumentException(e);
            }
        }
        return sb.toString();
    }
}
