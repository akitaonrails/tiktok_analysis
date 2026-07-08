package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Y4, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.searchengine.accounts.AccountsSearchEngine$assembleBusinessData$2", f = "AccountsSearchEngine.kt", l = {126}, m = "invokeSuspend")
public final class C06Y4 extends C09AX implements Function1<InterfaceC1364105Vn<? super List<? extends IMUser>>, Object> {
    public int LL;
    public final /* synthetic */ C1240470iNx LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06Y4(C1240470iNx c1240470iNx, List<String> list, InterfaceC1364105Vn<? super C06Y4> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c1240470iNx;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06Y4(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super List<? extends IMUser>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AccountsSearchEngine@d281.assembleBusinessData$2");
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
            Function2<List<String>, InterfaceC1364105Vn<? super List<? extends IMUser>>, Object> function2 = this.LLILLJJLI.LIZIZ;
            List<String> list = this.LLILLL;
            this.LL = 1;
            obj = function2.invoke(list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AccountsSearchEngine@d281.assembleBusinessData$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AccountsSearchEngine@d281.assembleBusinessData$2");
        return obj;
    }
}
