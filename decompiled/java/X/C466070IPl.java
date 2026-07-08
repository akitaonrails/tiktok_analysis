package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IPl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity$deleteKeywordMessage$1$1$1", f = "BaAutoReplyEditActivity.kt", l = {325}, m = "invokeSuspend")
public final class C466070IPl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BaAutoReplyEditActivity LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C466070IPl(BaAutoReplyEditActivity baAutoReplyEditActivity, InterfaceC1364105Vn<? super C466070IPl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = baAutoReplyEditActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C466070IPl c466070IPl = new C466070IPl(this.LLILLL, interfaceC1364105Vn);
        c466070IPl.LLILLJJLI = obj;
        return c466070IPl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("BaAutoReplyEditActivity@7146.deleteKeywordMessage$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            BaAutoReplyEditActivity baAutoReplyEditActivity = this.LLILLL;
            IBaAutoMessageService iBaAutoMessageService = baAutoReplyEditActivity.LLJJIJI;
            C475600Ikw c475600Ikw = baAutoReplyEditActivity.LLJJIJIIJIL;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            obj = iBaAutoMessageService.LIZIZ(c475600Ikw, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BaAutoReplyEditActivity@7146.deleteKeywordMessage$1$1$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            C0J21.LIZLLL(7);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C466080IPm(this.LLILLL, null), 2);
            this.LLILLL.finish();
        } else {
            this.LLILLL.LLZLI(true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaAutoReplyEditActivity@7146.deleteKeywordMessage$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
