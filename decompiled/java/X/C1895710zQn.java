package X;

import com.bytedance.touchpoint.api.service.IWatchVideoService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zQn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895710zQn extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SpecActServiceImpl LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1895710zQn(SpecActServiceImpl specActServiceImpl, String str, String str2) {
        super(0);
        this.LL = specActServiceImpl;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPausePlay ...before playing aweme:");
        Aweme aweme = this.LL.LJ;
        sbLIZ.append(aweme != null ? aweme.getAid() : null);
        sbLIZ.append(",pause aweme:");
        sbLIZ.append(this.LLILLJJLI);
        C2188811AlT.LIZIZ(sbLIZ);
        String str = this.LLILLJJLI;
        Aweme aweme2 = this.LL.LJ;
        if (Intrinsics.LJFF(str, aweme2 != null ? aweme2.getAid() : null) || this.LL.LJ == null) {
            C1895700zQm.LIZ.getClass();
            if (C1895720zQo.LIZJ) {
                C1895720zQo.LIZJ = false;
                C1895720zQo.LIZIZ.removeCallbacks(C1895720zQo.LJ);
            }
            Iterator it2 = ((ArrayList) C1895720zQo.LIZ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1895740zQq) it2.next()).LIZ();
            }
            C01GW<C1896490zS3> c01gw = C1896490zS3.LLJJIII;
            C1896490zS3 c1896490zS3LIZ = C739370SzP.LIZ();
            if (!c1896490zS3LIZ.LLILZ.isEmpty()) {
                c1896490zS3LIZ.LLJJ.LIZLLL();
            }
            ((IWatchVideoService) ServiceManager.get().getService(IWatchVideoService.class)).pausePlay();
        }
        return Unit.LIZ;
    }
}
