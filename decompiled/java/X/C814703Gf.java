package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.SizeGuideFragment;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.03Gf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C814703Gf {
    public static void LIZ(FragmentManager fragmentManager, String str, SizeGuide sizeGuide) {
        C993603uY.LIZJ(str, new AwS580S0100000_1(sizeGuide, 246));
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(1);
        c1390920mIc.LIZ.LLJJL = (int) C958103op.LIZIZ();
        SizeGuideFragment sizeGuideFragment = new SizeGuideFragment();
        Bundle bundle = new Bundle();
        C960603pE.LJIIJ(bundle, str);
        sizeGuideFragment.setArguments(bundle);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = sizeGuideFragment;
        tuxSheet.LLJLL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.show(fragmentManager, "size_guide");
    }
}
