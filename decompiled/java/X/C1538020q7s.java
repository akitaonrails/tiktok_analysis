package X;

import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import java.util.List;

/* JADX INFO: renamed from: X.0q7s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1538020q7s {
    public static final C1538020q7s LIZ = new C1538020q7s();

    public static final C1543410qGZ LIZ(final String str, AbstractC1538620q8q abstractC1538620q8q, final C1537480q70 c1537480q70) {
        List<? extends AbstractC1063600dmg> list;
        C1543410qGZ c1543410qGZ = new C1543410qGZ();
        AbstractC1543010qFv abstractC1543010qFv = new AbstractC1543010qFv() { // from class: X.0q90
            @Override // X.InterfaceC1544190qHp
            public final String getUrl() {
                return str;
            }
        };
        c1543410qGZ.LIZJ(abstractC1543010qFv, String.valueOf(abstractC1543010qFv.hashCode()));
        c1543410qGZ.LIZ.LIZ.LJIIJJI.add(new InterfaceC1522340pia() { // from class: X.0piX
            @Override // X.InterfaceC1522340pia
            public final void LIZ() {
            }

            @Override // X.InterfaceC1522340pia
            public final void LIZIZ(C1522330piZ c1522330piZ) {
                C1537710q7N c1537710q7N;
                InterfaceC1541990qEH interfaceC1541990qEHLJIJJ = c1537480q70.LJIJJ();
                if ((interfaceC1541990qEHLJIJJ instanceof C1537710q7N) && (c1537710q7N = (C1537710q7N) interfaceC1541990qEHLJIJJ) != null) {
                    C1522300piW.LIZLLL(c1537710q7N, c1522330piZ, System.currentTimeMillis());
                }
            }

            @Override // X.InterfaceC1522340pia
            public final void LIZJ(C1522330piZ c1522330piZ) {
                C1537710q7N c1537710q7N;
                InterfaceC1541990qEH interfaceC1541990qEHLJIJJ = c1537480q70.LJIJJ();
                if ((interfaceC1541990qEHLJIJJ instanceof C1537710q7N) && (c1537710q7N = (C1537710q7N) interfaceC1541990qEHLJIJJ) != null) {
                    C1522300piW.LIZLLL(c1537710q7N, c1522330piZ, System.currentTimeMillis());
                    C1521400ph4 c1521400ph4 = new C1521400ph4();
                    c1521400ph4.LJIIIIZZ = c1522330piZ.LIZ;
                    c1521400ph4.LJI = C1522300piW.LIZ(c1522330piZ.LIZIZ);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("code: ");
                    sbLIZ.append(c1522330piZ.LIZIZ);
                    sbLIZ.append(", msg: ");
                    sbLIZ.append(c1522330piZ.LIZJ);
                    sbLIZ.append(", rawRequest: ");
                    sbLIZ.append(c1522330piZ.LJI);
                    sbLIZ.append(", rawResult: ");
                    sbLIZ.append(c1522330piZ.LJFF);
                    sbLIZ.append(", isRunInMainThread: ");
                    sbLIZ.append(c1522330piZ.LJII);
                    c1521400ph4.LJII = C2188811AlT.LIZIZ(sbLIZ);
                    LynxViewMonitor.Companion.getClass();
                    LynxViewMonitor.INSTANCE.reportJsbError(c1537710q7N, c1521400ph4);
                }
            }
        });
        if (abstractC1538620q8q != null && (list = abstractC1538620q8q.LIZIZ) != null) {
            for (AbstractC1063600dmg abstractC1063600dmg : list) {
                c1543410qGZ.LJ(abstractC1063600dmg, EnumC1063300dmC.ALL);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("register method ");
                sbLIZ.append(abstractC1063600dmg.getName());
                C2188811AlT.LIZIZ(sbLIZ);
            }
        } else {
            if (abstractC1538620q8q != null) {
            }
            return c1543410qGZ;
        }
        List<? extends Class<? extends InterfaceC1063710dmr>> list2 = abstractC1538620q8q.LIZJ;
        if (list2 != null) {
            for (Class<? extends InterfaceC1063710dmr> cls : list2) {
                c1543410qGZ.LJFF(cls, EnumC1063300dmC.Worker);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("register idl method ");
                sbLIZ2.append(cls.getName());
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        return c1543410qGZ;
    }
}
