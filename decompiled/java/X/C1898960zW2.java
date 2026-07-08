package X;

import com.bytedance.touchpoint.api.model.FeedAdsContent;
import com.bytedance.touchpoint.api.model.FeedAdsVideo;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.model.TaskEventContent;
import com.bytedance.touchpoint.api.model.UserActionContent;
import com.bytedance.touchpoint.core.pendant.base.BaseTaskEventTimerPendantManager;
import java.util.HashSet;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.0zW2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1898960zW2 extends AbstractC1899090zWF implements InterfaceC1899330zWd {
    public static int LLJI;
    public static String LLJIJIL;
    public final C1899050zWB LLIZ;
    public int LLIZLLLIL;
    public String LLJ;

    @Override // X.InterfaceC1899330zWd
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC1899310zWb
    public final void LJ() {
    }

    @Override // X.InterfaceC1899310zWb
    public final void LIZ() {
        LLJI = this.LLIZLLLIL;
        LLJIJIL = this.LLJ;
    }

    @Override // X.InterfaceC1899310zWb
    public final void LIZIZ() {
        this.LLIZLLLIL = LLJI;
        this.LLJ = LLJIJIL;
    }

    @Override // X.InterfaceC1899310zWb
    public final void LIZJ() {
        this.LLIZ.LIZ(this);
    }

    @Override // X.AbstractC1899090zWF
    public final void LJI() {
        this.LLIZ.LIZIZ();
    }

    @Override // X.InterfaceC1899330zWd
    public final void LJIIIIZZ() {
        C1898420zVA c1898420zVALJIILL = LJIILL();
        if (c1898420zVALJIILL == null || !c1898420zVALJIILL.LIZ()) {
            return;
        }
        String str = this.LLJ;
        if (str == null) {
            str = "";
        }
        HashSet<String> hashSet = C1898970zW3.LIZLLL;
        if (hashSet.contains(str)) {
            return;
        }
        int i = this.LLIZLLLIL + 1;
        this.LLIZLLLIL = i;
        BaseTaskEventTimerPendantManager baseTaskEventTimerPendantManager = this.LLILZLL;
        if (baseTaskEventTimerPendantManager != null) {
            baseTaskEventTimerPendantManager.LJJLIIIIJ(i, c1898420zVALJIILL.LJ);
        }
        C1898420zVA c1898420zVALJIILL2 = LJIILL();
        if (c1898420zVALJIILL2 == null || !c1898420zVALJIILL2.LIZ() || this.LLIZLLLIL < c1898420zVALJIILL2.LJ) {
            return;
        }
        C1898420zVA c1898420zVALJIILL3 = LJIILL();
        if (c1898420zVALJIILL3 != null && c1898420zVALJIILL3.LIZ() && 1 != 0) {
            String str2 = c1898420zVALJIILL3.LIZ;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = c1898420zVALJIILL3.LJI;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = c1898420zVALJIILL3.LJFF;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = c1898420zVALJIILL3.LJII;
            if (str5 == null) {
                str5 = "";
            }
            int i2 = c1898420zVALJIILL3.LIZLLL;
            String str6 = c1898420zVALJIILL3.LIZIZ;
            if (str6 == null) {
                str6 = "";
            }
            TaskEventContent taskEventContentLIZ = C1898850zVr.LIZ(this.LL, "watch_feed_ads_time", new UserActionContent(new FeedAdsContent(new FeedAdsVideo(str2, str3, str4, str5, i2, str6, c1898420zVALJIILL3.LJ, System.currentTimeMillis())), null, null, null, null, null, null, null, null), null);
            if (taskEventContentLIZ != null) {
                InterfaceC1899340zWe interfaceC1899340zWe = c1898420zVALJIILL2.LJIIIIZZ;
                if (interfaceC1899340zWe != null) {
                    interfaceC1899340zWe.LIZIZ();
                }
                C1899080zWE c1899080zWE = this.LLILLL;
                if (c1899080zWE != null) {
                    c1899080zWE.LJIIJJI(taskEventContentLIZ, true, new AwS607S0100000_28(c1898420zVALJIILL2, 29));
                }
            }
        }
        BaseTaskEventTimerPendantManager baseTaskEventTimerPendantManager2 = this.LLILZLL;
        if (baseTaskEventTimerPendantManager2 != null) {
            baseTaskEventTimerPendantManager2.LJJIJL(true, false, 0, false, false, AFwS217S0000000_28.get$arr$(51));
        }
        String str7 = this.LLJ;
        String str8 = str7 != null ? str7 : "";
        hashSet.add(str8);
        C1898970zW3.LIZJ.remove(str8);
    }

    public final C1898420zVA LJIILL() {
        String str = this.LLJ;
        if (str == null || str.length() == 0) {
            return null;
        }
        String str2 = this.LLJ;
        if (str2 == null) {
            str2 = "";
        }
        return C1898970zW3.LJ.get(str2);
    }

    public C1898960zW2(TaskEvent taskEvent) {
        super(taskEvent);
        this.LLIZ = new C1899050zWB();
    }

    @Override // X.InterfaceC1899310zWb
    public final void LJFF(TaskEventContent taskEventContent, C1898920zVy c1898920zVy) {
        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
        TaskEvent taskEvent = this.LL;
        c1894320zOY.getClass();
        C1894320zOY.LJIIIZ(taskEvent, null);
    }
}
