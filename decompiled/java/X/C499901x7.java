package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPlaybookActiveFixSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.01x7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C499901x7 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ BasePlaybookViewModel LL;
    public final /* synthetic */ ActivePlaybook LLILLJJLI;
    public final /* synthetic */ C20379114of LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C499901x7(BasePlaybookViewModel basePlaybookViewModel, ActivePlaybook activePlaybook, C20379114of c20379114of) {
        super(0);
        this.LL = basePlaybookViewModel;
        this.LLILLJJLI = activePlaybook;
        this.LLILLL = c20379114of;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Playbook playbook;
        if (this.LL.LLILLJJLI.getValue() != null || this.LLILLJJLI != null || !MultiGuestPlaybookActiveFixSetting.INSTANCE.enable()) {
            this.LL.LLILLJJLI.setValue(this.LLILLJJLI);
            this.LL.LLILZ.setValue(this.LLILLL);
            String strXQ2 = this.LL.xQ2();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("set activePlaybookLiveData, activePlaybook: ");
            ActivePlaybook activePlaybook = this.LLILLJJLI;
            sbLIZ.append((activePlaybook == null || (playbook = activePlaybook.playbook) == null) ? null : Long.valueOf(playbook.playbookId));
            sbLIZ.append(", activePlaybookDetailData: ");
            sbLIZ.append(this.LLILLL);
            C20441214yg.LIZIZ(strXQ2, C2188811AlT.LIZIZ(sbLIZ));
        }
        return Unit.LIZ;
    }
}
