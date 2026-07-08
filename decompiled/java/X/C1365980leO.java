package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0leO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.datamgr.ShareSortedListFacade$loadQuickShareContactList$5", f = "ShareSortedListFacade.kt", l = {71}, m = "invokeSuspend")
public final class C1365980leO extends C09AX implements Function2<List<? extends String>, InterfaceC1364105Vn<? super List<? extends C0Y8T>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C1365980leO(InterfaceC1364105Vn<? super C1365980leO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1365980leO c1365980leO = new C1365980leO(interfaceC1364105Vn);
        c1365980leO.LLILLJJLI = obj;
        return c1365980leO;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareSortedListFacade@1fc1.loadQuickShareContactList$5");
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
            obj = c1366090leZ.LLILZLL.LIZ(list, false, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ShareSortedListFacade@1fc1.loadQuickShareContactList$5");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ShareSortedListFacade@1fc1.loadQuickShareContactList$5");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends String> list, InterfaceC1364105Vn<? super List<? extends C0Y8T>> interfaceC1364105Vn) {
        return ((a) create(list, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
