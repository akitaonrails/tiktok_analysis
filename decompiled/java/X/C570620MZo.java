package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0MZo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570620MZo {
    public static final void LIZIZ(final AwemeDraft awemeDraft) {
        Object c098200Yq;
        if (!LIZJ(awemeDraft)) {
            return;
        }
        try {
            C20184413yM.LJ.LIZ().LIZLLL(awemeDraft, EnumC570650MZr.PRE_SAVE, new InterfaceC20184613yO() { // from class: X.0Ma3
                @Override // X.InterfaceC20184613yO
                public final void LIZ(C20184113yJ c20184113yJ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Pre-save monitoring completed for ");
                    sbLIZ.append(awemeDraft.LIZ());
                    sbLIZ.append(": ");
                    sbLIZ.append(c20184113yJ.LJ.size());
                    sbLIZ.append(" files");
                    C20183113y9.LJIIIIZZ("DraftSaveMonitor", C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // X.InterfaceC20184613yO
                public final void onError(Throwable th) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Pre-save monitoring failed for ");
                    sbLIZ.append(awemeDraft.LIZ());
                    C20183113y9.LJIIJJI("DraftSaveMonitor", C2188811AlT.LIZIZ(sbLIZ), th);
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
            C20183113y9.LIZLLL("DraftSaveMonitor", "Failed to start save monitoring", thM5exceptionOrNullimpl);
        }
    }

    public static boolean LIZJ(AwemeDraft awemeDraft) {
        Object next;
        if (!C2540409xS.LIZIZ()) {
            return false;
        }
        float fLIZ = C2540409xS.LIZ();
        if (!C2540409xS.LIZIZ() || AbstractC19994813Le.Default.nextFloat() >= fLIZ) {
            return false;
        }
        int i = awemeDraft.LIZJ;
        ArrayList<Integer> arrayList = C00JJ.LIZ;
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        List list = C00JJ.LIZ;
        List list2 = (List) c0c64LJIILLIIL.LJJII(ArrayList.class, list, "studio_draft_track_save_scene", true);
        if (list2 != null) {
            list = list2;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((Number) next).intValue() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Integer num = (Integer) next;
        if (num == null) {
            return false;
        }
        num.intValue();
        return true;
    }

    public static final void LIZ(final AwemeDraft awemeDraft, final boolean z) {
        Object c098200Yq;
        if (!LIZJ(awemeDraft)) {
            return;
        }
        try {
            C20184413yM.LJ.LIZ().LIZLLL(awemeDraft, EnumC570650MZr.POST_SAVE, new InterfaceC20184613yO() { // from class: X.13yK
                @Override // X.InterfaceC20184613yO
                public final void LIZ(C20184113yJ c20184113yJ) {
                    C20184813yQ c20184813yQ = c20184113yJ.LIZLLL;
                    long j = c20184813yQ.LIZIZ;
                    int i = c20184813yQ.LIZJ;
                    float f = c20184813yQ.LIZLLL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Post-save monitoring completed for ");
                    sbLIZ.append(awemeDraft.LIZ());
                    sbLIZ.append(':');
                    C20183113y9.LJ("DraftSaveMonitor", C2188811AlT.LIZIZ(sbLIZ));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("  - Success: ");
                    sbLIZ2.append(z);
                    C20183113y9.LJ("DraftSaveMonitor", C2188811AlT.LIZIZ(sbLIZ2));
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("  - Folder size: ");
                    long j2 = 1024;
                    sbLIZ3.append((j / j2) / j2);
                    sbLIZ3.append("MB");
                    C20183113y9.LJ("DraftSaveMonitor", C2188811AlT.LIZIZ(sbLIZ3));
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("  - File count: ");
                    sbLIZ4.append(i);
                    C20183113y9.LJ("DraftSaveMonitor", C2188811AlT.LIZIZ(sbLIZ4));
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("  - Disk usage: ");
                    sbLIZ5.append(C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)));
                    sbLIZ5.append('%');
                    C20183113y9.LJ("DraftSaveMonitor", C2188811AlT.LIZIZ(sbLIZ5));
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("  - Time duration: ");
                    sbLIZ6.append(c20184113yJ.LJFF.LIZ);
                    C20183113y9.LJII("DraftSaveMonitor", C2188811AlT.LIZIZ(sbLIZ6));
                    List<C20183913yH> list = c20184113yJ.LJ;
                    ArrayList<C20183913yH> arrayList = new ArrayList();
                    for (C20183913yH c20183913yH : list) {
                        if (c20183913yH.LJ > 52428800) {
                            arrayList.add(c20183913yH);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("Large files detected in ");
                        sbLIZ7.append(awemeDraft.LIZ());
                        sbLIZ7.append(": ");
                        sbLIZ7.append(arrayList.size());
                        sbLIZ7.append(" files");
                        C20183113y9.LJIIJ("DraftSaveMonitor", C2188811AlT.LIZIZ(sbLIZ7));
                        for (C20183913yH c20183913yH2 : arrayList) {
                            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                            sbLIZ8.append("  - ");
                            sbLIZ8.append(c20183913yH2.LIZJ);
                            sbLIZ8.append(": ");
                            sbLIZ8.append((c20183913yH2.LJ / j2) / j2);
                            sbLIZ8.append("MB");
                            C20183113y9.LJIIJ("DraftSaveMonitor", C2188811AlT.LIZIZ(sbLIZ8));
                        }
                    }
                    if (f > 1.0f) {
                        C20183113y9.LJIIJ("DraftSaveMonitor", "High disk usage detected: " + C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)) + '%');
                    }
                }

                @Override // X.InterfaceC20184613yO
                public final void onError(Throwable th) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Post-save monitoring failed for ");
                    sbLIZ.append(awemeDraft.LIZ());
                    C20183113y9.LJIIJJI("DraftSaveMonitor", C2188811AlT.LIZIZ(sbLIZ), th);
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
            C20183113y9.LIZLLL("DraftSaveMonitor", "Failed to complete save monitoring", thM5exceptionOrNullimpl);
        }
    }
}
