package X;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.ui.assem.HistorySearchActionBarAssem;
import com.ss.android.ugc.aweme.inbox.search.assem.InboxSearchKeyWordAssem;
import com.ss.android.ugc.aweme.inbox.search.data.items.InboxSearchRecentStoreItem;
import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchDefaultVM;
import com.ss.android.ugc.aweme.inbox.search.vm.InboxSearchVM;
import com.ss.android.ugc.nearby.roaming.RegionSearchHeaderAssem;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS69S1000000_18;

/* JADX INFO: renamed from: X.0j2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1265830j2r implements TextView.OnEditorActionListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.$t) {
            case 0:
                return onEditorAction$0(this, textView, i, keyEvent);
            case 1:
                return onEditorAction$1(this, textView, i, keyEvent);
            case 2:
                return onEditorAction$2(this, textView, i, keyEvent);
            case 3:
                return onEditorAction$3(this, textView, i, keyEvent);
            case 4:
                return onEditorAction$4(this, textView, i, keyEvent);
            default:
                return false;
        }
    }

    public C1265830j2r(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onEditorAction$0(C1265830j2r c1265830j2r, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 3) {
            ((HistorySearchActionBarAssem) c1265830j2r.l0).Rq();
            return false;
        }
        return false;
    }

    public static final boolean onEditorAction$1(C1265830j2r c1265830j2r, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 3) {
            ((InboxSearchKeyWordAssem) c1265830j2r.l0).Rq();
            AssemVMLazy assemVMLazy = ((InboxSearchKeyWordAssem) c1265830j2r.l0).LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = InboxSearchKeyWordAssem.LLJI;
            String str = ((InboxSearchVM) assemVMLazy.getValue()).LL;
            if (str.length() > 0) {
                ((InboxSearchDefaultVM) ((InboxSearchKeyWordAssem) c1265830j2r.l0).LLJ.getValue()).zQ2(new InboxSearchRecentStoreItem(C0PGF.NORMAL, str, System.currentTimeMillis()));
            }
        }
        return false;
    }

    public static final boolean onEditorAction$2(C1265830j2r c1265830j2r, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 3) {
            C340780DXo.LIZ((EditText) c1265830j2r.l0);
            return false;
        }
        return false;
    }

    public static final boolean onEditorAction$3(C1265830j2r c1265830j2r, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 3) {
            RegionSearchHeaderAssem regionSearchHeaderAssem = (RegionSearchHeaderAssem) c1265830j2r.l0;
            ((RegionSearchHeaderAssem) c1265830j2r.l0).Go().setState(new AwS69S1000000_18((String) regionSearchHeaderAssem.withState(regionSearchHeaderAssem.Go(), AFwS257S0000000_19.get$arr$(342)), 0));
            return true;
        }
        return false;
    }

    public static final boolean onEditorAction$4(C1265830j2r c1265830j2r, TextView textView, int i, KeyEvent keyEvent) {
        InputMethodManager inputMethodManager;
        if (i != 0) {
            return false;
        }
        C1735760vGo c1735760vGo = (C1735760vGo) c1265830j2r.l0;
        Object objH2 = C786410Ut5.H2(c1735760vGo.getContext(), "input_method");
        if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null) {
            inputMethodManager.hideSoftInputFromWindow(c1735760vGo.getWindowToken(), 0);
        }
        return true;
    }
}
