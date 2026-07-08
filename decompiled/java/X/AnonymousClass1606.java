package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1606, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1606 extends C09AY implements Function0<AnonymousClass1600> {
    public final /* synthetic */ AnonymousClass1607 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass1606(AnonymousClass1607 anonymousClass1607) {
        super(0);
        this.LL = anonymousClass1607;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1600 invoke() {
        return new AnonymousClass1600(this.LL.LL.getVideoItemParams());
    }
}
