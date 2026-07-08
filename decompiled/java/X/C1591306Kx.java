package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.06Kx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1591306Kx implements InterfaceC1591406Ky {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJII(View view, Integer num) {
        List<Integer> list;
        View viewFindViewById;
        C1227704rD c1227704rD = new C1227704rD();
        if (view != null && num != null && (list = c1227704rD.LIZ) != null && list.contains(num) && (viewFindViewById = view.findViewById(R.id.hfa)) != null) {
            C12ES.LJIILL(0, viewFindViewById);
        }
    }
}
