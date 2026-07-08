package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0We5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C828070We5 {
    public final CopyOnWriteArrayList<String> LIZ;
    public final SharedPreferences LIZIZ;

    public C828070We5() {
        C844470XAv.LIZ.getClass();
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "sp_show_share_guide_cache");
        this.LIZIZ = sharedPreferencesLIZJ;
        try {
            List listLIZJ = JsonParseUtils.LIZJ(String.class, sharedPreferencesLIZJ.getString("cached_video_id", ""));
            if (listLIZJ != null) {
                this.LIZ = new CopyOnWriteArrayList<>(listLIZJ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (this.LIZ == null) {
            this.LIZ = new CopyOnWriteArrayList<>();
        }
    }

    public final void LIZ(String str) {
        if (TextUtils.isEmpty(str) || this.LIZ.contains(str)) {
            return;
        }
        if (this.LIZ.size() >= 20) {
            this.LIZ.remove(0);
        }
        this.LIZ.add(str);
        try {
            this.LIZIZ.edit().putString("cached_video_id", JsonParseUtils.LJ(this.LIZ)).apply();
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
