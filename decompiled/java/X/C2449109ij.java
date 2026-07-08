package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09ij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.fypsubonlyvideos.fcpcomponents.PreviewSingleButtonSensor$onInit$stateFlowCollector$1", f = "SovSingleButtonProvider.kt", l = {}, m = "invokeSuspend")
public final class C2449109ij extends C09AX implements Function2<Set<? extends String>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ C705440Rlm LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2449109ij(Aweme aweme, C013C c013c, C705440Rlm c705440Rlm, InterfaceC1364105Vn<? super C2449109ij> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aweme;
        this.LLILLL = c013c;
        this.LLILZ = c705440Rlm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2449109ij c2449109ij = new C2449109ij(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c2449109ij.LL = obj;
        return c2449109ij;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String secAuthorUid;
        C1C7U.LIZ("PreviewSingleButtonSensor@a20.onInit$stateFlowCollector$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Set set = (Set) this.LL;
        Aweme aweme = this.LLILLJJLI;
        if (aweme != null && (secAuthorUid = AwemeExtKt.getSecAuthorUid(aweme)) != null) {
            C013C c013c = this.LLILLL;
            C705440Rlm c705440Rlm = this.LLILZ;
            if (set.contains(secAuthorUid)) {
                c013c.element = true;
                c705440Rlm.LJ(false);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreviewSingleButtonSensor@a20.onInit$stateFlowCollector$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Set<? extends String> set, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(set, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
