package X;

import Y.ARunnableS38S0201000_34;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.AwS404S0200000_3;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS578S0100000_34;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AqE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class RunnableC2191761AqE implements Runnable {
    public final EnumC2191941AqW LL;
    public final C2191741AqC LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS578S0100000_34(this, 220));
    public long LLILZ;
    public final C2192051Aqh LLILZIL;
    public List<? extends InterfaceC2191781AqG> LLILZLL;
    public final C01GW LLIZ;

    public final void LIZ() throws Throwable {
        this.LLILLJJLI.LIZIZ.LIZJ.LIZ("Worker:run", new AwS570S0100000_26(this, 1636));
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (!this.LLILLJJLI.LIZIZ.LIZIZ.LJFF.isNetworkAvailable()) {
            this.LLILLJJLI.LIZIZ.LIZJ.LIZ("Worker:run", new AwS570S0100000_26(this, 1637));
            return;
        }
        C2190751Aob c2190751Aob = new C2190751Aob(new InterfaceC2190741Aoa<JSONObject>() { // from class: X.1AqD
            @Override // X.InterfaceC2190741Aoa
            public final JSONObject load() {
                String headerJson = this.LIZ.LLILLJJLI.LIZIZ.LIZIZ.LJFF.getHeaderJson();
                if (headerJson != null) {
                    if (!(headerJson.length() == 0)) {
                        try {
                            return new JSONObject(headerJson);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            if (this.LIZ.LLILLJJLI.LIZIZ.LIZIZ.LJFF.isMonitorEnabled()) {
                                this.LIZ.LLILLJJLI.LIZIZ.LIZIZ.LJFF.monitorError("priority parse header error", e.toString());
                            }
                            this.LIZ.LLILLJJLI.LIZIZ.LIZJ.LIZIZ("Worker:run", e, new AwS560S0100000_16(this, 1044));
                            return null;
                        }
                    }
                }
                this.LIZ.LLILLJJLI.LIZIZ.LIZJ.LIZ("Worker:run", new AwS560S0100000_16(this, 1043));
                return null;
            }
        });
        List<? extends InterfaceC2191781AqG> list = this.LLILZLL;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC2191781AqG interfaceC2191781AqG : list) {
            if (interfaceC2191781AqG.LIZIZ(jCurrentTimeMillis)) {
                arrayList.add(interfaceC2191781AqG);
            }
        }
        this.LLILLJJLI.LIZIZ.LIZJ.LIZ("Worker:run", new AwS427S0200000_26(this, (RunnableC2191761AqE) arrayList, (List<? extends InterfaceC2191781AqG>) 108));
        C23250099c.LJ(C23271099x.INSTANCE, new C1705760uUQ(jCurrentTimeMillis, c2190751Aob, this, arrayList, null));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("Worker@ead6.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Worker@ead6.run");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Worker-");
        sbLIZ.append(this.LL.name());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZIZ(List<C2191701Aq8> list) {
        this.LLILLJJLI.LIZIZ.LIZJ.LIZ("Worker:setGroups", new AwS404S0200000_3(this, (RunnableC2191761AqE) list, (List<C2191701Aq8>) 74));
        Iterator<? extends InterfaceC2191781AqG> it2 = this.LLILZLL.iterator();
        while (it2.hasNext()) {
            it2.next().destroy();
        }
        this.LLILLJJLI.LIZIZ.LIZJ.LIZ("Worker:setGroups", new AwS547S0100000_3(this, 188));
        this.LLILZLL = list;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it3 = ((ArrayList) list).iterator();
        while (it3.hasNext()) {
            arrayList.add(Long.valueOf(((InterfaceC2191781AqG) it3.next()).LIZJ()));
        }
        long jLJI = C2191771AqF.LJI(C13LP.LLIIII(arrayList));
        this.LLILZ = jLJI;
        this.LLILZIL.LIZ(jLJI);
        if (this.LLILZLL.isEmpty()) {
            this.LLILLJJLI.LIZIZ.LIZJ.LIZIZ("Worker:startWorkerTimer", null, new AwS547S0100000_3(this, 199));
        }
        Set<Integer> setLIZLLL = this.LLILLJJLI.LIZ.LIZ(this.LL).LIZLLL();
        List<? extends InterfaceC2191781AqG> list2 = this.LLILZLL;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<? extends InterfaceC2191781AqG> it4 = list2.iterator();
        while (it4.hasNext()) {
            arrayList2.add(Integer.valueOf(it4.next().C2()));
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : setLIZLLL) {
            if (!setLLIIJI.contains(Integer.valueOf(((Number) obj).intValue()))) {
                arrayList3.add(obj);
            }
        }
        Set setLLIIJI2 = C13LP.LLIIJI(arrayList3);
        if (setLLIIJI2.isEmpty()) {
            this.LLILLJJLI.LIZIZ.LIZJ.LIZ("Worker:handleMissedGroups", new AwS547S0100000_3(this, 193));
        } else {
            this.LLILLJJLI.LIZIZ.LIZJ.LIZ("Worker:handleMissedGroups", new C5182020e(setLLIIJI2, (Set<Integer>) 651));
            int size = setLLIIJI2.size();
            if (size > 3) {
                size = 3;
            }
            ExecutorService executorServiceD4 = C786410Ut5.d4(size);
            Iterator it5 = setLLIIJI2.iterator();
            while (it5.hasNext()) {
                executorServiceD4.submit(new ARunnableS38S0201000_34(this, this.LLILLJJLI.LIZ.LIZ(this.LL), ((Number) it5.next()).intValue(), 4));
            }
        }
        this.LLILLJJLI.LIZIZ.LIZJ.LIZ("Worker:setGroups", new AwS547S0100000_3(this, 189));
    }

    public RunnableC2191761AqE(EnumC2191941AqW enumC2191941AqW, C2191741AqC c2191741AqC, List<C2191701Aq8> list) {
        this.LL = enumC2191941AqW;
        this.LLILLJJLI = c2191741AqC;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((C2191701Aq8) it2.next()).LIZIZ.LIZJ));
        }
        this.LLILZ = C2191771AqF.LJI(C13LP.LLIIII(arrayList));
        this.LLILZIL = new C2192051Aqh((ScheduledExecutorService) this.LLILLL.getValue(), this, this.LLILZ);
        this.LLILZLL = C13BV.INSTANCE;
        this.LLIZ = C452501pT.LIZIZ(new AwS578S0100000_34(this, 219));
        LIZIZ(list);
    }
}
