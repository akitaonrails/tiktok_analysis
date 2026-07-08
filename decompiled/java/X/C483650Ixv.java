package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyListActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Ixv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyListActivity$onResume$1", f = "BaAutoReplyListActivity.kt", l = {81, 99}, m = "invokeSuspend")
public final class C483650Ixv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public BaAutoReplyListActivity LL;
    public int LLILLJJLI;
    public final /* synthetic */ BaAutoReplyListActivity LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C483650Ixv(BaAutoReplyListActivity baAutoReplyListActivity, InterfaceC1364105Vn<? super C483650Ixv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = baAutoReplyListActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C483650Ixv(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        BaAutoReplyListActivity baAutoReplyListActivity;
        C1C7U.LIZ("BaAutoReplyListActivity@76f4.onResume$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("BaAutoReplyListActivity@76f4.onResume$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            baAutoReplyListActivity = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            baAutoReplyListActivity = this.LLILLL;
            IBaAutoMessageService iBaAutoMessageService = baAutoReplyListActivity.LLIZ;
            this.LL = baAutoReplyListActivity;
            this.LLILLJJLI = 1;
            obj = iBaAutoMessageService.LJI(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BaAutoReplyListActivity@76f4.onResume$1");
                return objLJFF;
            }
        }
        List<C475600Ikw> list = (List) obj;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        baAutoReplyListActivity.LLILZLL = list;
        BaAutoReplyListActivity baAutoReplyListActivity2 = this.LLILLL;
        baAutoReplyListActivity2.LLILZIL.LLILLJJLI = baAutoReplyListActivity2.LLILZLL;
        StringBuilder sb = new StringBuilder();
        BaAutoReplyListActivity baAutoReplyListActivity3 = this.LLILLL;
        sb.append(baAutoReplyListActivity3.getResources().getText(2131836298));
        if (C444960Hcc.LIZJ(baAutoReplyListActivity3)) {
            sb.append("(4/");
            sb.append(baAutoReplyListActivity3.LLILZLL.size());
            sb.append(")");
        } else {
            sb.append(e3.h);
            sb.append(baAutoReplyListActivity3.LLILZLL.size());
            sb.append("/4)");
        }
        String string = sb.toString();
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C483640Ixu c483640Ixu = new C483640Ixu(this.LLILLL, string, null);
        this.LL = null;
        this.LLILLJJLI = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c483640Ixu) == objLJFF) {
            C1C7U.LIZIZ("BaAutoReplyListActivity@76f4.onResume$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BaAutoReplyListActivity@76f4.onResume$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
