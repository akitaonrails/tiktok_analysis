package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0afj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C943970afj {
    public static final Map<Integer, C943960afi> LIZ = new LinkedHashMap();
    public static final C01GW LIZIZ = C292401Bi.LIZ(AFwS193S0000000_7.get$arr$(253));

    public static void LIZJ(int i, boolean z) {
        C943960afi c943960afi = (C943960afi) ((LinkedHashMap) LIZ).get(Integer.valueOf(i));
        if (c943960afi != null) {
            if (z) {
                c943960afi.LIZJ++;
            } else {
                c943960afi.LIZLLL++;
            }
        }
    }

    public static final View LIZIZ(LayoutInflater layoutInflater, Context context, int i, ViewGroup viewGroup) {
        View viewLIZ;
        InterfaceC943980afk interfaceC943980afk = (InterfaceC943980afk) LIZIZ.getValue();
        if (interfaceC943980afk != null && (viewLIZ = interfaceC943980afk.LIZ(i)) != null) {
            LIZJ(i, true);
            return viewLIZ;
        }
        LIZJ(i, false);
        return C786410Ut5.Td(layoutInflater, i, viewGroup, false);
    }

    public static void LIZ(Context context, int i, String str, RecyclerView recyclerView, int i2) {
        if (i2 <= 0) {
            return;
        }
        Map<Integer, C943960afi> map = LIZ;
        if (map.containsKey(Integer.valueOf(i))) {
            C943960afi c943960afi = (C943960afi) ((LinkedHashMap) map).get(Integer.valueOf(i));
            if (c943960afi == null) {
                c943960afi = new C943960afi(str);
                map.put(Integer.valueOf(i), c943960afi);
            } else if (c943960afi.LIZIZ - c943960afi.LIZJ >= i2) {
                return;
            }
            c943960afi.LIZIZ += i2;
        }
        InterfaceC943980afk interfaceC943980afk = (InterfaceC943980afk) LIZIZ.getValue();
        if (interfaceC943980afk != null) {
            interfaceC943980afk.LIZIZ(context, i, str, recyclerView, i2);
        }
    }
}
