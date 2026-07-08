package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastCpuOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fFe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120000fFe extends C0UKU {
    public final DataChannel LIZ;

    public C1120000fFe(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    @Override // X.C0UKU
    public final void LIZIZ(AbstractC1120020fFg abstractC1120020fFg) {
        if (abstractC1120020fFg == null) {
            return;
        }
        if (LiveBroadcastCpuOptSetting.enableGestureDispatchOpt()) {
            ArrayList<AbstractC1120020fFg> arrayList = (ArrayList) this.LIZ.gg0(C755740Tki.class);
            if (arrayList == null) {
                return;
            }
            if (!arrayList.isEmpty()) {
                for (AbstractC1120020fFg abstractC1120020fFg2 : arrayList) {
                    if (Intrinsics.LJFF(abstractC1120020fFg2.getClass(), abstractC1120020fFg.getClass()) && abstractC1120020fFg2.LIZIZ() == abstractC1120020fFg.LIZIZ()) {
                        return;
                    }
                }
            }
            abstractC1120020fFg.LIZJ();
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((AbstractC1120020fFg) it2.next()).LIZIZ() > abstractC1120020fFg.LIZIZ()) {
                    if (i != -1) {
                        ListProtector.add(arrayList, i, abstractC1120020fFg);
                    }
                } else {
                    i++;
                }
            }
            arrayList.add(abstractC1120020fFg);
            PriorityQueue priorityQueue = (PriorityQueue) this.LIZ.gg0(C1120040fFi.class);
            if (priorityQueue == null) {
                return;
            }
            priorityQueue.offer(abstractC1120020fFg);
            return;
        }
        PriorityQueue priorityQueue2 = (PriorityQueue) this.LIZ.gg0(C1120040fFi.class);
        if (priorityQueue2 != null) {
            Iterator it3 = priorityQueue2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                AbstractC1120020fFg abstractC1120020fFg3 = (AbstractC1120020fFg) next;
                if (abstractC1120020fFg3.getClass().getSimpleName().equals(abstractC1120020fFg.getClass().getSimpleName()) && abstractC1120020fFg3.LIZIZ() == abstractC1120020fFg.LIZIZ()) {
                    if (next != null) {
                        return;
                    }
                }
            }
        }
        abstractC1120020fFg.LIZJ();
        PriorityQueue priorityQueue3 = (PriorityQueue) this.LIZ.gg0(C1120040fFi.class);
        if (priorityQueue3 != null) {
            priorityQueue3.offer(abstractC1120020fFg);
        }
    }

    @Override // X.C0UKU
    public final void LIZJ(AbstractC1120020fFg abstractC1120020fFg) {
        if (abstractC1120020fFg == null) {
            return;
        }
        Object obj = null;
        if (LiveBroadcastCpuOptSetting.enableGestureDispatchOpt()) {
            ArrayList arrayList = (ArrayList) this.LIZ.gg0(C755740Tki.class);
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    AbstractC1120020fFg abstractC1120020fFg2 = (AbstractC1120020fFg) next;
                    if (Intrinsics.LJFF(abstractC1120020fFg2.getClass(), abstractC1120020fFg.getClass()) && abstractC1120020fFg2.LIZIZ() == abstractC1120020fFg.LIZIZ()) {
                        obj = next;
                        break;
                    }
                }
                AbstractC1120020fFg abstractC1120020fFg3 = (AbstractC1120020fFg) obj;
                if (abstractC1120020fFg3 != null) {
                    abstractC1120020fFg3.LIZLLL();
                    arrayList.remove(abstractC1120020fFg3);
                    PriorityQueue priorityQueue = (PriorityQueue) this.LIZ.gg0(C1120040fFi.class);
                    if (priorityQueue != null) {
                        priorityQueue.remove(abstractC1120020fFg3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        PriorityQueue priorityQueue2 = (PriorityQueue) this.LIZ.gg0(C1120040fFi.class);
        if (priorityQueue2 != null) {
            Iterator it3 = priorityQueue2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                AbstractC1120020fFg abstractC1120020fFg4 = (AbstractC1120020fFg) next2;
                if (abstractC1120020fFg4.getClass().getSimpleName().equals(abstractC1120020fFg.getClass().getSimpleName()) && abstractC1120020fFg4.LIZIZ() == abstractC1120020fFg.LIZIZ()) {
                    obj = next2;
                    break;
                }
            }
            AbstractC1120020fFg abstractC1120020fFg5 = (AbstractC1120020fFg) obj;
            if (abstractC1120020fFg5 != null) {
                abstractC1120020fFg5.LIZLLL();
                PriorityQueue priorityQueue3 = (PriorityQueue) this.LIZ.gg0(C1120040fFi.class);
                if (priorityQueue3 != null) {
                    priorityQueue3.remove(abstractC1120020fFg5);
                }
            }
        }
    }

    @Override // X.C0UKU
    public final boolean LIZ(MotionEvent motionEvent, C0UKP c0ukp, View view) {
        boolean z;
        MotionEvent motionEventObtain = motionEvent;
        if (LiveBroadcastCpuOptSetting.enableGestureDispatchOpt()) {
            if (C500260Jjc.LJJJI((Boolean) this.LIZ.gg0(C781120UkY.class))) {
                motionEventObtain = MotionEvent.obtain(motionEventObtain.getDownTime(), SystemClock.uptimeMillis(), 3, motionEventObtain.getX(), motionEventObtain.getY(), motionEventObtain.getMetaState());
                z = true;
            } else {
                z = false;
            }
            try {
                ArrayList arrayList = (ArrayList) this.LIZ.gg0(C755740Tki.class);
                if (arrayList != null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (((AbstractC1120020fFg) it2.next()).LJ(motionEventObtain, c0ukp, view)) {
                            if (z) {
                                motionEventObtain.recycle();
                            }
                            return true;
                        }
                    }
                }
                if (z) {
                    motionEventObtain.recycle();
                }
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (z) {
                    motionEventObtain.recycle();
                }
                throw th;
            }
        }
        if (C500260Jjc.LJJJI((Boolean) this.LIZ.gg0(C781120UkY.class))) {
            motionEventObtain = MotionEvent.obtain(motionEventObtain.getDownTime(), SystemClock.uptimeMillis(), 3, motionEventObtain.getX(), motionEventObtain.getY(), motionEventObtain.getMetaState());
        }
        PriorityQueue priorityQueue = (PriorityQueue) this.LIZ.gg0(C1120040fFi.class);
        if (priorityQueue != null) {
            PriorityQueue priorityQueue2 = new PriorityQueue(10, new Comparator() { // from class: X.0fFf
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Intrinsics.LJI(((AbstractC1120020fFg) obj).LIZIZ(), ((AbstractC1120020fFg) obj2).LIZIZ());
                }
            });
            priorityQueue2.addAll(priorityQueue);
            while (!priorityQueue2.isEmpty()) {
                if (((AbstractC1120020fFg) priorityQueue2.poll()).LJ(motionEventObtain, c0ukp, view)) {
                    return true;
                }
            }
        }
        return false;
    }
}
