package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ui.EcSearchMiddlePagerContainerFragment;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem;
import com.ss.android.ugc.aweme.search.middle.BaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.search.middle.SearchResultFragmentNew;

/* JADX INFO: renamed from: X.0R3z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C689810R3z implements TextView.OnEditorActionListener {
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

    public C689810R3z(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onEditorAction$0(C689810R3z c689810R3z, TextView textView, int i, KeyEvent keyEvent) {
        ((ECSearchBarAssem) c689810R3z.l0).Tp();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
    
        if (r9.getAction() == 0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onEditorAction$1(X.C689810R3z r6, android.widget.TextView r7, int r8, android.view.KeyEvent r9) throws java.lang.Throwable {
        /*
            r5 = 1
            r4 = 3
            if (r8 == r4) goto L19
            r0 = 6
            if (r8 == r0) goto L19
            if (r8 != 0) goto L4c
            if (r9 == 0) goto L55
            int r1 = r9.getKeyCode()
            r0 = 66
            if (r1 != r0) goto L55
            int r0 = r9.getAction()
            if (r0 != 0) goto L55
        L19:
            com.ss.android.ugc.aweme.ab.EcSearchSugInputABModel r0 = X.C0QXC.LIZ()
            boolean r0 = r0.enable
            if (r0 == 0) goto L4c
            java.lang.Object r2 = r6.l0
            com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem r2 = (com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem) r2
            X.0QUT r1 = r2.LLLILZJ
            X.0QUT r0 = X.C0QUT.SUG
            if (r1 != r0) goto L4c
            X.0I7D r3 = r2.Bp()
            X.0WZX r2 = new X.0WZX
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3a+ZPqatWkPY9z6oqz6OijJQuBH9iHM3bAWDHUeYq3Zs="
            r1 = 0
            r2.<init>(r0, r1)
            android.text.Editable r0 = X.C2204961BRm.LLLLJI(r3, r2)
            if (r0 == 0) goto L41
            java.lang.String r1 = r0.toString()
        L41:
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem r0 = (com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem) r0
            int r0 = r0.Xp()
            X.C0QT8.LIZJ(r0, r1)
        L4c:
            if (r8 != r4) goto L55
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem r0 = (com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem) r0
            r0.Up()
        L55:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C689810R3z.onEditorAction$1(X.0R3z, android.widget.TextView, int, android.view.KeyEvent):boolean");
    }

    public static final boolean onEditorAction$2(C689810R3z c689810R3z, TextView textView, int i, KeyEvent keyEvent) {
        SearchResultFragmentNew searchResultFragmentNewLJI;
        InterfaceC668720QKw interfaceC668720QKw = ((EcSearchMiddlePagerContainerFragment) c689810R3z.l0).LL;
        if (interfaceC668720QKw != null && (searchResultFragmentNewLJI = interfaceC668720QKw.LJI()) != null) {
            searchResultFragmentNewLJI.US(i, keyEvent);
            return true;
        }
        return false;
    }

    public static final boolean onEditorAction$3(C689810R3z c689810R3z, TextView textView, int i, KeyEvent keyEvent) {
        ((EcSearchMiddlePagerContainerFragment) c689810R3z.l0).PR();
        return true;
    }

    public static final boolean onEditorAction$4(C689810R3z c689810R3z, TextView textView, int i, KeyEvent keyEvent) {
        boolean zLJI = MethodIDManager.LJI(72098);
        ((BaseDiscoverAndSearchFragmentNew) c689810R3z.l0).US(i, keyEvent);
        if (zLJI) {
            MethodIDManager.LJ();
            return true;
        }
        return true;
    }
}
