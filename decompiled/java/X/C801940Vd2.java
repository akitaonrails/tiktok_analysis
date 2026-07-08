package X;

import Y.ARunnableS18S1100000_13;
import android.content.Context;
import android.os.Environment;
import android.os.Looper;
import android.os.Process;
import android.os.StatFs;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.monitor.f;
import com.bytedance.crash.monitor.k;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import dl3.h;
import im3.o;
import jl3.g;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vd2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801940Vd2 {
    public static C801940Vd2 LIZIZ;
    public final f LIZ;

    public C801940Vd2(Context context) {
        f fVarLIZ = k.LIZ(40201164L, 40201164L, context, "2010", AnonymousClass0825.LIZ);
        this.LIZ = fVarLIZ;
        fVarLIZ.LJIIJJI("release");
        C802790VeP c802790VeP = k.LIZ;
        if (c802790VeP != null) {
            fVarLIZ.LJIIL(c802790VeP.LIZLLL(CardStruct.IStatusCode.DEFAULT));
        }
    }

    public static void LIZJ(Throwable th) {
        LIZIZ("NPTH_CATCH_NEW", th);
    }

    public static void LIZ(String str, Throwable th) {
        C801940Vd2 c801940Vd2 = LIZIZ;
        if (c801940Vd2 == null) {
            return;
        }
        f fVar = c801940Vd2.LIZ;
        try {
            g gVar = new g(th, null, 0, str, null, C786410Ut5.u3().getName(), "EnsureNotReachHere", "core_exception_monitor");
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(gVar.LJ(fVar));
            jSONObject.put("data", jSONArray);
            JSONObject jSONObject2 = Header.LIZIZ(fVar, System.currentTimeMillis(), CrashType.ENSURE, Process.myPid()).LIZ;
            jSONObject.put("header", jSONObject2);
            String strLIZLLL = o.LIZLLL(h.LJIIJJI.LIZLLL, jSONObject2);
            if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
                C0VXF.post(new ARunnableS18S1100000_13(strLIZLLL, jSONObject, 12));
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public static void LIZIZ(String str, Throwable th) {
        C801940Vd2 c801940Vd2 = LIZIZ;
        if (c801940Vd2 != null) {
            c801940Vd2.LIZ.LJ().LJIIJ(str, th);
        }
    }

    public static void LIZLLL(String str, Throwable th) {
        boolean z;
        try {
            try {
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
        if (C2204961BRm.LLII(new StatFs(Environment.getDataDirectory().getPath()), new C0WZX("dzBzEgAjS8/YVFkiQFyHdNRwud82a2G8/m+GcF6Ow/vUvtCo85k7NQ==", null)) < 25165824) {
            z = true;
        } else {
            z = false;
        }
        C801940Vd2 c801940Vd2 = LIZIZ;
        if (c801940Vd2 != null) {
            f fVar = c801940Vd2.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_");
            sbLIZ.append(z);
            fVar.LJ().LJIIJ(C2188811AlT.LIZIZ(sbLIZ), th);
        }
    }
}
