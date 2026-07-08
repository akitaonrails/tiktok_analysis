package X;

import Y.ARunnableS107S0100000_7;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubPrivilegeDetailFullPage;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0K51, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K51 {
    public static final C01GW LIZ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS193S0000000_7.get$arr$(277));

    public static final C19EG LIZ(Context context) {
        C19EG c19egLIZIZ = LIZIZ(context);
        if (c19egLIZIZ == null) {
            Activity activityLJFF = C2214201BlK.LJFF();
            if (activityLJFF instanceof C19EG) {
                return (C19EG) activityLJFF;
            }
            return null;
        }
        return c19egLIZIZ;
    }

    public static final C19EG LIZIZ(Context context) {
        if (context instanceof C19EG) {
            return (C19EG) context;
        }
        if (context instanceof ContextWrapper) {
            return LIZIZ(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static final void LIZJ(SubPrivilegeDetailFullPage subPrivilegeDetailFullPage) {
        C19EG activity = null;
        if (subPrivilegeDetailFullPage != null) {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C520040KaQ.LIZIZ(subPrivilegeDetailFullPage);
            if (abstractC1387200mCcLIZIZ != null) {
                abstractC1387200mCcLIZIZ.LIZ();
                return;
            } else if (subPrivilegeDetailFullPage != null) {
                activity = subPrivilegeDetailFullPage.getActivity();
            }
        }
        if (!(activity instanceof Activity) || activity == null) {
            return;
        }
        activity.finish();
    }

    public static final LayoutInflater LIZLLL(Context context) {
        if (context != null) {
            return C786410Ut5.ne(context);
        }
        return null;
    }

    public static final boolean LJ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof CharSequence) {
            if (((CharSequence) obj).length() <= 0) {
                return false;
            }
        } else if (obj instanceof Collection) {
            if (((Collection) obj).isEmpty()) {
                return false;
            }
        } else if (obj instanceof Map) {
            if (((Map) obj).isEmpty()) {
                return false;
            }
        } else if ((obj instanceof Object[]) && ((Object[]) obj).length == 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(Boolean bool) {
        return !Intrinsics.LJFF(bool, Boolean.TRUE);
    }

    public static final boolean LJI(Boolean bool) {
        return Intrinsics.LJFF(bool, Boolean.TRUE);
    }

    public static final boolean LJII(Context context) {
        Activity activityLIZIZ = LIZIZ(context);
        if (activityLIZIZ == null) {
            activityLIZIZ = C2214201BlK.LJFF();
            if (!(activityLIZIZ instanceof C19EG) || activityLIZIZ == null) {
                return false;
            }
        }
        if (!activityLIZIZ.isFinishing() && !activityLIZIZ.isDestroyed()) {
            return true;
        }
        return false;
    }

    public static final void LJIIJJI(Function0<Unit> function0) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII((Handler) LIZ.getValue(), new ARunnableS107S0100000_7((Function0) function0, 194));
        }
    }

    public static final Long LJIIL(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Long lValueOf = null;
        if (z) {
            return null;
        }
        try {
            lValueOf = Long.valueOf(CastLongProtector.parseLong(str));
            return lValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return lValueOf;
        }
    }

    public static final int LJIILIIL(Boolean bool) {
        return Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0;
    }

    public static final Map<String, String> LJIILJJIL(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject = new JSONObject();
        }
        Iterator<String> itKeys = jSONObject.keys();
        HashMap map = new HashMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next);
            itKeys.remove();
            map.put(next, strOptString);
        }
        return map;
    }

    public static final Map<String, String> LJIILL(Map<String, ? extends Object> map) {
        String string;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || (string = value.toString()) == null) {
                string = "";
            }
            linkedHashMap.put(key, string);
        }
        return linkedHashMap;
    }

    public static final FragmentManager LJIIIZ(Context context, boolean z) {
        AbstractC1387200mCc abstractC1387200mCcLJ;
        FragmentManager supportFragmentManager;
        FragmentManager fragmentManagerLJ;
        AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ2 != null && (fragmentManagerLJ = abstractC1387200mCcLJ2.LJ()) != null) {
            return fragmentManagerLJ;
        }
        C19EG c19egLIZ = LIZ(context);
        if (c19egLIZ != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
            return supportFragmentManager;
        }
        if (!z || (abstractC1387200mCcLJ = C1906580ziK.LJ()) == null) {
            return null;
        }
        return abstractC1387200mCcLJ.LJ();
    }

    public static final Context LJIIJ(Context context, boolean z) {
        AbstractC1387200mCc abstractC1387200mCcLJ;
        Context contextLJIIIIZZ;
        AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ2 != null && (contextLJIIIIZZ = abstractC1387200mCcLJ2.LJIIIIZZ()) != null) {
            return contextLJIIIIZZ;
        }
        C19EG c19egLIZ = LIZ(context);
        if (c19egLIZ != null) {
            return c19egLIZ;
        }
        if (!z || (abstractC1387200mCcLJ = C1906580ziK.LJ()) == null) {
            return null;
        }
        return abstractC1387200mCcLJ.LJIIIIZZ();
    }

    public static final Uri LJIIIIZZ(Uri uri, String str, String str2) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        if (UriProtector.getQueryParameterNames(uri).contains(str)) {
            for (String str3 : UriProtector.getQueryParameterNames(uri)) {
                if (Intrinsics.LJFF(str3, str)) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = str2;
                } else {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str3);
                }
                builderClearQuery.appendQueryParameter(str3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            }
            return builderClearQuery.build();
        }
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }
}
