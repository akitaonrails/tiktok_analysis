package X;

import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookFeedbackDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14q5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20387914q5 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PlaybookAnchorServiceV2 LL;
    public final /* synthetic */ LiveSheetFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20387914q5(PlaybookAnchorServiceV2 playbookAnchorServiceV2, PlaybookFeedbackDialog playbookFeedbackDialog) {
        super(0);
        this.LL = playbookAnchorServiceV2;
        this.LLILLJJLI = playbookFeedbackDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (Intrinsics.LJFF(this.LL.LLJJIII, this.LLILLJJLI)) {
            this.LL.LLJJIII = null;
        }
        return Unit.LIZ;
    }
}
