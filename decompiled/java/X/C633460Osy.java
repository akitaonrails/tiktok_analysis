package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Osy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "tiktok.compose.paging.PagingLazyColumnKt$PagingLazyColumn$2$1", f = "PagingLazyColumn.kt", l = {93}, m = "invokeSuspend")
public final class C633460Osy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1690080u58 LLILLL;
    public final /* synthetic */ C636330Oxb LLILZ;
    public final /* synthetic */ C05P0<Boolean> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C633460Osy(boolean z, C1690080u58 c1690080u58, C636330Oxb c636330Oxb, C05P0<Boolean> c05p0, InterfaceC1364105Vn<? super C633460Osy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c1690080u58;
        this.LLILZ = c636330Oxb;
        this.LLILZIL = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C633460Osy(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int index;
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
            if (this.LLILLJJLI && this.LLILZIL.getValue().booleanValue()) {
                InterfaceC1564820qp6 interfaceC1564820qp6LJIIIZ = this.LLILLL.LJIIIZ();
                int iLJFF = interfaceC1564820qp6LJIIIZ.LJFF();
                C06XG c06xg = (C06XG) C13LP.LJJLIIIJL(interfaceC1564820qp6LJIIIZ.LJII());
                if (c06xg != null) {
                    index = c06xg.getIndex();
                } else {
                    index = 0;
                }
                if (iLJFF > 0 && index >= (iLJFF - this.LLILZ.LIZ) - 1) {
                    C1690080u58 c1690080u58 = this.LLILLL;
                    this.LL = 1;
                    if (c1690080u58.LJFF(iLJFF, 0, this) == objLJFF) {
                        return objLJFF;
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
