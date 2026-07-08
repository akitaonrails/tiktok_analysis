package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.game.broadcast.fragment.GameDualDeviceWrongFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS58S1000000_7;

/* JADX INFO: renamed from: X.0Ij7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474470Ij7 {
    public static void LIZ(Context context, String str, String str2, String str3, String str4) {
        C19EG c19egLIZ;
        FragmentManager supportFragmentManager;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show wrong page, error_code: ");
        sbLIZ.append(str2);
        sbLIZ.append(", detailErrorCode: ");
        sbLIZ.append(str3);
        C20441214yg.LJ("PhoneAsCameraErrorDialogWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (context != null && (c19egLIZ = C1124140fMK.LIZ(context)) != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
            GameDualDeviceWrongFragment gameDualDeviceWrongFragment = new GameDualDeviceWrongFragment();
            Bundle bundle = new Bundle();
            if (str4 != null) {
                C786410Ut5.LJJJI("error_msg", str4, bundle);
            }
            bundle.putInt("cast_scene_key", 1);
            gameDualDeviceWrongFragment.setArguments(bundle);
            gameDualDeviceWrongFragment.LLIZ = new AwS58S1000000_7(str, 1);
            C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.iiv, gameDualDeviceWrongFragment, null);
            c19ehLJIIJ.LJIIJ();
        }
    }
}
