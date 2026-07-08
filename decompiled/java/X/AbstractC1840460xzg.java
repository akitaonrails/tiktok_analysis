package X;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAppWidgetService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0xzg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1840460xzg extends C0KZC {
    public abstract String LIZIZ();

    public abstract int LIZJ();

    @Override // android.appwidget.AppWidgetProvider
    public final void onDisabled(Context context) {
        super.onDisabled(context);
        IAppWidgetService iAppWidgetService = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
        if (iAppWidgetService != null) {
            iAppWidgetService.LIZJ("disabled", LIZIZ());
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        int i;
        super.onEnabled(context);
        IAppWidgetService iAppWidgetService = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
        if (iAppWidgetService != null) {
            iAppWidgetService.LIZJ("enable", LIZIZ());
        }
        if (LIZJ() == 11) {
            i = 0;
        } else if (LIZJ() == 12) {
            i = 2;
        } else {
            i = -1;
        }
        C20684815ws.LJIJI("widget_added", new Pair("story", "widget_kind"), new Pair(Integer.valueOf(i), "widget_size"));
        Integer numLJJI = C13LQ.LJJI(AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, getClass())));
        if (numLJJI != null) {
            C1840380xzY c1840380xzY = C1840380xzY.LIZ;
            int iIntValue = numLJJI.intValue();
            c1840380xzY.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onWidgetInstalled widgetID=");
            sbLIZ.append(iIntValue);
            sbLIZ.append(", provider=");
            sbLIZ.append(getClass());
            C2188811AlT.LIZIZ(sbLIZ);
            Set<Integer> set = C1840380xzY.LJII;
            set.add(Integer.valueOf(iIntValue));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("addWidgetID = ");
            sbLIZ2.append(iIntValue);
            sbLIZ2.append(", current = ");
            sbLIZ2.append(C13LP.LJJLIIIJ(set, ",", null, null, 0, null, null, 62));
            C2188811AlT.LIZIZ(sbLIZ2);
            C1840470xzh.LIZ().storeBoolean("keva_key_has_added_story_widget", true);
            Keva keva = (Keva) C1840380xzY.LJ.getValue();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(set, 10));
            Iterator<Integer> it2 = set.iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(it2.next().intValue()));
            }
            keva.storeStringSet("widgetIDsKey", C13LP.LLIIJI(arrayList));
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        super.onDeleted(context, iArr);
        IAppWidgetService iAppWidgetService = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
        if (iAppWidgetService != null) {
            iAppWidgetService.LIZJ("delete", LIZIZ());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDeleted -- ");
        sbLIZ.append(iArr[0]);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUpdate ");
        sbLIZ.append(Arrays.toString(iArr));
        C2188811AlT.LIZIZ(sbLIZ);
        IAppWidgetService iAppWidgetService = (IAppWidgetService) PluggableExtentionKt.pluggableSpi$default(IAppWidgetService.class, false, false, false, 14, null);
        if (iAppWidgetService != null) {
            iAppWidgetService.LIZJ("update", LIZIZ());
        }
        C1840380xzY.LIZ.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onWidgetUpdate ");
        sbLIZ2.append(Arrays.toString(iArr));
        sbLIZ2.append(", force to update");
        C2188811AlT.LIZIZ(sbLIZ2);
        List<Integer> listLJJLJ = C13LQ.LJJLJ(iArr);
        ArrayList arrayList = new ArrayList();
        for (Integer num : listLJJLJ) {
            if (!C1840380xzY.LJII.contains(Integer.valueOf(num.intValue()))) {
                arrayList.add(num);
            }
        }
        C1840380xzY.LIZJ(context, new ArrayList(arrayList));
    }
}
