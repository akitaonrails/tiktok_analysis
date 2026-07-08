package X;

import Y.AfS162S0200000_28;
import Y.AkS489S0100000_28;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.configuration.filters.base.FilterAbilityModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.10MB, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10MB extends AbstractC19239910Ov {
    public final C1912470zrp LIZLLL;
    public final List<FilterAbilityModel> LJ;
    public final C01GW LJFF;

    @Override // X.AbstractC19239910Ov, X.C10ND
    public final C10QI LIZJ() {
        C19233810Mm.LIZ.getClass();
        return C19233810Mm.LIZ(C19234610Mu.class);
    }

    @Override // X.AbstractC19239910Ov, X.C10ND
    public final Pair<String, Boolean> LJFF() {
        int i = C1911460zqC.LIZ[((EnumC1911450zqB) C1911470zqD.LIZIZ.getValue()).ordinal()];
        if (i == 1) {
            return C10NE.LIZJ(this);
        }
        if (i == 2 || i == 3) {
            return new Pair<>("slogan_consent_ui_mode", Boolean.FALSE);
        }
        throw new C1954807lC();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, X.01kM] */
    @Override // X.AbstractC19239910Ov
    public final void LJI() {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = AbstractC19484711Kz.LJIJJLI(ComplianceServiceProvider.LJJIII()).LJJIJIIJI(C11S5.LIZ()).LJJIJLIJ().LJLIIIL(new AkS489S0100000_28(this, 6)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS162S0200000_28(this, (MutableLiveData<Integer>) c259800zU, (Function0<Unit>) 17));
    }

    @Override // X.C10ND
    public final List<FilterAbilityModel> getFilters() {
        return this.LJ;
    }

    public C10MB(C1912470zrp c1912470zrp, List<FilterAbilityModel> list) {
        super("consent_box");
        this.LIZLLL = c1912470zrp;
        this.LJ = list;
        this.LJFF = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(599));
    }
}
