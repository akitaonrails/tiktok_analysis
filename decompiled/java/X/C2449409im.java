package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09im, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.fypsubonlyvideos.fcpcomponents.StdTipCardButtonSensor$onInit$stateFlowCollector$1", f = "SovTipCardProvider.kt", l = {}, m = "invokeSuspend")
public final class C2449409im extends C09AX implements Function2<Set<? extends String>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ C705430Rll LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2449409im(Aweme aweme, C013C c013c, C705430Rll c705430Rll, InterfaceC1364105Vn<? super C2449409im> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aweme;
        this.LLILLL = c013c;
        this.LLILZ = c705430Rll;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2449409im c2449409im = new C2449409im(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c2449409im.LL = obj;
        return c2449409im;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StdTipCardButtonSensor@7d9e.onInit$stateFlowCollector$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Set set = (Set) this.LL;
        String secAuthorUid = AwemeExtKt.getSecAuthorUid(this.LLILLJJLI);
        if (secAuthorUid != null) {
            C013C c013c = this.LLILLL;
            C705430Rll c705430Rll = this.LLILZ;
            if (set.contains(secAuthorUid)) {
                c013c.element = true;
                c705430Rll.LJ(false);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StdTipCardButtonSensor@7d9e.onInit$stateFlowCollector$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Set<? extends String> set, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(set, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
