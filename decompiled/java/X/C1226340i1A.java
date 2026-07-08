package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.internalshare.impl.external.ThirdPartyAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i1A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.external.ThirdPartyAssem$initShareChannelBar$1$2$onChannelShare$2$1", f = "ThirdPartyAssem.kt", l = {97}, m = "invokeSuspend")
public final class C1226340i1A extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ ThirdPartyAssem LLILLL;
    public final /* synthetic */ Fragment LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1226340i1A(C19EG c19eg, ThirdPartyAssem thirdPartyAssem, Fragment fragment, InterfaceC1364105Vn<? super C1226340i1A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19eg;
        this.LLILLL = thirdPartyAssem;
        this.LLILZ = fragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1226340i1A(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ThirdPartyAssem@bf53.initShareChannelBar$1$2$onChannelShare$2$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("ThirdPartyAssem@bf53.initShareChannelBar$1$2$onChannelShare$2$1");
                return objLJFF;
            }
        }
        C895170Z9v.LIZ(this.LLILLJJLI, ((C1226350i1B) this.LLILLL.LLIZLLLIL.getValue()).LLILLJJLI, ((C1226350i1B) this.LLILLL.LLIZLLLIL.getValue()).LLILZ);
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this.LLILZ, new C572640Md4());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ThirdPartyAssem@bf53.initShareChannelBar$1$2$onChannelShare$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
