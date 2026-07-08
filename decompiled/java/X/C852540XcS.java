package X;

import com.ss.android.ugc.aweme.account.model.SafeEnvV2Response;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XcS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment$performIDVCheck$1$1", f = "BaseUpdatePasswordFragment.kt", l = {770, 771}, m = "invokeSuspend")
public final class C852540XcS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BaseUpdatePasswordFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C852540XcS(BaseUpdatePasswordFragment baseUpdatePasswordFragment, InterfaceC1364105Vn<? super C852540XcS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baseUpdatePasswordFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C852540XcS(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseUpdatePasswordFragment@1cae.performIDVCheck$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("BaseUpdatePasswordFragment@1cae.performIDVCheck$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C852610XcZ c852610XcZ = InterfaceC852600XcY.LIZ;
            EnumC852630Xcb enumC852630Xcb = EnumC852630Xcb.CHANGE_PASSWORD;
            this.LL = 1;
            obj = c852610XcZ.LIZIZ(enumC852630Xcb, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BaseUpdatePasswordFragment@1cae.performIDVCheck$1$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C852550XcT c852550XcT = new C852550XcT((SafeEnvV2Response) obj, this.LLILLJJLI, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c852550XcT) == objLJFF) {
            C1C7U.LIZIZ("BaseUpdatePasswordFragment@1cae.performIDVCheck$1$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BaseUpdatePasswordFragment@1cae.performIDVCheck$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
