package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0J1C, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J1C {
    public static C0J1A LIZ(ViewGroup viewGroup, int i, Function1 function1, Function2 function2) {
        if (i == 2000) {
            int i2 = C0J1B.LLILZ;
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cwv, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
            if (layoutParams instanceof C21681819tI) {
                ((C21681819tI) layoutParams).LLILLJJLI = true;
            }
            return new C0J1B(viewTd);
        }
        return new C531290KsZ(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cwx, viewGroup, false), function1, function2, true);
    }
}
