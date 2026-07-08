package X;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.13jo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20094213jo {
    public static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate mBridge;
    public final View.AccessibilityDelegate mOriginalDelegate;

    public C20094213jo() {
        this(DEFAULT_DELEGATE);
    }

    public View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public C20094213jo(View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new C20094313jp(this);
    }

    public static List<C20092413jW> getActionList(View view) {
        List<C20092413jW> list = (List) view.getTag(R.id.x0w);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public C1318860kQO getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.mOriginalDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C1318860kQO(accessibilityNodeProvider);
        }
        return null;
    }

    private boolean isSpanStillValid(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpans = AccessibilityNodeInfoCompat.getClickableSpans(view.createAccessibilityNodeInfo().getText());
            if (clickableSpans != null) {
                for (ClickableSpan clickableSpan2 : clickableSpans) {
                    if (clickableSpan.equals(clickableSpan2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean performClickableSpanAction(int i, View view) {
        Reference reference;
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.x0x);
        if (sparseArray != null && (reference = (Reference) sparseArray.get(i)) != null) {
            ClickableSpan clickableSpan = (ClickableSpan) reference.get();
            if (isSpanStillValid(clickableSpan, view)) {
                clickableSpan.onClick(view);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.unwrap());
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void sendAccessibilityEvent(View view, int i) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        List<C20092413jW> actionList = getActionList(view);
        int i2 = 0;
        while (true) {
            if (i2 >= actionList.size()) {
                break;
            }
            C20092413jW c20092413jW = (C20092413jW) ListProtector.get(actionList, i2);
            if (c20092413jW.LIZ() == i) {
                if (c20092413jW.LIZLLL != null) {
                    Class<? extends AbstractC20094013jm> cls = c20092413jW.LIZJ;
                    if (cls != null) {
                        try {
                            cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]).getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    boolean zLIZ = c20092413jW.LIZLLL.LIZ(view);
                    if (zLIZ) {
                        return zLIZ;
                    }
                }
            } else {
                i2++;
            }
        }
        boolean zPerformAccessibilityAction = this.mOriginalDelegate.performAccessibilityAction(view, i, bundle);
        if (!zPerformAccessibilityAction && i == R.id.zg && bundle != null) {
            return performClickableSpanAction(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
        }
        return zPerformAccessibilityAction;
    }
}
