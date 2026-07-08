package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdk.xbridge.protocol.impl.communication.lynx.RavenModule;
import com.bytedance.sdk.xbridge.protocol.impl.lynx.LynxBridgeDelegateModule;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qFn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1542930qFn extends C1075770e6J implements InterfaceC1538820q9A {
    public static final AtomicBoolean LJIILJJIL = new AtomicBoolean(false);
    public InterfaceC1544190qHp LIZJ;
    public InterfaceC1543060qG0 LIZLLL;
    public WeakReference<InterfaceC1541990qEH> LJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public final C1543410qGZ LIZIZ = new C1543410qGZ();
    public final C1542940qFo LJFF = new C1542940qFo();
    public final List<String> LJI = new ArrayList();
    public final List<String> LJII = new ArrayList();
    public final List<String> LJIIIIZZ = new ArrayList();
    public final List<String> LJIIIZ = new ArrayList();
    public final List<InterfaceC1522340pia> LJIIJ = new ArrayList();
    public final C1543080qG2 LJIILIIL = new C1543080qG2();

    @Override // X.InterfaceC1538710q8z
    public final void LJ() {
    }

    @Override // X.InterfaceC1538820q9A
    @InterfaceC1294060jmO
    public final void LIZ() throws Exception {
        throw new Exception("This method is supported only in hybrid-bridge-cn");
    }

    public final InterfaceC1541990qEH LJIJJLI() {
        WeakReference<InterfaceC1541990qEH> weakReference = this.LJ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // X.InterfaceC1536350q5B
    public final void onDestroy() {
        InterfaceC1541990qEH interfaceC1541990qEH;
        InterfaceC1543060qG0 interfaceC1543060qG0;
        this.LIZIZ.LJII();
        C1542940qFo c1542940qFo = this.LJFF;
        c1542940qFo.LIZIZ.LIZJ();
        Iterator<Map.Entry<String, C1543320qGQ>> it2 = c1542940qFo.LIZJ.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().LIZJ();
        }
        InterfaceC1544190qHp interfaceC1544190qHp = this.LIZJ;
        if (interfaceC1544190qHp != null) {
            interfaceC1544190qHp.onDestroy();
        }
        WeakReference<InterfaceC1541990qEH> weakReference = this.LJ;
        if (weakReference != null && (interfaceC1541990qEH = weakReference.get()) != null && (interfaceC1543060qG0 = this.LIZLLL) != null) {
            interfaceC1543060qG0.LIZJ(interfaceC1541990qEH);
        }
        this.LJIIL = true;
    }

    @Override // X.C1075770e6J
    public final C1543410qGZ LJIIJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1536350q5B
    public final boolean LIZIZ(String str) {
        InterfaceC1544190qHp interfaceC1544190qHp = this.LIZJ;
        if (interfaceC1544190qHp != null && interfaceC1544190qHp.LIZIZ(str)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1536350q5B
    public final void LIZJ(String str) {
        InterfaceC1544190qHp interfaceC1544190qHp = this.LIZJ;
        if (interfaceC1544190qHp != null) {
            interfaceC1544190qHp.LIZJ(str);
        }
    }

    @Override // X.InterfaceC1536350q5B
    public final void LIZLLL(String str) {
        InterfaceC1544190qHp interfaceC1544190qHp = this.LIZJ;
        if (interfaceC1544190qHp != null) {
            interfaceC1544190qHp.LIZLLL(str);
        }
    }

    public void LJII(Context context) {
        C1544610qIV c1544610qIV = this.LIZIZ.LJ;
        Activity activityLIZ = C715020S2y.LIZ(context);
        if (activityLIZ != null) {
            c1544610qIV.LJI(activityLIZ);
        }
        this.LJFF.LJII(context);
    }

    @Override // X.C1075770e6J
    public final void LJIIIIZZ(InterfaceC1522340pia interfaceC1522340pia) {
        ((ArrayList) this.LJIIJ).add(interfaceC1522340pia);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override // X.C1075770e6J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIJJI(X.C1543910qHN r5) {
        /*
            r4 = this;
            X.0qFo r3 = r4.LJFF
            java.util.HashMap<java.lang.String, X.0qGQ> r1 = r3.LIZJ
            java.lang.String r0 = r5.LJIIJ
            java.lang.Object r0 = r1.get(r0)
            X.0qGQ r0 = (X.C1543320qGQ) r0
            r2 = 1
            if (r0 == 0) goto L1a
            java.lang.String r1 = r5.LJFF
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0Pex> r0 = r0.LIZIZ
            boolean r0 = r0.containsKey(r1)
            if (r0 != r2) goto L1a
        L19:
            return r2
        L1a:
            X.0qGQ r0 = r3.LIZIZ
            java.lang.String r1 = r5.LJFF
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0Pex> r0 = r0.LIZIZ
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L19
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1542930qFn.LJIIJJI(X.0qHN):boolean");
    }

    @Override // X.C1075770e6J
    public final void LJIIL(C1543110qG5 c1543110qG5) {
        this.LIZIZ.LIZ.LIZ.LJIIIIZZ = c1543110qG5;
    }

    @Override // X.C1075770e6J
    public final void LJIILIIL(String str) {
        C1543080qG2 c1543080qG2 = this.LJIILIIL;
        synchronized (c1543080qG2) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1543080qG2.LIZ);
                sbLIZ.append(str);
                c1543080qG2.LIZ = C2188811AlT.LIZIZ(sbLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C1075770e6J
    @InterfaceC1294060jmO
    public final void LJIILJJIL(C650250Pex c650250Pex) throws JSONException {
        EnumC1063530dmZ enumC1063530dmZ;
        String str;
        InterfaceC1541990qEH interfaceC1541990qEH;
        C1537480q70 hybridContext;
        C1537510q73 c1537510q73;
        InterfaceC1541990qEH interfaceC1541990qEH2;
        C1537480q70 hybridContext2;
        C1542940qFo c1542940qFo = this.LJFF;
        c1542940qFo.getClass();
        if (c650250Pex.LIZJ.length() > 0) {
            if (c1542940qFo.LIZJ.get(c650250Pex.LIZJ) == null) {
                c1542940qFo.LIZJ.put(c650250Pex.LIZJ, new C1543320qGQ());
            }
            C1543320qGQ c1543320qGQ = c1542940qFo.LIZJ.get(c650250Pex.LIZJ);
            if (c1543320qGQ != null) {
                c1543320qGQ.LIZIZ.put(c650250Pex.LIZ, c650250Pex);
            }
        } else {
            c1542940qFo.LIZIZ.LIZIZ.put(c650250Pex.LIZ, c650250Pex);
        }
        int i = C1062410dkl.LIZ[c650250Pex.LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        enumC1063530dmZ = EnumC1063530dmZ.SECURE;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    enumC1063530dmZ = EnumC1063530dmZ.PROTECT;
                }
            } else {
                enumC1063530dmZ = EnumC1063530dmZ.PRIVATE;
            }
        } else {
            enumC1063530dmZ = EnumC1063530dmZ.PUBLIC;
        }
        C1542990qFt c1542990qFt = C1542990qFt.LIZ;
        String str2 = c650250Pex.LIZ;
        c1542990qFt.getClass();
        ConcurrentHashMap<String, C1063560dmc> concurrentHashMap = C1542990qFt.LIZIZ;
        C1063560dmc c1063560dmc = concurrentHashMap.get(LivePreviewCTASmartDisplayManager.DEFAULT);
        if (c1063560dmc == null) {
            c1063560dmc = new C1063560dmc();
            concurrentHashMap.put(LivePreviewCTASmartDisplayManager.DEFAULT, c1063560dmc);
        }
        c1063560dmc.LIZ.put(str2, C1063550dmb.LIZ(enumC1063530dmZ.getValue()));
        WeakReference<InterfaceC1541990qEH> weakReference = c1542940qFo.LIZLLL;
        Object obj = null;
        if (weakReference != null && (interfaceC1541990qEH2 = weakReference.get()) != null && (hybridContext2 = interfaceC1541990qEH2.getHybridContext()) != null) {
            str = hybridContext2.containerId;
        } else {
            str = null;
        }
        WeakReference<InterfaceC1541990qEH> weakReference2 = c1542940qFo.LIZLLL;
        if (weakReference2 != null && (interfaceC1541990qEH = weakReference2.get()) != null && (hybridContext = interfaceC1541990qEH.getHybridContext()) != null && (c1537510q73 = hybridContext.runtimeInfo) != null) {
            obj = c1537510q73.get((Object) "originUrl");
        }
        String strValueOf = String.valueOf(obj);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bridgeName", c650250Pex.LIZ);
        C1520080pew.LIZJ("tt_registerBridge", str, strValueOf, jSONObject);
    }

    @Override // X.C1075770e6J
    public final void LJIIZILJ(AbstractC1544140qHk abstractC1544140qHk) {
        this.LIZIZ.LIZ.LIZ.LIZLLL.LIZ.add(abstractC1544140qHk);
    }

    @Override // X.C1075770e6J
    public final void LJIJI(Map<Class<?>, ? extends C1544630qIX<?>> map) {
        this.LIZIZ.LJ.LIZ.putAll(map);
    }

    @Override // X.InterfaceC1538710q8z
    public final void LJFF(C1309830kBp c1309830kBp, String str) {
        if (c1309830kBp instanceof C1309760kBi) {
            C1309760kBi c1309760kBi = (C1309760kBi) c1309830kBp;
            C1543550qGn c1543550qGn = this.LIZIZ.LIZ;
            c1543550qGn.getClass();
            C1543190qGD c1543190qGD = c1543550qGn.LIZ;
            c1309760kBi.LJIILJJIL("bridge", LynxBridgeDelegateModule.class, c1543190qGD);
            c1309760kBi.LJIILJJIL("raven", RavenModule.class, c1543190qGD);
            c1543550qGn.LIZ.LJIIIZ = str;
        }
        if (c1309830kBp instanceof C1312950kGr) {
            C1543550qGn c1543550qGn2 = this.LIZIZ.LIZ;
            c1543550qGn2.getClass();
            C1543190qGD c1543190qGD2 = c1543550qGn2.LIZ;
            c1309830kBp.LIZLLL.LIZJ("bridge", LynxBridgeDelegateModule.class, c1543190qGD2);
            c1309830kBp.LIZLLL.LIZJ("raven", RavenModule.class, c1543190qGD2);
            c1543550qGn2.LIZ.LJIIIZ = str;
        }
    }

    @Override // X.C1075770e6J
    public final void LJIIIZ(List<String> list, List<? extends JSONObject> list2) {
        C1543410qGZ c1543410qGZ = this.LIZIZ;
        c1543410qGZ.getClass();
        Iterator<String> it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            it2.next();
            int i2 = i + 1;
            if (i >= 0) {
                c1543410qGZ.LIZJ.add(new Pair<>(ListProtector.get(list, i), ListProtector.get(list2, i)));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    @Override // X.C1075770e6J
    public final void LJIILL(Class<? extends InterfaceC1063710dmr> cls, EnumC1063300dmC enumC1063300dmC) {
        C1543490qGh.LIZIZ(cls, enumC1063300dmC, 4);
    }

    @Override // X.C1075770e6J
    public final <T> void LJIJ(Class<T> cls, T t) {
        this.LIZIZ.LJ.LIZ(cls, t);
    }

    @Override // X.C1075770e6J
    public final <T> void LJIJJ(Class<T> cls, T t) {
        this.LIZIZ.LJ.LJ(cls, t);
    }

    @Override // X.C1075770e6J, X.InterfaceC1538820q9A
    public final void sendEvent(String str, JSONObject jSONObject) {
        this.LIZIZ.LJIIIIZZ(str, jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca A[PHI: r1
      0x00ca: PHI (r1v36 X.0qGL) = (r1v14 X.0qGL), (r1v37 X.0qGL) binds: [B:28:0x00c8, B:26:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1538710q8z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(android.content.Context r10, X.InterfaceC1541990qEH r11, X.C1537550q77 r12) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1542930qFn.LJI(android.content.Context, X.0qEH, X.0q77):void");
    }
}
