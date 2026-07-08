package X;

import com.bytedance.ies.powerlist.page.PowerPageLoader;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ziZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1906730ziZ extends C09AY implements Function0<PowerPageLoader<? extends Object>> {
    public final /* synthetic */ AbstractC1906720ziY LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1906730ziZ(AbstractC1906720ziY abstractC1906720ziY) {
        super(0);
        this.LL = abstractC1906720ziY;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PowerPageLoader<? extends Object> invoke() {
        AbstractC329610Cw3<?> abstractC329610Cw3LJIIJJI = this.LL.LJIIJJI();
        if (abstractC329610Cw3LJIIJJI != null) {
            return new PowerPageLoader<>(abstractC329610Cw3LJIIJJI, this.LL.LLILZLL);
        }
        return null;
    }
}
