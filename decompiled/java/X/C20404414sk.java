package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookInteractivePolymerizationDialog;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14sk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20404414sk extends C09AY implements Function0<C1117360fBO> {
    public final /* synthetic */ PlaybookInteractivePolymerizationDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20404414sk(PlaybookInteractivePolymerizationDialog playbookInteractivePolymerizationDialog) {
        super(0);
        this.LL = playbookInteractivePolymerizationDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0fBO] */
    /* JADX WARN: Type inference failed for: r1v3 */
    @Override // kotlin.jvm.functions.Function0
    public final C1117360fBO invoke() {
        C20632315oP c20632315oP = this.LL.LLLIILIL;
        ?? adapter = c20632315oP != null ? c20632315oP.getAdapter() : 0;
        if (adapter instanceof C1117360fBO) {
            return adapter;
        }
        return null;
    }
}
