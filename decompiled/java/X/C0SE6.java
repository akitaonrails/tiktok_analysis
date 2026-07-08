package X;

import Y.AObserverS215S0100000_11;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.ui.assem.feed.CollabFeedTagAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0SE6, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ui.assem.feed.CollabFeedTagAssem$onViewCreated$3", f = "CollabFeedTagAssem.kt", l = {}, m = "invokeSuspend")
public final class C0SE6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CollabFeedTagAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SE6(CollabFeedTagAssem collabFeedTagAssem, InterfaceC1364105Vn<? super C0SE6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = collabFeedTagAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0SE6(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CollabFeedTagAssem@1e65.onViewCreated$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LiveData liveDataLJIIIZ = C214878197k.LIZIZ.LJIIIZ(this.LL.getLifecycle());
        if (liveDataLJIIIZ != null) {
            CollabFeedTagAssem collabFeedTagAssem = this.LL;
            liveDataLJIIIZ.observe(collabFeedTagAssem, new AObserverS215S0100000_11(collabFeedTagAssem, 4));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CollabFeedTagAssem@1e65.onViewCreated$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
