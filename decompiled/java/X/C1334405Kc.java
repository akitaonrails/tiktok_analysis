package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Kc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.updater.user.ChatListIMUserUpdater$produceAccessory$1", f = "ChatListIMUserUpdater.kt", l = {389}, m = "invokeSuspend")
public final class C1334405Kc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super IMUser>, Object> {
    public int LL;
    public final /* synthetic */ IMUser LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1334405Kc(IMUser iMUser, InterfaceC1364105Vn<? super C1334405Kc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMUser;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1334405Kc(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListIMUserUpdater@737c.produceAccessory$1");
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
            IMContactApi.LIZ.getClass();
            C1BGS c1bgsLJ = C069P.LIZ().LJ();
            IMUser iMUser = this.LLILLJJLI;
            this.LL = 1;
            obj = c1bgsLJ.LJIILJJIL(iMUser, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ChatListIMUserUpdater@737c.produceAccessory$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ChatListIMUserUpdater@737c.produceAccessory$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super IMUser> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
