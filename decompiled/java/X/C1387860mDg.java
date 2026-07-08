package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.comment.experiment.ExposedCommentConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0mDg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387860mDg {
    public static final C1387860mDg LIZ = new C1387860mDg();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(680));

    public static Keva LIZIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static C13E8 LIZJ() {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(LIZIZ().getString(LIZ("past_show_time_stamps"), ""), new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (it2.hasNext()) {
            Long lLJIILIIL = C2095008Iq.LJIILIIL((String) it2.next());
            if (lLJIILIIL != null) {
                arrayList.add(lLJIILIIL);
            }
        }
        C13E8 c13e8 = new C13E8();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Number) obj).longValue() >= System.currentTimeMillis() - TimeUnit.HOURS.toMillis(24L)) {
                arrayList2.add(obj);
            }
        }
        C1387910mDl.LIZ.getClass();
        c13e8.addAll(C13LP.LLD(((ExposedCommentConfig) C1387910mDl.LIZJ.getValue()).maxAppearTimes, arrayList2));
        return c13e8;
    }

    public static String LIZ(String str) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(curUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
