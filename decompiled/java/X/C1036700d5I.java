package X;

import android.app.Application;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0d5I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1036700d5I {
    public final C1030390cv7 LIZ;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0cv7] */
    public C1036700d5I() {
        C2214201BlK.LJ().LIZIZ(new C11N2<Application>() { // from class: X.0d5J
            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(Object obj) {
                LJIIIZ(-1);
            }
        });
        this.LIZ = new C603820NmG<String, C1030380cv6>() { // from class: X.0cv7
            @Override // X.C603820NmG
            public final void LIZIZ(Object obj, Object obj2, Object obj3) {
                Unit unit;
                InterfaceC1030430cvB interfaceC1030430cvB = ((C1030380cv6) obj2).LIZ;
                if (interfaceC1030430cvB == null) {
                    unit = null;
                } else {
                    try {
                        interfaceC1030430cvB.release();
                        unit = Unit.LIZ;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                        return;
                    }
                }
                C189200o6.m2constructorimpl(unit);
            }
        };
    }
}
