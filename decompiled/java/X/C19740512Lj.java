package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: X.12Lj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19740512Lj implements InterfaceC1461390o8H {
    public final ViewGroup LIZ;
    public final C19740812Lm LIZIZ;
    public final GestureLayout$OnGestureListener LIZJ;
    public final C0FEW LIZLLL;

    public final void LIZJ() {
        View contentView;
        Iterator<GestureInteractItem> it2 = this.LIZIZ.LIZIZ.iterator();
        float f = 0.0f;
        while (it2.hasNext()) {
            InterfaceC379620EuW interfaceC379620EuW = it2.next().LLILLL;
            if (interfaceC379620EuW != null && (contentView = interfaceC379620EuW.getContentView()) != null) {
                C14K9.LJJ(contentView, f);
                f = 1.0f + f;
            }
        }
    }

    @Override // X.InterfaceC1461390o8H
    public final C0FEW getRootView() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1461390o8H
    public final void LIZ(GestureInteractItem gestureInteractItem) {
        ((ArrayList) this.LIZIZ.LIZ).remove(gestureInteractItem);
        InterfaceC379620EuW interfaceC379620EuW = gestureInteractItem.LLILLL;
        if (interfaceC379620EuW != null) {
            C0FEW c0few = this.LIZLLL;
            View contentView = interfaceC379620EuW.getContentView();
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c0few, contentView);
            c0few.removeView(contentView);
        }
    }

    @Override // X.InterfaceC1461390o8H
    public final void LIZIZ(GestureInteractItem gestureInteractItem) {
        C19740812Lm c19740812Lm = this.LIZIZ;
        c19740812Lm.getClass();
        C01GW c01gw = C256330A2t.LIZ;
        if ((((Boolean) c01gw.getValue()).booleanValue() && !((ArrayList) c19740812Lm.LIZ).contains(gestureInteractItem)) || !((Boolean) c01gw.getValue()).booleanValue()) {
            ListProtector.add(c19740812Lm.LIZ, 0, gestureInteractItem);
            C08XD.LJJ(c19740812Lm.LIZ, c19740812Lm.LIZJ);
        }
        InterfaceC379620EuW interfaceC379620EuW = gestureInteractItem.LLILLL;
        if (interfaceC379620EuW != null) {
            if (interfaceC379620EuW.getContentView().getLayoutParams() == null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                C786410Ut5.W5(interfaceC379620EuW.getContentView(), layoutParams);
            }
            this.LIZLLL.addView(interfaceC379620EuW.getContentView());
            LIZJ();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.12Lk] */
    public C19740512Lj(Context context, int i, ViewGroup viewGroup) {
        this.LIZ = viewGroup;
        final C19740812Lm c19740812Lm = new C19740812Lm();
        this.LIZIZ = c19740812Lm;
        final ?? r0 = new InterfaceC19740912Ln() { // from class: X.12Lk
            @Override // X.InterfaceC19740912Ln
            public final void LIZ(GestureInteractItem gestureInteractItem) {
                int iIndexOf;
                C19740812Lm c19740812Lm2 = this.LIZ.LIZIZ;
                int iIndexOf2 = ((ArrayList) c19740812Lm2.LIZ).indexOf(gestureInteractItem);
                if (iIndexOf2 >= 0) {
                    Iterator it2 = ((ArrayList) c19740812Lm2.LIZ).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (((GestureInteractItem) next).LLILLJJLI == gestureInteractItem.LLILLJJLI) {
                            if (next != null && (iIndexOf = ((ArrayList) c19740812Lm2.LIZ).indexOf(next)) >= 0 && iIndexOf2 != iIndexOf) {
                                Collections.swap(c19740812Lm2.LIZ, iIndexOf2, iIndexOf);
                            }
                        }
                    }
                }
                this.LIZ.LIZJ();
            }
        };
        GestureLayout$OnGestureListener gestureLayout$OnGestureListener = (GestureLayout$OnGestureListener) Proxy.newProxyInstance(C19740512Lj.class.getClassLoader(), new Class[]{GestureLayout$OnGestureListener.class}, new InvocationHandler(c19740812Lm, r0) { // from class: X.12Li
            public final C19740812Lm LL;
            public final InterfaceC19740912Ln LLILLJJLI;
            public final boolean LLILLL = C2219091BtD.LIZIZ();
            public GestureInteractItem LLILZ = null;

            {
                this.LL = c19740812Lm;
                this.LLILLJJLI = r0;
            }

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                InterfaceC19740912Ln interfaceC19740912Ln;
                boolean zBooleanValue = false;
                if (method.getReturnType().equals(Boolean.TYPE)) {
                    GestureInteractItem gestureInteractItem = this.LLILZ;
                    if (gestureInteractItem != null) {
                        if (method.getName().equals("onUp")) {
                            this.LLILZ = null;
                        }
                        zBooleanValue = Boolean.valueOf(((Boolean) C2204961BRm.a0(method, gestureInteractItem, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyHdNBipZQqLGW/+XSaZ16n1vzpCWh00DsAzSTDNU2sujxjomVklTG2JwYcaQnoyy295qgjT5Ep", null))).booleanValue()).booleanValue();
                    } else {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= ((ArrayList) this.LL.LIZIZ).size()) {
                                break;
                            }
                            GestureInteractItem gestureInteractItem2 = (GestureInteractItem) ListProtector.get(this.LL.LIZIZ, i2);
                            if (((Boolean) C2204961BRm.a0(method, gestureInteractItem2, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyHdNBipZQqLGW/+XSaZ16n1vzpCWh00DsAzSTDNU2sujxjomVklTG2JwYcaQnoyy295qgjT5Ep", null))).booleanValue()) {
                                if (gestureInteractItem2.LLILZIL) {
                                    this.LLILZ = gestureInteractItem2;
                                }
                                if (method.getName().equals("onDown") && (interfaceC19740912Ln = this.LLILLJJLI) != null) {
                                    interfaceC19740912Ln.LIZ(gestureInteractItem2);
                                }
                                if (this.LLILLL) {
                                    String str = "handleBoolean: methodName=" + method.getName() + ",i=" + i2 + ",size=" + ((ArrayList) this.LL.LIZIZ).size() + ",item=" + gestureInteractItem2;
                                    InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("[effect_platform], ");
                                    sbLIZ.append(str);
                                    interfaceC1463990oCTLIZLLL.d(C2188811AlT.LIZIZ(sbLIZ));
                                }
                                zBooleanValue = true;
                            } else {
                                i2++;
                            }
                        }
                    }
                    return Boolean.valueOf(zBooleanValue);
                }
                int size = ((ArrayList) this.LL.LIZIZ).size();
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj2 = ListProtector.get(this.LL.LIZIZ, i3);
                    C2204961BRm.a0(method, obj2, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyHdNBipZQqLGW/+XSaZ16n1vzpCWh00DsAzSTDNU2sujxjomVklTG2JwYcaQnoyy295qgjT5Ep", null));
                    if (this.LLILLL) {
                        String str2 = "i=" + i3 + ",size=" + size + ",methodName=" + method.getName() + ",item=" + obj2;
                        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL2 = C2219091BtD.LIZLLL();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("[effect_platform], ");
                        sbLIZ2.append(str2);
                        interfaceC1463990oCTLIZLLL2.d(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
                return null;
            }
        });
        this.LIZJ = gestureLayout$OnGestureListener;
        C0FEW c0few = new C0FEW(context, null);
        c0few.setOnGestureListener(gestureLayout$OnGestureListener);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0few);
        c0few.setLayoutParams(layoutParams);
        if (viewGroup != null) {
            viewGroup.addView(c0few);
        }
        c0few.setMoveSlop(i);
        this.LIZLLL = c0few;
    }
}
