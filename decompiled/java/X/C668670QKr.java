package X;

import android.widget.EditText;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.middle.SearchResultFragmentNew;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0QKr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668670QKr implements InterfaceC668720QKw {
    public final /* synthetic */ SearchResultFragmentNew LIZ;

    @Override // X.InterfaceC668720QKw
    public final C0QJ6 LIZ() {
        return this.LIZ.LLLIIIIL;
    }

    @Override // X.InterfaceC668720QKw
    public final InterfaceC667070QEn LIZIZ() {
        return this.LIZ.LLLF;
    }

    @Override // X.InterfaceC668720QKw
    public final C0QJ5 LIZJ() {
        return this.LIZ.LLLII;
    }

    @Override // X.InterfaceC668720QKw
    public final C0QNU LIZLLL() {
        return this.LIZ.LLLFZ;
    }

    @Override // X.InterfaceC668720QKw
    public final C0QLY LJ() {
        return this.LIZ.LL;
    }

    @Override // X.InterfaceC668720QKw
    public final Boolean LJFF() {
        return Boolean.valueOf(this.LIZ.LLJLL.LLILZ);
    }

    @Override // X.InterfaceC668720QKw
    public final InterfaceC664090Q3b LJII() {
        return this.LIZ.LLLIIII;
    }

    @Override // X.InterfaceC668720QKw
    public final InterfaceC669050QMd LJIIIIZZ() {
        return this.LIZ.LLLIL;
    }

    @Override // X.InterfaceC668720QKw
    public final EditText getEditText() {
        return this.LIZ.cS();
    }

    @Override // X.InterfaceC668720QKw
    public final C0QJE getKeyword() {
        return this.LIZ.LLLI;
    }

    @Override // X.InterfaceC668720QKw
    public final InterfaceC669910QPl getTabIndex() {
        return this.LIZ.LLLIIIL;
    }

    @Override // X.InterfaceC668720QKw
    public final SearchResultParam y3() {
        return this.LIZ.LLJZIJLIL;
    }

    @Override // X.InterfaceC668720QKw
    public final SearchResultFragmentNew LJI() {
        return this.LIZ;
    }

    public C668670QKr(SearchResultFragmentNew searchResultFragmentNew) {
        this.LIZ = searchResultFragmentNew;
    }

    @Override // X.InterfaceC668720QKw
    public final void LJIIIZ(Word word, AwS411S0200000_10 awS411S0200000_10) {
        String string;
        String string2;
        SearchResultFragmentNew searchResultFragmentNew = this.LIZ;
        C0QER c0qerLIZJ = C640270P9l.LIZJ(searchResultFragmentNew, searchResultFragmentNew.getActivity());
        String strVR = this.LIZ.VR();
        CharSequence hint = this.LIZ.cS().getHint();
        if (hint != null && (string2 = hint.toString()) != null) {
            string = a0.LJLIIIL(string2).toString();
        } else {
            string = null;
        }
        if (Intrinsics.LJFF(strVR, string) && C123100dR.LIZ(word.getWord())) {
            if (((Number) C107800ay.LIZ.getValue()).intValue() == 1 || (c0qerLIZJ != null && c0qerLIZJ.isSetHintBySugWord())) {
                C668750QKz c668750QKz = this.LIZ.LLLF;
                if (c668750QKz != null) {
                    c668750QKz.LIZ(word);
                }
                awS411S0200000_10.invoke();
            }
        }
    }
}
