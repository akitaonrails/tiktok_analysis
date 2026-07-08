package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.outreach.dispersion.save.OutreachRecordData;
import java.lang.reflect.Type;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;

/* JADX INFO: renamed from: X.15r9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20649315r9 {
    public static final C20649315r9 LIZ = new C20649315r9();
    public static final ConcurrentSkipListSet<OutreachRecordData> LIZIZ = new ConcurrentSkipListSet<>();
    public static ConcurrentSkipListSet<OutreachRecordData> LIZJ = new ConcurrentSkipListSet<>();
    public static final ConcurrentSkipListSet<OutreachRecordData> LIZLLL = new ConcurrentSkipListSet<>();
    public static boolean LJ = true;
    public static final Type LJFF = new TypeToken<ConcurrentSkipListSet<OutreachRecordData>>() { // from class: X.15ra
    }.getType();

    public static void LIZIZ() {
        ConcurrentSkipListSet<OutreachRecordData> concurrentSkipListSet;
        try {
            C20648715r3.LIZ.getClass();
            String string = C20648715r3.LIZIZ().getString("un_sync_record_cache", "");
            if (string == null || string.length() == 0 || (concurrentSkipListSet = (ConcurrentSkipListSet) C09C2.LIZ().LJIIIIZZ(string, LJFF)) == null || concurrentSkipListSet.isEmpty()) {
                return;
            }
            LIZJ = concurrentSkipListSet;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20571715ed c20571715ed = C20571715ed.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initSyncRecordFromCache exception: ");
            sbLIZ.append(e);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c20571715ed.getClass();
            C20571715ed.LIZ(strLIZIZ);
        }
    }

    public static ConcurrentSkipListSet LIZ(EnumC20650315rJ enumC20650315rJ) {
        int i = C20650515rL.LIZ[enumC20650315rJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return LIZLLL;
                }
                throw new C1954807lC();
            }
            return LIZJ;
        }
        return LIZIZ;
    }

    public static void LIZJ(EnumC20650315rJ enumC20650315rJ) {
        if (enumC20650315rJ == EnumC20650315rJ.UN_SYNCED || enumC20650315rJ == EnumC20650315rJ.SYNCING) {
            C823050WQl.LJFF().submit(new Runnable() { // from class: X.15rB
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    ConcurrentSkipListSet<OutreachRecordData> concurrentSkipListSet;
                    C1C7U.LIZ("SyncRecordUtil@fc60.updateKevaStorage$1");
                    try {
                        ConcurrentSkipListSet<OutreachRecordData> concurrentSkipListSet2 = C20649315r9.LIZIZ;
                        if (!concurrentSkipListSet2.isEmpty()) {
                            concurrentSkipListSet = new ConcurrentSkipListSet<>((SortedSet<OutreachRecordData>) C20649315r9.LIZJ);
                            concurrentSkipListSet.addAll(concurrentSkipListSet2);
                        } else {
                            concurrentSkipListSet = C20649315r9.LIZJ;
                        }
                        String json = GsonProtectorUtils.toJson(C09C2.LIZ(), concurrentSkipListSet);
                        C20648715r3.LIZ.getClass();
                        C20648715r3.LIZIZ().storeString("un_sync_record_cache", json);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SyncRecordUtil@fc60.updateKevaStorage$1");
                }
            });
        }
    }
}
