package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.services.uikit.CreativeToast;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mHi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1390360mHi implements CreativeToast {
    public static long LJIIIIZZ;
    public static final Map<String, Long> LJIIIZ = new LinkedHashMap();
    public final C1389890mGx LIZ;
    public final C1389880mGw LIZIZ;
    public C1390400mHm LIZJ;
    public final Context LIZLLL;
    public final Context LJ;
    public final boolean LJFF;
    public final String LJI;
    public final long LJII;

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeToast
    public final void dismiss() {
        C1389880mGw c1389880mGw = this.LIZIZ;
        if (c1389880mGw != null) {
            c1389880mGw.LIZIZ();
        }
        C1389890mGx c1389890mGx = this.LIZ;
        if (c1389890mGx != null) {
            c1389890mGx.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeToast
    public final Object originalToast() {
        C1389890mGx c1389890mGx = this.LIZ;
        return c1389890mGx == null ? this.LIZIZ : c1389890mGx;
    }

    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeToast
    public final void show() {
        if (LJIIIIZZ + 600000 <= System.currentTimeMillis()) {
            LJIIIIZZ = System.currentTimeMillis();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map<String, Long> map = LJIIIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                if (((Number) entry.getValue()).longValue() + 30000 < jCurrentTimeMillis) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList.add(((Map.Entry) it2.next()).getKey());
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                LJIIIZ.remove(it3.next());
            }
        }
        if (this.LJFF) {
            Map<String, Long> map2 = LJIIIZ;
            if (map2.containsKey(this.LJI)) {
                Long l = (Long) ((LinkedHashMap) map2).get(this.LJI);
                if (System.currentTimeMillis() < (l != null ? l.longValue() : 0L)) {
                    return;
                } else {
                    map2.put(this.LJI, Long.valueOf(System.currentTimeMillis() + this.LJII));
                }
            } else {
                map2.put(this.LJI, Long.valueOf(System.currentTimeMillis() + this.LJII));
            }
        }
        C1389880mGw c1389880mGw = this.LIZIZ;
        if (c1389880mGw != null) {
            c1389880mGw.LJIIJ();
        }
        C1389890mGx c1389890mGx = this.LIZ;
        if (c1389890mGx != null) {
            c1389890mGx.LJIIJJI();
        }
        C1390400mHm c1390400mHm = this.LIZJ;
        if (c1390400mHm != null) {
            c1390400mHm.onShow(this);
        }
    }

    public C1390360mHi(Object obj, CreativeToastBuilder creativeToastBuilder) {
        Context context;
        Integer num;
        this.LJI = "";
        this.LJII = 3000L;
        boolean zIsCenterToast = creativeToastBuilder.getConfig().isCenterToast();
        if (obj instanceof View) {
            View view = (View) obj;
            this.LIZLLL = view.getContext();
            if (zIsCenterToast) {
                this.LIZIZ = new C1389880mGw(view);
            } else {
                this.LIZ = new C1389890mGx(view);
            }
        } else if (obj instanceof Activity) {
            this.LIZLLL = (Context) obj;
            if (zIsCenterToast) {
                this.LIZIZ = new C1389880mGw((Activity) obj);
            } else {
                this.LIZ = new C1389890mGx((Activity) obj);
            }
        } else if (obj instanceof Dialog) {
            Dialog dialog = (Dialog) obj;
            this.LIZLLL = dialog.getContext();
            if (zIsCenterToast) {
                this.LIZIZ = new C1389880mGw(dialog);
            } else {
                this.LIZ = new C1389890mGx(dialog);
            }
        } else if (obj instanceof Fragment) {
            Fragment fragment = (Fragment) obj;
            this.LIZLLL = fragment.getContext();
            if (zIsCenterToast) {
                this.LIZIZ = new C1389880mGw(fragment);
            } else {
                this.LIZ = new C1389890mGx(fragment);
            }
        } else if (obj instanceof PopupWindow) {
            PopupWindow popupWindow = (PopupWindow) obj;
            View contentView = popupWindow.getContentView();
            if (contentView != null) {
                context = contentView.getContext();
            } else {
                context = null;
            }
            this.LIZLLL = context;
            if (zIsCenterToast) {
                this.LIZIZ = new C1389880mGw(popupWindow);
            } else {
                this.LIZ = new C1389890mGx(popupWindow);
            }
        }
        this.LJI = creativeToastBuilder.getConfig().toString();
        this.LJFF = creativeToastBuilder.getConfig().blockContinuousToast;
        Long l = creativeToastBuilder.getConfig().duration;
        if (l != null) {
            this.LJII = l.longValue();
        }
        C1389890mGx c1389890mGx = this.LIZ;
        if (c1389890mGx != null) {
            Long l2 = creativeToastBuilder.getConfig().duration;
            if (l2 != null) {
                c1389890mGx.LIZLLL(l2.longValue());
            }
            String str = creativeToastBuilder.getConfig().message;
            if (str != null) {
                c1389890mGx.LJIIJ(str);
            }
            Integer num2 = creativeToastBuilder.getConfig().messageRes;
            if (num2 != null) {
                c1389890mGx.LJIIIZ(num2.intValue());
            }
            Integer num3 = creativeToastBuilder.getConfig().icon;
            if (num3 != null) {
                c1389890mGx.LJFF(num3.intValue());
            }
            Integer num4 = creativeToastBuilder.getConfig().iconColor;
            if (num4 != null) {
                c1389890mGx.LJI(num4.intValue());
            }
            Integer num5 = creativeToastBuilder.getConfig().iconColorRes;
            if (num5 != null) {
                c1389890mGx.LJII(num5.intValue());
            }
            Boolean bool = creativeToastBuilder.getConfig().acrossActivities;
            if (bool != null) {
                c1389890mGx.LIZ(bool.booleanValue());
            }
            Boolean bool2 = creativeToastBuilder.getConfig().hasDismissAnimation;
            if (bool2 != null) {
                c1389890mGx.LIZ.LIZ.LJI = bool2.booleanValue();
            }
            if (creativeToastBuilder.getConfig().themeRes != null && this.LIZLLL != null && (num = creativeToastBuilder.getConfig().themeRes) != null) {
                this.LJ = new ContextThemeWrapper(this.LIZLLL, num.intValue());
            }
            if (!((Boolean) C268540Afk.LIZ.getValue()).booleanValue() && Intrinsics.LJFF(creativeToastBuilder.getConfig().acrossActivities, Boolean.TRUE)) {
                c1389890mGx.LIZ.LIZ.LJI = false;
            }
        }
        C1389880mGw c1389880mGw = this.LIZIZ;
        if (c1389880mGw != null) {
            Long l3 = creativeToastBuilder.getConfig().duration;
            if (l3 != null) {
                c1389880mGw.LIZLLL(l3.longValue());
            }
            String str2 = creativeToastBuilder.getConfig().message;
            if (str2 != null) {
                c1389880mGw.LJIIIZ(str2);
            }
            Integer num6 = creativeToastBuilder.getConfig().messageRes;
            if (num6 != null) {
                c1389880mGw.LJIIIIZZ(num6.intValue());
            }
            Integer num7 = creativeToastBuilder.getConfig().icon;
            if (num7 != null) {
                c1389880mGw.LJ(num7.intValue());
            }
            Integer num8 = creativeToastBuilder.getConfig().iconColor;
            if (num8 != null) {
                c1389880mGw.LJFF(num8.intValue());
            }
            Integer num9 = creativeToastBuilder.getConfig().iconColorRes;
            if (num9 != null) {
                c1389880mGw.LJI(num9.intValue());
            }
            Boolean bool3 = creativeToastBuilder.getConfig().acrossActivities;
            if (bool3 != null) {
                c1389880mGw.LIZ(bool3.booleanValue());
            }
            Boolean bool4 = creativeToastBuilder.getConfig().hasDismissAnimation;
            if (bool4 != null) {
                c1389880mGw.LIZ.LIZ.LJI = bool4.booleanValue();
            }
        }
    }
}
