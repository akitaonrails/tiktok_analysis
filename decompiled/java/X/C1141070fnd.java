package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fnd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1141070fnd {
    public static void LIZ(final C1140900fnM c1140900fnM) {
        InterfaceC1141190fnp interfaceC1141190fnp;
        Object c098200Yq;
        Object objNewInstance;
        InterfaceC1141580foS interfaceC1141580foS;
        C1140960fnS.LIZ = c1140900fnM;
        C1141500foK.LIZ = c1140900fnM.LIZ;
        C20441214yg.LJIIIZ("GiftRenderer", "GiftRender#init start");
        C2043807zY.LIZIZ(InterfaceC1141390fo9.class, c1140900fnM.LIZ);
        C2043807zY.LIZIZ(InterfaceC1141280fny.class, c1140900fnM.LIZIZ);
        C2043807zY.LIZIZ(InterfaceC1141560foQ.class, new InterfaceC1141560foQ() { // from class: X.0foI
            @Override // X.InterfaceC1141560foQ
            public final ExecutorService LIZ() {
                return C2126108Up.LIZJ;
            }
        });
        final InterfaceC1141030fnZ interfaceC1141030fnZ = c1140900fnM.LIZJ;
        C2043807zY.LIZIZ(InterfaceC1141700foe.class, new InterfaceC1141700foe(interfaceC1141030fnZ) { // from class: X.0foA
            {
                new ConcurrentHashMap();
            }
        });
        C2043807zY.LIZIZ(InterfaceC1862007Ra.class, c1140900fnM.LIZLLL);
        C2043807zY.LIZIZ(InterfaceC1140880fnK.class, new InterfaceC1140880fnK(c1140900fnM) { // from class: X.0fnf
            public final C1141230fnt LIZ;

            {
                this.LIZ = new C1141230fnt(c1140900fnM);
            }

            @Override // X.InterfaceC1140880fnK
            public final C1140830fnF LIZ(C1140340fmS c1140340fmS) {
                return new C1140830fnF(c1140340fmS);
            }

            @Override // X.InterfaceC1140880fnK
            public final InterfaceC1140400fmY create(AbstractC1140160fmA abstractC1140160fmA) {
                List list = (List) this.LIZ.LIZIZ.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    C1141440foE c1141440foE = (C1141440foE) obj;
                    InterfaceC1141380fo8 interfaceC1141380fo8 = c1141440foE.LIZ;
                    if (interfaceC1141380fo8 != null && interfaceC1141380fo8.support() && c1141440foE.LIZ.canRender(abstractC1140160fmA)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    InterfaceC1141380fo8 interfaceC1141380fo82 = ((C1141440foE) it2.next()).LIZ;
                    if (interfaceC1141380fo82 != null) {
                        arrayList2.add(interfaceC1141380fo82);
                    }
                }
                InterfaceC1141380fo8 interfaceC1141380fo83 = (InterfaceC1141380fo8) C13LP.LJJJLL(arrayList2);
                if (interfaceC1141380fo83 != null) {
                    return interfaceC1141380fo83.create(abstractC1140160fmA);
                }
                return null;
            }
        });
        C2043807zY.LIZIZ(C1140920fnO.class, c1140900fnM.LJI);
        C2043807zY.LIZIZ(InterfaceC1139050fkN.class, c1140900fnM.LJII);
        if (c1140900fnM.LJ.LIZIZ()) {
            final InterfaceC1141190fnp interfaceC1141190fnp2 = c1140900fnM.LJ;
            final InterfaceC1141190fnp interfaceC1141190fnp3 = new InterfaceC1141190fnp(interfaceC1141190fnp2) { // from class: X.0fnk
                public final InterfaceC1141190fnp LIZ;

                @Override // X.InterfaceC1141190fnp
                public final boolean LIZIZ() {
                    return this.LIZ.LIZIZ();
                }

                @Override // X.InterfaceC1141190fnp
                public final void ensureNotReachHere(Throwable th, String str) {
                    this.LIZ.ensureNotReachHere(th, str);
                }

                @Override // X.InterfaceC1141190fnp
                public final InterfaceC1101410elf getOverloadScoreRetriever() {
                    return this.LIZ.getOverloadScoreRetriever();
                }

                {
                    this.LIZ = interfaceC1141190fnp2;
                }

                public static JSONObject LJ(JSONObject jSONObject) {
                    Object obj;
                    InterfaceC1141390fo9 interfaceC1141390fo9;
                    String strLIZ;
                    String strLIZ2;
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("tag", "ttlive_sdk");
                        InterfaceC1141280fny interfaceC1141280fnyLIZIZ = C1141290fnz.LIZIZ();
                        if (interfaceC1141280fnyLIZIZ != null) {
                            strLIZ = interfaceC1141280fnyLIZIZ.LIZ();
                        } else {
                            strLIZ = null;
                        }
                        jSONObject2.put("ttlive_sdk_version", strLIZ);
                        InterfaceC1141280fny interfaceC1141280fnyLIZIZ2 = C1141290fnz.LIZIZ();
                        if (interfaceC1141280fnyLIZIZ2 != null) {
                            strLIZ2 = interfaceC1141280fnyLIZIZ2.LIZ();
                        } else {
                            strLIZ2 = null;
                        }
                        jSONObject2.put("ttlive_gift_render_sdk_version", strLIZ2);
                        if (jSONObject != null) {
                            jSONObject2.put("extra", jSONObject);
                        }
                        C189200o6.m2constructorimpl(jSONObject2);
                        obj = jSONObject2;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C098200Yq c098200Yq2 = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq2);
                        obj = c098200Yq2;
                    }
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
                    if (thM5exceptionOrNullimpl != null && (interfaceC1141390fo9 = C1141500foK.LIZ) != null) {
                        interfaceC1141390fo9.e("ttlive_gift_render", null, thM5exceptionOrNullimpl);
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
                    Object obj2 = obj;
                    if (zM7isFailureimpl) {
                        obj2 = jSONObject3;
                    }
                    return (JSONObject) obj2;
                }

                public static String LJFF(String str) {
                    if (str != null && !u.LJJIIJZLJL(str, "ttlive_", false)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ttlive_");
                        sbLIZ.append(str);
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }
                    return str;
                }

                @Override // X.InterfaceC1141190fnp
                public final void LIZ(String str, JSONObject jSONObject) {
                    this.LIZ.LIZ(LJFF(str), LJ(jSONObject));
                }

                @Override // X.InterfaceC1141190fnp
                public final void LIZLLL(String str, Map map) {
                    this.LIZ.LIZLLL(str, map);
                }

                @Override // X.InterfaceC1141190fnp
                public final void LIZJ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
                    this.LIZ.LIZJ(LJFF(str), jSONObject, LJ(jSONObject2));
                }

                @Override // X.InterfaceC1141190fnp
                public final void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
                    this.LIZ.monitorEvent(LJFF(str), jSONObject, jSONObject2, LJ(jSONObject3));
                }
            };
            interfaceC1141190fnp = new InterfaceC1141190fnp(interfaceC1141190fnp3) { // from class: X.0fnq
                public final InterfaceC1141190fnp LIZ;

                @Override // X.InterfaceC1141190fnp
                public final boolean LIZIZ() {
                    return this.LIZ.LIZIZ();
                }

                @Override // X.InterfaceC1141190fnp
                public final InterfaceC1101410elf getOverloadScoreRetriever() {
                    return this.LIZ.getOverloadScoreRetriever();
                }

                {
                    this.LIZ = interfaceC1141190fnp3;
                }

                @Override // X.InterfaceC1141190fnp
                public final void LIZ(String str, JSONObject jSONObject) {
                    this.LIZ.LIZ(str, jSONObject);
                }

                @Override // X.InterfaceC1141190fnp
                public final void LIZLLL(String str, Map map) {
                    this.LIZ.LIZLLL(str, map);
                }

                @Override // X.InterfaceC1141190fnp
                public final void ensureNotReachHere(Throwable th, String str) {
                    this.LIZ.ensureNotReachHere(th, str);
                }

                @Override // X.InterfaceC1141190fnp
                public final void LIZJ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
                    this.LIZ.LIZJ(str, jSONObject, jSONObject2);
                }

                @Override // X.InterfaceC1141190fnp
                public final void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
                    this.LIZ.monitorEvent(str, jSONObject, jSONObject2, jSONObject3);
                }
            };
        } else {
            final InterfaceC1141190fnp interfaceC1141190fnp4 = c1140900fnM.LJ;
            interfaceC1141190fnp = new InterfaceC1141190fnp(interfaceC1141190fnp4) { // from class: X.0fnq
                public final InterfaceC1141190fnp LIZ;

                @Override // X.InterfaceC1141190fnp
                public final boolean LIZIZ() {
                    return this.LIZ.LIZIZ();
                }

                @Override // X.InterfaceC1141190fnp
                public final InterfaceC1101410elf getOverloadScoreRetriever() {
                    return this.LIZ.getOverloadScoreRetriever();
                }

                {
                    this.LIZ = interfaceC1141190fnp4;
                }

                @Override // X.InterfaceC1141190fnp
                public final void LIZ(String str, JSONObject jSONObject) {
                    this.LIZ.LIZ(str, jSONObject);
                }

                @Override // X.InterfaceC1141190fnp
                public final void LIZLLL(String str, Map map) {
                    this.LIZ.LIZLLL(str, map);
                }

                @Override // X.InterfaceC1141190fnp
                public final void ensureNotReachHere(Throwable th, String str) {
                    this.LIZ.ensureNotReachHere(th, str);
                }

                @Override // X.InterfaceC1141190fnp
                public final void LIZJ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
                    this.LIZ.LIZJ(str, jSONObject, jSONObject2);
                }

                @Override // X.InterfaceC1141190fnp
                public final void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
                    this.LIZ.monitorEvent(str, jSONObject, jSONObject2, jSONObject3);
                }
            };
        }
        C2043807zY.LIZIZ(InterfaceC1141190fnp.class, interfaceC1141190fnp);
        Context context = c1140900fnM.LIZIZ.context();
        try {
            objNewInstance = Class.forName("com.bytedance.live.render.engine.lynx.LynxRenderModuleInitializer").newInstance();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (objNewInstance == null) {
            C20441214yg.LJ("GiftRenderer", "init lynx module fail, instance is null");
        } else if ((objNewInstance instanceof InterfaceC1141580foS) && (interfaceC1141580foS = (InterfaceC1141580foS) objNewInstance) != null) {
            interfaceC1141580foS.init(context);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C20441214yg.LJFF("GiftRenderer", "init lynx module fail", thM5exceptionOrNullimpl);
            }
        } else {
            C20441214yg.LJ("GiftRenderer", "init lynx module fail, initializer is null");
        }
        C20441214yg.LJIIIZ("GiftRenderer", "GiftRender#init success");
    }
}
