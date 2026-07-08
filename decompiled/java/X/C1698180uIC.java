package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uIC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698180uIC implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void beforeTextChanged$0(C1698180uIC c1698180uIC, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C1698180uIC c1698180uIC, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(C1698180uIC c1698180uIC, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$3(C1698180uIC c1698180uIC, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$4(C1698180uIC c1698180uIC, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(C1698180uIC c1698180uIC, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$1(C1698180uIC c1698180uIC, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$2(C1698180uIC c1698180uIC, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$3(C1698180uIC c1698180uIC, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$4(C1698180uIC c1698180uIC, CharSequence charSequence, int i, int i2, int i3) {
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
        }
    }

    public C1698180uIC(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$0(C1698180uIC c1698180uIC, Editable editable) {
        ((C1641900spQ) c1698180uIC.l0).LLJJIJIL.onNext(editable.toString());
        C1ER1.LIZIZ.LJJIIJZLJL().LJJI(editable.toString());
    }

    public static final void afterTextChanged$1(C1698180uIC c1698180uIC, Editable editable) {
        String string;
        C1643710ssL c1643710ssL = (C1643710ssL) c1698180uIC.l0;
        View view = null;
        if (editable != null) {
            string = editable.toString();
        } else {
            string = null;
        }
        View view2 = c1643710ssL.LJIIJJI;
        if (view2 != null) {
            view = view2;
        }
        int i = 0;
        if (string == null || string.length() == 0) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
        C11RK<String> c11rk = c1643710ssL.LJIILJJIL;
        if (string == null) {
            string = "";
        }
        c11rk.onNext(string);
    }

    public static final void afterTextChanged$2(C1698180uIC c1698180uIC, Editable editable) {
        String string;
        C1643750ssP c1643750ssP = (C1643750ssP) c1698180uIC.l0;
        if (editable != null) {
            string = editable.toString();
        } else {
            string = null;
        }
        C11RK<String> c11rk = c1643750ssP.LJIIL;
        if (string == null) {
            string = "";
        }
        c11rk.onNext(string);
    }

    public static final void afterTextChanged$3(C1698180uIC c1698180uIC, Editable editable) {
        int i;
        String string;
        SearchStickerViewContainer searchStickerViewContainer = (SearchStickerViewContainer) c1698180uIC.l0;
        View view = searchStickerViewContainer.LLJIJIL;
        LinearLayout linearLayout = null;
        if (view == null) {
            view = null;
        }
        if (TextUtils.isEmpty(String.valueOf(editable))) {
            i = 8;
        } else {
            i = 0;
        }
        C786410Ut5.LJLLLLLL(i, view);
        if (editable == null || (string = editable.toString()) == null) {
            string = "";
        }
        searchStickerViewContainer.LLJLLL = string;
        if (string.length() == 0) {
            C1636150sg9 c1636150sg9 = searchStickerViewContainer.LLJJIJIIJIL;
            if (c1636150sg9 == null) {
                c1636150sg9 = null;
            }
            Enum state = c1636150sg9.getState();
            EnumC1641470soj enumC1641470soj = EnumC1641470soj.NONE;
            if (state != enumC1641470soj) {
                C1636150sg9 c1636150sg92 = searchStickerViewContainer.LLJJIJIIJIL;
                if (c1636150sg92 == null) {
                    c1636150sg92 = null;
                }
                c1636150sg92.setState((Enum) enumC1641470soj);
                LinearLayout linearLayout2 = searchStickerViewContainer.LLJJIII;
                if (linearLayout2 != null) {
                    linearLayout = linearLayout2;
                }
                C786410Ut5.LJZL(0, linearLayout);
            }
            searchStickerViewContainer.LJIIIIZZ(true);
            return;
        }
        if (Intrinsics.LJFF(string, searchStickerViewContainer.LLILZ.getKeyword().getValue())) {
            return;
        }
        searchStickerViewContainer.LJII(false);
    }

    public static final void afterTextChanged$4(C1698180uIC c1698180uIC, Editable editable) {
        ((Function1) c1698180uIC.l0).invoke(editable);
    }
}
