package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.json.JSONException;
import tikcast.linkmic.common.MultiGuestLayoutExtra;

/* JADX INFO: renamed from: X.1AZg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181501AZg implements InterfaceC2183461Acq {
    public final String LL;
    public final HashMap<InterfaceC2181591AZp, EnumC965730bEp> LLILLJJLI = new HashMap<>();
    public InterfaceC2181591AZp LLILLL;
    public C972840bQI LLILZ;

    @Override // X.InterfaceC2183461Acq
    @InterfaceC1294060jmO
    public final void LIZJ(C1AZU c1azu, C2182171Aal c2182171Aal, C2181851AaF c2181851AaF) {
    }

    @Override // X.InterfaceC2183461Acq
    @InterfaceC1294060jmO
    public final C2181531AZj LJI(C1AZU c1azu, C2181531AZj c2181531AZj, C2181851AaF c2181851AaF) {
        return c2181531AZj;
    }

    @Override // X.InterfaceC2183461Acq
    @InterfaceC1294060jmO
    public final void LJII(C1AZU c1azu, List<C2181741Aa4> list, C2182111Aaf c2182111Aaf, C2181851AaF c2181851AaF) {
    }

    @Override // X.InterfaceC2183461Acq
    @InterfaceC1294060jmO
    public final void LJIJI(C1AZU c1azu, C2182031AaX c2182031AaX, List<C2181811AaB> list, C2181851AaF c2181851AaF) {
    }

    @Override // X.InterfaceC2183461Acq
    @InterfaceC1294060jmO
    public final void LJIJJ(C1AZU c1azu, C2182171Aal c2182171Aal, C2181851AaF c2181851AaF) {
    }

    public C2181501AZg(String str) {
        this.LL = str;
    }

    public final void LJIL(InterfaceC2181591AZp interfaceC2181591AZp) {
        int iHashCode;
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setLayoutDelegate: ");
        if (interfaceC2181591AZp != null) {
            iHashCode = interfaceC2181591AZp.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ.append(iHashCode);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLL = interfaceC2181591AZp;
    }

    public final void LIZIZ(int i, String str) throws JSONException {
        C972840bQI c972840bQI = this.LLILZ;
        if (c972840bQI != null) {
            HashMap map = new HashMap();
            map.put("code", String.valueOf(i));
            map.put("message", str);
            c972840bQI.LIZ(new C972850bQJ("livesdk_linkmic_layout_layer_init", map));
        }
        Iterator it2 = C2097808Js.LJIL(this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC2181591AZp) ((Pair) it2.next()).getFirst()).LJIIJ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF(this.LL, "call back [onPipelineWillStart] exception", e);
            }
        }
        InterfaceC2181591AZp interfaceC2181591AZp = this.LLILLL;
        if (interfaceC2181591AZp != null) {
            interfaceC2181591AZp.LJIIJ();
        }
    }

    @Override // X.InterfaceC2183461Acq
    public final void LIZLLL(C1AZU c1azu, C1AZU c1azu2, C2181851AaF c2181851AaF) {
        boolean z;
        EnumC965730bEp enumC965730bEpLJIIL = C2181511AZh.LJIIL(c1azu);
        EnumC965730bEp enumC965730bEpLJIIL2 = C2181511AZh.LJIIL(c1azu2);
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatch onLayoutArchTypeDidSwitch, old=");
        sbLIZ.append(c1azu);
        sbLIZ.append(", new=");
        sbLIZ.append(c1azu2);
        sbLIZ.append(", source=");
        sbLIZ.append(c2181851AaF.LIZ);
        sbLIZ.append(", delegate_count=");
        sbLIZ.append(this.LLILLJJLI.size());
        sbLIZ.append(", has_single_delegate=");
        if (this.LLILLL != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        Iterator it2 = C2097808Js.LJIL(this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC2181591AZp) ((Pair) it2.next()).getFirst()).LJIILIIL(enumC965730bEpLJIIL, enumC965730bEpLJIIL2, C2181511AZh.LJFF(c2181851AaF));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF(this.LL, "call back [onLayoutArchDidChanged] exception", e);
            }
        }
        try {
            InterfaceC2181591AZp interfaceC2181591AZp = this.LLILLL;
            if (interfaceC2181591AZp != null) {
                interfaceC2181591AZp.LJIILIIL(enumC965730bEpLJIIL, enumC965730bEpLJIIL2, C2181511AZh.LJFF(c2181851AaF));
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20441214yg.LJFF(this.LL, "call back [onLayoutArchDidChanged][single_delegate] exception", e2);
        }
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJFF(C1AZU c1azu, C2182221Aaq c2182221Aaq, C2181851AaF c2181851AaF) {
        boolean z;
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatch onLayoutUpdateAbort, archType=");
        sbLIZ.append(c1azu);
        sbLIZ.append(", source=");
        sbLIZ.append(c2181851AaF.LIZ);
        sbLIZ.append(", code=");
        sbLIZ.append(c2182221Aaq.LIZ);
        sbLIZ.append(", msg=");
        sbLIZ.append(c2182221Aaq.LIZIZ);
        sbLIZ.append(", delegate_count=");
        sbLIZ.append(this.LLILLJJLI.size());
        sbLIZ.append(", has_single_delegate=");
        if (this.LLILLL != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        List listLJIL = C2097808Js.LJIL(this.LLILLJJLI);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIL) {
            if (((EnumC965730bEp) ((Pair) obj).getSecond()).getLinkArchType() == c1azu || c1azu == C1AZU.Unknown) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC2181591AZp) ((Pair) it2.next()).getFirst()).LIZJ(c2182221Aaq.LIZ.intoInt(), c2182221Aaq.LIZIZ, C2181511AZh.LJFF(c2181851AaF));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF(this.LL, "call back [onLayoutUpdateAbort] exception", e);
            }
        }
        try {
            InterfaceC2181591AZp interfaceC2181591AZp = this.LLILLL;
            if (interfaceC2181591AZp != null) {
                interfaceC2181591AZp.LIZJ(c2182221Aaq.LIZ.intoInt(), c2182221Aaq.LIZIZ, C2181511AZh.LJFF(c2181851AaF));
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20441214yg.LJFF(this.LL, "call back [onLayoutUpdateAbort][single_delegate] exception", e2);
        }
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJIIJJI(C1AZU c1azu, C1AZU c1azu2, C2181851AaF c2181851AaF) {
        boolean z;
        EnumC965730bEp enumC965730bEpLJIIL = C2181511AZh.LJIIL(c1azu);
        EnumC965730bEp enumC965730bEpLJIIL2 = C2181511AZh.LJIIL(c1azu2);
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatch onLayoutArchTypeWillSwitch, old=");
        sbLIZ.append(c1azu);
        sbLIZ.append(", new=");
        sbLIZ.append(c1azu2);
        sbLIZ.append(", source=");
        sbLIZ.append(c2181851AaF.LIZ);
        sbLIZ.append(", delegate_count=");
        sbLIZ.append(this.LLILLJJLI.size());
        sbLIZ.append(", has_single_delegate=");
        if (this.LLILLL != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        Iterator it2 = C2097808Js.LJIL(this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC2181591AZp) ((Pair) it2.next()).getFirst()).LJIJJ(enumC965730bEpLJIIL, enumC965730bEpLJIIL2, C2181511AZh.LJFF(c2181851AaF));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF(this.LL, "call back [onLayoutArchWillChange] exception", e);
            }
        }
        try {
            InterfaceC2181591AZp interfaceC2181591AZp = this.LLILLL;
            if (interfaceC2181591AZp != null) {
                interfaceC2181591AZp.LJIJJ(enumC965730bEpLJIIL, enumC965730bEpLJIIL2, C2181511AZh.LJFF(c2181851AaF));
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20441214yg.LJFF(this.LL, "call back [onLayoutArchWillChange][single_delegate] exception", e2);
        }
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJIILIIL(C1AZU c1azu, C2182221Aaq c2182221Aaq, C2181851AaF c2181851AaF) {
        boolean z;
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatch onLayoutError, archType=");
        sbLIZ.append(c1azu);
        sbLIZ.append(", source=");
        sbLIZ.append(c2181851AaF.LIZ);
        sbLIZ.append(", code=");
        sbLIZ.append(c2182221Aaq.LIZ);
        sbLIZ.append(", msg=");
        sbLIZ.append(c2182221Aaq.LIZIZ);
        sbLIZ.append(", delegate_count=");
        sbLIZ.append(this.LLILLJJLI.size());
        sbLIZ.append(", has_single_delegate=");
        if (this.LLILLL != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        List listLJIL = C2097808Js.LJIL(this.LLILLJJLI);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIL) {
            if (((EnumC965730bEp) ((Pair) obj).getSecond()).getLinkArchType() == c1azu || c1azu == C1AZU.Unknown) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC2181591AZp) ((Pair) it2.next()).getFirst()).LJ(c2182221Aaq.LIZ.intoInt(), c2182221Aaq.LIZIZ, C2181511AZh.LJFF(c2181851AaF));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF(this.LL, "call back [onLayoutError] exception", e);
            }
        }
        try {
            InterfaceC2181591AZp interfaceC2181591AZp = this.LLILLL;
            if (interfaceC2181591AZp != null) {
                interfaceC2181591AZp.LJ(c2182221Aaq.LIZ.intoInt(), c2182221Aaq.LIZIZ, C2181511AZh.LJFF(c2181851AaF));
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20441214yg.LJFF(this.LL, "call back [onLayoutError][single_delegate] exception", e2);
        }
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJIILJJIL(C1AZU c1azu, String str, C2181851AaF c2181851AaF) {
        boolean z;
        String str2 = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatch onLayoutWillEnd, archType=");
        sbLIZ.append(c1azu);
        sbLIZ.append(", source=");
        sbLIZ.append(c2181851AaF.LIZ);
        sbLIZ.append(", layout_key=");
        sbLIZ.append(str);
        sbLIZ.append(", delegate_count=");
        sbLIZ.append(this.LLILLJJLI.size());
        sbLIZ.append(", has_single_delegate=");
        if (this.LLILLL != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
        List listLJIL = C2097808Js.LJIL(this.LLILLJJLI);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIL) {
            if (((EnumC965730bEp) ((Pair) obj).getSecond()).getLinkArchType() == c1azu || c1azu == C1AZU.Unknown) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC2181591AZp) ((Pair) it2.next()).getFirst()).LJIIZILJ(str, C2181511AZh.LJFF(c2181851AaF));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF(this.LL, "call back [onLayoutWillEnd] exception", e);
            }
        }
        try {
            InterfaceC2181591AZp interfaceC2181591AZp = this.LLILLL;
            if (interfaceC2181591AZp != null) {
                interfaceC2181591AZp.LJIIZILJ(str, C2181511AZh.LJFF(c2181851AaF));
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20441214yg.LJFF(this.LL, "call back [onLayoutWillEnd][single_delegate] exception", e2);
        }
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJIILLIIL(C1AZU c1azu, String str, C2181851AaF c2181851AaF) {
        boolean z;
        String str2 = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatch onLayoutWillBegin, archType=");
        sbLIZ.append(c1azu);
        sbLIZ.append(", source=");
        sbLIZ.append(c2181851AaF.LIZ);
        sbLIZ.append(", layout_key=");
        sbLIZ.append(str);
        sbLIZ.append(", delegate_count=");
        sbLIZ.append(this.LLILLJJLI.size());
        sbLIZ.append(", has_single_delegate=");
        if (this.LLILLL != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
        List listLJIL = C2097808Js.LJIL(this.LLILLJJLI);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIL) {
            if (((EnumC965730bEp) ((Pair) obj).getSecond()).getLinkArchType() == c1azu || c1azu == C1AZU.Unknown) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC2181591AZp) ((Pair) it2.next()).getFirst()).LJIILJJIL(str, C2181511AZh.LJFF(c2181851AaF));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF(this.LL, "call back [onLayoutWillBegin] exception", e);
            }
        }
        try {
            InterfaceC2181591AZp interfaceC2181591AZp = this.LLILLL;
            if (interfaceC2181591AZp != null) {
                interfaceC2181591AZp.LJIILJJIL(str, C2181511AZh.LJFF(c2181851AaF));
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20441214yg.LJFF(this.LL, "call back [onLayoutWillBegin][single_delegate] exception", e2);
        }
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJIIZILJ(C1AZU c1azu, String str, C2181851AaF c2181851AaF) {
        boolean z;
        String str2 = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatch onLayoutDidEnd, archType=");
        sbLIZ.append(c1azu);
        sbLIZ.append(", source=");
        sbLIZ.append(c2181851AaF.LIZ);
        sbLIZ.append(", layout_key=");
        sbLIZ.append(str);
        sbLIZ.append(", delegate_count=");
        sbLIZ.append(this.LLILLJJLI.size());
        sbLIZ.append(", has_single_delegate=");
        if (this.LLILLL != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
        List listLJIL = C2097808Js.LJIL(this.LLILLJJLI);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIL) {
            if (((EnumC965730bEp) ((Pair) obj).getSecond()).getLinkArchType() == c1azu || c1azu == C1AZU.Unknown) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC2181591AZp) ((Pair) it2.next()).getFirst()).LJIJ(str, C2181511AZh.LJFF(c2181851AaF));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF(this.LL, "call back [onLayoutDidEnd] exception", e);
            }
        }
        try {
            InterfaceC2181591AZp interfaceC2181591AZp = this.LLILLL;
            if (interfaceC2181591AZp != null) {
                interfaceC2181591AZp.LJIJ(str, C2181511AZh.LJFF(c2181851AaF));
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20441214yg.LJFF(this.LL, "call back [onLayoutDidEnd][single_delegate] exception", e2);
        }
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJIJ(C1AZU c1azu, String str, C2181851AaF c2181851AaF) {
        boolean z;
        String str2 = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatch onLayoutDidBegin, archType=");
        sbLIZ.append(c1azu);
        sbLIZ.append(", source=");
        sbLIZ.append(c2181851AaF.LIZ);
        sbLIZ.append(", layout_key=");
        sbLIZ.append(str);
        sbLIZ.append(", delegate_count=");
        sbLIZ.append(this.LLILLJJLI.size());
        sbLIZ.append(", has_single_delegate=");
        if (this.LLILLL != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
        List listLJIL = C2097808Js.LJIL(this.LLILLJJLI);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIL) {
            if (((EnumC965730bEp) ((Pair) obj).getSecond()).getLinkArchType() == c1azu || c1azu == C1AZU.Unknown) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC2181591AZp) ((Pair) it2.next()).getFirst()).LJIILL(str, C2181511AZh.LJFF(c2181851AaF));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF(this.LL, "call back [onLayoutDidBegin] exception", e);
            }
        }
        try {
            InterfaceC2181591AZp interfaceC2181591AZp = this.LLILLL;
            if (interfaceC2181591AZp != null) {
                interfaceC2181591AZp.LJIILL(str, C2181511AZh.LJFF(c2181851AaF));
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20441214yg.LJFF(this.LL, "call back [onLayoutDidBegin][single_delegate] exception", e2);
        }
    }

    @Override // X.InterfaceC2183461Acq
    public final void LIZ(C1AZU c1azu, C1283230jUv c1283230jUv, C1CXK c1cxk, C1CXK c1cxk2) {
        EnumC965730bEp enumC965730bEpLJIIL = C2181511AZh.LJIIL(c1azu);
        List listLJIL = C2097808Js.LJIL(this.LLILLJJLI);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIL) {
            if (((EnumC965730bEp) ((Pair) obj).getSecond()).getLinkArchType() == c1azu || c1azu == C1AZU.Unknown) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC2181591AZp) ((Pair) it2.next()).getFirst()).LJJI(enumC965730bEpLJIIL, c1283230jUv, C2181511AZh.LIZIZ(c1cxk), C2181511AZh.LIZIZ(c1cxk2));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF(this.LL, "call back [onRtcConnectionStateChange] exception", e);
            }
        }
        InterfaceC2181591AZp interfaceC2181591AZp = this.LLILLL;
        if (interfaceC2181591AZp != null) {
            interfaceC2181591AZp.LJJI(enumC965730bEpLJIIL, c1283230jUv, C2181511AZh.LIZIZ(c1cxk), C2181511AZh.LIZIZ(c1cxk2));
        }
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJ(C1AZU c1azu, C1283230jUv c1283230jUv, boolean z, boolean z2) {
        EnumC965730bEp enumC965730bEpLJIIL = C2181511AZh.LJIIL(c1azu);
        List listLJIL = C2097808Js.LJIL(this.LLILLJJLI);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIL) {
            if (((EnumC965730bEp) ((Pair) obj).getSecond()).getLinkArchType() == c1azu || c1azu == C1AZU.Unknown) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC2181591AZp) ((Pair) it2.next()).getFirst()).LIZIZ(enumC965730bEpLJIIL, c1283230jUv, z, z2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF(this.LL, "call back [onVideoMuteStateChanged] exception", e);
            }
        }
        InterfaceC2181591AZp interfaceC2181591AZp = this.LLILLL;
        if (interfaceC2181591AZp != null) {
            interfaceC2181591AZp.LIZIZ(enumC965730bEpLJIIL, c1283230jUv, z, z2);
        }
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJIIIIZZ(C1AZU c1azu, C1283230jUv c1283230jUv, boolean z, boolean z2) {
        EnumC965730bEp enumC965730bEpLJIIL = C2181511AZh.LJIIL(c1azu);
        List listLJIL = C2097808Js.LJIL(this.LLILLJJLI);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIL) {
            if (((EnumC965730bEp) ((Pair) obj).getSecond()).getLinkArchType() == c1azu || c1azu == C1AZU.Unknown) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC2181591AZp) ((Pair) it2.next()).getFirst()).LJJ(enumC965730bEpLJIIL, c1283230jUv, z, z2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF(this.LL, "call back [onAudioOccupiedChanged] exception", e);
            }
        }
        InterfaceC2181591AZp interfaceC2181591AZp = this.LLILLL;
        if (interfaceC2181591AZp != null) {
            interfaceC2181591AZp.LJJ(enumC965730bEpLJIIL, c1283230jUv, z, z2);
        }
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJIIIZ(C1AZU c1azu, C1283230jUv c1283230jUv, C1CXJ c1cxj, C1CXJ c1cxj2) {
        EnumC965730bEp enumC965730bEpLJIIL = C2181511AZh.LJIIL(c1azu);
        List listLJIL = C2097808Js.LJIL(this.LLILLJJLI);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIL) {
            if (((EnumC965730bEp) ((Pair) obj).getSecond()).getLinkArchType() == c1azu || c1azu == C1AZU.Unknown) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC2181591AZp) ((Pair) it2.next()).getFirst()).LJFF(enumC965730bEpLJIIL, c1283230jUv, C2181511AZh.LIZLLL(c1cxj), C2181511AZh.LIZLLL(c1cxj2));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF(this.LL, "call back [onOnlineStateChanged] exception", e);
            }
        }
        InterfaceC2181591AZp interfaceC2181591AZp = this.LLILLL;
        if (interfaceC2181591AZp != null) {
            interfaceC2181591AZp.LJFF(enumC965730bEpLJIIL, c1283230jUv, C2181511AZh.LIZLLL(c1cxj), C2181511AZh.LIZLLL(c1cxj2));
        }
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJIIJ(C1AZU c1azu, C1283230jUv c1283230jUv, C1CWQ c1cwq, C1CWQ c1cwq2) {
        C2181511AZh.LJIIL(c1azu);
        List listLJIL = C2097808Js.LJIL(this.LLILLJJLI);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIL) {
            if (((EnumC965730bEp) ((Pair) obj).getSecond()).getLinkArchType() == c1azu || c1azu == C1AZU.Unknown) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                InterfaceC2181591AZp interfaceC2181591AZp = (InterfaceC2181591AZp) ((Pair) it2.next()).getFirst();
                C2181511AZh.LIZ(c1cwq);
                C2181511AZh.LIZ(c1cwq2);
                interfaceC2181591AZp.LIZLLL();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF(this.LL, "call back [onWinStateChanged] exception", e);
            }
        }
        InterfaceC2181591AZp interfaceC2181591AZp2 = this.LLILLL;
        if (interfaceC2181591AZp2 != null) {
            C2181511AZh.LIZ(c1cwq);
            C2181511AZh.LIZ(c1cwq2);
            interfaceC2181591AZp2.LIZLLL();
        }
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJIIL(C1AZU c1azu, C1283230jUv c1283230jUv, boolean z, boolean z2) {
        EnumC965730bEp enumC965730bEpLJIIL = C2181511AZh.LJIIL(c1azu);
        List listLJIL = C2097808Js.LJIL(this.LLILLJJLI);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIL) {
            if (((EnumC965730bEp) ((Pair) obj).getSecond()).getLinkArchType() == c1azu || c1azu == C1AZU.Unknown) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC2181591AZp) ((Pair) it2.next()).getFirst()).LJIIIZ(enumC965730bEpLJIIL, c1283230jUv, z, z2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF(this.LL, "call back [onAudioMuteStateChanged] exception", e);
            }
        }
        InterfaceC2181591AZp interfaceC2181591AZp = this.LLILLL;
        if (interfaceC2181591AZp != null) {
            interfaceC2181591AZp.LJIIIZ(enumC965730bEpLJIIL, c1283230jUv, z, z2);
        }
    }

    @Override // X.InterfaceC2183461Acq
    public final void LJIILL(C1AZU c1azu, C1283230jUv c1283230jUv, C1CX5 c1cx5, C1CX5 c1cx52) {
        EnumC965730bEp enumC965730bEpLJIIL = C2181511AZh.LJIIL(c1azu);
        List listLJIL = C2097808Js.LJIL(this.LLILLJJLI);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIL) {
            if (((EnumC965730bEp) ((Pair) obj).getSecond()).getLinkArchType() == c1azu || c1azu == C1AZU.Unknown) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC2181591AZp) ((Pair) it2.next()).getFirst()).LJIL(enumC965730bEpLJIIL, c1283230jUv, C2181511AZh.LIZJ(c1cx5), C2181511AZh.LIZJ(c1cx52));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF(this.LL, "call back [onNetworkQualityChanged] exception", e);
            }
        }
        InterfaceC2181591AZp interfaceC2181591AZp = this.LLILLL;
        if (interfaceC2181591AZp != null) {
            interfaceC2181591AZp.LJIL(enumC965730bEpLJIIL, c1283230jUv, C2181511AZh.LIZJ(c1cx5), C2181511AZh.LIZJ(c1cx52));
        }
    }

    public final void LJIJJLI(C1AZU c1azu, C955320ay2 c955320ay2, List<C957030b0n> list, MultiGuestLayoutExtra multiGuestLayoutExtra, C2181851AaF c2181851AaF) {
        boolean z;
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatch onLayoutInfoUpdated, archType=");
        sbLIZ.append(c1azu);
        sbLIZ.append(", source=");
        sbLIZ.append(c2181851AaF.LIZ);
        sbLIZ.append(", layout_key=");
        sbLIZ.append(c955320ay2.LIZIZ);
        sbLIZ.append(", spot_size=");
        sbLIZ.append(((ArrayList) list).size());
        sbLIZ.append(", delegate_count=");
        sbLIZ.append(this.LLILLJJLI.size());
        sbLIZ.append(", has_single_delegate=");
        if (this.LLILLL != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        List listLJIL = C2097808Js.LJIL(this.LLILLJJLI);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIL) {
            if (((EnumC965730bEp) ((Pair) obj).getSecond()).getLinkArchType() == c1azu || c1azu == C1AZU.Unknown) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC2181591AZp) ((Pair) it2.next()).getFirst()).LJII(c955320ay2, list, multiGuestLayoutExtra, C2181511AZh.LJFF(c2181851AaF));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF(this.LL, "call back [onLayoutInfoUpdated] exception", e);
            }
        }
        try {
            InterfaceC2181591AZp interfaceC2181591AZp = this.LLILLL;
            if (interfaceC2181591AZp != null) {
                interfaceC2181591AZp.LJII(c955320ay2, list, multiGuestLayoutExtra, C2181511AZh.LJFF(c2181851AaF));
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20441214yg.LJFF(this.LL, "call back [onLayoutInfoUpdated][single_delegate] exception", e2);
        }
    }
}
