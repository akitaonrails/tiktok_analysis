package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.adapter.RecommendListFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14sU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20402814sU extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ RecommendListFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20402814sU(RecommendListFragment recommendListFragment) {
        super(1);
        this.LL = recommendListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        bool.booleanValue();
        this.LL.NR().notifyDataSetChanged();
        return Unit.LIZ;
    }
}
