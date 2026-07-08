package X;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.model.message.Question;
import com.bytedance.android.livesdk.qa.ReportQuestionDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.sticker.model.EffectAttribution;

/* JADX INFO: renamed from: X.0UsG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class ViewOnLongClickListenerC785900UsG implements View.OnLongClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            default:
                return false;
        }
    }

    public static final boolean onLongClick$0(ViewOnLongClickListenerC785900UsG viewOnLongClickListenerC785900UsG, View view) {
        ScrollSwitchStateManager scrollSwitchStateManager = (ScrollSwitchStateManager) viewOnLongClickListenerC785900UsG.l0;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.LLJJ.setValue(((InterfaceC1583870rJp) viewOnLongClickListenerC785900UsG.l1).tag());
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$1(ViewOnLongClickListenerC785900UsG viewOnLongClickListenerC785900UsG, View view) {
        C0UNW c0unw;
        Question question;
        ReportQuestionDialog reportQuestionDialog;
        if ((((C0UNW) viewOnLongClickListenerC785900UsG.l0).LLILZIL || !C494680Jac.LJIIJ((DataChannel) viewOnLongClickListenerC785900UsG.l1)) && (question = (c0unw = (C0UNW) viewOnLongClickListenerC785900UsG.l0).LLIZLLLIL) != null) {
            DataChannel dataChannel = (DataChannel) viewOnLongClickListenerC785900UsG.l1;
            dataChannel.SX0(C760130Trn.class, question);
            dataChannel.SX0(C760120Trm.class, "qa_card");
            c0unw.LLJ = new ReportQuestionDialog();
            FragmentManager fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
            if (fragmentManager != null && (reportQuestionDialog = c0unw.LLJ) != null) {
                reportQuestionDialog.show(fragmentManager, "QuickQuestionPinCardBehavior");
            }
        }
        return true;
    }

    public static final boolean onLongClick$2(ViewOnLongClickListenerC785900UsG viewOnLongClickListenerC785900UsG, View view) {
        return ((C747710TUr) viewOnLongClickListenerC785900UsG.l0).LL.invoke((EffectAttribution) viewOnLongClickListenerC785900UsG.l1).booleanValue();
    }

    public ViewOnLongClickListenerC785900UsG(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
