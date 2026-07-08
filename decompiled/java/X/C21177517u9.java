package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercelive.audience.us.lifecycle.UsEcommerceRoomLifecycleObserver;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS241S0300000_32;

/* JADX INFO: renamed from: X.17u9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21177517u9 extends C09AY implements Function1<C1512110pS5, Unit> {
    public final /* synthetic */ UsEcommerceRoomLifecycleObserver LL;
    public final /* synthetic */ Room LLILLJJLI;
    public final /* synthetic */ HashMap<String, String> LLILLL;
    public final /* synthetic */ Fragment LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21177517u9(UsEcommerceRoomLifecycleObserver usEcommerceRoomLifecycleObserver, Room room, HashMap<String, String> map, Fragment fragment) {
        super(1);
        this.LL = usEcommerceRoomLifecycleObserver;
        this.LLILLJJLI = room;
        this.LLILLL = map;
        this.LLILZ = fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1512110pS5 c1512110pS5) {
        C1512110pS5 c1512110pS52 = c1512110pS5;
        if (!c1512110pS52.LIZ || c1512110pS52.LIZLLL) {
            C21196417xC.LIZ(EnumC21192817wc.REQUEST_PREVIEW_ASSEMBLE, this.LL.LIZLLL, null, null, null, false, null, null, 252);
            UsEcommerceRoomLifecycleObserver usEcommerceRoomLifecycleObserver = this.LL;
            C598650Ndv c598650Ndv = usEcommerceRoomLifecycleObserver.LIZ;
            if (c598650Ndv != null) {
                Room room = this.LLILLJJLI;
                long j = usEcommerceRoomLifecycleObserver.LIZIZ;
                HashMap<String, String> map = this.LLILLL;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LJFF), null, null, new C598630Ndt(c598650Ndv, room, j, new AwS241S0300000_32(room, usEcommerceRoomLifecycleObserver, this.LLILZ, 17), map, null), 3);
            }
        }
        return Unit.LIZ;
    }
}
