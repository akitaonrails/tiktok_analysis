package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.1Bec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210041Bec {
    public static final List<String> LJ = Collections.singletonList("AppLogCache");
    public final LinkedList<AbstractC2209931BeR> LIZ = new LinkedList<>();
    public final LinkedList<String> LIZIZ = new LinkedList<>();
    public volatile int LIZJ = LSPassThroughRecordSizeConfig.DEFAULT;
    public final C2209901BeO LIZLLL;

    public C2210041Bec(C2209901BeO c2209901BeO) {
        this.LIZLLL = c2209901BeO;
    }

    public final void LIZ(AbstractC2209931BeR abstractC2209931BeR) {
        AbstractC2209931BeR abstractC2209931BeRPoll;
        synchronized (this.LIZ) {
            try {
                if (this.LIZ.size() > this.LIZJ && (abstractC2209931BeRPoll = this.LIZ.poll()) != null) {
                    if (abstractC2209931BeRPoll.LLJJIJIIJIL > 0) {
                        C2210101Bei.LIZIZ(this.LIZLLL.LJJJJLI, EnumC21646419na.CACHE_DROP_BEFORE_HANDLE, abstractC2209931BeR);
                    }
                    this.LIZLLL.LJJJJLI.LIZIZ(EnumC2210021Bea.CACHE_DROP_EVENT_COUNT, 1);
                    String string = abstractC2209931BeRPoll.toString();
                    this.LIZLLL.LJJJJLI.LJI("cache drop event", new Throwable(string), false);
                    this.LIZLLL.LJJZZI.LJ(0, LJ, "AppLogCache overflow remove data: {}", abstractC2209931BeRPoll);
                    C2210331Bf5 c2210331Bf5 = C2210331Bf5.LJ;
                    if (c2210331Bf5.LIZ) {
                        c2210331Bf5.LIZJ(EnumC2210541BfQ.DataCollection, EnumC2210371Bf9.CacheOverflow, EnumC2210591BfV.Fatal, string, null);
                    }
                }
                this.LIZ.add(abstractC2209931BeR);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final int LIZIZ(ArrayList<AbstractC2209931BeR> arrayList) {
        int size;
        synchronized (this.LIZ) {
            try {
                size = this.LIZ.size();
                arrayList.addAll(this.LIZ);
                for (AbstractC2209931BeR abstractC2209931BeR : this.LIZ) {
                    if (abstractC2209931BeR.LLJJIJIIJIL > 0) {
                        C2210101Bei.LIZIZ(this.LIZLLL.LJJJJLI, EnumC21646419na.DATA_LIST_ADDED, abstractC2209931BeR);
                    }
                }
                this.LIZ.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return size;
    }
}
