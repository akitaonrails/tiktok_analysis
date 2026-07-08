package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.playbooklist.PlaybookListDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14r2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20393814r2 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PlaybookListDialog LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20393814r2(PlaybookListDialog playbookListDialog, C20402114sN c20402114sN) {
        super(0);
        this.LL = playbookListDialog;
        this.LLILLJJLI = c20402114sN;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LLJZIJLIL.SX0(C168A.class, Boolean.TRUE);
        this.LLILLJJLI.invoke();
        return Unit.LIZ;
    }
}
