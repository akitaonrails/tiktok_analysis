package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import defpackage.k9;
import defpackage.r2;
import defpackage.w2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS548S0100000_4;
import njp.a;

/* JADX INFO: renamed from: X.0Ch8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageOperatorHandler$handleMessageDelete$1", f = "MessageOperatorHandler.kt", l = {1655}, m = "invokeSuspend")
public final class C320360Ch8 extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<Message> LLILLJJLI;
    public final /* synthetic */ r2 LLILLL;
    public final /* synthetic */ k9 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320360Ch8(List<Message> list, r2 r2Var, k9 k9Var, InterfaceC1364105Vn<? super C320360Ch8> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = r2Var;
        this.LLILZ = k9Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320360Ch8(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageOperatorHandler@b589.handleMessageDelete$1");
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
            for (Message message : this.LLILLJJLI) {
                String str = C1863280yaU.LJIILLIIL;
                C1870240yli.LIZ(new AwS548S0100000_4(message, 246), false);
            }
            C05YC c05ycLIZ = C1863380yae.LJJII.LIZ(C2286608xc.LJ(this.LLILLL.LJIILLIIL.LJIIIIZZ), C2286608xc.LJFF(this.LLILLL.LJIILLIIL.LJII), this.LLILLL.LJIILLIIL.LJIILIIL);
            if (c05ycLIZ != null) {
                w2 w2Var = new w2(w2.a.DELETE, this.LLILLJJLI, false, false, false, 0, null, null, this.LLILZ, 252);
                this.LL = 1;
                if (c05ycLIZ.emit(w2Var, this) == objLJFF) {
                    C1C7U.LIZIZ("MessageOperatorHandler@b589.handleMessageDelete$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageOperatorHandler@b589.handleMessageDelete$1");
        return unit;
    }
}
