package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS399S0200000_33;

/* JADX INFO: renamed from: X.09HI, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09HI implements C09HK {
    public static final C09HJ LIZ = new C09HJ();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C09HK
    public final void LIZ(Function0<Unit> function0) {
        try {
            LIZ.getClass();
            ArrayList arrayListLIZIZ = C09HJ.LIZIZ();
            int size = arrayListLIZIZ.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(arrayListLIZIZ, 10));
                Iterator it2 = arrayListLIZIZ.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((C09HE) it2.next()).getImageUrl());
                }
                strArr[i] = arrayList.get(i);
            }
            Unit unit = null;
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C360301ab(strArr, null), 3);
            C675950QfJ.LIZ.getClass();
            C675950QfJ.LIZ().storeStringArray("photo_search_history_record", new String[0]);
            if (function0 != null) {
                function0.invoke();
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.C09HK
    public final void LIZIZ(InterfaceC497601wk interfaceC497601wk, C1A3P c1a3p, C1A3R c1a3r, AwS399S0200000_33 awS399S0200000_33) {
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C360701af(this, c1a3r, awS399S0200000_33, null), 3);
    }
}
