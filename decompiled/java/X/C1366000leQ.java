package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0leQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.datamgr.ShareSortedListFacade$loadQuickShareContactList$4", f = "ShareSortedListFacade.kt", l = {70}, m = "invokeSuspend")
public final class C1366000leQ extends C09AX implements Function2<List<? extends String>, InterfaceC1364105Vn<? super List<? extends IMContact>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C1366000leQ(InterfaceC1364105Vn<? super C1366000leQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1366000leQ c1366000leQ = new C1366000leQ(interfaceC1364105Vn);
        c1366000leQ.LLILLJJLI = obj;
        return c1366000leQ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareSortedListFacade@1fc1.loadQuickShareContactList$4");
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
            List<String> list = (List) this.LLILLJJLI;
            C1366090leZ c1366090leZ = C1365990leP.LIZIZ;
            this.LL = 1;
            obj = c1366090leZ.LLILZLL.LIZIZ(list, false, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ShareSortedListFacade@1fc1.loadQuickShareContactList$4");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ShareSortedListFacade@1fc1.loadQuickShareContactList$4");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends String> list, InterfaceC1364105Vn<? super List<? extends IMContact>> interfaceC1364105Vn) {
        return ((a) create(list, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
