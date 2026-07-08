package X;

import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05rD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.updater.user.ChatListIMUserUpdater$observeDataChange$2", f = "ChatListIMUserUpdater.kt", l = {202}, m = "invokeSuspend")
public final class C1482505rD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1490105sR LLILLJJLI;
    public final /* synthetic */ List<C879540Yeu<?>> LLILLL;
    public final /* synthetic */ Set<String> LLILZ;
    public final /* synthetic */ List<InterfaceC1491305sd> LLILZIL;
    public final /* synthetic */ Map<String, Set<InterfaceC1491305sd>> LLILZLL;
    public final /* synthetic */ InterfaceC879010Ye3 LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1482505rD(C1490105sR c1490105sR, List<C879540Yeu<?>> list, Set<String> set, List<InterfaceC1491305sd> list2, Map<String, Set<InterfaceC1491305sd>> map, InterfaceC879010Ye3 interfaceC879010Ye3, InterfaceC1364105Vn<? super C1482505rD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1490105sR;
        this.LLILLL = list;
        this.LLILZ = set;
        this.LLILZIL = list2;
        this.LLILZLL = map;
        this.LLIZ = interfaceC879010Ye3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1482505rD(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListIMUserUpdater@737c.observeDataChange$2");
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
            C1490105sR c1490105sR = this.LLILLJJLI;
            List<C879540Yeu<?>> list = this.LLILLL;
            this.LL = 1;
            obj = c1490105sR.LJJIII(list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ChatListIMUserUpdater@737c.observeDataChange$2");
                return objLJFF;
            }
        }
        C1490105sR c1490105sR2 = this.LLILLJJLI;
        Map<String, Set<InterfaceC1491305sd>> map = this.LLILZLL;
        List<InterfaceC1491305sd> list2 = this.LLILZIL;
        for (BaseContact baseContact : (Iterable) obj) {
            String uid = baseContact.getUid();
            if (uid != null) {
                c1490105sR2.LLJ.put(uid, (IMUser) baseContact);
                Set<InterfaceC1491305sd> set = map.get(uid);
                if (set != null) {
                    list2.addAll(set);
                }
            }
        }
        this.LLILLJJLI.LJIL().removeAll(this.LLILZ);
        this.LLILLJJLI.LJIJJLI().addAll(this.LLILZ);
        if (this.LLILZIL.isEmpty()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ChatListIMUserUpdater@737c.observeDataChange$2");
            return unit;
        }
        CopyOnWriteArrayList<InterfaceC1482905rH> copyOnWriteArrayListLJJII = this.LLILLJJLI.LJJII();
        InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLIZ;
        List<InterfaceC1491305sd> list3 = this.LLILZIL;
        C1490105sR c1490105sR3 = this.LLILLJJLI;
        Iterator<InterfaceC1482905rH> it2 = copyOnWriteArrayListLJJII.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(interfaceC879010Ye3, list3, c1490105sR3.LIZIZ(), c1490105sR3.LLILLJJLI);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ChatListIMUserUpdater@737c.observeDataChange$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
