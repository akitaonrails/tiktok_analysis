package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bK3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C968970bK3 extends C09AY implements Function0<Long> {
    public final /* synthetic */ C968920bJy LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C968970bK3(C968920bJy c968920bJy) {
        super(0);
        this.LL = c968920bJy;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return this.LL.LIZJ.invoke().userId;
    }
}
