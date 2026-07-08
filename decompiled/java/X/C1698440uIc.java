package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import iyl.s0;
import kotlin.Pair;
import oyl.d0;

/* JADX INFO: renamed from: X.0uIc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698440uIc extends C21648719nx {
    public final int $t;
    public Object l0;

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onDown$0(this, motionEvent);
            case 1:
                return onDown$1(this, motionEvent);
            case 2:
                return onDown$2(this, motionEvent);
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                onLongPress$0(this, motionEvent);
                break;
            case 1:
                onLongPress$1(this, motionEvent);
                break;
            case 2:
                onLongPress$2(this, motionEvent);
                break;
            default:
                super.onLongPress(motionEvent);
                break;
        }
    }

    public C1698440uIc(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onDown$0(C1698440uIc c1698440uIc, MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        Rect rect = new Rect();
        View viewLLLIIIIL = ((C1657600tEk) c1698440uIc.l0).LLLIIIIL(1);
        if (viewLLLIIIIL != null) {
            rect.left = viewLLLIIIIL.getLeft();
            rect.right = viewLLLIIIIL.getRight();
            rect.bottom = viewLLLIIIIL.getBottom();
            rect.top = viewLLLIIIIL.getTop();
        }
        ((C1657600tEk) c1698440uIc.l0).LLJJ = rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
        ((C1657600tEk) c1698440uIc.l0).LLJJI = new Pair<>(Integer.valueOf((int) motionEvent.getX()), Integer.valueOf((int) motionEvent.getY()));
        return super.onDown(motionEvent);
    }

    public static final boolean onDown$1(C1698440uIc c1698440uIc, MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        C1657710tEv c1657710tEv = (C1657710tEv) c1698440uIc.l0;
        c1657710tEv.LLJJLIIIJLLLLLLLZ = false;
        c1657710tEv.LLJJL = false;
        View viewWv = c1657710tEv.wv(EnumC1651770t5L.SPEED);
        if (viewWv != null) {
            C1657710tEv c1657710tEv2 = (C1657710tEv) c1698440uIc.l0;
            Rect rect = new Rect();
            viewWv.getLocalVisibleRect(rect);
            if (rect.height() < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) {
                return super.onDown(motionEvent);
            }
            Rect rect2 = new Rect();
            d0 d0Var = c1657710tEv2.LLJLL;
            if (d0Var == null) {
                d0Var = null;
            }
            Rect slideRegionRect = d0Var.getSlideRegionRect();
            rect2.left = viewWv.getLeft() + slideRegionRect.left;
            rect2.right = viewWv.getRight() + slideRegionRect.left;
            rect2.bottom = viewWv.getBottom() + slideRegionRect.top;
            rect2.top = viewWv.getTop() + slideRegionRect.top;
            c1657710tEv2.LLJJL = rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            c1657710tEv2.LLJL = new Pair<>(Integer.valueOf((int) motionEvent.getX()), Integer.valueOf((int) motionEvent.getY()));
        }
        return super.onDown(motionEvent);
    }

    public static final boolean onDown$2(C1698440uIc c1698440uIc, MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        s0 s0Var = (s0) c1698440uIc.l0;
        s0Var.LLJJLIIIJLLLLLLLZ = false;
        s0Var.LLJJL = false;
        View viewWv = s0Var.wv(EnumC1651770t5L.SPEED);
        if (viewWv != null) {
            s0 s0Var2 = (s0) c1698440uIc.l0;
            Rect rect = new Rect();
            viewWv.getLocalVisibleRect(rect);
            if (rect.height() < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) {
                return super.onDown(motionEvent);
            }
            Rect rect2 = new Rect();
            d0 d0Var = s0Var2.LLJLL;
            if (d0Var == null) {
                d0Var = null;
            }
            Rect slideRegionRect = d0Var.getSlideRegionRect();
            rect2.left = viewWv.getLeft() + slideRegionRect.left;
            rect2.right = viewWv.getRight() + slideRegionRect.left;
            rect2.bottom = s0.LLLII(viewWv.getBottom(), s0Var2, slideRegionRect);
            rect2.top = s0.LLLII(viewWv.getTop(), s0Var2, slideRegionRect);
            s0Var2.LLJJL = rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            s0Var2.LLJL = new Pair<>(Integer.valueOf((int) motionEvent.getX()), Integer.valueOf((int) motionEvent.getY()));
        }
        return super.onDown(motionEvent);
    }

    public static final void onLongPress$0(C1698440uIc c1698440uIc, MotionEvent motionEvent) {
        InterfaceC1657650tEp interfaceC1657650tEp;
        C1657600tEk c1657600tEk = (C1657600tEk) c1698440uIc.l0;
        if (c1657600tEk.LLJJ) {
            C1650980t44 c1650980t44Xv = c1657600tEk.xv(1);
            if (c1650980t44Xv != null && (interfaceC1657650tEp = c1650980t44Xv.LLJILJIL) != null) {
                interfaceC1657650tEp.LIZ();
            }
            new C1351210lGZ(((C1657600tEk) c1698440uIc.l0).requireSceneContext()).LIZIZ(12, 120);
        }
    }

    public static final void onLongPress$1(C1698440uIc c1698440uIc, MotionEvent motionEvent) {
        InterfaceC1657650tEp interfaceC1657650tEp;
        C1657710tEv c1657710tEv = (C1657710tEv) c1698440uIc.l0;
        if (c1657710tEv.LLJJL) {
            c1657710tEv.LLJJLIIIJLLLLLLLZ = true;
            C1650980t44 c1650980t44Xv = c1657710tEv.xv(1);
            if (c1650980t44Xv != null && (interfaceC1657650tEp = c1650980t44Xv.LLJILJIL) != null) {
                interfaceC1657650tEp.LIZ();
            }
            new C1351210lGZ(((C1657710tEv) c1698440uIc.l0).requireSceneContext()).LIZIZ(12, 120);
        }
    }

    public static final void onLongPress$2(C1698440uIc c1698440uIc, MotionEvent motionEvent) {
        s0 s0Var = (s0) c1698440uIc.l0;
        if (s0Var.LLJJL) {
            s0Var.LLJJLIIIJLLLLLLLZ = true;
            InterfaceC1657650tEp interfaceC1657650tEp = s0Var.LLJZIJLIL;
            if (interfaceC1657650tEp != null) {
                interfaceC1657650tEp.LIZ();
            }
            new C1351210lGZ(((s0) c1698440uIc.l0).requireSceneContext()).LIZIZ(12, 120);
        }
    }
}
