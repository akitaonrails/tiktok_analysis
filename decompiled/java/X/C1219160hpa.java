package X;

import com.ss.android.ugc.aweme.feed.model.ExposeSharerData;
import com.ss.android.ugc.aweme.relation.link.feed.SharedInviteDialogVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hpa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.link.feed.SharedInviteDialogVM$setupShowInfo$sharerResponse$1", f = "SharedInviteDialogVM.kt", l = {118}, m = "invokeSuspend")
public final class C1219160hpa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super ExposeSharerData>, Object> {
    public int LL;
    public final /* synthetic */ SharedInviteDialogVM LLILLJJLI;
    public final /* synthetic */ C1233440iCc LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219160hpa(SharedInviteDialogVM sharedInviteDialogVM, C1233440iCc c1233440iCc, InterfaceC1364105Vn<? super C1219160hpa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = sharedInviteDialogVM;
        this.LLILLL = c1233440iCc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1219160hpa(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SharedInviteDialogVM@9887.setupShowInfo$sharerResponse$1");
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
            SharedInviteDialogVM sharedInviteDialogVM = this.LLILLJJLI;
            C099G c099gLIZIZ = C23250099c.LIZIZ(sharedInviteDialogVM.LL, C0PEM.LIZJ, null, new C1233430iCb(sharedInviteDialogVM, this.LLILLL, null), 2);
            this.LL = 1;
            obj = c099gLIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SharedInviteDialogVM@9887.setupShowInfo$sharerResponse$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SharedInviteDialogVM@9887.setupShowInfo$sharerResponse$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super ExposeSharerData> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
