package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;
import com.ss.android.ugc.gamora.editor.audio.copyrightdetect.base.AudioCopyrightLearnMoreFragment;

/* JADX INFO: renamed from: X.0ZBl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C895590ZBl {
    public static void LIZ(FragmentManager fragmentManager, Context context, PreCheckResult preCheckResult, boolean z, int i, boolean z2) {
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = new AudioCopyrightLearnMoreFragment(context, preCheckResult, z, i, z2);
        c1390920mIc.LJIIIIZZ(1);
        int iLIZIZ = C0JAI.LIZIZ(context);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJL = iLIZIZ;
        tuxSheet.LLJJIJIIJIL = true;
        tuxSheet.LLJLL = true;
        tuxSheet.LLJLILLLLZIIL = true;
        tuxSheet.show(fragmentManager, "showCopyRightLearnMoreDialog");
    }
}
