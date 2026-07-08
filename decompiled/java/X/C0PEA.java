package X;

import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0PEA, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.search.repository.InboxSearchRecentRepository$deleteAllRecentKeyword$1", f = "InboxSearchRecentRepository.kt", l = {}, m = "invokeSuspend")
public final class C0PEA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0PEA(InterfaceC1364105Vn<? super C0PEA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PEA(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSearchRecentRepository@1b61.deleteAllRecentKeyword$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxSearchRecentRepository", "clear recentKeyWordList");
        ((ArrayList) C0PEG.LIZJ).clear();
        C0PEG.LIZ.getClass();
        C0PEG.LIZJ().storeString("keyword_repo", JsonParseUtils.LJ(C0PEG.LIZJ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxSearchRecentRepository@1b61.deleteAllRecentKeyword$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0PEA(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
