package X;

import com.ss.android.ugc.profile.business.profile.info.identifier.page.repository.ProfileIdentifierAPI;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.09YD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09YD implements InterfaceC736910SvR<C09YB> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1708));
    public final C09YC LLILLJJLI = new C09YB() { // from class: X.09YC
        @Override // X.C09YB
        public final Object T(int i, String str, String str2, C2252808sA c2252808sA) {
            return ((ProfileIdentifierAPI) this.LL.LL.getValue()).getIdentifierDetails(i, str, str2, c2252808sA);
        }
    };

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LLILLJJLI;
    }
}
