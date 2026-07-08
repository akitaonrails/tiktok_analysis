package X;

import android.graphics.Bitmap;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.TemplateMultiDisplayFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0v5z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1729050v5z {
    public static void LIZ(FragmentManager fragmentManager, Bitmap bitmap, Function0 function0) {
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TemplateMultiDisplayFragment templateMultiDisplayFragment = new TemplateMultiDisplayFragment();
        templateMultiDisplayFragment.LLIZLLLIL = bitmap;
        templateMultiDisplayFragment.LLJ = function0;
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = templateMultiDisplayFragment;
        tuxSheet.LLJLILLLLZIIL = false;
        c1390920mIc.LJIIIIZZ(0);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJIJIIJIL = true;
        tuxSheet2.show(fragmentManager, TemplateMultiDisplayFragment.class.getName());
    }
}
