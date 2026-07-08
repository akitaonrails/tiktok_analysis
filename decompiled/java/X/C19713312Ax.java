package X;

import android.app.Activity;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.12Ax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19713312Ax {
    public static final LinkedList<Activity> LJFF = new LinkedList<>();
    public boolean LIZIZ;
    public boolean LJ;
    public final List<InterfaceC19713512Az> LIZ = new CopyOnWriteArrayList();
    public int LIZJ = 0;
    public int LIZLLL = 0;

    public static synchronized Activity[] LIZ() {
        LinkedList<Activity> linkedList;
        linkedList = LJFF;
        return (Activity[]) linkedList.toArray(new Activity[linkedList.size()]);
    }

    public static Activity LIZIZ() {
        LinkedList<Activity> linkedList = LJFF;
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList.getLast();
    }

    public final boolean LIZJ() {
        return this.LIZJ <= 0;
    }

    public final void LIZLLL() {
        if (this.LIZJ > 0) {
            if (this.LJ) {
                return;
            }
            Iterator it2 = ((CopyOnWriteArrayList) this.LIZ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC19713512Az) it2.next()).onAppForeground();
            }
            this.LJ = true;
            return;
        }
        if (this.LJ) {
            C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZJ("AppMonitor", "app enter background");
            Iterator it3 = ((CopyOnWriteArrayList) this.LIZ).iterator();
            while (it3.hasNext()) {
                ((InterfaceC19713512Az) it3.next()).onAppBackground();
            }
            this.LJ = false;
        }
    }

    public final void LJ(InterfaceC19713512Az interfaceC19713512Az) {
        if (((CopyOnWriteArrayList) this.LIZ).contains(interfaceC19713512Az)) {
            return;
        }
        ((CopyOnWriteArrayList) this.LIZ).add(interfaceC19713512Az);
    }

    public final void LJFF(InterfaceC19713512Az interfaceC19713512Az) {
        if (!((CopyOnWriteArrayList) this.LIZ).contains(interfaceC19713512Az)) {
            return;
        }
        ((CopyOnWriteArrayList) this.LIZ).remove(interfaceC19713512Az);
    }
}
