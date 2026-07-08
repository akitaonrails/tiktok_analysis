package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.service.IShareStatusKeva;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Do, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.helper.IMContactManager$reloadContacts$1", f = "IMContactManager.kt", l = {697}, m = "invokeSuspend")
public final class C1317405Do extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1317405Do(long j, InterfaceC1364105Vn<? super C1317405Do> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1317405Do(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMContactManager@fb8a.reloadContacts$1");
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
            long j = this.LLILLJJLI;
            if (j > 0) {
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("IMContactManager@fb8a.reloadContacts$1");
                    return objLJFF;
                }
            }
            C1BG1.LIZ.getClass();
            C23250099c.LIZLLL(C1BG1.LJFF, null, null, new C1317205Dm(true, null), 3);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("IMContactManager@fb8a.reloadContacts$1");
            return unit;
        }
        IShareStatusKeva iShareStatusKeva = (IShareStatusKeva) PluggableExtentionKt.pluggableSpiForReal(IShareStatusKeva.class);
        if (iShareStatusKeva != null) {
            iShareStatusKeva.LIZIZ();
        }
        C1BG1.LIZ.getClass();
        C23250099c.LIZLLL(C1BG1.LJFF, null, null, new C1317205Dm(true, null), 3);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMContactManager@fb8a.reloadContacts$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
