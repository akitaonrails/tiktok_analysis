package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0hS4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC1204580hS4 extends AbstractC1201400hMw {
    @Override // X.AbstractC1201400hMw
    public final long LIZJ() {
        return 0L;
    }

    public abstract long LJII();

    public abstract long LJIIIZ();

    public void LJIIIIZZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        Keva keva = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZLLL());
        sbLIZ.append("_count_");
        sbLIZ.append(curUserId);
        keva.storeInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }

    public final boolean LJIIJ(String str) {
        EnumC586410MzH enumC586410MzH;
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
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(LIZLLL());
        sbLIZ3.append("_tp_");
        sbLIZ3.append(curUserId);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        int i = this.LIZ.getInt(strLIZIZ, 0);
        long j = this.LIZ.getLong(strLIZIZ2, 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i2 = this.LIZ.getInt(strLIZIZ3, 2);
        EnumC586410MzH enumC586410MzH2 = EnumC586410MzH.DEFAULTTYPE;
        if (i2 == 1) {
            enumC586410MzH = EnumC586410MzH.CLICKTYPE;
        } else {
            enumC586410MzH = enumC586410MzH2;
        }
        long j2 = jCurrentTimeMillis - j;
        if (i >= LJ()) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(str);
            sbLIZ4.append(" cannotshow,cancel times = ");
            sbLIZ4.append(i);
            sbLIZ4.append(", >= ");
            sbLIZ4.append(LJ());
            sbLIZ4.append(' ');
            C2188811AlT.LIZIZ(sbLIZ4);
            return true;
        }
        if ((enumC586410MzH == EnumC586410MzH.CLICKTYPE && j2 >= LJII()) || (enumC586410MzH == enumC586410MzH2 && j2 >= LJIIIZ())) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(str);
            sbLIZ5.append(" canshow,tp:");
            sbLIZ5.append(enumC586410MzH);
            sbLIZ5.append(',');
            sbLIZ5.append(j2 / 8.64E7d);
            sbLIZ5.append("days,");
            sbLIZ5.append(i);
            sbLIZ5.append("counts < ");
            sbLIZ5.append(LJ());
            sbLIZ5.append("counts");
            C2188811AlT.LIZIZ(sbLIZ5);
            return false;
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(str);
        sbLIZ6.append(" cannotshow,");
        sbLIZ6.append(enumC586410MzH);
        sbLIZ6.append(',');
        sbLIZ6.append(j2 / 8.64E7d);
        sbLIZ6.append("days,");
        sbLIZ6.append(i);
        sbLIZ6.append("counts < ");
        sbLIZ6.append(LJ());
        sbLIZ6.append("count");
        C2188811AlT.LIZIZ(sbLIZ6);
        return true;
    }

    public final void LJIIJJI(EnumC586410MzH enumC586410MzH) {
        int i;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZLLL());
        sbLIZ.append("_tp_");
        sbLIZ.append(curUserId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (enumC586410MzH == EnumC586410MzH.CLICKTYPE) {
            i = 1;
        } else {
            i = 2;
        }
        this.LIZ.storeInt(strLIZIZ, i);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setCanaelType,now CancelType = ");
        sbLIZ2.append(enumC586410MzH);
        C2188811AlT.LIZIZ(sbLIZ2);
    }
}
