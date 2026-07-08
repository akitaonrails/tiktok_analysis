package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0hS6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC1204600hS6 extends AbstractC1204580hS4 {
    public final void LJIIL(EnumC586410MzH enumC586410MzH, boolean z) {
        try {
            LJI(z);
            LJIIJJI(enumC586410MzH);
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZLLL());
            sbLIZ.append("_count_");
            sbLIZ.append(curUserId);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(LIZLLL());
            sbLIZ2.append("_ts_");
            sbLIZ2.append(curUserId);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            int i = this.LIZ.getInt(strLIZIZ, 0);
            long j = this.LIZ.getLong(strLIZIZ2, 0L);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("set frequency,CancelTime = ");
            sbLIZ3.append(j);
            sbLIZ3.append(",Count = ");
            sbLIZ3.append(i);
            sbLIZ3.append(",type = ");
            sbLIZ3.append(enumC586410MzH);
            C2188811AlT.LIZIZ(sbLIZ3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
