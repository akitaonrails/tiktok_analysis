package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URI;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Matcher;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0XMX, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XMX {
    public final String LIZ;
    public final Set<String> LIZIZ = new CopyOnWriteArraySet();
    public boolean LIZJ = false;
    public boolean LIZLLL = false;
    public long LJ = Long.MAX_VALUE;
    public int LJFF = -1;
    public long LJI = 600000;
    public C0XNJ LJII;

    public C0XMX() {
        String[] strArrSplit;
        String strGroup;
        Matcher matcher;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        C847400XMc.LJ();
        sbLIZ.append("api-va.tiktokv.com");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LIZ = strLIZIZ;
        String lowerCase = "";
        try {
            lowerCase = new URI(strLIZIZ).getHost().toLowerCase();
            matcher = PatternProtector.compile("[^\\.]+(\\.com|\\.net|\\.org|\\.cc|\\.me|\\.tel|\\.mobi|\\.asia|\\.biz|\\.info|\\.name|\\.tv|\\.app|\\.edu)").matcher(lowerCase);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0XMZ.LIZJ(e);
        }
        if (matcher.find()) {
            strGroup = matcher.group();
        } else {
            try {
                if (TextUtils.isEmpty(lowerCase) || (strArrSplit = lowerCase.split("\\.")) == null || strArrSplit.length <= 1) {
                    return;
                }
                strGroup = strArrSplit[strArrSplit.length - 2] + e3.d + strArrSplit[strArrSplit.length - 1];
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C0XMZ.LIZJ(e2);
                return;
            }
        }
        if (strGroup != null) {
            ((CopyOnWriteArraySet) this.LIZIZ).add(strGroup);
        }
    }

    public final void LIZ() {
        SharedPreferences sharedPreferencesLIZJ;
        Context contextLIZLLL = C847400XMc.LIZLLL();
        if (contextLIZLLL == null || (sharedPreferencesLIZJ = C810670Vr7.LIZJ(contextLIZLLL, 0, "com_ss_android_token_sp_host")) == null) {
            return;
        }
        ((CopyOnWriteArraySet) this.LIZIZ).remove(null);
        if (!((CopyOnWriteArraySet) this.LIZIZ).isEmpty()) {
            sharedPreferencesLIZJ.edit().putStringSet("share_cookie_host_list", this.LIZIZ).apply();
        }
    }
}
