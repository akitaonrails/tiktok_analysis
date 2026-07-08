package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.ability.CommerceAgentCardAbility;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.components.flowmarkdown.assem.CommerceAgentNewMarkdownAssem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Dhx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class ViewOnLongClickListenerC346350Dhx implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ boolean onLongClick$0(ViewOnLongClickListenerC346350Dhx viewOnLongClickListenerC346350Dhx, View view) {
        return ((Boolean) ((Function1) viewOnLongClickListenerC346350Dhx.l0).invoke(view)).booleanValue();
    }

    @Override // android.view.View.OnLongClickListener
    public final /* synthetic */ boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            default:
                return false;
        }
    }

    public ViewOnLongClickListenerC346350Dhx(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onLongClick$1(ViewOnLongClickListenerC346350Dhx viewOnLongClickListenerC346350Dhx, View view) {
        ViewGroup viewGroupY4;
        CommerceAgentCardAbility commerceAgentCardAbility = (CommerceAgentCardAbility) ((CommerceAgentNewMarkdownAssem) viewOnLongClickListenerC346350Dhx.l0).LLJJLIIIJLLLLLLLZ.getValue();
        if (commerceAgentCardAbility != null && (viewGroupY4 = commerceAgentCardAbility.Y4()) != null && viewGroupY4.isLongClickable()) {
            viewGroupY4.performLongClick();
            return true;
        }
        return false;
    }
}
