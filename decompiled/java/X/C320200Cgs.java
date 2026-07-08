package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import defpackage.k9;
import defpackage.r2;
import defpackage.w2;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Cgs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageOperatorHandler$handleMessageReceive$2", f = "MessageOperatorHandler.kt", l = {1951}, m = "invokeSuspend")
public final class C320200Cgs extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ r2 LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Message LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ k9 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320200Cgs(r2 r2Var, boolean z, Message message, int i, k9 k9Var, InterfaceC1364105Vn<? super C320200Cgs> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = r2Var;
        this.LLILLL = z;
        this.LLILZ = message;
        this.LLILZIL = i;
        this.LLILZLL = k9Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320200Cgs(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("MessageOperatorHandler@b589.handleMessageReceive$2");
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
            C1863420yai c1863420yai = C1863380yae.LJJII;
            Long lLJFF = C2286608xc.LJFF(this.LLILLJJLI.LJIILLIIL.LJII);
            Integer numLJ = C2286608xc.LJ(this.LLILLJJLI.LJIILLIIL.LJIIIIZZ);
            if (this.LLILLL) {
                str = this.LLILZ.subConversationId;
            } else {
                str = this.LLILLJJLI.LJIILLIIL.LJIILIIL;
            }
            C05YC c05ycLIZ = c1863420yai.LIZ(numLJ, lLJFF, str);
            if (c05ycLIZ != null) {
                w2 w2Var = new w2(w2.a.NEW, Collections.singletonList(this.LLILZ), false, false, false, this.LLILZIL, null, null, this.LLILZLL, 220);
                this.LL = 1;
                if (c05ycLIZ.emit(w2Var, this) == objLJFF) {
                    C1C7U.LIZIZ("MessageOperatorHandler@b589.handleMessageReceive$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageOperatorHandler@b589.handleMessageReceive$2");
        return unit;
    }
}
