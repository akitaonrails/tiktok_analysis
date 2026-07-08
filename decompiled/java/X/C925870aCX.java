package X;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0aCX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925870aCX {
    public final String LIZ;
    public final List<C925880aCY> LIZIZ;
    public final String LIZJ;
    public final ConcurrentHashMap<EnumC925840aCU, Long> LIZLLL;
    public final Set<String> LJ;
    public volatile boolean LJFF;

    public C925870aCX(String str, List<C925880aCY> list) {
        this.LIZ = str;
        this.LIZIZ = list;
        String string = UUID.randomUUID().toString();
        this.LIZJ = string;
        this.LIZLLL = new ConcurrentHashMap<>();
        this.LJ = Collections.newSetFromMap(new ConcurrentHashMap());
        StringBuilder sb = new StringBuilder("create route type=");
        sb.append(str);
        sb.append(" session=");
        sb.append(string);
        sb.append(" stages=");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C925880aCY> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ);
        }
        sb.append(arrayList);
        C20441214yg.LIZIZ("LinkMicProcessTracker", sb.toString());
    }

    public final void LIZ(EnumC925840aCU enumC925840aCU, long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("inject type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" milestone=");
        sbLIZ.append(enumC925840aCU);
        sbLIZ.append(" time=");
        sbLIZ.append(j);
        sbLIZ.append(" session=");
        sbLIZ.append(this.LIZJ);
        C20441214yg.LIZIZ("LinkMicProcessTracker", C2188811AlT.LIZIZ(sbLIZ));
        LIZIZ(enumC925840aCU, j);
    }

    public final void LIZIZ(EnumC925840aCU enumC925840aCU, long j) {
        if (this.LJFF) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mark skip(terminated) type=");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(" milestone=");
            sbLIZ.append(enumC925840aCU);
            sbLIZ.append(" session=");
            sbLIZ.append(this.LIZJ);
            C20441214yg.LIZIZ("LinkMicProcessTracker", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (this.LIZLLL.putIfAbsent(enumC925840aCU, Long.valueOf(j)) != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("mark skip(duplicate) type=");
            sbLIZ2.append(this.LIZ);
            sbLIZ2.append(" milestone=");
            sbLIZ2.append(enumC925840aCU);
            sbLIZ2.append(" session=");
            sbLIZ2.append(this.LIZJ);
            C20441214yg.LIZIZ("LinkMicProcessTracker", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("mark route type=");
        sbLIZ3.append(this.LIZ);
        sbLIZ3.append(" milestone=");
        sbLIZ3.append(enumC925840aCU);
        sbLIZ3.append(" time=");
        sbLIZ3.append(j);
        sbLIZ3.append(" session=");
        sbLIZ3.append(this.LIZJ);
        C20441214yg.LIZIZ("LinkMicProcessTracker", C2188811AlT.LIZIZ(sbLIZ3));
        for (C925880aCY c925880aCY : this.LIZIZ) {
            if (c925880aCY.LIZJ == enumC925840aCU) {
                LIZLLL(c925880aCY, 0, null, false);
            }
        }
    }

    public final void LIZLLL(C925880aCY c925880aCY, int i, String str, boolean z) {
        Long lValueOf;
        if (!this.LJ.add(c925880aCY.LIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("settle skip(reported) stage=");
            sbLIZ.append(c925880aCY.LIZ);
            sbLIZ.append(" session=");
            sbLIZ.append(this.LIZJ);
            C20441214yg.LIZIZ("LinkMicProcessTracker", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        Long l = this.LIZLLL.get(c925880aCY.LIZIZ);
        if (l == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("settle skip(no from=");
            sbLIZ2.append(c925880aCY.LIZIZ);
            sbLIZ2.append(") stage=");
            sbLIZ2.append(c925880aCY.LIZ);
            sbLIZ2.append(" session=");
            sbLIZ2.append(this.LIZJ);
            C20441214yg.LIZIZ("LinkMicProcessTracker", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (z) {
            lValueOf = Long.valueOf(SystemClock.elapsedRealtime());
        } else {
            lValueOf = this.LIZLLL.get(c925880aCY.LIZJ);
        }
        if (lValueOf == null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("settle skip(no to=");
            sbLIZ3.append(c925880aCY.LIZJ);
            sbLIZ3.append(") stage=");
            sbLIZ3.append(c925880aCY.LIZ);
            sbLIZ3.append(" session=");
            sbLIZ3.append(this.LIZJ);
            C20441214yg.LIZIZ("LinkMicProcessTracker", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        long jLongValue = lValueOf.longValue() - l.longValue();
        if (jLongValue < 0) {
            jLongValue = 0;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("report type=");
        sbLIZ4.append(this.LIZ);
        sbLIZ4.append(" stage=");
        sbLIZ4.append(c925880aCY.LIZ);
        sbLIZ4.append(" duration=");
        sbLIZ4.append(jLongValue);
        sbLIZ4.append(" errorCode=");
        sbLIZ4.append(i);
        sbLIZ4.append(" errorMessage=");
        sbLIZ4.append(str);
        sbLIZ4.append(" session=");
        sbLIZ4.append(this.LIZJ);
        C20441214yg.LJIIIZ("LinkMicProcessTracker", C2188811AlT.LIZIZ(sbLIZ4));
        if (jLongValue > 10000) {
            return;
        }
        String str2 = this.LIZ;
        String str3 = c925880aCY.LIZ;
        HashMap map = new HashMap();
        C404301hh.LIZIZ(map);
        map.put("type", str2);
        map.put("stage", str3);
        map.put("error_code", String.valueOf(i));
        map.put("step_duration", String.valueOf(jLongValue));
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                str = "";
            }
            map.put("error_message", str);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_linkmic_process");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }
}
