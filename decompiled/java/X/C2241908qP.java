package X;

import com.ss.android.ugc.aweme.verify.BaseVerifyFragment;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08qP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.verify.BaseVerifyFragment$sendVerifyEventOnRetentionPopupButtonsPressed$1", f = "BaseVerifyFragment.kt", l = {106}, m = "invokeSuspend")
public final class C2241908qP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ BaseVerifyFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2241908qP(BaseVerifyFragment baseVerifyFragment, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = baseVerifyFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2241908qP(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseVerifyFragment@4f77.sendVerifyEventOnRetentionPopupButtonsPressed$1");
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
            Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("extra", this.LLILLJJLI));
            C1713570uh1 c1713570uh1SR = this.LLILLL.SR();
            if (c1713570uh1SR != null) {
                String eventName = EnumC2242008qQ.RETENTION_PAGE_CLICK.getEventName();
                this.LL = 1;
                if (c1713570uh1SR.LJIILIIL(eventName, mapLJIIJ, this) == objLJFF) {
                    C1C7U.LIZIZ("BaseVerifyFragment@4f77.sendVerifyEventOnRetentionPopupButtonsPressed$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseVerifyFragment@4f77.sendVerifyEventOnRetentionPopupButtonsPressed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
