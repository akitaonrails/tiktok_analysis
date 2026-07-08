package X;

import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RRs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695980RRs implements InterfaceC695090ROh {
    public final /* synthetic */ C700170RdH LL;
    public final /* synthetic */ AbstractC738140SxQ LLILLJJLI;
    public final /* synthetic */ Function0<InterfaceC699200Rbi<?>> LLILLL;
    public final /* synthetic */ FcpNodeProtocol LLILZ;

    @Override // X.InterfaceC695090ROh
    public final List<InterfaceC695090ROh> LJ() {
        Iterable iterable;
        InterfaceC696030RRx interfaceC696030RRx;
        InterfaceC695090ROh interfaceC695090ROhS0;
        AssemSupervisor assemSupervisorLJI = C695930RRn.LJI(this.LLILLJJLI);
        if (assemSupervisorLJI == null || (iterable = assemSupervisorLJI.LLJILLL) == null) {
            iterable = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = iterable.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            FcpNodeProtocol fcpNodeProtocolLJFF = C695930RRn.LJFF((AbstractC738140SxQ) next);
            if (C123100dR.LIZ(fcpNodeProtocolLJFF != null ? fcpNodeProtocolLJFF.LLLII() : null)) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List<AbstractC738140SxQ> list = (List) pair.getFirst();
        List list2 = (List) pair.getSecond();
        C695930RRn.LJ(this.LLILLJJLI);
        if (C695930RRn.LIZLLL(list2)) {
            new C0NCW(list2);
            C0T6L.LIZLLL();
        }
        if (C695930RRn.LIZLLL(list)) {
            new C0NCX(list);
            C0T6L.LIZLLL();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof ReusedAssem) {
                arrayList3.add(obj);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            C0CNO.LIZLLL(0L, new C696010RRv((ReusedAssem) it3.next()));
        }
        ArrayList arrayList4 = new ArrayList();
        C700170RdH c700170RdH = this.LL;
        Function0<InterfaceC699200Rbi<?>> function0 = this.LLILLL;
        for (AbstractC738140SxQ abstractC738140SxQ : list) {
            arrayList4.add(new C695980RRs(abstractC738140SxQ, C695930RRn.LJFF(abstractC738140SxQ), c700170RdH, function0));
        }
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLJJLI;
        if ((interfaceC665370Q7z instanceof InterfaceC696030RRx) && (interfaceC696030RRx = (InterfaceC696030RRx) interfaceC665370Q7z) != null && (interfaceC695090ROhS0 = interfaceC696030RRx.s0()) != null) {
            arrayList4.add(interfaceC695090ROhS0);
        }
        return arrayList4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC695090ROh
    public final List<InterfaceC700010Rd1> LJII(C701040Reg c701040Reg) {
        ReusedAssem reusedAssem;
        FcpNodeProtocol fcpNodeProtocol;
        Function1<FcpNodeProtocol, Boolean> function1;
        InterfaceC700010Rd1 c699960Rcw;
        InterfaceC700010Rd1 interfaceC700010Rd1LIZ;
        AbstractC738140SxQ abstractC738140SxQ = this.LLILLJJLI;
        if ((abstractC738140SxQ instanceof ReusedAssem) && (reusedAssem = (ReusedAssem) abstractC738140SxQ) != null) {
            ArrayList arrayList = new ArrayList();
            FcpNodeProtocol fcpNodeProtocol2 = this.LLILZ;
            if (fcpNodeProtocol2 != null) {
                C700170RdH c700170RdH = this.LL;
                Function0<InterfaceC699200Rbi<?>> function0 = this.LLILLL;
                Function1<FcpNodeProtocol, Boolean> function12 = c700170RdH.LJI;
                if (function12 == null || function12.invoke(fcpNodeProtocol2).booleanValue()) {
                    if (c701040Reg != null && (interfaceC700010Rd1LIZ = c701040Reg.LIZJ(fcpNodeProtocol2.LLLII())) != null) {
                        if (interfaceC700010Rd1LIZ.getType() == EnumC696040RRy.TRIGGER) {
                            interfaceC700010Rd1LIZ = C695930RRn.LIZ(reusedAssem, fcpNodeProtocol2, c700170RdH, function0, true);
                        }
                    } else {
                        interfaceC700010Rd1LIZ = C695930RRn.LIZ(reusedAssem, fcpNodeProtocol2, c700170RdH, function0, false);
                    }
                    arrayList.add(interfaceC700010Rd1LIZ);
                }
            }
            ArrayList<AbstractC634910OvJ> arrayList2 = new ArrayList();
            C694040RKg.LIZ(reusedAssem, false, new C695990RRt(arrayList2));
            C700170RdH c700170RdH2 = this.LL;
            Function0<InterfaceC699200Rbi<?>> function02 = this.LLILLL;
            for (AbstractC634910OvJ abstractC634910OvJ : arrayList2) {
                if ((abstractC634910OvJ instanceof FcpNodeProtocol) && (fcpNodeProtocol = (FcpNodeProtocol) abstractC634910OvJ) != null && ((function1 = this.LL.LJI) == null || function1.invoke(fcpNodeProtocol).booleanValue())) {
                    if (c701040Reg == null || (c699960Rcw = c701040Reg.LIZJ(fcpNodeProtocol.LLLII())) == null || c699960Rcw.getType() == EnumC696040RRy.ASSEM) {
                        c699960Rcw = new C699960Rcw(fcpNodeProtocol, c700170RdH2, function02, abstractC634910OvJ);
                    }
                    arrayList.add(c699960Rcw);
                }
            }
            return C13LP.LJJJJLI(arrayList);
        }
        return C13BV.INSTANCE;
    }

    public C695980RRs(AbstractC738140SxQ abstractC738140SxQ, FcpNodeProtocol fcpNodeProtocol, C700170RdH c700170RdH, Function0 function0) {
        this.LL = c700170RdH;
        this.LLILLJJLI = abstractC738140SxQ;
        this.LLILLL = function0;
        this.LLILZ = fcpNodeProtocol;
    }
}
