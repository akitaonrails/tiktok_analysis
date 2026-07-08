package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.Set;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.04vX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1254504vX {
    public static final Set<String> LIZ;

    static {
        SettingsManager.LIZLLL().getClass();
        String strLJI = SettingsManager.LJI("ecom_image_simple_cachekey_list", "");
        LIZ = strLJI.length() == 0 ? C08CX.INSTANCE : C13LP.LLIIJI(a0.LJJLIIIJ(strLJI, new char[]{','}, false, 0, 6));
    }
}
