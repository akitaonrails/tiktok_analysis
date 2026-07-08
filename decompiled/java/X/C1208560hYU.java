package X;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.0hYU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208560hYU {
    public final EnumC2192761Arq LIZ;
    public final SharedPreferences LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;

    public final C1208480hYM LIZ() {
        return (C1208480hYM) this.LJ.getValue();
    }

    public final C1208490hYN LIZIZ() {
        return (C1208490hYN) this.LJFF.getValue();
    }

    public final C1208520hYQ LIZJ() {
        return (C1208520hYQ) this.LIZJ.getValue();
    }

    public final C1208570hYV LIZLLL() {
        return (C1208570hYV) this.LIZLLL.getValue();
    }

    public C1208560hYU(Context context, String str, EnumC2192761Arq enumC2192761Arq) {
        this.LIZ = enumC2192761Arq;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pns_location_");
        sbLIZ.append(enumC2192761Arq);
        sbLIZ.append("_freq_cache_");
        sbLIZ.append(str);
        this.LIZIZ = C810670Vr7.LIZJ(context, 0, C2188811AlT.LIZIZ(sbLIZ));
        this.LIZJ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 204));
        this.LIZLLL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 205));
        this.LJ = C452501pT.LIZIZ(new AwS579S0100000_35(this, 202));
        this.LJFF = C452501pT.LIZIZ(new AwS579S0100000_35(this, 203));
    }
}
