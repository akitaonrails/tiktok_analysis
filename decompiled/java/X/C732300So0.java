package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0So0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732300So0 extends C09AY implements Function1<C711590Rvh, View> {
    public C732300So0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final View invoke(C711590Rvh c711590Rvh) {
        final Context context = c711590Rvh.LIZIZ;
        return new C732240Snu(context) { // from class: X.0Snw
            {
                super(context, null, 0);
                C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bt9, this, true);
            }
        };
    }
}
