package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorDetailDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14q6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20388014q6 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PlaybookAnchorDetailDialog LL;
    public final /* synthetic */ PlaybookAnchorServiceV2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20388014q6(PlaybookAnchorDetailDialog playbookAnchorDetailDialog, PlaybookAnchorServiceV2 playbookAnchorServiceV2) {
        super(0);
        this.LL = playbookAnchorDetailDialog;
        this.LLILLJJLI = playbookAnchorServiceV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (Intrinsics.LJFF(this.LL, this.LLILLJJLI.LLJJIII)) {
            this.LLILLJJLI.LLJJIII = null;
        }
        return Unit.LIZ;
    }
}
