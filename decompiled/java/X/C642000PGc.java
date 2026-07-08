package X;

import android.os.Looper;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.ui.SearchTopBarAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PGc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C642000PGc extends C09AY implements Function1<InterfaceC1541990qEH, Unit> {
    public final /* synthetic */ SearchTopBarAssem LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C647810Pb1 LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C642000PGc(SearchTopBarAssem searchTopBarAssem, boolean z, C647810Pb1 c647810Pb1, long j) {
        super(1);
        this.LL = searchTopBarAssem;
        this.LLILLJJLI = z;
        this.LLILLL = c647810Pb1;
        this.LLILZ = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1541990qEH interfaceC1541990qEH) {
        C1537720q7O c1537720q7O;
        C647830Pb3 c647830Pb3;
        C647810Pb1 c647810Pb1;
        C647830Pb3 c647830Pb32;
        C1537720q7O c1537720q7O2;
        InterfaceC1541990qEH interfaceC1541990qEH2 = interfaceC1541990qEH;
        SearchTopBarAssem searchTopBarAssem = this.LL;
        boolean z = interfaceC1541990qEH2 instanceof C1537720q7O;
        if (z) {
            c1537720q7O = (C1537720q7O) interfaceC1541990qEH2;
        } else {
            c1537720q7O = null;
        }
        searchTopBarAssem.LLJJIJIL = c1537720q7O;
        if (z && (c1537720q7O2 = (C1537720q7O) interfaceC1541990qEH2) != null) {
            AwS411S0200000_10 awS411S0200000_10 = new AwS411S0200000_10(c1537720q7O2, searchTopBarAssem, 91);
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                awS411S0200000_10.invoke();
            } else {
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(searchTopBarAssem);
                C09U0 c09u0 = searchTopBarAssem.LLJLIL;
                if (c09u0 == null) {
                    synchronized (searchTopBarAssem) {
                        c09u0 = searchTopBarAssem.LLJLIL;
                        if (c09u0 == null) {
                            c09u0 = (C09U0) C1807670x8n.p();
                            searchTopBarAssem.LLJLIL = c09u0;
                        }
                    }
                }
                C23250099c.LIZLLL(lifecycleScope, c09u0.LIZJ, null, new C319101Lp(awS411S0200000_10, null), 2);
            }
        }
        if (C0BC4.LIZ()) {
            if (!this.LLILLJJLI && (c647810Pb1 = this.LLILLL) != null && (c647830Pb32 = c647810Pb1.LL) != null) {
                SearchTopBarAssem searchTopBarAssem2 = this.LL;
                long j = this.LLILZ;
                C1537720q7O c1537720q7O3 = searchTopBarAssem2.LLJJIJIL;
                if (c1537720q7O3 != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("lynxBindTime", j);
                    jSONObject.put("lynxRealLoadUpdateTime", c647830Pb32.LJJ);
                    jSONObject.put("completeDataUpdated", 1);
                    jSONObject.put("hitPredict", 0);
                    c1537720q7O3.LIZ("onRealDataReady", jSONObject);
                }
            }
        } else {
            C647810Pb1 c647810Pb12 = this.LLILLL;
            if (c647810Pb12 != null && (c647830Pb3 = c647810Pb12.LL) != null) {
                SearchTopBarAssem searchTopBarAssem3 = this.LL;
                long j2 = this.LLILZ;
                C1537720q7O c1537720q7O4 = searchTopBarAssem3.LLJJIJIL;
                if (c1537720q7O4 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("lynxBindTime", j2);
                    jSONObject2.put("lynxRealLoadUpdateTime", c647830Pb3.LJJ);
                    jSONObject2.put("completeDataUpdated", 1);
                    jSONObject2.put("hitPredict", 0);
                    c1537720q7O4.LIZ("onRealDataReady", jSONObject2);
                }
            }
        }
        return Unit.LIZ;
    }
}
