package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RA5, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RA5 extends C09AY implements Function0<String> {
    public final /* synthetic */ VideoBaseCell LL;
    public final /* synthetic */ AssemSupervisor LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RA5(VideoBaseCell videoBaseCell, AssemSupervisor assemSupervisor) {
        super(0);
        this.LL = videoBaseCell;
        this.LLILLJJLI = assemSupervisor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        Lifecycle lifecycle;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Assem.Supervisor Error: \n eventType:");
            sbLIZ.append(this.LL.LLJILJILJ.LJIIIZ);
            sbLIZ.append(", fragment:");
            sbLIZ.append(this.LL.LLJILJILJ.LIZJ);
            sbLIZ.append(", supervisor:");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(", paren state:");
            Fragment fragment = this.LL.LLJILJILJ.LIZJ;
            sbLIZ.append((fragment == null || (lifecycle = fragment.getLifecycle()) == null) ? null : lifecycle.getCurrentState());
            sbLIZ.append(",state:");
            sbLIZ.append(this.LL.getLifecycle().getCurrentState());
            return C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }
}
