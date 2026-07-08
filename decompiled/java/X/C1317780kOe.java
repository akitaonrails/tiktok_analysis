package X;

import Y.ACallableS425S0100000_20;
import Y.ARunnableS30S0101000_19;
import Y.ARunnableS53S0300000_20;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sdui.serializedData.common.operations.Glyph;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0kOe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1317780kOe {
    public static final BPEAHandler LJ;
    public final C0VSJ LIZ;
    public LinkedList<File> LIZIZ;
    public Map<Integer, C1317800kOg> LIZJ;
    public FutureTask<Pair<Map<Integer, C1317800kOg>, LinkedList<File>>> LIZLLL;

    static {
        HandlerThread handlerThread = new HandlerThread("SDUITextIOThread");
        handlerThread.start();
        LJ = new BPEAHandler(C786410Ut5.W2(handlerThread));
    }

    public final void LIZIZ() {
        Pair<Map<Integer, C1317800kOg>, LinkedList<File>> pair;
        FutureTask<Pair<Map<Integer, C1317800kOg>, LinkedList<File>>> futureTask = this.LIZLLL;
        if (futureTask == null) {
            return;
        }
        try {
            pair = futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            C1317870kOn.LIZIZ();
            pair = null;
        }
        this.LIZLLL = null;
        if (pair != null) {
            this.LIZJ = (Map) pair.first;
            this.LIZIZ = (LinkedList) pair.second;
        } else {
            this.LIZJ = new HashMap();
            this.LIZIZ = new LinkedList<>();
        }
    }

    public C1317780kOe(Context context) {
        C0VSJ c0vsj = new C0VSJ(C786410Ut5.x2(context), "font");
        this.LIZ = c0vsj;
        FutureTask<Pair<Map<Integer, C1317800kOg>, LinkedList<File>>> futureTask = new FutureTask<>(new ACallableS425S0100000_20(c0vsj, 14));
        this.LIZLLL = futureTask;
        LIZJ(futureTask);
    }

    public static void LIZJ(Runnable runnable) {
        Looper looperMyLooper = Looper.myLooper();
        BPEAHandler bPEAHandler = LJ;
        if (looperMyLooper == bPEAHandler.getLooper()) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII(bPEAHandler, runnable);
        }
    }

    public static void LIZ(String str, List list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("delete files, ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (C1317940kOu.LIZ.booleanValue()) {
            int i = C1317360kNy.LIZ;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            File file = (File) it2.next();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("\t");
            sbLIZ2.append(file.getName());
            C2188811AlT.LIZIZ(sbLIZ2);
            if (C1317940kOu.LIZ.booleanValue()) {
                int i2 = C1317360kNy.LIZ;
            }
            file.delete();
        }
    }

    public final void LIZLLL(C1317800kOg c1317800kOg, AbstractC1322720kWc abstractC1322720kWc) {
        File c0vsj;
        LIZIZ();
        int i = c1317800kOg.LIZJ;
        Iterator<File> it2 = this.LIZIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            c0vsj = it2.next();
            String name = c0vsj.getName();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(e3.d);
            sbLIZ.append(i);
            if (name.endsWith(C2188811AlT.LIZIZ(sbLIZ))) {
                if (c0vsj.length() >= 10240) {
                    break;
                }
            }
        }
        C0VSJ c0vsj2 = this.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(System.currentTimeMillis());
        sbLIZ2.append(e3.d);
        sbLIZ2.append(i);
        c0vsj = new C0VSJ(c0vsj2, C2188811AlT.LIZIZ(sbLIZ2));
        this.LIZIZ.addFirst(c0vsj);
        LIZJ(new ARunnableS53S0300000_20(c0vsj, c1317800kOg, abstractC1322720kWc, 70));
    }

    public final void LJ(int i, int i2, int i3, AbstractC1322720kWc abstractC1322720kWc) {
        if (abstractC1322720kWc == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateFont hash:");
        sbLIZ.append(i);
        sbLIZ.append(" imageMaxZero:");
        sbLIZ.append(i2);
        sbLIZ.append(" imageMinFF:");
        sbLIZ.append(i3);
        C2188811AlT.LIZIZ(sbLIZ);
        if (C1317940kOu.LIZ.booleanValue()) {
            int i4 = C1317360kNy.LIZ;
        }
        LIZIZ();
        C1317800kOg c1317800kOg = this.LIZJ.get(Integer.valueOf(i));
        if (c1317800kOg != null) {
            if (c1317800kOg.LIZ != i2 || c1317800kOg.LIZIZ != i3 || c1317800kOg.LIZJ != i) {
                LIZIZ();
                this.LIZJ.remove(Integer.valueOf(i));
                ArrayList arrayList = new ArrayList();
                ListIterator<File> listIterator = this.LIZIZ.listIterator();
                while (listIterator.hasNext()) {
                    File next = listIterator.next();
                    String name = next.getName();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(e3.d);
                    sbLIZ2.append(i);
                    if (name.endsWith(C2188811AlT.LIZIZ(sbLIZ2))) {
                        arrayList.add(next);
                        listIterator.remove();
                    }
                }
                LIZJ(new ARunnableS30S0101000_19(i, arrayList, 14));
                c1317800kOg = new C1317800kOg(i2, i3, i);
                this.LIZJ.put(Integer.valueOf(i), c1317800kOg);
            }
        } else {
            c1317800kOg = new C1317800kOg(i2, i3, i);
            this.LIZJ.put(Integer.valueOf(i), c1317800kOg);
        }
        try {
            Iterator<Glyph> it2 = C1317750kOb.LIZLLL(abstractC1322720kWc.newCodedInput()).LIZ.iterator();
            while (it2.hasNext()) {
                c1317800kOg.LIZ(it2.next());
            }
            LIZLLL(c1317800kOg, abstractC1322720kWc);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
