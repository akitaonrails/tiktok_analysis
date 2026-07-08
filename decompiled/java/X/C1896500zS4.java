package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.api.model.ActivityTask;
import java.util.List;

/* JADX INFO: renamed from: X.0zS4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1896500zS4 extends C1896480zS2 {
    public static final C01GW<C1896500zS4> LLJJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C1896560zSA());

    @Override // X.C1896480zS2
    public final boolean LJIIJ() {
        List<ActivityTask> list = this.LLILZ;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return this.LLILZLL >= ((ActivityTask) ListProtector.get(this.LLILZ, 0)).count && LJIJI();
    }

    @Override // X.C1896480zS2
    public final void LJIIJJI() {
        List<ActivityTask> list = this.LLILZ;
        if (list == null || list.isEmpty()) {
            return;
        }
        super.LJIIJJI();
        C1898560zVO.LJIILIIL(C1898560zVO.LL, ((ActivityTask) ListProtector.get(this.LLILZ, 0)).taskType, ((ActivityTask) ListProtector.get(this.LLILZ, 0)).taskKey);
    }

    @Override // X.C1896480zS2
    public final ActivityTask LJIIL() {
        List<ActivityTask> list = this.LLILZ;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (ActivityTask) ListProtector.get(this.LLILZ, 0);
    }

    @Override // X.C1896480zS2
    public final void LJIILL() {
        this.LLILLJJLI = 0L;
        ActivityTask activityTaskLJIIL = LJIIL();
        if (activityTaskLJIIL != null) {
            this.LLILZIL = activityTaskLJIIL;
        }
    }

    @Override // X.C1896480zS2
    public final void LJIILLIIL() {
        this.LLILLJJLI = 0L;
    }

    @Override // X.InterfaceC1895240zQ2
    public final void LJFF(List list) {
        LJIIZILJ("video_count_task", "", "", "inapppush_watch_video_count", "excute_task_date", "");
        LJIJJLI(list);
    }

    @Override // X.C1896480zS2
    public final void LJIILJJIL(ActivityTask activityTask) {
        this.LLILZLL++;
    }

    @Override // X.C1896480zS2
    public final void LJIJ(List<ActivityTask> list) {
        this.LLILZ = C1896850zSd.LIZIZ(7, list);
    }
}
