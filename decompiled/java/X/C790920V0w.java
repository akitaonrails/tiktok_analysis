package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sliver.Sliver;
import com.bytedance.sliver.SliverAllThreadSupport;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0V0w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C790920V0w {
    public final int LIZ;
    public final int LIZIZ;
    public final HashSet<Thread> LIZJ = new HashSet<>();
    public volatile long LIZLLL;
    public final int LJ;
    public final EnumC795650VJb LJFF;
    public volatile boolean LJI;

    public final synchronized void LIZIZ() {
        LIZJ();
        if (this.LIZLLL == 0) {
            return;
        }
        if (this.LJI) {
            ArrayList arrayList = new ArrayList(this.LIZJ.size());
            ArrayList arrayList2 = new ArrayList(this.LIZJ.size());
            for (Thread thread : this.LIZJ) {
                long threadPeer = Sliver.getThreadPeer(thread);
                if (threadPeer != 0) {
                    arrayList.add(Long.valueOf(threadPeer));
                    arrayList2.add(thread);
                }
            }
            long[] jArr = new long[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                jArr[i] = ((Long) ListProtector.get(arrayList, i)).longValue();
            }
            SliverAllThreadSupport.nNotifySliverGroup(this.LIZLLL, (Thread[]) arrayList2.toArray(new Thread[0]), jArr);
            this.LJI = false;
        }
    }

    public final synchronized void LIZJ() {
        if (this.LIZLLL != 0) {
            return;
        }
        this.LIZLLL = SliverAllThreadSupport.nStartSliverGroup(this.LIZIZ, this.LJ, Sliver.mode2Int(this.LJFF), this.LIZ);
    }

    public final synchronized void LIZ(String str) {
        SliverAllThreadSupport.nDumpSliverGroup(this.LIZLLL, str);
    }

    public C790920V0w(int i, int i2, int i3, EnumC795650VJb enumC795650VJb) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LJ = i3;
        this.LJFF = enumC795650VJb;
    }
}
