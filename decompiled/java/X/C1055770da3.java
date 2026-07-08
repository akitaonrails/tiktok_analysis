package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0da3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.multi.maker.SubscriptionAnchorMaker$stateFlowCollector$1", f = "SubscriptionAnchorMaker.kt", l = {}, m = "invokeSuspend")
public final class C1055770da3 extends C09AX implements Function2<Set<? extends String>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C11W7 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1055770da3(C11W7 c11w7, InterfaceC1364105Vn<? super C1055770da3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c11w7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1055770da3 c1055770da3 = new C1055770da3(this.LLILLJJLI, interfaceC1364105Vn);
        c1055770da3.LL = obj;
        return c1055770da3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String secUid;
        AnchorCommonStruct anchorCommonStruct;
        String id;
        String uid;
        C1C7U.LIZ("SubscriptionAnchorMaker@6ef0.stateFlowCollector$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Set set = (Set) this.LL;
        this.LLILLJJLI.getClass();
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLILLJJLI.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        User author = interfaceC1392640mLO.LJJLIIIJJIZ().getAuthor();
        if (author != null && (secUid = author.getSecUid()) != null && set.contains(secUid) && (anchorCommonStruct = this.LLILLJJLI.LLIZ) != null && (id = anchorCommonStruct.getId()) != null) {
            C11W7 c11w7 = this.LLILLJJLI;
            c11w7.getClass();
            User user = (User) c11w7.LLJJ.getValue();
            if (user != null && (uid = user.getUid()) != null) {
                c11w7.LJJIJIL(uid, id);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubscriptionAnchorMaker@6ef0.stateFlowCollector$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Set<? extends String> set, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(set, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
