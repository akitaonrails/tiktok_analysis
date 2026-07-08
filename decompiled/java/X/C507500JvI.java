package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.SchemaActivityBlackListSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0JvI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507500JvI {
    public static final /* synthetic */ int LIZ = 0;

    public static WeakReference LIZIZ() {
        return LIZ(C13BV.INSTANCE);
    }

    public static WeakReference LIZ(List list) {
        String simpleName;
        String simpleName2;
        Activity activityLIZ;
        Activity activityLIZ2;
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        Context topContext = iHostAction.getTopContext();
        Context previousPageContext = iHostAction.getPreviousPageContext();
        String[] value = SchemaActivityBlackListSetting.INSTANCE.getValue();
        int length = value.length;
        Object[] objArrCopyOf = Arrays.copyOf(value, list.size() + length);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArrCopyOf[length] = it2.next();
            length++;
        }
        if (topContext != null && (activityLIZ2 = C1388190mED.LIZ(topContext)) != null) {
            simpleName = activityLIZ2.getClass().getSimpleName();
        } else {
            simpleName = null;
        }
        if (C13LQ.LJJIJIIJI(simpleName, objArrCopyOf) >= 0) {
            if (previousPageContext != null && (activityLIZ = C1388190mED.LIZ(previousPageContext)) != null) {
                simpleName2 = activityLIZ.getClass().getSimpleName();
            } else {
                simpleName2 = null;
            }
            if (C13LQ.LJJIJIIJI(simpleName2, objArrCopyOf) >= 0) {
                topContext = null;
            } else {
                topContext = previousPageContext;
            }
        }
        return new WeakReference(topContext);
    }

    public static FragmentManager LIZJ(Context context) {
        C19EG c19egLIZIZ;
        FragmentManager fragmentManagerLJ;
        C19EG c19egLIZIZ2;
        if (!C504210Jpz.LIZ && !C464660IKa.LIZ()) {
            if (context != null && (c19egLIZIZ2 = C1388190mED.LIZIZ(context)) != null) {
                return c19egLIZIZ2.getSupportFragmentManager();
            }
            return null;
        }
        AbstractC1387200mCc abstractC1387200mCcLJ = C520010KaN.LJ(context);
        if (abstractC1387200mCcLJ != null && (fragmentManagerLJ = abstractC1387200mCcLJ.LJ()) != null) {
            return fragmentManagerLJ;
        }
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            return c19egLIZIZ.getSupportFragmentManager();
        }
        return null;
    }
}
