package X;

import Y.AgS210S0200000_27;
import com.ss.android.ugc.aweme.IMAiGroupShotConfig;
import com.ss.android.ugc.aweme.contactselect.ContactSelectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wVt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.contactselect.ContactSelectViewModel$loadContact$3", f = "ContactSelectViewModel.kt", l = {310}, m = "invokeSuspend")
public final class C1783550wVt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ContactSelectViewModel LLILLJJLI;
    public final /* synthetic */ IMAiGroupShotConfig.ContactSelectConfig.Selecting LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1783550wVt(ContactSelectViewModel contactSelectViewModel, IMAiGroupShotConfig.ContactSelectConfig.Selecting selecting, InterfaceC1364105Vn<? super C1783550wVt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = contactSelectViewModel;
        this.LLILLL = selecting;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1783550wVt(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ContactSelectViewModel@2c62.loadContact$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0951 anonymousClass0951 = C1783520wVq.LLILLL;
            AgS210S0200000_27 agS210S0200000_27 = new AgS210S0200000_27(this.LLILLJJLI, this.LLILLL, 17);
            this.LL = 1;
            if (anonymousClass0951.collect(agS210S0200000_27, this) == objLJFF) {
                C1C7U.LIZIZ("ContactSelectViewModel@2c62.loadContact$3");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
