package X;

import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.component.bio.biometric.enroll.BioEnrollFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xpl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.bio.biometric.enroll.BioEnrollFragment$onViewCreated$16$1$1$7$1", f = "BioEnrollFragment.kt", l = {579}, m = "invokeSuspend")
public final class C860790Xpl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BioEnrollFragment LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860790Xpl(BioEnrollFragment bioEnrollFragment, int i, InterfaceC1364105Vn<? super C860790Xpl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bioEnrollFragment;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C860790Xpl(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BioEnrollFragment@fcc.onViewCreated$16$1$1$7$1");
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
            int i2 = this.LLILLL;
            if (i2 != 0) {
                if (i2 != 2) {
                    c1389880mGw.LJIIIIZZ(2131840144);
                    c1389880mGw.LJ(R.raw.icon_exclamation_mark_triangle);
                } else {
                    c1389880mGw.LJIIIIZZ(2131840092);
                    c1389880mGw.LJ(R.raw.icon_exclamation_mark_triangle);
                }
            } else {
                c1389880mGw.LJIIIIZZ(2131840145);
                c1389880mGw.LJ(R.raw.icon_tick);
            }
            c1389880mGw.LJIIJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("actionShowResultToast ");
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(" before delay");
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("BioEnrollFragment", C2188811AlT.LIZIZ(sbLIZ));
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(3000L, this) == objLJFF) {
                C1C7U.LIZIZ("BioEnrollFragment@fcc.onViewCreated$16$1$1$7$1");
                return objLJFF;
            }
        }
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("BioEnrollFragment", "actionShowResultToast closePageAndEndProcess");
        this.LLILLJJLI.MR();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BioEnrollFragment@fcc.onViewCreated$16$1$1$7$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
