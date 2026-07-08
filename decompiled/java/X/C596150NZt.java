package X;

import java.util.HashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0NZt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.contact.filter.ContactBookFilterByPsi$tryFilterBeforeUpload$3", f = "ContactFilterByPsi.kt", l = {199}, m = "invokeSuspend")
public final class C596150NZt extends C09AX implements Function1<InterfaceC1364105Vn<? super C11H7<HashSet<String>, HashSet<String>, Boolean>>, Object> {
    public int LL;
    public final /* synthetic */ C1074950e4z LLILLJJLI;
    public final /* synthetic */ C20166313vR LLILLL;
    public final /* synthetic */ Set<String> LLILZ;
    public final /* synthetic */ Set<String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C596150NZt(C1074950e4z c1074950e4z, C20166313vR c20166313vR, Set<String> set, Set<String> set2, InterfaceC1364105Vn<? super C596150NZt> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c1074950e4z;
        this.LLILLL = c20166313vR;
        this.LLILZ = set;
        this.LLILZIL = set2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C596150NZt(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C11H7<HashSet<String>, HashSet<String>, Boolean>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ContactBookFilterByPsi@dd2a.tryFilterBeforeUpload$3");
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
            C20165313vH c20165313vH = new C20165313vH(this.LLILLJJLI, this.LLILLL);
            Set<String> set = this.LLILZ;
            Set<String> set2 = this.LLILZIL;
            this.LL = 1;
            obj = c20165313vH.LJI(set, set2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ContactBookFilterByPsi@dd2a.tryFilterBeforeUpload$3");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ContactBookFilterByPsi@dd2a.tryFilterBeforeUpload$3");
        return obj;
    }
}
