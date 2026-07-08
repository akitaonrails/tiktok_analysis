package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Extra;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import defpackage.k9;
import defpackage.r2;
import defpackage.x2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Cgw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageOperatorHandler$handleMessageUpdate$2", f = "MessageOperatorHandler.kt", l = {1754}, m = "invokeSuspend")
public final class C320240Cgw extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ r2 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Message LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Extra LLIZ;
    public final /* synthetic */ k9 LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320240Cgw(r2 r2Var, String str, Message message, int i, String str2, Extra extra, k9 k9Var, InterfaceC1364105Vn<? super C320240Cgw> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = r2Var;
        this.LLILLL = str;
        this.LLILZ = message;
        this.LLILZIL = i;
        this.LLILZLL = str2;
        this.LLIZ = extra;
        this.LLIZLLLIL = k9Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320240Cgw(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageOperatorHandler@b589.handleMessageUpdate$2");
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
            C05YC c05ycLIZIZ = C1863380yae.LJJII.LIZIZ(C2286608xc.LJ(this.LLILLJJLI.LJIILLIIL.LJIIIIZZ), C2286608xc.LJFF(this.LLILLJJLI.LJIILLIIL.LJII), this.LLILLL);
            if (c05ycLIZIZ != null) {
                x2 x2Var = new x2(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL);
                this.LL = 1;
                if (c05ycLIZIZ.emit(x2Var, this) == objLJFF) {
                    C1C7U.LIZIZ("MessageOperatorHandler@b589.handleMessageUpdate$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageOperatorHandler@b589.handleMessageUpdate$2");
        return unit;
    }
}
