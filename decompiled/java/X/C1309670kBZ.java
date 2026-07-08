package X;

import Y.ARunnableS25S1100000_20;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.Choreographer;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0kBZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1309670kBZ extends AbstractC1298500jtY {
    public final HashMap<String, C1309680kBa> LJIJJLI;
    public HashSet<C1309680kBa> LJIL;
    public HashSet<C1309680kBa> LJJ;
    public RectF LJJI;
    public boolean LJJIFFI;
    public C1309700kBc LJJII;
    public final ChoreographerFrameCallbackC1290420jgW LJJIII;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0jgW] */
    public C1309670kBZ() {
        super("Lynx.UIExposure");
        this.LJIJJLI = new HashMap<>();
        this.LJJ = new HashSet<>();
        this.LJIL = new HashSet<>();
        this.LIZ = new WeakReference<>(null);
        this.LJJIII = new Choreographer.FrameCallback(this) { // from class: X.0jgW
            public final WeakReference<C1309670kBZ> LL;

            {
                this.LL = new WeakReference<>(this);
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                C1309670kBZ c1309670kBZ = this.LL.get();
                if (c1309670kBZ != null) {
                    c1309670kBZ.LJIIIIZZ();
                }
            }
        };
    }

    @Override // X.AbstractC1298500jtY
    public final void LJIIIIZZ() {
        boolean z;
        RectF rectF;
        if (this.LJJIFFI) {
            LynxLog.e("Lynx.UIExposure", "Lynx exposureHandler failed since lynx.stopExposure() is called");
            this.LJIILJJIL = false;
            return;
        }
        if (!this.LJFF) {
            LynxLog.e("Lynx.UIExposure", "Lynx exposureHandler failed since rootView not draw");
            this.LJIILJJIL = false;
            return;
        }
        C1310660kDA c1310660kDALJFF = LJFF();
        if (c1310660kDALJFF == null) {
            LynxLog.e("Lynx.UIExposure", "Lynx exposureHandler failed since rootView is null");
            this.LJIILJJIL = false;
            return;
        }
        if (!c1310660kDALJFF.isShown()) {
            if (this.LJIILLIIL) {
                LJIILLIIL(new HashSet<>(this.LJJ), "disexposure");
                this.LJJ.clear();
            }
            this.LJIILJJIL = false;
            return;
        }
        if (!this.LJIIZILJ && c1310660kDALJFF.isLayoutRequested()) {
            ChoreographerFrameCallbackC1290420jgW choreographerFrameCallbackC1290420jgW = this.LJJIII;
            this.LJIILJJIL = true;
            C786410Ut5.v2().postFrameCallbackDelayed(choreographerFrameCallbackC1290420jgW, this.LJI);
            return;
        }
        this.LJJI = LJI(this.LIZ.get().mContext);
        for (C1309680kBa c1309680kBa : this.LJIJJLI.values()) {
            LynxBaseUI lynxBaseUI = c1309680kBa.LIZ.get();
            if (lynxBaseUI != null && lynxBaseUI.getHeight() != 0 && lynxBaseUI.getWidth() != 0) {
                ArrayList arrayList = new ArrayList();
                LynxBaseUI lynxBaseUI2 = lynxBaseUI;
                while (lynxBaseUI2 != this.LIZ.get()) {
                    if (!(lynxBaseUI2 instanceof LynxUI) || lynxBaseUI2.isVisible()) {
                        EnumC1311650kEl enumC1311650kEl = lynxBaseUI2.mEnableExposureUIClip;
                        if (enumC1311650kEl == EnumC1311650kEl.Enable || (enumC1311650kEl == EnumC1311650kEl.Undefined && lynxBaseUI2.isScrollContainer())) {
                            arrayList.add(lynxBaseUI2);
                        }
                        if (lynxBaseUI2.isOverlay()) {
                            z = true;
                            break;
                        } else {
                            lynxBaseUI2 = (LynxBaseUI) lynxBaseUI2.mParent;
                            if (lynxBaseUI2 == null) {
                                break;
                            }
                        }
                    }
                }
                z = false;
                RectF rectFLIZLLL = LIZLLL(lynxBaseUI);
                if (lynxBaseUI.getEnableExposureUIMargin()) {
                    float fWidth = rectFLIZLLL.width();
                    float fHeight = rectFLIZLLL.height();
                    DisplayMetrics displayMetrics = lynxBaseUI.mContext.LLJJJ;
                    float fLJ = C1312920kGo.LJ(lynxBaseUI.mExposureUIMarginLeft, fWidth, displayMetrics);
                    float fLJ2 = C1312920kGo.LJ(lynxBaseUI.mExposureUIMarginRight, fWidth, displayMetrics);
                    float fLJ3 = C1312920kGo.LJ(lynxBaseUI.mExposureUIMarginTop, fHeight, displayMetrics);
                    float fLJ4 = C1312920kGo.LJ(lynxBaseUI.mExposureUIMarginBottom, fHeight, displayMetrics);
                    if (fWidth + fLJ + fLJ2 <= 0.0f || fHeight + fLJ3 + fLJ4 <= 0.0f) {
                        rectFLIZLLL = new RectF();
                    } else {
                        rectFLIZLLL.left -= fLJ;
                        rectFLIZLLL.top -= fLJ3;
                        rectFLIZLLL.right += fLJ2;
                        rectFLIZLLL.bottom += fLJ4;
                    }
                } else {
                    rectFLIZLLL.left -= lynxBaseUI.getExposureScreenMarginRight() > 0.0f ? lynxBaseUI.getExposureScreenMarginRight() : 0.0f;
                    rectFLIZLLL.right += lynxBaseUI.getExposureScreenMarginLeft() > 0.0f ? lynxBaseUI.getExposureScreenMarginLeft() : 0.0f;
                    rectFLIZLLL.top -= lynxBaseUI.getExposureScreenMarginBottom() > 0.0f ? lynxBaseUI.getExposureScreenMarginBottom() : 0.0f;
                    rectFLIZLLL.bottom += lynxBaseUI.getExposureScreenMarginTop() > 0.0f ? lynxBaseUI.getExposureScreenMarginTop() : 0.0f;
                }
                float fLIZ = C1312920kGo.LIZ(lynxBaseUI.mExposureArea, 0.0f);
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!LJIILIIL(fLIZ, rectFLIZLLL, LIZLLL((LynxBaseUI) it2.next()))) {
                            break;
                        }
                    } else {
                        RectF rectFLIZLLL2 = LIZLLL(this.LIZ.get());
                        if (this.LJJI == null) {
                            this.LJJI = LJI(lynxBaseUI.mContext);
                        }
                        boolean zLJIILIIL = !z ? LJIILIIL(fLIZ, rectFLIZLLL, rectFLIZLLL2) : true;
                        if (this.LJJI != null) {
                            if (lynxBaseUI.getEnableExposureUIMargin()) {
                                if (this.LJJI == null) {
                                    this.LJJI = LJI(lynxBaseUI.mContext);
                                }
                                rectF = new RectF(this.LJJI);
                                if (rectF.width() + lynxBaseUI.getExposureScreenMarginLeft() + lynxBaseUI.getExposureScreenMarginRight() <= 0.0f || rectF.height() + lynxBaseUI.getExposureScreenMarginTop() + lynxBaseUI.getExposureScreenMarginBottom() <= 0.0f) {
                                    rectF = new RectF();
                                } else {
                                    rectF.left -= lynxBaseUI.getExposureScreenMarginLeft();
                                    rectF.top -= lynxBaseUI.getExposureScreenMarginTop();
                                    rectF.right += lynxBaseUI.getExposureScreenMarginRight();
                                    rectF.bottom += lynxBaseUI.getExposureScreenMarginBottom();
                                }
                            } else {
                                rectF = new RectF(this.LJJI.left - ((int) (lynxBaseUI.getExposureScreenMarginLeft() < 0.0f ? lynxBaseUI.getExposureScreenMarginLeft() : 0.0f)), this.LJJI.top - ((int) (lynxBaseUI.getExposureScreenMarginTop() < 0.0f ? lynxBaseUI.getExposureScreenMarginTop() : 0.0f)), this.LJJI.right + ((int) (lynxBaseUI.getExposureScreenMarginRight() < 0.0f ? lynxBaseUI.getExposureScreenMarginRight() : 0.0f)), this.LJJI.bottom + ((int) (lynxBaseUI.getExposureScreenMarginBottom() < 0.0f ? lynxBaseUI.getExposureScreenMarginBottom() : 0.0f)));
                            }
                            boolean zLJIILIIL2 = LJIILIIL(fLIZ, rectFLIZLLL, rectF);
                            boolean zLJIILIIL3 = LJIILIIL(0.0f, rectFLIZLLL2, rectF);
                            if (zLJIILIIL && zLJIILIIL2 && zLJIILIIL3) {
                                this.LJIL.add(c1309680kBa);
                            }
                        } else if (zLJIILIIL) {
                            this.LJIL.add(c1309680kBa);
                        }
                    }
                }
            }
        }
        HashSet<C1309680kBa> hashSet = new HashSet<>();
        hashSet.addAll(this.LJJ);
        hashSet.removeAll(this.LJIL);
        HashSet<C1309680kBa> hashSet2 = new HashSet<>();
        hashSet2.addAll(this.LJIL);
        hashSet2.removeAll(this.LJJ);
        this.LJJ = this.LJIL;
        this.LJIL = new HashSet<>();
        LJIILLIIL(hashSet, "disexposure");
        LJIILLIIL(hashSet2, "exposure");
        this.LJIILJJIL = false;
    }

    public final void LJIILL() {
        if (LynxEnv.inst().isHighlightTouchEnabled()) {
            EnumC1289510jf3.Info.ordinal();
            LynxView lynxView = (LynxView) LJFF();
            if (lynxView != null) {
                lynxView.getBaseInspectorController();
            }
        }
        LynxLog.i("Lynx.UIExposure", "resumeExposure");
        this.LJJIFFI = false;
        LIZIZ();
    }

    public final void LJIIZILJ(HashMap<String, Object> map) {
        if (LynxEnv.inst().isHighlightTouchEnabled()) {
            EnumC1289510jf3.Info.ordinal();
            LynxView lynxView = (LynxView) LJFF();
            if (lynxView != null) {
                lynxView.getBaseInspectorController();
            }
        }
        LynxLog.i("Lynx.UIExposure", "stopExposure");
        this.LJJIFFI = true;
        LIZJ();
        if (map == null || (map.containsKey("sendEvent") && ((Boolean) map.get("sendEvent")).booleanValue())) {
            LJIILLIIL(this.LJJ, "disexposure");
            this.LJJ.clear();
        }
    }

    public final void LJIILJJIL(String str, LynxBaseUI lynxBaseUI) {
        String strLIZIZ;
        if (str != null || lynxBaseUI.mExposureID != null) {
            if (str != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("_");
                sbLIZ.append(lynxBaseUI.mExposureScene);
                sbLIZ.append("_");
                sbLIZ.append(lynxBaseUI.mExposureID);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(lynxBaseUI.mExposureScene);
                sbLIZ2.append("_");
                sbLIZ2.append(lynxBaseUI.mExposureID);
                sbLIZ2.append("_");
                sbLIZ2.append(lynxBaseUI.getSign());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            C1289620jfE.LIZLLL(new ARunnableS25S1100000_20(this, strLIZIZ, 9));
        }
    }

    public final void LJIILLIIL(HashSet<C1309680kBa> hashSet, String str) {
        boolean z;
        String str2;
        if (LJFF() != null && !hashSet.isEmpty()) {
            C1309700kBc c1309700kBc = this.LJJII;
            if (c1309700kBc == null) {
                LynxLog.e("Lynx.UIExposure", "canSendGlobalEvent check failed since mCallback is null.");
            } else {
                s sVar = c1309700kBc.LIZ.get();
                if (sVar == null) {
                    LynxLog.e("UIExposure", "canSendGlobalEvent check failed since can not get LynxContext.");
                } else {
                    LynxView lynxViewLJIILJJIL = sVar.LJIILJJIL();
                    if (lynxViewLJIILJJIL == null) {
                        LynxLog.e("UIExposure", "canSendGlobalEvent check failed since can not get LynxView.");
                    } else if (!lynxViewLJIILJJIL.enableJSRuntime() && !lynxViewLJIILJJIL.enableAirStrictMode()) {
                        for (C1309680kBa c1309680kBa : hashSet) {
                            int i = c1309680kBa.LIZLLL;
                            C1309700kBc c1309700kBc2 = this.LJJII;
                            if (c1309700kBc2 == null) {
                                LynxLog.e("Lynx.UIExposure", "findNode failed since mCallback is null.");
                            } else {
                                s sVar2 = c1309700kBc2.LIZ.get();
                                if (sVar2 == null) {
                                    LynxLog.e("UIExposure", "findNode failed since can not get LynxContext.");
                                } else if (sVar2.LJIILIIL() == null) {
                                    LynxLog.e("UIExposure", "findNode failed since can not get LynxUIOwner.");
                                } else {
                                    LynxBaseUI lynxBaseUILJIIZILJ = sVar2.LJIILIIL().LJIIZILJ(i);
                                    if (lynxBaseUILJIIZILJ != null && lynxBaseUILJIIZILJ.getEvents() != null && lynxBaseUILJIIZILJ.getEvents().containsKey(str)) {
                                        lynxBaseUILJIIZILJ.mContext.LLIZ.LIZIZ(new C1289960jfm(lynxBaseUILJIIZILJ.getSign(), str, c1309680kBa.LIZ()));
                                    }
                                }
                            }
                        }
                        return;
                    }
                }
            }
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            HashMap map = new HashMap();
            for (C1309680kBa c1309680kBa2 : hashSet) {
                if (LynxEnv.inst().isHighlightTouchEnabled()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Lynx.UIExposure: sendEvent [");
                    sbLIZ.append(str);
                    sbLIZ.append("] [");
                    sbLIZ.append(c1309680kBa2.LIZJ);
                    sbLIZ.append("] [");
                    sbLIZ.append(c1309680kBa2.LIZIZ);
                    sbLIZ.append("] [");
                    sbLIZ.append(c1309680kBa2.LJFF);
                    sbLIZ.append("] [");
                    sbLIZ.append(c1309680kBa2.LIZLLL);
                    sbLIZ.append(e3.f);
                    C2188811AlT.LIZIZ(sbLIZ);
                    EnumC1289510jf3.Info.ordinal();
                    LynxView lynxView = (LynxView) LJFF();
                    if (lynxView != null) {
                        lynxView.getBaseInspectorController();
                    }
                }
                JavaOnlyMap javaOnlyMap = c1309680kBa2.LJII;
                if (javaOnlyMap != null && javaOnlyMap.containsKey("sendCustom") && c1309680kBa2.LJII.getBoolean("sendCustom")) {
                    if (c1309680kBa2.LJII.containsKey("specifyTarget") && c1309680kBa2.LJII.getBoolean("specifyTarget")) {
                        LynxBaseUI lynxBaseUI = c1309680kBa2.LIZ.get();
                        if (lynxBaseUI != null) {
                            LynxBaseUI exposeReceiveTarget = lynxBaseUI.getExposeReceiveTarget();
                            String string = c1309680kBa2.LJII.getString("bindEventName");
                            if (exposeReceiveTarget != null && exposeReceiveTarget.getEvents() != null && string != null && exposeReceiveTarget.getEvents().containsKey(string)) {
                                if (map.containsKey(exposeReceiveTarget)) {
                                    HashMap map2 = (HashMap) map.get(exposeReceiveTarget);
                                    if (map2.containsKey(string)) {
                                        ((ArrayList) map2.get(string)).add(c1309680kBa2);
                                    } else {
                                        map2.put(string, new ArrayList());
                                        ((ArrayList) map2.get(string)).add(c1309680kBa2);
                                    }
                                } else {
                                    HashMap map3 = new HashMap();
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(c1309680kBa2);
                                    map3.put(string, arrayList);
                                    map.put(exposeReceiveTarget, map3);
                                }
                            }
                        }
                    } else {
                        LynxBaseUI lynxBaseUI2 = c1309680kBa2.LIZ.get();
                        if (str == "exposure") {
                            str2 = "uiappear";
                        } else {
                            str2 = "uidisappear";
                        }
                        if (lynxBaseUI2 != null && lynxBaseUI2.getEvents() != null && lynxBaseUI2.getEvents().containsKey(str2)) {
                            lynxBaseUI2.mContext.LLIZ.LIZIZ(new C1289960jfm(lynxBaseUI2.getSign(), str2, c1309680kBa2.LIZ()));
                        }
                    }
                } else {
                    JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
                    javaOnlyMap2.put("exposure-id", c1309680kBa2.LIZIZ);
                    javaOnlyMap2.put("exposureID", c1309680kBa2.LIZIZ);
                    javaOnlyMap2.put("exposure-scene", c1309680kBa2.LIZJ);
                    javaOnlyMap2.put("exposureScene", c1309680kBa2.LIZJ);
                    javaOnlyMap2.put("sign", String.valueOf(c1309680kBa2.LIZLLL));
                    javaOnlyMap2.put("dataSet", c1309680kBa2.LJ);
                    javaOnlyMap2.put("dataset", c1309680kBa2.LJ);
                    javaOnlyMap2.put("unique-id", c1309680kBa2.LJFF);
                    javaOnlyMap2.put("extra-data", c1309680kBa2.LJI);
                    javaOnlyArray.pushMap(javaOnlyMap2);
                }
            }
            if (!map.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    LynxBaseUI lynxBaseUI3 = (LynxBaseUI) entry.getKey();
                    for (Map.Entry entry2 : ((HashMap) entry.getValue()).entrySet()) {
                        String str3 = (String) entry2.getKey();
                        JavaOnlyArray javaOnlyArray2 = new JavaOnlyArray();
                        for (C1309680kBa c1309680kBa3 : (ArrayList) entry2.getValue()) {
                            JavaOnlyMap javaOnlyMap3 = new JavaOnlyMap();
                            javaOnlyMap3.put("extra-data", c1309680kBa3.LJI);
                            javaOnlyArray2.pushMap(javaOnlyMap3);
                        }
                        JavaOnlyMap javaOnlyMap4 = new JavaOnlyMap();
                        if (str == "exposure") {
                            z = true;
                        } else {
                            z = false;
                        }
                        javaOnlyMap4.put("isExposure", Boolean.valueOf(z));
                        javaOnlyMap4.put("childrenInfo", javaOnlyArray2);
                        lynxBaseUI3.mContext.LLIZ.LIZIZ(new C1289960jfm(lynxBaseUI3.getSign(), str3, javaOnlyMap4));
                    }
                }
            }
            if (javaOnlyArray.size() > 0) {
                JavaOnlyArray javaOnlyArray3 = new JavaOnlyArray();
                javaOnlyArray3.add(javaOnlyArray);
                C1309700kBc c1309700kBc3 = this.LJJII;
                if (c1309700kBc3 == null) {
                    LynxLog.e("Lynx.UIExposure", "sendEvent failed since mCallback is null.");
                    return;
                }
                s sVar3 = c1309700kBc3.LIZ.get();
                if (sVar3 == null) {
                    LynxLog.e("UIExposure", "sendGlobalEvent failed since can not get LynxContext.");
                    return;
                }
                C1310660kDA c1310660kDALJIILL = sVar3.LJIILL();
                if (c1310660kDALJIILL == null) {
                    LynxLog.e("UIExposure", "sendGlobalEvent failed since can not get UIBodyView.");
                } else {
                    c1310660kDALJIILL.sendGlobalEvent(str, javaOnlyArray3);
                }
            }
        }
    }

    public static boolean LJIILIIL(float f, RectF rectF, RectF rectF2) {
        float fHeight = 0.0f;
        if (f != 0.0f) {
            RectF rectF3 = new RectF();
            if (rectF3.setIntersect(rectF, rectF2)) {
                fHeight = (rectF3.height() * rectF3.width()) / (rectF.height() * rectF.width());
            }
            if (fHeight >= f) {
                return true;
            }
            return false;
        }
        return RectF.intersects(rectF, rectF2);
    }

    public final void LJIIL(final LynxBaseUI lynxBaseUI, final String str, final JavaOnlyMap javaOnlyMap, final JavaOnlyMap javaOnlyMap2) {
        final String strLIZIZ;
        if (str != null || lynxBaseUI.mExposureID != null) {
            if (str != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("_");
                sbLIZ.append(lynxBaseUI.mExposureScene);
                sbLIZ.append("_");
                sbLIZ.append(lynxBaseUI.mExposureID);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(lynxBaseUI.mExposureScene);
                sbLIZ2.append("_");
                sbLIZ2.append(lynxBaseUI.mExposureID);
                sbLIZ2.append("_");
                sbLIZ2.append(lynxBaseUI.getSign());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            C1289620jfE.LIZLLL(new Runnable() { // from class: X.0kBb
                public final void LIZ() {
                    C1309670kBZ c1309670kBZ = this.LLILZLL;
                    if (!c1309670kBZ.LJJIFFI && c1309670kBZ.LJIJJLI.isEmpty()) {
                        this.LLILZLL.LIZIZ();
                    }
                    this.LLILZLL.LJIJJLI.put(strLIZIZ, new C1309680kBa(lynxBaseUI, str, javaOnlyMap, javaOnlyMap2));
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("UIExposure@d6e7.addUIToExposedMap$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("UIExposure@d6e7.addUIToExposedMap$1");
                }
            });
        }
    }
}
