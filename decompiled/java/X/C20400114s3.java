package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookPolymerizationDialog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14s3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20400114s3 extends C09AY implements Function0<C20394514r9> {
    public final /* synthetic */ PlaybookPolymerizationDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20400114s3(PlaybookPolymerizationDialog playbookPolymerizationDialog) {
        super(0);
        this.LL = playbookPolymerizationDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C20394514r9 invoke() {
        EnumC20429314wl enumC20429314wl = EnumC20429314wl.MULTI_GUEST;
        PlaybookPolymerizationDialog playbookPolymerizationDialog = this.LL;
        return new C20394514r9(enumC20429314wl, playbookPolymerizationDialog.LLJZIJLIL, playbookPolymerizationDialog.LLL, new C20400214s4(playbookPolymerizationDialog), new C20400314s5(this.LL), new C20403814se(this.LL), new C20396914rX(this.LL), new C20405514sv(this.LL), new C20405914sz(this.LL));
    }
}
