package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.sdui.render.bridge.ReadableArray;
import com.bytedance.sdui.render.bridge.ReadableMap;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import com.bytedance.sdui.render.tasm.behavior.utils.SDUIUIMethodsExecutor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kHi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313480kHi implements InterfaceC1317830kOj {
    public static final Set<String> LIZIZ = new HashSet(Arrays.asList("x-overlay", "x-input", "input", "page"));
    public final C1313470kHh LIZ;

    @Override // X.InterfaceC1317830kOj
    public final void LJFF() {
        C1313470kHh c1313470kHh = this.LIZ;
        Iterator<Integer> it2 = c1313470kHh.LJFF.keySet().iterator();
        while (it2.hasNext()) {
            SDUIBaseUI sDUIBaseUI = c1313470kHh.LJFF.get(it2.next());
            if (sDUIBaseUI != null) {
                sDUIBaseUI.LJJLIIIJLJLI();
            }
        }
    }

    public C1313480kHi(C1313470kHh c1313470kHh) {
        this.LIZ = c1313470kHh;
    }

    @Override // X.InterfaceC1317830kOj
    public final void LJII(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C1298130jsx.LIZ.getClass();
            C1297860jsW c1297860jsWLIZIZ = C1298130jsx.LIZIZ(jSONObject);
            AbstractC1317090kNX abstractC1317090kNX = this.LIZ.LIZJ;
            ReadableMap map = c1297860jsWLIZIZ.getMap("keyframes");
            if (abstractC1317090kNX.LL == null) {
                abstractC1317090kNX.LL = new C1297860jsW();
            }
            abstractC1317090kNX.LL.merge(map);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC1317830kOj
    public final void LIZ(int i, Object obj) {
        C1313470kHh c1313470kHh = this.LIZ;
        c1313470kHh.getClass();
        if (C1290750jh3.LIZ()) {
            SDUIBaseUI sDUIBaseUI = c1313470kHh.LJFF.get(Integer.valueOf(i));
            if (sDUIBaseUI != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("UIOwner.updateViewExtra");
                sbLIZ.append(sDUIBaseUI.LJJIJIL());
                C2188811AlT.LIZIZ(sbLIZ);
                sDUIBaseUI.LJLIIIL(obj);
                return;
            }
            return;
        }
        throw new AssertionError("Expected to run on UI thread!");
    }

    @Override // X.InterfaceC1317830kOj
    public final void LIZJ(int i, int i2) {
        SDUIBaseUI sDUIBaseUI;
        SDUIBaseUI sDUIBaseUILJJIIJZLJL;
        C1313470kHh c1313470kHh = this.LIZ;
        if (c1313470kHh.LJFF.size() > 0 && (sDUIBaseUI = c1313470kHh.LJFF.get(Integer.valueOf(i2))) != null) {
            c1313470kHh.LJ.remove(sDUIBaseUI);
            C1313470kHh.LJIIL(sDUIBaseUI);
            c1313470kHh.LJFF.remove(Integer.valueOf(i2));
            c1313470kHh.LIZJ.LJ(sDUIBaseUI);
            sDUIBaseUI.LJIIJ();
            c1313470kHh.LIZLLL(sDUIBaseUI);
            if (i == -1) {
                sDUIBaseUILJJIIJZLJL = sDUIBaseUI.LJJIIJZLJL();
            } else {
                sDUIBaseUILJJIIJZLJL = c1313470kHh.LJFF.get(Integer.valueOf(i));
            }
            if (sDUIBaseUILJJIIJZLJL != null) {
                sDUIBaseUILJJIIJZLJL.LJJLIIJ(sDUIBaseUI);
            }
        }
    }

    @Override // X.InterfaceC1317830kOj
    public final void LJIIIIZZ(int i, String str) {
        try {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.LIZ.LIZJ.LIZLLL();
                        return;
                    }
                    return;
                } else {
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.optInt("source");
                    jSONObject.optInt("severity");
                    jSONObject.optString("msg");
                    return;
                }
            }
            JSONObject jSONObject2 = new JSONObject(str);
            this.LIZ.LIZJ.LLIZLLLIL.LJII(new C1291190jhl(jSONObject2.optInt("code"), jSONObject2.optString("message")));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC1317830kOj
    public final void LJIIL(int i, int i2) {
        this.LIZ.LJIIJJI(i, i2);
    }

    @Override // X.InterfaceC1317830kOj
    public final void LIZLLL(Long l, String str, String str2) {
        this.LIZ.LIZJ.LLJILLL.LIZ(l, str, str2);
    }

    @Override // X.InterfaceC1317830kOj
    public final void LJIIJ(int i, C1297860jsW c1297860jsW, C1297910jsb c1297910jsb) {
        C1291290jhv c1291290jhv;
        Map<String, C1297940jse> mapLIZ = C1297940jse.LIZ(c1297910jsb);
        C1313470kHh c1313470kHh = this.LIZ;
        if (c1297860jsW != null) {
            c1291290jhv = new C1291290jhv(c1297860jsW);
        } else {
            c1291290jhv = null;
        }
        c1313470kHh.LJIILL(i, c1291290jhv, mapLIZ);
    }

    @Override // X.InterfaceC1317830kOj
    public final void LJIIJJI(int i, int i2, int i3) {
        this.LIZ.LJIIIIZZ(i, i2, i3);
    }

    @Override // X.InterfaceC1317830kOj
    public final void LIZIZ(Long l, String str, String str2, String str3) {
        ((InterfaceC1314850kJv) ((HashMap) this.LIZ.LIZJ.LLJJIJIIJIL.LIZ).get(str)).LIZ(str2, str3);
    }

    @Override // X.InterfaceC1317830kOj
    public final Runnable LJ(final int i, final String str, final C1297860jsW c1297860jsW, final C1297910jsb c1297910jsb) {
        C1291290jhv c1291290jhv;
        if (C1315530kL1.LJ().LJIIIIZZ) {
            ((HashSet) LIZIZ).contains(str);
        }
        if (C1317810kOh.LJIIJ) {
            ExecutorService executorServiceE4 = null;
            if (c1297860jsW != null) {
                c1291290jhv = new C1291290jhv(c1297860jsW);
            } else {
                c1291290jhv = null;
            }
            Map<String, C1297940jse> mapLIZ = C1297940jse.LIZ(c1297910jsb);
            C1313470kHh c1313470kHh = this.LIZ;
            c1313470kHh.getClass();
            if (C1314100kIi.LIZIZ == null) {
                synchronized (C1314100kIi.class) {
                    try {
                        if (C1314100kIi.LIZIZ == null) {
                            try {
                                executorServiceE4 = C786410Ut5.e4(Runtime.getRuntime().availableProcessors(), new ThreadFactoryC1314210kIt("sdui-view-op-thread", 10));
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C1314100kIi.LIZ = new ExecutorC1314640kJa();
                            }
                            C1314100kIi.LIZIZ = executorServiceE4;
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
            }
            final Future futureSubmit = C1314100kIi.LIZIZ.submit(new CallableC1313590kHt(c1313470kHh, str, i, c1291290jhv, mapLIZ));
            return new Runnable() { // from class: X.0kGQ
                public final /* synthetic */ boolean LLILZLL = false;

                public final void LIZ() {
                    C1313480kHi c1313480kHi = this.LLIZ;
                    Future future = futureSubmit;
                    int i2 = i;
                    String str2 = str;
                    ReadableMap readableMap = c1297860jsW;
                    ReadableArray readableArray = c1297910jsb;
                    boolean z = this.LLILZLL;
                    c1313480kHi.getClass();
                    if (future.isDone()) {
                        try {
                            Runnable runnable = (Runnable) future.get();
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                        } catch (InterruptedException | ExecutionException e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("createViewAsync failed, tagName:");
                            sbLIZ.append(str2);
                            sbLIZ.append(", error:");
                            sbLIZ.append(e);
                            c1313480kHi.LIZ.LIZJ.handleException(new Exception(C2188811AlT.LIZIZ(sbLIZ)));
                        }
                    } else {
                        future.cancel(true);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("createViewAsync not done, will create on ui thread, tagName:");
                        sbLIZ2.append(str2);
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    c1313480kHi.LJIILIIL(i2, str2, readableMap, readableArray, z);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PaintingContext@ca5c.createNode$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PaintingContext@ca5c.createNode$1");
                }
            };
        }
        return new Runnable() { // from class: X.0kGS
            public final /* synthetic */ boolean LLILZIL = false;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PaintingContext@ca5c.createNode$2");
                try {
                    this.LLILZLL.LJIILIIL(i, str, c1297860jsW, c1297910jsb, this.LLILZIL);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PaintingContext@ca5c.createNode$2");
            }
        };
    }

    @Override // X.InterfaceC1317830kOj
    public final void LJI(final String str, final C1297910jsb c1297910jsb, final String str2, final C1297860jsW c1297860jsW, final Long l) {
        final AbstractC1317090kNX abstractC1317090kNX = this.LIZ.LIZJ;
        C1290750jh3.LIZLLL(new AbstractRunnableC1297960jsg(abstractC1317090kNX) { // from class: X.0jsf
            @Override // X.AbstractRunnableC1297960jsg
            public final void LIZ() {
                SDUIBaseUI sDUIBaseUILJFF;
                int iIntValue = !TextUtils.isEmpty(str) ? CastIntegerProtector.parseInt(str) : -1;
                AbstractC1317090kNX abstractC1317090kNX2 = abstractC1317090kNX;
                ReadableArray readableArray = c1297910jsb;
                String str3 = str2;
                ReadableMap readableMap = c1297860jsW;
                C1298540jtc c1298540jtc = new C1298540jtc(abstractC1317090kNX2, l);
                C1313470kHh c1313470kHh = abstractC1317090kNX2.LLILZLL.get();
                if (c1313470kHh != null) {
                    if (iIntValue == -1) {
                        sDUIBaseUILJFF = c1313470kHh.LIZIZ;
                    } else {
                        if (c1313470kHh.LJII.containsKey(Integer.valueOf(iIntValue))) {
                            iIntValue = c1313470kHh.LJII.get(Integer.valueOf(iIntValue)).intValue();
                        }
                        HashMap<Integer, SDUIBaseUI> map = c1313470kHh.LJFF;
                        sDUIBaseUILJFF = map != null ? map.get(Integer.valueOf(iIntValue)) : null;
                    }
                    String strLIZIZ = "component not found";
                    if (sDUIBaseUILJFF != null) {
                        for (int i = 0; i < readableArray.size(); i++) {
                            String string = readableArray.getString(i);
                            boolean z = readableMap != null && readableMap.size() > 0 && readableMap.hasKey("_isCallByRefId") && readableMap.getBoolean("_isCallByRefId");
                            if (!string.startsWith("#") && !z) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(string);
                                sbLIZ.append(" not support，only support id selector currently");
                                c1298540jtc.invoke(new Object[]{5, C2188811AlT.LIZIZ(sbLIZ)});
                                return;
                            }
                            String strSubstring = string.substring(1);
                            sDUIBaseUILJFF = z ? C1313470kHh.LJFF(string, sDUIBaseUILJFF) : C1313470kHh.LJI(strSubstring, sDUIBaseUILJFF);
                            if (sDUIBaseUILJFF == null) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("not found ");
                                sbLIZ2.append(string);
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                            } else {
                                if (sDUIBaseUILJFF.LJIJ() != null) {
                                    sDUIBaseUILJFF.LJIJ().equals(strSubstring);
                                }
                            }
                        }
                        SDUIUIMethodsExecutor.LIZ(sDUIBaseUILJFF, str3, readableMap, c1298540jtc);
                        return;
                    }
                    c1298540jtc.invoke(new Object[]{2, strLIZIZ});
                }
            }
        });
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJIILIIL(int i, String str, ReadableMap readableMap, ReadableArray readableArray, boolean z) {
        C1291290jhv c1291290jhv;
        StringBuilder sbLIZ;
        HashMap<Integer, SDUIBaseUI> map;
        Integer numValueOf;
        SDUIBaseUI sDUIBaseUILIZ = null;
        c1313490kHj = null;
        C1313490kHj c1313490kHj = null;
        if (readableMap != null) {
            c1291290jhv = new C1291290jhv(readableMap);
        } else {
            c1291290jhv = null;
        }
        Map<String, C1297940jse> mapLIZ = C1297940jse.LIZ(readableArray);
        C1313470kHh c1313470kHh = this.LIZ;
        synchronized (c1313470kHh) {
            if (str.equals("list")) {
                C1317100kNY c1317100kNY = c1313470kHh.LIZJ.LLJJJJ;
                c1317100kNY.LJIJ = i;
                c1317100kNY.LJIIL++;
            }
            if (str.equals("list") && c1291290jhv.LJII("custom-list-name")) {
                str = c1291290jhv.LJI("custom-list-name");
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("UIOwner.createView.");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (C1290750jh3.LIZ()) {
                try {
                    SDUIBaseUI sDUIBaseUILIZJ = c1313470kHh.LIZJ(i, str, mapLIZ, z);
                    if (c1291290jhv != null) {
                        try {
                            if (C1313470kHh.LJII(c1291290jhv)) {
                                c1313490kHj = new C1313490kHj(c1313470kHh.LIZJ, sDUIBaseUILIZJ);
                            }
                            sDUIBaseUILIZJ.LJLJI(c1291290jhv);
                        } catch (Throwable th) {
                            th = th;
                            sDUIBaseUILIZ = sDUIBaseUILIZJ;
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("createUI catch error while createUI for tag: ");
                                sbLIZ3.append(str);
                                sbLIZ3.append(", ");
                                sbLIZ3.append(th.getMessage());
                                RuntimeException runtimeException = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3), th);
                                runtimeException.setStackTrace(th.getStackTrace());
                                c1313470kHh.LIZIZ.LLILZ.handleException(runtimeException);
                                if (sDUIBaseUILIZ != null) {
                                    c1313470kHh.LIZLLL.add(str);
                                    c1313470kHh.LJIILJJIL(i, str, c1291290jhv);
                                    map = c1313470kHh.LJFF;
                                    numValueOf = Integer.valueOf(i);
                                } else {
                                    sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("createUI got null ui for tag:");
                                    sbLIZ.append(str);
                                    C2188811AlT.LIZIZ(sbLIZ);
                                }
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                if (sDUIBaseUILIZ != null) {
                                    c1313470kHh.LIZLLL.add(str);
                                    c1313470kHh.LJIILJJIL(i, str, c1291290jhv);
                                    c1313470kHh.LJFF.put(Integer.valueOf(i), sDUIBaseUILIZ);
                                } else {
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("createUI got null ui for tag:");
                                    sbLIZ4.append(str);
                                    C2188811AlT.LIZIZ(sbLIZ4);
                                }
                                throw th2;
                            }
                        }
                    }
                    sDUIBaseUILIZ = c1313470kHh.LIZ(sDUIBaseUILIZJ, c1313490kHj, c1291290jhv);
                } catch (Throwable th3) {
                    th = th3;
                }
                if (sDUIBaseUILIZ != null) {
                    c1313470kHh.LIZLLL.add(str);
                    c1313470kHh.LJIILJJIL(i, str, c1291290jhv);
                    map = c1313470kHh.LJFF;
                    numValueOf = Integer.valueOf(i);
                    map.put(numValueOf, sDUIBaseUILIZ);
                } else {
                    sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("createUI got null ui for tag:");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            } else {
                throw new AssertionError("Expected to run on UI thread!");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04a0  */
    @Override // X.InterfaceC1317830kOj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(int r61, float r62, float r63, float r64, float r65, float r66, float r67, float r68, float r69, float r70, float r71, float r72, float r73, float[] r74) {
        /*
            Method dump skipped, instruction units count: 1571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1313480kHi.LJIIIZ(int, float, float, float, float, float, float, float, float, float, float, float, float, float[]):void");
    }
}
