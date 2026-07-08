package X;

import com.ss.android.ugc.aweme.search.performance.core.config.SearchEnterBackgroundReleasePlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0PAr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.autoplay.viewmodel.SearchPlayerBackgroundReleaseManager$countdownForRelease$1$1", f = "SearchPlayerBackgroundReleaseManager.kt", l = {44}, m = "invokeSuspend")
public final class C640590PAr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C640590PAr(InterfaceC1364105Vn<? super C640590PAr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C640590PAr(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchPlayerBackgroundReleaseManager@fee2.countdownForRelease$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C639270P5p.LIZ.getClass();
            long j = ((SearchEnterBackgroundReleasePlayer) C639270P5p.LIZJ.getValue()).enterBackgroundTime;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("SearchPlayerBackgroundReleaseManager@fee2.countdownForRelease$1$1");
                return objLJFF;
            }
        }
        if (C2214201BlK.LJIIJJI) {
            C640060P8q.LIZ.LJ();
        } else {
            C0P5D.LIZIZ = null;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchPlayerBackgroundReleaseManager@fee2.countdownForRelease$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C640590PAr(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
