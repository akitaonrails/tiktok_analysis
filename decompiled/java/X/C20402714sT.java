package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookPolymerizationDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14sT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20402714sT extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ PlaybookPolymerizationDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20402714sT(PlaybookPolymerizationDialog playbookPolymerizationDialog) {
        super(1);
        this.LL = playbookPolymerizationDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            this.LL.close(1);
        }
        return Unit.LIZ;
    }
}
