package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import defpackage.k9;
import defpackage.r2;
import defpackage.w2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Cgr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageOperatorHandler$handleMessageLoaded$4", f = "MessageOperatorHandler.kt", l = {2029}, m = "invokeSuspend")
public final class C320190Cgr extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ r2 LLILLJJLI;
    public final /* synthetic */ List<Message> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ k9 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320190Cgr(r2 r2Var, List<Message> list, boolean z, boolean z2, k9 k9Var, InterfaceC1364105Vn<? super C320190Cgr> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = r2Var;
        this.LLILLL = list;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = k9Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320190Cgr(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageOperatorHandler@b589.handleMessageLoaded$4");
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
            C05YC c05ycLIZ = C1863380yae.LJJII.LIZ(C2286608xc.LJ(this.LLILLJJLI.LJIILLIIL.LJIIIIZZ), C2286608xc.LJFF(this.LLILLJJLI.LJIILLIIL.LJII), this.LLILLJJLI.LJIILLIIL.LJIILIIL);
            if (c05ycLIZ != null) {
                w2 w2Var = new w2(w2.a.HISTORY, this.LLILLL, this.LLILZ, this.LLILZIL, false, 0, null, null, this.LLILZLL, 240);
                this.LL = 1;
                if (c05ycLIZ.emit(w2Var, this) == objLJFF) {
                    C1C7U.LIZIZ("MessageOperatorHandler@b589.handleMessageLoaded$4");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageOperatorHandler@b589.handleMessageLoaded$4");
        return unit;
    }
}
