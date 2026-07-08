package X;

import X.AbstractC1066304Ez;
import X.C1764410w11;
import com.bytedance.goda.v2.model.dto.GodaV2Feature;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.ItemModuleManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.SeaPdpBodyListHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.trigger.PdpTriggerModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0w0v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1764350w0v<VO extends AbstractC1066304Ez, VM extends C1764410w11<VO>> extends AbstractC1764400w10<VO> implements InterfaceC1165550gR7 {
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public boolean LLJILJIL;
    public VM LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public int LLJJI;

    public final void LJIIJJI() {
        this.LLILLL = false;
        C04CN c04cn = this.LLJ;
        if (c04cn != null) {
            c04cn.LLILLL = false;
            C04CP c04cp = c04cn.LLILZLL;
            if (c04cp != null) {
                c04cp.LJIIIIZZ("module_show_over", null, null, null);
            }
        }
        this.LLILLL = false;
        VM vm = this.LLJILJILJ;
        if (vm != null) {
            vm.LJIIJJI();
        }
        C04CN c04cn2 = this.LLJ;
        if (c04cn2 != null) {
            c04cn2.LLILLL = false;
            C04CP c04cp2 = c04cn2.LLILZLL;
            if (c04cp2 != null) {
                c04cp2.LJIIIIZZ("module_show_over", null, null, null);
            }
        }
    }

    @Override // X.InterfaceC1165550gR7
    public final List<PdpTriggerModel> LIZJ() {
        Map<String, Object> map;
        Object obj;
        List<PdpTriggerModel> listLIZ;
        InterfaceC1066404Fa interfaceC1066404Fa;
        Map<String, Object> mapLIZ;
        InterfaceC1066404Fa interfaceC1066404Fa2;
        Map<String, Object> mapLIZ2;
        WeakReference<InterfaceC1066404Fa> weakReference = this.LLILZIL.LJIJJ;
        Object obj2 = (weakReference == null || (interfaceC1066404Fa2 = weakReference.get()) == null || (mapLIZ2 = interfaceC1066404Fa2.LIZ()) == null) ? null : mapLIZ2.get("pdp_trigger_model");
        if (!(obj2 instanceof List) || (listLIZ = (List) obj2) == null) {
            GodaV2Feature godaV2Feature = this.LLILZIL.LJIIZILJ;
            if (godaV2Feature == null || (map = godaV2Feature.customConfig) == null || (obj = map.get("trigger")) == null || (listLIZ = C1202240hOI.LIZ(obj)) == null) {
                return null;
            }
            WeakReference<InterfaceC1066404Fa> weakReference2 = this.LLILZIL.LJIJJ;
            if (weakReference2 != null && (interfaceC1066404Fa = weakReference2.get()) != null && (mapLIZ = interfaceC1066404Fa.LIZ()) != null) {
                mapLIZ.put("pdp_trigger_model", listLIZ);
                return listLIZ;
            }
        }
        return listLIZ;
    }

    public final void LJIIL() {
        SeaPdpBodyListHelper seaPdpBodyListHelper = (SeaPdpBodyListHelper) this.LLJILLL.getValue();
        if (seaPdpBodyListHelper != null) {
            SeaPdpViewModel seaPdpViewModelLJIIIZ = seaPdpBodyListHelper.LL.LJIIIZ();
            seaPdpViewModelLJIIIZ.setState(new AwS605S0100000_26(seaPdpViewModelLJIIIZ.CR2(seaPdpViewModelLJIIIZ.LLJIJIL, false, false, false, false, false, false), (List<C1745680vWo>) 944));
        }
    }

    @Override // X.AbstractC1764400w10
    public final void LJIIJ() {
        super.LJIIJ();
        VM vm = this.LLJILJILJ;
        if (vm != null) {
            vm.LJIIJ();
        }
        C04CN c04cn = this.LLJ;
        if (c04cn != null) {
            c04cn.LJIIJ();
        }
    }

    @Override // X.InterfaceC1165550gR7
    public final int getIndex() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1165550gR7
    public void LIZ(String str, Map<String, ? extends Object> map) {
        C1757320vpa c1757320vpa = new C1757320vpa(null);
        c1757320vpa.LIZ = new WeakReference<>(this.LLILZIL);
        ISeaPdpCommunicationService iSeaPdpCommunicationService = (ISeaPdpCommunicationService) this.LLJJ.getValue();
        if (iSeaPdpCommunicationService != null) {
            iSeaPdpCommunicationService.EQ1(str, map, c1757320vpa);
        }
    }

    public AbstractC1764350w0v(InterfaceC665370Q7z interfaceC665370Q7z, VO vo, C04FN c04fn) {
        C1764410w11 c1764410w11;
        super(interfaceC665370Q7z, vo, c04fn);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS570S0100000_26(interfaceC665370Q7z, 1260));
        this.LLJI = c01gwLIZIZ;
        this.LLJIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(interfaceC665370Q7z, 1261));
        String str = c04fn.LJIIIZ;
        ItemModuleManager itemModuleManager = (ItemModuleManager) c01gwLIZIZ.getValue();
        VM vm = null;
        if (itemModuleManager != null && (c1764410w11 = (C1764410w11) ((LinkedHashMap) itemModuleManager.LL).get(str)) != null) {
            vm = (VM) c1764410w11;
        }
        this.LLJILJILJ = vm;
        this.LLJILLL = C452501pT.LIZIZ(new AwS570S0100000_26(interfaceC665370Q7z, 1262));
        this.LLJJ = C452501pT.LIZIZ(new AwS570S0100000_26(interfaceC665370Q7z, 1259));
        this.LLJJI = -1;
    }
}
