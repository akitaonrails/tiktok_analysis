package X;

import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorDetailDialog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14pC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20382414pC extends C09AY implements Function0<C501601xO> {
    public final /* synthetic */ PlaybookAnchorDetailDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20382414pC(PlaybookAnchorDetailDialog playbookAnchorDetailDialog) {
        super(0);
        this.LL = playbookAnchorDetailDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C501601xO invoke() {
        Context context = this.LL.getContext();
        PlaybookAnchorDetailDialog playbookAnchorDetailDialog = this.LL;
        return new C501601xO(context, playbookAnchorDetailDialog.LLJZIJLIL, playbookAnchorDetailDialog.LLLFF);
    }
}
