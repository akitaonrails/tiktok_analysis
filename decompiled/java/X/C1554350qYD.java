package X;

import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0qYD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1554350qYD extends C0W9W {
    public final int $t;
    public Object l0;

    public static final void run$0(C1554350qYD c1554350qYD) {
        C1C7U.LIZ("AbsInboxPageQualityTracking@91d2.startTimer$1$1");
        boolean zLJ = C0W9U.LJ(c1554350qYD.bpeaTraceContext);
        try {
            c1554350qYD.bpea_origin_timer_run$0();
            if (zLJ) {
                C0W9U.LJFF();
            }
            C1C7U.LIZIZ("AbsInboxPageQualityTracking@91d2.startTimer$1$1");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (zLJ) {
                C0W9U.LJFF();
            }
            throw th;
        }
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            default:
                super.run();
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$1() {
        Object c098200Yq;
        Map map = (Map) this.l0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            List listLLIIII = C13LP.LLIIII((Iterable) entry.getValue());
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLIIII, 10));
            Iterator it2 = listLLIIII.iterator();
            while (it2.hasNext()) {
                arrayList.add(new CheckRequestBodyModel.TargetChannel((String) it2.next()));
            }
            linkedHashMap.put(key, arrayList);
        }
        OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
        optionCheckUpdateParams.setFrom("gecko_ng_meta_cache_update");
        try {
            C1552230qUn c1552230qUnLJI = C1551960qUM.LJI(C797990VSb.LIZ.LJFF(), linkedHashMap, optionCheckUpdateParams);
            c098200Yq = c1552230qUnLJI != null ? c1552230qUnLJI.proceed(null) : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1553130qWF.LIZJ("GeckoNG", "Cache check update failed", thM5exceptionOrNullimpl);
        }
    }

    public final void bpea_origin_timer_run$0() {
        boolean zLIZ;
        try {
            AbstractC1523260pk4 abstractC1523260pk4 = (AbstractC1523260pk4) this.l0;
            if (abstractC1523260pk4.LIZLLL()) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(abstractC1523260pk4.LIZ);
                sbLIZ.append(": onLoadTimeEnd");
                C1720106oR.LJI("InboxPageQualityTracking", C2188811AlT.LIZIZ(sbLIZ));
                abstractC1523260pk4.LJIIIZ();
                abstractC1523260pk4.LJIIIIZZ(1);
                abstractC1523260pk4.LJI();
            }
        } finally {
            if (!zLIZ) {
            }
        }
    }

    public static final void run$1(C1554350qYD c1554350qYD) {
        C1C7U.LIZ("HybridSettingManagerImpl@106a.updateForDuration$1");
        boolean zLJ = C0W9U.LJ(c1554350qYD.bpeaTraceContext);
        try {
            ((C1520770pg3) c1554350qYD.l0).LIZJ(false);
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("HybridSettingManagerImpl@106a.updateForDuration$1");
    }

    public static final void run$2(C1554350qYD c1554350qYD) {
        C1C7U.LIZ("CachedPackagesManager@ea5a.startPollUpdates$$inlined$scheduleAtFixedRate$1");
        boolean zLJ = C0W9U.LJ(c1554350qYD.bpeaTraceContext);
        try {
            c1554350qYD.LIZ$1();
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("CachedPackagesManager@ea5a.startPollUpdates$$inlined$scheduleAtFixedRate$1");
    }

    public static final void run$3(C1554350qYD c1554350qYD) {
        C1C7U.LIZ("GeckoNG@14e0.checkGeckoSettings$$inlined$schedule$1");
        boolean zLJ = C0W9U.LJ(c1554350qYD.bpeaTraceContext);
        try {
            C1552630qVR.LIZ.getClass();
            if (!C1552630qVR.LIZLLL()) {
                ((C013C) c1554350qYD.l0).element = true;
                C1552630qVR.LIZ(C797990VSb.LIZ.LJII());
                C1552630qVR.LIZIZ.set(EnumC993310bxJ.Initialized.ordinal());
            }
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("GeckoNG@14e0.checkGeckoSettings$$inlined$schedule$1");
    }

    public C1554350qYD(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
