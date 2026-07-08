package X;

import android.content.Context;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0hL8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1200280hL8 {
    public static final C01GW<C1200280hL8> LIZJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(552));
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(554));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(553));

    public final ILocationBaseServiceForMT LIZIZ() {
        return (ILocationBaseServiceForMT) this.LIZ.getValue();
    }

    public final boolean LIZJ() {
        C1200940hMC c1200940hMC = C1200940hMC.LIZ;
        Context context = (Context) this.LIZIZ.getValue();
        c1200940hMC.getClass();
        return C1200940hMC.LIZIZ(context);
    }

    public final EnumC1200290hL9 LIZ() {
        if (!LIZJ()) {
            return EnumC1200290hL9.NOT_GRANTED;
        }
        return (!LIZIZ().LJIIJ() && LIZIZ().LJJIJ() && LIZIZ().LJ((Context) this.LIZIZ.getValue())) ? EnumC1200290hL9.PRECISE : EnumC1200290hL9.COARSE;
    }
}
