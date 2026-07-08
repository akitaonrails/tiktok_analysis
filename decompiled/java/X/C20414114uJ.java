package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.playbooklist.PlaybookAIListFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14uJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20414114uJ extends C09AY implements Function1<Unit, Unit> {
    public final /* synthetic */ PlaybookAIListFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20414114uJ(PlaybookAIListFragment playbookAIListFragment) {
        super(1);
        this.LL = playbookAIListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Unit unit) {
        this.LL.BS();
        return Unit.LIZ;
    }
}
