package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0cHs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1006060cHs {
    public static C341710DaT LIZJ(ViewGroup viewGroup) {
        return new C341710DaT(viewGroup.getContext(), null);
    }

    public static final View LIZ(ViewGroup viewGroup, Function2<? super TextView, ? super TextView, Unit> function2) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ftg, viewGroup, false);
        View viewFindViewById = viewTd.findViewById(R.id.tv_title);
        View viewFindViewById2 = viewTd.findViewById(R.id.zhs);
        if (function2 != null) {
            function2.invoke(viewFindViewById, viewFindViewById2);
        }
        return viewTd;
    }

    public static final View LIZIZ(ViewGroup viewGroup, InterfaceC1631620sYq<? super TextView, ? super TextView, ? super TextView, Unit> interfaceC1631620sYq) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fth, viewGroup, false);
        interfaceC1631620sYq.invoke(viewTd.findViewById(R.id.tv_title), viewTd.findViewById(R.id.zhs), viewTd.findViewById(R.id.zbf));
        return viewTd;
    }
}
