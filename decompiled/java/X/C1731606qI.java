package X;

import Y.ACListenerS70S0300000_2;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.06qI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1731606qI {
    public static final C1731606qI LIZ = new C1731606qI();
    public static WeakReference<Fragment> LIZIZ;

    public static void LIZ(IMUser iMUser, BaseSharePackage baseSharePackage) {
        String string;
        Context contextLJIIL;
        Activity activityLIZ;
        Fragment fragment;
        if (iMUser != null) {
            C1365840leA.LIZ.getClass();
            string = C1365840leA.LIZLLL.getString(2131835475, iMUser.getDisplayName());
        } else {
            C1365840leA.LIZ.getClass();
            string = C1365840leA.LIZLLL.getString(2131822805);
        }
        WeakReference<Fragment> weakReference = LIZIZ;
        if (((weakReference != null && (fragment = weakReference.get()) != null && (contextLJIIL = fragment.getContext()) != null) || (contextLJIIL = C1383370m6R.LJIIL()) != null) && (activityLIZ = C1388190mED.LIZ(contextLJIIL)) != null) {
            C1389910mGz c1389910mGz = new C1389910mGz(activityLIZ);
            c1389910mGz.LJIIJ(string);
            c1389910mGz.LJI(R.style.y0);
            c1389910mGz.LJ(3000L);
            ACListenerS70S0300000_2 aCListenerS70S0300000_2 = new ACListenerS70S0300000_2(contextLJIIL, iMUser, baseSharePackage, 2);
            C1360890lWB c1360890lWB = c1389910mGz.LIZ;
            c1360890lWB.LJIIIIZZ = aCListenerS70S0300000_2;
            c1360890lWB.LIZLLL = 0;
            c1360890lWB.LIZIZ = 0;
            c1389910mGz.LJIIJJI();
        }
    }
}
