package X;

import java.util.Calendar;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15ZS, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15ZS extends C20540515Zb implements InterfaceC20541615Zm {
    public final Function0<Boolean> LIZLLL;
    public boolean LJ;
    public long LJFF;
    public long LJI;
    public Long LJII;

    @Override // X.InterfaceC20541615Zm
    public final void LIZ() {
        this.LIZIZ = EnumC1781430wST.OPENED;
    }

    @Override // X.InterfaceC20541615Zm
    public final void LIZIZ() {
        if (this.LIZLLL.invoke().booleanValue()) {
            return;
        }
        this.LIZIZ = EnumC1781430wST.CLOSED;
        LJFF(Long.valueOf(System.currentTimeMillis()));
    }

    @Override // X.C20540515Zb
    public final long LIZJ() {
        long j;
        if (!this.LJ) {
            InterfaceC20541115Zh interfaceC20541115ZhLIZJ = C15ZV.LIZJ();
            if (interfaceC20541115ZhLIZJ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("appForegroundTime");
                sbLIZ.append(this.LIZ);
                j = interfaceC20541115ZhLIZJ.getLong(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                j = 0;
            }
            this.LJFF = j;
            this.LJ = true;
        }
        return this.LJFF;
    }

    @Override // X.C20540515Zb
    public final void LJ() {
        if (this.LJI < System.currentTimeMillis()) {
            LIZLLL(0L);
            LJFF(Long.valueOf(System.currentTimeMillis()));
        }
    }

    public C15ZS(Function0 function0) {
        super("ScreenTimeDashboard");
        this.LIZLLL = function0;
        C20541515Zl.LIZ(this);
        this.LIZIZ = EnumC1781430wST.OPENED;
        LJFF(Long.valueOf(System.currentTimeMillis()));
    }

    @Override // X.C20540515Zb
    public final void LIZLLL(long j) {
        this.LJFF = j;
        this.LJ = true;
        InterfaceC20541115Zh interfaceC20541115ZhLIZJ = C15ZV.LIZJ();
        if (interfaceC20541115ZhLIZJ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("appForegroundTime");
            sbLIZ.append(this.LIZ);
            interfaceC20541115ZhLIZJ.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), j);
        }
    }

    public final void LJFF(Long l) {
        long jLongValue;
        this.LJII = l;
        if (l != null) {
            long jLongValue2 = l.longValue();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jLongValue2);
            calendar.add(5, 1);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            this.LJI = calendar.getTimeInMillis();
        }
        if (this.LJII == null) {
            InterfaceC20541115Zh interfaceC20541115ZhLIZJ = C15ZV.LIZJ();
            if (interfaceC20541115ZhLIZJ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("last_leave_time");
                sbLIZ.append(this.LIZ);
                interfaceC20541115ZhLIZJ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        InterfaceC20541115Zh interfaceC20541115ZhLIZJ2 = C15ZV.LIZJ();
        if (interfaceC20541115ZhLIZJ2 == null) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("last_leave_time");
        sbLIZ2.append(this.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        Long l2 = this.LJII;
        if (l2 != null) {
            jLongValue = l2.longValue();
        } else {
            jLongValue = 0;
        }
        interfaceC20541115ZhLIZJ2.LIZIZ(strLIZIZ, jLongValue);
    }
}
