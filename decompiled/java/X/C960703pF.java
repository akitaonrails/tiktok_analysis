package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.slark.impl.TrackNodeStore;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03pF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.slark.impl.TrackNodeStore$getById$1$1", f = "TrackNodeStore.kt", l = {}, m = "invokeSuspend")
public final class C960703pF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LifecycleOwner LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C960703pF(LifecycleOwner lifecycleOwner, String str, InterfaceC1364105Vn<? super C960703pF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = lifecycleOwner;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C960703pF(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TrackNodeStore@a7fd.getById$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ConcurrentHashMap<String, C993503uX> concurrentHashMap = TrackNodeStore.LIZ;
        TrackNodeStore.LIZ(this.LLILLJJLI, this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TrackNodeStore@a7fd.getById$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
