package X;

import X.AbstractC1134420fcu;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveIncentiveTaskUpdateConcurrentFixSetting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fcu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1134420fcu<T, S extends AbstractC1134420fcu<T, S>> {
    public T LIZ;
    public final String LIZIZ = String.valueOf(SystemClock.elapsedRealtime());
    public EnumC1134460fcy LIZJ = EnumC1134460fcy.TASK_UNKNOWN;
    public final List<Function1<AbstractC1134420fcu<T, S>, Unit>> LIZLLL = new ArrayList();
    public final List<S> LJ;
    public AbstractC1134420fcu<T, S> LJFF;

    public synchronized void LIZIZ() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LIZLLL);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(this);
        }
    }

    @InterfaceC1294060jmO
    public abstract EnumC1134460fcy LJFF(T t);

    @InterfaceC1294060jmO
    public final void LIZ() {
        ((ArrayList) this.LIZLLL).clear();
        Iterator<S> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
    }

    public final EnumC1134460fcy LIZJ() {
        EnumC1134460fcy enumC1134460fcy = this.LIZJ;
        return enumC1134460fcy == EnumC1134460fcy.TASK_UNKNOWN ? LJFF(this.LIZ) : enumC1134460fcy;
    }

    public final void LJ() {
        List<S> list;
        List<S> list2;
        List<S> list3;
        LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("remove id=");
        sbLIZ.append(LIZLLL());
        sbLIZ.append(", parent id=");
        AbstractC1134420fcu<T, S> abstractC1134420fcu = this.LJFF;
        sbLIZ.append(abstractC1134420fcu != null ? abstractC1134420fcu.LIZLLL() : null);
        sbLIZ.append(", subTask size = ");
        AbstractC1134420fcu<T, S> abstractC1134420fcu2 = this.LJFF;
        sbLIZ.append((abstractC1134420fcu2 == null || (list3 = abstractC1134420fcu2.LJ) == null) ? null : Integer.valueOf(list3.size()));
        C20441214yg.LJIIIZ("IncentiveDebug", C2188811AlT.LIZIZ(sbLIZ));
        AbstractC1134420fcu<T, S> abstractC1134420fcu3 = this.LJFF;
        if (abstractC1134420fcu3 != null && (list2 = abstractC1134420fcu3.LJ) != null) {
            C19719512Dh.LIZ(list2).remove(this);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("after remove subTask size = ");
        AbstractC1134420fcu<T, S> abstractC1134420fcu4 = this.LJFF;
        sbLIZ2.append((abstractC1134420fcu4 == null || (list = abstractC1134420fcu4.LJ) == null) ? null : Integer.valueOf(list.size()));
        C20441214yg.LJIIIZ("IncentiveDebug", C2188811AlT.LIZIZ(sbLIZ2));
        this.LJFF = null;
    }

    public String LIZLLL() {
        return this.LIZIZ;
    }

    public AbstractC1134420fcu(T t) {
        List<S> listSynchronizedList;
        this.LIZ = t;
        if (LiveIncentiveTaskUpdateConcurrentFixSetting.INSTANCE.isEnable()) {
            listSynchronizedList = new CopyOnWriteArrayList<>();
        } else {
            listSynchronizedList = Collections.synchronizedList(new ArrayList());
        }
        this.LJ = listSynchronizedList;
    }

    public void LJI(EnumC1134460fcy enumC1134460fcy) {
        if (enumC1134460fcy == this.LIZJ) {
            return;
        }
        this.LIZJ = enumC1134460fcy;
        LIZIZ();
    }
}
