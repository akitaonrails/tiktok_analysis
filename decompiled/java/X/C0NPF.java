package X;

import com.ss.android.ugc.aweme.account.hook.AfterLogoutHook;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NPF, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.AuthSequenceManager$startLogout$1$1", f = "AuthSequenceManager.kt", l = {264}, m = "invokeSuspend")
public final class C0NPF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<AfterLogoutHook> LLILLL;
    public final /* synthetic */ C0XVI LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0NPF(List<? extends AfterLogoutHook> list, C0XVI c0xvi, InterfaceC1364105Vn<? super C0NPF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c0xvi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NPF c0npf = new C0NPF(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0npf.LLILLJJLI = obj;
        return c0npf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AuthSequenceManager@5a17.startLogout$1$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            List<AfterLogoutHook> list = this.LLILLL;
            C0XVI c0xvi = this.LLILZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (AfterLogoutHook afterLogoutHook : list) {
                arrayList.add(C23250099c.LIZLLL(interfaceC497601wk, afterLogoutHook.LJJJLL(), null, new C0NPG(afterLogoutHook, c0xvi, null), 2));
            }
            this.LL = 1;
            if (C1D9F.LIZJ(arrayList, this) == objLJFF) {
                C1C7U.LIZIZ("AuthSequenceManager@5a17.startLogout$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AuthSequenceManager@5a17.startLogout$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
