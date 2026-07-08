package X;

import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAutoStartDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14mj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20367114mj extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ PlaybookAutoStartDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20367114mj(PlaybookAutoStartDialog playbookAutoStartDialog) {
        super(1);
        this.LL = playbookAutoStartDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        this.LL.wS(false);
        return Unit.LIZ;
    }
}
