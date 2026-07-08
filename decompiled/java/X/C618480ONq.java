package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinCreateFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ONq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C618480ONq {
    public static void LIZ(Context context, Bundle bundle, Function0 function0) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            BulletinCreateFragment bulletinCreateFragment = new BulletinCreateFragment();
            bulletinCreateFragment.setArguments(bundle);
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIJI = bulletinCreateFragment;
            c1390920mIc.LJIIIIZZ(1);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLJLL = true;
            tuxSheet.LLJLLL = false;
            int iLIZ = (int) (((double) C497820Jfg.LIZ(context)) * 0.9d);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJJL = iLIZ;
            tuxSheet2.LLILLJJLI = new C0P4R(bundle, function0, 0);
            tuxSheet2.show(supportFragmentManager, "bulletin_profile_create");
        }
    }
}
