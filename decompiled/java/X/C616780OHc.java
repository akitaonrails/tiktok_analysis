package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinEmojiDetailSheetFragment;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEmojiAbility;

/* JADX INFO: renamed from: X.0OHc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C616780OHc {
    public static void LIZ(Context context, FragmentManager fragmentManager, Bundle bundle, BulletinEmojiAbility bulletinEmojiAbility, boolean z) {
        if (fragmentManager == null) {
            return;
        }
        BulletinEmojiDetailSheetFragment bulletinEmojiDetailSheetFragment = new BulletinEmojiDetailSheetFragment();
        bulletinEmojiDetailSheetFragment.LLIZLLLIL = new C616790OHd(bulletinEmojiAbility);
        bulletinEmojiDetailSheetFragment.setArguments(bundle);
        int iLJIIIIZZ = C12ES.LJIIIIZZ(context);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = bulletinEmojiDetailSheetFragment;
        tuxSheet.LLJLL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        if (z) {
            c1390920mIc.LJIIIIZZ(0);
        } else {
            c1390920mIc.LJIIIIZZ(2);
            int i = (int) (((double) iLJIIIIZZ) * 0.9d);
            c1390920mIc.LIZIZ(i, i);
        }
        c1390920mIc.LIZ.show(fragmentManager, "BulletinEmojiDetailSheetFragment");
    }
}
