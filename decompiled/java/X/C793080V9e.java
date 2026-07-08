package X;

import Y.AComparatorS32S0000000_13;
import android.os.Looper;
import android.os.Process;
import android.util.Pair;
import com.bytedance.apm6.cpu.ApmCpuManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0V9e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793080V9e extends AbstractC793120V9i {
    public final List<Double> LIZIZ;
    public final List<C792840V8g> LIZJ;
    public final List<C792840V8g> LIZLLL;
    public final C793070V9d LJ;
    public C0V9K LJFF;
    public long LJI;
    public boolean LJII;

    public final void LJFF() {
        BufferedReader bufferedReader;
        boolean zIsEmpty = ((CopyOnWriteArrayList) this.LIZJ).isEmpty();
        int i = 41;
        int i2 = LSPassThroughRecordSizeConfig.DEFAULT;
        BufferedReader bufferedReader2 = null;
        if (zIsEmpty) {
            int iMyPid = Process.myPid();
            List<C792840V8g> list = this.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/proc/");
            sbLIZ.append(iMyPid);
            sbLIZ.append("/task/");
            File[] fileArrListFiles = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)).listFiles();
            long jLIZ = C2105308Mp.LIZ();
            int length = fileArrListFiles.length;
            int i3 = 0;
            while (i3 < length) {
                try {
                    try {
                        String path = fileArrListFiles[i3].getPath();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(path);
                        sbLIZ2.append("/stat");
                        bufferedReader = new BufferedReader(new InputStreamReader(new C0VSP(C2188811AlT.LIZIZ(sbLIZ2))), i2);
                        try {
                            String line = bufferedReader.readLine();
                            int iLastIndexOf = line.lastIndexOf(i);
                            String strSubstring = line.substring(0, iLastIndexOf);
                            String strSubstring2 = line.substring(iLastIndexOf + 4);
                            int iIndexOf = strSubstring.indexOf(40);
                            int iIntValue = Integer.valueOf(strSubstring.substring(0, iIndexOf - 1)).intValue();
                            String strSubstring3 = strSubstring.substring(iIndexOf + 1);
                            String[] strArrSplit = strSubstring2.split(" ");
                            long j = Long.parseLong(strArrSplit[10]) + Long.parseLong(strArrSplit[11]);
                            if (iIntValue != 0 && !strSubstring3.isEmpty() && j != 0 && !C786410Ut5.u3().getName().contains(strSubstring3)) {
                                C792840V8g c792840V8g = new C792840V8g();
                                c792840V8g.LIZIZ = strSubstring3;
                                c792840V8g.LIZ = iIntValue;
                                c792840V8g.LIZJ = j;
                                c792840V8g.LJI = jLIZ;
                                c792840V8g.LJII = Integer.parseInt(strArrSplit[14]);
                                ((CopyOnWriteArrayList) list).add(c792840V8g);
                            }
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                bufferedReader = bufferedReader2;
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                C1971107np.LIZ(bufferedReader2);
                                throw th2;
                            }
                        }
                    } catch (FileNotFoundException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1971107np.LIZ(bufferedReader2);
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                C1971107np.LIZ(bufferedReader);
                bufferedReader2 = bufferedReader;
                i3++;
                i = 41;
                i2 = LSPassThroughRecordSizeConfig.DEFAULT;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("over process threshold, first collect thread info, list size: ");
            sbLIZ3.append(((CopyOnWriteArrayList) this.LIZJ).size());
            LJ(C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        int iMyPid2 = Process.myPid();
        List<C792840V8g> list2 = this.LIZJ;
        double d = this.LJFF.LJ;
        LinkedList linkedList = new LinkedList();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("/proc/");
        sbLIZ4.append(iMyPid2);
        sbLIZ4.append("/task/");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("size: ");
        CopyOnWriteArrayList<C792840V8g> copyOnWriteArrayList = (CopyOnWriteArrayList) list2;
        sbLIZ5.append(copyOnWriteArrayList.size());
        C792910V8n.LIZLLL("APM-CPU", C2188811AlT.LIZIZ(sbLIZ5));
        long jLIZ2 = C2105308Mp.LIZ();
        for (C792840V8g c792840V8g2 : copyOnWriteArrayList) {
            if (c792840V8g2 == null) {
                C2260008tK.LIZ(bufferedReader2);
            } else {
                try {
                    try {
                        try {
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append(strLIZIZ);
                            try {
                                sbLIZ6.append(c792840V8g2.LIZ);
                                sbLIZ6.append("/stat");
                                BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(new C0VSP(C2188811AlT.LIZIZ(sbLIZ6))), LSPassThroughRecordSizeConfig.DEFAULT);
                                try {
                                    String line2 = bufferedReader3.readLine();
                                    String[] strArrSplit2 = line2.substring(line2.lastIndexOf(41) + 4).split(" ");
                                    long j2 = Long.parseLong(strArrSplit2[10]) + Long.parseLong(strArrSplit2[11]);
                                    try {
                                        try {
                                            float f = (j2 - c792840V8g2.LIZJ) / (jLIZ2 - c792840V8g2.LJI);
                                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                            sbLIZ7.append(c792840V8g2.LIZIZ);
                                            sbLIZ7.append(" judge: ");
                                            sbLIZ7.append(j2);
                                            sbLIZ7.append(" ");
                                            sbLIZ7.append(c792840V8g2.LIZJ);
                                            sbLIZ7.append(" ");
                                            sbLIZ7.append(f);
                                            sbLIZ7.append(" ");
                                            sbLIZ7.append(d);
                                            C792910V8n.LIZLLL("APM-CPU", C2188811AlT.LIZIZ(sbLIZ7));
                                            double d2 = f;
                                            if (d2 >= d) {
                                                c792840V8g2.LIZLLL = d2;
                                                c792840V8g2.LJII = Integer.parseInt(strArrSplit2[18]);
                                            } else {
                                                linkedList.add(c792840V8g2);
                                            }
                                            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                            sbLIZ8.append("after item: ");
                                            sbLIZ8.append(c792840V8g2);
                                            C792910V8n.LIZLLL("APM-CPU", C2188811AlT.LIZIZ(sbLIZ8));
                                            C2260008tK.LIZ(bufferedReader3);
                                            bufferedReader2 = bufferedReader3;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            bufferedReader2 = bufferedReader3;
                                            try {
                                                TryCatchGuardChecker.doCheck(th);
                                                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                                sbLIZ9.append("error: ");
                                                sbLIZ9.append(th.getLocalizedMessage());
                                                C792910V8n.LIZLLL("APM-CPU", C2188811AlT.LIZIZ(sbLIZ9));
                                                C2260008tK.LIZ(bufferedReader2);
                                            } catch (Throwable th5) {
                                                TryCatchGuardChecker.doCheck(th5);
                                                C2260008tK.LIZ(bufferedReader2);
                                                throw th5;
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    try {
                                        linkedList.add(c792840V8g2);
                                    } catch (Throwable th9) {
                                        th = th9;
                                        TryCatchGuardChecker.doCheck(th);
                                        StringBuilder sbLIZ92 = C2188811AlT.LIZ();
                                        sbLIZ92.append("error: ");
                                        sbLIZ92.append(th.getLocalizedMessage());
                                        C792910V8n.LIZLLL("APM-CPU", C2188811AlT.LIZIZ(sbLIZ92));
                                        C2260008tK.LIZ(bufferedReader2);
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                }
                                C2260008tK.LIZ(bufferedReader2);
                            }
                        } catch (Throwable th11) {
                            th = th11;
                        }
                    } catch (Throwable th12) {
                        th = th12;
                    }
                } catch (Throwable th13) {
                    th = th13;
                }
            }
        }
        copyOnWriteArrayList.removeAll(linkedList);
        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
        sbLIZ10.append("after size: ");
        sbLIZ10.append(copyOnWriteArrayList.size());
        C792910V8n.LIZLLL("APM-CPU", C2188811AlT.LIZIZ(sbLIZ10));
        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
        sbLIZ11.append("over process threshold, second collect thread info, list size after filter is: ");
        sbLIZ11.append(((CopyOnWriteArrayList) this.LIZJ).size());
        LJ(C2188811AlT.LIZIZ(sbLIZ11));
        if (((CopyOnWriteArrayList) this.LIZJ).isEmpty()) {
            return;
        }
        if (((CopyOnWriteArrayList) this.LIZJ).size() > 10) {
            ((CopyOnWriteArrayList) this.LIZJ).clear();
            return;
        }
        if (C0V9Y.LIZ.LIZ()) {
            ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
            int iActiveCount = threadGroup.activeCount();
            int i4 = iActiveCount + (iActiveCount / 2);
            Thread[] threadArr = new Thread[i4];
            threadGroup.enumerate(threadArr);
            StringBuilder sb = new StringBuilder();
            for (int i5 = 0; i5 < i4; i5++) {
                Thread thread = threadArr[i5];
                if (thread == null) {
                    break;
                }
                if (thread != C786410Ut5.u3()) {
                    ListIterator listIterator = ((CopyOnWriteArrayList) this.LIZJ).listIterator();
                    while (listIterator.hasNext()) {
                        C792840V8g c792840V8g3 = (C792840V8g) listIterator.next();
                        if (c792840V8g3 != null && (c792840V8g3.LIZIZ.equals(thread.getName()) || (thread.getName().length() > 15 && c792840V8g3.LIZIZ.equals(thread.getName().substring(0, 15))))) {
                            if (c792840V8g3.LIZ != Process.myPid() || this.LJFF.LIZIZ) {
                                int i6 = 0;
                                for (StackTraceElement stackTraceElement : ThreadMethodProxy.getStackTrace(thread)) {
                                    i6++;
                                    sb.append("\tat ");
                                    sb.append(stackTraceElement.getClassName());
                                    sb.append(e3.d);
                                    sb.append(stackTraceElement.getMethodName());
                                    sb.append(e3.h);
                                    sb.append(stackTraceElement.getFileName());
                                    sb.append(":");
                                    sb.append(stackTraceElement.getLineNumber());
                                    sb.append(")\n");
                                    if (i6 > 40) {
                                        break;
                                    }
                                }
                                c792840V8g3.LJFF = sb.toString();
                                c792840V8g3.LJ = c792840V8g3.LIZLLL / this.LJFF.LJ;
                                ((CopyOnWriteArrayList) this.LIZLLL).add(c792840V8g3);
                                sb.setLength(0);
                            }
                        }
                    }
                }
            }
        }
        Collections.sort(this.LIZJ, new AComparatorS32S0000000_13(23));
        LinkedList linkedList2 = new LinkedList();
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZJ).iterator();
        while (it2.hasNext()) {
            linkedList2.add(new C0V47(((C792840V8g) it2.next()).LIZLLL));
        }
        C0V6I c0v6i = C0V6H.LIZ;
        synchronized (c0v6i) {
            c0v6i.LIZLLL = new Pair<>(Long.valueOf(System.currentTimeMillis()), linkedList2);
        }
        ((CopyOnWriteArrayList) this.LIZJ).clear();
    }

    public final void LJI() {
        ((CopyOnWriteArrayList) this.LIZIZ).clear();
        ((CopyOnWriteArrayList) this.LIZLLL).clear();
        ((CopyOnWriteArrayList) this.LIZJ).clear();
        this.LJI = 0L;
        C792490V6x.LIZ(EnumC792970V8t.CPU).LIZIZ(this.LJ);
    }

    @Override // X.AbstractC793120V9i, X.InterfaceC793220V9s
    public final void LIZLLL() {
        super.LIZLLL();
        LJI();
    }

    @Override // X.InterfaceC793220V9s
    public final EnumC793190V9p LIZIZ() {
        return EnumC793190V9p.THREAD_DETECT;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0V9d] */
    public C793080V9e(C793100V9g c793100V9g) {
        super(c793100V9g);
        this.LIZIZ = new CopyOnWriteArrayList();
        this.LIZLLL = new CopyOnWriteArrayList();
        this.LIZJ = new CopyOnWriteArrayList();
        this.LJ = new AbstractRunnableC792500V6y() { // from class: X.0V9d
            public final void LIZ() {
                C793080V9e c793080V9e = this.LLILZ;
                c793080V9e.getClass();
                String cpuSceneString = ApmCpuManager.getInstance().getCpuSceneString();
                boolean z = !cpuSceneString.equals(C0V9N.LIZ);
                C0V9N.LIZ = cpuSceneString;
                if (z) {
                    c793080V9e.LJI();
                    c793080V9e.LIZ.LIZIZ();
                    return;
                }
                double dLIZ = C0V9Q.LIZ();
                ((CopyOnWriteArrayList) c793080V9e.LIZIZ).add(Double.valueOf(dLIZ));
                boolean zLIZ = C0V9N.LIZ(c793080V9e.LJFF, dLIZ, c793080V9e.LJII);
                if (System.currentTimeMillis() - c793080V9e.LJI < 30000) {
                    if (zLIZ) {
                        c793080V9e.LJFF();
                        return;
                    } else {
                        c793080V9e.LJ("not over process threshold");
                        ((CopyOnWriteArrayList) c793080V9e.LIZJ).clear();
                        return;
                    }
                }
                if (((CopyOnWriteArrayList) c793080V9e.LIZIZ).isEmpty() || ((CopyOnWriteArrayList) c793080V9e.LIZLLL).isEmpty()) {
                    c793080V9e.LJ("finish collect, but no exception thread is found");
                    c793080V9e.LJI();
                    c793080V9e.LIZ.LIZIZ();
                    return;
                }
                Iterator it2 = ((CopyOnWriteArrayList) c793080V9e.LIZIZ).iterator();
                double d = 0.0d;
                double d2 = 0.0d;
                while (it2.hasNext()) {
                    double dDoubleValue = ((Double) it2.next()).doubleValue();
                    if (d2 < dDoubleValue) {
                        d2 = dDoubleValue;
                    }
                    d += dDoubleValue;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("report exception data, exception thread size is: ");
                sbLIZ.append(((CopyOnWriteArrayList) c793080V9e.LIZLLL).size());
                c793080V9e.LJ(C2188811AlT.LIZIZ(sbLIZ));
                double size = d / ((double) ((CopyOnWriteArrayList) c793080V9e.LIZIZ).size());
                LinkedList linkedList = new LinkedList();
                String[] strArrSplit = C0V9N.LIZ.split("#");
                int i = 0;
                if (c793080V9e.LJII) {
                    if (!((HashMap) c793080V9e.LJFF.LJI).isEmpty()) {
                        int length = strArrSplit.length;
                        while (i < length) {
                            String str = strArrSplit[i];
                            if (((HashMap) c793080V9e.LJFF.LJI).containsKey(str)) {
                                double dDoubleValue2 = ((Double) ((HashMap) c793080V9e.LJFF.LJI).get(str)).doubleValue();
                                if (dDoubleValue2 >= 0.0d && size > dDoubleValue2) {
                                    linkedList.add(str);
                                }
                            }
                            i++;
                        }
                    }
                } else if (!((HashMap) c793080V9e.LJFF.LJII).isEmpty()) {
                    int length2 = strArrSplit.length;
                    while (i < length2) {
                        String str2 = strArrSplit[i];
                        if (((HashMap) c793080V9e.LJFF.LJII).containsKey(str2)) {
                            double dDoubleValue3 = ((Double) ((HashMap) c793080V9e.LJFF.LJII).get(str2)).doubleValue();
                            if (dDoubleValue3 >= 0.0d && size > dDoubleValue3) {
                                linkedList.add(str2);
                            }
                        }
                        i++;
                    }
                }
                C0V9O c0v9o = C0V9Y.LIZ;
                if (c0v9o.LIZ() && (!linkedList.isEmpty() || (!c793080V9e.LJII ? size > c793080V9e.LJFF.LIZLLL : size > c793080V9e.LJFF.LIZJ))) {
                    c0v9o.LJ = System.currentTimeMillis();
                    String strLIZ = "";
                    if (!linkedList.isEmpty()) {
                        strLIZ = C08GN.LIZ(linkedList.toArray());
                        if (c793080V9e.LJII) {
                            if (size > c793080V9e.LJFF.LIZJ) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(strLIZ);
                                sbLIZ2.append("#");
                                sbLIZ2.append("apm_max_background");
                                strLIZ = C2188811AlT.LIZIZ(sbLIZ2);
                            }
                        } else if (size > c793080V9e.LJFF.LIZLLL) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(strLIZ);
                            sbLIZ3.append("#");
                            sbLIZ3.append("apm_max_foreground");
                            strLIZ = C2188811AlT.LIZIZ(sbLIZ3);
                        }
                    } else if (c793080V9e.LJII) {
                        if (size > c793080V9e.LJFF.LIZJ) {
                            strLIZ = "apm_max_background";
                        }
                    } else if (size > c793080V9e.LJFF.LIZLLL) {
                        strLIZ = "apm_max_foreground";
                    }
                    C0VBB.LIZ(new C0V6S(size, d2, c793080V9e.LIZLLL, strLIZ, c793080V9e.LJII) { // from class: X.0V8d
                        public final double LIZIZ;
                        public final double LIZJ;
                        public final String LIZLLL;
                        public final boolean LJ;
                        public final List<C792840V8g> LJFF;

                        @Override // X.C0VB5
                        public final boolean LIZIZ() {
                            return false;
                        }

                        @Override // X.C0VB5
                        public final String getLogType() {
                            return "cpu_exception_trace";
                        }

                        /* JADX WARN: Removed duplicated region for block: B:13:0x0063 A[Catch: all -> 0x0104, TRY_ENTER, TryCatch #0 {all -> 0x0104, blocks: (B:3:0x0007, B:7:0x003d, B:9:0x0048, B:13:0x0063, B:17:0x0076, B:18:0x00a2, B:20:0x00a8, B:22:0x00b0, B:24:0x00b8, B:25:0x00fd, B:14:0x006b, B:16:0x0073, B:8:0x0043), top: B:34:0x0007 }] */
                        @Override // X.C0VB5
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final org.json.JSONObject LIZ() {
                            /*
                                Method dump skipped, instruction units count: 307
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C792810V8d.LIZ():org.json.JSONObject");
                        }

                        @Override // X.C0VB5
                        public final boolean isValid() {
                            List<C792840V8g> list = this.LJFF;
                            return list != null && !((ArrayList) list).isEmpty() && this.LIZIZ > 0.0d && this.LIZJ > 0.0d;
                        }

                        {
                            this.LIZIZ = size;
                            this.LIZJ = d2;
                            this.LIZLLL = strLIZ;
                            this.LJ = z;
                            this.LJFF = new ArrayList(list);
                        }
                    });
                }
                c793080V9e.LJI();
                C793100V9g c793100V9g2 = c793080V9e.LIZ;
                synchronized (c793100V9g2) {
                    c793100V9g2.LIZ(c793100V9g2.LJIIJ);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("NormalThreadDetectState@57ba.<init>$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("NormalThreadDetectState@57ba.<init>$1");
            }

            {
                super(0L, 1000L);
            }
        };
    }

    @Override // X.AbstractC793120V9i, X.InterfaceC793220V9s
    public final void LIZJ(boolean z) {
        super.LIZJ(z);
        LJI();
        C793100V9g c793100V9g = this.LIZ;
        synchronized (c793100V9g) {
            c793100V9g.LIZ(c793100V9g.LJIIJJI);
        }
    }

    @Override // X.AbstractC793120V9i, X.InterfaceC793220V9s
    public final void LIZ(C0V9K c0v9k, boolean z) {
        super.LIZ(c0v9k, z);
        this.LJFF = c0v9k;
        this.LJI = System.currentTimeMillis();
        this.LJII = z;
        C792490V6x.LIZ(EnumC792970V8t.CPU).LIZJ(this.LJ);
    }
}
