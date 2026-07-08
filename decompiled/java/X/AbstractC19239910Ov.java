package X;

import com.ss.android.ugc.aweme.configuration.filters.base.FilterAbilityModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.10Ov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC19239910Ov implements C10ND {
    public final String LIZ;
    public boolean LIZIZ = false;
    public C10MF LIZJ;

    @Override // X.C10ND
    public C10QI LIZJ() {
        return null;
    }

    @Override // X.C10ND
    public Boolean LJ() {
        return null;
    }

    public abstract void LJI();

    @Override // X.C10ND
    public final Boolean LIZIZ() {
        return C10NE.LIZIZ(this);
    }

    @Override // X.C10ND
    public Pair<String, Boolean> LJFF() {
        return C10NE.LIZJ(this);
    }

    public final void LJII() {
        String str;
        Pair<String, Boolean> pairLJFF = LJFF();
        if (!pairLJFF.getSecond().booleanValue() || this.LIZIZ) {
            C10MF c10mf = this.LIZJ;
            if (c10mf != null) {
                c10mf.onEnd();
                return;
            }
            return;
        }
        String str2 = C19240310Oz.LIZ;
        String str3 = this.LIZ;
        C19240310Oz.LJII = C19240310Oz.LJI;
        C19240310Oz.LJI = str3;
        ((ArrayList) C19240310Oz.LJIIIIZZ).add(str3);
        C10SW.LIZ.LJIIJ(this.LIZ);
        C19240010Ow c19240010Ow = C19240010Ow.LIZ;
        C10OL.LIZ.getClass();
        long j = C10OL.LIZIZ;
        String str4 = this.LIZ;
        String first = pairLJFF.getFirst();
        C10PO.LIZ.getClass();
        C10P6 c10p6 = C10PO.LIZIZ;
        if (c10p6 == null || (str = c10p6.LIZIZ.LJII) == null) {
            str = "";
        }
        c19240010Ow.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(j, "config_id");
        c2344009Gk.LJIIIIZZ("name", str4);
        c2344009Gk.LJIIIIZZ("page", str);
        c2344009Gk.LJIIIIZZ("hit_filter", first);
        C19240010Ow.LIZJ("dialog_ability_show", c2344009Gk.LIZ);
        LJI();
    }

    @Override // X.C10ND
    @InterfaceC1294060jmO
    public final List<FilterAbilityModel> LIZ() {
        return C13BV.INSTANCE;
    }

    @Override // X.C10ND
    public final String getId() {
        return this.LIZ;
    }

    public AbstractC19239910Ov(String str) {
        this.LIZ = str;
    }
}
