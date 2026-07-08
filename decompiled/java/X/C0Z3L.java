package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Z3L, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z3L {
    public static final Map<Integer, String> LIZ = C2097608Jq.LJIIIIZZ(new Pair(Integer.valueOf(R.layout.aaj), "awemenotice_mus_item_notification_template"), new Pair(Integer.valueOf(R.layout.aac), "awemenotice_mus_fragment_notification_new"));

    public static View LIZ(LayoutInflater layoutInflater, int i, ViewGroup viewGroup) {
        Context context;
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            C1388190mED.LIZ(context);
        }
        return C1906570ziJ.LIZ(layoutInflater, i, viewGroup, false, 16);
    }
}
