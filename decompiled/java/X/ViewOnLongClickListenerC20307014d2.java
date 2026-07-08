package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.lynx.TakoLynxAssem;

/* JADX INFO: renamed from: X.14d2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class ViewOnLongClickListenerC20307014d2 implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            default:
                return false;
        }
    }

    public ViewOnLongClickListenerC20307014d2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onLongClick$0(ViewOnLongClickListenerC20307014d2 viewOnLongClickListenerC20307014d2, View view) {
        ViewGroup viewGroupY4;
        TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(C1558520qew.LJIIL((TakoLynxAssem) viewOnLongClickListenerC20307014d2.l0), TakoCardAbility.class, null);
        if (takoCardAbility != null && (viewGroupY4 = takoCardAbility.Y4()) != null) {
            viewGroupY4.performLongClick();
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$1(ViewOnLongClickListenerC20307014d2 viewOnLongClickListenerC20307014d2, View view) {
        ViewGroup viewGroupY4;
        TakoCardAbility takoCardAbility = (TakoCardAbility) ((C20258614Oq) viewOnLongClickListenerC20307014d2.l0).LJIIL.getValue();
        if (takoCardAbility != null && (viewGroupY4 = takoCardAbility.Y4()) != null && viewGroupY4.isLongClickable()) {
            viewGroupY4.performLongClick();
            return true;
        }
        return false;
    }
}
