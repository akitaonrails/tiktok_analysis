package X;

import com.ss.android.ugc.aweme.configuration.filters.base.FilterAbilityModel;
import com.ss.android.ugc.aweme.journey.step.push.PushAuthPrepositionPageFragment;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import java.util.List;

/* JADX INFO: renamed from: X.10NH, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10NH extends C10NF<C1869040yjm> {
    public static boolean LJFF;
    public final List<FilterAbilityModel> LIZLLL;
    public final C1912470zrp LJ;

    @Override // X.C10NF, X.C10ND
    public final Boolean LJ() {
        return Boolean.valueOf(C10DR.LIZ(this.LJ.LIZ.LIZIZ()));
    }

    @Override // X.C10NF, X.C10ND
    public final List<FilterAbilityModel> getFilters() {
        return this.LIZLLL;
    }

    public C10NH(C1912470zrp c1912470zrp, List list) {
        super(list, C10NW.JOURNEY_PUSH_AUTH_PREPOSITION_PAGE, "push_auth_preposition_page");
        this.LIZLLL = list;
        this.LJ = c1912470zrp;
    }

    @Override // X.C10NJ
    public final C10P7<C1869040yjm> LIZLLL(final C1912470zrp c1912470zrp, final C10P6 c10p6) {
        return new C10PJ<C1869040yjm>(c1912470zrp, c10p6) { // from class: X.0zs2
            @Override // X.C10P7
            public final C10NW type() {
                return C10NW.JOURNEY_PUSH_AUTH_PREPOSITION_PAGE;
            }

            @Override // X.C10PJ
            public final NUJComponentFragment LJI(C1869040yjm c1869040yjm) {
                C10NH.LJFF = true;
                return new PushAuthPrepositionPageFragment();
            }
        };
    }
}
