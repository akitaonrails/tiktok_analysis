package X;

import android.app.Activity;
import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.btm.api.model.BufferBtm;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.android.btm.impl.setting.BugfixModel;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18E8, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18E8 implements Application.ActivityLifecycleCallbacks {
    public static final C18E8 LL = new C18E8();
    public static final Set<InterfaceC21259618Hq> LLILLJJLI = new LinkedHashSet();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public static boolean LIZ(Activity activity) {
        String name = activity.getClass().getName();
        C18IP c18ip = C18IP.LIZ;
        c18ip.getClass();
        return ((CopyOnWriteArraySet) C18IP.LJJIII.getValue(c18ip, C18IP.LIZIZ[22])).contains(name);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (C18CS.LIZ.LIZJ().LJIILLIIL() == 1 && !LIZ(activity)) {
            C21248618Dk.LIZ.getClass();
            if (!Intrinsics.LJFF(((LinkedHashMap) C21248618Dk.LJIJI).get(new C589920NBu(activity)), Boolean.TRUE)) {
                C18DP.LIZJ(activity);
                Iterator<InterfaceC21259618Hq> it2 = LLILLJJLI.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ();
                }
            }
            C18DP.LIZ.remove(activity);
            C21248618Dk.LIZ.getClass();
            C21248618Dk.LJIJI.remove(new C589920NBu(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int iIntValue;
        if (C18CS.LIZ.LIZJ().LJIILLIIL() == 1 && !LIZ(activity)) {
            C21248618Dk.LIZ.getClass();
            if (Intrinsics.LJFF(((LinkedHashMap) C21248618Dk.LJIJI).get(new C589920NBu(activity)), Boolean.TRUE)) {
                return;
            }
            C18DN c18dnLIZJ = C18DP.LIZJ(activity);
            C18CK.LJIIJJI("UnknownActivity_Paused", new C18FM(c18dnLIZJ));
            C18DO.LIZIZ(c18dnLIZJ, c18dnLIZJ.getBufferBtm());
            BugfixModel bugfixModelLIZIZ = C18CS.LIZ.LIZIZ();
            bugfixModelLIZIZ.getClass();
            Object objLIZIZ = C1972007ny.LIZIZ(bugfixModelLIZIZ, "fix_unknown_pre", Integer.valueOf(bugfixModelLIZIZ.fixUnknownPre));
            if (!(objLIZIZ instanceof Integer)) {
                objLIZIZ = null;
            }
            Integer num = (Integer) objLIZIZ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = bugfixModelLIZIZ.fixUnknownPre;
            }
            bugfixModelLIZIZ.fixUnknownPre = iIntValue;
            if (iIntValue == 1) {
                C18E5 c18e5 = C18E5.LIZ;
                BufferBtm bufferBtm = c18dnLIZJ.getBufferBtm();
                c18e5.getClass();
                if (bufferBtm != null) {
                    C18E5.LIZLLL = bufferBtm;
                    c18e5.getClass();
                    C21246118Cl.LIZJ.LIZLLL(bufferBtm.toString(), "key_page_buffer", false);
                }
                C18CK.LJIIIZ("BufferQueue_updateBufferPageBtm", new C21259018Hk(bufferBtm));
            }
            Iterator<InterfaceC21259618Hq> it2 = LLILLJJLI.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        PageInfo pageInfo;
        int iIntValue;
        if (C18CS.LIZ.LIZJ().LJIILLIIL() == 1 && !LIZ(activity)) {
            C21248618Dk.LIZ.getClass();
            if (Intrinsics.LJFF(((LinkedHashMap) C21248618Dk.LJIJI).get(new C589920NBu(activity)), Boolean.TRUE)) {
                return;
            }
            C18DN c18dnLIZ = C18DP.LIZ(activity);
            C21247918Dd c21247918Dd = C18E3.LJII;
            Object obj = null;
            if (c21247918Dd != null) {
                pageInfo = c21247918Dd.LIZIZ;
            } else {
                pageInfo = null;
            }
            C18CK.LJIIJJI("UnknownActivity_PostResumed", new C18FJ(c18dnLIZ, c21247918Dd));
            if (pageInfo != null && !c21247918Dd.LIZLLL) {
                if (c18dnLIZ.getUnionStep() > pageInfo.getUnionStep() && (C18CS.LIZ.LIZIZ().LJIIZILJ() & 1) != 0) {
                    C18DA.LIZ.getClass();
                    C18DA.LJI(pageInfo, false, null, null);
                    pageInfo.resetDataAfterPageShow();
                    c21247918Dd.LIZLLL = true;
                } else if (c18dnLIZ.getUnionStep() < pageInfo.getUnionStep() && (C18CS.LIZ.LIZIZ().LJIIZILJ() & 2) != 0) {
                    C18DA.LIZ.getClass();
                    C18DA.LJI(pageInfo, true, null, null);
                    pageInfo.resetDataAfterPageShow();
                    c21247918Dd.LIZLLL = true;
                }
            }
            BugfixModel bugfixModelLIZIZ = C18CS.LIZ.LIZIZ();
            bugfixModelLIZIZ.getClass();
            Object objLIZIZ = C1972007ny.LIZIZ(bugfixModelLIZIZ, "fix_unknown_pre_2", Integer.valueOf(bugfixModelLIZIZ.fixUnknownPre2));
            if (objLIZIZ instanceof Integer) {
                obj = objLIZIZ;
            }
            Integer num = (Integer) obj;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = bugfixModelLIZIZ.fixUnknownPre2;
            }
            bugfixModelLIZIZ.fixUnknownPre2 = iIntValue;
            if (iIntValue == 1) {
                C18E5 c18e5 = C18E5.LIZ;
                BufferBtm bufferBtm = c18dnLIZ.getBufferBtm();
                c18e5.getClass();
                if (bufferBtm != null) {
                    C18E5.LIZLLL = bufferBtm;
                    c18e5.getClass();
                    C21246118Cl.LIZJ.LIZLLL(bufferBtm.toString(), "key_page_buffer", false);
                }
                C18CK.LJIIIZ("BufferQueue_updateBufferPageBtm", new C21259018Hk(bufferBtm));
            }
        }
    }

    public static void LIZJ(View view, String str) {
        Activity activityLIZIZ;
        View viewPeekDecorView;
        C18CK.LJIIJJI("UnknownActivity_onSchemaLoadSucceed", new C1127004ay(str));
        if (str.length() == 0 || (activityLIZIZ = C789730UyR.LIZIZ(view)) == null || (viewPeekDecorView = activityLIZIZ.getWindow().peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.setTag(R.id.clo, str);
        C18DN c18dnLIZJ = C18DP.LIZJ(activityLIZIZ);
        Uri uri = UriProtector.parse(str);
        String queryParameter = UriProtector.getQueryParameter(uri, "url");
        if (((queryParameter == null || queryParameter.length() == 0) && (queryParameter = UriProtector.getQueryParameter(uri, "surl")) == null) || queryParameter.length() == 0) {
            queryParameter = str;
        }
        if (queryParameter.length() > 0) {
            c18dnLIZJ.setSchema(UriProtector.parse(queryParameter).getPath());
            return;
        }
        int length = str.length() - 1;
        if (300 <= length) {
            length = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        }
        c18dnLIZJ.setSchema(str.substring(0, length));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (C18CS.LIZ.LIZJ().LJIILLIIL() == 1 && !LIZ(activity)) {
            Serializable serializable = null;
            if (bundle != null) {
                serializable = bundle.getSerializable("unknown_page_info");
            }
            if ((serializable instanceof C18DN) && serializable != null) {
                C18DP.LIZ.put(activity, (C18DN) serializable);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (C18CS.LIZ.LIZJ().LJIILLIIL() == 1 && !LIZ(activity)) {
            C21248618Dk.LIZ.getClass();
            if (Intrinsics.LJFF(((LinkedHashMap) C21248618Dk.LJIJI).get(new C589920NBu(activity)), Boolean.TRUE)) {
                return;
            }
            C786410Ut5.LJJIZ(bundle, "unknown_page_info", C18DP.LIZJ(activity));
        }
    }
}
