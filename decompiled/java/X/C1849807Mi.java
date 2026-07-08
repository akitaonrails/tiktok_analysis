package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;

/* JADX INFO: renamed from: X.07Mi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1849807Mi {
    public static final List<String> LIZ;

    static {
        List<String> listLJJLL;
        Object[] objArr = (Object[]) SettingsManager.LIZLLL().LJIIIIZZ("pause_panel_items_order", String[].class, new String[0]);
        if (objArr == null || (listLJJLL = C13LQ.LJJLL(objArr)) == null) {
            listLJJLL = C13BV.INSTANCE;
        }
        LIZ = listLJJLL;
    }
}
