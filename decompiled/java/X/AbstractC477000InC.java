package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS237S0000000_7;

/* JADX INFO: renamed from: X.0InC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC477000InC implements InterfaceC475250IkN {
    public final ViewGroup LIZ;
    public Function1<? super Integer, Unit> LIZIZ = AFwS237S0000000_7.get$arr$(286);
    public boolean LIZJ;

    public AbstractC477000InC(C422640Ghi c422640Ghi) {
        View viewFindViewById;
        ViewGroup viewGroup;
        if (c422640Ghi != null) {
            viewFindViewById = c422640Ghi.findViewById(R.id.view_stub_nearby_entrance_container_v2);
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof ViewStub) {
            View viewLJLLLL = C786410Ut5.LJLLLL((ViewStub) viewFindViewById);
            if ((viewLJLLLL instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJLLLL) != null) {
                viewGroup.setId(R.id.view_stub_nearby_entrance_container_v2);
                viewGroup = viewGroup;
            }
            this.LIZ = viewGroup;
            return;
        }
        this.LIZ = viewFindViewById instanceof ViewGroup ? (ViewGroup) viewFindViewById : null;
    }
}
