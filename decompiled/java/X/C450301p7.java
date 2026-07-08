package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.01p7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.link.LinkPrivacyNoticeController$buildSwitchItem$1$1", f = "LinkPrivacyNoticeController.kt", l = {263, 264, 268}, m = "invokeSuspend")
public final class C450301p7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C451201pG LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ CancellationException LLILZIL;
    public final /* synthetic */ C127A LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C450301p7(C451201pG c451201pG, boolean z, CancellationException cancellationException, C127A c127a, InterfaceC1364105Vn<? super C450301p7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c451201pG;
        this.LLILZ = z;
        this.LLILZIL = cancellationException;
        this.LLILZLL = c127a;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C450301p7(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LinkPrivacyNoticeController@c451.buildSwitchItem$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
        } catch (Throwable th) {
            th = th;
            TryCatchGuardChecker.doCheck(th);
            if (!Intrinsics.LJFF(th, this.LLILZIL)) {
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C450201p6 c450201p6 = new C450201p6(this.LLILZLL, this.LLILZ, null);
                this.LL = th;
                this.LLILLJJLI = 3;
                if (C23250099c.LJI(this, abstractC2238408pq, c450201p6) == objLJFF) {
                    C1C7U.LIZIZ("LinkPrivacyNoticeController@c451.buildSwitchItem$1$1");
                    return objLJFF;
                }
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        th = (Throwable) this.LL;
                        C155000ia.LIZIZ(obj);
                        int i2 = C2187451AjH.LIZ;
                        C1720106oR.LIZIZ("@LinkRelation", "update switch error", th);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("LinkPrivacyNoticeController@c451.buildSwitchItem$1$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("switch the privacy ");
                sbLIZ.append(this.LLILZ);
                C1720106oR.LJI("@LinkRelation", C2188811AlT.LIZIZ(sbLIZ));
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("LinkPrivacyNoticeController@c451.buildSwitchItem$1$1");
                return unit2;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLJJLI = 1;
            if (AnonymousClass0958.LIZIZ(300L, this) == objLJFF) {
                C1C7U.LIZIZ("LinkPrivacyNoticeController@c451.buildSwitchItem$1$1");
                return objLJFF;
            }
        }
        C451201pG c451201pG = this.LLILLL;
        boolean z = this.LLILZ;
        this.LLILLJJLI = 2;
        if (c451201pG.LIZJ(z, this) == objLJFF) {
            C1C7U.LIZIZ("LinkPrivacyNoticeController@c451.buildSwitchItem$1$1");
            return objLJFF;
        }
        int i32 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("switch the privacy ");
        sbLIZ2.append(this.LLILZ);
        C1720106oR.LJI("@LinkRelation", C2188811AlT.LIZIZ(sbLIZ2));
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("LinkPrivacyNoticeController@c451.buildSwitchItem$1$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
