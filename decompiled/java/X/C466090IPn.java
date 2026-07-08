package X;

import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IPn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity$onCreate$4", f = "BaAutoReplyEditActivity.kt", l = {123}, m = "invokeSuspend")
public final class C466090IPn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ BaAutoReplyEditActivity LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C466090IPn(long j, BaAutoReplyEditActivity baAutoReplyEditActivity, InterfaceC1364105Vn<? super C466090IPn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
        this.LLILZ = baAutoReplyEditActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C466090IPn c466090IPn = new C466090IPn(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c466090IPn.LLILLJJLI = obj;
        return c466090IPn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        Object next;
        C1C7U.LIZ("BaAutoReplyEditActivity@7146.onCreate$4");
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
            if (this.LLILLL != 0) {
                IBaAutoMessageService iBaAutoMessageService = this.LLILZ.LLJJIJI;
                this.LLILLJJLI = interfaceC497601wk;
                this.LL = 1;
                obj = iBaAutoMessageService.LJI(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BaAutoReplyEditActivity@7146.onCreate$4");
                    return objLJFF;
                }
            }
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C475610Ikx(this.LLILZ, null), 2);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BaAutoReplyEditActivity@7146.onCreate$4");
            return unit;
        }
        List list = (List) obj;
        if (list != null) {
            long j = this.LLILLL;
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((C475600Ikw) next).LIZ == j) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C475600Ikw c475600Ikw = (C475600Ikw) next;
            if (c475600Ikw != null) {
                this.LLILZ.LLJJIJIIJIL = c475600Ikw;
                C1DFH c1dfh2 = C0PEM.LIZ;
                C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C475610Ikx(this.LLILZ, null), 2);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("BaAutoReplyEditActivity@7146.onCreate$4");
                return unit2;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("BaAutoReplyEditActivity@7146.onCreate$4");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
