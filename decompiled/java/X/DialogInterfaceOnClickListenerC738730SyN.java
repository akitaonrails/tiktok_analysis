package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ui.view.PostModeActionBarComponentV2;

/* JADX INFO: renamed from: X.0SyN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class DialogInterfaceOnClickListenerC738730SyN implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                break;
            case 1:
                onClick$1(this, dialogInterface, i);
                break;
            case 2:
                onClick$2(this, dialogInterface, i);
                break;
        }
    }

    public DialogInterfaceOnClickListenerC738730SyN(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onClick$0(DialogInterfaceOnClickListenerC738730SyN dialogInterfaceOnClickListenerC738730SyN, DialogInterface dialogInterface, int i) {
        ((C1260870iur) ((C1348990lCz) dialogInterfaceOnClickListenerC738730SyN.l0).LLJ.getValue()).LIZJ(((Aweme) dialogInterfaceOnClickListenerC738730SyN.l1).getAid(), 1);
        MobClick mobClick = new MobClick();
        mobClick.setEventName("private_permission");
        mobClick.setLabelName("confirm");
        mobClick.setValue(((Aweme) dialogInterfaceOnClickListenerC738730SyN.l1).getAid());
        C20684815ws.onEvent(mobClick);
    }

    public static final void onClick$1(DialogInterfaceOnClickListenerC738730SyN dialogInterfaceOnClickListenerC738730SyN, DialogInterface dialogInterface, int i) {
        ((C723150SYf) dialogInterfaceOnClickListenerC738730SyN.l0).LIZJ(((Aweme) dialogInterfaceOnClickListenerC738730SyN.l1).getAid(), 1);
        MobClick mobClick = new MobClick();
        mobClick.setEventName("private_permission");
        mobClick.setLabelName("confirm");
        mobClick.setValue(((Aweme) dialogInterfaceOnClickListenerC738730SyN.l1).getAid());
        C20684815ws.onEvent(mobClick);
    }

    public static final void onClick$2(DialogInterfaceOnClickListenerC738730SyN dialogInterfaceOnClickListenerC738730SyN, DialogInterface dialogInterface, int i) {
        C723150SYf c723150SYf = ((PostModeActionBarComponentV2) dialogInterfaceOnClickListenerC738730SyN.l0).LLJI;
        if (c723150SYf != null) {
            c723150SYf.LIZJ(((Aweme) dialogInterfaceOnClickListenerC738730SyN.l1).getAid(), 1);
        }
        MobClick mobClick = new MobClick();
        mobClick.setEventName("private_permission");
        mobClick.setLabelName("confirm");
        mobClick.setValue(((Aweme) dialogInterfaceOnClickListenerC738730SyN.l1).getAid());
        C20684815ws.onEvent(mobClick);
    }
}
