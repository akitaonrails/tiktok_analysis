package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.analytics.IIMGroupLiveAnalytics;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS103S1000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0i3c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227860i3c {
    public final AbstractC1225770i0F LIZ;
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public final C054G LIZIZ = C2296808zG.LIZ(new C1266260j3Y(CoroutineExceptionHandler.LJJLIL, this, 1).plus(C2296908zH.LIZ()));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3366));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(812));

    public C1227860i3c(AbstractC1225770i0F abstractC1225770i0F, String str, List<? extends IMUser> list) {
        this.LIZ = abstractC1225770i0F;
        this.LIZLLL = C452501pT.LIZIZ(new AwS103S1000000_19(str, 6));
        this.LJ = C452501pT.LIZIZ(new AwS563S0100000_19(list, (List<? extends AbstractC20562115d5>) 3365));
    }

    public static void LIZ(String str, String str2, String str3, HashMap map) {
        IIMGroupLiveAnalytics iIMGroupLiveAnalytics = (IIMGroupLiveAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMGroupLiveAnalytics.class);
        if (iIMGroupLiveAnalytics != null) {
            iIMGroupLiveAnalytics.LJ(str, str2, C461720I8s.LIZIZ(), str3, map, C0I0B.LJFF.LIZIZ());
        }
    }
}
