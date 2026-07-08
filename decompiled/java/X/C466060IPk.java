package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IPk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity$submitKeywordMessage$2$1$1", f = "BaAutoReplyEditActivity.kt", l = {292, 294}, m = "invokeSuspend")
public final class C466060IPk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BaAutoReplyEditActivity LLILLL;
    public final /* synthetic */ C475600Ikw LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C466060IPk(BaAutoReplyEditActivity baAutoReplyEditActivity, C475600Ikw c475600Ikw, InterfaceC1364105Vn<? super C466060IPk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = baAutoReplyEditActivity;
        this.LLILZ = c475600Ikw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C466060IPk c466060IPk = new C466060IPk(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c466060IPk.LLILLJJLI = obj;
        return c466060IPk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        boolean zBooleanValue;
        C1C7U.LIZ("BaAutoReplyEditActivity@7146.submitKeywordMessage$2$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                    zBooleanValue = ((Boolean) obj).booleanValue();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            BaAutoReplyEditActivity baAutoReplyEditActivity = this.LLILLL;
            if (baAutoReplyEditActivity.LLJJIJIIJIL.LIZIZ == 1) {
                IBaAutoMessageService iBaAutoMessageService = baAutoReplyEditActivity.LLJJIJI;
                C475600Ikw c475600Ikw = this.LLILZ;
                this.LLILLJJLI = interfaceC497601wk;
                this.LL = 1;
                obj = iBaAutoMessageService.LIZJ(c475600Ikw, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BaAutoReplyEditActivity@7146.submitKeywordMessage$2$1$1");
                    return objLJFF;
                }
                zBooleanValue = ((Boolean) obj).booleanValue();
            } else {
                IBaAutoMessageService iBaAutoMessageService2 = baAutoReplyEditActivity.LLJJIJI;
                C475600Ikw c475600Ikw2 = this.LLILZ;
                this.LLILLJJLI = interfaceC497601wk;
                this.LL = 2;
                obj = iBaAutoMessageService2.LJIILJJIL(c475600Ikw2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BaAutoReplyEditActivity@7146.submitKeywordMessage$2$1$1");
                    return objLJFF;
                }
                zBooleanValue = ((Boolean) obj).booleanValue();
            }
        }
        if (zBooleanValue) {
            C0J21.LIZLLL(5);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C466050IPj(this.LLILLL, null), 2);
            this.LLILLL.finish();
        } else {
            C1DFH c1dfh2 = C0PEM.LIZ;
            C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C466040IPi(this.LLILLL, null), 2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaAutoReplyEditActivity@7146.submitKeywordMessage$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
