package X;

import Y.ACListenerS149S0100000_14;
import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0ZDJ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZDJ {
    public static final C0ZDJ LIZ = new C0ZDJ();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(4));

    public static String LIZ(C0ZD9 c0zd9) {
        String refVideoId;
        BaseContent.ReferenceVideo referenceVideo;
        Serializable serializable = c0zd9.LJ;
        if (!(serializable instanceof BaseContent.ReferenceVideo) || (referenceVideo = (BaseContent.ReferenceVideo) serializable) == null || (refVideoId = referenceVideo.getRefVideoId()) == null) {
            refVideoId = "";
        }
        EnumC896030ZDd enumC896030ZDd = c0zd9.LIZIZ;
        String str = c0zd9.LJFF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC896030ZDd);
        sbLIZ.append('_');
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(refVideoId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ(C869590Y9l c869590Y9l) {
        String strLJIIJ;
        long jLJII = C0YNP.LJII(c869590Y9l.getConversationId());
        IMContactApi.LIZ.getClass();
        C1BGS c1bgsLJ = C069P.LIZ().LJ();
        String strValueOf = String.valueOf(jLJII);
        IIMContactUtilService.LIZ.getClass();
        IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
        String displayName = null;
        if (iIMContactUtilServiceLIZ != null) {
            strLJIIJ = iIMContactUtilServiceLIZ.LJIIJ(c869590Y9l.getConversationId());
        } else {
            strLJIIJ = null;
        }
        IMUser iMUserLIZLLL = c1bgsLJ.LIZLLL(strValueOf, strLJIIJ, "im_nudge_streak");
        if (iMUserLIZLLL != null) {
            displayName = iMUserLIZLLL.getDisplayName();
        }
        return C454780HsS.LIZ(displayName);
    }

    public static String LIZJ(int i) {
        Activity currentActivity;
        String string;
        try {
            currentActivity = C2213981Bky.LIZIZ.getCurrentActivity();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            currentActivity = null;
        }
        if (currentActivity == null || (string = currentActivity.getString(i)) == null) {
            return "";
        }
        return string;
    }

    public static String LIZLLL(int i, String... strArr) {
        Activity currentActivity;
        String string;
        try {
            currentActivity = C2213981Bky.LIZIZ.getCurrentActivity();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            currentActivity = null;
        }
        if (currentActivity == null || (string = currentActivity.getString(i, Arrays.copyOf(strArr, strArr.length))) == null) {
            return "";
        }
        return string;
    }

    public static void LJ(C0ZDM c0zdm, boolean z, EnumC896030ZDd enumC896030ZDd) {
        String strLIZLLL;
        int i;
        int iLIZIZ;
        C1389910mGz c1389910mGz;
        Fragment fragmentLJJJJZI;
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        View decorView;
        if (enumC896030ZDd == EnumC896030ZDd.IN_APP_PUSH && !z) {
            return;
        }
        String str = c0zdm.LIZ;
        EnumC896030ZDd enumC896030ZDd2 = EnumC896030ZDd.RECOMMEND_PANEL;
        if (enumC896030ZDd == enumC896030ZDd2) {
            strLIZLLL = LIZLLL(2131846355, str);
        } else if (z) {
            strLIZLLL = LIZLLL(2131831724, str);
        } else {
            strLIZLLL = LIZLLL(2131830862, str);
        }
        Activity currentActivity = C2213981Bky.LIZIZ.getCurrentActivity();
        if (currentActivity != null) {
            Window window = currentActivity.getWindow();
            if (window != null && (decorView = window.getDecorView()) != null) {
                Rect rect = new Rect();
                decorView.getGlobalVisibleRect(rect);
                int i2 = rect.bottom;
                View viewFindViewById = decorView.findViewById(R.id.content);
                if (viewFindViewById != null) {
                    viewFindViewById.getGlobalVisibleRect(rect);
                }
                i = i2 - rect.bottom;
            } else {
                i = 0;
            }
            int i3 = C0ZDQ.LIZJ[enumC896030ZDd.ordinal()];
            if (i3 != 1 && i3 != 2) {
                if (i3 != 3) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46));
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(61));
                }
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(19));
            }
            int i4 = i + iLIZIZ;
            if (enumC896030ZDd == enumC896030ZDd2) {
                View rootView = null;
                if ((currentActivity instanceof C19EG) && (c19eg = (C19EG) currentActivity) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
                    fragmentLJJJJZI = supportFragmentManager.LJJJJZI("UpvotePanel");
                } else {
                    fragmentLJJJJZI = null;
                }
                if ((fragmentLJJJJZI instanceof DialogFragment) && fragmentLJJJJZI != null) {
                    c1389910mGz = new C1389910mGz(fragmentLJJJJZI);
                    View view = fragmentLJJJJZI.getView();
                    if (view != null) {
                        rootView = view.getRootView();
                    }
                    c1389910mGz.LIZ.LJIIIZ = rootView;
                } else {
                    c1389910mGz = new C1389910mGz(currentActivity);
                }
            } else {
                c1389910mGz = new C1389910mGz(currentActivity);
            }
            c1389910mGz.LJI(com.zhiliaoapp.musically.R.style.y0);
            C1360890lWB c1360890lWB = c1389910mGz.LIZ;
            c1360890lWB.LIZLLL = 0;
            c1360890lWB.LIZIZ = 0;
            c1389910mGz.LJIIJ(strLIZLLL);
            c1389910mGz.LJ(3000L);
            c1389910mGz.LIZIZ(i4);
            c1389910mGz.LIZ.LJIIIIZZ = new ACListenerS149S0100000_14(c0zdm, 2);
            c1389910mGz.LJIIJJI();
        }
    }
}
