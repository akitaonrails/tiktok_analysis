package X;

import android.view.View;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.model.banner.ClientStandardModel;
import com.ss.android.ugc.aweme.feed.model.banner.FcpUiTemplate;
import java.util.Map;
import kotlin.jvm.internal.AwS11S1010000_11;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS160S1100000_11;
import kotlin.jvm.internal.AwS54S0010000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS94S0210000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RfO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701480RfO implements InterfaceC702260Rge {
    public final String LIZ;
    public final ReusedUIAssem<? extends C03H5> LIZIZ;
    public final InterfaceC702040RgI LIZJ;
    public final InterfaceC700020Rd2<?> LIZLLL;
    public final InterfaceC700740ReC LJ;
    public final C701670Rfh LJFF;
    public final C704830Rkn LJI;
    public final C01GW LJII = C452501pT.LIZIZ(new C702130RgR());

    @Override // X.InterfaceC702260Rge
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC702260Rge
    public final boolean LIZIZ(String str) {
        Map<String, FcpUiTemplate> map;
        ClientStandardModel clientStandardModelKn = this.LJ.kn(this.LIZ);
        if (clientStandardModelKn != null && (map = clientStandardModelKn.componentsTemplateMap) != null && map.get(str) != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC702260Rge
    public final void LIZJ(String str) {
        FcpUiTemplate fcpUiTemplate;
        Map<String, FcpUiTemplate> map;
        ClientStandardModel clientStandardModelKn = this.LJ.kn(this.LIZ);
        if (clientStandardModelKn != null && (map = clientStandardModelKn.componentsTemplateMap) != null) {
            fcpUiTemplate = map.get(str);
            if (fcpUiTemplate != null) {
                fcpUiTemplate.prepare();
            }
        } else {
            fcpUiTemplate = null;
        }
        C0CNO.LIZLLL(0L, new AwS127S1200000_11(this, str, fcpUiTemplate, 7));
    }

    @Override // X.InterfaceC702260Rge
    public final void LJ(String str) {
        C0CNO.LIZLLL(0L, new AwS160S1100000_11(this, str, 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC702260Rge
    public final ReusedAssem<?> LJFF(String str) {
        Iterable<AbstractC738140SxQ> iterable;
        AssemSupervisor assemSupervisorLJI = C695930RRn.LJI(this.LIZIZ);
        if (assemSupervisorLJI == null || (iterable = assemSupervisorLJI.LLJILLL) == null) {
            iterable = C13BV.INSTANCE;
        }
        for (AbstractC738140SxQ abstractC738140SxQ : iterable) {
            if ((abstractC738140SxQ instanceof InterfaceC701660Rfg) && Intrinsics.LJFF(((InterfaceC701660Rfg) abstractC738140SxQ).G2(), str)) {
                this.LIZLLL.LJLI();
                new AwS555S0100000_11(abstractC738140SxQ, 1383);
                C0T6L.LIZLLL();
                if (abstractC738140SxQ instanceof ReusedAssem) {
                    return (ReusedAssem) abstractC738140SxQ;
                }
                return null;
            }
        }
        return null;
    }

    @Override // X.InterfaceC702260Rge
    public final void LIZ(String str, boolean z) {
        C694010RKd c694010RKdInvoke = this.LJFF.invoke(str);
        View viewInvoke = c694010RKdInvoke.LLILLJJLI;
        if (viewInvoke == null) {
            viewInvoke = c694010RKdInvoke.LL.invoke();
            c694010RKdInvoke.LLILLJJLI = viewInvoke;
        }
        C0CNO.LIZLLL(0L, new AwS94S0210000_11(z, viewInvoke, this, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJI(String str, ReusedAssem<?> reusedAssem, boolean z, FcpUiTemplate fcpUiTemplate) {
        this.LIZLLL.LJLI();
        new AwS11S1010000_11(str, z, 3);
        C0T6L.LIZLLL();
        this.LIZLLL.LJLI();
        new AwS54S0010000_11(z, 3);
        C0T6L.LIZLLL();
        if (reusedAssem == 0 || reusedAssem.LLILLJJLI == z) {
            return;
        }
        if (reusedAssem instanceof InterfaceC701660Rfg) {
            InterfaceC701660Rfg interfaceC701660Rfg = (InterfaceC701660Rfg) reusedAssem;
            interfaceC701660Rfg.F0();
            if (fcpUiTemplate != null) {
                interfaceC701660Rfg.Jk(fcpUiTemplate);
            }
        }
        C724100Sam.LIZ(reusedAssem, z);
    }

    public C701480RfO(String str, ReusedUIAssem reusedUIAssem, C616040OEg c616040OEg, C0RYN c0ryn, InterfaceC700740ReC interfaceC700740ReC, C701670Rfh c701670Rfh, C704830Rkn c704830Rkn) {
        this.LIZ = str;
        this.LIZIZ = reusedUIAssem;
        this.LIZJ = c616040OEg;
        this.LIZLLL = c0ryn;
        this.LJ = interfaceC700740ReC;
        this.LJFF = c701670Rfh;
        this.LJI = c704830Rkn;
    }
}
