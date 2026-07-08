package X;

import com.bytedance.assem.arch.core.AssemSupervisor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724010Sad extends C09AY implements Function0<C724710Sbl> {
    public final /* synthetic */ AssemSupervisor LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C724010Sad(AssemSupervisor assemSupervisor) {
        super(0);
        this.LL = assemSupervisor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C724710Sbl invoke() {
        this.LL.getClass();
        C724710Sbl c724710Sbl = this.LL.LLILLJJLI;
        if (c724710Sbl != null) {
            return c724710Sbl;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
