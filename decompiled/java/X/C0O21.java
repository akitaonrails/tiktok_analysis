package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.vm.ContactSelectVM;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O21, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.vm.ContactSelectVM$loadSuggestData$1", f = "EditShareVM.kt", l = {263, 265}, m = "invokeSuspend")
public final class C0O21 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ContactSelectVM LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O21(ContactSelectVM contactSelectVM, boolean z, InterfaceC1364105Vn<? super C0O21> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = contactSelectVM;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O21(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZLLL;
        C1C7U.LIZ("ContactSelectVM@ce1.loadSuggestData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLJJLI.LLILLJJLI.LIZIZ();
            if (this.LLILLL) {
                C0O22 c0o22 = C0O22.LIZ;
                this.LL = 1;
                c0o22.getClass();
                AnonymousClass0956 anonymousClass0956 = C0O22.LJ;
                if (anonymousClass0956 != null && anonymousClass0956.isCompleted()) {
                    List listLLIIII = C13LP.LLIIII(C0O22.LIZJ);
                    C0O22.LJ(listLLIIII);
                    CopyOnWriteArrayList<IMContact> copyOnWriteArrayList = C0O22.LIZIZ;
                    copyOnWriteArrayList.clear();
                    copyOnWriteArrayList.addAll(listLLIIII);
                    objLIZLLL = Unit.LIZ;
                } else {
                    objLIZLLL = c0o22.LIZLLL(this);
                    if (objLIZLLL != C099R.LJFF()) {
                        objLIZLLL = Unit.LIZ;
                    }
                }
                if (objLIZLLL == objLJFF) {
                    C1C7U.LIZIZ("ContactSelectVM@ce1.loadSuggestData$1");
                    return objLJFF;
                }
            } else {
                C0O22 c0o222 = C0O22.LIZ;
                this.LL = 2;
                if (c0o222.LIZLLL(this) == objLJFF) {
                    C1C7U.LIZIZ("ContactSelectVM@ce1.loadSuggestData$1");
                    return objLJFF;
                }
            }
        }
        if (this.LLILLJJLI.LLILLL.length() == 0) {
            this.LLILLJJLI.AQ2(false);
        }
        this.LLILLJJLI.LLILLJJLI.LIZIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ContactSelectVM@ce1.loadSuggestData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
