package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Kp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.updater.user.ChatListIMUserUpdater$produceAccessory$imUser$1$1", f = "ChatListIMUserUpdater.kt", l = {383}, m = "invokeSuspend")
public final class C1335705Kp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super IMUser>, Object> {
    public int LL;
    public final /* synthetic */ C1490105sR LLILLJJLI;
    public final /* synthetic */ C879540Yeu<?> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1335705Kp(C1490105sR c1490105sR, C879540Yeu<?> c879540Yeu, String str, InterfaceC1364105Vn<? super C1335705Kp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1490105sR;
        this.LLILLL = c879540Yeu;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1335705Kp(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListIMUserUpdater@737c.produceAccessory$imUser$1$1");
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
            C879540Yeu<?> c879540Yeu = this.LLILLL;
            this.LL = 1;
            obj = c1490105sR.LJJ(c879540Yeu, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ChatListIMUserUpdater@737c.produceAccessory$imUser$1$1");
                return objLJFF;
            }
        }
        if (obj != null) {
            C1490105sR c1490105sR2 = this.LLILLJJLI;
            c1490105sR2.LLJ.put(this.LLILZ, (IMUser) obj);
        } else {
            obj = null;
        }
        C1C7U.LIZIZ("ChatListIMUserUpdater@737c.produceAccessory$imUser$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super IMUser> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
