package X;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.settings.CountDownForAllV2SettingsDialog;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostSearchFragment;
import com.bytedance.android.livesdk.utils.KeyBoardUtil;
import java.util.List;

/* JADX INFO: renamed from: X.0bn6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class ViewOnFocusChangeListenerC986980bn6 implements View.OnFocusChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.$t) {
            case 0:
                onFocusChange$0(this, view, z);
                break;
            case 1:
                onFocusChange$1(this, view, z);
                break;
        }
    }

    public ViewOnFocusChangeListenerC986980bn6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFocusChange$0(ViewOnFocusChangeListenerC986980bn6 viewOnFocusChangeListenerC986980bn6, View view, boolean z) {
        C1748440vbG c1748440vbG;
        InputMethodManager inputMethodManager;
        C1748440vbG c1748440vbG2 = ((CountDownForAllV2SettingsDialog) viewOnFocusChangeListenerC986980bn6.l0).LLLIL;
        if (c1748440vbG2 != null) {
            c1748440vbG2.setEditTextIsCursorVisible(z);
        }
        if (!z && (c1748440vbG = ((CountDownForAllV2SettingsDialog) viewOnFocusChangeListenerC986980bn6.l0).LLLIL) != null) {
            Context context = c1748440vbG.getContext();
            List<KeyBoardUtil.AndroidBug5497Workaround> list = KeyBoardUtil.LIZ;
            if (context != null && (inputMethodManager = (InputMethodManager) C786410Ut5.H2(context, "input_method")) != null) {
                c1748440vbG.LJIIIIZZ(inputMethodManager, 0);
            }
        }
    }

    public static final void onFocusChange$1(ViewOnFocusChangeListenerC986980bn6 viewOnFocusChangeListenerC986980bn6, View view, boolean z) {
        Editable editableLLLFZ;
        if (z) {
            LiveEditText liveEditText = ((MultiCoHostSearchFragment) viewOnFocusChangeListenerC986980bn6.l0).LLILZLL;
            if (liveEditText != null) {
                liveEditText.setCursorVisible(true);
            }
            LiveEditText liveEditText2 = ((MultiCoHostSearchFragment) viewOnFocusChangeListenerC986980bn6.l0).LLILZLL;
            if (liveEditText2 != null && (editableLLLFZ = C2204961BRm.LLLFZ(liveEditText2, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF8AJhVgcdTdZDViJS7KxlteluS4UTf+R2n5Kq6zvG9zOAmqXithS2+iqmR8x/COWp", null))) != null) {
                int length = editableLLLFZ.length();
                LiveEditText liveEditText3 = ((MultiCoHostSearchFragment) viewOnFocusChangeListenerC986980bn6.l0).LLILZLL;
                if (liveEditText3 != null) {
                    liveEditText3.setSelection(length);
                    return;
                }
                return;
            }
            return;
        }
        LiveEditText liveEditText4 = ((MultiCoHostSearchFragment) viewOnFocusChangeListenerC986980bn6.l0).LLILZLL;
        if (liveEditText4 == null) {
            return;
        }
        liveEditText4.setCursorVisible(false);
    }
}
