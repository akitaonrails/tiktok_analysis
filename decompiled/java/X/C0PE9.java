package X;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0PE9, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.search.repository.InboxSearchRecentRepository$inValidCache$1", f = "InboxSearchRecentRepository.kt", l = {}, m = "invokeSuspend")
public final class C0PE9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0PE9(InterfaceC1364105Vn<? super C0PE9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PE9(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSearchRecentRepository@1b61.inValidCache$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxSearchRecentRepository", "inValidCache()");
        ((ArrayList) C0PEG.LIZJ).clear();
        ((ArrayList) C0PEG.LIZLLL).clear();
        C0PEG.LJFF = false;
        C0PEG.LJ = false;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxSearchRecentRepository@1b61.inValidCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0PE9(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
