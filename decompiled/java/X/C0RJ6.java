package X;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.feed.platform.cell.interact.info.InteractInfoAreaComponent;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RJ6, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RJ6 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ InteractInfoAreaComponent LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RJ6(boolean z, boolean z2, InteractInfoAreaComponent interactInfoAreaComponent, C0RPZ c0rpz) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = interactInfoAreaComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> c13iqLJLIL;
        Object objNewInstance;
        if (!this.LL && !this.LLILLJJLI) {
            C0RQ2 c0rq2 = C0RQ2.LIZ;
            Aweme aweme = ((VideoItemParams) C631370Opb.LIZ(this.LLILLL)).getAweme();
            c0rq2.getClass();
            if ((aweme == null || !C0NC0.LIZ(aweme)) && (c13iqLJLIL = C161N.LIZIZ.LJLIL()) != null && (objNewInstance = C09R7.LIZ(c13iqLJLIL).newInstance()) != null) {
                IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class, false, false);
                if (iFeedDebugService != null) {
                    iFeedDebugService.LJIJJ();
                }
                ((ArrayList) C693480RIc.LIZIZ).add(objNewInstance);
            }
        }
        return Unit.LIZ;
    }
}
