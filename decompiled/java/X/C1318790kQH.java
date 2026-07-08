package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Switch;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.zhiliaoapp.musically.R;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0kQH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1318790kQH extends C20094213jo {
    public static List<Integer> LIZLLL;
    public static final C1321580kUm LJ = new HashMap<String, String>() { // from class: X.0kUm
        {
            put("button", Button.class.getName());
            put("switch", Switch.class.getName());
            put("checkbox", CheckBox.class.getName());
            put("image", ImageView.class.getName());
            put("progressbar", ProgressBar.class.getName());
        }
    };
    public final WeakReference<LynxUI> LIZ;
    public final Rect LIZIZ;
    public final Rect LIZJ;

    public final LynxUI LIZJ() {
        WeakReference<LynxUI> weakReference = this.LIZ;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.LIZ.get();
    }

    public final C1310360kCg LIZIZ() {
        s sVar;
        if (LIZJ() == null || (sVar = LIZJ().mContext) == null) {
            return null;
        }
        return sVar.LJIIL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T extends android.view.View, android.view.View] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public C1318790kQH(LynxUI lynxUI) {
        ?? r1;
        C1311340kEG c1311340kEG;
        Rect rect = C1310360kCg.LJIILL;
        this.LIZIZ = new Rect(rect);
        this.LIZJ = new Rect(rect);
        if (lynxUI != null && lynxUI.mView != null) {
            this.LIZ = new WeakReference<>(lynxUI);
            C1310360kCg c1310360kCgLIZIZ = LIZIZ();
            if (c1310360kCgLIZIZ != null && (c1311340kEG = c1310360kCgLIZIZ.LJIILIIL) != null) {
                r1 = c1311340kEG.LIZIZ;
            } else {
                r1 = 0;
            }
            lynxUI.mView.setImportantForAccessibility(r1);
            return;
        }
        LynxLog.e("CustomAccessibilityDelegateCompat", "Construct with null ui or view");
    }

    public static int LIZ(int i) {
        if (LIZLLL == null) {
            LIZLLL = new ArrayList(Arrays.asList(Integer.valueOf(R.id.fcn), Integer.valueOf(R.id.fcy), Integer.valueOf(R.id.fd9), Integer.valueOf(R.id.fd_), Integer.valueOf(R.id.fda), Integer.valueOf(R.id.fdb), Integer.valueOf(R.id.fdc), Integer.valueOf(R.id.fdd), Integer.valueOf(R.id.fde), Integer.valueOf(R.id.fdf), Integer.valueOf(R.id.fco), Integer.valueOf(R.id.fcp), Integer.valueOf(R.id.fcq), Integer.valueOf(R.id.fcr), Integer.valueOf(R.id.fcs), Integer.valueOf(R.id.fct), Integer.valueOf(R.id.fcu), Integer.valueOf(R.id.fcv), Integer.valueOf(R.id.fcw), Integer.valueOf(R.id.fcx), Integer.valueOf(R.id.fcz), Integer.valueOf(R.id.fd0), Integer.valueOf(R.id.fd1), Integer.valueOf(R.id.fd2), Integer.valueOf(R.id.fd3), Integer.valueOf(R.id.fd4), Integer.valueOf(R.id.fd5), Integer.valueOf(R.id.fd6), Integer.valueOf(R.id.fd7), Integer.valueOf(R.id.f703fd8)));
        }
        return ((Integer) ListProtector.get(LIZLLL, i)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C20094213jo
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        WeakReference<LynxUI> weakReference;
        C1311340kEG c1311340kEG;
        boolean z;
        String string;
        UIBody uIBody;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        C1310360kCg c1310360kCgLIZIZ = LIZIZ();
        if (c1310360kCgLIZIZ != null && (weakReference = this.LIZ) != null && weakReference.get() != null && c1310360kCgLIZIZ.LJFF()) {
            LynxUI lynxUI = this.LIZ.get();
            C1310360kCg c1310360kCgLIZIZ2 = LIZIZ();
            CharSequence charSequence = null;
            if (c1310360kCgLIZIZ2 != null) {
                c1311340kEG = c1310360kCgLIZIZ2.LJIILIIL;
            } else {
                c1311340kEG = null;
            }
            boolean zLIZ = c1311340kEG.LIZ(lynxUI);
            CharSequence accessibilityLabel = lynxUI.getAccessibilityLabel();
            LynxUI lynxUILIZJ = LIZJ();
            if (lynxUILIZJ != null && lynxUILIZJ.getEvents() != null && (lynxUILIZJ.getEvents().containsKey("click") || lynxUILIZJ.getEvents().containsKey("tap"))) {
                z = true;
            } else {
                z = false;
            }
            accessibilityNodeInfoCompat.setScreenReaderFocusable(zLIZ);
            if (zLIZ) {
                String str = lynxUI.mAccessibilityStatus;
                StringBuilder sb = new StringBuilder();
                if (str != null) {
                    sb.append((CharSequence) str);
                }
                if (accessibilityLabel != null) {
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    sb.append(accessibilityLabel);
                }
                string = sb.toString();
            } else {
                string = null;
            }
            accessibilityNodeInfoCompat.setContentDescription(string);
            if (zLIZ) {
                charSequence = accessibilityLabel;
            }
            accessibilityNodeInfoCompat.setText(charSequence);
            accessibilityNodeInfoCompat.setClickable(z);
            ArrayList arrayList = lynxUI.mAccessibilityActions;
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    accessibilityNodeInfoCompat.addAction(new C20092413jW(LIZ(i), (String) it2.next()));
                    i++;
                }
            } else {
                Iterator<C20092413jW> it3 = accessibilityNodeInfoCompat.getActionList().iterator();
                while (it3.hasNext()) {
                    accessibilityNodeInfoCompat.removeAction(it3.next());
                }
            }
            if (z) {
                accessibilityNodeInfoCompat.addAction(C20092413jW.LJI);
            } else {
                accessibilityNodeInfoCompat.removeAction(C20092413jW.LJI);
            }
            if (!zLIZ) {
                accessibilityNodeInfoCompat.removeAction(C20092413jW.LJIIIIZZ);
                accessibilityNodeInfoCompat.setVisibleToUser(false);
            }
            accessibilityNodeInfoCompat.getBoundsInScreen(this.LIZIZ);
            accessibilityNodeInfoCompat.getBoundsInParent(this.LIZJ);
            s sVar = lynxUI.mContext;
            T t = lynxUI.mView;
            if (sVar != null && t != 0 && (uIBody = sVar.LLJILJILJ) != null) {
                C1310660kDA c1310660kDA = uIBody.LL;
                ViewParent parent = t.getParent();
                if (c1310660kDA != null) {
                    while (true) {
                        if (parent == 0 || parent == c1310660kDA) {
                            break;
                        }
                        if (parent instanceof C1313240kHK) {
                            View view2 = (View) parent;
                            if (view2.getParent() instanceof ViewGroup) {
                                ViewGroup viewGroup = (ViewGroup) view2.getParent();
                                int childCount = viewGroup.getChildCount();
                                for (int i2 = 0; i2 < childCount; i2++) {
                                    View childAt = viewGroup.getChildAt(i2);
                                    if (childAt == view2) {
                                        break;
                                    }
                                    if (childAt != null) {
                                        accessibilityNodeInfoCompat.setTraversalAfter(childAt);
                                    }
                                }
                            }
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
            }
            EnumC1319630kRd enumC1319630kRd = lynxUI.mAccessibilityTraits;
            accessibilityNodeInfoCompat.setClassName(EnumC1319630kRd.getValue(enumC1319630kRd));
            if (enumC1319630kRd == EnumC1319630kRd.NONE) {
                accessibilityNodeInfoCompat.setRoleDescription("");
            }
            String str2 = lynxUI.mAccessibilityRoleDescription;
            if (str2 != null) {
                C1321580kUm c1321580kUm = LJ;
                if (c1321580kUm.containsKey(str2)) {
                    accessibilityNodeInfoCompat.setClassName(c1321580kUm.get(str2));
                } else {
                    accessibilityNodeInfoCompat.setRoleDescription(str2);
                }
            }
        }
    }

    @Override // X.C20094213jo
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        boolean zPerformAccessibilityAction = super.performAccessibilityAction(view, i, bundle);
        int i2 = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        boolean z = false;
        if (i == C20092413jW.LJI.LIZ()) {
            C1310360kCg c1310360kCgLIZIZ = LIZIZ();
            WeakReference<LynxUI> weakReference = this.LIZ;
            if (weakReference != null && weakReference.get() != null && c1310360kCgLIZIZ != null && c1310360kCgLIZIZ.LJFF()) {
                LynxUI lynxUI = this.LIZ.get();
                Rect rect = this.LIZIZ;
                Rect rect2 = C1310360kCg.LJIILL;
                if (!rect.equals(rect2) && !this.LIZJ.equals(rect2)) {
                    C1298900juC c1298900juC = new C1298900juC(this.LIZIZ.centerX(), this.LIZIZ.centerY());
                    C1298900juC c1298900juC2 = new C1298900juC(this.LIZJ.centerX(), this.LIZJ.centerY());
                    if (lynxUI.getEvents() != null) {
                        Map<String, C1299120juY> events = lynxUI.getEvents();
                        if (events.containsKey("tap")) {
                            lynxUI.mContext.LLIZ.LIZLLL(new C1298740jtw(lynxUI.getSign(), "tap", c1298900juC2, c1298900juC2, c1298900juC));
                            z = true;
                        }
                        if (events.containsKey("click")) {
                            lynxUI.mContext.LLIZ.LIZLLL(new C1298740jtw(lynxUI.getSign(), "click", c1298900juC2, c1298900juC2, c1298900juC));
                            return true;
                        }
                    }
                }
            }
            return z;
        }
        if (i == C20092413jW.LJIIIIZZ.LIZ() && LIZIZ() != null) {
            C1310360kCg c1310360kCgLIZIZ2 = LIZIZ();
            LynxUI lynxUI2 = this.LIZ.get();
            c1310360kCgLIZIZ2.getClass();
            C1310360kCg.LJIIJJI(lynxUI2);
            return zPerformAccessibilityAction;
        }
        ArrayList arrayList = this.LIZ.get().mAccessibilityActions;
        if (arrayList == null) {
            return zPerformAccessibilityAction;
        }
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i == LIZ(i2)) {
                C1289960jfm c1289960jfm = new C1289960jfm(this.LIZ.get().getSign(), "accessibilityaction");
                c1289960jfm.LIZIZ(obj, "name");
                this.LIZ.get().mContext.LLIZ.LIZIZ(c1289960jfm);
                return zPerformAccessibilityAction;
            }
            i2 = i3;
        }
        return zPerformAccessibilityAction;
    }
}
