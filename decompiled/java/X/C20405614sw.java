package X;

import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookInteractivePolymerizationDialog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14sw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20405614sw extends C09AY implements Function0<Context> {
    public final /* synthetic */ PlaybookInteractivePolymerizationDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20405614sw(PlaybookInteractivePolymerizationDialog playbookInteractivePolymerizationDialog) {
        super(0);
        this.LL = playbookInteractivePolymerizationDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Context invoke() {
        return this.LL.getContext();
    }
}
