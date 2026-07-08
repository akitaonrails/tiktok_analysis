package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Zir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.data.searchcontent.GroupSearchContentUpdateEngine$4", f = "GroupSearchContentUpdateEngine.kt", l = {63}, m = "invokeSuspend")
public final class C907470Zir extends C09AX implements InterfaceC1631620sYq<List<? extends C907840ZjS>, C907790ZjN, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public /* synthetic */ C907790ZjN LLILLL;
    public final /* synthetic */ Function1<String, Unit> LLILZ;
    public final /* synthetic */ Function0<String> LLILZIL;
    public final /* synthetic */ InterfaceC907650Zj9 LLILZLL;
    public final /* synthetic */ C1231704rr LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C907470Zir(Function1<? super String, Unit> function1, Function0<String> function0, InterfaceC907650Zj9 interfaceC907650Zj9, C1231704rr c1231704rr, InterfaceC1364105Vn<? super C907470Zir> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = function1;
        this.LLILZIL = function0;
        this.LLILZLL = interfaceC907650Zj9;
        this.LLIZ = c1231704rr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupSearchContentUpdateEngine@13e9.<init>$4");
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
            List list = (List) this.LLILLJJLI;
            C907790ZjN c907790ZjN = this.LLILLL;
            C907810ZjP c907810ZjP = C907810ZjP.LIZ;
            AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(list, (List<C907840ZjS>) 1492);
            Function1<String, Unit> function1 = this.LLILZ;
            Function0<String> function0 = this.LLILZIL;
            InterfaceC907650Zj9 interfaceC907650Zj9 = this.LLILZLL;
            C1231704rr c1231704rr = this.LLIZ;
            this.LLILLJJLI = null;
            this.LL = 1;
            if (c907810ZjP.LIZ(1, awS558S0100000_14, function1, function0, interfaceC907650Zj9, c1231704rr, c907790ZjN, new C907850ZjT(c907810ZjP), new C907420Zim(c907810ZjP), C907810ZjP.LIZIZ, this) == objLJFF) {
                C1C7U.LIZIZ("GroupSearchContentUpdateEngine@13e9.<init>$4");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupSearchContentUpdateEngine@13e9.<init>$4");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(List<? extends C907840ZjS> list, C907790ZjN c907790ZjN, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C907470Zir c907470Zir = new C907470Zir(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c907470Zir.LLILLJJLI = list;
        c907470Zir.LLILLL = c907790ZjN;
        return c907470Zir.invokeSuspend(Unit.LIZ);
    }
}
