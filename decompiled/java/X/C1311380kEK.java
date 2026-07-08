package X;

import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Looper;
import android.view.MotionEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.devtoolwrapper.LynxBaseInspectorOwner;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.GestureRecognizer;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import j27.s;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kEK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1311380kEK {
    public final C1311720kEs LIZ;
    public final GestureRecognizer LIZIZ;
    public InterfaceC1311410kEN LIZJ;
    public InterfaceC1311410kEN LIZLLL;
    public InterfaceC1311410kEN LJ;
    public InterfaceC1311410kEN LJIIIIZZ;
    public C1311400kEM LJIIJ;
    public boolean LJIIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIJ;
    public boolean LJIJI;
    public boolean LJJ;
    public long LJJII;
    public C1298900juC LJJIII;
    public C1298740jtw LJJIIJ;
    public InterfaceC1311410kEN LJJIIJZLJL;
    public UIGroup LJJIIZI;
    public boolean LJJIJ;
    public boolean LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public EnumC1311650kEl LJIIJJI = EnumC1311650kEl.Undefined;
    public final LinkedList<InterfaceC1311410kEN> LJII = new LinkedList<>();
    public final LinkedList<InterfaceC1311410kEN> LJIIIZ = new LinkedList<>();
    public PointF LJIILIIL = new PointF(Float.MIN_VALUE, Float.MIN_VALUE);
    public C1298900juC LJJIIZ = new C1298900juC();
    public float LJIILJJIL = C1311130kDv.LIZIZ(50.0f, 0.0f);
    public boolean LJIIZILJ = true;
    public final HashSet<Integer> LJIJJ = new HashSet<>();
    public final HashSet<Integer> LJIJJLI = new HashSet<>();
    public boolean LJIL = false;
    public boolean LJJI = false;
    public boolean LJJIFFI = false;
    public final HashMap<Integer, C1311430kEP> LJFF = new HashMap<>();
    public final HashMap<Integer, InterfaceC1326530kcl> LJI = new HashMap<>();

    public final AbstractC1298750jtx LJIIIIZZ() {
        return this.LIZ.LIZJ.LLIZ;
    }

    public final void LJJ() {
        Iterator<InterfaceC1311410kEN> it2 = this.LJIIIZ.iterator();
        while (it2.hasNext()) {
            it2.next().offResponseChain();
        }
        this.LJII.clear();
        this.LJIIIZ.clear();
        this.LJIJJ.clear();
        this.LJIJJLI.clear();
        this.LJIILL = false;
        this.LJIILLIIL = false;
        this.LJIIZILJ = true;
        this.LJJI = false;
        this.LJFF.clear();
        this.LJI.clear();
        this.LJJIIZI = null;
        this.LJJIJ = false;
        this.LJJIIJZLJL = this.LIZJ;
    }

    public final void LJJI() {
        C1310660kDA c1310660kDA;
        UIBody uIBody = this.LIZ.LIZIZ;
        if (uIBody == null || (c1310660kDA = uIBody.LL) == null) {
            return;
        }
        ((LynxView) c1310660kDA).getBaseInspectorController();
    }

    public C1311380kEK(C1311720kEs c1311720kEs) {
        this.LIZ = c1311720kEs;
        this.LIZIZ = new GestureRecognizer(c1311720kEs.LIZJ, new C1311440kEQ(this), new BPEAHandler(Looper.getMainLooper()));
        this.LJIIJ = c1311720kEs.LJIILJJIL;
    }

    public final int LIZIZ(InterfaceC1311410kEN interfaceC1311410kEN) {
        return LIZJ(interfaceC1311410kEN, this.LJIJJ);
    }

    public final void LJ(int i) {
        if (LJIIIIZZ() == null) {
            return;
        }
        for (InterfaceC1311410kEN interfaceC1311410kEN : this.LJII) {
            if (this.LJIL) {
                LJIIIIZZ().LIZ(interfaceC1311410kEN.getSign(), interfaceC1311410kEN.getPseudoStatus(), interfaceC1311410kEN.getPseudoStatus() & (~i));
            }
            interfaceC1311410kEN.onPseudoStatusChanged(interfaceC1311410kEN.getPseudoStatus(), interfaceC1311410kEN.getPseudoStatus() & (~i));
        }
    }

    public final void LJFF(MotionEvent motionEvent) {
        LynxBaseUI lynxBaseUI;
        s sVar;
        InterfaceC1311410kEN interfaceC1311410kEN = this.LIZJ;
        if (interfaceC1311410kEN != null) {
            interfaceC1311410kEN.dispatchTouch(motionEvent);
        }
        InterfaceC1311410kEN interfaceC1311410kEN2 = this.LIZJ;
        if (interfaceC1311410kEN2 != null && interfaceC1311410kEN2.getChildrenLynxPageUI() != null && (lynxBaseUI = (LynxBaseUI) this.LIZJ.getChildrenLynxPageUI().get(String.valueOf(System.identityHashCode(this.LIZJ)))) != null && (sVar = lynxBaseUI.mContext) != null && sVar.LLIZLLLIL != null) {
            PointF pointFLJIJI = LJIJI(motionEvent);
            try {
                lynxBaseUI.mContext.LLIZLLLIL.LJFF(motionEvent);
                motionEvent.setLocation(pointFLJIJI.x, pointFLJIJI.y);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                motionEvent.setLocation(pointFLJIJI.x, pointFLJIJI.y);
                throw th;
            }
        }
    }

    public final void LJIIJ(MotionEvent motionEvent) {
        LynxBaseUI lynxBaseUI;
        s sVar;
        if (!this.LJIIIZ.isEmpty() && this.LJIIIZ.getLast() != null) {
            int iLIZIZ = LIZIZ(this.LJIIIZ.getLast());
            int iLIZJ = LIZJ(this.LJIIIZ.getLast(), this.LJIJJLI);
            if ((!this.LJJIFFI || !this.LJJI) && !this.LJIJI && !this.LJIJ && !this.LJIIIZ.isEmpty() && this.LJIIIZ.getLast() != null && iLIZIZ == -1 && iLIZJ == -1) {
                LJII(this.LJIIIZ.getLast(), "click", motionEvent);
                InterfaceC1311410kEN interfaceC1311410kEN = this.LIZJ;
                if (interfaceC1311410kEN != null && interfaceC1311410kEN.getChildrenLynxPageUI() != null && (lynxBaseUI = (LynxBaseUI) this.LIZJ.getChildrenLynxPageUI().get(String.valueOf(System.identityHashCode(this.LIZJ)))) != null && (sVar = lynxBaseUI.mContext) != null && sVar.LLIZLLLIL != null) {
                    PointF pointFLJIJI = LJIJI(motionEvent);
                    try {
                        lynxBaseUI.mContext.LLIZLLLIL.LJIIJ(motionEvent);
                        motionEvent.setLocation(pointFLJIJI.x, pointFLJIJI.y);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        motionEvent.setLocation(pointFLJIJI.x, pointFLJIJI.y);
                        throw th;
                    }
                }
            }
        }
    }

    public final void LJIIJJI(MotionEvent motionEvent) {
        InterfaceC1311410kEN interfaceC1311410kEN;
        LynxBaseUI lynxBaseUI;
        s sVar;
        int iLIZIZ = LIZIZ(this.LIZJ);
        int iLIZJ = LIZJ(this.LIZJ, this.LJIJJLI);
        if ((!this.LJJIFFI || !this.LJJI) && (interfaceC1311410kEN = this.LIZJ) != null && iLIZIZ == -1 && iLIZJ == -1) {
            LJII(interfaceC1311410kEN, "longpress", motionEvent);
            InterfaceC1311410kEN interfaceC1311410kEN2 = this.LIZJ;
            if (interfaceC1311410kEN2 != null && interfaceC1311410kEN2.getChildrenLynxPageUI() != null && (lynxBaseUI = (LynxBaseUI) this.LIZJ.getChildrenLynxPageUI().get(String.valueOf(System.identityHashCode(this.LIZJ)))) != null && (sVar = lynxBaseUI.mContext) != null && sVar.LLIZLLLIL != null) {
                PointF pointFLJIJI = LJIJI(motionEvent);
                try {
                    lynxBaseUI.mContext.LLIZLLLIL.LJIIJJI(motionEvent);
                    motionEvent.setLocation(pointFLJIJI.x, pointFLJIJI.y);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    motionEvent.setLocation(pointFLJIJI.x, pointFLJIJI.y);
                    throw th;
                }
            }
        }
    }

    public final void LJIIL(MotionEvent motionEvent) {
        LynxBaseUI lynxBaseUI;
        s sVar;
        int iLIZIZ = LIZIZ(this.LIZJ);
        int iLIZJ = LIZJ(this.LIZJ, this.LJIJJLI);
        if ((!this.LJJIFFI || !this.LJJI) && !this.LJIJ && !this.LJIILL && iLIZIZ == -1 && iLIZJ == -1) {
            if (LynxEnv.inst().isHighlightTouchEnabled()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LynxTouchEventDispatcher: fire tap for target ");
                sbLIZ.append(this.LIZJ.getSign());
                C2188811AlT.LIZIZ(sbLIZ);
                EnumC1289510jf3.Info.ordinal();
                LJJI();
            }
            LJII(this.LIZJ, "tap", motionEvent);
            InterfaceC1311410kEN interfaceC1311410kEN = this.LIZJ;
            if (interfaceC1311410kEN != null && interfaceC1311410kEN.getChildrenLynxPageUI() != null && (lynxBaseUI = (LynxBaseUI) this.LIZJ.getChildrenLynxPageUI().get(String.valueOf(System.identityHashCode(this.LIZJ)))) != null && (sVar = lynxBaseUI.mContext) != null && sVar.LLIZLLLIL != null) {
                PointF pointFLJIJI = LJIJI(motionEvent);
                try {
                    lynxBaseUI.mContext.LLIZLLLIL.LJIIL(motionEvent);
                    motionEvent.setLocation(pointFLJIJI.x, pointFLJIJI.y);
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    motionEvent.setLocation(pointFLJIJI.x, pointFLJIJI.y);
                    throw th;
                }
            }
            return;
        }
        if (LynxEnv.inst().isHighlightTouchEnabled()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("LynxTouchEventDispatcher: tap failed due to [gesture] ");
            sbLIZ2.append(this.LJIJ);
            sbLIZ2.append(", [move] ");
            sbLIZ2.append(this.LJIILL);
            sbLIZ2.append(", [slide] ");
            sbLIZ2.append(iLIZIZ);
            sbLIZ2.append(", [props] ");
            sbLIZ2.append(iLIZJ);
            C2188811AlT.LIZIZ(sbLIZ2);
            EnumC1289510jf3.Warn.ordinal();
            LJJI();
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("tap failed:");
        sbLIZ3.append(this.LJIJ);
        sbLIZ3.append(" ");
        sbLIZ3.append(this.LJIILL);
        sbLIZ3.append(" ");
        sbLIZ3.append(iLIZIZ);
        sbLIZ3.append(" ");
        sbLIZ3.append(iLIZJ);
        LynxLog.i("LynxTouchEventDispatcher", C2188811AlT.LIZIZ(sbLIZ3));
    }

    public final void LJIILJJIL(MotionEvent motionEvent) {
        LynxBaseUI lynxBaseUI;
        s sVar;
        boolean z;
        InterfaceC1311410kEN interfaceC1311410kEN = this.LIZJ;
        if (interfaceC1311410kEN != null && !interfaceC1311410kEN.ignoreFocus() && !this.LJIJ && LIZIZ(this.LIZJ) == -1 && LIZJ(this.LIZJ, this.LJIJJLI) == -1) {
            InterfaceC1311410kEN interfaceC1311410kEN2 = this.LJIIIIZZ;
            InterfaceC1311410kEN interfaceC1311410kEN3 = this.LIZJ;
            this.LJIIIIZZ = interfaceC1311410kEN3;
            if (interfaceC1311410kEN3 != interfaceC1311410kEN2) {
                boolean z2 = true;
                if (interfaceC1311410kEN3 != null && interfaceC1311410kEN3.isFocusable()) {
                    InterfaceC1311410kEN interfaceC1311410kEN4 = this.LIZJ;
                    if (interfaceC1311410kEN2 != null && interfaceC1311410kEN2.isFocusable()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    interfaceC1311410kEN4.onFocusChanged(true, z);
                }
                if (interfaceC1311410kEN2 != null && interfaceC1311410kEN2.isFocusable()) {
                    InterfaceC1311410kEN interfaceC1311410kEN5 = this.LIZJ;
                    if (interfaceC1311410kEN5 == null || !interfaceC1311410kEN5.isFocusable()) {
                        z2 = false;
                    }
                    interfaceC1311410kEN2.onFocusChanged(false, z2);
                }
            }
        }
        if (this.LJJIFFI) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            LIZ(javaOnlyMap, motionEvent, 0);
            LJI("touchend", motionEvent, javaOnlyMap);
        } else {
            LJII(this.LIZJ, "touchend", motionEvent);
        }
        InterfaceC1311410kEN interfaceC1311410kEN6 = this.LIZJ;
        if (interfaceC1311410kEN6 != null && interfaceC1311410kEN6.getChildrenLynxPageUI() != null && (lynxBaseUI = (LynxBaseUI) this.LIZJ.getChildrenLynxPageUI().get(String.valueOf(System.identityHashCode(this.LIZJ)))) != null && (sVar = lynxBaseUI.mContext) != null && sVar.LLIZLLLIL != null) {
            PointF pointFLJIJI = LJIJI(motionEvent);
            try {
                lynxBaseUI.mContext.LLIZLLLIL.LJIILJJIL(motionEvent);
                motionEvent.setLocation(pointFLJIJI.x, pointFLJIJI.y);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                motionEvent.setLocation(pointFLJIJI.x, pointFLJIJI.y);
                throw th;
            }
        }
    }

    public final void LJIILLIIL(MotionEvent motionEvent) {
        LynxBaseUI lynxBaseUI;
        s sVar;
        int actionIndex = motionEvent.getActionIndex();
        if (this.LJJIFFI) {
            if (motionEvent.getPointerId(actionIndex) == 0) {
                LJ(-1);
            }
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            LIZ(javaOnlyMap, motionEvent, actionIndex);
            LJI("touchend", motionEvent, javaOnlyMap);
        }
        this.LJFF.remove(Integer.valueOf(motionEvent.getPointerId(actionIndex)));
        InterfaceC1311410kEN interfaceC1311410kEN = this.LIZJ;
        if (interfaceC1311410kEN != null && interfaceC1311410kEN.getChildrenLynxPageUI() != null && (lynxBaseUI = (LynxBaseUI) this.LIZJ.getChildrenLynxPageUI().get(String.valueOf(System.identityHashCode(this.LIZJ)))) != null && (sVar = lynxBaseUI.mContext) != null && sVar.LLIZLLLIL != null) {
            PointF pointFLJIJI = LJIJI(motionEvent);
            try {
                lynxBaseUI.mContext.LLIZLLLIL.LJIILLIIL(motionEvent);
                motionEvent.setLocation(pointFLJIJI.x, pointFLJIJI.y);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                motionEvent.setLocation(pointFLJIJI.x, pointFLJIJI.y);
                throw th;
            }
        }
    }

    public final void LJIIZILJ(MotionEvent motionEvent) {
        LynxBaseUI lynxBaseUI;
        s sVar;
        if (this.LJJIFFI) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            Iterator<C1311430kEP> it2 = this.LJFF.values().iterator();
            while (it2.hasNext()) {
                it2.next();
                LIZ(javaOnlyMap, motionEvent, 0);
            }
            LJI("touchcancel", motionEvent, javaOnlyMap);
        } else {
            LJII(this.LIZJ, "touchcancel", motionEvent);
        }
        LJ(-1);
        LJJ();
        InterfaceC1311410kEN interfaceC1311410kEN = this.LIZJ;
        if (interfaceC1311410kEN != null && interfaceC1311410kEN.getChildrenLynxPageUI() != null && (lynxBaseUI = (LynxBaseUI) this.LIZJ.getChildrenLynxPageUI().get(String.valueOf(System.identityHashCode(this.LIZJ)))) != null && (sVar = lynxBaseUI.mContext) != null && sVar.LLIZLLLIL != null) {
            PointF pointFLJIJI = LJIJI(motionEvent);
            try {
                lynxBaseUI.mContext.LLIZLLLIL.LJIIZILJ(motionEvent);
                motionEvent.setLocation(pointFLJIJI.x, pointFLJIJI.y);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                motionEvent.setLocation(pointFLJIJI.x, pointFLJIJI.y);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.LJIIZILJ
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L2b
            float r1 = r6.getX(r3)
            android.graphics.PointF r0 = r5.LJIILIIL
            float r0 = r0.x
            float r1 = r1 - r0
            float r2 = r6.getY(r3)
            android.graphics.PointF r0 = r5.LJIILIIL
            float r0 = r0.y
            float r2 = r2 - r0
            float r0 = java.lang.Math.abs(r1)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L29
            float r0 = java.lang.Math.abs(r2)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L59
        L29:
            r5.LJIIZILJ = r3
        L2b:
            r5.LJIILLIIL = r4
            boolean r0 = r5.LJJIFFI
            java.lang.String r2 = "touchmove"
            if (r0 == 0) goto L4e
            com.lynx.react.bridge.JavaOnlyMap r1 = new com.lynx.react.bridge.JavaOnlyMap
            r1.<init>()
        L38:
            int r0 = r6.getPointerCount()
            if (r3 >= r0) goto L4a
            boolean r0 = r5.LJIJJLI(r6, r3)
            if (r0 == 0) goto L47
            r5.LIZ(r1, r6, r3)
        L47:
            int r3 = r3 + 1
            goto L38
        L4a:
            r5.LJI(r2, r6, r1)
            goto L59
        L4e:
            boolean r0 = r5.LJIJJLI(r6, r3)
            if (r0 == 0) goto L59
            X.0kEN r0 = r5.LIZJ
            r5.LJII(r0, r2, r6)
        L59:
            X.0kEN r0 = r5.LIZJ
            if (r0 == 0) goto La2
            java.util.HashMap r0 = r0.getChildrenLynxPageUI()
            if (r0 == 0) goto La2
            X.0kEN r0 = r5.LIZJ
            java.util.HashMap r1 = r0.getChildrenLynxPageUI()
            X.0kEN r0 = r5.LIZJ
            int r0 = java.lang.System.identityHashCode(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r1 = r1.get(r0)
            com.lynx.tasm.behavior.ui.LynxBaseUI r1 = (com.lynx.tasm.behavior.ui.LynxBaseUI) r1
            if (r1 == 0) goto La2
            j27.s r0 = r1.mContext
            if (r0 == 0) goto La2
            X.0kEK r0 = r0.LLIZLLLIL
            if (r0 == 0) goto La2
            android.graphics.PointF r3 = r5.LJIJI(r6)
            j27.s r0 = r1.mContext     // Catch: java.lang.Throwable -> L8f
            X.0kEK r0 = r0.LLIZLLLIL     // Catch: java.lang.Throwable -> L8f
            r0.LJIJ(r6)     // Catch: java.lang.Throwable -> L8f
            goto L9b
        L8f:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> L8f
            float r1 = r3.x
            float r0 = r3.y
            r6.setLocation(r1, r0)
            throw r2
        L9b:
            float r1 = r3.x
            float r0 = r3.y
            r6.setLocation(r1, r0)
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1311380kEK.LJIJ(android.view.MotionEvent):void");
    }

    public final PointF LJIJI(MotionEvent motionEvent) {
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        C1298900juC c1298900juC = this.LJJIIJ.LJIIIIZZ;
        motionEvent.setLocation(c1298900juC.LIZ, c1298900juC.LIZIZ);
        return pointF;
    }

    public final boolean LJIL(boolean z) {
        UIBody uIBody = this.LIZ.LIZIZ;
        if (uIBody != null && uIBody.mView.getParent() != null) {
            this.LIZ.LIZIZ.mView.getParent().requestDisallowInterceptTouchEvent(z);
            return z;
        }
        LynxLog.e("LynxTouchEventDispatcher", "requestNativeDisallowIntercept failed, root ui or root ui'parent is null.");
        return false;
    }

    public static int LIZJ(InterfaceC1311410kEN interfaceC1311410kEN, HashSet hashSet) {
        if (interfaceC1311410kEN == null) {
            return 0;
        }
        if (hashSet == null || hashSet.isEmpty()) {
            return -1;
        }
        while (interfaceC1311410kEN.parent() != interfaceC1311410kEN) {
            if (hashSet.contains(Integer.valueOf(interfaceC1311410kEN.getSign()))) {
                return interfaceC1311410kEN.getSign();
            }
            interfaceC1311410kEN = interfaceC1311410kEN.parent();
            if (interfaceC1311410kEN == null) {
                return -1;
            }
        }
        return -1;
    }

    public final C1298900juC LIZLLL(InterfaceC1311410kEN interfaceC1311410kEN, C1298900juC c1298900juC) {
        if (interfaceC1311410kEN instanceof LynxBaseUI) {
            LynxBaseUI lynxBaseUI = (LynxBaseUI) interfaceC1311410kEN;
            C1311720kEs c1311720kEs = this.LIZ;
            C1310290kCZ c1310290kCZ = c1311720kEs.LIZJ.LLLIIII;
            if (c1310290kCZ != null && c1310290kCZ.LJJJ) {
                PointF pointFLIZ = C1292490jjr.LIZ(c1311720kEs.LIZIZ, lynxBaseUI, new PointF(c1298900juC.LIZ, c1298900juC.LIZIZ));
                return new C1298900juC(pointFLIZ.x, pointFLIZ.y);
            }
            RectF rectFLIZLLL = C1292490jjr.LIZLLL(lynxBaseUI, new RectF(0.0f, 0.0f, lynxBaseUI.getWidth(), lynxBaseUI.getHeight()));
            return new C1298900juC(c1298900juC.LIZ - rectFLIZLLL.left, c1298900juC.LIZIZ - rectFLIZLLL.top);
        }
        return c1298900juC;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x02d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILIIL(android.view.MotionEvent r15, com.lynx.tasm.behavior.ui.UIGroup r16) {
        /*
            Method dump skipped, instruction units count: 1127
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1311380kEK.LJIILIIL(android.view.MotionEvent, com.lynx.tasm.behavior.ui.UIGroup):boolean");
    }

    public final void LJIILL(MotionEvent motionEvent, UIGroup uIGroup) {
        UIGroup uIGroup2;
        s sVar;
        this.LJJI = true;
        int actionIndex = motionEvent.getActionIndex();
        InterfaceC1311410kEN interfaceC1311410kENLJIIIZ = LJIIIZ(motionEvent, actionIndex, uIGroup);
        this.LJFF.put(Integer.valueOf(motionEvent.getPointerId(actionIndex)), new C1311430kEP(interfaceC1311410kENLJIIIZ, motionEvent.getX(actionIndex), motionEvent.getY(actionIndex)));
        this.LJI.put(Integer.valueOf(interfaceC1311410kENLJIIIZ.getSign()), interfaceC1311410kENLJIIIZ);
        if (this.LJJIFFI) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            LIZ(javaOnlyMap, motionEvent, actionIndex);
            LJI("touchstart", motionEvent, javaOnlyMap);
        }
        InterfaceC1311410kEN interfaceC1311410kEN = this.LIZJ;
        if (interfaceC1311410kEN != null && interfaceC1311410kEN.getChildrenLynxPageUI() != null && (uIGroup2 = (UIGroup) this.LIZJ.getChildrenLynxPageUI().get(String.valueOf(System.identityHashCode(this.LIZJ)))) != null && (sVar = uIGroup2.mContext) != null && sVar.LLIZLLLIL != null) {
            PointF pointFLJIJI = LJIJI(motionEvent);
            try {
                uIGroup2.mContext.LLIZLLLIL.LJIILL(motionEvent, uIGroup2);
                motionEvent.setLocation(pointFLJIJI.x, pointFLJIJI.y);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                motionEvent.setLocation(pointFLJIJI.x, pointFLJIJI.y);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJJ(android.view.MotionEvent r22, com.lynx.tasm.behavior.ui.UIGroup r23) {
        /*
            Method dump skipped, instruction units count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1311380kEK.LJIJJ(android.view.MotionEvent, com.lynx.tasm.behavior.ui.UIGroup):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJJLI(android.view.MotionEvent r10, int r11) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1311380kEK.LJIJJLI(android.view.MotionEvent, int):boolean");
    }

    public final void LIZ(JavaOnlyMap javaOnlyMap, MotionEvent motionEvent, int i) {
        C1298900juC c1298900juCLIZLLL;
        C1311430kEP c1311430kEP = this.LJFF.get(Integer.valueOf(motionEvent.getPointerId(i)));
        if (c1311430kEP == null) {
            return;
        }
        InterfaceC1311410kEN interfaceC1311410kEN = c1311430kEP.LIZ;
        String strValueOf = String.valueOf(interfaceC1311410kEN.getSign());
        ReadableArray array = javaOnlyMap.getArray(strValueOf);
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        C1298900juC c1298900juC = new C1298900juC(motionEvent.getX(i), motionEvent.getY(i));
        if (interfaceC1311410kEN instanceof LynxBaseUI) {
            c1298900juCLIZLLL = LIZLLL(interfaceC1311410kEN, c1298900juC);
        } else {
            c1298900juCLIZLLL = c1298900juC;
        }
        PointF pointFLIZIZ = C1292490jjr.LIZIZ(this.LIZ.LIZIZ, new PointF(c1298900juC.LIZ, c1298900juC.LIZIZ));
        C1298900juC c1298900juC2 = new C1298900juC(pointFLIZIZ.x, pointFLIZIZ.y);
        javaOnlyArray.add(Integer.valueOf(motionEvent.getPointerId(i)));
        javaOnlyArray.add(Float.valueOf(c1298900juC2.LIZ));
        javaOnlyArray.add(Float.valueOf(c1298900juC2.LIZIZ));
        javaOnlyArray.add(Float.valueOf(c1298900juC.LIZ));
        javaOnlyArray.add(Float.valueOf(c1298900juC.LIZIZ));
        javaOnlyArray.add(Float.valueOf(c1298900juCLIZLLL.LIZ));
        javaOnlyArray.add(Float.valueOf(c1298900juCLIZLLL.LIZIZ));
        if (array != null) {
            array.asArrayList().add(javaOnlyArray);
            return;
        }
        JavaOnlyArray javaOnlyArray2 = new JavaOnlyArray();
        javaOnlyArray2.add(javaOnlyArray);
        javaOnlyMap.putArray(strValueOf, javaOnlyArray2);
    }

    public final void LJI(String str, MotionEvent motionEvent, JavaOnlyMap javaOnlyMap) {
        InterfaceC1311410kEN interfaceC1311410kEN = this.LIZJ;
        C1298900juC c1298900juC = new C1298900juC(motionEvent.getX(), motionEvent.getY());
        PointF pointFLIZIZ = C1292490jjr.LIZIZ(this.LIZ.LIZIZ, new PointF(c1298900juC.LIZ, c1298900juC.LIZIZ));
        C1298740jtw c1298740jtw = new C1298740jtw(interfaceC1311410kEN.getSign(), str, new C1298900juC(pointFLIZIZ.x, pointFLIZIZ.y), c1298900juC, this.LJJIII);
        this.LJJIIJ = c1298740jtw;
        c1298740jtw.LJIILIIL = motionEvent;
        C1298740jtw c1298740jtw2 = new C1298740jtw(str, javaOnlyMap);
        c1298740jtw2.LJIILIIL = motionEvent;
        c1298740jtw2.LJIIL = this.LJI;
        c1298740jtw2.LIZLLL = this.LIZJ;
        c1298740jtw2.LJ = this.LJJII;
        if (this.LJJIJ) {
            c1298740jtw2.LJFF = Long.MIN_VALUE;
        }
        C1311400kEM c1311400kEM = this.LJIIJ;
        if (c1311400kEM != null) {
            c1311400kEM.LIZIZ(str, this.LJJIIJ);
        }
        LJIIIIZZ().LIZJ(c1298740jtw2);
    }

    public final void LJII(InterfaceC1311410kEN interfaceC1311410kEN, String str, MotionEvent motionEvent) {
        UIBody uIBody;
        C1310660kDA c1310660kDA;
        final LynxBaseInspectorOwner baseInspectorOwner;
        this.LJJIII = LIZLLL(this.LIZJ, new C1298900juC(motionEvent.getX(0), motionEvent.getY(0)));
        C1298900juC c1298900juC = new C1298900juC(motionEvent.getX(0), motionEvent.getY(0));
        PointF pointFLIZIZ = C1292490jjr.LIZIZ(this.LIZ.LIZIZ, new PointF(c1298900juC.LIZ, c1298900juC.LIZIZ));
        C1298740jtw c1298740jtw = new C1298740jtw(interfaceC1311410kEN.getSign(), str, new C1298900juC(pointFLIZIZ.x, pointFLIZIZ.y), c1298900juC, this.LJJIII);
        this.LJJIIJ = c1298740jtw;
        c1298740jtw.LJIILIIL = motionEvent;
        c1298740jtw.LIZLLL = this.LIZJ;
        c1298740jtw.LJ = this.LJJII;
        if (this.LJJIJ) {
            c1298740jtw.LJFF = Long.MIN_VALUE;
        }
        if ("touchstart".equals(str)) {
            if (LynxEnv.inst().isHighlightTouchEnabled() && this.LIZJ != null && (uIBody = this.LIZ.LIZIZ) != null && (c1310660kDA = uIBody.LL) != null && (baseInspectorOwner = ((LynxView) c1310660kDA).getBaseInspectorOwner()) != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(FollowStatusChangeMethod.PARAM_UID, 1);
                    jSONObject.put("method", "DOM.setAttributesAsText");
                    jSONObject.put("method", "CSS.getInlineStylesForNode");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("nodeId", this.LIZJ.getSign());
                    jSONObject.put("params", jSONObject2);
                    baseInspectorOwner.invokeCDPFromSDK(C786410Ut5.J3(jSONObject), new InterfaceC1311510kEX() { // from class: X.0kET
                    });
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    LynxLog.e("LynxTouchEventDispatcher", "inspectHitTarget json generate error");
                }
            }
            if (LynxEnv.inst().isHighlightTouchEnabled()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LynxTouchEventDispatcher: hit the target with sign = ");
                sbLIZ.append(interfaceC1311410kEN.getSign());
                C2188811AlT.LIZIZ(sbLIZ);
                EnumC1289510jf3.Info.ordinal();
                LJJI();
            }
        }
        if (LJIIIIZZ() == null) {
            LynxLog.i("LynxTouchEventDispatcher", "dispatchEvent failed since eventEmitter() null");
            return;
        }
        C1311400kEM c1311400kEM = this.LJIIJ;
        if (c1311400kEM != null) {
            c1311400kEM.LIZIZ(str, this.LJJIIJ);
        }
        LJIIIIZZ().LIZLLL(this.LJJIIJ);
    }

    public final InterfaceC1311410kEN LJIIIZ(MotionEvent motionEvent, int i, UIGroup uIGroup) {
        if (uIGroup == null) {
            uIGroup = this.LIZ.LIZIZ;
        }
        return uIGroup.hitTest(motionEvent.getX(i), motionEvent.getY(i));
    }
}
