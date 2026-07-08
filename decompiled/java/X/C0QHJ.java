package X;

import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.search.entry.visualsearch.ability.VisualSearchTagAbility;
import com.ss.android.ugc.aweme.search.entry.visualsearch.ui.SearchVisualTagComponentTrigger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QHJ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QHJ implements InterfaceC634440OuY {
    public static final C0QHJ LIZ = new C0QHJ();

    @Override // X.InterfaceC634440OuY
    public final C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> C0() {
        return C13LE.LIZ(SearchVisualTagComponentTrigger.class);
    }

    @Override // X.InterfaceC634440OuY
    public final boolean LJIIZILJ() {
        C0QRE.LIZ.getClass();
        return C0QRE.LIZ() && C669350QNh.LIZ();
    }

    @Override // X.InterfaceC634440OuY
    public final boolean LLI() {
        return C669350QNh.LIZ();
    }

    @Override // X.InterfaceC634440OuY
    public final VisualSearchTagAbility LLIL(InterfaceC665370Q7z interfaceC665370Q7z) {
        if (interfaceC665370Q7z == null) {
            return null;
        }
        VisualSearchTagAbility.LJJIL.getClass();
        return (VisualSearchTagAbility) C1558520qew.LIZ(interfaceC665370Q7z, VisualSearchTagAbility.class, null);
    }

    @Override // X.InterfaceC634440OuY
    public final void LJI(String str, String str2, String str3, String str4, boolean z) {
        if (Intrinsics.LJFF(((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getVisualSearchTagFailTipSwitch(), Boolean.TRUE)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Visual Tag Show Fail, reason is ");
            sbLIZ.append(str4);
            C2042107zH.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        C1255704vj.LIZ().LJI(str, str2, str3, str4, z);
    }
}
