package X;

import android.os.SystemClock;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.11cH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19537911cH {
    public final C11ZU LIZ;
    public final C19538011cI LIZIZ;
    public final Map<String, String> LIZJ = new LinkedHashMap();

    public C19537911cH(C11ZU c11zu, C19538011cI c19538011cI) {
        this.LIZ = c11zu;
        this.LIZIZ = c19538011cI;
    }

    public final boolean LIZ(C19536311c1 c19536311c1, String str) {
        String strLIZIZ;
        String str2;
        if (C0C1I.LIZ()) {
            String strLIZ = C349090DmN.LIZ(c19536311c1);
            C11ZU c11zu = this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZ);
            sbLIZ.append(str);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            long jUptimeMillis = SystemClock.uptimeMillis();
            C11ZT<?> c11zt = c11zu.LIZ.get(strLIZIZ2);
            Object obj = null;
            if (c11zt != null) {
                Integer num = c11zt.LIZIZ;
                if (num == null) {
                    Object obj2 = c11zt.LIZ;
                    if (obj2 instanceof String) {
                        obj = obj2;
                    }
                    str2 = (String) obj;
                } else if (jUptimeMillis - c11zt.LIZJ < ((long) num.intValue()) * 1000) {
                    Object obj3 = c11zt.LIZ;
                    if (obj3 instanceof String) {
                        obj = obj3;
                    }
                    str2 = (String) obj;
                } else {
                    return false;
                }
                if (str2 != null && new C0VSJ(str2).exists()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        Effect effect = c19536311c1.LIZJ;
        if (effect != null && effect.getExtra() != null && (strLIZIZ = this.LIZIZ.LIZIZ(c19536311c1)) != null && new C0VSJ(strLIZIZ).exists()) {
            return true;
        }
        return false;
    }

    public final void LIZIZ(C19536311c1 c19536311c1, String str, String str2) {
        if (C0C1I.LIZ()) {
            String strLIZ = C349090DmN.LIZ(c19536311c1);
            C11ZU c11zu = this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZ);
            sbLIZ.append(str);
            c11zu.LIZ(null, C2188811AlT.LIZIZ(sbLIZ), str2);
            return;
        }
        C19538011cI c19538011cI = this.LIZIZ;
        c19538011cI.getClass();
        String strLIZ2 = C19538011cI.LIZ(c19536311c1);
        if (strLIZ2 == null) {
            return;
        }
        c19538011cI.LIZLLL.put(strLIZ2, str2);
    }
}
