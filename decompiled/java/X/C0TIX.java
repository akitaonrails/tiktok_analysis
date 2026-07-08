package X;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0TIX, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TIX {
    public final SharedPreferences.Editor LIZ;
    public final Set<String> LIZIZ;

    public C0TIX(C19GS c19gs, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("STICKER_RELATED");
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(c19gs, 0, C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ = sharedPreferencesLIZJ.edit();
        this.LIZIZ = sharedPreferencesLIZJ.getStringSet("remindedIds", new HashSet());
    }
}
