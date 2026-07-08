package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xH0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1812760xH0 extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ C1812750xGz LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1812760xH0(C1812750xGz c1812750xGz) {
        super(0);
        this.LL = c1812750xGz;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.LL.LJ.length() > 0);
    }
}
