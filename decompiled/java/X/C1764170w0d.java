package X;

import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto.SeaPdpHeadFeatures;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.trigger.PdpTriggerModel;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0w0d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1764170w0d implements InterfaceC1165550gR7 {
    public final InterfaceC665370Q7z LL;
    public final C04G0 LLILLJJLI;
    public List<PdpTriggerModel> LLILZ;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1581));
    public int LLILZIL = -1;

    @Override // X.InterfaceC1165550gR7
    public final List<PdpTriggerModel> LIZJ() {
        n nVar;
        k kVarLJJIIZ;
        List<PdpTriggerModel> listLIZ = this.LLILZ;
        if (listLIZ == null) {
            SeaPdpHeadFeatures seaPdpHeadFeaturesLJIIIZ = this.LLILLJJLI.LJIIIZ();
            if (seaPdpHeadFeaturesLJIIIZ == null || (nVar = seaPdpHeadFeaturesLJIIIZ.customConfig) == null || (kVarLJJIIZ = nVar.LJJIIZ("trigger")) == null || (listLIZ = C1202240hOI.LIZ(kVarLJJIIZ)) == null) {
                return null;
            }
            this.LLILZ = listLIZ;
        }
        return listLIZ;
    }

    @Override // X.InterfaceC1165550gR7
    public final int getIndex() {
        return this.LLILZIL;
    }

    public C1764170w0d(InterfaceC665370Q7z interfaceC665370Q7z, C04G1 c04g1) {
        this.LL = interfaceC665370Q7z;
        this.LLILLJJLI = c04g1;
    }

    @Override // X.InterfaceC1165550gR7
    public final void LIZ(String str, Map<String, ? extends Object> map) {
        C1757320vpa c1757320vpa = new C1757320vpa(null);
        c1757320vpa.LIZ = new WeakReference<>(this.LLILLJJLI);
        ISeaPdpCommunicationService iSeaPdpCommunicationService = (ISeaPdpCommunicationService) this.LLILLL.getValue();
        if (iSeaPdpCommunicationService != null) {
            iSeaPdpCommunicationService.EQ1(str, map, c1757320vpa);
        }
    }
}
