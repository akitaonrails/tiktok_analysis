package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.templatedownload.ResizeMediasManager$waitJobResult$1", f = "ResizeMediasManager.kt", l = {116}, m = "invokeSuspend")
public final class C352460Dro extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C352460Dro(String str, Function0<Unit> function0, InterfaceC1364105Vn<? super C352460Dro> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C352460Dro(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0957<Unit> anonymousClass0957;
        C1C7U.LIZ("ResizeMediasManager@4d3.waitJobResult$1");
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
            C352470Drp c352470Drp = C352470Drp.LIZ;
            String str = this.LLILLJJLI;
            c352470Drp.getClass();
            C352510Drt c352510DrtLIZJ = C352470Drp.LIZJ(str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("waitJobResult: resizeJob = ");
            sbLIZ.append(c352510DrtLIZJ);
            C352470Drp.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            if (c352510DrtLIZJ != null && (anonymousClass0957 = c352510DrtLIZJ.LIZ) != null) {
                this.LL = 1;
                if (anonymousClass0957.LJLIIIL(this) == objLJFF) {
                    C1C7U.LIZIZ("ResizeMediasManager@4d3.waitJobResult$1");
                    return objLJFF;
                }
            }
        }
        this.LLILLL.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ResizeMediasManager@4d3.waitJobResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
