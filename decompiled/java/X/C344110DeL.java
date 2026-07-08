package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.music.HighlightChooseMusicDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: renamed from: X.0DeL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C344110DeL {
    public static void LIZ(C1834580xqC c1834580xqC, FragmentManager fragmentManager, Map map) {
        HighlightChooseMusicDialogFragment.LLJI.getClass();
        HighlightChooseMusicDialogFragment highlightChooseMusicDialogFragment = new HighlightChooseMusicDialogFragment(c1834580xqC, fragmentManager, map);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = highlightChooseMusicDialogFragment;
        c1390920mIc.LJIIIIZZ(4);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIIJIL = false;
        tuxSheet.LLJLLL = false;
        tuxSheet.LLJLLIL = true;
        tuxSheet.LLILLL = true;
        c1390920mIc.LIZLLL(R.style.y0, false);
        DialogInterfaceOnDismissListenerC346390Di1 dialogInterfaceOnDismissListenerC346390Di1 = new DialogInterfaceOnDismissListenerC346390Di1(null, 5);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLILLJJLI = dialogInterfaceOnDismissListenerC346390Di1;
        tuxSheet2.show(fragmentManager, "HighLightChooseMusicDialogFragment");
    }
}
