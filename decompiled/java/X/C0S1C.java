package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0S1C, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S1C extends C09AY implements Function0<C0RTY> {
    public final /* synthetic */ AbstractC738140SxQ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S1C(AbstractC738140SxQ abstractC738140SxQ) {
        super(0);
        this.LL = abstractC738140SxQ;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C0RTY invoke() {
        return this.LL.getSupervisor().LJ();
    }
}
