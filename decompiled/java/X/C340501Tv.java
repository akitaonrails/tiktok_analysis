package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Tv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.experiment.LiveSkylightRefreshConfig$updateFollowCacheData$1$data$1", f = "LiveSkylightRefreshConfig.kt", l = {}, m = "invokeSuspend")
public final class C340501Tv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Room>>, Object> {
    public final /* synthetic */ Function0<List<Room>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C340501Tv(Function0<? extends List<? extends Room>> function0, InterfaceC1364105Vn<? super C340501Tv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C340501Tv(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveSkylightRefreshConfig@6f24.updateFollowCacheData$1$data$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<Room> listInvoke = this.LL.invoke();
        C1C7U.LIZIZ("LiveSkylightRefreshConfig@6f24.updateFollowCacheData$1$data$1");
        return listInvoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Room>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
