package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.android.material.bottomsheet.BBFixViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinPollVoteDetailSheetFragment;
import com.ss.android.ugc.aweme.inbox.bulletin.TuxBBFixViewPagerSheetBehavior;

/* JADX INFO: renamed from: X.0ORR, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0ORR {
    public static void LIZ(Context context, FragmentManager fragmentManager, Bundle bundle, C0OJU c0oju, C618680OOk c618680OOk) {
        if (context == null || fragmentManager == null || bundle == null) {
            return;
        }
        BulletinPollVoteDetailSheetFragment bulletinPollVoteDetailSheetFragment = new BulletinPollVoteDetailSheetFragment();
        bulletinPollVoteDetailSheetFragment.setArguments(bundle);
        bulletinPollVoteDetailSheetFragment.LLIZ = c0oju;
        bulletinPollVoteDetailSheetFragment.LLIZLLLIL = c618680OOk;
        float fLJIIIIZZ = (C12ES.LJIIIIZZ(context) + C12ES.LJIIJJI(context)) * 0.6f;
        float f = 478;
        if (fLJIIIIZZ < C339190DRl.LIZ(f)) {
            fLJIIIIZZ = C339190DRl.LIZ(f);
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = bulletinPollVoteDetailSheetFragment;
        tuxSheet.LLJLL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        c1390920mIc.LJIIIIZZ(1);
        c1390920mIc.LIZ.LLJJL = (int) fLJIIIIZZ;
        if (C299110Bnx.LIZ()) {
            c1390920mIc.LIZ.LLLIIIIL = new TuxBBFixViewPagerSheetBehavior();
        } else {
            c1390920mIc.LIZ.LLLIIII = new BBFixViewPagerBottomSheetBehavior();
        }
        c1390920mIc.LIZ.show(fragmentManager, "BulletinPollVoteDetailSheetFragment");
    }
}
