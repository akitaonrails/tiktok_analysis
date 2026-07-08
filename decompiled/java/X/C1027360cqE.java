package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.security.IClientSecurityService;
import java.util.UUID;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS132S1200000_16;

/* JADX INFO: renamed from: X.0cqE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1027360cqE extends AbstractC1027370cqF {
    public final Aweme LIZJ;
    public final C01GW LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.19EG] */
    @Override // X.InterfaceC1027390cqH
    public final boolean LIZIZ() {
        C259800zU c259800zU = new C259800zU();
        ?? LIZIZ = C1388190mED.LIZIZ(LIZLLL());
        c259800zU.element = LIZIZ;
        if (LIZIZ == 0) {
            Activity activityLJFF = C2214201BlK.LJFF();
            c259800zU.element = activityLJFF != null ? C1388190mED.LIZIZ(activityLJFF) : 0;
        }
        if (c259800zU.element == 0) {
            return false;
        }
        String string = UUID.randomUUID().toString();
        LJ().LJ.getClass();
        AwS132S1200000_16 awS132S1200000_16 = new AwS132S1200000_16(this, (C1027360cqE) c259800zU, (C259800zU<C19EG>) string, (String) 0);
        if (!((IClientSecurityService) ServiceManager.get().getService(IClientSecurityService.class)).LJIIJJI()) {
            awS132S1200000_16.invoke();
            return true;
        }
        Context contextLIZLLL = LIZLLL();
        String str = LJ().LIZIZ.LIZ;
        EnumC822170WNb enumC822170WNb = EnumC822170WNb.Spark;
        Integer numLIZ = C1025770cnf.LIZ(LJ().LIZ.LJIIJJI, EnumC1027330cqB.WEBJUMP);
        C1554300qY8.LIZLLL(contextLIZLLL, str, enumC822170WNb, new ThirdPartyBizCert(numLIZ != null ? numLIZ.intValue() : 402657282), awS132S1200000_16);
        return true;
    }

    public C1027360cqE() {
        C1019830ce5 c1019830ce5LIZ = C988850bq7.LIZ();
        this.LIZJ = c1019830ce5LIZ != null ? c1019830ce5LIZ.LJIIL : null;
        this.LIZLLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(1));
    }

    @Override // X.InterfaceC1027390cqH
    public final boolean LIZ() {
        if (LJ().LIZIZ.LIZ.length() == 0 || LJ().LIZIZ.LJIIZILJ != 1) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isNine ");
        sbLIZ.append(LJ().LIZIZ.LJIJJ == 1);
        sbLIZ.append(" time ");
        sbLIZ.append(System.currentTimeMillis());
        C2188811AlT.LIZIZ(sbLIZ);
        if (LJ().LIZIZ.LJIJJ == 1) {
            return false;
        }
        return C2431009fo.LIZJ(LJ().LIZIZ.LIZ);
    }
}
