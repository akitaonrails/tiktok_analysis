package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.service.launcher.ILauncherTaskApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qnW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563840qnW extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ C1563730qnL LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1563840qnW(C1563730qnL c1563730qnL) {
        super(1);
        this.LL = c1563730qnL;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        C1563860qnY.LIZIZ = false;
        C1563860qnY.LIZ = new C804220Vgi();
        ServiceManager.get().getService(ILauncherTaskApi.class);
        C1563710qnJ.LIZ(assembler, this.LL);
        return Unit.LIZ;
    }
}
