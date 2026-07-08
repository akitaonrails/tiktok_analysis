package X;

import java.io.File;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08Om, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2110208Om extends C09AY implements Function0<C2099808Km> {
    public final /* synthetic */ C1527670prB LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2110208Om(C1527670prB c1527670prB) {
        super(0);
        this.LL = c1527670prB;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C2099808Km invoke() {
        return new C2099808Km((File) this.LL.LLIZ.getValue());
    }
}
