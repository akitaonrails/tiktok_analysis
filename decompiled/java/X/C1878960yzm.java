package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.LiveGoalEntity;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yzm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1878960yzm implements InterfaceC1141530foN {
    public WeakReference<Function0<Unit>> LL;
    public final /* synthetic */ LiveGoalEntity LLILLJJLI;

    public C1878960yzm(LiveGoalEntity liveGoalEntity) {
        this.LLILLJJLI = liveGoalEntity;
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        WeakReference<Function0<Unit>> weakReference;
        Function0<Unit> function0;
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        Integer numValueOf = null;
        if (interfaceC1107590evd != null && (numValueOf = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evd, "error_code", 0))) != null && numValueOf.intValue() == 0 && (weakReference = this.LL) != null && (function0 = weakReference.get()) != null) {
            function0.invoke();
        }
        this.LLILLJJLI.LJJLIIIJ(numValueOf, "js event");
    }
}
