package X;

import com.bytedance.assem.arch.core.AssemSupervisor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724000Sac extends C09AY implements Function0<C0RTY> {
    public final /* synthetic */ AssemSupervisor LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C724000Sac(AssemSupervisor assemSupervisor) {
        super(0);
        this.LL = assemSupervisor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0RTY invoke() {
        this.LL.getClass();
        C0RTY c0rty = this.LL.LL;
        if (c0rty != null) {
            return c0rty;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
