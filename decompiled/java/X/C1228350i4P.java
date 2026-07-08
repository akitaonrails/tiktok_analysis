package X;

import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i4P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.selector.inviteguest.LiveInviteGuestContentTabDataSourceProtocol$realRefresh$1$2", f = "LiveInviteGuestContentTabDataSourceProtocol.kt", l = {}, m = "invokeSuspend")
public final class C1228350i4P extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends IMUser>>, Object> {
    public final /* synthetic */ C1228370i4R LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1228350i4P(C1228370i4R c1228370i4R, InterfaceC1364105Vn<? super C1228350i4P> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1228370i4R;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1228350i4P(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveInviteGuestContentTabDataSourceProtocol@c79b.realRefresh$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<User> list = this.LL.LLILLL.LJ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<User> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(C1228370i4R.LJJJJJ(it2.next()));
        }
        C1C7U.LIZIZ("LiveInviteGuestContentTabDataSourceProtocol@c79b.realRefresh$1$2");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends IMUser>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
