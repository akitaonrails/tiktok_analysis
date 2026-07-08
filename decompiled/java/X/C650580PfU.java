package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentAbility;

/* JADX INFO: renamed from: X.0PfU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C650580PfU {
    public SearchTopFragmentAbility LIZ;

    public final void LIZ(View view) {
        InterfaceC650540PfQ interfaceC650540PfQ;
        SearchTopFragmentAbility searchTopFragmentAbility;
        SearchTopFragmentAbility searchTopFragmentAbility2;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIJJI;
        Object objLU = null;
        if (this.LIZ == null) {
            Fragment fragmentLIZ = C946803n0.LIZ(view);
            if (fragmentLIZ != null && (interfaceC665370Q7zLJIIJJI = C1558360qeg.LJIIJJI(fragmentLIZ, null)) != null) {
                searchTopFragmentAbility2 = (SearchTopFragmentAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIJJI, SearchTopFragmentAbility.class, null);
            } else {
                searchTopFragmentAbility2 = null;
            }
            this.LIZ = searchTopFragmentAbility2;
        }
        SearchTopFragmentAbility searchTopFragmentAbility3 = this.LIZ;
        if (searchTopFragmentAbility3 != null) {
            objLU = searchTopFragmentAbility3.LU(view);
        }
        if ((objLU instanceof InterfaceC650540PfQ) && (interfaceC650540PfQ = (InterfaceC650540PfQ) objLU) != null && interfaceC650540PfQ.mm() && (searchTopFragmentAbility = this.LIZ) != null) {
            searchTopFragmentAbility.k01();
        }
    }
}
