package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ss.ttlivestreamer.livestreamv2.videoquality.probe.cache.BwProbeCacheResult;

/* JADX INFO: renamed from: X.0jHp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1275110jHp {
    public int LIZ;
    public int LIZIZ;

    public static void LIZ(Context context, EnumC1283150jUn enumC1283150jUn) {
        String str;
        SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(context, 0, "probe_cache").edit();
        if (enumC1283150jUn == EnumC1283150jUn.GAME) {
            str = "probe_game_cache_json";
        } else {
            str = "probe_cache_json";
        }
        editorEdit.putString(str, "").apply();
    }

    public static BwProbeCacheResult LIZIZ(Context context, EnumC1283150jUn enumC1283150jUn) {
        String str;
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "probe_cache");
        if (enumC1283150jUn == EnumC1283150jUn.GAME) {
            str = "probe_game_cache_json";
        } else {
            str = "probe_cache_json";
        }
        String string = sharedPreferencesLIZJ.getString(str, "");
        if (!TextUtils.isEmpty(string)) {
            BwProbeCacheResult bwProbeCacheResultLIZ = BwProbeCacheResult.LIZ(string);
            if (bwProbeCacheResultLIZ != null) {
                bwProbeCacheResultLIZ.LIZ = enumC1283150jUn;
            }
            return bwProbeCacheResultLIZ;
        }
        return null;
    }

    public static void LIZJ(Context context, int i, int i2, int i3, int i4, long j, int i5, EnumC1283150jUn enumC1283150jUn, int i6, double d) {
        String str;
        BwProbeCacheResult bwProbeCacheResult = new BwProbeCacheResult(i, i2, i3, i4, j, i5, i6, d);
        bwProbeCacheResult.LIZ = enumC1283150jUn;
        if (bwProbeCacheResult.level > 0 && bwProbeCacheResult.netSpeed > 0) {
            String strLIZIZ = bwProbeCacheResult.LIZIZ();
            SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(context, 0, "probe_cache").edit();
            if (enumC1283150jUn == EnumC1283150jUn.GAME) {
                str = "probe_game_cache_json";
            } else {
                str = "probe_cache_json";
            }
            editorEdit.putString(str, strLIZIZ).apply();
        }
    }
}
