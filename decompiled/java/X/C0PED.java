package X;

import com.ss.android.ugc.aweme.inbox.search.data.items.InboxSearchRecentStoreItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0PED, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.search.repository.InboxSearchRecentRepository$getRecentKeywordList$job$1", f = "InboxSearchRecentRepository.kt", l = {}, m = "invokeSuspend")
public final class C0PED extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<InboxSearchRecentStoreItem>>, Object> {
    public C0PED(InterfaceC1364105Vn<? super C0PED> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PED(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSearchRecentRepository@1b61.getRecentKeywordList$job$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0PEG.LIZ.getClass();
        C0PEG.LIZ();
        List<InboxSearchRecentStoreItem> list = C0PEG.LIZJ;
        C1C7U.LIZIZ("InboxSearchRecentRepository@1b61.getRecentKeywordList$job$1");
        return list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<InboxSearchRecentStoreItem>> interfaceC1364105Vn) {
        return new C0PED(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
