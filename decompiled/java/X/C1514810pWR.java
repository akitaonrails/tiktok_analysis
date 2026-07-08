package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pWR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514810pWR {
    public final String LIZ;
    public final Function0<Map<String, Object>> LIZIZ;

    public final void LIZ() {
        C1491570oux c1491570oux = C1491570oux.LIZ;
        String str = this.LIZ;
        c1491570oux.getClass();
        C1491570oux.LJIIZILJ(str);
        String str2 = this.LIZ;
        C1514800pWQ c1514800pWQ = C1514790pWP.LIZIZ;
        c1514800pWQ.LIZ.remove(str2);
        c1514800pWQ.LIZJ.remove(str2);
        EnumC1521110pgb.Companion.getClass();
        EnumC1521110pgb.cachedEntries.remove(str2);
    }

    public C1514810pWR(String str, C1522270piT c1522270piT) {
        this.LIZ = str;
        this.LIZIZ = c1522270piT;
        C1491570oux.LIZ.getClass();
        C1491570oux.LIZ(600000L, str, false, false);
    }

    public final void LIZIZ(View view, String str) {
        long jLIZJ;
        String str2;
        String str3;
        if (view == null) {
            return;
        }
        String str4 = "";
        for (Map.Entry<String, Object> entry : this.LIZIZ.invoke().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            LIZJ(key, value);
            if (Intrinsics.LJFF(key, EnumC1521110pgb.CONTEXT_PAGE_KEY.getKey())) {
                if ((value instanceof String) && (str3 = (String) value) != null) {
                    str4 = str3;
                } else {
                    str4 = "";
                }
            }
        }
        EnumC1520910pgH.Companion.getClass();
        EnumC1520910pgH enumC1520910pgHLIZ = C1520930pgJ.LIZ(str);
        String str5 = this.LIZ;
        C1514800pWQ c1514800pWQ = C1514790pWP.LIZIZ;
        c1514800pWQ.LIZ.put(str5, new WeakReference<>(view));
        c1514800pWQ.LIZJ.put(str5, enumC1520910pgHLIZ);
        synchronized (c1514800pWQ.LIZIZ) {
            try {
                c1514800pWQ.LIZIZ.put(view, new C1514770pWN(str5, enumC1520910pgHLIZ, str4));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1491570oux c1491570oux = C1491570oux.LIZ;
        String strLIZLLL = C1955407lI.LIZLLL(view);
        EnumC1491500ouq enumC1491500ouq = EnumC1491500ouq.EXTEND;
        c1491570oux.getClass();
        C1491570oux.LJIJJ(strLIZLLL, str5, enumC1491500ouq);
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair(EnumC1521110pgb.CONTAINER_TYPE.getKey(), enumC1520910pgHLIZ.getType());
        String key2 = EnumC1521110pgb.CONTEXT_APP_RUNTIME.getKey();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            jLIZJ = C792400V6o.LIZJ();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            jLIZJ = jCurrentTimeMillis;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - jLIZJ);
        if (0 <= seconds && seconds < 3) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else if (3 <= seconds && seconds < 5) {
            str2 = "1";
        } else if (5 <= seconds && seconds < 10) {
            str2 = "2";
        } else if (10 <= seconds && seconds < 30) {
            str2 = "3";
        } else if (30 <= seconds && seconds < 60) {
            str2 = "4";
        } else {
            str2 = "5";
        }
        pairArr[1] = new Pair(key2, str2);
        pairArr[2] = new Pair(EnumC1521110pgb.CONTEXT_IS_REINSTALL.getKey(), Boolean.valueOf(C1514830pWT.LIZ()));
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        EnumC1521110pgb.Companion.getClass();
        C1491790ovJ.LIZIZ(str5, mapLJIIIIZZ);
        C1491570oux.LJIILLIIL(C1491570oux.LIZ, str5, mapLJIIIIZZ);
        InterfaceC1520090pex interfaceC1520090pex = (InterfaceC1520090pex) ((LinkedHashMap) C1514790pWP.LIZ).get(enumC1520910pgHLIZ);
        if (interfaceC1520090pex != null) {
            interfaceC1520090pex.onHybridContextAttached(str5, view);
        }
        C1491570oux.LJIJJ(C1955407lI.LIZLLL(view), this.LIZ, EnumC1491500ouq.EXTEND);
    }

    public final void LIZJ(String str, Object obj) {
        String str2;
        C1491570oux.LJIJI(C1491570oux.LIZ, this.LIZ, str, obj);
        if (obj != null) {
            AbstractC1514820pWS abstractC1514820pWSLIZJ = C1514790pWP.LIZJ(this.LIZ);
            if (abstractC1514820pWSLIZJ != null && Intrinsics.LJFF(str, EnumC1521110pgb.CONTAINER_ID.getKey())) {
                if (!(obj instanceof String) || (str2 = (String) obj) == null) {
                    str2 = "";
                }
                abstractC1514820pWSLIZJ.LLILZIL = str2;
                abstractC1514820pWSLIZJ.LJI();
            }
            C1491790ovJ c1491790ovJ = EnumC1521110pgb.Companion;
            String str3 = this.LIZ;
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair(str, obj));
            c1491790ovJ.getClass();
            C1491790ovJ.LIZIZ(str3, mapLJIIJ);
        }
    }
}
