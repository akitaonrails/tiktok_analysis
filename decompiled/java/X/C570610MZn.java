package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0MZn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570610MZn {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(final AwemeDraft awemeDraft, final boolean z) {
        Object c098200Yq;
        if (C2540409xS.LIZIZ()) {
            float fLIZ = C2540409xS.LIZ();
            if (C2540409xS.LIZIZ() && AbstractC19994813Le.Default.nextFloat() < fLIZ) {
                try {
                    C20184413yM.LJ.LIZ().LIZJ(awemeDraft, EnumC570650MZr.POST_RESTORE, new InterfaceC20184613yO() { // from class: X.13yL
                        @Override // X.InterfaceC20184613yO
                        public final void LIZ(C20184113yJ c20184113yJ) {
                            C20184813yQ c20184813yQ = c20184113yJ.LIZLLL;
                            long j = c20184813yQ.LIZIZ;
                            int i = c20184813yQ.LIZJ;
                            float f = c20184813yQ.LIZLLL;
                            long j2 = c20184113yJ.LJFF.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Post-restore monitoring completed for ");
                            sbLIZ.append(awemeDraft.LIZ());
                            sbLIZ.append(':');
                            C20183113y9.LJ("DraftRestoreMonitor", C2188811AlT.LIZIZ(sbLIZ));
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("  - Success: ");
                            sbLIZ2.append(z);
                            C20183113y9.LJ("DraftRestoreMonitor", C2188811AlT.LIZIZ(sbLIZ2));
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("  - Folder size: ");
                            long j3 = 1024;
                            sbLIZ3.append((j / j3) / j3);
                            sbLIZ3.append("MB");
                            C20183113y9.LJ("DraftRestoreMonitor", C2188811AlT.LIZIZ(sbLIZ3));
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("  - File count: ");
                            sbLIZ4.append(i);
                            C20183113y9.LJ("DraftRestoreMonitor", C2188811AlT.LIZIZ(sbLIZ4));
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("  - Disk usage: ");
                            sbLIZ5.append(C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)));
                            sbLIZ5.append('%');
                            C20183113y9.LJ("DraftRestoreMonitor", C2188811AlT.LIZIZ(sbLIZ5));
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("  - Scan duration: ");
                            sbLIZ6.append(j2);
                            sbLIZ6.append("ms");
                            C20183113y9.LJII("DraftRestoreMonitor", C2188811AlT.LIZIZ(sbLIZ6));
                            final List<C20183913yH> list = c20184113yJ.LJ;
                            Map mapLIZ = C08SO.LIZ(new C08SN<C20183913yH, String>() { // from class: X.13yN
                                @Override // X.C08SN
                                public final Iterator<C20183913yH> LIZ() {
                                    return list.iterator();
                                }

                                @Override // X.C08SN
                                public final String LIZIZ(C20183913yH c20183913yH) {
                                    return c20183913yH.LIZLLL;
                                }
                            });
                            C20183113y9.LJIIIIZZ("DraftRestoreMonitor", "File extension distribution:");
                            for (Map.Entry entry : mapLIZ.entrySet()) {
                                String str = (String) entry.getKey();
                                int iIntValue = ((Number) entry.getValue()).intValue();
                                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                sbLIZ7.append("  - ");
                                sbLIZ7.append(str);
                                sbLIZ7.append(": ");
                                sbLIZ7.append(iIntValue);
                                sbLIZ7.append(" files");
                                C20183113y9.LJIIIIZZ("DraftRestoreMonitor", C2188811AlT.LIZIZ(sbLIZ7));
                            }
                            List<C20183913yH> list2 = c20184113yJ.LJ;
                            ArrayList arrayList = new ArrayList();
                            for (C20183913yH c20183913yH : list2) {
                                if (c20183913yH.LJII) {
                                    arrayList.add(c20183913yH);
                                }
                            }
                            List<C20183913yH> list3 = c20184113yJ.LJ;
                            ArrayList<C20183913yH> arrayList2 = new ArrayList();
                            for (C20183913yH c20183913yH2 : list3) {
                                if (!c20183913yH2.LJII) {
                                    arrayList2.add(c20183913yH2);
                                }
                            }
                            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                            sbLIZ8.append("Field mapping result: ");
                            sbLIZ8.append(arrayList.size());
                            sbLIZ8.append(" mapped, ");
                            sbLIZ8.append(arrayList2.size());
                            sbLIZ8.append(" unmapped");
                            C20183113y9.LJFF(C2188811AlT.LIZIZ(sbLIZ8));
                            if (!arrayList2.isEmpty()) {
                                C20183113y9.LJFF("Unmapped files:");
                                for (C20183913yH c20183913yH3 : arrayList2) {
                                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                    sbLIZ9.append("  - ");
                                    sbLIZ9.append(c20183913yH3.LIZJ);
                                    sbLIZ9.append(" (");
                                    sbLIZ9.append(c20183913yH3.LJ);
                                    sbLIZ9.append(" bytes)");
                                    C20183113y9.LJFF(C2188811AlT.LIZIZ(sbLIZ9));
                                }
                            }
                            if (j2 > 2000) {
                                C20183113y9.LJII("DraftRestoreMonitor", "Slow restore detected: " + j2 + "ms for " + i + " files");
                            }
                        }

                        @Override // X.InterfaceC20184613yO
                        public final void onError(Throwable th) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Post-restore monitoring failed for ");
                            sbLIZ.append(awemeDraft.LIZ());
                            C20183113y9.LJIIJJI("DraftRestoreMonitor", C2188811AlT.LIZIZ(sbLIZ), th);
                        }
                    });
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C20183113y9.LIZLLL("DraftRestoreMonitor", "Failed to complete restore monitoring", thM5exceptionOrNullimpl);
                }
            }
        }
    }
}
