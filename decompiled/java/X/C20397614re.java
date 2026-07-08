package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookPolymerizationDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14re, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20397614re extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ PlaybookPolymerizationDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20397614re(PlaybookPolymerizationDialog playbookPolymerizationDialog) {
        super(1);
        this.LL = playbookPolymerizationDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        C20398214rk c20398214rkLIZLLL = C20374514nv.LIZLLL(this.LL.ES(), this.LL.LLLIIIL);
        if (c20398214rkLIZLLL != null) {
            if (zBooleanValue) {
                c20398214rkLIZLLL.LLJ = false;
            } else {
                c20398214rkLIZLLL.LLJ = true;
            }
        }
        return Unit.LIZ;
    }
}
