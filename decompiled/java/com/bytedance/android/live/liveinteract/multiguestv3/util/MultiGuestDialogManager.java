package com.bytedance.android.live.liveinteract.multiguestv3.util;

import X.C926620aDk;
import X.C926630aDl;
import X.InterfaceC948500an2;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.dialog.PriorityTaskDispatcher;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@InterfaceC948500an2(name = "MULTI_GUEST_DIALOG_MANAGER")
public final class MultiGuestDialogManager extends PriorityTaskDispatcher implements GenericLifecycleObserver {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final LifecycleOwner LLILZLL;
    public final List<Pair<WeakReference<Object>, C926620aDk>> LLIZ = new ArrayList();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onLinkControlWidgetDestroy();
        }
    }

    public final void wQ2() {
        Iterator<Pair<WeakReference<Object>, C926620aDk>> it2 = this.LLIZ.iterator();
        while (it2.hasNext()) {
            C926630aDl.LIZJ(it2.next().getFirst());
        }
        ((ArrayList) this.LLIZ).clear();
    }

    public final void xQ2() {
        Iterator it2 = ((ArrayList) this.LLIZ).iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            if (!((C926620aDk) pair.getSecond()).LJII) {
                C926630aDl.LIZJ((WeakReference) pair.getFirst());
                it2.remove();
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onLinkControlWidgetDestroy() {
        wQ2();
        this.LLILZLL.getLifecycle().removeObserver(this);
    }

    public MultiGuestDialogManager(LifecycleOwner lifecycleOwner) {
        this.LLILZLL = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AQ2(com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.MultiGuestLiveSettingDialog r7) {
        /*
            r6 = this;
            kotlin.Pair r5 = r6.zQ2(r7)
            if (r5 == 0) goto L88
            java.lang.Object r0 = r5.getSecond()
            X.0aDk r0 = (X.C926620aDk) r0
            int r0 = r0.LJIIIIZZ
            if (r0 == 0) goto L88
            java.util.List<kotlin.Pair<java.lang.ref.WeakReference<java.lang.Object>, X.0aDk>> r0 = r6.LLIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r4 = r0.iterator()
        L18:
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 == 0) goto L9a
            java.lang.Object r3 = r4.next()
            r0 = r3
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.getSecond()
            X.0aDk r0 = (X.C926620aDk) r0
            int r2 = r0.LIZ
            java.lang.Object r0 = r5.getSecond()
            X.0aDk r0 = (X.C926620aDk) r0
            int r0 = r0.LJIIIIZZ
            if (r2 != r0) goto L18
        L38:
            kotlin.Pair r3 = (kotlin.Pair) r3
            if (r3 == 0) goto L97
            java.lang.Object r4 = r3.getFirst()
            java.lang.ref.Reference r4 = (java.lang.ref.Reference) r4
            if (r4 == 0) goto L98
            java.lang.Object r3 = r4.get()
        L48:
            boolean r0 = r3 instanceof androidx.fragment.app.DialogFragment
            if (r0 == 0) goto L77
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            if (r3 == 0) goto L77
            java.lang.String r0 = "show DialogFragment 1111"
            java.lang.String r2 = "wws_ConnectDistribute"
            X.C20441214yg.LIZIZ(r2, r0)
            boolean r0 = r3.isAdded()
            if (r0 == 0) goto L89
            android.app.Dialog r0 = r3.getDialog()
            if (r0 == 0) goto L89
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L89
            java.lang.String r0 = "show DialogFragment 2222"
            X.C20441214yg.LIZIZ(r2, r0)
            android.app.Dialog r0 = r3.getDialog()
            if (r0 == 0) goto L77
            X.C786410Ut5.B4(r0)
        L77:
            if (r4 == 0) goto L7d
            java.lang.Object r1 = r4.get()
        L7d:
            boolean r0 = r1 instanceof android.app.Dialog
            if (r0 == 0) goto L88
            android.app.Dialog r1 = (android.app.Dialog) r1
            if (r1 == 0) goto L88
            X.C500260Jjc.LJJLIIIJLLLLLLLZ(r1)
        L88:
            return
        L89:
            java.lang.String r0 = "show DialogFragment 3333"
            X.C20441214yg.LIZIZ(r2, r0)
            java.lang.String r0 = "we can't reshow dialogfragment as there isn't fm!"
            X.C766270U4b.LJIIJJI(r0)
            r3.dismissAllowingStateLoss()
            goto L77
        L97:
            r4 = r1
        L98:
            r3 = r1
            goto L48
        L9a:
            r3 = r1
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestDialogManager.AQ2(com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.MultiGuestLiveSettingDialog):void");
    }

    public final void Ll1(Object obj) {
        Pair<WeakReference<Object>, C926620aDk> next;
        WeakReference<Object> first;
        Object obj2;
        Pair<WeakReference<Object>, C926620aDk> pairZQ2 = zQ2(obj);
        if (pairZQ2 != null && pairZQ2.getSecond().LJIIIIZZ != 0) {
            Iterator<Pair<WeakReference<Object>, C926620aDk>> it2 = this.LLIZ.iterator();
            do {
                next = null;
                if (!it2.hasNext()) {
                    break;
                } else {
                    next = it2.next();
                }
            } while (next.getSecond().LIZ != pairZQ2.getSecond().LJIIIIZZ);
            Pair<WeakReference<Object>, C926620aDk> pair = next;
            if (pair != null && (first = pair.getFirst()) != null && (obj2 = first.get()) != null) {
                Ll1(obj2);
            }
        }
    }

    public final void yQ2(Function1<? super C926620aDk, Boolean> function1) {
        List<Pair<WeakReference<Object>, C926620aDk>> list = this.LLIZ;
        ArrayList<Pair> arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (function1.invoke(((Pair) obj).getSecond()).booleanValue()) {
                arrayList.add(obj);
            }
        }
        for (Pair pair : arrayList) {
            C926630aDl.LIZJ((WeakReference) pair.getFirst());
            ((C926620aDk) pair.getSecond()).LJII = false;
        }
        xQ2();
    }

    public final Pair<WeakReference<Object>, C926620aDk> zQ2(Object obj) {
        Object obj2;
        Iterator<Pair<WeakReference<Object>, C926620aDk>> it2 = this.LLIZ.iterator();
        while (true) {
            obj2 = null;
            if (!it2.hasNext()) {
                break;
            }
            Pair<WeakReference<Object>, C926620aDk> next = it2.next();
            WeakReference<Object> first = next.getFirst();
            if (first != null) {
                obj2 = first.get();
            }
            if (Intrinsics.LJFF(obj2, obj)) {
                obj2 = next;
                break;
            }
        }
        return (Pair) obj2;
    }
}
