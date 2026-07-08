package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xHZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1813110xHZ extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ Integer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813110xHZ(Integer num) {
        super(0);
        this.LL = num;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.LL != null);
    }
}
