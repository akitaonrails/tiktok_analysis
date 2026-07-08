package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.comment.quickmention.QuickMentionLogicComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0HnO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451640HnO extends C09AY implements Function0<Unit> {
    public final /* synthetic */ QuickMentionLogicComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C451640HnO(QuickMentionLogicComponent quickMentionLogicComponent) {
        super(0);
        this.LL = quickMentionLogicComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        QuickMentionLogicComponent quickMentionLogicComponent = this.LL;
        quickMentionLogicComponent.getClass();
        C19EG c19egLIZ = C724240Sb0.LIZ(quickMentionLogicComponent);
        if (c19egLIZ != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(quickMentionLogicComponent), null, null, new C451630HnN(quickMentionLogicComponent, c19egLIZ, null), 3);
        }
        return Unit.LIZ;
    }
}
