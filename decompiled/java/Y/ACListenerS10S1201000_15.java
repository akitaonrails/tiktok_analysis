package Y;

import X.C497740JfY;
import X.C919610a2R;
import X.C922480a74;
import X.C930540aK4;
import X.C931880aME;
import X.InterfaceC931940aMK;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public class ACListenerS10S1201000_15 implements View.OnClickListener {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

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

    public static final void onClick$0(ACListenerS10S1201000_15 aCListenerS10S1201000_15, View view) {
        ((C931880aME) aCListenerS10S1201000_15.l1).LLJJIJIL.setEnabled(false);
        ((C931880aME) aCListenerS10S1201000_15.l1).LLJJIJIL.setText(C497740JfY.LJIJI(2131840633));
        C931880aME c931880aME = (C931880aME) aCListenerS10S1201000_15.l1;
        InterfaceC931940aMK interfaceC931940aMK = c931880aME.LLILLJJLI;
        if (interfaceC931940aMK != null) {
            interfaceC931940aMK.LJJII((LinkPlayerInfo) aCListenerS10S1201000_15.l2, new AwS559S0100000_15(c931880aME, 1056));
        }
        ((C931880aME) aCListenerS10S1201000_15.l1).a6((LinkPlayerInfo) aCListenerS10S1201000_15.l2, "invite", aCListenerS10S1201000_15.s0, aCListenerS10S1201000_15.i3);
        C922480a74.LIZ(((C931880aME) aCListenerS10S1201000_15.l1).LL, Long.valueOf(C930540aK4.LJIIL()));
    }

    public static final void onClick$1(ACListenerS10S1201000_15 aCListenerS10S1201000_15, View view) {
        if (!((C931880aME) aCListenerS10S1201000_15.l1).LLJJIJIL.isEnabled() && C919610a2R.LIZIZ()) {
            ((C931880aME) aCListenerS10S1201000_15.l1).X5((LinkPlayerInfo) aCListenerS10S1201000_15.l2, aCListenerS10S1201000_15.s0);
            return;
        }
        ((C931880aME) aCListenerS10S1201000_15.l1).LLJJIJIL.setEnabled(false);
        ((C931880aME) aCListenerS10S1201000_15.l1).LLJJIJIL.setText(C497740JfY.LJIJI(2131840633));
        InterfaceC931940aMK interfaceC931940aMK = ((C931880aME) aCListenerS10S1201000_15.l1).LLILLJJLI;
        if (interfaceC931940aMK != null) {
            interfaceC931940aMK.LJJJJI((LinkPlayerInfo) aCListenerS10S1201000_15.l2);
        }
        ((C931880aME) aCListenerS10S1201000_15.l1).a6((LinkPlayerInfo) aCListenerS10S1201000_15.l2, "invite", aCListenerS10S1201000_15.s0, aCListenerS10S1201000_15.i3);
        C922480a74.LIZ(((C931880aME) aCListenerS10S1201000_15.l1).LL, Long.valueOf(C930540aK4.LJIIL()));
    }

    public ACListenerS10S1201000_15(C931880aME c931880aME, LinkPlayerInfo linkPlayerInfo, String str, int i, int i2) {
        this.$t = i2;
        this.l1 = c931880aME;
        this.l2 = linkPlayerInfo;
        this.s0 = str;
        this.i3 = i;
    }
}
