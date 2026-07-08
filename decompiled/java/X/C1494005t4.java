package X;

import com.ss.android.ugc.aweme.im.service.impl.core.IMUserPortraitManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05t4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.core.IMUserPortraitManager$trackUserPortrait$1", f = "IMUserPortraitManager.kt", l = {}, m = "invokeSuspend")
public final class C1494005t4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Map<String, String> LL;
    public final /* synthetic */ InterfaceC1493105sv LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1494005t4(InterfaceC1493105sv interfaceC1493105sv, Map map, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = map;
        this.LLILLJJLI = interfaceC1493105sv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1494005t4(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        C1C7U.LIZ("IMUserPortraitManager@19c1.trackUserPortrait$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Map<String, String> map = this.LL;
        User userLIZLLL = C461720I8s.LIZLLL();
        if (userLIZLLL != null) {
            numLJ = C2286608xc.LJ(userLIZLLL.getFriendCount());
        } else {
            numLJ = null;
        }
        map.put("local_friends_count", String.valueOf(numLJ));
        IMUserPortraitManager.LIZLLL.putAll(this.LL);
        this.LLILLJJLI.sendEvent("user_portrait_delay", this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMUserPortraitManager@19c1.trackUserPortrait$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
