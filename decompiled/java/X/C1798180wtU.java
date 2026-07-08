package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0wtU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1798180wtU {
    public static final /* synthetic */ int LIZIZ = 0;
    public final SharedPreferences LIZ;

    public final synchronized void LIZ() {
        SharedPreferences.Editor editorEdit = this.LIZ.edit();
        editorEdit.remove("config");
        editorEdit.remove("version");
        editorEdit.apply();
    }

    public final synchronized String LIZIZ() {
        return this.LIZ.getString("config", null);
    }

    public final synchronized String LIZJ() {
        String string;
        string = this.LIZ.getString("version", CardStruct.IStatusCode.DEFAULT);
        if (string == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        return string;
    }

    public C1798180wtU(Context context, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("location_config_cache_");
        sbLIZ.append(str);
        this.LIZ = C810670Vr7.LIZJ(context, 0, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final synchronized void LIZLLL(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.LIZ.edit();
        editorEdit.putString("config", str);
        editorEdit.putString("version", str2);
        editorEdit.apply();
    }
}
