package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import com.ss.android.ugc.feed.platform.IFcpModuleService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04eN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1148104eN extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Assembler LL;
    public final /* synthetic */ MainPageFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1148104eN(Assembler assembler, MainPageFragment mainPageFragment) {
        super(0);
        this.LL = assembler;
        this.LLILLJJLI = mainPageFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C19719912Dl c19719912DlLIZ;
        IFcpModuleService.LIZ.getClass();
        IFcpModuleService iFcpModuleService = (IFcpModuleService) PluggableExtentionKt.pluggableSpi$default(IFcpModuleService.class, false, false, false, 14, null);
        if (iFcpModuleService != null && (c19719912DlLIZ = iFcpModuleService.LIZ()) != null) {
            this.LL.vQ2(this.LLILLJJLI, new C1147704eJ(c19719912DlLIZ));
        }
        return Unit.LIZ;
    }
}
