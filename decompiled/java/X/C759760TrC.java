package X;

import android.content.DialogInterface;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS126S1100000_12;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0TrC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C759760TrC {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(532));

    public static final void LIZ(int i, C19EG c19eg) {
        final String str;
        int i2;
        if (i != 1) {
            if (i != 2) {
                str = "";
            } else {
                str = "setting_page";
            }
        } else {
            str = "live_recording";
        }
        C770750ULh c770750ULh = new C770750ULh();
        c770750ULh.LIZJ = new AwS586S0100000_7(c19eg, 564);
        c770750ULh.LIZLLL = 2;
        c770750ULh.LJ = C497740JfY.LJIJI(2131855298);
        c770750ULh.LJ(new C1667580tUq(R.raw.icon_playlist_fill, null, C497740JfY.LJIJI(2131855294), C1308910kAL.LIZJ(R.attr.a1k, c19eg)), new C1667580tUq(R.raw.icon_eye_fill, null, C497740JfY.LJIJI(2131855295), C1308910kAL.LIZJ(R.attr.a1k, c19eg)));
        if (i == 1) {
            i2 = 2131855296;
        } else {
            i2 = 2131855297;
        }
        c770750ULh.LJI(C497740JfY.LJIJI(i2), new AwS126S1100000_12(c19eg, str, 13));
        c770750ULh.LJIILLIIL = true;
        c770750ULh.LJIJ = true;
        C1390920mIc c1390920mIcLIZIZ = c770750ULh.LIZIZ();
        DialogInterface.OnCancelListener onCancelListener = new DialogInterface.OnCancelListener() { // from class: X.0TrB
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                String str2 = TuxSheet._pnsPageId;
                if (C1391190mJ3.LJIIJJI(dialogInterface) instanceof C343980De8) {
                    C1833570xoZ c1833570xoZ = C1833570xoZ.LIZ;
                    String str3 = str;
                    c1833570xoZ.getClass();
                    C1833570xoZ.LIZJ(str3, "click", "cancel");
                    return;
                }
                C1833570xoZ c1833570xoZ2 = C1833570xoZ.LIZ;
                String str4 = str;
                c1833570xoZ2.getClass();
                C1833570xoZ.LIZJ(str4, "click", "blank");
            }
        };
        TuxSheet tuxSheet = c1390920mIcLIZIZ.LIZ;
        tuxSheet.LL = onCancelListener;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C759770TrD(i, null), 3);
        C1833570xoZ.LIZ.getClass();
        C1833570xoZ.LIZJ(str, "show", null);
        tuxSheet.show(c19eg.getSupportFragmentManager(), "LiveReplayPlaylistIntroHelper");
    }
}
