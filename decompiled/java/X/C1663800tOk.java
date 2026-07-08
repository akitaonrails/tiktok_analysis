package X;

import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.voicechange.vcstream.svc.SVCTask;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: renamed from: X.0tOk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1663800tOk {
    public static boolean LIZLLL;
    public static final C1664350tPd<SVCTask> LIZ = new C1664350tPd<>();
    public static final C1664350tPd<SVCTask> LIZIZ = new C1664350tPd<>();
    public static final Map<Object, Integer> LIZJ = new LinkedHashMap();
    public static Function1<? super Boolean, Unit> LJ = AFwS266S0000000_25.get$arr$(548);

    public static void LIZ() {
        Iterator<SVCTask> it2 = LIZ.LIZJ().iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
        LIZ.LIZIZ();
        Iterator<SVCTask> it3 = LIZIZ.LIZJ().iterator();
        while (it3.hasNext()) {
            it3.next().LIZ();
        }
        LIZIZ.LIZIZ();
        LJ = AFwS231S0000000_3.get$arr$(249);
        LIZLLL = false;
    }

    public static boolean LIZJ() {
        Iterator<SVCTask> it2 = LIZIZ.LIZJ().iterator();
        while (it2.hasNext()) {
            if (it2.next().LLJJI.LLJIJIL.LJFF) {
                return true;
            }
        }
        return false;
    }

    public static void LIZIZ(Object obj) {
        for (SVCTask sVCTask : LIZIZ.LIZJ()) {
            if (sVCTask.LLJ == obj) {
                LIZIZ.LJ(sVCTask);
                return;
            }
        }
    }

    public static void LIZLLL(SVCTask sVCTask) {
        C1664350tPd<SVCTask> c1664350tPd = LIZ;
        c1664350tPd.LJ(sVCTask);
        LIZIZ.LIZ(sVCTask);
        if (c1664350tPd.LIZLLL()) {
            LJ.invoke(Boolean.TRUE);
            LJ = AFwS231S0000000_3.get$arr$(249);
        }
        if (!sVCTask.LLIZLLLIL) {
            LIZLLL = true;
            LJ.invoke(Boolean.FALSE);
            LJ = AFwS231S0000000_3.get$arr$(249);
        }
    }
}
