package X;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS606S0100000_27;
import njp.a;

/* JADX INFO: renamed from: X.0wuW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.systemshare.SystemShareViewModel$SystemShareDestinationHandler$handleNextStepPostDurationValidation$1$1$1", f = "SystemShareViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1798820wuW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1798820wuW(C19EG c19eg, boolean z, InterfaceC1364105Vn<? super C1798820wuW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19eg;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1798820wuW(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strJ4;
        C1C7U.LIZ("SystemShareViewModel$SystemShareDestinationHandler@6795.handleNextStepPostDurationValidation$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19EG c19eg = this.LL;
        C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
        c1397580mTM.LJI(c19eg.getString(2131824832));
        if (this.LLILLJJLI) {
            strJ4 = this.LL.getString(2131824830);
        } else {
            strJ4 = C786410Ut5.j4(this.LL.getString(2131824827), Arrays.copyOf(new Object[]{"10"}, 1));
        }
        c1397580mTM.LIZIZ(strJ4);
        c1397580mTM.LJII = false;
        C985403tE.LIZ(c1397580mTM, new AwS606S0100000_27(this.LL, 178));
        new C1397510mTF(c1397580mTM).LIZLLL();
        C1850540yFw c1850540yFw = C1850540yFw.LIZ;
        C1B4F c1b4f = C1B4F.LJJII;
        c1850540yFw.getClass();
        C1850540yFw.LIZ(c1b4f);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SystemShareViewModel$SystemShareDestinationHandler@6795.handleNextStepPostDurationValidation$1$1$1");
        return unit;
    }
}
