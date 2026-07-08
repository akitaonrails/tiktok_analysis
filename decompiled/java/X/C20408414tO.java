package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookPolymerizationDialog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14tO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20408414tO extends C09AY implements Function0<C20408714tR> {
    public final /* synthetic */ PlaybookPolymerizationDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20408414tO(PlaybookPolymerizationDialog playbookPolymerizationDialog) {
        super(0);
        this.LL = playbookPolymerizationDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C20408714tR invoke() {
        PlaybookPolymerizationDialog playbookPolymerizationDialog = this.LL;
        return new C20408714tR(playbookPolymerizationDialog.LLL, playbookPolymerizationDialog, new C20408614tQ(playbookPolymerizationDialog), new C20408914tT(this.LL));
    }
}
