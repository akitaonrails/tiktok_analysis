package X;

import android.content.res.Resources;
import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.social.thought.ui.like.SocialThoughtLikePanelFragment;

/* JADX INFO: renamed from: X.0DHk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C336580DHk {
    public static void LIZ(C19EG c19eg, String str, String str2, String str3, boolean z, boolean z2) {
        SocialThoughtLikePanelFragment socialThoughtLikePanelFragment = new SocialThoughtLikePanelFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("thought_id", str, bundle);
        C786410Ut5.LJJJI("enter_from", str2, bundle);
        C786410Ut5.LJJJI("enter_method", str3, bundle);
        bundle.putBoolean("dismiss_parent_author_panel", z);
        bundle.putBoolean("in_aggregate_flow", z2);
        socialThoughtLikePanelFragment.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = socialThoughtLikePanelFragment;
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJL = (int) ((Resources.getSystem().getDisplayMetrics().heightPixels - C497820Jfg.LIZJ(c19eg)) * 0.8f);
        tuxSheet.LLJJIJIL = null;
        tuxSheet.LLJJJ = null;
        tuxSheet.LLJJIJIIJIL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLILLL = true;
        tuxSheet.LLJLLL = true;
        tuxSheet.LLJLLIL = true;
        tuxSheet.show(c19eg.getSupportFragmentManager(), "SocialThoughtLikePanel");
    }
}
