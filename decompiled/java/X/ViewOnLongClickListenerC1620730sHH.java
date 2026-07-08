package X;

import android.view.View;
import com.ss.android.ugc.aweme.skylight.LongClickAbilitySkylightCell;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sHH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class ViewOnLongClickListenerC1620730sHH implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            case 3:
                return onLongClick$3(this, view);
            case 4:
                return onLongClick$4(this, view);
            case 5:
                return onLongClick$5(this, view);
            case 6:
                return onLongClick$6(this, view);
            default:
                return false;
        }
    }

    public ViewOnLongClickListenerC1620730sHH(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onLongClick$0(ViewOnLongClickListenerC1620730sHH viewOnLongClickListenerC1620730sHH, View view) {
        ((Function0) viewOnLongClickListenerC1620730sHH.l0).invoke();
        return true;
    }

    public static final boolean onLongClick$1(ViewOnLongClickListenerC1620730sHH viewOnLongClickListenerC1620730sHH, View view) {
        ((LongClickAbilitySkylightCell) viewOnLongClickListenerC1620730sHH.l0).S5();
        return true;
    }

    public static final boolean onLongClick$2(ViewOnLongClickListenerC1620730sHH viewOnLongClickListenerC1620730sHH, View view) {
        return ((C1606310ru1) viewOnLongClickListenerC1620730sHH.l0).LIZ.performLongClick();
    }

    public static final boolean onLongClick$3(ViewOnLongClickListenerC1620730sHH viewOnLongClickListenerC1620730sHH, View view) {
        ((Function0) viewOnLongClickListenerC1620730sHH.l0).invoke();
        return true;
    }

    public static final boolean onLongClick$4(ViewOnLongClickListenerC1620730sHH viewOnLongClickListenerC1620730sHH, View view) {
        ((Function0) viewOnLongClickListenerC1620730sHH.l0).invoke();
        return true;
    }

    public static final boolean onLongClick$5(ViewOnLongClickListenerC1620730sHH viewOnLongClickListenerC1620730sHH, View view) {
        ((Function0) viewOnLongClickListenerC1620730sHH.l0).invoke();
        return true;
    }

    public static final boolean onLongClick$6(ViewOnLongClickListenerC1620730sHH viewOnLongClickListenerC1620730sHH, View view) {
        View.OnClickListener onClickListenerLIZIZ = ((C1609070ryT) viewOnLongClickListenerC1620730sHH.l0).LIZ.LIZIZ(3);
        if (onClickListenerLIZIZ != null) {
            onClickListenerLIZIZ.onClick(view);
        }
        return ((C1609070ryT) viewOnLongClickListenerC1620730sHH.l0).LIZ.LIZJ();
    }
}
