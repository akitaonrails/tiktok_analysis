package X;

import Y.ACListenerS80S0300000_14;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0DgD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345270DgD {
    public static final C345270DgD LIZ = new C345270DgD();

    public static void LIZIZ(Fragment fragment, C1365870leD c1365870leD, Integer num) {
        View view;
        C1389910mGz c1389910mGzLIZ;
        Context context = fragment.getContext();
        if (context != null && (view = fragment.getView()) != null && (c1389910mGzLIZ = LIZ(new C1389910mGz(fragment), view, context, c1365870leD, num)) != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C0CSS(c1389910mGzLIZ, null), 3);
        }
    }

    public static C1389910mGz LIZ(C1389910mGz c1389910mGz, View view, Context context, C1365870leD c1365870leD, Integer num) {
        BaseContact baseContact;
        String string;
        int i;
        Window window;
        View decorView;
        if (c1365870leD.LJIIIIZZ) {
            return null;
        }
        List<IMContact> list = c1365870leD.LIZIZ;
        if (list == null || (baseContact = (BaseContact) C13LP.LJJJLL(list)) == null) {
            baseContact = c1365870leD.LIZ;
        }
        if (c1365870leD.LJIIIIZZ) {
            string = context.getString(2131832049);
        } else if (c1365870leD.LIZJ) {
            string = context.getString(2131835476, baseContact.getDisplayName());
        } else if (c1365870leD.LJII) {
            string = context.getString(2131835378);
        } else {
            string = context.getString(2131835475, baseContact.getDisplayName());
        }
        if (string.length() == 0) {
            return null;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_paperplane_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c1389910mGz.LJIIL(c419910GdJ);
        c1389910mGz.LJIIJ(string);
        c1389910mGz.LJ(3000L);
        c1389910mGz.LJI(R.style.y0);
        C1360890lWB c1360890lWB = c1389910mGz.LIZ;
        c1360890lWB.LIZIZ = 0;
        c1360890lWB.LJIIIIZZ = new ACListenerS80S0300000_14(c1365870leD, context, c1389910mGz, 0);
        if (c1365870leD.LJ == "personal_homepage") {
            Fragment fragmentLIZ = C946803n0.LIZ(view);
            if (fragmentLIZ != null) {
                LIZ.getClass();
                C19EG activity = fragmentLIZ.getActivity();
                if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                    Rect rect = new Rect();
                    decorView.getGlobalVisibleRect(rect);
                    int i2 = rect.bottom;
                    decorView.findViewById(android.R.id.content).getGlobalVisibleRect(rect);
                    i = i2 - rect.bottom;
                } else {
                    i = 0;
                }
                c1389910mGz.LIZIZ(Math.max(i, 0) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C14LC.LJIILIIL))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            }
        } else if (num != null) {
            c1389910mGz.LIZIZ(num.intValue());
            return c1389910mGz;
        }
        return c1389910mGz;
    }
}
