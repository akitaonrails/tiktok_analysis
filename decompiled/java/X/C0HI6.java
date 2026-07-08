package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.TextInputSheetFragment;

/* JADX INFO: renamed from: X.0HI6, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HI6 {
    public static Object LIZ(FragmentManager fragmentManager, EnumC441640HTm enumC441640HTm, boolean z, String str, C0H7H c0h7h, String str2, int i, AbstractC23140094w abstractC23140094w, int i2) {
        if ((i2 & 8) != 0) {
            str = null;
        }
        if ((i2 & 16) != 0) {
            c0h7h = null;
        }
        if ((i2 & 32) != 0) {
            str2 = null;
        }
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(abstractC23140094w));
        c2252611DEt.LJIJJ();
        TextInputSheetFragment textInputSheetFragment = new TextInputSheetFragment();
        Bundle bundle = new Bundle();
        if (str != null) {
            C786410Ut5.LJJJI("TextInputSheetFragment_input_textElement", str, bundle);
        }
        if (c0h7h != null) {
            C786410Ut5.LJJIZ(bundle, "TextInputSheetFragment_input_textType", c0h7h);
        }
        if (str2 != null) {
            C786410Ut5.LJJJI("TextInputSheetFragment_input_placeholder", str2, bundle);
        }
        bundle.putInt("TextInputSheetFragment_input_idType", i);
        C786410Ut5.LJJIZ(bundle, "TextInputSheetFragment_input_enterFrom", enumC441640HTm);
        bundle.putBoolean("TextInputSheetFragment_input_isNewUser", z);
        textInputSheetFragment.setArguments(bundle);
        textInputSheetFragment.LL = new C0H7I(c2252611DEt);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = textInputSheetFragment;
        c1390920mIc.LJI(16);
        c1390920mIc.LIZ.LLILZIL = true;
        Integer numLJ = C2286608xc.LJ(0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJI = numLJ;
        tuxSheet.LL = new C0IDQ(textInputSheetFragment, c2252611DEt, 0);
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLJLLL = false;
        tuxSheet.show(fragmentManager, "EmojiPickerSheet");
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(abstractC23140094w);
        }
        return objLJIJ;
    }
}
