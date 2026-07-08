package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13jq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20094413jq extends C20094213jo {
    public static final /* synthetic */ int LJIIZILJ = 0;
    public final CharSequence LIZ;
    public final CharSequence LIZIZ;
    public final EnumC1397840mTm LIZJ;
    public final CharSequence LIZLLL;
    public final InterfaceC866910Xzd LJ;
    public final View.OnClickListener LJFF;
    public final CharSequence LJI;
    public final Function0<Boolean> LJII;
    public final View.OnLongClickListener LJIIIIZZ;
    public final CharSequence LJIIIZ;
    public final Function0<Boolean> LJIIJ;
    public final Map<Integer, Function1<Bundle, Unit>> LJIIJJI;
    public final Map<Integer, CharSequence> LJIIL;
    public final Map<Integer, Function0<Boolean>> LJIILIIL;
    public final Function1<AccessibilityNodeInfoCompat, Unit> LJIILJJIL;
    public final Set<Integer> LJIILL;
    public boolean LJIILLIIL;

    public C20094413jq() {
        throw null;
    }

    @Override // X.C20094213jo
    public final C1318860kQO getAccessibilityNodeProvider(View view) {
        if (this.LJIILLIIL) {
            return super.getAccessibilityNodeProvider(view);
        }
        return null;
    }

    @Override // X.C20094213jo
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (this.LJIILLIIL && super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent)) {
            return true;
        }
        return false;
    }

    @Override // X.C20094213jo
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (this.LJIILLIIL) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // X.C20094213jo
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Boolean boolInvoke;
        C20092413jW c20092413jW;
        Boolean boolInvoke2;
        C20092413jW c20092413jW2;
        CharSequence charSequence;
        Function0<Boolean> function0;
        if (this.LJIILLIIL) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        }
        CharSequence charSequence2 = this.LIZ;
        if (charSequence2 != null) {
            accessibilityNodeInfoCompat.setContentDescription(charSequence2);
        }
        CharSequence charSequence3 = this.LIZIZ;
        if (charSequence3 != null) {
            accessibilityNodeInfoCompat.setStateDescription(charSequence3);
        }
        EnumC1397840mTm enumC1397840mTm = this.LIZJ;
        if (enumC1397840mTm != EnumC1397840mTm.NONE) {
            accessibilityNodeInfoCompat.setClassName(enumC1397840mTm.getClassName());
        } else {
            CharSequence charSequence4 = this.LIZLLL;
            if (charSequence4 != null) {
                accessibilityNodeInfoCompat.setRoleDescription(charSequence4);
            }
        }
        InterfaceC866910Xzd interfaceC866910Xzd = this.LJ;
        if (interfaceC866910Xzd != null) {
            if (interfaceC866910Xzd instanceof C1614480s7C) {
                accessibilityNodeInfoCompat.setCollectionInfo(C20093113jd.LIZ(1, ((C1614480s7C) interfaceC866910Xzd).LIZ));
            } else if (interfaceC866910Xzd instanceof C857200Xjy) {
                accessibilityNodeInfoCompat.setCollectionInfo(C20093113jd.LIZ(0, 1));
            } else if (interfaceC866910Xzd instanceof C857190Xjx) {
                accessibilityNodeInfoCompat.setCollectionInfo(C20093113jd.LIZ(0, 0));
            } else if (interfaceC866910Xzd instanceof C1614490s7D) {
                accessibilityNodeInfoCompat.setCollectionItemInfo(C20092913jb.LIZIZ(0, ((C1614490s7D) interfaceC866910Xzd).LIZ, false));
            } else if ((interfaceC866910Xzd instanceof C857210Xjz) || (interfaceC866910Xzd instanceof C857180Xjw)) {
                accessibilityNodeInfoCompat.setCollectionItemInfo(C20092913jb.LIZIZ(0, 0, false));
            } else {
                throw new C1954807lC();
            }
        }
        Function0<Boolean> function02 = this.LJII;
        if (function02 != null) {
            boolInvoke = function02.invoke();
        } else {
            boolInvoke = null;
        }
        Boolean bool = Boolean.FALSE;
        if (Intrinsics.LJFF(boolInvoke, bool)) {
            accessibilityNodeInfoCompat.removeAction(C20092413jW.LJI);
            accessibilityNodeInfoCompat.setClickable(false);
        } else if (Intrinsics.LJFF(boolInvoke, Boolean.TRUE) || this.LJFF != null || this.LJI != null) {
            CharSequence charSequence5 = this.LJI;
            if (charSequence5 != null) {
                c20092413jW = new C20092413jW(16, charSequence5);
            } else {
                c20092413jW = C20092413jW.LJI;
            }
            accessibilityNodeInfoCompat.addAction(c20092413jW);
            accessibilityNodeInfoCompat.setClickable(true);
        }
        Function0<Boolean> function03 = this.LJIIJ;
        if (function03 != null) {
            boolInvoke2 = function03.invoke();
        } else {
            boolInvoke2 = null;
        }
        if (Intrinsics.LJFF(boolInvoke2, bool)) {
            accessibilityNodeInfoCompat.removeAction(C20092413jW.LJII);
            accessibilityNodeInfoCompat.setLongClickable(false);
        } else if (Intrinsics.LJFF(boolInvoke2, Boolean.TRUE) || this.LJIIIIZZ != null || this.LJIIIZ != null) {
            CharSequence charSequence6 = this.LJIIIZ;
            if (charSequence6 != null) {
                c20092413jW2 = new C20092413jW(32, charSequence6);
            } else {
                c20092413jW2 = C20092413jW.LJII;
            }
            accessibilityNodeInfoCompat.addAction(c20092413jW2);
            accessibilityNodeInfoCompat.setLongClickable(true);
        }
        Iterator it2 = ((HashSet) this.LJIILL).iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            Map<Integer, CharSequence> map = this.LJIIL;
            if (map != null) {
                charSequence = map.get(Integer.valueOf(iIntValue));
            } else {
                charSequence = null;
            }
            C20092413jW c20092413jW3 = new C20092413jW(iIntValue, charSequence);
            Map<Integer, Function0<Boolean>> map2 = this.LJIILIIL;
            if (map2 != null && (function0 = map2.get(Integer.valueOf(iIntValue))) != null && !function0.invoke().booleanValue()) {
                accessibilityNodeInfoCompat.removeAction(c20092413jW3);
            } else {
                accessibilityNodeInfoCompat.addAction(c20092413jW3);
            }
        }
        Function1<AccessibilityNodeInfoCompat, Unit> function1 = this.LJIILJJIL;
        if (function1 != null) {
            function1.invoke(accessibilityNodeInfoCompat);
        }
    }

    @Override // X.C20094213jo
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (this.LJIILLIIL) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // X.C20094213jo
    public final void sendAccessibilityEvent(View view, int i) {
        if (this.LJIILLIIL) {
            super.sendAccessibilityEvent(view, i);
        }
    }

    @Override // X.C20094213jo
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        if (this.LJIILLIIL) {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    @Override // X.C20094213jo
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (this.LJIILLIIL && super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent)) {
            return true;
        }
        return false;
    }

    @Override // X.C20094213jo
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        Function0<Boolean> function0;
        Map<Integer, Function0<Boolean>> map;
        Function1<Bundle, Unit> function1;
        Function0<Boolean> function02;
        Function0<Boolean> function03;
        if (i == 16) {
            if (this.LJFF != null && ((function03 = this.LJII) == null || function03.invoke().booleanValue())) {
                this.LJFF.onClick(view);
                return true;
            }
        } else if (i == 32 && this.LJIIIIZZ != null && (((function0 = this.LJIIJ) == null || function0.invoke().booleanValue()) && this.LJIIIIZZ.onLongClick(view))) {
            return true;
        }
        Map<Integer, Function1<Bundle, Unit>> map2 = this.LJIIJJI;
        if (map2 == null || !map2.containsKey(Integer.valueOf(i)) || (((map = this.LJIILIIL) != null && (function02 = map.get(Integer.valueOf(i))) != null && !function02.invoke().booleanValue()) || (function1 = this.LJIIJJI.get(Integer.valueOf(i))) == null)) {
            if (!this.LJIILLIIL) {
                return false;
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
        function1.invoke(bundle);
        return true;
    }

    public C20094413jq(CharSequence charSequence, EnumC1397840mTm enumC1397840mTm, CharSequence charSequence2, InterfaceC866910Xzd interfaceC866910Xzd, View.OnClickListener onClickListener, CharSequence charSequence3, Function0 function0, CharSequence charSequence4, Function0 function02, Function1 function1) {
        this.LIZ = charSequence;
        this.LIZIZ = null;
        this.LIZJ = enumC1397840mTm;
        this.LIZLLL = charSequence2;
        this.LJ = interfaceC866910Xzd;
        this.LJFF = onClickListener;
        this.LJI = charSequence3;
        this.LJII = function0;
        this.LJIIIIZZ = null;
        this.LJIIIZ = charSequence4;
        this.LJIIJ = function02;
        this.LJIIJJI = null;
        this.LJIIL = null;
        this.LJIILIIL = null;
        this.LJIILJJIL = function1;
        this.LJIILL = new HashSet();
        this.LJIILLIIL = true;
    }
}
