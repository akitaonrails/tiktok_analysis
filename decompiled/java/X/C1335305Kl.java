package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Kl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.updater.user.ChatListIMUserUpdater$preBatchUpdate$2", f = "ChatListIMUserUpdater.kt", l = {171}, m = "invokeSuspend")
public final class C1335305Kl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends IMUser>>, Object> {
    public int LL;
    public final /* synthetic */ C1490105sR LLILLJJLI;
    public final /* synthetic */ Collection<C879540Yeu<?>> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1335305Kl(C1490105sR c1490105sR, Collection<? extends C879540Yeu<?>> collection, InterfaceC1364105Vn<? super C1335305Kl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1490105sR;
        this.LLILLL = collection;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1335305Kl(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListIMUserUpdater@737c.preBatchUpdate$2");
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
            Collection<C879540Yeu<?>> collection = this.LLILLL;
            this.LL = 1;
            c1490105sR.getClass();
            obj = c1490105sR.LJIJJ(collection, new C1334505Kd(null), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ChatListIMUserUpdater@737c.preBatchUpdate$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ChatListIMUserUpdater@737c.preBatchUpdate$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends IMUser>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
