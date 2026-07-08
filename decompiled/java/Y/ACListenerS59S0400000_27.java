package Y;

import X.C0KVU;
import X.C1557540qdM;
import X.C1777410wLz;
import X.C1786010wZr;
import X.C1810690xDf;
import X.C20441214yg;
import X.C2188811AlT;
import X.C497740JfY;
import X.C766270U4b;
import X.C786410Ut5;
import X.C915980Zwa;
import X.InterfaceC1786040wZu;
import X.InterfaceC1844900y6q;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multihost.biz.view.InteractionGuideLayout;
import com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Arrays;

/* JADX INFO: loaded from: classes28.dex */
public class ACListenerS59S0400000_27 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS59S0400000_27 aCListenerS59S0400000_27, View view) {
        String str;
        if (!((C1557540qdM) aCListenerS59S0400000_27.l0).LIZIZ) {
            return;
        }
        C1786010wZr c1786010wZr = (C1786010wZr) aCListenerS59S0400000_27.l1;
        C1777410wLz c1777410wLz = (C1777410wLz) aCListenerS59S0400000_27.l2;
        c1786010wZr.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBottomBarButtonClick type=");
        if (c1777410wLz != null) {
            str = c1777410wLz.LIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C20441214yg.LIZIZ("CreatorRankingPageReporter", C2188811AlT.LIZIZ(sbLIZ));
        if (c1777410wLz != null) {
            C1810690xDf c1810690xDf = C1810690xDf.LIZ;
            DataChannel dataChannel = c1786010wZr.LIZ.getDataChannel();
            String str2 = c1777410wLz.LIZ;
            String str3 = c1777410wLz.LIZIZ;
            c1810690xDf.getClass();
            C1810690xDf.LJIIJ(dataChannel, str2, str3, "click", "", null);
        }
        InterfaceC1786040wZu interfaceC1786040wZu = (InterfaceC1786040wZu) aCListenerS59S0400000_27.l3;
        if (interfaceC1786040wZu != null) {
            interfaceC1786040wZu.LIZ();
        }
    }

    public static final void onClick$1(ACListenerS59S0400000_27 aCListenerS59S0400000_27, View view) {
        User user = ((LinkMicAnchorGuideMessage) aCListenerS59S0400000_27.l0).user;
        if (user != null) {
            ((InteractionGuideLayout) aCListenerS59S0400000_27.l1).hp(C915980Zwa.LJII().LLILL(user.getId()));
        }
        AnimatorSet animatorSet = ((InteractionGuideLayout) aCListenerS59S0400000_27.l1).LLJJJJLIIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ConstraintLayout constraintLayout = ((InteractionGuideLayout) aCListenerS59S0400000_27.l1).LLJJI;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        C786410Ut5.LL(8, constraintLayout);
        ((InterfaceC1844900y6q) aCListenerS59S0400000_27.l2).LIZLLL();
        C766270U4b.LJIIJJI(C786410Ut5.j4(C497740JfY.LJIJJ(2131841233, C0KVU.LIZ(((LinkMicAnchorGuideMessage) aCListenerS59S0400000_27.l0).user)), Arrays.copyOf(new Object[0], 0)));
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((ViewGroup) aCListenerS59S0400000_27.l3, (Property<ViewGroup, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(150L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public ACListenerS59S0400000_27(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
