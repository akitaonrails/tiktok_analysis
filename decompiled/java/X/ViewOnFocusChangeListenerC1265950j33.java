package X;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.SmsInputViewModel;
import com.ss.android.ugc.aweme.anchor.AddAnchorAssem;
import com.ss.android.ugc.aweme.im.ui.assem.HistorySearchActionBarAssem;
import com.ss.android.ugc.aweme.im.ui.assem.HistorySearchAssem;
import com.ss.android.ugc.aweme.im.viewmodel.HistorySearchResultVM;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchGenericAbility;
import com.ss.android.ugc.aweme.inbox.search.assem.InboxSearchKeyWordAssem;
import com.ss.android.ugc.profile.business.profile.menu.business.content.search.SearchActionComponent;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0j33, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class ViewOnFocusChangeListenerC1265950j33 implements View.OnFocusChangeListener {
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
            case 2:
                onFocusChange$2(this, view, z);
                break;
            case 3:
                onFocusChange$3(this, view, z);
                break;
            case 4:
                onFocusChange$4(this, view, z);
                break;
            case 5:
                onFocusChange$5(this, view, z);
                break;
            case 6:
                onFocusChange$6(this, view, z);
                break;
        }
    }

    public ViewOnFocusChangeListenerC1265950j33(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFocusChange$0(ViewOnFocusChangeListenerC1265950j33 viewOnFocusChangeListenerC1265950j33, View view, boolean z) {
        AssemVMLazy assemVMLazy = ((HistorySearchActionBarAssem) viewOnFocusChangeListenerC1265950j33.l0).LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = HistorySearchActionBarAssem.LLJ;
        Iterator it2 = ((ArrayList) ((HistorySearchResultVM) assemVMLazy.getValue()).LLILZLL).iterator();
        while (it2.hasNext()) {
            ((View.OnFocusChangeListener) it2.next()).onFocusChange(view, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onFocusChange$1(ViewOnFocusChangeListenerC1265950j33 viewOnFocusChangeListenerC1265950j33, View view, boolean z) {
        if (!z) {
            C1240980iOm c1240980iOm = (C1240980iOm) ((HistorySearchAssem) viewOnFocusChangeListenerC1265950j33.l0).Go().getState();
            int i = C1241060iOu.LIZ[c1240980iOm.LL.ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                if (i == 4) {
                    ((HistorySearchAssem) viewOnFocusChangeListenerC1265950j33.l0).LLJJ = true;
                    return;
                }
                return;
            }
            ((HistorySearchAssem) viewOnFocusChangeListenerC1265950j33.l0).Ho(c1240980iOm);
        }
    }

    public static final void onFocusChange$2(ViewOnFocusChangeListenerC1265950j33 viewOnFocusChangeListenerC1265950j33, View view, boolean z) {
        C1241480iPa c1241480iPaKs0;
        String string;
        EditText editText;
        Editable editableLLJILLL;
        String string2;
        InboxSearchGenericAbility inboxSearchGenericAbility = (InboxSearchGenericAbility) C1558520qew.LIZ(C1558520qew.LJIIL((InboxSearchKeyWordAssem) viewOnFocusChangeListenerC1265950j33.l0), InboxSearchGenericAbility.class, null);
        if (inboxSearchGenericAbility != null && (c1241480iPaKs0 = inboxSearchGenericAbility.Ks0()) != null) {
            if (z) {
                if (!(view instanceof EditText) || (editText = (EditText) view) == null || (editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmYZDWkiGUoVqxSLncm9TR2T8PN4QRL6J5ks1X5RKpFEIdN4FnwBq04A==", null))) == null || (string2 = editableLLJILLL.toString()) == null || (string = a0.LJLIIIL(string2).toString()) == null) {
                    string = "";
                }
                c1241480iPaKs0.LIZ = System.currentTimeMillis();
                c1241480iPaKs0.LIZIZ = 0;
                c1241480iPaKs0.LIZJ = 0;
                c1241480iPaKs0.LIZLLL = string;
                c1241480iPaKs0.LJ = false;
                C1241460iPY.LIZ.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, "inbox");
                C20684815ws.LJIILLIIL("social_search_session_start", c2344009Gk.LIZ);
                c1241480iPaKs0.LJ = true;
                return;
            }
            if (!c1241480iPaKs0.LJ) {
                return;
            }
            C1241460iPY.LIZ.getClass();
            C1241460iPY.LJI(c1241480iPaKs0);
            c1241480iPaKs0.LJ = false;
        }
    }

    public static final void onFocusChange$3(ViewOnFocusChangeListenerC1265950j33 viewOnFocusChangeListenerC1265950j33, View view, boolean z) {
        if (z && ((SearchActionComponent) viewOnFocusChangeListenerC1265950j33.l0).Qp()) {
            ((SearchActionComponent) viewOnFocusChangeListenerC1265950j33.l0).Wp(new C1249660icm(EnumC1249630icj.ACTIVE));
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("SearchActionComponent", "searchView hasFocus, and expand the pane");
        }
    }

    public static final void onFocusChange$4(ViewOnFocusChangeListenerC1265950j33 viewOnFocusChangeListenerC1265950j33, View view, boolean z) {
        if (!z) {
            C1069330dvv.LIZ(((AddAnchorAssem) viewOnFocusChangeListenerC1265950j33.l0).getContext(), view);
        }
    }

    public static final void onFocusChange$5(ViewOnFocusChangeListenerC1265950j33 viewOnFocusChangeListenerC1265950j33, View view, boolean z) {
        if (z) {
            ((C1238900iLQ) viewOnFocusChangeListenerC1265950j33.l0).ln();
        } else {
            ((C1238900iLQ) viewOnFocusChangeListenerC1265950j33.l0).LLIIIZ();
        }
    }

    public static final void onFocusChange$6(ViewOnFocusChangeListenerC1265950j33 viewOnFocusChangeListenerC1265950j33, View view, boolean z) {
        Object value;
        C2252321DDq c2252321DDq = ((SmsInputViewModel) viewOnFocusChangeListenerC1265950j33.l0).LL;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, C1238980iLY.LIZ((C1238980iLY) value, z, null, false, null, false, 62)));
    }
}
