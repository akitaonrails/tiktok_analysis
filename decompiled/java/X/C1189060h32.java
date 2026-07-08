package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0h32, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1189060h32 {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C20591084v());

    public static final String LJJIJ(boolean z) {
        return z ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    public static final Fragment LJIIJ(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner instanceof Fragment) {
            return (Fragment) lifecycleOwner;
        }
        if (lifecycleOwner instanceof UIAssem) {
            return LJIIJ(((AbstractC738140SxQ) lifecycleOwner).getParent());
        }
        if (lifecycleOwner instanceof ReusedAssem) {
            return LJIIJ(((AbstractC738140SxQ) lifecycleOwner).getParent());
        }
        if (lifecycleOwner instanceof PowerCell) {
            return LJIIJ(((PowerCell) lifecycleOwner).getParent());
        }
        return null;
    }

    public static final boolean LJIILIIL(Fragment fragment) {
        if (fragment.isResumed() && fragment.isVisible() && fragment.getUserVisibleHint()) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILJJIL(Boolean bool) {
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            return true;
        }
        return false;
    }

    public static final String LJIILL(String str) {
        String curUserId = C0XQ7.LJFF().getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(curUserId);
        sbLIZ.append('_');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final boolean LJIIZILJ(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final void LJIJ(Runnable runnable) {
        C786410Ut5.LJJZZIII((Handler) LIZ.getValue(), runnable);
    }

    public static final String LJJIIJZLJL(Map<String, String> map) {
        Object c098200Yq;
        try {
            c098200Yq = new JSONObject(C7740030o.LIZ().getGson().LJIILL(map));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return String.valueOf(c098200Yq);
    }

    public static final int LJJIIZ(Boolean bool) {
        return Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0;
    }

    public static final String LJJIIZI(Boolean bool) {
        if (bool != null) {
            if (bool.booleanValue()) {
                return "1";
            }
            return CardStruct.IStatusCode.DEFAULT;
        }
        return null;
    }

    public static final void LIZ(String str, Map map) {
        Object c098200Yq;
        Object objOpt;
        if (str != null) {
            map.put("collect_info", str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (C123100dR.LIZ(next) && (objOpt = jSONObject.opt(next)) != null) {
                        map.put(next, objOpt.toString());
                    }
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
    }

    public static final void LIZIZ(String str, JSONObject jSONObject) throws JSONException {
        Object c098200Yq;
        Object objOpt;
        if (str != null) {
            jSONObject.put("collect_info", str);
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (C123100dR.LIZ(next) && (objOpt = jSONObject2.opt(next)) != null) {
                        jSONObject.put(next, objOpt);
                    }
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
    }

    public static final void LIZJ(C2344009Gk c2344009Gk, String str) {
        Object c098200Yq;
        Object objOpt;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                c2344009Gk.LJFF("collect_info", str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (C123100dR.LIZ(next) && (objOpt = jSONObject.opt(next)) != null) {
                        c2344009Gk.LJFF(next, objOpt.toString());
                    }
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
    }

    public static final void LIZLLL(String str, Map map) {
        Object c098200Yq;
        Object objOpt;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("target");
                sbLIZ.append("_collect_info");
                map.put(C2188811AlT.LIZIZ(sbLIZ), str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (C123100dR.LIZ(next) && (objOpt = jSONObject.opt(next)) != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("target");
                        sbLIZ2.append('_');
                        sbLIZ2.append(next);
                        map.put(C2188811AlT.LIZIZ(sbLIZ2), objOpt.toString());
                    }
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
    }

    public static final void LJ(String str, Map map) {
        Object c098200Yq;
        Object objOpt;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (C123100dR.LIZ(next) && (objOpt = jSONObject.opt(next)) != null) {
                        map.put(next, objOpt.toString());
                    }
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
    }

    public static final void LJFF(String str, Map map) {
        Object c098200Yq;
        Object objOpt;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                map.put("page_collect_info", str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (C123100dR.LIZ(next) && (objOpt = jSONObject.opt(next)) != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("page_");
                        sbLIZ.append(next);
                        map.put(C2188811AlT.LIZIZ(sbLIZ), objOpt.toString());
                    }
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
    }

    public static final void LJI(C2344009Gk c2344009Gk, String str) {
        Object c098200Yq;
        Object objOpt;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                c2344009Gk.LJFF("page_collect_info", str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (C123100dR.LIZ(next) && (objOpt = jSONObject.opt(next)) != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("page_");
                        sbLIZ.append(next);
                        c2344009Gk.LJFF(C2188811AlT.LIZIZ(sbLIZ), objOpt.toString());
                    }
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
    }

    public static final void LJII(String str, Map map) {
        Object c098200Yq;
        Object objOpt;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (C123100dR.LIZ(next) && (objOpt = jSONObject.opt(next)) != null) {
                        map.put(next, objOpt.toString());
                    }
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
    }

    public static final void LJIIIIZZ(C2344009Gk c2344009Gk, String str) {
        Object c098200Yq;
        Object objOpt;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (C123100dR.LIZ(next) && (objOpt = jSONObject.opt(next)) != null) {
                        c2344009Gk.LJFF(next, objOpt.toString());
                    }
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
    }

    public static final String LJIIJJI(String str, String str2) {
        String string = null;
        if (str == null) {
            return null;
        }
        try {
            Object objOpt = new JSONObject(str).opt(str2);
            if (objOpt != null) {
                string = objOpt.toString();
                return string;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return string;
    }

    public static final void LJIIL(AbstractC207072161e abstractC207072161e, Map<String, ? extends Object> map) {
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            abstractC207072161e.LJI(entry.getValue(), entry.getKey());
        }
    }

    public static final Drawable LJIILLIIL(Context context, Drawable drawable) {
        if (C444960Hcc.LIZJ(context)) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            Matrix matrix = new Matrix();
            matrix.setScale(-1.0f, 1.0f);
            return new BitmapDrawable(context.getResources(), Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, false));
        }
        return drawable;
    }

    public static final void LJIJJ(Map map, Map map2) {
        if (map2 != null) {
            map.putAll(map2);
        }
    }

    public static void LJJIIJ(View view, final Function1 function1) {
        final long j = 400;
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0DYR
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (C0OBG.LIZ(j, view2)) {
                    return;
                }
                function1.invoke(view2);
            }
        }, view);
    }

    public static final void LJIIIZ(C2344009Gk c2344009Gk, String str, Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof String) {
            c2344009Gk.LJFF(str, (String) obj);
            return;
        }
        if (obj instanceof Long) {
            c2344009Gk.LIZLLL(((Number) obj).longValue(), str);
            return;
        }
        if (obj instanceof Integer) {
            c2344009Gk.LIZJ(((Number) obj).intValue(), str);
            return;
        }
        if (obj instanceof Double) {
            c2344009Gk.LIZ(((Number) obj).doubleValue(), str);
        } else if (obj instanceof Float) {
            c2344009Gk.LIZIZ(((Number) obj).floatValue(), str);
        } else {
            c2344009Gk.LJ(obj, str);
        }
    }

    public static final void LJIJI(Map map, Object obj, Object obj2) {
        if (obj != null && obj2 != null) {
            map.put(obj, obj2);
        }
    }

    public static final void LJIJJLI(C2344009Gk c2344009Gk, String str, Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof String) {
            c2344009Gk.LJFF(str, (String) obj);
        } else {
            c2344009Gk.LJ(obj, str);
        }
    }

    public static final void LJIL(JSONObject jSONObject, String str, Object obj) {
        if (str != null && obj != null) {
            jSONObject.put(str, obj);
        }
    }

    public static final void LJJ(Object obj, String str, Map map) {
        if (obj != null && C123100dR.LIZ(str)) {
            map.put(obj, str);
        }
    }

    public static final void LJJI(String str, String str2, JSONObject jSONObject) {
        if (str != null && C123100dR.LIZ(str2)) {
            jSONObject.put(str, str2);
        }
    }

    public static final void LJJIFFI(C2344009Gk c2344009Gk, String str, String str2) {
        if (C123100dR.LIZ(str2)) {
            c2344009Gk.LJFF(str, str2);
        }
    }

    public static final void LJJII(View view, Integer num, Integer num2, Integer num3, Integer num4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        boolean z;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            boolean z2 = true;
            if (num != null) {
                int iIntValue = num.intValue();
                if (iIntValue != marginLayoutParams.getMarginStart()) {
                    z = true;
                } else {
                    z = false;
                }
                marginLayoutParams.setMarginStart(iIntValue);
            } else {
                z = false;
            }
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                if (iIntValue2 != marginLayoutParams.topMargin) {
                    z = true;
                } else {
                    z = false;
                }
                marginLayoutParams.topMargin = iIntValue2;
            }
            if (num3 != null) {
                int iIntValue3 = num3.intValue();
                if (iIntValue3 != marginLayoutParams.getMarginEnd()) {
                    z = true;
                } else {
                    z = false;
                }
                marginLayoutParams.setMarginEnd(iIntValue3);
            }
            if (num4 != null) {
                int iIntValue4 = num4.intValue();
                if (iIntValue4 == marginLayoutParams.bottomMargin) {
                    z2 = false;
                }
                marginLayoutParams.bottomMargin = iIntValue4;
                z = z2;
            }
            if (z) {
                view.requestLayout();
            }
        }
    }
}
