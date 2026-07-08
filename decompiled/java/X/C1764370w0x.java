package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0w0x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1764370w0x extends AbstractC1764350w0v<C04DH, C1764490w19> implements InterfaceC1756930vox {
    public WeakReference<InterfaceC1764530w1D> LLJJIII;
    public C1764670w1R LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    public final C1764670w1R LJIILIIL() {
        C04FN c04fn = this.LLILZIL;
        String str = c04fn.LJIIIZ;
        Map mapLIZ = C12846050y.LIZ(c04fn.LJIILIIL);
        Map map = (Map) this.LLJJIJIIJIL.getValue();
        C1764490w19 c1764490w19 = (C1764490w19) this.LLJILJILJ;
        C1764610w1L c1764610w1L = new C1764610w1L(mapLIZ, map, c1764490w19 != null ? (Map) c1764490w19.LLJILJIL.getValue() : null, (Map) this.LLJJIJIL.getValue());
        C1757320vpa c1757320vpa = new C1757320vpa(null);
        c1757320vpa.LIZ = new WeakReference<>(this.LLILZIL);
        c1757320vpa.LJFF = new WeakReference<>(this);
        C1764670w1R c1764670w1R = new C1764670w1R(str, c1764610w1L, c1757320vpa);
        this.LLJJIJI = c1764670w1R;
        return c1764670w1R;
    }

    @Override // X.InterfaceC1756930vox
    public final void LJFF(C1756940voy c1756940voy) {
        InterfaceC1764530w1D interfaceC1764530w1D;
        WeakReference<InterfaceC1764530w1D> weakReference = this.LLJJIII;
        if (weakReference != null && (interfaceC1764530w1D = weakReference.get()) != null) {
            C1764670w1R c1764670w1RLJIILIIL = this.LLJJIJI;
            if (c1764670w1RLJIILIIL == null) {
                c1764670w1RLJIILIIL = LJIILIIL();
            }
            interfaceC1764530w1D.LIZIZ(c1764670w1RLJIILIIL, c1756940voy);
            return;
        }
        c1756940voy.getClass();
    }

    @Override // X.AbstractC1764350w0v, X.InterfaceC1165550gR7
    public final void LIZ(String str, Map<String, ? extends Object> map) {
        InterfaceC1764530w1D interfaceC1764530w1D;
        WeakReference<InterfaceC1764530w1D> weakReference = this.LLJJIII;
        if (weakReference != null && (interfaceC1764530w1D = weakReference.get()) != null) {
            interfaceC1764530w1D.LIZ(str, map);
            return;
        }
        C1757320vpa c1757320vpa = new C1757320vpa(null);
        c1757320vpa.LIZ = new WeakReference<>(this.LLILZIL);
        c1757320vpa.LJFF = new WeakReference<>(this);
        ISeaPdpCommunicationService iSeaPdpCommunicationService = (ISeaPdpCommunicationService) this.LLJJ.getValue();
        if (iSeaPdpCommunicationService == null) {
            return;
        }
        iSeaPdpCommunicationService.EQ1(str, map, c1757320vpa);
    }

    @Override // X.InterfaceC1756930vox
    public final void LIZIZ(Map<String, ? extends Object> map, boolean z) {
        Map map2;
        C1764490w19 c1764490w19;
        Map map3;
        if (z && (c1764490w19 = (C1764490w19) this.LLJILJILJ) != null && (map3 = (Map) c1764490w19.LLJILJIL.getValue()) != null) {
            map3.clear();
        }
        C1764490w19 c1764490w192 = (C1764490w19) this.LLJILJILJ;
        if (c1764490w192 != null && (map2 = (Map) c1764490w192.LLJILJIL.getValue()) != null) {
            map2.putAll(map);
        }
    }

    @Override // X.InterfaceC1756930vox
    public final void LIZLLL(Map<String, ? extends Object> map, boolean z) {
        if (z) {
            ((Map) this.LLJJIJIIJIL.getValue()).clear();
        }
        ((Map) this.LLJJIJIIJIL.getValue()).putAll(map);
    }

    public C1764370w0x(InterfaceC665370Q7z interfaceC665370Q7z, C04DH c04dh, C04FN c04fn) {
        super(interfaceC665370Q7z, c04dh, c04fn);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(460));
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(461));
    }
}
