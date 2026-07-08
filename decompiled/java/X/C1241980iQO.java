package X;

import com.ss.android.ugc.aweme.im.protocal.IMAccountsProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iQO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.protocal.IMAccountsProtocol$runMixSearch$2$localDeferred$1", f = "IMAccountsProtocol.kt", l = {126}, m = "invokeSuspend")
public final class C1241980iQO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1916007ew>, Object> {
    public int LL;
    public final /* synthetic */ IMAccountsProtocol LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1241980iQO(IMAccountsProtocol iMAccountsProtocol, String str, InterfaceC1364105Vn<? super C1241980iQO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMAccountsProtocol;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1241980iQO(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMAccountsProtocol@1ad4.runMixSearch$2$localDeferred$1");
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
            InterfaceC1242030iQT interfaceC1242030iQTLJIILIIL = this.LLILLJJLI.LJIILIIL();
            String str = this.LLILLL;
            this.LL = 1;
            obj = interfaceC1242030iQTLJIILIIL.LJI(str, false, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IMAccountsProtocol@1ad4.runMixSearch$2$localDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("IMAccountsProtocol@1ad4.runMixSearch$2$localDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1916007ew> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
