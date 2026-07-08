package X;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0prI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1527740prI extends C09AY implements Function0<List<? extends C801520VcM>> {
    public final /* synthetic */ C1527670prB LL;
    public final /* synthetic */ EnumC1527250pqV LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL = 100;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1527740prI(C1527670prB c1527670prB, EnumC1527250pqV enumC1527250pqV, String str, String str2) {
        super(0);
        this.LL = c1527670prB;
        this.LLILLJJLI = enumC1527250pqV;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends C801520VcM> invoke() {
        return this.LL.LJLJI().LJII(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
    }
}
