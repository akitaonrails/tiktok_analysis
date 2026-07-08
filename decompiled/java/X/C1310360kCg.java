package X;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.text.FlattenUIText;
import com.lynx.tasm.behavior.ui.text.UIText;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import u4.q0;

/* JADX INFO: renamed from: X.0kCg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1310360kCg implements InterfaceC1310350kCf {
    public static final Rect LJIILL = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final WeakReference<UIBody> LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public final AccessibilityManager LJIIIIZZ;
    public C1310300kCa LJIIIZ;
    public C1300290jwR LJIIJ;
    public C1318830kQL LJIIJJI;
    public C1318820kQK LJIIL;
    public C1311340kEG LJIILIIL;
    public final boolean LJIILJJIL;

    public final boolean LJ() {
        return (!this.LIZIZ || this.LIZJ || this.LJIIL == null) ? false : true;
    }

    public final boolean LJFF() {
        return (this.LIZIZ || !this.LIZJ || this.LJIILIIL == null) ? false : true;
    }

    public final UIBody LJII() {
        WeakReference<UIBody> weakReference = this.LIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final boolean LJIIJ() {
        return this.LJIIIIZZ != null && this.LJI && this.LJII;
    }

    public final boolean LJIIL() {
        if (this.LJFF && LJIIJ()) {
            return LJ() || LJFF();
        }
        return false;
    }

    public final void LIZLLL() {
        UIBody uIBodyLJII;
        if (!LJIIJ() || (uIBodyLJII = LJII()) == null || uIBodyLJII.LL == null) {
            return;
        }
        if (this.LIZJ || this.LIZIZ) {
            if (this.LJIIJ == null) {
                this.LJIIJ = new C1300290jwR();
            }
            if (this.LIZJ) {
                LJIIIZ(uIBodyLJII, uIBodyLJII.LL);
                return;
            } else {
                if (this.LIZIZ) {
                    LJIIIIZZ(uIBodyLJII);
                    return;
                }
                return;
            }
        }
        if (this.LJIIJJI == null) {
            this.LJIIJJI = new C1318830kQL(uIBodyLJII);
            C1310660kDA c1310660kDA = uIBodyLJII.LL;
            if (c1310660kDA != null) {
                c1310660kDA.setAccessibilityDelegate(new C1310370kCh(this));
            }
        }
        if (this.LIZIZ || this.LIZJ || this.LJIIJJI == null) {
            return;
        }
        C1318830kQL c1318830kQL = this.LJIIJJI;
        c1318830kQL.LJII = this.LIZLLL;
        c1318830kQL.LJIIIIZZ = this.LJ;
    }

    public C1310360kCg(UIBody uIBody) {
        boolean z;
        if (uIBody != null && uIBody.LL != null) {
            this.LIZ = new WeakReference<>(uIBody);
            s sVar = uIBody.mContext;
            if (sVar != null) {
                if (!sVar.LJIJI() && !LynxEnv.inst().enableLazyInitA11y()) {
                    z = false;
                } else {
                    z = true;
                }
                this.LJIILJJIL = z;
                this.LJIIIIZZ = (AccessibilityManager) C786410Ut5.R2(uIBody.mContext, "accessibility");
            }
            if (this.LJIILJJIL) {
                this.LJIIIZ = new C1310300kCa(this.LJIIIIZZ, this);
                return;
            }
            LynxLog.i("LynxAccessibilityWrapper", "Construct LynxAccessibilityNodeProvider and set default delegate.");
            if (this.LJIIJJI != null) {
                return;
            }
            this.LJIIJJI = new C1318830kQL(uIBody);
            C1310660kDA c1310660kDA = uIBody.LL;
            if (c1310660kDA == null) {
                return;
            }
            c1310660kDA.setAccessibilityDelegate(new C1310370kCh(this));
            return;
        }
        LynxLog.e("LynxAccessibilityWrapper", "Construct LynxAccessibilityWrapper with null host");
    }

    public static void LJIIJJI(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI != null && lynxBaseUI.mContext != null) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.put("element-id", Integer.valueOf(lynxBaseUI.getSign()));
            javaOnlyMap.put("a11y-id", lynxBaseUI.mAccessibilityId);
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushMap(javaOnlyMap);
            lynxBaseUI.mContext.LJJIII("activeElement", javaOnlyArray);
        }
    }

    @Override // X.InterfaceC1310350kCf
    public final void LIZ(boolean z) {
        this.LJII = z;
        if (this.LJIILJJIL) {
            LIZLLL();
        }
    }

    @Override // X.InterfaceC1310350kCf
    public final void LIZIZ(boolean z) {
        this.LJI = z;
        if (this.LJIILJJIL) {
            LIZLLL();
        }
    }

    public final void LJIIIIZZ(UIBody uIBody) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init LynxAccessibilityDelegate with ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZJ);
        LynxLog.i("LynxAccessibilityWrapper", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIIL == null) {
            this.LJIIL = new C1318820kQK(uIBody);
        }
        C1318820kQK c1318820kQK = this.LJIIL;
        c1318820kQK.LJFF = this.LIZLLL;
        q0.LJIJ(uIBody.LL, c1318820kQK);
    }

    public final void LIZJ(LynxBaseUI lynxBaseUI, boolean z) {
        LynxBaseUI lynxBaseUI2;
        if (!LJFF()) {
            return;
        }
        if (z) {
            C1311340kEG c1311340kEG = this.LJIILIIL;
            c1311340kEG.getClass();
            c1311340kEG.LJ.put(Integer.valueOf(lynxBaseUI.getSign()), new WeakReference<>(lynxBaseUI));
            return;
        }
        C1311340kEG c1311340kEG2 = this.LJIILIIL;
        c1311340kEG2.getClass();
        int sign = lynxBaseUI.getSign();
        HashMap<Integer, WeakReference<LynxBaseUI>> map = c1311340kEG2.LJ;
        if (map == null || map.get(Integer.valueOf(sign)) == null || (lynxBaseUI2 = c1311340kEG2.LJ.get(Integer.valueOf(sign)).get()) == null || lynxBaseUI2 != lynxBaseUI) {
            return;
        }
        c1311340kEG2.LJ.remove(Integer.valueOf(sign));
    }

    public final void LJIIIZ(UIBody uIBody, C1310660kDA c1310660kDA) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init LynxAccessibilityHelper with ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZJ);
        LynxLog.i("LynxAccessibilityWrapper", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIILIIL == null) {
            this.LJIILIIL = new C1311340kEG(uIBody);
        }
        this.LJIILIIL.LIZIZ = this.LIZLLL;
        c1310660kDA.setImportantForAccessibility(2);
        q0.LJIJ(c1310660kDA, null);
    }

    public static void LJI(LynxBaseUI lynxBaseUI, boolean z, JavaOnlyArray javaOnlyArray) {
        CharSequence originText;
        if (lynxBaseUI != null) {
            if (!z) {
                JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                javaOnlyMap.putInt("element-id", lynxBaseUI.getSign());
                javaOnlyMap.putString("a11y-id", lynxBaseUI.mAccessibilityId);
                javaOnlyArray.add(javaOnlyMap);
            } else {
                String string = "";
                if (lynxBaseUI instanceof UIText) {
                    T t = ((LynxUI) lynxBaseUI).mView;
                    if (t == 0) {
                        originText = "";
                    } else {
                        originText = ((ActionModeCallbackC1315180kKS) t).getOriginText();
                        if (originText != null) {
                        }
                        javaOnlyArray.pushString(string);
                    }
                    string = originText.toString();
                    javaOnlyArray.pushString(string);
                } else if (lynxBaseUI instanceof FlattenUIText) {
                    CharSequence charSequence = ((FlattenUIText) lynxBaseUI).LLILZLL;
                    if (charSequence != null) {
                        string = charSequence.toString();
                    }
                    javaOnlyArray.pushString(string);
                }
            }
            for (int i = 0; i < lynxBaseUI.getChildren().size(); i++) {
                LJI((LynxBaseUI) ListProtector.get(lynxBaseUI.getChildren(), i), z, javaOnlyArray);
            }
        }
    }
}
