package X;

import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09Qg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2369609Qg {
    public final String LIZ;
    public final C557050Lt1 LIZIZ = new C557050Lt1(false);
    public volatile AnonymousClass0956 LIZJ;

    public final void LIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LIZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LIZJ = null;
        this.LIZIZ.LIZ(true, false);
    }

    public C2369609Qg(String str) {
        this.LIZ = str;
    }

    public final boolean LIZIZ(SkylightListViewModel skylightListViewModel, String str, Function0<Unit> function0) {
        if (!this.LIZIZ.LIZ(false, true)) {
            return false;
        }
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI(this.LIZ, str);
        function0.invoke();
        AnonymousClass0956 anonymousClass0956 = this.LIZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LIZJ = C23250099c.LIZLLL(skylightListViewModel.getAssemVMScope(), null, null, new C2369509Qf(this, null), 3);
        return true;
    }
}
