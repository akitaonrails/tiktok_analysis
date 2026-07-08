package X;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.13jW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20092413jW {
    public static final C20092413jW LJ = new C20092413jW(1, (CharSequence) null);
    public static final C20092413jW LJFF = new C20092413jW(2, (CharSequence) null);
    public static final C20092413jW LJI;
    public static final C20092413jW LJII;
    public static final C20092413jW LJIIIIZZ;
    public static final C20092413jW LJIIIZ;
    public static final C20092413jW LJIIJ;
    public static final C20092413jW LJIIJJI;
    public static final C20092413jW LJIIL;
    public static final C20092413jW LJIILIIL;
    public static final C20092413jW LJIILJJIL;
    public static final C20092413jW LJIILL;
    public static final C20092413jW LJIILLIIL;
    public static final C20092413jW LJIIZILJ;
    public static final C20092413jW LJIJ;
    public static final C20092413jW LJIJI;
    public static final C20092413jW LJIJJ;
    public static final C20092413jW LJIJJLI;
    public static final C20092413jW LJIL;
    public static final C20092413jW LJJ;
    public static final C20092413jW LJJI;
    public static final C20092413jW LJJIFFI;
    public static final C20092413jW LJJII;
    public static final C20092413jW LJJIII;
    public static final C20092413jW LJJIIJ;
    public static final C20092413jW LJJIIJZLJL;
    public static final C20092413jW LJJIIZ;
    public static final C20092413jW LJJIIZI;
    public static final C20092413jW LJJIJ;
    public static final C20092413jW LJJIJIIJI;
    public static final C20092413jW LJJIJIIJIL;
    public static final C20092413jW LJJIJIL;
    public final Object LIZ;
    public final int LIZIZ;
    public final Class<? extends AbstractC20094013jm> LIZJ;
    public final InterfaceC20092813ja LIZLLL;

    static {
        new C20092413jW(4, (CharSequence) null);
        new C20092413jW(8, (CharSequence) null);
        LJI = new C20092413jW(16, (CharSequence) null);
        LJII = new C20092413jW(32, (CharSequence) null);
        LJIIIIZZ = new C20092413jW(64, (CharSequence) null);
        LJIIIZ = new C20092413jW(128, (CharSequence) null);
        LJIIJ = new C20092413jW(256, C20093313jf.class);
        LJIIJJI = new C20092413jW(512, C20093313jf.class);
        LJIIL = new C20092413jW(1024, C20093413jg.class);
        LJIILIIL = new C20092413jW(SpeechEngineDefines.ASR_WORK_MODE_OFFLINE, C20093413jg.class);
        LJIILJJIL = new C20092413jW(SpeechEngineDefines.TTS_WORK_MODE_BOTH, (CharSequence) null);
        LJIILL = new C20092413jW(8192, (CharSequence) null);
        LJIILLIIL = new C20092413jW(16384, (CharSequence) null);
        LJIIZILJ = new C20092413jW(32768, (CharSequence) null);
        LJIJ = new C20092413jW(65536, (CharSequence) null);
        LJIJI = new C20092413jW(131072, C20093813jk.class);
        LJIJJ = new C20092413jW(262144, (CharSequence) null);
        LJIJJLI = new C20092413jW(524288, (CharSequence) null);
        LJIL = new C20092413jW(1048576, (CharSequence) null);
        LJJ = new C20092413jW(2097152, C20093913jl.class);
        LJJI = new C20092413jW(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new C20092413jW(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, C20093613ji.class);
        LJJIFFI = new C20092413jW(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        LJJII = new C20092413jW(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        LJJIII = new C20092413jW(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        LJJIIJ = new C20092413jW(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        int i = Build.VERSION.SDK_INT;
        LJJIIJZLJL = new C20092413jW(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        LJJIIZ = new C20092413jW(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        LJJIIZI = new C20092413jW(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        LJJIJ = new C20092413jW(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        LJJIJIIJI = new C20092413jW(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        LJJIJIIJIL = new C20092413jW(i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, C20093713jj.class);
        new C20092413jW(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, C20093513jh.class);
        new C20092413jW(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new C20092413jW(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new C20092413jW(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        LJJIJIL = new C20092413jW(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new C20092413jW(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new C20092413jW(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new C20092413jW(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        AccessibilityNodeInfo.AccessibilityAction accessibilityActionLIZ = null;
        new C20092413jW(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        if (i >= 34) {
            accessibilityActionLIZ = C20092513jX.LIZ();
        }
        new C20092413jW(accessibilityActionLIZ, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public final int LIZ() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.LIZ).getId();
    }

    public final int hashCode() {
        Object obj = this.LIZ;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String actionSymbolicName = AccessibilityNodeInfoCompat.getActionSymbolicName(this.LIZIZ);
        if (actionSymbolicName.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) this.LIZ).getLabel() != null) {
            actionSymbolicName = ((AccessibilityNodeInfo.AccessibilityAction) this.LIZ).getLabel().toString();
        }
        sb.append(actionSymbolicName);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C20092413jW)) {
            return false;
        }
        C20092413jW c20092413jW = (C20092413jW) obj;
        Object obj2 = this.LIZ;
        if (obj2 == null) {
            if (c20092413jW.LIZ != null) {
                return false;
            }
            return true;
        }
        if (!obj2.equals(c20092413jW.LIZ)) {
            return false;
        }
        return true;
    }

    public C20092413jW(int i, CharSequence charSequence) {
        this(null, i, charSequence, null, null);
    }

    public C20092413jW(int i, Class cls) {
        this(null, i, null, null, cls);
    }

    public C20092413jW(Object obj, int i, CharSequence charSequence, InterfaceC20092813ja interfaceC20092813ja, Class<? extends AbstractC20094013jm> cls) {
        this.LIZIZ = i;
        this.LIZLLL = interfaceC20092813ja;
        if (obj == null) {
            this.LIZ = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
        } else {
            this.LIZ = obj;
        }
        this.LIZJ = cls;
    }
}
