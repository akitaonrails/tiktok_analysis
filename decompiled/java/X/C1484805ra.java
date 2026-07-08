package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.05ra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1484805ra {
    public static final Fragment LIZ(Context context, C19719912Dl c19719912Dl) {
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        List<Fragment> listLJJLIIIJL;
        Fragment next;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) != null) {
            Iterator<Fragment> it2 = listLJJLIIIJL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (c19719912Dl.LIZIZ(next)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Fragment fragment = next;
            if (fragment != null) {
                return fragment;
            }
        }
        return null;
    }
}
