package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.otis.ultimate.inflater.compat.lifecycle.AndroidXLifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.17p4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21146017p4 extends C09AY implements Function0<List<InterfaceC1567700qtk>> {
    public C21146017p4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<InterfaceC1567700qtk> invoke() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(C21145617p0.LIZ.LJI);
        try {
            C21146117p5.LIZIZ.getClass();
            ((C21146117p5) C21146117p5.LIZ.getValue()).getClass();
            C189200o6.m2constructorimpl(Boolean.valueOf(arrayList.add(new InterfaceC1567700qtk() { // from class: X.0qtj
                @Override // X.InterfaceC1567700qtk
                public final AndroidXLifecycleOwner LIZ(Activity activity) {
                    if (activity instanceof LifecycleOwner) {
                        return new AndroidXLifecycleOwner(activity);
                    }
                    return null;
                }
            })));
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return arrayList;
        }
    }
}
