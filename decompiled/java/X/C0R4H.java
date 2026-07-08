package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ui.EcSearchMiddlePagerContainerFragment;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.search.middle.BaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.ChooseSearchMusicFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.ui.SearchFeedbackOptionalDetailFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS25S0001000_10;
import kotlin.jvm.internal.AwS61S1000000_10;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0R4H, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R4H implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void beforeTextChanged$0(C0R4H c0r4h, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C0R4H c0r4h, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(C0R4H c0r4h, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$3(C0R4H c0r4h, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$4(C0R4H c0r4h, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$5(C0R4H c0r4h, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$6(C0R4H c0r4h, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$7(C0R4H c0r4h, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(C0R4H c0r4h, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$1(C0R4H c0r4h, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$2(C0R4H c0r4h, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$3(C0R4H c0r4h, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$4(C0R4H c0r4h, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$5(C0R4H c0r4h, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$6(C0R4H c0r4h, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                break;
            case 1:
                afterTextChanged$1(this, editable);
                break;
            case 2:
                afterTextChanged$2(this, editable);
                break;
            case 3:
                afterTextChanged$3(this, editable);
                break;
            case 4:
                afterTextChanged$4(this, editable);
                break;
            case 5:
                afterTextChanged$5(this, editable);
                break;
            case 6:
                afterTextChanged$6(this, editable);
                break;
            case 7:
                afterTextChanged$7(this, editable);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                beforeTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                beforeTextChanged$2(this, charSequence, i, i2, i3);
                break;
            case 3:
                beforeTextChanged$3(this, charSequence, i, i2, i3);
                break;
            case 4:
                beforeTextChanged$4(this, charSequence, i, i2, i3);
                break;
            case 5:
                beforeTextChanged$5(this, charSequence, i, i2, i3);
                break;
            case 6:
                beforeTextChanged$6(this, charSequence, i, i2, i3);
                break;
            case 7:
                beforeTextChanged$7(this, charSequence, i, i2, i3);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                onTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                onTextChanged$2(this, charSequence, i, i2, i3);
                break;
            case 3:
                onTextChanged$3(this, charSequence, i, i2, i3);
                break;
            case 4:
                onTextChanged$4(this, charSequence, i, i2, i3);
                break;
            case 5:
                onTextChanged$5(this, charSequence, i, i2, i3);
                break;
            case 6:
                onTextChanged$6(this, charSequence, i, i2, i3);
                break;
            case 7:
                onTextChanged$7(this, charSequence, i, i2, i3);
                break;
        }
    }

    public C0R4H(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$0(C0R4H c0r4h, Editable editable) {
        ChooseSearchMusicFragment chooseSearchMusicFragment = (ChooseSearchMusicFragment) c0r4h.l0;
        chooseSearchMusicFragment.getClass();
        String strValueOf = String.valueOf(editable);
        boolean z = false;
        if (TextUtils.isEmpty(strValueOf)) {
            C681050QnX.LIZ = "";
            chooseSearchMusicFragment.aS(C681430Qo9.LIZ());
            if (C681620QoS.LIZLLL() && (!chooseSearchMusicFragment.LLLFZ.isEmpty())) {
                z = true;
            }
            chooseSearchMusicFragment.MR(z);
        } else {
            chooseSearchMusicFragment.aS(false);
            chooseSearchMusicFragment.MR(false);
        }
        SearchKeywordPresenter searchKeywordPresenter = chooseSearchMusicFragment.LLJJIII;
        if (searchKeywordPresenter != null) {
            searchKeywordPresenter.LIZ(new C0P9E(strValueOf, 2));
        }
        if (!TextUtils.equals(chooseSearchMusicFragment.LLJJJJLIIL, strValueOf)) {
            chooseSearchMusicFragment.LLJJJJLIIL = strValueOf;
            if (TextUtils.isEmpty(strValueOf)) {
                chooseSearchMusicFragment.WR(true);
                return;
            }
            chooseSearchMusicFragment.PR().setState(new AwS61S1000000_10(strValueOf, 18));
            InterfaceC681200Qnm interfaceC681200Qnm = chooseSearchMusicFragment.LLJJIJIIJIL;
            if (interfaceC681200Qnm != null) {
                ((C681210Qnn) interfaceC681200Qnm).LIZ.LLIZ = strValueOf;
            }
            if (chooseSearchMusicFragment.LLJJJJ) {
                return;
            }
            chooseSearchMusicFragment.PR().setState(new AwS25S0001000_10(2, 8));
        }
    }

    public static final void afterTextChanged$1(C0R4H c0r4h, Editable editable) {
        SearchFeedbackOptionalDetailFragment searchFeedbackOptionalDetailFragment = (SearchFeedbackOptionalDetailFragment) c0r4h.l0;
        if (searchFeedbackOptionalDetailFragment.LLIZ) {
            C197039127h c197039127hNR = searchFeedbackOptionalDetailFragment.NR();
            boolean z = false;
            if (editable != null && editable.length() > 0) {
                z = true;
            }
            c197039127hNR.setEnabled(z);
        }
    }

    public static final void afterTextChanged$2(C0R4H c0r4h, Editable editable) {
        if (editable != null && editable.length() != 0) {
            C786410Ut5.LLIL((TextView) c0r4h.l0, 0);
        } else {
            C786410Ut5.LLIL((TextView) c0r4h.l0, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void afterTextChanged$3(X.C0R4H r4, android.text.Editable r5) {
        /*
            java.lang.Object r4 = r4.l0
            com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem r4 = (com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem) r4
            r2 = 0
            if (r5 == 0) goto L53
            java.lang.String r3 = r5.toString()
            if (r3 == 0) goto L53
            r4.getClass()
            int r0 = r3.length()
            if (r0 == 0) goto L53
            X.0lQ6 r1 = r4.hp()
            if (r1 == 0) goto L22
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.setMaxLines(r0)
        L22:
            com.bytedance.tux.input.TuxTextView r0 = r4.up()
            X.C339190DRl.LIZLLL(r0)
            com.ss.android.ugc.aweme.ecommerce.search.searchbar.asr.EcSearchBarAsrHelper r0 = r4.LLLIILIL
            if (r0 == 0) goto L3b
            X.0QdB r1 = r0.LJ
            if (r1 == 0) goto L3b
            java.lang.String r0 = r1.LJIIL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            r0 = r0 ^ 1
            r1.LJIILLIIL = r0
        L3b:
            X.0Q7z r1 = X.C1558520qew.LJIIL(r4)
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarContextAbility> r0 = com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarContextAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r2)
            com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarContextAbility r0 = (com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarContextAbility) r0
            if (r0 == 0) goto L52
            X.0QWp r0 = r0.Hh1()
            if (r0 == 0) goto L52
            r0.i4()
        L52:
            return
        L53:
            X.0lQ6 r1 = r4.hp()
            if (r1 == 0) goto L5d
            r0 = 2
            r1.setMaxLines(r0)
        L5d:
            com.bytedance.tux.input.TuxTextView r0 = r4.up()
            if (r0 == 0) goto L3b
            X.C339190DRl.LIZIZ(r0)
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0R4H.afterTextChanged$3(X.0R4H, android.text.Editable):void");
    }

    public static final void afterTextChanged$4(C0R4H c0r4h, Editable editable) {
        String string;
        EcSearchMiddlePagerContainerFragment ecSearchMiddlePagerContainerFragment = (EcSearchMiddlePagerContainerFragment) c0r4h.l0;
        if (editable != null) {
            string = editable.toString();
        } else {
            string = null;
        }
        ecSearchMiddlePagerContainerFragment.OR(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void afterTextChanged$5(X.C0R4H r3, android.text.Editable r4) {
        /*
            java.lang.Object r3 = r3.l0
            com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ui.EcSearchMiddlePagerContainerFragment r3 = (com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ui.EcSearchMiddlePagerContainerFragment) r3
            r2 = 0
            if (r4 == 0) goto L4f
            java.lang.String r4 = r4.toString()
            if (r4 == 0) goto L4f
            r3.getClass()
            int r0 = r4.length()
            if (r0 == 0) goto L4f
            X.0lQ6 r1 = r3.LLJI
            if (r1 == 0) goto L20
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.setMaxLines(r0)
        L20:
            com.bytedance.tux.input.TuxTextView r0 = r3.LLJJIJI
            X.C339190DRl.LIZLLL(r0)
            com.ss.android.ugc.aweme.ecommerce.search.searchbar.asr.EcSearchBarAsrHelper r0 = r3.LLJJL
            if (r0 == 0) goto L37
            X.0QdB r1 = r0.LJ
            if (r1 == 0) goto L37
            java.lang.String r0 = r1.LJIIL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            r0 = r0 ^ 1
            r1.LJIILLIIL = r0
        L37:
            X.0QWQ r1 = r3.LLJJJJJIL
            if (r1 == 0) goto L43
            androidx.fragment.app.FragmentManager r0 = X.C0QVQ.LIZ(r3)
            androidx.fragment.app.Fragment r2 = r1.LLLJ(r0)
        L43:
            boolean r0 = r2 instanceof X.InterfaceC671770QWp
            if (r0 == 0) goto L4e
            X.0QWp r2 = (X.InterfaceC671770QWp) r2
            if (r2 == 0) goto L4e
            r2.i4()
        L4e:
            return
        L4f:
            X.0lQ6 r1 = r3.LLJI
            if (r1 == 0) goto L57
            r0 = 2
            r1.setMaxLines(r0)
        L57:
            com.bytedance.tux.input.TuxTextView r0 = r3.LLJJIJI
            X.C339190DRl.LIZIZ(r0)
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0R4H.afterTextChanged$5(X.0R4H, android.text.Editable):void");
    }

    public static final void afterTextChanged$6(C0R4H c0r4h, Editable editable) {
        int length;
        C0QLV c0qlv = (C0QLV) c0r4h.l0;
        String string = editable.toString();
        c0qlv.getClass();
        if (TextUtils.isEmpty(string)) {
            c0qlv.LIZJ = true;
            return;
        }
        if (!c0qlv.LIZJ) {
            return;
        }
        if (TextUtils.isEmpty(c0qlv.LIZIZ)) {
            ((ArrayList) c0qlv.LIZ).add(string);
            c0qlv.LIZIZ = string;
            return;
        }
        String str = c0qlv.LIZIZ;
        if (str != null) {
            length = str.length();
        } else {
            length = 0;
        }
        int length2 = string.length();
        if (length == length2) {
            return;
        }
        if (length > length2) {
            c0qlv.LIZJ = false;
            c0qlv.LIZIZ = null;
            ((ArrayList) c0qlv.LIZ).clear();
            return;
        }
        String str2 = c0qlv.LIZIZ;
        if (str2 != null && !u.LJJIIJZLJL(string, str2, false)) {
            c0qlv.LIZJ = false;
            c0qlv.LIZIZ = null;
            ((ArrayList) c0qlv.LIZ).clear();
        } else {
            ((ArrayList) c0qlv.LIZ).add(string.substring(length));
            c0qlv.LIZIZ = string;
        }
    }

    public static final void afterTextChanged$7(C0R4H c0r4h, Editable editable) {
        boolean zLJI = MethodIDManager.LJI(71876);
        ((BaseDiscoverAndSearchFragmentNew) c0r4h.l0).ZS(editable.toString());
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static final void onTextChanged$7(C0R4H c0r4h, CharSequence charSequence, int i, int i2, int i3) {
        if (MethodIDManager.LJI(71726)) {
            MethodIDManager.LJ();
        }
    }
}
