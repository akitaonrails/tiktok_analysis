package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridContainerManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import kotlin.jvm.internal.AwS260S0300000_16;

/* JADX INFO: renamed from: X.0c3z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C997450c3z extends C0T4Y {
    public C997400c3u LIZIZ;
    public AbstractC1028360crq LIZJ;

    @Override // X.C0T2H
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.C0T2H
    public final boolean LJIIJJI(Aweme aweme) {
        return C1017070cZd.LLIIII(aweme);
    }

    @Override // X.C0T2H
    public final void LIZ(Context context, Aweme aweme) {
        if (C1017070cZd.LLIIII(aweme)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("remove cache ,cache key = ");
            sbLIZ.append(aweme.getAid());
            C2188811AlT.LIZIZ(sbLIZ);
            C811103Ev.LIZ("AdHybridSuperLikePreRender");
            LJIIIIZZ(context, aweme);
            AbstractC1028360crq abstractC1028360crq = this.LIZJ;
            if (abstractC1028360crq != null) {
                abstractC1028360crq.LJIL(aweme.getAid());
            }
        }
    }

    @Override // X.C0T2H
    public final void LJFF(Context context, Aweme aweme) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new C997400c3u();
        }
        C997400c3u c997400c3u = this.LIZIZ;
        if (c997400c3u != null) {
            c997400c3u.LIZIZ();
        }
        C1001410cAN c1001410cAN = C1001410cAN.LIZIZ;
        EnumC1001380cAK enumC1001380cAK = EnumC1001380cAK.SUPER_LIKE_OPERATION;
        if (c1001410cAN.LIZ(enumC1001380cAK)) {
            C1001420cAO c1001420cAO = new C1001420cAO(enumC1001380cAK.getTaskIdWithType(aweme.getAid()), EnumC599900Nfw.FEED);
            c1001420cAO.LIZJ = new AwS260S0300000_16(this, context, aweme, 0);
            c1001420cAO.LJ = (EnumC1001450cAR) C1001430cAP.LIZJ.getValue();
            c1001420cAO.LIZLLL = enumC1001380cAK;
            c1001420cAO.LJI = C0NO3.MAIN;
            c1001410cAN.LJI(c1001420cAO);
            return;
        }
        this.LIZJ = ((IAdHybridContainerManager) ServiceManager.get().getService(IAdHybridContainerManager.class)).LIZIZ(C1000520c8w.LIZ(context, aweme), C1000520c8w.LIZIZ(context, aweme), null);
    }

    public final void LJIIIIZZ(Context context, Aweme aweme) {
        if (this.LIZJ == null) {
            this.LIZJ = ((IAdHybridContainerManager) ServiceManager.get().getService(IAdHybridContainerManager.class)).LIZLLL(C1000520c8w.LIZ(context, aweme), C1000520c8w.LIZIZ(context, aweme));
        }
    }

    @Override // X.C0T2H
    public final void LJ(int i, Context context, List list) {
        if (i >= 0 && i < list.size() && !AwemeExtKt.isAdTraffic((Aweme) ListProtector.get(list, i))) {
            int i2 = 0;
            for (Aweme aweme : C13LP.LLIIII(list)) {
                if (C1017070cZd.LLIIII(aweme) && i2 + 6 < i) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("remove cache ,cache key = ");
                    sbLIZ.append(aweme.getAid());
                    C2188811AlT.LIZIZ(sbLIZ);
                    C811103Ev.LIZ("AdHybridSuperLikePreRender");
                    LJIIIIZZ(context, aweme);
                    AbstractC1028360crq abstractC1028360crq = this.LIZJ;
                    if (abstractC1028360crq != null) {
                        abstractC1028360crq.LJIL(aweme.getAid());
                    }
                }
                i2++;
            }
        }
    }
}
