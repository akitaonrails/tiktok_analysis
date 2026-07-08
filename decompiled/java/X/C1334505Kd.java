package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Kd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.updater.user.ChatListIMUserUpdater$preloadUserListByWrapperList$2", f = "ChatListIMUserUpdater.kt", l = {489}, m = "invokeSuspend")
public final class C1334505Kd extends C09AX implements Function2<List<? extends String>, InterfaceC1364105Vn<? super List<? extends IMUser>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C1334505Kd(InterfaceC1364105Vn<? super C1334505Kd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1334505Kd c1334505Kd = new C1334505Kd(interfaceC1364105Vn);
        c1334505Kd.LLILLJJLI = obj;
        return c1334505Kd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListIMUserUpdater@737c.preloadUserListByWrapperList$2");
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
            List list = (List) this.LLILLJJLI;
            IMContactApi.LIZ.getClass();
            C1BGS c1bgsLJ = C069P.LIZ().LJ();
            this.LL = 1;
            obj = c1bgsLJ.LJIILIIL("user_updater_batch", list, this, false, false, false);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ChatListIMUserUpdater@737c.preloadUserListByWrapperList$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ChatListIMUserUpdater@737c.preloadUserListByWrapperList$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends String> list, InterfaceC1364105Vn<? super List<? extends IMUser>> interfaceC1364105Vn) {
        return ((a) create(list, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
