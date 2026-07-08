package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookPolymerizationDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14tT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20408914tT extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PlaybookPolymerizationDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20408914tT(PlaybookPolymerizationDialog playbookPolymerizationDialog) {
        super(0);
        this.LL = playbookPolymerizationDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.close(1);
        return Unit.LIZ;
    }
}
