package X;

import com.ss.android.ugc.aweme.main.assems.mainfragment.IMFAbility;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFUGAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TeZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.main.assems.mainfragment.MFUGAssem$onParentViewCreated$5", f = "MFUGAssem.kt", l = {}, m = "invokeSuspend")
public final class C751930TeZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MFUGAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751930TeZ(MFUGAssem mFUGAssem, InterfaceC1364105Vn<? super C751930TeZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mFUGAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751930TeZ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MFUGAssem@141a.onParentViewCreated$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MFUGAssem mFUGAssem = this.LL;
        InterfaceC752360TfG interfaceC752360TfGMb = null;
        IMFAbility iMFAbility = (IMFAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IMFAbility.class, null);
        if (iMFAbility != null) {
            interfaceC752360TfGMb = iMFAbility.mb();
        }
        mFUGAssem.LLILLJJLI = interfaceC752360TfGMb;
        MFUGAssem mFUGAssem2 = this.LL;
        InterfaceC752360TfG interfaceC752360TfG = mFUGAssem2.LLILLJJLI;
        if (interfaceC752360TfG != null) {
            interfaceC752360TfG.LIZ(mFUGAssem2);
        }
        MFUGAssem mFUGAssem3 = this.LL;
        InterfaceC752360TfG interfaceC752360TfG2 = mFUGAssem3.LLILLJJLI;
        if (interfaceC752360TfG2 != null) {
            interfaceC752360TfG2.LJFF(mFUGAssem3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MFUGAssem@141a.onParentViewCreated$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
