package X;

import Y.AfS177S0100000_8;
import Y.AkS472S0100000_8;
import com.ss.android.ugc.aweme.aikit.api.common.AIAlertService;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterGenerationModel;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LjA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C550940LjA extends AbstractC548480LfC {
    public static final C550950LjB LLJJIJIL = new Object() { // from class: X.0LjB
    };
    public final int LLJIJIL;
    public final InterfaceC548570LfL LLJILJIL;
    public final C11NJ LLJILJILJ;
    public final C11RK<C548260Leq> LLJILLL;
    public final ConcurrentHashMap<String, Long> LLJJ;
    public final ConcurrentHashSet<AITheaterCreationModel> LLJJI;
    public AITheaterCreationModel LLJJIII;
    public CreativeModel LLJJIJI;
    public String LLJJIJIIJIL;

    private final String H3() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("generation complete ratio: ");
        sbLIZ.append((this.LLJIJIL - this.LLJJ.size()) / this.LLJIJIL);
        sbLIZ.append(" (completed: ");
        sbLIZ.append(this.LLJIJIL - this.LLJJ.size());
        sbLIZ.append(" / total: ");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC548480LfC, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLJILJILJ.LIZ(this.LLJILLL.LJLIIIL(new AkS472S0100000_8(this, 5)).LJJJJZI(new AkS472S0100000_8(this, 6)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 18)));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        if (!this.LLJJ.isEmpty()) {
            C547860LeC.LIZ.getClass();
            AIAlertService aIAlertServiceLIZJ = C547860LeC.LIZJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(H3());
            sbLIZ.append('\n');
            sbLIZ.append(this.LLJJIJIIJIL);
            aIAlertServiceLIZJ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        Iterator<AITheaterCreationModel> it2 = this.LLJJI.iterator();
        while (it2.hasNext()) {
            this.LLJJIII = it2.next();
            kr();
        }
        this.LLJILJILJ.dispose();
        this.LLJJ.clear();
        this.LLJJI.clear();
    }

    public InterfaceC548570LfL E3() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC548480LfC
    public AITheaterCreationModel X1() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC548480LfC
    public CreativeModel Z1() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJILJIL;
    }

    private final AITheaterGenerationModel B3(String str) {
        AITheaterCreationModel next;
        Iterator<AITheaterCreationModel> it2 = this.LLJJI.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.generationModel.getClientTaskId(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AITheaterCreationModel aITheaterCreationModel = next;
        if (aITheaterCreationModel == null) {
            return null;
        }
        return aITheaterCreationModel.generationModel;
    }

    public final void Q3(C548260Leq c548260Leq) {
        this.LLJILLL.onNext(c548260Leq);
    }

    @Override // X.AbstractC548480LfC
    public void i3(String str) {
        String errorMsg;
        Long lRemove = this.LLJJ.remove(str);
        if (lRemove != null) {
            long jLongValue = lRemove.longValue();
            AITheaterGenerationModel aITheaterGenerationModelB3 = B3(str);
            long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("error: ");
            if (aITheaterGenerationModelB3 != null) {
                errorMsg = aITheaterGenerationModelB3.getErrorMsg();
            } else {
                errorMsg = null;
            }
            sbLIZ.append(errorMsg);
            O3(str, jCurrentTimeMillis, C2188811AlT.LIZIZ(sbLIZ), true);
        }
    }

    @Override // X.AbstractC548480LfC
    public void m3(String str) {
        this.LLJJ.put(str, Long.valueOf(System.currentTimeMillis()));
        C547140Ld2 c547140Ld2 = C537540L6i.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("workflow started, trace_id=");
        sbLIZ.append(str);
        c547140Ld2.LIZ("AITheaterGenerationStressTestLogicComponent", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC548480LfC
    public void q3(String str) {
        Long lValueOf;
        Long lRemove = this.LLJJ.remove(str);
        if (lRemove != null) {
            long jLongValue = lRemove.longValue();
            AITheaterGenerationModel aITheaterGenerationModelB3 = B3(str);
            long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("et: ");
            List<String> results = null;
            if (aITheaterGenerationModelB3 != null) {
                lValueOf = Long.valueOf(aITheaterGenerationModelB3.getDurationMs());
            } else {
                lValueOf = null;
            }
            sbLIZ.append(lValueOf);
            sbLIZ.append(" url: ");
            if (aITheaterGenerationModelB3 != null) {
                results = aITheaterGenerationModelB3.getResults();
            }
            sbLIZ.append(results);
            O3(str, jCurrentTimeMillis, C2188811AlT.LIZIZ(sbLIZ), false);
        }
    }

    public C550940LjA(C1DRG c1drg, int i) {
        super(c1drg);
        this.LLJIJIL = i;
        this.LLJILJIL = this;
        this.LLJILJILJ = new C11NJ();
        this.LLJILLL = new C11RK<>();
        this.LLJJ = new ConcurrentHashMap<>();
        this.LLJJI = new ConcurrentHashSet<>();
        this.LLJJIJIIJIL = "";
    }

    private final void O3(String str, long j, String str2, boolean z) {
        String str3;
        if (z) {
            C547140Ld2 c547140Ld2 = C537540L6i.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("workflow failed: trace_id=");
            sbLIZ.append(str);
            sbLIZ.append(" duration: ");
            sbLIZ.append(j);
            sbLIZ.append(' ');
            sbLIZ.append(str2);
            c547140Ld2.LIZIZ("AITheaterGenerationStressTestLogicComponent", C2188811AlT.LIZIZ(sbLIZ), null);
        } else {
            C547140Ld2 c547140Ld22 = C537540L6i.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("workflow success: trace_id=");
            sbLIZ2.append(str);
            sbLIZ2.append(" duration: ");
            sbLIZ2.append(j);
            sbLIZ2.append(' ');
            sbLIZ2.append(str2);
            c547140Ld22.LIZ("AITheaterGenerationStressTestLogicComponent", C2188811AlT.LIZIZ(sbLIZ2));
        }
        C537540L6i.LIZ.LIZ("AITheaterGenerationStressTestLogicComponent", H3());
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(this.LLJJIJIIJIL);
        if (z) {
            str3 = "failed: ";
        } else {
            str3 = "success: ";
        }
        sbLIZ3.append(str3);
        sbLIZ3.append(str);
        sbLIZ3.append(" duration: ");
        sbLIZ3.append(j);
        sbLIZ3.append(" \n");
        this.LLJJIJIIJIL = C2188811AlT.LIZIZ(sbLIZ3);
        if (this.LLJJ.isEmpty()) {
            C547860LeC.LIZ.getClass();
            AIAlertService aIAlertServiceLIZJ = C547860LeC.LIZJ();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(H3());
            sbLIZ4.append('\n');
            sbLIZ4.append(this.LLJJIJIIJIL);
            aIAlertServiceLIZJ.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
        }
    }
}
