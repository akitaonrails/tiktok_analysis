package X;

import Y.ARunnableS129S0100000_29;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Vpg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809780Vpg {
    public static final Object LIZ = new Object();
    public static final Map<String, C19349210mw> LIZIZ = new HashMap();

    public static InterfaceC809800Vpi LIZ(final C809790Vph c809790Vph) {
        synchronized (LIZ) {
            try {
                Map<String, C19349210mw> map = LIZIZ;
                if (((HashMap) map).containsKey(c809790Vph.LIZIZ)) {
                    return (InterfaceC809800Vpi) ((HashMap) map).get(c809790Vph.LIZIZ);
                }
                InterfaceC809800Vpi interfaceC809800Vpi = new InterfaceC809800Vpi(c809790Vph) { // from class: X.10mw
                    public final C809790Vph LIZ;
                    public final C19349810n2 LIZIZ;
                    public final List<InterfaceC19348110ml> LIZJ;
                    public final AtomicInteger LIZLLL;

                    /* JADX WARN: Type inference failed for: r0v3, types: [X.10n2] */
                    {
                        Object c19348010mk;
                        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                        this.LIZJ = copyOnWriteArrayList;
                        this.LIZLLL = new AtomicInteger(0);
                        this.LIZ = c809790Vph;
                        copyOnWriteArrayList.add(new InterfaceC19348110ml(c809790Vph.LIZIZ) { // from class: X.10mm
                            {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("[UGCloud ");
                                sbLIZ.append(str);
                                sbLIZ.append(e3.f);
                                C2188811AlT.LIZIZ(sbLIZ);
                            }

                            @Override // X.InterfaceC19348110ml
                            public final void LIZ(C19349110mv c19349110mv) {
                                if (c19349110mv.LJFF == 0) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(c19349110mv.LIZLLL);
                                    sbLIZ.append(": success  ");
                                    sbLIZ.append(c19349110mv.LJ);
                                    C2188811AlT.LIZIZ(sbLIZ);
                                    return;
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(c19349110mv.LIZLLL);
                                sbLIZ2.append(": ");
                                sbLIZ2.append(c19349110mv.LJ);
                                sbLIZ2.append("  action = ");
                                sbLIZ2.append(c19349110mv);
                                C2188811AlT.LIZIZ(sbLIZ2);
                            }
                        });
                        if (c809790Vph.LIZLLL) {
                            int i = c809790Vph.LJ;
                            if (i != 1) {
                                c19348010mk = i == 2 ? new InterfaceC19348110ml() { // from class: X.10mu
                                    public final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

                                    @Override // X.InterfaceC19348110ml
                                    public final void LIZ(C19349110mv c19349110mv) {
                                        C786410Ut5.LJJZZIII(this.LIZ, new ARunnableS129S0100000_29(new RuntimeException(), 146));
                                    }
                                } : c19348010mk;
                            } else {
                                c19348010mk = new C19348010mk(c809790Vph.LIZ, c809790Vph.LIZIZ);
                            }
                            copyOnWriteArrayList.add(c19348010mk);
                        }
                        this.LIZIZ = new Object() { // from class: X.10n2
                        };
                    }

                    @Override // X.InterfaceC809800Vpi
                    public final void LIZ(String str, JSONObject jSONObject, String str2, int i) {
                        InterfaceC19349610n0 interfaceC19349610n0;
                        if (i != 0 && TextUtils.isEmpty(str2)) {
                            str2 = "other error";
                        }
                        int iAddAndGet = this.LIZLLL.addAndGet(1);
                        C19349110mv c19349110mv = new C19349110mv(iAddAndGet);
                        C809790Vph c809790Vph2 = this.LIZ;
                        c19349110mv.LIZ = c809790Vph2.LIZIZ;
                        c19349110mv.LIZIZ = c809790Vph2.LIZJ;
                        c19349110mv.LIZLLL = str;
                        c19349110mv.LJFF = i;
                        c19349110mv.LJII = jSONObject;
                        c19349110mv.LJ = str2;
                        c19349110mv.LJI = String.valueOf(System.currentTimeMillis());
                        C19349810n2 c19349810n2 = this.LIZIZ;
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("launch_sequence", iAddAndGet);
                            jSONObject2.put("sdk_name", c19349110mv.LIZ);
                            jSONObject2.put("sdk_version", c19349110mv.LIZIZ);
                            jSONObject2.put("action_id", c19349110mv.LIZLLL);
                            jSONObject2.put("message", c19349110mv.LJ);
                            jSONObject2.put("result", c19349110mv.LJFF);
                            jSONObject2.put("timestamp", c19349110mv.LJI);
                            jSONObject2.put("extra", c19349110mv.LJII);
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        c19349810n2.getClass();
                        if (C19349710n1.LIZ == null) {
                            synchronized (C19349710n1.class) {
                                try {
                                    if (C19349710n1.LIZ == null) {
                                        try {
                                            interfaceC19349610n0 = new InterfaceC19349610n0() { // from class: X.10mx
                                                @Override // X.InterfaceC19349610n0
                                                public final void LIZ(JSONObject jSONObject3) {
                                                    AppLogNewUtils.onEventV3("ug_sdk_action_check", jSONObject3);
                                                }
                                            };
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            try {
                                                Class.forName("");
                                                interfaceC19349610n0 = new InterfaceC19349610n0() { // from class: X.10my
                                                    @Override // X.InterfaceC19349610n0
                                                    public final void LIZ(JSONObject jSONObject3) {
                                                    }
                                                };
                                            } catch (Throwable th2) {
                                                TryCatchGuardChecker.doCheck(th2);
                                                interfaceC19349610n0 = new InterfaceC19349610n0() { // from class: X.10mz
                                                    @Override // X.InterfaceC19349610n0
                                                    public final void LIZ(JSONObject jSONObject3) {
                                                    }
                                                };
                                            }
                                        }
                                        C19349710n1.LIZ = interfaceC19349610n0;
                                    }
                                } catch (Throwable th3) {
                                    TryCatchGuardChecker.doCheck(th3);
                                    throw th3;
                                }
                            }
                        }
                        C19349710n1.LIZ.LIZ(jSONObject2);
                        Iterator it2 = ((CopyOnWriteArrayList) this.LIZJ).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC19348110ml) it2.next()).LIZ(c19349110mv);
                        }
                    }
                };
                ((HashMap) map).put(c809790Vph.LIZIZ, interfaceC809800Vpi);
                return interfaceC809800Vpi;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
