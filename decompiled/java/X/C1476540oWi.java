package X;

import com.ss.ttvideoengine.TTVideoEngine;

/* JADX INFO: renamed from: X.0oWi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1476540oWi extends AbstractC1476560oWk {
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0oWj] */
    public final C1479300obA LIZ() {
        C1478040oZ8 c1478040oZ8 = C607330Nrv.LIZ;
        C1480730odT iSimPlayerPlaySessionConfig = c1478040oZ8.LIZ().getISimPlayerPlaySessionConfig(this.LIZ.LIZJ);
        if (c1478040oZ8.LIZIZ().enableLazyLoadVideoDecode()) {
            TTVideoEngine.LLFII(737, 1);
        }
        C1479300obA c1480620odI = C1474810oTv.LLJJJ() ? new C1480620odI(new C1480700odQ(iSimPlayerPlaySessionConfig) { // from class: X.0oWj
            {
                EnumC1479760obu enumC1479760obu = EnumC1479760obu.TT;
            }
        }, this.LIZ) : new C1479300obA(new C1480700odQ(iSimPlayerPlaySessionConfig) { // from class: X.0oWj
            {
                EnumC1479760obu enumC1479760obu = EnumC1479760obu.TT;
            }
        }, this.LIZ);
        if (C1150504el.LIZ().LJII) {
            C1150504el.LIZ().LJI("player_init_build_duration", false);
        }
        return c1480620odI;
    }

    public C1476540oWi(C1476570oWl c1476570oWl) {
        super(c1476570oWl);
    }
}
