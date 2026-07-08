package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.0bl5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C985730bl5 extends C09AY implements Function1<C499701x5, Unit> {
    public final /* synthetic */ C259800zU<Long> LL;
    public final /* synthetic */ C1117360fBO LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C985730bl5(RecyclerView recyclerView, C259800zU<Long> c259800zU, C1117360fBO c1117360fBO) {
        super(1);
        this.LL = c259800zU;
        this.LLILLJJLI = c1117360fBO;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v29, types: [T, java.lang.Long] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C499701x5 c499701x5) {
        Playbook playbook;
        ActivePlaybook activePlaybook = (ActivePlaybook) C13LP.LJJJLIIL(c499701x5.LIZ);
        if (activePlaybook != null && (playbook = activePlaybook.playbook) != null) {
            long j = playbook.playbookId;
            C259800zU<Long> c259800zU = this.LL;
            C1117360fBO c1117360fBO = this.LLILLJJLI;
            Long l = c259800zU.element;
            if (l == null || j != l.longValue()) {
                int iIntValue = ((Number) C500260Jjc.LJI(c1117360fBO.LL, new C985740bl6(c259800zU)).getSecond()).intValue();
                int iIntValue2 = ((Number) C500260Jjc.LJI(c1117360fBO.LL, new C985760bl8(j)).getSecond()).intValue();
                try {
                    c1117360fBO.notifyItemChanged(iIntValue);
                    c1117360fBO.notifyItemChanged(iIntValue2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C20441214yg.LJ("PlaybookBizHelper", String.valueOf(th.getMessage()));
                }
                c259800zU.element = Long.valueOf(j);
            }
        } else {
            C1117360fBO c1117360fBO2 = this.LLILLJJLI;
            C259800zU<Long> c259800zU2 = this.LL;
            try {
                c1117360fBO2.notifyItemChanged(((Number) C500260Jjc.LJI(c1117360fBO2.LL, new C985750bl7(c259800zU2)).getSecond()).intValue());
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C20441214yg.LJ("PlaybookBizHelper", String.valueOf(th2.getMessage()));
            }
            c259800zU2.element = 0L;
        }
        return Unit.LIZ;
    }
}
