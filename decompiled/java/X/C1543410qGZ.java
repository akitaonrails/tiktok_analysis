package X;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.xbridge.protocol.impl.web.JSB2Impl;
import com.bytedance.sdk.xbridge.protocol.impl.web.JSB3Impl;
import com.bytedance.sdk.xbridge.protocol.impl.web.JSB4Impl;
import com.bytedance.sdk.xbridge.services.IXBridgeDowngraderService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qGZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543410qGZ {
    public static InterfaceC1297560js2 LJIIIZ;
    public static boolean LJIIJ;
    public static C1063890dn9 LJIIJJI;
    public static C1540160qBK LJIILIIL;
    public static boolean LJIILJJIL;
    public static final C1543600qGs LJIJJLI;
    public final C1543550qGn LIZ = new C1543550qGn();
    public final C1543540qGm LIZIZ = new C1543540qGm();
    public final CopyOnWriteArrayList<Pair<String, JSONObject>> LIZJ = new CopyOnWriteArrayList<>();
    public final String LIZLLL = "BDXBridge";
    public final C1544610qIV LJ = new C1544610qIV();
    public boolean LJFF;
    public InterfaceC1544420qIC LJI;
    public InterfaceC1543270qGL LJII;
    public C1165930gRj LJIIIIZZ;
    public static C789070UxN LJIIL = new C789070UxN();
    public static boolean LJIILL = true;
    public static boolean LJIILLIIL = true;
    public static final ArrayList<String> LJIIZILJ = new ArrayList<>();
    public static boolean LJIJ = true;
    public static boolean LJIJI = true;
    public static final ArrayList<String> LJIJJ = new ArrayList<>();

    static {
        C1543600qGs c1543600qGs = new C1543600qGs();
        c1543600qGs.LIZ = false;
        LJIJJLI = c1543600qGs;
    }

    public final void LJII() {
        Object obj;
        C1543200qGE c1543200qGE;
        String url;
        Iterator<Pair<String, JSONObject>> it2 = this.LIZJ.iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                break;
            }
            final Pair<String, JSONObject> next = it2.next();
            int i = C1063310dmD.LIZ[this.LIZ.LIZ.LJIILJJIL.ordinal()];
            EnumC1543740qH6 enumC1543740qH6 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? EnumC1543740qH6.Other : EnumC1543740qH6.SDUI : EnumC1543740qH6.Worker : EnumC1543740qH6.Web : EnumC1543740qH6.Lynx;
            C1543190qGD c1543190qGD = this.LIZ.LIZ;
            if (c1543190qGD != null && (c1543200qGE = c1543190qGD.LIZIZ) != null) {
                C1543910qHN c1543910qHN = new C1543910qHN(this.LIZ.LIZ);
                c1543910qHN.LJFF = next.getFirst();
                c1543910qHN.LJIIIIZZ = next.getSecond();
                c1543910qHN.LJIIJ = LivePreviewCTASmartDisplayManager.DEFAULT;
                c1543910qHN.LJIJ = enumC1543740qH6;
                InterfaceC1544190qHp interfaceC1544190qHp = this.LIZ.LIZ.LJ;
                if (interfaceC1544190qHp == null || (url = interfaceC1544190qHp.getUrl()) == null) {
                    url = "";
                }
                c1543910qHN.LJI = url;
                c1543200qGE.LIZ(c1543910qHN, new InterfaceC1543240qGI() { // from class: X.0qGf
                    @Override // X.InterfaceC1543240qGI
                    public final void LJFF(C1543440qGc c1543440qGc, C1543910qHN c1543910qHN2) {
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("dealWithCloseEvent, bridgeName: ");
                        sbLIZ.append(next.getFirst());
                        sbLIZ.append("}, result: ");
                        sbLIZ.append(c1543440qGc);
                        C2188811AlT.LIZIZ(sbLIZ);
                        InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
                    }
                }, this.LIZ.LIZ, null);
            }
        }
        C1543420qGa c1543420qGa = this.LIZ.LIZ.LJIIL;
        C1543450qGd c1543450qGd = c1543420qGa.LIZIZ;
        Iterator<Map.Entry<EnumC1063300dmC, ConcurrentHashMap<String, InterfaceC1063710dmr>>> it3 = c1543450qGd.LIZIZ.entrySet().iterator();
        while (it3.hasNext()) {
            Iterator<Map.Entry<String, InterfaceC1063710dmr>> it4 = it3.next().getValue().entrySet().iterator();
            while (it4.hasNext()) {
                it4.next().getValue().release();
            }
        }
        c1543450qGd.LIZIZ.clear();
        c1543420qGa.LIZLLL = true;
        C1543390qGX c1543390qGX = this.LIZ.LIZ.LJIILIIL;
        if (c1543390qGX != null) {
            if (C1544000qHW.LJIJ) {
                Iterator<Map.Entry<EnumC1063300dmC, ConcurrentHashMap<String, InterfaceC1063710dmr>>> it5 = c1543390qGX.LIZLLL.entrySet().iterator();
                while (it5.hasNext()) {
                    Iterator<Map.Entry<String, InterfaceC1063710dmr>> it6 = it5.next().getValue().entrySet().iterator();
                    while (it6.hasNext()) {
                        try {
                            it6.next().getValue().release();
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                }
            }
            c1543390qGX.LIZLLL.clear();
        }
        this.LIZ.LIZ.LJIJ.LIZ("true", "release");
        C1543540qGm c1543540qGm = this.LIZIZ;
        IXBridgeDowngraderService iXBridgeDowngraderService = c1543540qGm.LIZIZ;
        if (iXBridgeDowngraderService != null) {
            iXBridgeDowngraderService.release();
        }
        c1543540qGm.LIZ.clear();
        ConcurrentHashMap<Integer, C1543410qGZ> concurrentHashMap = C1543560qGo.LIZ;
        Iterator it7 = C2097808Js.LJIL(C1543560qGo.LIZ).iterator();
        while (true) {
            if (!it7.hasNext()) {
                break;
            }
            Object next2 = it7.next();
            if (Intrinsics.LJFF(((Pair) next2).getSecond(), this)) {
                obj = next2;
                break;
            }
        }
        Pair pair = (Pair) obj;
        if (pair != null) {
            C1543560qGo.LIZ.remove(pair.getFirst());
        }
        C1543560qGo.LIZ.values();
        String str = this.LJ.LIZLLL;
        if (str != null) {
            C1543810qHD.LIZ.remove(str);
        }
    }

    public final void LIZ(InterfaceC1543170qGB interfaceC1543170qGB) {
        C1543130qG7 c1543130qG7 = this.LIZ.LIZ.LIZJ.LIZ;
        if ((c1543130qG7 instanceof C1543130qG7) && c1543130qG7 != null) {
            ((ArrayList) c1543130qG7.LIZ).add(interfaceC1543170qGB);
        }
    }

    public static void LIZLLL(C1543410qGZ c1543410qGZ, Class cls) {
        C1543390qGX c1543390qGX;
        EnumC1063300dmC enumC1063300dmC = EnumC1063300dmC.ALL;
        if (c1543410qGZ.LIZ.LIZ.LIZ() != null && (c1543390qGX = c1543410qGZ.LIZ.LIZ.LJIILIIL) != null) {
            c1543390qGX.LIZJ.LIZIZ(cls, enumC1063300dmC);
        }
    }

    public final void LIZJ(AbstractC1543010qFv abstractC1543010qFv, final String str) {
        final C1543190qGD c1543190qGD = this.LIZ.LIZ;
        c1543190qGD.LJ = abstractC1543010qFv;
        c1543190qGD.LIZIZ(new AbstractC1543580qGq(c1543190qGD) { // from class: X.0qGl
            @Override // X.AbstractC1543580qGq
            public final void LJIIIZ(Object obj, String str2) {
            }

            @Override // X.AbstractC1543580qGq
            public final void LJIIIIZZ() {
                int i = C2187451AjH.LIZ;
                InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
            }

            {
                super(c1543190qGD);
                InterfaceC1544190qHp interfaceC1544190qHp = c1543190qGD.LJ;
                if (interfaceC1544190qHp != null) {
                    interfaceC1544190qHp.getUrl();
                }
            }
        });
        Iterator it2 = ((ArrayList) c1543190qGD.LJIIJ).iterator();
        while (it2.hasNext()) {
            ((AbstractC1543580qGq) it2.next()).LJIIIIZZ();
        }
        c1543190qGD.LJIIIZ = str;
        c1543190qGD.LJIILJJIL = EnumC1063300dmC.Worker;
        c1543190qGD.LJIJ.LIZ(str, "containerId");
        this.LJ.LIZLLL = str;
        this.LJ.LJFF(this);
        this.LJ.LIZ(InterfaceC1887690zDr.class, new InterfaceC1887690zDr() { // from class: X.0qGw
            @Override // X.InterfaceC1887690zDr
            public final String LIZ() {
                return str;
            }
        });
        C1543420qGa c1543420qGa = this.LIZ.LIZ.LJIIL;
        c1543420qGa.LIZIZ(this.LJ);
        C1543200qGE c1543200qGE = this.LIZ.LIZ.LIZIZ;
        if (c1543200qGE != null) {
            c1543200qGE.LIZ = c1543420qGa;
        }
    }

    @InterfaceC1294060jmO
    public final void LJ(InterfaceC1063710dmr interfaceC1063710dmr, EnumC1063300dmC enumC1063300dmC) {
        C1543450qGd c1543450qGd = this.LIZ.LIZ.LJIIL.LIZIZ;
        c1543450qGd.getClass();
        if (C1063360dmI.LIZ[enumC1063300dmC.ordinal()] == 1) {
            c1543450qGd.LIZIZ(EnumC1063300dmC.WEB).put(interfaceC1063710dmr.getName(), interfaceC1063710dmr);
            c1543450qGd.LIZIZ(EnumC1063300dmC.LYNX).put(interfaceC1063710dmr.getName(), interfaceC1063710dmr);
            c1543450qGd.LIZIZ(EnumC1063300dmC.Worker).put(interfaceC1063710dmr.getName(), interfaceC1063710dmr);
            c1543450qGd.LIZIZ(EnumC1063300dmC.ALL).put(interfaceC1063710dmr.getName(), interfaceC1063710dmr);
            return;
        }
        c1543450qGd.LIZIZ(enumC1063300dmC).put(interfaceC1063710dmr.getName(), interfaceC1063710dmr);
    }

    public final void LJFF(Class<? extends InterfaceC1063710dmr> cls, EnumC1063300dmC enumC1063300dmC) {
        ((C1543500qGi) this.LIZ.LIZ.LJIIL.LIZIZ.LIZJ.getValue()).LIZ(cls, enumC1063300dmC, LivePreviewCTASmartDisplayManager.DEFAULT);
    }

    public final void LJIIIIZZ(String str, JSONObject jSONObject) {
        Object c098200Yq;
        C1543550qGn c1543550qGn = this.LIZ;
        Iterator<InterfaceC1522340pia> it2 = c1543550qGn.LIZ.LJIIJJI.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().LIZ();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
        Iterator it3 = ((ArrayList) c1543550qGn.LIZ.LJIIJ).iterator();
        while (it3.hasNext()) {
            ((AbstractC1543580qGq) it3.next()).LJIIIZ(jSONObject, str);
        }
    }

    public final void LJIIIZ(String str, JSONObject jSONObject) {
        Object c098200Yq;
        C1543550qGn c1543550qGn = this.LIZ;
        Iterator<InterfaceC1522340pia> it2 = c1543550qGn.LIZ.LJIIJJI.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().LIZ();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
        Iterator it3 = ((ArrayList) c1543550qGn.LIZ.LJIIJ).iterator();
        while (it3.hasNext()) {
            ((AbstractC1543580qGq) it3.next()).LJIIJ(jSONObject, str);
        }
    }

    public final void LJIIJ(String str, JSONObject jSONObject) {
        Object c098200Yq;
        C1543550qGn c1543550qGn = this.LIZ;
        Iterator<InterfaceC1522340pia> it2 = c1543550qGn.LIZ.LJIIJJI.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().LIZ();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
        Iterator it3 = ((ArrayList) c1543550qGn.LIZ.LJIIJ).iterator();
        while (it3.hasNext()) {
            ((AbstractC1543580qGq) it3.next()).LJIIIZ(jSONObject, str);
        }
    }

    @InterfaceC1294060jmO
    public final void LIZIZ(View view, boolean z, final String str) {
        int i;
        boolean z2;
        C1165930gRj c1165930gRj;
        if (z) {
            i = 27;
        } else {
            i = 17;
        }
        ConcurrentHashMap<Integer, C1543410qGZ> concurrentHashMap = C1543560qGo.LIZ;
        concurrentHashMap.put(Integer.valueOf(view.hashCode()), this);
        concurrentHashMap.values();
        Iterator<InterfaceC1543700qH2> it2 = C1543560qGo.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().onInit();
        }
        C1543550qGn c1543550qGn = this.LIZ;
        Integer numValueOf = Integer.valueOf(i);
        C1543190qGD c1543190qGD = c1543550qGn.LIZ;
        c1543190qGD.LIZ = this;
        if (view instanceof LynxView) {
            c1543190qGD.LJFF = (LynxView) view;
            c1543190qGD.LJIILJJIL = EnumC1063300dmC.LYNX;
            c1543190qGD.LIZIZ(new C1543460qGe(c1543190qGD));
            C1543190qGD c1543190qGD2 = c1543550qGn.LIZ;
            C1543410qGZ c1543410qGZ = c1543190qGD2.LIZ;
            if (c1543410qGZ != null) {
                c1165930gRj = c1543410qGZ.LJIIIIZZ;
            } else {
                c1165930gRj = null;
            }
            c1543190qGD2.LJIILLIIL = c1165930gRj;
        } else if (view instanceof WebView) {
            C1055840daA c1055840daA = new C1055840daA((WebView) view);
            C1543190qGD c1543190qGD3 = c1543550qGn.LIZ;
            C1543410qGZ c1543410qGZ2 = c1543190qGD3.LIZ;
            if (c1543410qGZ2 != null && c1543410qGZ2.LJFF) {
                z2 = true;
            } else {
                z2 = false;
            }
            c1055840daA.LIZLLL = z2;
            c1543190qGD.LJ = c1055840daA;
            c1543190qGD3.LJIILJJIL = EnumC1063300dmC.WEB;
            if (numValueOf != null) {
                numValueOf.intValue();
                int iIntValue = numValueOf.intValue();
                if ((iIntValue & 1) == 1) {
                    C1543190qGD c1543190qGD4 = c1543550qGn.LIZ;
                    c1543190qGD4.LIZIZ(new JSB4Impl(c1543190qGD4));
                }
                if ((iIntValue & 8) == 8) {
                    C1543190qGD c1543190qGD5 = c1543550qGn.LIZ;
                    c1543190qGD5.LIZIZ(new C1543860qHI(c1543190qGD5));
                }
                if ((iIntValue & 2) == 2) {
                    C1543190qGD c1543190qGD6 = c1543550qGn.LIZ;
                    c1543190qGD6.LIZIZ(new JSB2Impl(c1543190qGD6));
                }
                if ((iIntValue & 4) == 4) {
                    C1543190qGD c1543190qGD7 = c1543550qGn.LIZ;
                    c1543190qGD7.LIZIZ(new JSB3Impl(c1543190qGD7));
                }
            }
        }
        Iterator it3 = ((ArrayList) c1543550qGn.LIZ.LJIIJ).iterator();
        while (it3.hasNext()) {
            ((AbstractC1543580qGq) it3.next()).LJIIIIZZ();
        }
        c1543550qGn.LIZ.LJIIIZ = str;
        this.LJ.LJ(C1543190qGD.class, this.LIZ.LIZ);
        C1544610qIV c1544610qIV = this.LJ;
        c1544610qIV.LIZLLL = str;
        if (c1544610qIV.LIZIZ == null) {
            c1544610qIV.LIZIZ = new WeakReference<>(view);
        }
        this.LJ.LJFF(this);
        C1544610qIV c1544610qIV2 = this.LJ;
        InterfaceC1544650qIZ interfaceC1544650qIZ = new InterfaceC1544650qIZ() { // from class: X.0qGr
            @Override // X.InterfaceC1544650qIZ
            public final void LIZ(String str2, JSONObject jSONObject) {
                this.LIZ.LJIIIIZZ(str2, jSONObject);
            }
        };
        if (c1544610qIV2.LJ == null) {
            c1544610qIV2.LJ = interfaceC1544650qIZ;
        }
        c1544610qIV2.LIZ(InterfaceC1063720dms.class, new InterfaceC1063720dms() { // from class: X.0qGk
            /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
            @Override // X.InterfaceC1063720dms
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.lang.String r3, java.util.Map<java.lang.String, ? extends java.lang.Object> r4) {
                /*
                    r2 = this;
                    X.0qGZ r1 = r2.LIZ
                    if (r4 == 0) goto Lf
                    X.0qHC r0 = X.C1543800qHC.LIZ
                    r0.getClass()
                    org.json.JSONObject r0 = X.C1543800qHC.LIZJ(r4)
                    if (r0 != 0) goto L14
                Lf:
                    org.json.JSONObject r0 = new org.json.JSONObject
                    r0.<init>()
                L14:
                    r1.LJIIIIZZ(r3, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1543520qGk.LIZ(java.lang.String, java.util.Map):void");
            }
        });
        this.LJ.LIZ(InterfaceC1887690zDr.class, new InterfaceC1887690zDr() { // from class: X.0qGv
            @Override // X.InterfaceC1887690zDr
            public final String LIZ() {
                return str;
            }
        });
        C1543420qGa c1543420qGa = this.LIZ.LIZ.LJIIL;
        c1543420qGa.LIZIZ(this.LJ);
        c1543420qGa.LIZJ = this.LIZIZ;
        C1543200qGE c1543200qGE = this.LIZ.LIZ.LIZIZ;
        if (c1543200qGE != null) {
            c1543200qGE.LIZ = c1543420qGa;
        }
    }
}
