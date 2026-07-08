package X;

import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import android.view.Surface;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IALog;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0obW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1479520obW implements InterfaceC1483670oiD {
    public IMonitor LIZ;
    public final InterfaceC1479560oba LIZIZ;
    public SimVideoUrlModel LIZJ;
    public C1472990oQz LIZLLL;
    public C1474600oTa LJ;
    public InterfaceC1479430obN LJFF;
    public C1479510obV LJI;
    public Session LJII;
    public Session LJIIIIZZ;
    public final C1479550obZ LJIIIZ;
    public final C1482320og2 LJIIJ;
    public final C1479730obr LJIIJJI;
    public C650730Pfj LJIIL;
    public final boolean LJIILIIL;
    public final C1480040ocM LJIILJJIL;
    public final C1284270jWb LJIILL;
    public final C1479820oc0 LJIILLIIL;
    public final C585460Mxk LJIIZILJ;
    public final C1479680obm LJIJ;
    public final boolean LJIJI;
    public final C1480240ocg LJIJJ;
    public final C1480250och LJIJJLI;
    public final C1480260oci LJIL;
    public final C1479650obj LJJ;
    public final C1479790obx LJJI;
    public final C1479800oby LJJIFFI;
    public final C1479810obz LJJII;
    public InterfaceC1480060ocO LJJIII;

    public abstract C1479510obV LJI(C1479360obG c1479360obG);

    public abstract C1479400obK LJIILJJIL();

    public abstract C1479410obL LJIJI(SimVideo simVideo);

    public abstract void LJJLL();

    public abstract void LJJZ();

    public abstract void LJJZZIII();

    @Override // X.InterfaceC1483670oiD
    public void reset() {
        SimRadar.warnScan("SimPlayer", "reset", LJJLIL());
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
        this.LJIILJJIL.LIZ = 1.0f;
        this.LIZIZ.LJJJLZIJ();
    }

    public final Map<String, Object> LJJIII() {
        C1479510obV c1479510obV = this.LJI;
        if (c1479510obV == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("enter_from", c1479510obV.LLFFF);
        map.put("tag", c1479510obV.LJJLI);
        map.put("subtag", c1479510obV.LJJLIIIIJ);
        map.put("source_id", c1479510obV.LJIIIZ);
        map.put("aweme_type", Integer.valueOf(c1479510obV.LLF));
        return map;
    }

    @Override // X.InterfaceC1483670oiD
    public void LJJJ() {
        this.LJIILLIIL.LIZ = true;
        if (!((Boolean) C1474810oTv.LJLLL.getValue()).booleanValue()) {
            C1479780obw.LIZ = true;
        }
        this.LIZIZ.LJJJ();
    }

    public final InterfaceC1480060ocO LJJJJ() {
        if (this.LJJIII == null) {
            if (C1474810oTv.LLJJJJJIL()) {
                final C1479650obj c1479650obj = this.LJJ;
                c1479650obj.getClass();
                this.LJJIII = new InterfaceC1480060ocO() { // from class: X.0odK
                    @Override // X.InterfaceC1480060ocO
                    public final void LIZ(int i, int i2, String str) {
                        if (!TextUtils.isEmpty(str) && i2 >= 0) {
                            if (i != 3) {
                                if (i == 4) {
                                    C1479650obj c1479650obj2 = c1479650obj;
                                    AbstractC1479520obW abstractC1479520obW = this;
                                    c1479650obj2.getClass();
                                    C1480660odM c1480660odMLIZ = C1479650obj.LIZ(str, abstractC1479520obW);
                                    c1480660odMLIZ.LJFF = i2;
                                    C1479650obj c1479650obj3 = c1479650obj;
                                    AbstractC1479520obW abstractC1479520obW2 = this;
                                    c1479650obj3.getClass();
                                    C1479650obj.LIZIZ(str, c1480660odMLIZ, abstractC1479520obW2);
                                    return;
                                }
                                return;
                            }
                            C1479650obj c1479650obj4 = c1479650obj;
                            AbstractC1479520obW abstractC1479520obW3 = this;
                            c1479650obj4.getClass();
                            C1480660odM c1480660odMLIZ2 = C1479650obj.LIZ(str, abstractC1479520obW3);
                            c1480660odMLIZ2.LJI = i2;
                            C1479650obj c1479650obj5 = c1479650obj;
                            AbstractC1479520obW abstractC1479520obW4 = this;
                            c1479650obj5.getClass();
                            C1479650obj.LIZIZ(str, c1480660odMLIZ2, abstractC1479520obW4);
                        }
                    }

                    @Override // X.InterfaceC1480060ocO
                    public final void LIZIZ(int i, long j, String str) {
                        if (!TextUtils.isEmpty(str) && j > 0) {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 5) {
                                        if (i != 6) {
                                            if (i == 7) {
                                                C1479650obj c1479650obj2 = c1479650obj;
                                                AbstractC1479520obW abstractC1479520obW = this;
                                                c1479650obj2.getClass();
                                                C1480660odM c1480660odMLIZ = C1479650obj.LIZ(str, abstractC1479520obW);
                                                c1480660odMLIZ.LJ = j;
                                                C1479650obj c1479650obj3 = c1479650obj;
                                                AbstractC1479520obW abstractC1479520obW2 = this;
                                                c1479650obj3.getClass();
                                                C1479650obj.LIZIZ(str, c1480660odMLIZ, abstractC1479520obW2);
                                            }
                                        } else {
                                            C1479650obj c1479650obj4 = c1479650obj;
                                            AbstractC1479520obW abstractC1479520obW3 = this;
                                            c1479650obj4.getClass();
                                            C1480660odM c1480660odMLIZ2 = C1479650obj.LIZ(str, abstractC1479520obW3);
                                            c1480660odMLIZ2.LIZLLL = j;
                                            C1479650obj c1479650obj5 = c1479650obj;
                                            AbstractC1479520obW abstractC1479520obW4 = this;
                                            c1479650obj5.getClass();
                                            C1479650obj.LIZIZ(str, c1480660odMLIZ2, abstractC1479520obW4);
                                        }
                                    } else {
                                        C1479650obj c1479650obj6 = c1479650obj;
                                        AbstractC1479520obW abstractC1479520obW5 = this;
                                        c1479650obj6.getClass();
                                        C1480660odM c1480660odMLIZ3 = C1479650obj.LIZ(str, abstractC1479520obW5);
                                        c1480660odMLIZ3.LIZJ = j;
                                        C1479650obj c1479650obj7 = c1479650obj;
                                        AbstractC1479520obW abstractC1479520obW6 = this;
                                        c1479650obj7.getClass();
                                        C1479650obj.LIZIZ(str, c1480660odMLIZ3, abstractC1479520obW6);
                                    }
                                } else {
                                    C1479650obj c1479650obj8 = c1479650obj;
                                    AbstractC1479520obW abstractC1479520obW7 = this;
                                    c1479650obj8.getClass();
                                    C1480660odM c1480660odMLIZ4 = C1479650obj.LIZ(str, abstractC1479520obW7);
                                    c1480660odMLIZ4.LIZIZ = j;
                                    C1479650obj c1479650obj9 = c1479650obj;
                                    AbstractC1479520obW abstractC1479520obW8 = this;
                                    c1479650obj9.getClass();
                                    C1479650obj.LIZIZ(str, c1480660odMLIZ4, abstractC1479520obW8);
                                }
                            } else {
                                C1480660odM c1480660odMLJJJJI = this.LJJJJI(str);
                                c1480660odMLJJJJI.LIZ = j;
                                C1479650obj c1479650obj10 = c1479650obj;
                                AbstractC1479520obW abstractC1479520obW9 = this;
                                c1479650obj10.getClass();
                                C1479650obj.LIZIZ(str, c1480660odMLJJJJI, abstractC1479520obW9);
                            }
                            if (C1481110oe5.LIZ) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("prepareTimestamp: ");
                                sbLIZ.append(j);
                                sbLIZ.append(", from: ");
                                sbLIZ.append(i);
                                sbLIZ.append(", sourceId: ");
                                sbLIZ.append(str);
                                C1481110oe5.LIZIZ("SimPlayerPrepareTimeHelper", C2188811AlT.LIZIZ(sbLIZ));
                            }
                        }
                    }
                };
            } else {
                this.LJJIII = new InterfaceC1480060ocO() { // from class: X.0odL
                    @Override // X.InterfaceC1480060ocO
                    public final void LIZ(int i, int i2, String str) {
                        if (!TextUtils.isEmpty(str) && i2 >= 0) {
                            if (i != 3) {
                                if (i == 4) {
                                    C1480660odM c1480660odMLJJJJI = this.LIZ.LJJJJI(str);
                                    c1480660odMLJJJJI.LJFF = i2;
                                    this.LIZ.LJLIIL(str, c1480660odMLJJJJI);
                                    return;
                                }
                                return;
                            }
                            C1480660odM c1480660odMLJJJJI2 = this.LIZ.LJJJJI(str);
                            c1480660odMLJJJJI2.LJI = i2;
                            this.LIZ.LJLIIL(str, c1480660odMLJJJJI2);
                        }
                    }

                    @Override // X.InterfaceC1480060ocO
                    public final void LIZIZ(int i, long j, String str) {
                        if (!TextUtils.isEmpty(str) && j > 0) {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 5) {
                                        if (i != 6) {
                                            if (i == 7) {
                                                C1480660odM c1480660odMLJJJJI = this.LIZ.LJJJJI(str);
                                                c1480660odMLJJJJI.LJ = j;
                                                this.LIZ.LJLIIL(str, c1480660odMLJJJJI);
                                            }
                                        } else {
                                            C1480660odM c1480660odMLJJJJI2 = this.LIZ.LJJJJI(str);
                                            c1480660odMLJJJJI2.LIZLLL = j;
                                            this.LIZ.LJLIIL(str, c1480660odMLJJJJI2);
                                        }
                                    } else {
                                        C1480660odM c1480660odMLJJJJI3 = this.LIZ.LJJJJI(str);
                                        c1480660odMLJJJJI3.LIZJ = j;
                                        this.LIZ.LJLIIL(str, c1480660odMLJJJJI3);
                                    }
                                } else {
                                    C1480660odM c1480660odMLJJJJI4 = this.LIZ.LJJJJI(str);
                                    c1480660odMLJJJJI4.LIZIZ = j;
                                    this.LIZ.LJLIIL(str, c1480660odMLJJJJI4);
                                }
                            } else {
                                C1480660odM c1480660odMLJJJJI5 = this.LIZ.LJJJJI(str);
                                c1480660odMLJJJJI5.LIZ = j;
                                this.LIZ.LJLIIL(str, c1480660odMLJJJJI5);
                            }
                            if (C1481110oe5.LIZ) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("prepareTimestamp: ");
                                sbLIZ.append(j);
                                sbLIZ.append(", from: ");
                                sbLIZ.append(i);
                                sbLIZ.append(", sourceId: ");
                                sbLIZ.append(str);
                                C1481110oe5.LIZIZ("SimPlayer", C2188811AlT.LIZIZ(sbLIZ));
                            }
                        }
                    }
                };
            }
        }
        return this.LJJIII;
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJLIIIJLJLI() {
        InterfaceC1479560oba interfaceC1479560oba = this.LIZIZ;
        if (interfaceC1479560oba != null) {
            interfaceC1479560oba.LJJLIIIJLJLI();
        }
    }

    @Override // X.InterfaceC1483670oiD
    public final InterfaceC650720Pfi getLegacy() {
        if (this.LJIIL == null) {
            this.LJIIL = new C650730Pfj(this);
        }
        return this.LJIIL;
    }

    @Override // X.InterfaceC1483670oiD
    public void pause() {
        if (this.LJI != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VIDEO@");
            sbLIZ.append(this.LJI.LJIIIZ);
            SimRadar.traceGroup(C2188811AlT.LIZIZ(sbLIZ)).LIZIZ("pause-1");
        }
        C1479510obV c1479510obV = this.LJI;
        String str = c1479510obV != null ? c1479510obV.LJIIIZ : null;
        SimRadar.keyScan("SimPlayer", "pause", str, LJJLIL(), C1484550ojd.LIZ(this.LJIIJJI.getState()));
        SimRadar.analyzer().getClass();
        C1473150oRF c1473150oRFLIZ = C1472910oQr.LIZ(str);
        if (c1473150oRFLIZ != null) {
            c1473150oRFLIZ.LIZ();
        }
        this.LIZIZ.pause();
    }

    @Override // X.InterfaceC1483670oiD
    public void release() {
        if (this.LJI != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VIDEO@");
            sbLIZ.append(this.LJI.LJIIIZ);
            SimRadar.traceGroup(C2188811AlT.LIZIZ(sbLIZ)).LIZIZ("release");
        }
        Object[] objArr = new Object[2];
        C1479510obV c1479510obV = this.LJI;
        objArr[0] = c1479510obV != null ? c1479510obV.LJIIIZ : null;
        objArr[1] = LJJLIL();
        SimRadar.keyScan("SimPlayer", "release", objArr);
        if (!C1474810oTv.LJZ()) {
            this.LIZIZ.LJJIJ(null);
        }
        this.LIZIZ.release();
        clear();
        if (this.LJIJI) {
            C1479990ocH.LIZ.LIZJ(this);
        }
    }

    @Override // X.InterfaceC1483670oiD
    public void resume() {
        if (this.LJI != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VIDEO@");
            sbLIZ.append(this.LJI.LJIIIZ);
            SimRadar.traceGroup(C2188811AlT.LIZIZ(sbLIZ)).LIZIZ("resume");
        }
        Object[] objArr = new Object[2];
        C1479510obV c1479510obV = this.LJI;
        objArr[0] = c1479510obV != null ? c1479510obV.LJIIIZ : null;
        objArr[1] = LJJLIL();
        SimRadar.keyScan("SimPlayer", "resume", objArr);
        IALog iALogLIZ = C1475000oUE.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("resumePlay aid:");
        SimVideoUrlModel simVideoUrlModel = this.LIZJ;
        sbLIZ2.append(simVideoUrlModel != null ? simVideoUrlModel.getSourceId() : "null");
        iALogLIZ.e("SimPlayer", C2188811AlT.LIZIZ(sbLIZ2));
        C1472990oQz c1472990oQz = this.LIZLLL;
        if (c1472990oQz != null && !TextUtils.isEmpty(c1472990oQz.LJ)) {
            this.LIZIZ.LJJLIIIIJ(this.LIZLLL.LJ);
            return;
        }
        if (this.LIZJ != null && !this.LIZIZ.LJLJI(null)) {
            this.LIZIZ.LJJLIIIIJ(this.LIZJ.getSourceId());
        } else if (this.LJI != null) {
            this.LIZIZ.resume();
        }
    }

    @Override // X.InterfaceC1483670oiD
    public void stop() {
        if (this.LJI != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VIDEO@");
            sbLIZ.append(this.LJI.LJIIIZ);
            SimRadar.traceGroup(C2188811AlT.LIZIZ(sbLIZ)).LIZIZ("stop");
        }
        if (!C1474810oTv.LLIILZL()) {
            C1479510obV c1479510obV = this.LJI;
            String str = c1479510obV != null ? c1479510obV.LJIIIZ : null;
            SimRadar.keyScan("SimPlayer", "stop", str, LJJLIL());
            SimRadar.analyzer().getClass();
            C1473150oRF c1473150oRFLIZ = C1472910oQr.LIZ(str);
            if (c1473150oRFLIZ != null) {
                c1473150oRFLIZ.LJI();
            }
        }
        this.LIZIZ.stop();
    }

    public final String LJJLIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SimPlayer@");
        sbLIZ.append(Integer.toHexString(hashCode()));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1483670oiD
    public InterfaceC1481730of5 LJIIIZ() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1483670oiD
    public InterfaceC1483810oiR LJIILIIL() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC1483520ohy
    public final InterfaceC1483510ohx LJJJJZI() {
        return this.LJIJ;
    }

    @Override // X.InterfaceC1483670oiD
    public final InterfaceC1484080ois getPlayState() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC1483670oiD
    public final void LIZ(boolean z) {
        this.LIZIZ.LIZ(z);
    }

    @Override // X.InterfaceC1483670oiD
    public final <T> T LIZIZ(AbstractC586270Mz3<T> abstractC586270Mz3) {
        InterfaceC1479560oba interfaceC1479560oba = this.LIZIZ;
        if (interfaceC1479560oba != null) {
            return (T) interfaceC1479560oba.LIZIZ(abstractC586270Mz3);
        }
        return (T) abstractC586270Mz3.LIZ();
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJIIL(OnUIPlayListener onUIPlayListener) {
        ((CopyOnWriteArrayList) this.LJIIZILJ.LLILZ).remove(onUIPlayListener);
    }

    @Override // X.InterfaceC1483670oiD
    public final C1480660odM LJIJ(String str) {
        return LJJJJI(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0oc8] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1483670oiD
    public final void LJIL(final IMonitor iMonitor) {
        this.LIZ = iMonitor;
        if (iMonitor == null) {
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("SimPlayer", "setMonitor null");
            }
        } else {
            InterfaceC1479560oba interfaceC1479560oba = this.LIZIZ;
            if (interfaceC1479560oba != 0) {
                interfaceC1479560oba.LJLLJ(new InterfaceC1480050ocN() { // from class: X.0oc8
                    @Override // X.InterfaceC1480050ocN
                    public final void LIZ(JSONObject jSONObject) {
                        IMonitor iMonitor2 = iMonitor;
                        if (iMonitor2 != null) {
                            iMonitor2.monitorCommonLog("player_surface_diff", jSONObject);
                        }
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJIJ(final OnUIPlayListener onUIPlayListener) {
        String strLIZIZ;
        Object[] objArr = new Object[2];
        if (onUIPlayListener == null) {
            strLIZIZ = null;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(onUIPlayListener.getClass().getSimpleName());
            sbLIZ.append(e3.g);
            sbLIZ.append(onUIPlayListener.hashCode());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        objArr[0] = strLIZIZ;
        objArr[1] = LJJLIL();
        SimRadar.keyScan("SimPlayer", "setOnUIPlayListener", objArr);
        C585460Mxk c585460Mxk = this.LJIIZILJ;
        final C1479820oc0 c1479820oc0 = this.LJIILLIIL;
        if (onUIPlayListener != null) {
            if (((Boolean) c1479820oc0.LJ.getValue()).booleanValue()) {
                if (!Intrinsics.LJFF(onUIPlayListener, c1479820oc0.LIZIZ)) {
                    c1479820oc0.LIZIZ = onUIPlayListener;
                    c1479820oc0.LIZ = false;
                    c1479820oc0.LIZJ = (OnUIPlayListener) Proxy.newProxyInstance(OnUIPlayListener.class.getClassLoader(), new Class[]{OnUIPlayListener.class}, new InvocationHandler() { // from class: X.0odH
                        @Override // java.lang.reflect.InvocationHandler
                        public final Object invoke(Object obj, Method method, Object[] objArr2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
                            boolean z;
                            OnUIPlayListener onUIPlayListener2 = onUIPlayListener;
                            C1479820oc0 c1479820oc02 = c1479820oc0;
                            String name = method.getName();
                            if (Intrinsics.LJFF(name, "equals")) {
                                return Boolean.valueOf(Intrinsics.LJFF(onUIPlayListener2, objArr2[0]));
                            }
                            if (Intrinsics.LJFF(name, "hashCode")) {
                                return Integer.valueOf(onUIPlayListener2.hashCode());
                            }
                            if (Intrinsics.LJFF(name, "onPlayProgressChange") || Intrinsics.LJFF(name, "onBufferedPercent") || Intrinsics.LJFF(name, "onBufferedTimeMs") || !Intrinsics.LJFF(name, "toString")) {
                            }
                            if (Intrinsics.LJFF(name, "onRenderFirstFrame") && objArr2 != null && objArr2.length > 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            boolean zLJFF = Intrinsics.LJFF(name, "onPreparePlay");
                            if (c1479820oc02.LIZ) {
                                if (z) {
                                    Method method2 = onUIPlayListener2.getClass().getMethod("onResumePlay", String.class);
                                    method2.invoke(onUIPlayListener2, objArr2[0]);
                                    c1479820oc02.LIZ = false;
                                    return Integer.valueOf(Log.i("SimLifecycleManager", "execute : " + method2.getName()));
                                }
                                if (!zLJFF) {
                                    return null;
                                }
                                int i = c1479820oc02.LIZLLL;
                                if (i > 0) {
                                    c1479820oc02.LIZLLL = i - 1;
                                    return null;
                                }
                                c1479820oc02.LIZ = false;
                                c1479820oc02.LIZLLL = 1;
                                if (objArr2 == null) {
                                    objArr2 = new Object[0];
                                }
                                return C2204961BRm.a0(method, onUIPlayListener2, Arrays.copyOf(objArr2, objArr2.length), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZ5rBkiEBigVanPN9ju3PRqhS2j625gBd6+O2kSxC", null));
                            }
                            if (objArr2 == null) {
                                objArr2 = new Object[0];
                            }
                            return C2204961BRm.a0(method, onUIPlayListener2, Arrays.copyOf(objArr2, objArr2.length), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZ5rBkiEBigVanPN9ju3PRqhS2j625gBd6+O2kSxC", null));
                        }
                    });
                }
                if (c1479820oc0.LIZJ == null) {
                    c1479820oc0.LIZ = false;
                    c1479820oc0.LIZJ = (OnUIPlayListener) Proxy.newProxyInstance(OnUIPlayListener.class.getClassLoader(), new Class[]{OnUIPlayListener.class}, new InvocationHandler() { // from class: X.0odH
                        @Override // java.lang.reflect.InvocationHandler
                        public final Object invoke(Object obj, Method method, Object[] objArr2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
                            boolean z;
                            OnUIPlayListener onUIPlayListener2 = onUIPlayListener;
                            C1479820oc0 c1479820oc02 = c1479820oc0;
                            String name = method.getName();
                            if (Intrinsics.LJFF(name, "equals")) {
                                return Boolean.valueOf(Intrinsics.LJFF(onUIPlayListener2, objArr2[0]));
                            }
                            if (Intrinsics.LJFF(name, "hashCode")) {
                                return Integer.valueOf(onUIPlayListener2.hashCode());
                            }
                            if (Intrinsics.LJFF(name, "onPlayProgressChange") || Intrinsics.LJFF(name, "onBufferedPercent") || Intrinsics.LJFF(name, "onBufferedTimeMs") || !Intrinsics.LJFF(name, "toString")) {
                            }
                            if (Intrinsics.LJFF(name, "onRenderFirstFrame") && objArr2 != null && objArr2.length > 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            boolean zLJFF = Intrinsics.LJFF(name, "onPreparePlay");
                            if (c1479820oc02.LIZ) {
                                if (z) {
                                    Method method2 = onUIPlayListener2.getClass().getMethod("onResumePlay", String.class);
                                    method2.invoke(onUIPlayListener2, objArr2[0]);
                                    c1479820oc02.LIZ = false;
                                    return Integer.valueOf(Log.i("SimLifecycleManager", "execute : " + method2.getName()));
                                }
                                if (!zLJFF) {
                                    return null;
                                }
                                int i = c1479820oc02.LIZLLL;
                                if (i > 0) {
                                    c1479820oc02.LIZLLL = i - 1;
                                    return null;
                                }
                                c1479820oc02.LIZ = false;
                                c1479820oc02.LIZLLL = 1;
                                if (objArr2 == null) {
                                    objArr2 = new Object[0];
                                }
                                return C2204961BRm.a0(method, onUIPlayListener2, Arrays.copyOf(objArr2, objArr2.length), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZ5rBkiEBigVanPN9ju3PRqhS2j625gBd6+O2kSxC", null));
                            }
                            if (objArr2 == null) {
                                objArr2 = new Object[0];
                            }
                            return C2204961BRm.a0(method, onUIPlayListener2, Arrays.copyOf(objArr2, objArr2.length), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZ5rBkiEBigVanPN9ju3PRqhS2j625gBd6+O2kSxC", null));
                        }
                    });
                }
                onUIPlayListener = c1479820oc0.LIZJ;
            }
        } else {
            c1479820oc0.getClass();
        }
        c585460Mxk.LLILLL = onUIPlayListener;
        this.LIZIZ.LJJIJ(this.LJIIZILJ);
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJIJIIJI(C2218291Brv c2218291Brv) {
        ((C650730Pfj) getLegacy()).LIZ.LIZIZ.LJLILLLLZI(c2218291Brv);
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJIJIIJIL(OnUIPlayListener onUIPlayListener) {
        C585460Mxk c585460Mxk = this.LJIIZILJ;
        if (!((CopyOnWriteArrayList) c585460Mxk.LLILZ).contains(onUIPlayListener)) {
            ((CopyOnWriteArrayList) c585460Mxk.LLILZ).add(onUIPlayListener);
        }
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJIZ(String str) {
        ((C650730Pfj) getLegacy()).LIZ.LIZIZ.LJJIZ(str);
    }

    public final C1480660odM LJJJJI(String str) {
        C1479810obz c1479810obz;
        if (C1474810oTv.LLJJJJJIL()) {
            this.LJJ.getClass();
            return C1479650obj.LIZ(str, this);
        }
        if (!TextUtils.isEmpty(str) && (c1479810obz = this.LJJII) != null && c1479810obz.containsKey(str)) {
            C1480660odM c1480660odM = get(str);
            if (c1480660odM == null) {
                return new C1480660odM();
            }
            return c1480660odM;
        }
        return new C1480660odM();
    }

    /* JADX WARN: Removed duplicated region for block: B:247:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023f  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1483670oiD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJJJJJL(X.C1479530obX r33) {
        /*
            Method dump skipped, instruction units count: 1895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1479520obW.LJJJJJL(X.0obX):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0314  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1483670oiD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJJJLZIJ(X.C1479530obX r29) {
        /*
            Method dump skipped, instruction units count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1479520obW.LJJJLZIJ(X.0obX):void");
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJLIIIJ(InterfaceC1471920oPG interfaceC1471920oPG) {
        ((C650730Pfj) getLegacy()).LIZ.LIZIZ.LJJLIIIJ(interfaceC1471920oPG);
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJLJLI(C00UI c00ui) {
        this.LIZIZ.LJLJJI(c00ui);
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJZZI(InterfaceC1472880oQo interfaceC1472880oQo) {
        this.LIZIZ.LJJZZI(interfaceC1472880oQo);
    }

    public void LJL(C1479510obV c1479510obV) {
        LruCache<String, C1479510obV> lruCache = C1479310obB.LIZ;
        C1479310obB.LIZIZ(c1479510obV, c1479510obV.LJIIIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VIDEO@");
        sbLIZ.append(c1479510obV.LJIIIZ);
        SimRadar.traceGroup(C2188811AlT.LIZIZ(sbLIZ)).LIZIZ("SimPrepareNext");
        LJLIL(false, c1479510obV);
        this.LIZIZ.LJLLL(c1479510obV);
        if (this.LJIJI) {
            C1479990ocH.LIZ.LIZ(this);
        }
    }

    @Override // X.InterfaceC1483670oiD
    public void seek(float f) {
        this.LIZIZ.LJIILL(f);
    }

    @Override // X.InterfaceC1483670oiD
    public final void setLoop(boolean z) {
        this.LIZIZ.setLoop(z);
    }

    @Override // X.InterfaceC1483670oiD
    public final void setSpeed(float f) {
        this.LIZIZ.LJI(f);
        this.LJIILJJIL.LIZ = f;
    }

    @Override // X.InterfaceC1483670oiD
    public void setSurface(Surface surface) {
        String strLIZIZ;
        C1480850odf c1480850odf = C1480850odf.LIZJ;
        if (!c1480850odf.optGlobalAppAnr()) {
            SimRadar.traceGroup("SimSurface").LIZIZ("setSurface");
        }
        if (surface != null && !surface.isValid()) {
            SimRadar.errorScan("SimPlayer", "setSurface", new C1473280oRS("Surface is invalid"), new Object[0]);
        }
        if (!c1480850odf.optGlobalAppAnr()) {
            Object[] objArr = new Object[2];
            if (surface != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("surface@");
                sbLIZ.append(Integer.toHexString(surface.hashCode()));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = null;
            }
            objArr[0] = strLIZIZ;
            objArr[1] = LJJLIL();
            SimRadar.keyScan("SimPlayer", "setSurface", objArr);
        }
        this.LIZIZ.setSurface(surface);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0ocg] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.0obm] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0och] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0oci] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0obx] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0oby] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0obz] */
    public AbstractC1479520obW(InterfaceC1479560oba interfaceC1479560oba, C1476570oWl c1476570oWl) {
        boolean z;
        boolean z2 = false;
        if (c1476570oWl != null && c1476570oWl.LIZLLL) {
            z = true;
        } else {
            z = false;
        }
        this.LJIILJJIL = new C1480040ocM();
        this.LJIJJ = new Object() { // from class: X.0ocg
        };
        this.LJIJJLI = new Object() { // from class: X.0och
        };
        this.LJIL = new Object() { // from class: X.0oci
        };
        this.LJJ = new C1479650obj();
        this.LJJI = new LinkedHashMap<String, SimVideoUrlModel>() { // from class: X.0obx
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, SimVideoUrlModel> entry) {
                if (size() > 30) {
                    return true;
                }
                return false;
            }
        };
        this.LJJIFFI = new LinkedHashMap<String, C1480980ods>() { // from class: X.0oby
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, C1480980ods> entry) {
                if (size() > 32) {
                    return true;
                }
                return false;
            }
        };
        this.LJJII = new LinkedHashMap<String, C1480660odM>() { // from class: X.0obz
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, C1480660odM> entry) {
                if (size() > 20) {
                    return true;
                }
                return false;
            }
        };
        this.LIZIZ = interfaceC1479560oba;
        interfaceC1479560oba.LJLJJL(new InterfaceC1472490oQB() { // from class: X.0oQd
            @Override // X.InterfaceC1472490oQB
            public void onEvent(JSONArray jSONArray) {
                if (jSONArray != null) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            if (C1475000oUE.LIZIZ().isDebug() || C607330Nrv.LIZ.LIZIZ().playEventLogEnabled()) {
                                C607330Nrv.LIZ.LIZ().recordMiscLog(C1475000oUE.LIZ, "video_playq", JSONArrayProtectorUtils.getJSONObject(jSONArray, i));
                            }
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            }

            @Override // X.InterfaceC1472490oQB
            public final void LIZ(String str, JSONArray jSONArray) {
                if (!TextUtils.isEmpty(str) && C1480850odf.LIZJ.isEnablePlayerLogV2()) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            C1475000oUE.LIZJ().onEvent(str, JSONArrayProtectorUtils.getJSONObject(jSONArray, i));
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            }
        });
        interfaceC1479560oba.LJLI(new C1480090ocR());
        if (c1476570oWl != null && c1476570oWl.LIZ) {
            z2 = true;
        }
        interfaceC1479560oba.LJLIIL(new C1480100ocS(z2));
        C1284270jWb c1284270jWb = new C1284270jWb();
        this.LJIILL = c1284270jWb;
        interfaceC1479560oba.LJJZZIII(c1284270jWb);
        C1479400obK c1479400obKLJIILJJIL = LJIILJJIL();
        this.LJIIIZ = c1479400obKLJIILJJIL;
        final C1479300obA c1479300obA = (C1479300obA) this;
        C1482320og2 c1482320og2 = new C1482320og2(interfaceC1479560oba, c1479300obA);
        this.LJIIJ = c1482320og2;
        this.LJIIJJI = new C1479730obr(interfaceC1479560oba);
        this.LJIILIIL = z;
        this.LJIILLIIL = new C1479820oc0();
        this.LJIIZILJ = new C585460Mxk(c1479400obKLJIILJJIL, c1482320og2);
        interfaceC1479560oba.LJJLL(LJJJJ());
        this.LJIJ = new InterfaceC1483510ohx() { // from class: X.0obm
            @Override // X.InterfaceC1483510ohx
            public final Map<String, Object> LIZ() {
                return c1479300obA.LJJIII();
            }

            @Override // X.InterfaceC1483510ohx
            public final boolean LIZIZ() {
                C1479510obV c1479510obV = c1479300obA.LJI;
                return c1479510obV != null && c1479510obV.LLJJJJLIIL;
            }

            @Override // X.InterfaceC1483510ohx
            public final boolean LJJIJIIJIL() {
                return c1479300obA.LJIIJJI.LJJIJIIJIL();
            }

            @Override // X.InterfaceC1483510ohx
            public final boolean isPlaying() {
                return c1479300obA.LJIIJJI.isPlaying();
            }

            @Override // X.InterfaceC1483510ohx
            public final void pause() {
                c1479300obA.pause();
            }

            @Override // X.InterfaceC1483510ohx
            public final void release() {
                c1479300obA.release();
            }
        };
        if (c1476570oWl != null && c1476570oWl.LIZIZ) {
            this.LJIJI = true;
        }
    }

    public static void LJIIJ(C1479530obX c1479530obX, boolean z) {
        String sourceId;
        if (!C1474810oTv.LLJJJJ() || c1479530obX == null) {
            return;
        }
        SimVideo simVideo = c1479530obX.LIZLLL;
        if (simVideo != null) {
            sourceId = simVideo.getSourceId();
        } else {
            SimVideoUrlModel simVideoUrlModel = c1479530obX.LJII;
            if (simVideoUrlModel != null) {
                sourceId = simVideoUrlModel.getSourceId();
            } else {
                sourceId = null;
            }
        }
        if (TextUtils.isEmpty(sourceId)) {
            return;
        }
        C1477400oY6.LJJJJI.LJFF(sourceId, z);
    }

    @Override // X.InterfaceC1483670oiD
    public void LJIJJLI(Surface surface, boolean z) {
        String strLIZIZ;
        InterfaceC1472180oPg interfaceC1472180oPgTraceGroup = SimRadar.traceGroup("SimSurface");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSurface:");
        sbLIZ.append(z);
        interfaceC1472180oPgTraceGroup.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        Object[] objArr = new Object[3];
        if (surface != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("surface@");
            sbLIZ2.append(Integer.toHexString(surface.hashCode()));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strLIZIZ = null;
        }
        objArr[0] = strLIZIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("directly:");
        sbLIZ3.append(z);
        objArr[1] = C2188811AlT.LIZIZ(sbLIZ3);
        objArr[2] = LJJLIL();
        SimRadar.keyScan("SimPlayer", "setSurface", objArr);
        if (z) {
            this.LIZIZ.LJJIL(surface);
        } else {
            this.LIZIZ.setSurface(surface);
        }
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJLIIIJILLIZJL(String str, String str2) {
        ((C650730Pfj) getLegacy()).LIZ.LIZIZ.LJJLIIIJILLIZJL(str, str2);
    }

    @Override // X.InterfaceC1483670oiD
    public final void LJJLIIIJJIZ(String str, boolean z) {
        this.LIZIZ.LJJLIIIJJIZ(str, z);
    }

    public final void LJLI(final C1479530obX c1479530obX, final C1479510obV c1479510obV) {
        if (C1474810oTv.LLJJJJJIL()) {
            getClass();
            if (this.LJIILIIL) {
                if (c1479530obX.LJJIII) {
                    this.LJIILJJIL.LIZ = c1479530obX.LJJII;
                }
                c1479510obV.LJJLIIIJL = this.LJIILJJIL.LIZ;
            } else {
                c1479510obV.LJJLIIIJL = c1479530obX.LJJII;
            }
            c1479510obV.LJJIZ = c1479530obX.LJIIL;
            c1479510obV.LJJJ = c1479530obX.LJIILIIL;
            c1479510obV.LJL = c1479530obX.LJIIIZ;
            c1479510obV.LJLI = c1479530obX.LJJZ;
            c1479510obV.LLILLJJLI = c1479530obX.LJLIIIL;
            c1479510obV.LJLIIIL = c1479530obX.LJJIIJ;
            c1479510obV.LJLIIL = Long.valueOf(c1479530obX.LJJIIJZLJL);
            c1479510obV.LJLIL = c1479530obX.LJJIIZ;
            c1479510obV.LJLILLLLZI = c1479530obX.LJJIIZI;
            c1479510obV.LJLJI = c1479530obX.LJJIJ;
            c1479510obV.LLJL = c1479530obX.LJJIJIIJI;
            c1479510obV.LJLJJI = c1479530obX.LJJIJIIJIL;
            c1479510obV.LJLJJL = c1479530obX.LJJIJIL;
            c1479510obV.LJLJJLL = c1479530obX.LJJIJL;
            c1479510obV.LJLJL = c1479530obX.LJJIJLIJ;
            SimVideo simVideo = c1479530obX.LIZLLL;
            if (simVideo != null) {
                c1479510obV.LJJJZ = simVideo.getWidth();
                c1479510obV.LJJL = c1479530obX.LIZLLL.getHeight();
            }
            c1479510obV.LLIIIILZ = c1479530obX.LJJJJJL;
            c1479510obV.LLIIIJ = c1479530obX.LJJJJL;
            c1479510obV.LJJJJI = c1479530obX.LJJIL;
            c1479510obV.LJJJJIZL = c1479530obX.LJJIZ;
            c1479510obV.LJJJJJ = c1479530obX.LJJJ;
            c1479510obV.LLIIIL = c1479530obX.LJJJJZ;
            c1479510obV.LJLLI = c1479530obX.LJJJI;
            c1479510obV.LJLLILLLL = c1479530obX.LJJJIL;
            c1479510obV.LJLLL = c1479530obX.LJJJJ;
            c1479510obV.LJLLLL = c1479530obX.LJJJJI;
            c1479510obV.LJLLLLLL = c1479530obX.LJJJJIZL;
            c1479510obV.LJLZ = c1479530obX.LJFF;
            c1479510obV.LLIIJI = c1479530obX.LJJJJLI;
            c1479510obV.LLIIJLIL = c1479530obX.LJJJJLL;
            c1479510obV.LJJJJLI = null;
            c1479510obV.LJJJJLL = c1479530obX.LJLLI;
            c1479510obV.LLJJI = c1479530obX.LJLLILLLL;
            c1479510obV.LLJJIII = c1479530obX.LJLLJ;
            c1479510obV.LLJJIJI = c1479530obX.LJLLL;
            c1479510obV.LLJJIJIL = c1479530obX.LJLLLLLL;
            c1479510obV.LIZJ = c1479530obX.LIZJ;
            EnumC1477770oYh.Audio.call(new InterfaceC1481300oeO<Object>() { // from class: X.0obO
                @Override // X.InterfaceC1481300oeO
                public final Object call() {
                    C1479290ob9.LJIIIZ(c1479510obV, c1479530obX.LJ);
                    return null;
                }
            });
            EnumC1477770oYh.SubTitle.call(new InterfaceC1481300oeO<Object>() { // from class: X.0obR
                @Override // X.InterfaceC1481300oeO
                public final Object call() {
                    C1479380obI c1479380obI = c1479530obX.LJJJJJ;
                    if (c1479380obI != null && !c1479380obI.getCaptionInfos().isEmpty()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("setSubList: subtitle: clientCaptionModel, aid=");
                        sbLIZ.append(c1479510obV.LJIIIZ);
                        C1481110oe5.LIZIZ("SimPlayerPrepareDataHelper", C2188811AlT.LIZIZ(sbLIZ));
                        C1479290ob9.LJIIJ(c1479510obV, c1479530obX.LJJJJJ);
                        return null;
                    }
                    SimVideo simVideo2 = c1479530obX.LIZLLL;
                    if (simVideo2 == null || simVideo2.getClaInfo() == null || c1479530obX.LIZLLL.getClaInfo().getCaptionInfos().isEmpty()) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("setSubList: subtitle: video has no caption model, aid=");
                        sbLIZ2.append(c1479510obV.LJIIIZ);
                        C1481110oe5.LIZIZ("SimPlayerPrepareDataHelper", C2188811AlT.LIZIZ(sbLIZ2));
                        return null;
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("setSubList: subtitle: serverCaptionModel, aid=");
                    sbLIZ3.append(c1479510obV.LJIIIZ);
                    C1481110oe5.LIZIZ("SimPlayerPrepareDataHelper", C2188811AlT.LIZIZ(sbLIZ3));
                    C1479290ob9.LJIIJ(c1479510obV, c1479530obX.LIZLLL.getClaInfo());
                    return null;
                }
            });
            if (!TextUtils.isEmpty(c1479530obX.LJJLL)) {
                c1479510obV.LLILIL = c1479530obX.LJJLL;
            }
            c1479510obV.LLILLL = c1479530obX.LJLIIL;
            c1479510obV.LLILZIL = c1479530obX.LJLILLLLZI;
            c1479510obV.LLILZ = c1479530obX.LJLIL;
            c1479510obV.LLILZLL = c1479530obX.LJLJI;
            c1479510obV.LLIZLLLIL = c1479530obX.LJLJJI;
            c1479510obV.LLJJJJ = c1479530obX.LIZ;
            c1479510obV.LLJJJJJIL = c1479530obX.LJZ;
            c1479510obV.LLJJIJIIJIL = c1479530obX.LJLLLL;
            c1479510obV.LLJ = c1479530obX.LJJLIIIJLJLI;
            c1479510obV.LLJJJJLIIL = c1479530obX.LJZI;
            c1479510obV.LLJJL = c1479530obX.LJZL;
            return;
        }
        if (this.LJIILIIL) {
            if (c1479530obX.LJJIII) {
                this.LJIILJJIL.LIZ = c1479530obX.LJJII;
            }
            c1479510obV.LJJLIIIJL = this.LJIILJJIL.LIZ;
        } else {
            c1479510obV.LJJLIIIJL = c1479530obX.LJJII;
        }
        c1479510obV.LJJIZ = c1479530obX.LJIIL;
        c1479510obV.LJJJ = c1479530obX.LJIILIIL;
        c1479510obV.LJL = c1479530obX.LJIIIZ;
        c1479510obV.LJLI = c1479530obX.LJJZ;
        c1479510obV.LLILLJJLI = c1479530obX.LJLIIIL;
        c1479510obV.LJLIIIL = c1479530obX.LJJIIJ;
        c1479510obV.LJLIIL = Long.valueOf(c1479530obX.LJJIIJZLJL);
        c1479510obV.LJLIL = c1479530obX.LJJIIZ;
        c1479510obV.LJLILLLLZI = c1479530obX.LJJIIZI;
        c1479510obV.LJLJI = c1479530obX.LJJIJ;
        c1479510obV.LLJL = c1479530obX.LJJIJIIJI;
        c1479510obV.LJLJJI = c1479530obX.LJJIJIIJIL;
        c1479510obV.LJLJJL = c1479530obX.LJJIJIL;
        c1479510obV.LJLJJLL = c1479530obX.LJJIJL;
        c1479510obV.LJLJL = c1479530obX.LJJIJLIJ;
        SimVideo simVideo2 = c1479530obX.LIZLLL;
        if (simVideo2 != null) {
            c1479510obV.LJJJZ = simVideo2.getWidth();
            c1479510obV.LJJL = c1479530obX.LIZLLL.getHeight();
        }
        c1479510obV.LLIIIILZ = c1479530obX.LJJJJJL;
        c1479510obV.LLIIIJ = c1479530obX.LJJJJL;
        c1479510obV.LJJJJI = c1479530obX.LJJIL;
        c1479510obV.LJJJJIZL = c1479530obX.LJJIZ;
        c1479510obV.LJJJJJ = c1479530obX.LJJJ;
        c1479510obV.LLIIIL = c1479530obX.LJJJJZ;
        c1479510obV.LJLLI = c1479530obX.LJJJI;
        c1479510obV.LJLLILLLL = c1479530obX.LJJJIL;
        c1479510obV.LJLLL = c1479530obX.LJJJJ;
        c1479510obV.LJLLLL = c1479530obX.LJJJJI;
        c1479510obV.LJLLLLLL = c1479530obX.LJJJJIZL;
        c1479510obV.LJLZ = c1479530obX.LJFF;
        c1479510obV.LLIIJI = c1479530obX.LJJJJLI;
        c1479510obV.LLIIJLIL = c1479530obX.LJJJJLL;
        c1479510obV.LJJJJLI = null;
        c1479510obV.LJJJJLL = c1479530obX.LJLLI;
        c1479510obV.LLJJI = c1479530obX.LJLLILLLL;
        c1479510obV.LLJJIII = c1479530obX.LJLLJ;
        c1479510obV.LLJJIJI = c1479530obX.LJLLL;
        c1479510obV.LLJJIJIL = c1479530obX.LJLLLLLL;
        c1479510obV.LIZJ = c1479530obX.LIZJ;
        EnumC1477770oYh.Audio.call(new InterfaceC1481300oeO<Object>() { // from class: X.0obP
            @Override // X.InterfaceC1481300oeO
            public final Object call() {
                C1479290ob9.LJIIIZ(c1479510obV, c1479530obX.LJ);
                return null;
            }
        });
        EnumC1477770oYh.SubTitle.call(new InterfaceC1481300oeO<Object>() { // from class: X.0obQ
            @Override // X.InterfaceC1481300oeO
            public final Object call() {
                C1479380obI c1479380obI = c1479530obX.LJJJJJ;
                if (c1479380obI != null && !c1479380obI.getCaptionInfos().isEmpty()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("setSubList: subtitle: clientCaptionModel, aid=");
                    sbLIZ.append(c1479510obV.LJIIIZ);
                    C1481110oe5.LIZIZ("SimPlayer", C2188811AlT.LIZIZ(sbLIZ));
                    C1479290ob9.LJIIJ(c1479510obV, c1479530obX.LJJJJJ);
                    return null;
                }
                SimVideo simVideo3 = c1479530obX.LIZLLL;
                if (simVideo3 == null || simVideo3.getClaInfo() == null || c1479530obX.LIZLLL.getClaInfo().getCaptionInfos().isEmpty()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("setSubList: subtitle: video has no caption model, aid=");
                    sbLIZ2.append(c1479510obV.LJIIIZ);
                    C1481110oe5.LIZIZ("SimPlayer", C2188811AlT.LIZIZ(sbLIZ2));
                    return null;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("setSubList: subtitle: serverCaptionModel, aid=");
                sbLIZ3.append(c1479510obV.LJIIIZ);
                C1481110oe5.LIZIZ("SimPlayer", C2188811AlT.LIZIZ(sbLIZ3));
                C1479290ob9.LJIIJ(c1479510obV, c1479530obX.LIZLLL.getClaInfo());
                return null;
            }
        });
        if (!TextUtils.isEmpty(c1479530obX.LJJLL)) {
            c1479510obV.LLILIL = c1479530obX.LJJLL;
        }
        c1479510obV.LLILLL = c1479530obX.LJLIIL;
        c1479510obV.LLILZIL = c1479530obX.LJLILLLLZI;
        c1479510obV.LLILZ = c1479530obX.LJLIL;
        c1479510obV.LLILZLL = c1479530obX.LJLJI;
        c1479510obV.LLIZLLLIL = c1479530obX.LJLJJI;
        c1479510obV.LLJJJJ = c1479530obX.LIZ;
        c1479510obV.LLJJJJJIL = c1479530obX.LJZ;
        c1479510obV.LLJJIJIIJIL = c1479530obX.LJLLLL;
        c1479510obV.LLJ = c1479530obX.LJJLIIIJLJLI;
        c1479510obV.LLJJJJLIIL = c1479530obX.LJZI;
        c1479510obV.LLJJL = c1479530obX.LJZL;
    }

    public final void LJLIIL(String str, C1480660odM c1480660odM) {
        C1479810obz c1479810obz;
        if (C1474810oTv.LLJJJJJIL()) {
            this.LJJ.getClass();
            C1479650obj.LIZIZ(str, c1480660odM, this);
        } else if (!TextUtils.isEmpty(str) && (c1479810obz = this.LJJII) != null) {
            try {
                c1479810obz.put(str, c1480660odM);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LJLIL(boolean z, C1479510obV c1479510obV) {
        InterfaceC1477220oXo interfaceC1477220oXoLJIJI;
        InterfaceC1477220oXo interfaceC1477220oXoLJIJI2;
        if (C1474810oTv.LLJJJJJIL()) {
            getClass();
            int iIntValue = ((Number) C1474810oTv.LLLLLILLIL.getValue()).intValue();
            if (iIntValue > 0 && c1479510obV != null && (interfaceC1477220oXoLJIJI2 = C1477400oY6.LJJJJI.LJIJI(c1479510obV.LJIIIZ)) != null) {
                if (z) {
                    if (iIntValue == 1 || iIntValue == 2) {
                        if (C1481110oe5.LIZ) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("tryAdjustBytevc1-play before : ");
                            sbLIZ.append(c1479510obV.LJIILIIL);
                            C1481110oe5.LIZIZ("SimPlayerPrepareDataHelper", C2188811AlT.LIZIZ(sbLIZ));
                        }
                        c1479510obV.LJIILIIL = interfaceC1477220oXoLJIJI2.isBytevc1();
                        if (C1481110oe5.LIZ) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("tryAdjustBytevc1-play after : ");
                            sbLIZ2.append(c1479510obV.LJIILIIL);
                            C1481110oe5.LIZIZ("SimPlayerPrepareDataHelper", C2188811AlT.LIZIZ(sbLIZ2));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (iIntValue != 1 && iIntValue != 3) {
                    return;
                }
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("tryAdjustBytevc1-prerender before : ");
                    sbLIZ3.append(c1479510obV.LJIILIIL);
                    C1481110oe5.LIZIZ("SimPlayerPrepareDataHelper", C2188811AlT.LIZIZ(sbLIZ3));
                }
                c1479510obV.LJIILIIL = interfaceC1477220oXoLJIJI2.isBytevc1();
                if (!C1481110oe5.LIZ) {
                    return;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("tryAdjustBytevc1-prerender after : ");
                sbLIZ4.append(c1479510obV.LJIILIIL);
                C1481110oe5.LIZIZ("SimPlayerPrepareDataHelper", C2188811AlT.LIZIZ(sbLIZ4));
                return;
            }
            return;
        }
        int iIntValue2 = ((Number) C1474810oTv.LLLLLILLIL.getValue()).intValue();
        if (iIntValue2 <= 0 || c1479510obV == null || (interfaceC1477220oXoLJIJI = C1477400oY6.LJJJJI.LJIJI(c1479510obV.LJIIIZ)) == null) {
            return;
        }
        if (z) {
            if (iIntValue2 == 1 || iIntValue2 == 2) {
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("tryAdjustBytevc1-play before : ");
                    sbLIZ5.append(c1479510obV.LJIILIIL);
                    C1481110oe5.LIZIZ("SimPlayer", C2188811AlT.LIZIZ(sbLIZ5));
                }
                c1479510obV.LJIILIIL = interfaceC1477220oXoLJIJI.isBytevc1();
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("tryAdjustBytevc1-play after : ");
                    sbLIZ6.append(c1479510obV.LJIILIIL);
                    C1481110oe5.LIZIZ("SimPlayer", C2188811AlT.LIZIZ(sbLIZ6));
                    return;
                }
                return;
            }
            return;
        }
        if (iIntValue2 == 1 || iIntValue2 == 3) {
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("tryAdjustBytevc1-prerender before : ");
                sbLIZ7.append(c1479510obV.LJIILIIL);
                C1481110oe5.LIZIZ("SimPlayer", C2188811AlT.LIZIZ(sbLIZ7));
            }
            c1479510obV.LJIILIIL = interfaceC1477220oXoLJIJI.isBytevc1();
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("tryAdjustBytevc1-prerender after : ");
                sbLIZ8.append(c1479510obV.LJIILIIL);
                C1481110oe5.LIZIZ("SimPlayer", C2188811AlT.LIZIZ(sbLIZ8));
            }
        }
    }

    public final void LJLIIIL(InterfaceC1480060ocO interfaceC1480060ocO, String str, long j) {
        if (C1474810oTv.LLJJJJJIL()) {
            this.LJJ.getClass();
            if (interfaceC1480060ocO != null && !TextUtils.isEmpty(str) && j > 0) {
                interfaceC1480060ocO.LIZIZ(1, j, str);
                return;
            }
            return;
        }
        if (interfaceC1480060ocO != null && !TextUtils.isEmpty(str) && j > 0) {
            interfaceC1480060ocO.LIZIZ(1, j, str);
        }
    }
}
