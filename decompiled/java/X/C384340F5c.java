package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0F5c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C384340F5c {
    public static final /* synthetic */ int LIZIZ = 0;
    public final Keva LIZ = Keva.getRepo("burned_caption");

    public final String LIZ(Function0<String> function0) {
        String strInvoke;
        Keva keva = this.LIZ;
        if (function0 == null || (strInvoke = function0.invoke()) == null) {
            strInvoke = "";
        }
        return keva.getString("last_selected_language", strInvoke);
    }
}
