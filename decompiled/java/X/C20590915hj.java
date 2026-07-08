package X;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.tux.common.live_data.NextLiveData;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AwS275S0300000_31;
import kotlin.jvm.internal.AwS404S0200000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15hj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20590915hj implements Observer<C20590315hd> {
    public static final C20590215hc LLILLL = new C20590215hc(Integer.MAX_VALUE, C995200c0M.LIZLLL);
    public WeakReference<Activity> LL;
    public final CopyOnWriteArraySet<InterfaceC1593800rZq> LLILLJJLI = new CopyOnWriteArraySet<>();

    public final void LIZJ(Observer<C20590315hd> observer) {
        LifecycleOwner lifecycleOwner;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (!(observer instanceof C20591415ho)) {
            return;
        }
        C20591415ho c20591415ho = (C20591415ho) observer;
        LifecycleEventObserver lifecycleEventObserver = c20591415ho.LLILZ;
        if (lifecycleEventObserver != null) {
            WeakReference<LifecycleOwner> weakReference = c20591415ho.LLILZIL;
            if (weakReference != null) {
                lifecycleOwner = weakReference.get();
            } else {
                lifecycleOwner = null;
            }
            c20591415ho.LLILZ = null;
            c20591415ho.LLILZIL = null;
            if (lifecycleOwner != null) {
                C742170T9j.LIZ(new AwS404S0200000_3(lifecycleOwner, lifecycleEventObserver, 3));
            }
        }
        View view = c20591415ho.LL.LIZ;
        if (view == null) {
            return;
        }
        CopyOnWriteArraySet copyOnWriteArraySetLIZIZ = C20591015hk.LIZIZ(view);
        if (copyOnWriteArraySetLIZIZ != null && copyOnWriteArraySetLIZIZ.remove(observer)) {
            C20591015hk.LJFF(view).put(Integer.valueOf(R.id.f836z1p), copyOnWriteArraySetLIZIZ);
        }
        CopyOnWriteArraySet copyOnWriteArraySetLIZIZ2 = C20591015hk.LIZIZ(view);
        if (copyOnWriteArraySetLIZIZ2 == null || copyOnWriteArraySetLIZIZ2.isEmpty()) {
            View.OnLayoutChangeListener onLayoutChangeListenerLIZLLL = C20591015hk.LIZLLL(view);
            if (onLayoutChangeListenerLIZLLL != null) {
                view.removeOnLayoutChangeListener(onLayoutChangeListenerLIZLLL);
                C20591015hk.LJFF(view).remove(Integer.valueOf(R.id.z1r));
            }
            NextLiveData nextLiveDataLJ = C20591015hk.LJ(view);
            if (nextLiveDataLJ != null) {
                C742170T9j.LIZ(new AwS275S0300000_31(nextLiveDataLJ, (NextLiveData<C20590315hd>) this, (C20590915hj) view, (View) 15));
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeBreakPointChangeListener: cost time ");
        sbLIZ.append(SystemClock.uptimeMillis() - jUptimeMillis);
        sbLIZ.append(",listener=");
        sbLIZ.append(c20591415ho.LLILLJJLI);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, X.15hc] */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, X.15hc] */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(C20590315hd c20590315hd) {
        WeakReference<View> weakReference;
        View view;
        boolean z;
        boolean z2;
        boolean z3;
        C20590315hd c20590315hd2 = c20590315hd;
        if (c20590315hd2 != null && (weakReference = c20590315hd2.LJ) != null && (view = weakReference.get()) != null) {
            EnumC20591315hn enumC20591315hn = c20590315hd2.LIZ;
            ?? r7 = c20590315hd2.LIZIZ;
            ?? r6 = c20590315hd2.LIZJ;
            C19389510tR c19389510tR = c20590315hd2.LIZLLL;
            CopyOnWriteArraySet<C20591415ho> copyOnWriteArraySetLIZIZ = C20591015hk.LIZIZ(view);
            if (copyOnWriteArraySetLIZIZ != null) {
                for (C20591415ho c20591415ho : copyOnWriteArraySetLIZIZ) {
                    if (enumC20591315hn.hasIntersection(c20591415ho.LL.LIZIZ)) {
                        C259800zU c259800zU = new C259800zU();
                        c259800zU.element = r7;
                        C259800zU c259800zU2 = new C259800zU();
                        c259800zU2.element = r6;
                        c20591415ho.LL.getClass();
                        if (!c20591415ho.LLIZLLLIL) {
                            z3 = c20591415ho.LLILLL;
                        } else {
                            EnumC20591315hn enumC20591315hn2 = c20591415ho.LL.LIZIZ;
                            List<C20590215hc> list = C20590015ha.LIZJ;
                            if (enumC20591315hn2.contains(EnumC20591315hn.HORIZONTAL) && !Intrinsics.LJFF(c259800zU.element, c20591415ho.LLILZLL)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (enumC20591315hn2.contains(EnumC20591315hn.VERTICAL) && !Intrinsics.LJFF(c259800zU2.element, c20591415ho.LLIZ)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z && !z2) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                        }
                        c20591415ho.LLILZLL = (C20590215hc) c259800zU.element;
                        c20591415ho.LLIZ = (C20590215hc) c259800zU2.element;
                        c20591415ho.LLIZLLLIL = true;
                        if (z3) {
                            SystemClock.elapsedRealtimeNanos();
                            c20591415ho.LLILLJJLI.LIZ(new C20590315hd(enumC20591315hn, (C20590215hc) c259800zU.element, (C20590215hc) c259800zU2.element, c19389510tR, new WeakReference(view)));
                            SystemClock.elapsedRealtimeNanos();
                            enumC20591315hn.toString();
                            Objects.toString(c20591415ho.LLILLJJLI);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.lifecycle.Observer LIZ(X.InterfaceC1593800rZq r10, X.C20590015ha r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20590915hj.LIZ(X.0rZq, X.15ha, boolean):androidx.lifecycle.Observer");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.EnumC20591315hn r14, android.view.View r15, android.graphics.Rect r16, android.graphics.Rect r17) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20590915hj.LIZIZ(X.15hn, android.view.View, android.graphics.Rect, android.graphics.Rect):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0298 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0310 A[LOOP:4: B:146:0x030a->B:148:0x0310, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0360 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013b A[Catch: all -> 0x01b7, PHI: r1
      0x013b: PHI (r1v13 android.view.WindowManager) = (r1v12 android.view.WindowManager), (r1v24 android.view.WindowManager) binds: [B:53:0x0124, B:59:0x0135] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x01b7, blocks: (B:52:0x0122, B:54:0x0126, B:56:0x012e, B:57:0x0130, B:60:0x0137, B:61:0x013b, B:63:0x0141, B:65:0x0147, B:68:0x0194, B:70:0x01a2, B:72:0x01ab, B:73:0x01ae, B:74:0x01b1, B:75:0x01b4), top: B:166:0x0122 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.EnumC20591315hn r24, android.view.View r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20590915hj.LIZLLL(X.15hn, android.view.View, int, int):void");
    }
}
