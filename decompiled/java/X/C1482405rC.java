package X;

import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05rC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.updater.user.ChatListIMUserUpdater$observeRawDataChange$2", f = "ChatListIMUserUpdater.kt", l = {358}, m = "invokeSuspend")
public final class C1482405rC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1490105sR LLILLJJLI;
    public final /* synthetic */ List<C879540Yeu<?>> LLILLL;
    public final /* synthetic */ Set<String> LLILZ;
    public final /* synthetic */ Set<String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1482405rC(C1490105sR c1490105sR, List<C879540Yeu<?>> list, Set<String> set, Set<String> set2, InterfaceC1364105Vn<? super C1482405rC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1490105sR;
        this.LLILLL = list;
        this.LLILZ = set;
        this.LLILZIL = set2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1482405rC(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListIMUserUpdater@737c.observeRawDataChange$2");
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
                C1C7U.LIZIZ("ChatListIMUserUpdater@737c.observeRawDataChange$2");
                return objLJFF;
            }
        }
        C1490105sR c1490105sR2 = this.LLILLJJLI;
        Set<String> set = this.LLILZIL;
        for (BaseContact baseContact : (Iterable) obj) {
            String uid = baseContact.getUid();
            if (uid != null) {
                c1490105sR2.LLJ.put(uid, (IMUser) baseContact);
                set.add(uid);
            }
        }
        this.LLILLJJLI.LJIL().removeAll(this.LLILZ);
        this.LLILLJJLI.LJIJJLI().addAll(this.LLILZIL);
        String str = this.LLILLJJLI.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observeRawDataChange preloadAll fetch missing user size=");
        sbLIZ.append(this.LLILZ.size());
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZLLL(str);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatListIMUserUpdater@737c.observeRawDataChange$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
