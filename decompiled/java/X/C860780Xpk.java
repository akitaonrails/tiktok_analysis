package X;

import com.ss.android.ugc.aweme.component.bio.biometric.enroll.BioEnrollStepFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xpk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.bio.biometric.enroll.BioEnrollStepFragment$showSuccessToastAndFinish$1", f = "BioEnrollStepFragment.kt", l = {260}, m = "invokeSuspend")
public final class C860780Xpk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BioEnrollStepFragment LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860780Xpk(BioEnrollStepFragment bioEnrollStepFragment, int i, InterfaceC1364105Vn<? super C860780Xpk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bioEnrollStepFragment;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C860780Xpk(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BioEnrollStepFragment@5a3e.showSuccessToastAndFinish$1");
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
            C1389880mGw c1389880mGw = new C1389880mGw(this.LLILLJJLI);
            c1389880mGw.LJFF(-1);
            c1389880mGw.LIZLLL(3000L);
            if (this.LLILLL == 2) {
                c1389880mGw.LJIIIIZZ(2131840092);
                c1389880mGw.LJ(R.raw.icon_exclamation_mark_triangle);
            } else {
                c1389880mGw.LJIIIIZZ(2131840145);
                c1389880mGw.LJ(R.raw.icon_tick);
            }
            c1389880mGw.LJIIJ();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(3000L, this) == objLJFF) {
                C1C7U.LIZIZ("BioEnrollStepFragment@5a3e.showSuccessToastAndFinish$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.MR(null, true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BioEnrollStepFragment@5a3e.showSuccessToastAndFinish$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
