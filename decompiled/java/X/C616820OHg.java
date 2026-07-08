package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinSelectEmojiSheetFragment;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEmojiAbility;

/* JADX INFO: renamed from: X.0OHg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C616820OHg {
    public static void LIZ(Context context, FragmentManager fragmentManager, Bundle bundle, final BulletinEmojiAbility bulletinEmojiAbility) {
        if (fragmentManager == null) {
            return;
        }
        BulletinSelectEmojiSheetFragment bulletinSelectEmojiSheetFragment = new BulletinSelectEmojiSheetFragment();
        bulletinSelectEmojiSheetFragment.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = bulletinSelectEmojiSheetFragment;
        tuxSheet.LLJLL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        c1390920mIc.LJIIIIZZ(1);
        int iLJIIIIZZ = (int) (((double) C12ES.LJIIIIZZ(context)) * 0.7d);
        final TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJL = iLJIIIIZZ;
        bulletinSelectEmojiSheetFragment.LLIZLLLIL = new InterfaceC616810OHf() { // from class: X.0OHh
            @Override // X.InterfaceC616810OHf
            public final void u3() {
                tuxSheet2.dismiss();
            }

            @Override // X.InterfaceC616810OHf
            public final void y6(String str, C0OSZ c0osz) {
                BulletinEmojiAbility bulletinEmojiAbility2 = bulletinEmojiAbility;
                if (bulletinEmojiAbility2 != null) {
                    bulletinEmojiAbility2.if2(str, "click_half_screen_emoji", c0osz);
                }
            }
        };
        tuxSheet2.show(fragmentManager, "BulletinSelectEmojiSheetFragment");
    }
}
