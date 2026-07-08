package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i4H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.selector.visiblescope.SelectLiveVisibleFriendsDataSourceProtocol$realRefresh$1$1", f = "SelectLiveVisibleFriendsDataSourceProtocol.kt", l = {107}, m = "invokeSuspend")
public final class C1228270i4H extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends IMUser>>, Object> {
    public int LL;
    public final /* synthetic */ C1228280i4I LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1228270i4H(C1228280i4I c1228280i4I, InterfaceC1364105Vn<? super C1228270i4H> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1228280i4I;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1228270i4H(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SelectLiveVisibleFriendsDataSourceProtocol@8730.realRefresh$1$1");
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
            C1228280i4I c1228280i4I = this.LLILLJJLI;
            this.LL = 1;
            obj = c1228280i4I.LJJJJJ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SelectLiveVisibleFriendsDataSourceProtocol@8730.realRefresh$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SelectLiveVisibleFriendsDataSourceProtocol@8730.realRefresh$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends IMUser>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
