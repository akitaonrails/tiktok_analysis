package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Scs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C725400Scs extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ AbstractC738140SxQ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C725400Scs(AbstractC738140SxQ abstractC738140SxQ) {
        super(0);
        this.LL = abstractC738140SxQ;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        AbstractC738140SxQ abstractC738140SxQ;
        LifecycleOwner parent = this.LL.getParent();
        return Boolean.valueOf((!(parent instanceof AbstractC738140SxQ) || (abstractC738140SxQ = (AbstractC738140SxQ) parent) == null) ? C732340So4.LIZ(0.01f) : abstractC738140SxQ.isHitTrack());
    }
}
