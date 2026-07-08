package X;

import X.C1869040yjm;
import com.ss.android.ugc.aweme.configuration.filters.base.FilterAbilityModel;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.10NF, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public abstract class C10NF<T extends C1869040yjm> implements C10NJ<T> {
    public final List<FilterAbilityModel> LIZ;
    public final C10NW LIZIZ;
    public final String LIZJ;

    @Override // X.C10ND
    public C10QI LIZJ() {
        return null;
    }

    @Override // X.C10ND
    public Boolean LJ() {
        return null;
    }

    @Override // X.C10ND
    public final Boolean LIZIZ() {
        return C10NE.LIZIZ(this);
    }

    @Override // X.C10ND
    public Pair<String, Boolean> LJFF() {
        return C10NE.LIZJ(this);
    }

    @Override // X.C10ND
    @InterfaceC1294060jmO
    public List<FilterAbilityModel> LIZ() {
        return C13BV.INSTANCE;
    }

    @Override // X.C10ND
    public List<FilterAbilityModel> getFilters() {
        return this.LIZ;
    }

    @Override // X.C10ND
    public final String getId() {
        return this.LIZJ;
    }

    public C10NF(List<FilterAbilityModel> list, C10NW c10nw, String str) {
        this.LIZ = list;
        this.LIZIZ = c10nw;
        this.LIZJ = str;
    }
}
