package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookInteractivePolymerizationDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14sd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20403714sd extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ PlaybookInteractivePolymerizationDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20403714sd(PlaybookInteractivePolymerizationDialog playbookInteractivePolymerizationDialog) {
        super(1);
        this.LL = playbookInteractivePolymerizationDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            C20398214rk c20398214rk = this.LL.LLLIIL;
            if (c20398214rk != null) {
                c20398214rk.LLJ = false;
            }
        } else {
            C20398214rk c20398214rk2 = this.LL.LLLIIL;
            if (c20398214rk2 != null) {
                c20398214rk2.LLJ = true;
            }
        }
        return Unit.LIZ;
    }
}
