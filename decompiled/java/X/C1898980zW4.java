package X;

import com.bytedance.incentive.taskevent.watchvideo.AdWatchVideoTaskTrigger;
import com.bytedance.touchpoint.api.model.ReportInstruction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS112S1000000_28;
import kotlin.jvm.internal.AwS166S0101000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zW4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1898980zW4 implements InterfaceC1898200zUo {
    public static final C1898980zW4 LIZ = new C1898980zW4();
    public static final List<AdWatchVideoTaskTrigger> LIZIZ = new ArrayList();

    @Override // X.InterfaceC1898200zUo
    public final void LJFF() {
        C01U6.LIZIZ(AFwS217S0000000_28.get$arr$(53));
    }

    @Override // X.InterfaceC1898200zUo
    public final String LIZ(String str) {
        Object next;
        Iterator it2 = ((ArrayList) LIZIZ).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((AbstractC1899090zWF) next).LL.taskEventKey, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AdWatchVideoTaskTrigger adWatchVideoTaskTrigger = (AdWatchVideoTaskTrigger) next;
        if (adWatchVideoTaskTrigger != null) {
            if (adWatchVideoTaskTrigger.LLIZLLLIL) {
                return "completed";
            }
            return "timing";
        }
        return "";
    }

    @Override // X.InterfaceC1898200zUo
    public final void LIZIZ(String str) {
        C01U6.LIZIZ(new AwS112S1000000_28(str, 0));
    }

    @Override // X.InterfaceC1898200zUo
    public final void LIZJ(C1896810zSZ c1896810zSZ) {
        C01U6.LIZIZ(new AwS572S0100000_28(c1896810zSZ, 34));
    }

    @Override // X.InterfaceC1898200zUo
    public final void LIZLLL(String str) {
        C01U6.LIZIZ(new AwS112S1000000_28(str, 1));
    }

    @Override // X.InterfaceC1898200zUo
    public final void LJ(C1896810zSZ c1896810zSZ) {
        C01U6.LIZIZ(new AwS572S0100000_28(c1896810zSZ, 33));
    }

    @Override // X.InterfaceC1898200zUo
    public final long LJII(String str) {
        Object next;
        int iIntValue;
        Integer num;
        Iterator it2 = ((ArrayList) LIZIZ).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((AbstractC1899090zWF) next).LL.taskEventKey, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AdWatchVideoTaskTrigger adWatchVideoTaskTrigger = (AdWatchVideoTaskTrigger) next;
        if (adWatchVideoTaskTrigger != null) {
            ReportInstruction reportInstruction = adWatchVideoTaskTrigger.LL.reportInstruction;
            if (reportInstruction != null && (num = reportInstruction.reportBatch) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 20;
            }
            return iIntValue - adWatchVideoTaskTrigger.LLJ;
        }
        return 0L;
    }

    @Override // X.InterfaceC1898200zUo
    public final int LJIIIZ(String str) {
        Object next;
        Iterator it2 = ((ArrayList) LIZIZ).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((AbstractC1899090zWF) next).LL.taskEventKey, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AdWatchVideoTaskTrigger adWatchVideoTaskTrigger = (AdWatchVideoTaskTrigger) next;
        if (adWatchVideoTaskTrigger != null) {
            return adWatchVideoTaskTrigger.LLJILJIL;
        }
        return 0;
    }

    @Override // X.InterfaceC1898200zUo
    public final void LJI(C1896810zSZ c1896810zSZ, int i) {
        C01U6.LIZIZ(new AwS166S0101000_28(c1896810zSZ, i, 0));
    }

    @Override // X.InterfaceC1898200zUo
    public final void LJIIIIZZ(int i, int i2, String str, String str2, String str3, String str4, List list, boolean z) {
        C01U6.LIZIZ(new C1898950zW1(i, i2, str2, str3, str4, str, list, z));
    }
}
