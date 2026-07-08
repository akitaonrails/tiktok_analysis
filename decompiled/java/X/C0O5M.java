package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0O5M, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O5M extends C09AY implements Function0<C0O5K> {
    public C0O5M() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0O5K] */
    @Override // kotlin.jvm.functions.Function0
    public final C0O5K invoke() {
        return new InterfaceC736910SvR<InterfaceC612170Nzj>() { // from class: X.0O5K
            @Override // X.InterfaceC736910SvR
            public final void release() {
            }

            @Override // X.InterfaceC736910SvR
            public final InterfaceC149400hg getOperator() {
                return new InterfaceC612170Nzj() { // from class: X.0O5J
                    @Override // X.InterfaceC612170Nzj
                    public final C0O5I k(Aweme aweme, String str, String str2, boolean z, long j) {
                        int i = !z ? 1 : 0;
                        C1206780hVc.LIZ(C786410Ut5.j4("start request api %s", Arrays.copyOf(new Object[]{"/aweme/v1/aweme/collect/"}, 1)));
                        C613960O6g c613960O6gLIZ = C613940O6e.LIZ().LIZ(new C0O5N(aweme.getAid(), i));
                        final String aid = aweme.getAid();
                        if (aid == null) {
                            aid = "";
                        }
                        C0O7F.LIZ(c613960O6gLIZ, new AbstractC614210O7f(aid) { // from class: X.0O7e
                            public final String LIZIZ;
                            public final C614260O7k LIZJ;

                            @Override // X.InterfaceC614350O7t
                            public final String LIZ() {
                                return this.LIZIZ;
                            }

                            @Override // X.AbstractC614210O7f
                            public final AbstractC614250O7j LIZIZ() {
                                return this.LIZJ;
                            }

                            {
                                this.LIZIZ = aid;
                                C614260O7k c614260O7k = C614260O7k.LIZIZ;
                                c614260O7k.LIZ = C614270O7l.LIZIZ.LIZ | c614260O7k.LIZ;
                                this.LIZJ = c614260O7k;
                            }
                        });
                        C0O7F.LJFF(c613960O6gLIZ, new C0O5L(new BaseResponse()));
                        return new C0O5I(c613960O6gLIZ.LIZIZ(), this.LL, aweme, str, i, str2, z, j);
                    }
                };
            }
        };
    }
}
