package X;

import Y.AComparatorS32S0000000_13;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0VBN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VBN implements C0VB7 {
    public C0VBF LIZIZ;
    public final List<String> LJFF;
    public final LinkedHashMap<C0VBU, ConcurrentLinkedQueue<C0VBX>> LIZ = new LinkedHashMap<>();
    public long LIZJ = 30000;
    public long LIZLLL = 0;
    public long LJ = 1;

    @Override // X.C0VB7
    public final String getName() {
        return "second_log_dir";
    }

    public final void LIZIZ() {
        File[] fileArrListFiles;
        C0VBP c0vbp = C793560VBa.LIZ;
        synchronized (c0vbp) {
            c0vbp.LIZJ();
            C0VSJ c0vsj = c0vbp.LIZLLL;
            if (c0vsj != null && (fileArrListFiles = c0vsj.listFiles()) != null && fileArrListFiles.length != 0) {
                for (File file : fileArrListFiles) {
                    C2404609bY.LIZ(file);
                }
                c0vbp.LJII.clear();
                c0vbp.LJ.clear();
                SharedPreferences.Editor editorEdit = c0vbp.LIZ.edit();
                editorEdit.clear();
                editorEdit.commit();
                SharedPreferences.Editor editorEdit2 = c0vbp.LIZIZ.edit();
                editorEdit2.clear();
                editorEdit2.commit();
            }
        }
        this.LIZ.clear();
        this.LJ = 1L;
        this.LIZJ = 30000L;
    }

    @Override // X.C0VB7
    public final long getSize() {
        C0VBP c0vbp = C793560VBa.LIZ;
        c0vbp.LIZJ();
        C0VSJ c0vsj = c0vbp.LIZLLL;
        File[] fileArrListFiles = c0vsj == null ? null : c0vsj.listFiles();
        long length = 0;
        if (fileArrListFiles == null) {
            return 0L;
        }
        for (File file : fileArrListFiles) {
            length += file.length();
        }
        return length;
    }

    public C0VBN() {
        ArrayList arrayList = new ArrayList();
        this.LJFF = arrayList;
        arrayList.add("/monitor/collect/batch/");
        arrayList.add("/monitor/collect/c/trace_collect");
        arrayList.add("/monitor/collect/c/exception");
    }

    public final void LIZLLL() throws Throwable {
        boolean z;
        C0VBX c0vbxPeek;
        boolean zLJI = MethodIDManager.LJI(137664);
        int i = 0;
        try {
            if (C036E.LIZ.LIZIZ()) {
                if (C792190V5t.LIZ()) {
                    C792910V8n.LIZ("APM-Slardar", "trigger send.");
                }
                if (this.LIZ.isEmpty()) {
                    z = true;
                } else {
                    C0VBV.LJ = System.currentTimeMillis();
                    C0VBV.LJFF = 0L;
                    z = true;
                    for (C0VBU c0vbu : this.LIZ.keySet()) {
                        if (C793590VBd.LJ(c0vbu.LIZ()).LJI()) {
                            this.LIZ.remove(c0vbu);
                            if (C792190V5t.LIZ()) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(c0vbu.LIZ());
                                sbLIZ.append(" in quota status when sendMemory,drop data");
                                C792910V8n.LIZLLL("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ));
                            }
                        } else if (!C793590VBd.LJ(c0vbu.LIZ()).LJFF()) {
                            ConcurrentLinkedQueue<C0VBX> concurrentLinkedQueue = this.LIZ.get(c0vbu);
                            if (concurrentLinkedQueue != null) {
                                C0VBX[] c0vbxArr = (C0VBX[]) concurrentLinkedQueue.toArray(new C0VBX[i]);
                                int length = c0vbxArr.length;
                                int i2 = 0;
                                while (true) {
                                    if (i2 < length) {
                                        c0vbxPeek = c0vbxArr[i2];
                                        if (c0vbxPeek.LIZIZ <= 0 || System.currentTimeMillis() - c0vbxPeek.LIZJ > 0) {
                                            break;
                                        } else {
                                            i2++;
                                        }
                                    } else if (concurrentLinkedQueue.size() <= 0 || (c0vbxPeek = concurrentLinkedQueue.peek()) == null) {
                                    }
                                }
                                if (C792190V5t.LIZ()) {
                                    C792910V8n.LIZ("APM-Slardar", "sendMemory");
                                }
                                if (C793470VAr.LIZLLL(c0vbu).LJFF(c0vbxPeek.LIZLLL, c0vbxPeek.LIZ)) {
                                    concurrentLinkedQueue.remove(c0vbxPeek);
                                } else {
                                    int i3 = c0vbxPeek.LIZIZ + 1;
                                    c0vbxPeek.LIZIZ = i3;
                                    C792520V7a.LIZ.getClass();
                                    c0vbxPeek.LIZJ = C0V7Z.LIZ(i3) + System.currentTimeMillis();
                                    i = 0;
                                    z = false;
                                }
                            }
                        } else if (C792190V5t.LIZ()) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(c0vbu.LIZ());
                            sbLIZ2.append(" hit backoff strategy when sendMemory,do not send logs");
                            C792910V8n.LIZLLL("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ2));
                        }
                        i = 0;
                    }
                    C0VBV.LJFF = System.currentTimeMillis();
                }
                if (C792420V6q.LJIILJJIL()) {
                    z = true;
                    for (C0VBU c0vbu2 : (ArrayList) C0VBO.LIZJ) {
                        C0VBP c0vbp = C793560VBa.LIZ;
                        String name = c0vbu2.getName();
                        synchronized (c0vbp) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(e3.d);
                            sbLIZ3.append(name);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                            c0vbp.LJ();
                            if (C792190V5t.LIZ()) {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("failedFiles:");
                                sbLIZ4.append(c0vbp.LJII);
                                sbLIZ4.append(" ");
                                sbLIZ4.append(strLIZIZ);
                                C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ4));
                            }
                            if (c0vbp.LJII.size() != 0) {
                                ArrayList<String> arrayList = new ArrayList();
                                for (String str : c0vbp.LJII) {
                                    if (str.endsWith(strLIZIZ)) {
                                        arrayList.add(str);
                                    }
                                }
                                if (!C08GN.LIZIZ(arrayList)) {
                                    Collections.sort(arrayList, new AComparatorS32S0000000_13(15));
                                    C0VSJ c0vsj = null;
                                    C0VBY c0vby = null;
                                    for (String str2 : arrayList) {
                                        C0VBP c0vbp2 = C793560VBa.LIZ;
                                        c0vbp2.LIZJ();
                                        C0VSJ c0vsj2 = new C0VSJ(c0vbp2.LIZLLL, str2);
                                        C0VBY c0vbyLIZLLL = c0vbp.LIZLLL(c0vsj2);
                                        if (c0vbyLIZLLL != null) {
                                            if (C792190V5t.LIZ()) {
                                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                sbLIZ5.append("list send file:");
                                                sbLIZ5.append(c0vsj2.getName());
                                                sbLIZ5.append(" ");
                                                sbLIZ5.append(c0vbyLIZLLL.LIZ);
                                                sbLIZ5.append(" ");
                                                sbLIZ5.append(c0vbyLIZLLL.LIZIZ);
                                                sbLIZ5.append(" ");
                                                sbLIZ5.append(System.currentTimeMillis());
                                                C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ5));
                                            }
                                            if (c0vbyLIZLLL.LIZ != 0 && c0vbyLIZLLL.LIZIZ >= System.currentTimeMillis()) {
                                                if (c0vby == null || c0vby.LIZIZ > c0vbyLIZLLL.LIZIZ) {
                                                    c0vby = c0vbyLIZLLL;
                                                    c0vsj = c0vsj2;
                                                }
                                            }
                                        }
                                        c0vsj = c0vsj2;
                                    }
                                    if (c0vsj != null && c0vsj.exists()) {
                                        if (C793590VBd.LJ(c0vbu2.LIZ()).LJI()) {
                                            C793560VBa.LIZ.LIZIZ(c0vsj);
                                            if (C792190V5t.LIZ()) {
                                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                sbLIZ6.append(c0vbu2.LIZ());
                                                sbLIZ6.append(" in quota status when sendFile,drop data");
                                                C792910V8n.LIZLLL("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ6));
                                            }
                                        } else if (!C793590VBd.LJ(c0vbu2.LIZ()).LJFF()) {
                                            C0VBV.LJI = System.currentTimeMillis();
                                            C0VBV.LJII = 0L;
                                            byte[] bArrLIZIZ = C2404609bY.LIZIZ(c0vsj);
                                            C0VBP c0vbp3 = C793560VBa.LIZ;
                                            c0vbp3.getClass();
                                            boolean zLJFF = C793470VAr.LIZLLL(c0vbu2).LJFF(c0vbp3.LIZIZ.getString(c0vsj.getName(), ""), new C793730VBr(bArrLIZIZ));
                                            C0VBV.LJII = System.currentTimeMillis();
                                            if (zLJFF) {
                                                if (C792190V5t.LIZ()) {
                                                    C792910V8n.LIZ("APM-Slardar", "sendFile: success");
                                                }
                                                c0vbp3.LIZIZ(c0vsj);
                                            } else {
                                                C0VBY c0vbyLIZLLL2 = c0vbp3.LIZLLL(c0vsj);
                                                int i4 = c0vbyLIZLLL2 != null ? c0vbyLIZLLL2.LIZ + 1 : 0;
                                                C792520V7a.LIZ.getClass();
                                                long jLIZ = C0V7Z.LIZ(i4) + System.currentTimeMillis();
                                                c0vbp3.LJI(i4, jLIZ, c0vsj);
                                                if (C792190V5t.LIZ()) {
                                                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                                    sbLIZ7.append("sendfile error retry count:");
                                                    sbLIZ7.append(c0vsj.getName());
                                                    sbLIZ7.append("  ");
                                                    sbLIZ7.append(i4);
                                                    sbLIZ7.append(" nextRetryTime:");
                                                    sbLIZ7.append(jLIZ);
                                                    C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ7));
                                                }
                                                z = false;
                                            }
                                        } else if (C792190V5t.LIZ()) {
                                            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                            sbLIZ8.append(c0vbu2.LIZ());
                                            sbLIZ8.append(" hit backoff strategy when sendFile,do not send logs");
                                            C792910V8n.LIZLLL("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ8));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (z) {
                    this.LJ = 1L;
                    this.LIZJ = 30000L;
                } else {
                    if (this.LIZJ < 120000) {
                        long j = this.LJ + 1;
                        this.LIZJ = 30000 * j;
                        this.LJ = j;
                    }
                    if (this.LIZJ > 120000) {
                        this.LIZJ = 120000L;
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LIZJ(List list) {
        for (C0VBZ c0vbz : (ArrayList) list) {
            try {
                File file = c0vbz.LIZLLL;
                if (file != null) {
                    C2404609bY.LIZ(file);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("delete LogFile's source File failed. logFile=");
                sbLIZ.append(c0vbz.LIZLLL);
                C2188811AlT.LIZIZ(sbLIZ);
                InterfaceC792920V8o interfaceC792920V8o = C792910V8n.LIZ;
                if (interfaceC792920V8o != null) {
                    interfaceC792920V8o.w();
                }
            }
        }
    }

    @Override // X.C0VB7
    public final void LIZ(long j) {
        File[] fileArrListFiles;
        long j2;
        String[] strArrSplit;
        C0VBP c0vbp = C793560VBa.LIZ;
        c0vbp.LIZJ();
        C0VSJ c0vsj = c0vbp.LIZLLL;
        if (c0vsj != null && (fileArrListFiles = c0vsj.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                try {
                    strArrSplit = file.getName().split("_");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                if (strArrSplit.length == 2) {
                    j2 = CastLongProtector.parseLong(strArrSplit[0]);
                } else {
                    j2 = -1;
                }
                if (j2 <= j) {
                    C2404609bY.LIZ(file);
                }
            }
        }
    }

    public final void LJ(int i, List list) {
        List<String> list2;
        boolean zLIZIZ;
        C793730VBr c793730VBr;
        int i2;
        boolean zLJFF;
        ConcurrentLinkedQueue<C0VBX> concurrentLinkedQueue;
        List<JSONObject> listLJ;
        boolean zLJI = MethodIDManager.LJI(137739);
        try {
            ArrayList arrayList = new ArrayList();
            for (String str : (ArrayList) this.LJFF) {
                if (C793590VBd.LJ(str).LJI()) {
                    arrayList.add(str);
                    if (C792190V5t.LIZ()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append(" is in quotaStatus,drop data");
                        C792910V8n.LIZLLL("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }
            Map mapLIZJ = C0VBO.LIZJ(list, arrayList, i);
            if (mapLIZJ == null) {
                LIZJ(list);
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            C0V7Z c0v7z = C792520V7a.LIZ;
            C792880V8k c792880V8k = c0v7z.LJFF;
            if (c792880V8k != null && !C08GN.LIZIZ(c792880V8k.LIZJ)) {
                list2 = c0v7z.LJFF.LIZJ;
            } else {
                list2 = c0v7z.LIZ;
            }
            if (!C08GN.LIZIZ(list2)) {
                String str2 = list2.get(0);
                InterfaceC793480VAs interfaceC793480VAs = (InterfaceC793480VAs) C792590V7h.LIZ(InterfaceC793480VAs.class);
                if (interfaceC793480VAs != null) {
                    interfaceC793480VAs.LIZIZ(new URL(str2).getHost());
                }
            }
            try {
                zLIZIZ = C036E.LIZ.LIZIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                zLIZIZ = false;
            }
            HashMap map = (HashMap) mapLIZJ;
            boolean z = false;
            for (C0VBU c0vbu : map.keySet()) {
                Pair pair = (Pair) map.get(c0vbu);
                if (pair != null && (c793730VBr = (C793730VBr) pair.second) != null && !c793730VBr.LIZ()) {
                    List list3 = (List) pair.first;
                    String strJoin = "";
                    if (list3 != null && list3.size() > 0) {
                        strJoin = TextUtils.join(",", list3);
                    }
                    if (zLIZIZ && (c0vbu instanceof C0VBS)) {
                        C793470VAr.LIZLLL(c0vbu).LJFF(strJoin, c793730VBr);
                    } else {
                        boolean zLJFF2 = C793590VBd.LJ(c0vbu.LIZ()).LJFF();
                        if (!zLJFF2 && zLIZIZ) {
                            if (C792190V5t.LIZ() && (listLJ = C793430VAn.LJ(c793730VBr)) != null) {
                                Iterator it2 = ((ArrayList) listLJ).iterator();
                                while (it2.hasNext()) {
                                    C793430VAn.LIZIZ("DATA_SEND_BEGIN", (JSONObject) it2.next());
                                }
                            }
                            zLJFF = C793470VAr.LIZLLL(c0vbu).LJFF(strJoin, c793730VBr);
                            if (C792190V5t.LIZ()) {
                                if (!zLJFF) {
                                    for (JSONObject jSONObject : (ArrayList) C793430VAn.LJ(c793730VBr)) {
                                        C793430VAn.LIZIZ("DATA_SEND_FAIL", jSONObject);
                                        C793430VAn.LIZIZ("DATA_SEND_END", jSONObject);
                                    }
                                } else {
                                    C793430VAn.LIZLLL(c793730VBr);
                                }
                            }
                            this.LIZLLL = System.currentTimeMillis();
                            z |= zLJFF;
                            i2 = 1;
                        } else {
                            i2 = 0;
                            zLJFF = false;
                        }
                        if (C792190V5t.LIZ()) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("sendDirect:isBackoffDuration ");
                            sbLIZ2.append(zLJFF2);
                            sbLIZ2.append(" :sendResult ");
                            sbLIZ2.append(zLJFF);
                            C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ2));
                        }
                        if (!zLJFF) {
                            C792520V7a.LIZ.getClass();
                            long jLIZ = C0V7Z.LIZ(i2);
                            long jCurrentTimeMillis = System.currentTimeMillis() + jLIZ;
                            if (C792420V6q.LJIILJJIL()) {
                                zLJFF = C793560VBa.LIZ.LJFF(c793730VBr, c0vbu.getName(), i2, jCurrentTimeMillis, strJoin);
                            }
                            if (C792190V5t.LIZ()) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("saveFile:Result:");
                                sbLIZ3.append(zLJFF);
                                sbLIZ3.append(":isMaiProcess:");
                                sbLIZ3.append(C792420V6q.LJIILJJIL());
                                sbLIZ3.append(" :");
                                sbLIZ3.append(i2);
                                sbLIZ3.append(" ");
                                sbLIZ3.append(jLIZ);
                                C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ3));
                            }
                            if (!zLJFF) {
                                if (this.LIZ.containsKey(c0vbu)) {
                                    concurrentLinkedQueue = this.LIZ.get(c0vbu);
                                } else {
                                    concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                                    concurrentLinkedQueue.add(new C0VBX(c793730VBr, i2, jCurrentTimeMillis, strJoin));
                                    this.LIZ.put(c0vbu, concurrentLinkedQueue);
                                }
                                if (concurrentLinkedQueue.size() > 10) {
                                    concurrentLinkedQueue.poll();
                                }
                            }
                        }
                    }
                }
            }
            if (z) {
                this.LJ = 1L;
                this.LIZJ = 30000L;
            }
            LIZJ(list);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C792910V8n.LIZJ("APM-Slardar", "sendLog", th);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
