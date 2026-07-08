package X;

import com.ss.android.ugc.aweme.im.protocal.IMAccountsChunkProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iQL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.protocal.IMAccountsChunkProtocol$runMixSearch$2$relationDeferred$1", f = "IMAccountsChunkProtocol.kt", l = {124, 125}, m = "invokeSuspend")
public final class C1241950iQL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1916207ey>, Object> {
    public int LL;
    public final /* synthetic */ IMAccountsChunkProtocol LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1241950iQL(IMAccountsChunkProtocol iMAccountsChunkProtocol, String str, InterfaceC1364105Vn<? super C1241950iQL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMAccountsChunkProtocol;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1241950iQL(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMAccountsChunkProtocol@7f7c.runMixSearch$2$relationDeferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("IMAccountsChunkProtocol@7f7c.runMixSearch$2$relationDeferred$1");
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            long jLIZLLL = this.LLILLJJLI.LJIIJ().LIZLLL();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLIZLLL, this) == objLJFF) {
                C1C7U.LIZIZ("IMAccountsChunkProtocol@7f7c.runMixSearch$2$relationDeferred$1");
                return objLJFF;
            }
        }
        InterfaceC1242030iQT interfaceC1242030iQTLJIIJ = this.LLILLJJLI.LJIIJ();
        String str = this.LLILLL;
        this.LL = 2;
        obj = interfaceC1242030iQTLJIIJ.LJ(str, this);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("IMAccountsChunkProtocol@7f7c.runMixSearch$2$relationDeferred$1");
            return objLJFF;
        }
        C1C7U.LIZIZ("IMAccountsChunkProtocol@7f7c.runMixSearch$2$relationDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1916207ey> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
