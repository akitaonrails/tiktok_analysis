package X;

import com.bytedance.assem.arch.core.Assembler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0I28, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I28 extends C09AY implements Function0<C724710Sbl> {
    public final /* synthetic */ C19EG LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0I28(C19EG c19eg) {
        super(0);
        this.LL = c19eg;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C724710Sbl invoke() {
        return Assembler.BQ2(C0RPA.LIZ(this.LL), this.LL);
    }
}
