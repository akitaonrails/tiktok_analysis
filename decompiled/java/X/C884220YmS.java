package X;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YmS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.core.chatlist.impl.page.handle.ChatListPageHandle$refresh$1", f = "ChatListPageHandle.kt", l = {}, m = "invokeSuspend")
public final class C884220YmS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C884270YmX LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C884220YmS(C884270YmX c884270YmX, String str, InterfaceC1364105Vn<? super C884220YmS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c884270YmX;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C884220YmS(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListPageHandle@454a.refresh$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<Pair<InterfaceC884250YmV, InterfaceC878560YdK>> list = this.LL.LIZIZ;
        String str = this.LLILLJJLI;
        for (Pair<InterfaceC884250YmV, InterfaceC878560YdK> pair : list) {
            pair.getFirst().LJFF(pair.getSecond(), str);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatListPageHandle@454a.refresh$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
