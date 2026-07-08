package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Hly, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C450760Hly extends AbstractC450780Hm0 {
    public static final View LIZ(ViewGroup viewGroup) {
        if (C450770Hlz.LIZ().enable) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c3y, viewGroup, false);
            ((C1390410mHn) viewTd.findViewById(R.id.nl0)).LIZJ();
            return viewTd;
        }
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c3x, viewGroup, false);
    }
}
