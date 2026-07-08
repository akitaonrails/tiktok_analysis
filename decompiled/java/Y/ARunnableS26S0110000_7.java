package Y;

import X.C0WZX;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2;
import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveEndCardWidget;
import com.bytedance.android.livesdk.dataChannel.InteractiveTopBarViewTopChannel;
import com.bytedance.android.livesdk.programmedlive.ui.InteractiveTopBarWidget;
import com.bytedance.android.livesdk.widget.RecommendSwipeNewWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell;

/* JADX INFO: loaded from: classes8.dex */
public class ARunnableS26S0110000_7 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

    public static final void run$3(ARunnableS26S0110000_7 aRunnableS26S0110000_7) {
        ((RoomPlayer2) aRunnableS26S0110000_7.l0).lambda$setIsSmoothEnter$0(aRunnableS26S0110000_7.z1);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        View view = ((InteractiveTopBarWidget) this.l0).getView();
        if (view == null || view.getParent() == null) {
            return;
        }
        View view2 = ((InteractiveTopBarWidget) this.l0).getView();
        Integer numValueOf = view2 != null ? Integer.valueOf(view2.getTop()) : null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInteractiveTopBarToggle: show = ");
        sbLIZ.append(this.z1);
        sbLIZ.append(", viewTop = ");
        sbLIZ.append(numValueOf);
        C20441214yg.LJIIIZ("InteractiveTopBarWidget", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = ((InteractiveTopBarWidget) this.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(InteractiveTopBarViewTopChannel.class, Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 0));
        }
    }

    public final void LIZ$1() {
        EditText editText;
        InputMethodManager inputMethodManager = (InputMethodManager) C786410Ut5.H2(((DefaultMixListCell) this.l0).itemView.getContext(), "input_method");
        EditText editText2 = ((DefaultMixListCell) this.l0).LL;
        if (editText2 == null) {
            editText2 = null;
        }
        editText2.setFocusable(this.z1);
        EditText editText3 = ((DefaultMixListCell) this.l0).LL;
        if (editText3 == null) {
            editText3 = null;
        }
        editText3.setFocusableInTouchMode(this.z1);
        if (!this.z1) {
            if (inputMethodManager != null) {
                EditText editText4 = ((DefaultMixListCell) this.l0).LL;
                inputMethodManager.hideSoftInputFromWindow((editText4 != null ? editText4 : null).getWindowToken(), 0);
                return;
            }
            return;
        }
        EditText editText5 = ((DefaultMixListCell) this.l0).LL;
        if (editText5 == null) {
            editText5 = null;
        }
        editText5.requestFocus();
        EditText editText6 = ((DefaultMixListCell) this.l0).LL;
        if (editText6 == null) {
            editText = null;
            editText6 = null;
        } else {
            editText = editText6;
        }
        editText.setSelection(C2204961BRm.LLJILLL(editText6, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOehe9HP2DaCvshZtcIMeggwCuwxXF02/i1xHlZ+1g==", null)).toString().length());
        if (inputMethodManager != null) {
            EditText editText7 = ((DefaultMixListCell) this.l0).LL;
            inputMethodManager.showSoftInput(editText7 != null ? editText7 : null, 2);
        }
    }

    public static final void run$0(ARunnableS26S0110000_7 aRunnableS26S0110000_7) {
        boolean zLIZ;
        C1C7U.LIZ("LiveEndCardWidget@8614.tryInitEventContainer$1$1$onRegisterStatusChange$1");
        try {
            ((LiveEndCardWidget) aRunnableS26S0110000_7.l0).E1(aRunnableS26S0110000_7.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveEndCardWidget@8614.tryInitEventContainer$1$1$onRegisterStatusChange$1");
    }

    public static final void run$1(ARunnableS26S0110000_7 aRunnableS26S0110000_7) {
        boolean zLIZ;
        C1C7U.LIZ("InteractiveTopBarWidget@9b1b.onInteractiveTopBarToggle$1");
        try {
            aRunnableS26S0110000_7.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractiveTopBarWidget@9b1b.onInteractiveTopBarToggle$1");
    }

    public static final void run$2(ARunnableS26S0110000_7 aRunnableS26S0110000_7) {
        boolean zLIZ;
        C1C7U.LIZ("RecommendSwipeNewWidget@e6c2.checkSwipe$1");
        try {
            ((RecommendSwipeNewWidget) aRunnableS26S0110000_7.l0).N1(aRunnableS26S0110000_7.z1, true);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecommendSwipeNewWidget@e6c2.checkSwipe$1");
    }

    public static final void run$4(ARunnableS26S0110000_7 aRunnableS26S0110000_7) {
        boolean zLIZ;
        C1C7U.LIZ("DefaultMixListCell@4057.updateKeyboardFocus$1");
        try {
            aRunnableS26S0110000_7.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DefaultMixListCell@4057.updateKeyboardFocus$1");
    }

    public ARunnableS26S0110000_7(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
