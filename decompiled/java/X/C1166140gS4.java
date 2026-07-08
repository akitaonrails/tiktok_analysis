package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.address.common.selectitem.SelectItemFragment;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0gS4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1166140gS4 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C1163330gNX c1163330gNX, FragmentManager fragmentManager, Function1 function1) {
        SelectItemFragment selectItemFragment = new SelectItemFragment();
        selectItemFragment.LLILZIL = c1163330gNX;
        selectItemFragment.LLILZLL = function1;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = selectItemFragment;
        tuxSheet.LLILZIL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.show(fragmentManager, "SelectItemFragment");
    }
}
