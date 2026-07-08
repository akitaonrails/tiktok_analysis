package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorDetailDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14ib, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20341514ib extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ PlaybookAnchorDetailDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20341514ib(PlaybookAnchorDetailDialog playbookAnchorDetailDialog) {
        super(1);
        this.LL = playbookAnchorDetailDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((C20384614pY) this.LL.LLLIIL.getValue()).LLJLL = bool.booleanValue();
        return Unit.LIZ;
    }
}
