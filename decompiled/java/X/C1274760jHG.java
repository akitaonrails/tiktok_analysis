package X;

/* JADX INFO: renamed from: X.0jHG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274760jHG implements InterfaceC1274770jHH {
    public final /* synthetic */ C1274850jHP LIZ;

    public C1274760jHG(C1274850jHP c1274850jHP) {
        this.LIZ = c1274850jHP;
    }

    public final void LIZ(boolean z, int i, int i2) {
        C1269340j8W c1269340j8WLLD;
        AbstractC1273900jFs abstractC1273900jFs = this.LIZ.LJIILJJIL;
        if (abstractC1273900jFs != null && (c1269340j8WLLD = abstractC1273900jFs.LLD()) != null) {
            int iLJJIL = c1269340j8WLLD.LJJIL(1);
            int iLJJIJIIJIL = c1269340j8WLLD.LJJIJIIJIL(1);
            int iMax = Math.max(iLJJIL / 2, i);
            int iMax2 = Math.max(iLJJIJIIJIL / 2, i2);
            if (z) {
                abstractC1273900jFs.LJJL(iLJJIL, iLJJIJIIJIL);
            } else {
                abstractC1273900jFs.LJJL(iMax, iMax2);
            }
        }
    }

    public final void LIZIZ(C1274810jHL c1274810jHL, int i, Object... objArr) {
        String str = c1274810jHL.LJI.LJIIL().LJFF;
        EnumC1275210jHz enumC1275210jHz = c1274810jHL.LJIILJJIL.LJJIFFI;
        C1274850jHP c1274850jHP = this.LIZ;
        c1274850jHP.getClass();
        if (i == 12) {
            int i2 = 0;
            Object obj = objArr[0];
            if (obj != null && obj.toString().equals(str)) {
                int i3 = 3;
                if (c1274850jHP.LIZIZ.LIZ().LLD().LJJJLZIJ) {
                    switch (((Integer) objArr[1]).intValue()) {
                        case 1:
                        case 2:
                            i2 = 1;
                            break;
                        case 3:
                        case 4:
                            i2 = 2;
                            break;
                        case 5:
                        case 6:
                            i2 = 3;
                            break;
                    }
                    AbstractC1273900jFs abstractC1273900jFs = c1274850jHP.LJIILJJIL;
                    if (abstractC1273900jFs != null && i2 > 0) {
                        if (enumC1275210jHz == EnumC1275210jHz.CLIENT_MIX || enumC1275210jHz == EnumC1275210jHz.RTC_CLIENT_MIX) {
                            i3 = 2;
                        }
                        abstractC1273900jFs.LLJJIJIL(104, i3, i2);
                        return;
                    }
                    return;
                }
                int iIntValue = ((Integer) objArr[1]).intValue();
                if (iIntValue != 1 && iIntValue != 2) {
                    if (iIntValue != 3) {
                        if (iIntValue == 4) {
                            i2 = 3;
                        }
                    } else {
                        i2 = 2;
                    }
                } else {
                    i2 = 1;
                }
                AbstractC1273900jFs abstractC1273900jFs2 = c1274850jHP.LJIILJJIL;
                if (abstractC1273900jFs2 == null) {
                    return;
                }
                if (enumC1275210jHz == EnumC1275210jHz.CLIENT_MIX || enumC1275210jHz == EnumC1275210jHz.RTC_CLIENT_MIX) {
                    i3 = 2;
                }
                abstractC1273900jFs2.LLJJIJIL(101, i3, i2);
            }
        }
    }
}
