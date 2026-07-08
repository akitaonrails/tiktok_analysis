package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.outreach.dispersion.save.OutreachRecordData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS276S0000000_31;

/* JADX INFO: renamed from: X.15r7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20649115r7 {
    public static final C603820NmG<C1777800wMc, C20651315rT> LIZ = new C603820NmG<>(5);

    public static C20651315rT LIZIZ(OutreachRecordData outreachRecordData, boolean z) {
        String triggerId;
        if (!C279730Axn.LIZ() || z) {
            return null;
        }
        String awemeId = outreachRecordData.getAwemeId();
        if (awemeId != null && awemeId.length() != 0) {
            triggerId = outreachRecordData.getAwemeId();
        } else {
            triggerId = outreachRecordData.getTriggerId();
        }
        if (triggerId == null || triggerId.length() == 0) {
            return null;
        }
        C20651315rT c20651315rT = new C20651315rT();
        C1777800wMc c1777800wMc = new C1777800wMc(triggerId);
        C603820NmG<C1777800wMc, C20651315rT> c603820NmG = LIZ;
        synchronized (c603820NmG) {
            try {
                c603820NmG.LIZLLL(c1777800wMc, c20651315rT);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c20651315rT;
    }

    public static void LIZ(C2344009Gk c2344009Gk, String str, String str2) {
        C20651315rT c20651315rTLIZJ;
        boolean z;
        Object next;
        int iLIZ;
        int iLIZ2;
        AbstractC20652915rj abstractC20652915rj;
        int iLIZ3;
        String strLJJLIIIJ;
        String str3;
        if (!C279730Axn.LIZ()) {
            return;
        }
        boolean z2 = false;
        if (str != null && str.length() != 0) {
            C1777800wMc c1777800wMc = new C1777800wMc(str);
            C603820NmG<C1777800wMc, C20651315rT> c603820NmG = LIZ;
            synchronized (c603820NmG) {
                try {
                    c20651315rTLIZJ = c603820NmG.LIZJ(c1777800wMc);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (c20651315rTLIZJ == null) {
                c20651315rTLIZJ = new C20651315rT();
            }
            c20651315rTLIZJ.LJFF = str2;
            C20648715r3.LIZ.getClass();
            if (C20648715r3.LJ && !C20648715r3.LJFF) {
                C20648715r3.LJFF = true;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c20651315rTLIZJ.LIZ = 2;
            } else {
                List<C20648515r1> list = c20651315rTLIZJ.LIZJ;
                if (list != null && !((ArrayList) list).isEmpty()) {
                    long jCurrentTimeMillis = (System.currentTimeMillis() - ((Number) C20648715r3.LIZLLL.getValue()).longValue()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    Iterator it2 = ((ArrayList) list).iterator();
                    if (!it2.hasNext()) {
                        next = null;
                    } else {
                        next = it2.next();
                        if (it2.hasNext()) {
                            AbstractC20652915rj abstractC20652915rj2 = ((C20648515r1) next).LJ;
                            if (abstractC20652915rj2 != null) {
                                iLIZ = abstractC20652915rj2.LIZ();
                            } else {
                                iLIZ = -1;
                            }
                            do {
                                Object next2 = it2.next();
                                AbstractC20652915rj abstractC20652915rj3 = ((C20648515r1) next2).LJ;
                                if (abstractC20652915rj3 != null) {
                                    iLIZ2 = abstractC20652915rj3.LIZ();
                                } else {
                                    iLIZ2 = -1;
                                }
                                if (iLIZ < iLIZ2) {
                                    next = next2;
                                    iLIZ = iLIZ2;
                                }
                            } while (it2.hasNext());
                        }
                    }
                    C20648515r1 c20648515r1 = (C20648515r1) next;
                    if (c20648515r1 != null && (abstractC20652915rj = c20648515r1.LJ) != null && (iLIZ3 = abstractC20652915rj.LIZ()) != -1) {
                        if (jCurrentTimeMillis < iLIZ3) {
                            c20651315rTLIZJ.LIZ = 1;
                        } else {
                            c20651315rTLIZJ.LIZ = 0;
                        }
                    }
                }
            }
            List<C20648515r1> list2 = c20651315rTLIZJ.LIZJ;
            Pair[] pairArr = new Pair[6];
            pairArr[0] = new Pair("outreach_is_cache_invalid", String.valueOf(c20651315rTLIZJ.LIZ));
            pairArr[1] = new Pair("outreach_fetch_config_status", String.valueOf(c20651315rTLIZJ.LIZIZ));
            if (list2 == null || ((ArrayList) list2).isEmpty()) {
                z2 = true;
            }
            String str4 = "";
            if (z2) {
                strLJJLIIIJ = "";
            } else {
                strLJJLIIIJ = C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, AFwS276S0000000_31.get$arr$(331), 30);
            }
            pairArr[2] = new Pair("outreach_strategy_detail_list", strLJJLIIIJ);
            if (c20651315rTLIZJ.LIZLLL) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[3] = new Pair("outreach_has_backup_drop", str3);
            pairArr[4] = new Pair("outreach_drop_result", String.valueOf(c20651315rTLIZJ.LJ));
            String str5 = c20651315rTLIZJ.LJFF;
            if (str5 != null) {
                str4 = str5;
            }
            pairArr[5] = new Pair("outreach_log_id", str4);
            for (Map.Entry entry : C2097608Jq.LJIIIIZZ(pairArr).entrySet()) {
                c2344009Gk.LJFF((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }
}
