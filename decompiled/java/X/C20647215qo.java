package X;

import Y.ARunnableS131S0100000_31;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachStorageConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.15qo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20647215qo {
    public ArrayList<String> LIZ;
    public ArrayList<String> LIZIZ;

    public final void LIZ(String str) {
        if (C282010B3n.LIZ()) {
            ArrayList<String> arrayList = this.LIZ;
            if (arrayList != null) {
                ListProtector.add(arrayList, 0, str);
            }
        } else {
            synchronized (C20648315qz.class) {
                try {
                    ArrayList<String> arrayList2 = this.LIZ;
                    if (arrayList2 != null) {
                        arrayList2.add(0, str);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C823050WQl.LJFF().submit(new Runnable() { // from class: X.15qn
            public final void LIZ() {
                ArrayList<String> arrayList3;
                C20647215qo c20647215qo = this.LL;
                ArrayList<String> arrayList4 = c20647215qo.LIZ;
                if (arrayList4 != null) {
                    int size = arrayList4.size();
                    C01GW c01gw = C20646915ql.LIZIZ;
                    if (size > ((OutreachStorageConfig) c01gw.getValue()).maxSessionCount) {
                        int size2 = (int) (((double) ((OutreachStorageConfig) c01gw.getValue()).maxSessionCount) * 0.4d);
                        if (size2 < 0) {
                            size2 = (int) (((double) arrayList4.size()) * 0.5d);
                        }
                        List listLJJJJJ = C13LP.LJJJJJ(size2, arrayList4);
                        if ((listLJJJJJ instanceof ArrayList) && (arrayList3 = (ArrayList) listLJJJJJ) != null && !arrayList3.isEmpty()) {
                            c20647215qo.LIZ = arrayList3;
                        }
                        C20571715ed c20571715ed = C20571715ed.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("drop session list, max count: ");
                        sbLIZ.append(((OutreachStorageConfig) c01gw.getValue()).maxShownModelCount);
                        sbLIZ.append(", newCount = ");
                        ArrayList<String> arrayList5 = c20647215qo.LIZ;
                        sbLIZ.append(arrayList5 != null ? Integer.valueOf(arrayList5.size()) : null);
                        C2188811AlT.LIZIZ(sbLIZ);
                        c20571715ed.getClass();
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TimeRecordData@dc19.addSession$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TimeRecordData@dc19.addSession$2");
            }
        });
    }

    public final void LIZIZ(String str) {
        if (C282010B3n.LIZ()) {
            ArrayList<String> arrayList = this.LIZIZ;
            if (arrayList != null) {
                ListProtector.add(arrayList, 0, str);
            }
        } else {
            synchronized (C20648315qz.class) {
                try {
                    ArrayList<String> arrayList2 = this.LIZIZ;
                    if (arrayList2 != null) {
                        arrayList2.add(0, str);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C823050WQl.LJFF().submit(new ARunnableS131S0100000_31(this, 153));
    }
}
