package X;

import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0V85, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V85 {
    public C0V87 LIZ;
    public String LIZIZ;

    public final long LIZ() {
        return this.LIZ.LJFF();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void LIZIZ() {
        String str = !C792400V6o.LJIIJJI ? "dummy" : Build.VERSION.SDK_INT >= 28 ? "new" : "old";
        if (TextUtils.equals(str, this.LIZIZ)) {
            return;
        }
        this.LIZIZ = str;
        switch (str.hashCode()) {
            case -897048717:
                if (str.equals("socket")) {
                    this.LIZ = new C791650V3r();
                }
                break;
            case 108960:
                if (str.equals("new")) {
                    this.LIZ = new C798090VSl();
                }
                break;
            case 110119:
                if (str.equals("old")) {
                    this.LIZ = new C0V87() { // from class: X.08Nc
                        public C0VSJ LIZ;
                        public final List<String> LIZIZ = new CopyOnWriteArrayList();
                        public long LIZJ = -1;

                        @Override // X.C0V87
                        public final void LIZ(boolean z) {
                        }

                        public final void LJIIIIZZ() {
                            BufferedReader bufferedReader;
                            ArrayList arrayList;
                            int i;
                            if (this.LIZ != null && System.currentTimeMillis() - this.LIZJ >= 1000) {
                                this.LIZJ = System.currentTimeMillis();
                                try {
                                    arrayList = new ArrayList();
                                    bufferedReader = new BufferedReader(new InputStreamReader(new C0VSP(this.LIZ), "utf-8"));
                                    i = 1;
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedReader = null;
                                }
                                while (true) {
                                    try {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        }
                                        if (i >= 0) {
                                            arrayList.add(line);
                                        }
                                        i++;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                        } catch (Throwable th3) {
                                            TryCatchGuardChecker.doCheck(th3);
                                            C1971107np.LIZ(bufferedReader);
                                            throw th3;
                                        }
                                    }
                                    C1971107np.LIZ(bufferedReader);
                                }
                                ((CopyOnWriteArrayList) this.LIZIZ).clear();
                                ((CopyOnWriteArrayList) this.LIZIZ).addAll(arrayList);
                                C1971107np.LIZ(bufferedReader);
                            }
                        }

                        @Override // X.C0V87
                        public final void init() {
                            this.LIZ = new C0VSJ("/proc/net/xt_qtaguid/stats");
                        }

                        @Override // X.C0V87
                        public final long LIZIZ() {
                            int iMyUid = Process.myUid();
                            LJIIIIZZ();
                            if (C2106708Nd.LIZ(this.LIZIZ)) {
                                return -1L;
                            }
                            Iterator it2 = ((CopyOnWriteArrayList) this.LIZIZ).iterator();
                            long j = 0;
                            long j2 = 0;
                            while (it2.hasNext()) {
                                String[] strArrSplit = ((String) it2.next()).split(" ");
                                try {
                                    if (!TextUtils.equals(strArrSplit[3], "uid_tag_int") && iMyUid == CastIntegerProtector.parseInt(strArrSplit[3])) {
                                        long j3 = CastLongProtector.parseLong(strArrSplit[5]);
                                        long j4 = CastLongProtector.parseLong(strArrSplit[7]);
                                        if (CastLongProtector.valueOf(strArrSplit[4]).longValue() == 0 && strArrSplit[1].startsWith("wlan")) {
                                            j2 += j4;
                                            j += j3;
                                        }
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                            return j + j2;
                        }

                        @Override // X.C0V87
                        public final long LIZJ() {
                            int iMyUid = Process.myUid();
                            LJIIIIZZ();
                            if (C2106708Nd.LIZ(this.LIZIZ)) {
                                return -1L;
                            }
                            Iterator it2 = ((CopyOnWriteArrayList) this.LIZIZ).iterator();
                            long j = 0;
                            long j2 = 0;
                            while (it2.hasNext()) {
                                String[] strArrSplit = ((String) it2.next()).split(" ");
                                try {
                                    if (!TextUtils.equals(strArrSplit[3], "uid_tag_int") && iMyUid == CastIntegerProtector.parseInt(strArrSplit[3])) {
                                        long j3 = CastLongProtector.parseLong(strArrSplit[5]);
                                        long j4 = CastLongProtector.parseLong(strArrSplit[7]);
                                        if (CastLongProtector.valueOf(strArrSplit[4]).longValue() == 0 && strArrSplit[1].startsWith("rmnet_data")) {
                                            j2 += j4;
                                            j += j3;
                                        }
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                            return j + j2;
                        }

                        @Override // X.C0V87
                        public final long LIZLLL() {
                            return LIZIZ() + LJI();
                        }

                        @Override // X.C0V87
                        public final long LJ() {
                            return LIZJ() + LJII();
                        }

                        @Override // X.C0V87
                        public final long LJFF() {
                            return LJ() + LIZLLL();
                        }

                        @Override // X.C0V87
                        public final long LJI() {
                            int iMyUid = Process.myUid();
                            LJIIIIZZ();
                            if (C2106708Nd.LIZ(this.LIZIZ)) {
                                return -1L;
                            }
                            Iterator it2 = ((CopyOnWriteArrayList) this.LIZIZ).iterator();
                            long j = 0;
                            long j2 = 0;
                            while (it2.hasNext()) {
                                String[] strArrSplit = ((String) it2.next()).split(" ");
                                try {
                                    if (!TextUtils.equals(strArrSplit[3], "uid_tag_int") && iMyUid == CastIntegerProtector.parseInt(strArrSplit[3])) {
                                        long j3 = CastLongProtector.parseLong(strArrSplit[5]);
                                        long j4 = CastLongProtector.parseLong(strArrSplit[7]);
                                        if (CastLongProtector.valueOf(strArrSplit[4]).longValue() == 1 && strArrSplit[1].startsWith("wlan")) {
                                            j2 += j4;
                                            j += j3;
                                        }
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                            return j + j2;
                        }

                        @Override // X.C0V87
                        public final long LJII() {
                            int iMyUid = Process.myUid();
                            LJIIIIZZ();
                            if (C2106708Nd.LIZ(this.LIZIZ)) {
                                return -1L;
                            }
                            Iterator it2 = ((CopyOnWriteArrayList) this.LIZIZ).iterator();
                            long j = 0;
                            long j2 = 0;
                            while (it2.hasNext()) {
                                String[] strArrSplit = ((String) it2.next()).split(" ");
                                try {
                                    if (!TextUtils.equals(strArrSplit[3], "uid_tag_int") && iMyUid == CastIntegerProtector.parseInt(strArrSplit[3])) {
                                        long j3 = CastLongProtector.parseLong(strArrSplit[5]);
                                        long j4 = CastLongProtector.parseLong(strArrSplit[7]);
                                        if (CastLongProtector.valueOf(strArrSplit[4]).longValue() == 1 && strArrSplit[1].startsWith("rmnet_data")) {
                                            j2 += j4;
                                            j += j3;
                                        }
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                            return j + j2;
                        }
                    };
                }
                break;
            case 95945896:
                if (str.equals("dummy")) {
                    this.LIZ = new C0V87() { // from class: X.0V8B
                        @Override // X.C0V87
                        public final void LIZ(boolean z) {
                        }

                        @Override // X.C0V87
                        public final long LIZIZ() {
                            return -1L;
                        }

                        @Override // X.C0V87
                        public final long LIZJ() {
                            return -1L;
                        }

                        @Override // X.C0V87
                        public final long LIZLLL() {
                            return -1L;
                        }

                        @Override // X.C0V87
                        public final long LJ() {
                            return -1L;
                        }

                        @Override // X.C0V87
                        public final long LJFF() {
                            return -1L;
                        }

                        @Override // X.C0V87
                        public final long LJI() {
                            return -1L;
                        }

                        @Override // X.C0V87
                        public final long LJII() {
                            return -1L;
                        }

                        @Override // X.C0V87
                        public final void init() {
                        }
                    };
                }
                break;
        }
        this.LIZ.init();
        if (C792400V6o.LJIIIIZZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TrafficStatsImpl: ");
            sbLIZ.append(this.LIZ.getClass().getName());
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public C0V85() {
        LIZIZ();
    }
}
