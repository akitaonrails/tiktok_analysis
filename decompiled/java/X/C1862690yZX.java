package X;

import android.app.ActivityManager;
import android.os.Process;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS571S0100000_27;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yZX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862690yZX {
    public static final /* synthetic */ int LJIIL = 0;
    public final Lifecycle LIZ;
    public final Map<String, String> LIZIZ;
    public final Function0<String> LIZJ;
    public final Function0<String> LIZLLL;
    public final Function0<String> LJ;
    public final Function0<String> LJFF;
    public long LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public long LJIIIZ;
    public LifecycleOwner LJIIJ;
    public boolean LJIIJJI;

    public final void LIZIZ() {
        String strInvoke;
        String str;
        ActivityManager activityManager;
        List listLJII;
        Fragment fragment;
        C19EG activity;
        if (!this.LJII || this.LJIIIIZZ) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.LJIIJ;
        if (lifecycleOwner == null) {
            this.LJII = false;
            return;
        }
        this.LJIIIIZZ = true;
        this.LJII = false;
        Function0<String> function0 = this.LJFF;
        Object obj = null;
        if (function0 == null || (strInvoke = function0.invoke()) == null) {
            strInvoke = "";
        }
        if (strInvoke.length() > 0) {
            C1863550yav.LIZJ(strInvoke);
        }
        Map<String, String> map = this.LIZIZ;
        String strLIZLLL = LIZLLL();
        String strLIZJ = LIZJ();
        if (!(lifecycleOwner instanceof Fragment) || (fragment = (Fragment) lifecycleOwner) == null || (!fragment.isRemoving() && ((activity = fragment.getActivity()) == null || !activity.isFinishing()))) {
            if (!this.LJIIJJI && !C1906580ziK.LJI()) {
                C844470XAv.LIZ.getClass();
                Object objH2 = C786410Ut5.H2(C844470XAv.LIZ(), "activity");
                if ((objH2 instanceof ActivityManager) && (activityManager = (ActivityManager) objH2) != null && (listLJII = C2204961BRm.LJII(activityManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6paJCA3z0QFIsnmzdosZtgjQduyH6bhVx+0JokjOTycMmR+Q==", null))) != null) {
                    Iterator it2 = listLJII.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (((ActivityManager.RunningAppProcessInfo) next).pid == Process.myPid()) {
                            obj = next;
                            break;
                        }
                    }
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
                    if (runningAppProcessInfo == null || runningAppProcessInfo.importance == 100) {
                    }
                }
                str = "exit_back";
            }
            str = "exit_to_background";
        } else {
            str = "exit_back";
        }
        LIZ(this, map, strLIZLLL, strLIZJ, str, this.LJIIIZ, LJFF(), LJ());
    }

    public final String LIZJ() {
        String str;
        Function0<String> function0 = this.LJ;
        String strInvoke = function0 != null ? function0.invoke() : null;
        if (strInvoke == null) {
            strInvoke = "";
        }
        if (strInvoke.length() > 0) {
            return strInvoke;
        }
        Map<String, String> map = this.LIZIZ;
        return (map == null || (str = map.get("message_id")) == null) ? "" : str;
    }

    public final String LIZLLL() {
        String str;
        Function0<String> function0 = this.LIZLLL;
        String strInvoke = function0 != null ? function0.invoke() : null;
        if (strInvoke == null) {
            strInvoke = "";
        }
        if (strInvoke.length() > 0) {
            return strInvoke;
        }
        Map<String, String> map = this.LIZIZ;
        return (map == null || (str = map.get("process_id")) == null) ? "" : str;
    }

    public final String LJ() {
        String str;
        Function0<String> function0 = this.LIZJ;
        String strInvoke = function0 != null ? function0.invoke() : null;
        if (strInvoke == null) {
            strInvoke = "";
        }
        if (strInvoke.length() > 0) {
            return strInvoke;
        }
        Map<String, String> map = this.LIZIZ;
        return (map == null || (str = map.get("tako_chat_id")) == null) ? "" : str;
    }

    public final String LJFF() {
        String str;
        String strInvoke;
        Function0<String> function0 = this.LJFF;
        if (function0 != null && (strInvoke = function0.invoke()) != null && strInvoke.length() != 0) {
            return strInvoke;
        }
        Map<String, String> map = this.LIZIZ;
        return (map == null || (str = map.get("tako_session_id")) == null) ? "" : str;
    }

    public C1862690yZX(Lifecycle lifecycle, Map map, AwS571S0100000_27 awS571S0100000_27, AwS571S0100000_27 awS571S0100000_272, AwS568S0100000_24 awS568S0100000_24, AwS571S0100000_27 awS571S0100000_273) {
        this.LIZ = lifecycle;
        this.LIZIZ = map;
        this.LIZJ = awS571S0100000_27;
        this.LIZLLL = awS571S0100000_272;
        this.LJ = awS568S0100000_24;
        this.LJFF = awS571S0100000_273;
    }

    public static void LIZ(C1862690yZX c1862690yZX, Map map, String str, String str2, String str3, long j, String str4, String str5) {
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862690yZX.getClass();
        JSONObject jSONObject = new JSONObject();
        C1862330yYx.LIZ.getClass();
        C1862330yYx.LLII(jSONObject, map);
        jSONObject.put("process_id", str);
        jSONObject.put("message_id", str2);
        jSONObject.put("exit_method", str3);
        jSONObject.put("duration", j);
        if (str4.length() > 0) {
            jSONObject.put("tako_session_id", str4);
        }
        if (str5.length() > 0) {
            jSONObject.put("tako_chat_id", str5);
        }
        c20235014FoLIZ.LIZIZ("tikbot_stay_time", jSONObject);
    }
}
