package X;

import com.ss.android.ugc.profile.platform.base.data.EventParams;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS484S0200000_19;
import njp.a;

/* JADX INFO: renamed from: X.0icc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem$tabInfoCollect$2", f = "AwemePagerAssem.kt", l = {}, m = "invokeSuspend")
public final class C1249560icc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<ProfileComponents> LL;
    public final /* synthetic */ AwemePagerAssem LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1249560icc(C259800zU<ProfileComponents> c259800zU, AwemePagerAssem awemePagerAssem, C259800zU<String> c259800zU2, InterfaceC1364105Vn<? super C1249560icc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = awemePagerAssem;
        this.LLILLL = c259800zU2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1249560icc(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<EventParams> list;
        C1C7U.LIZ("AwemePagerAssem@c9ce.tabInfoCollect$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1248840ibS c1248840ibS = C1248840ibS.LIZ;
        int type = C09YG.TYPE_SHOW.getType();
        ProfileComponents profileComponents = this.LL.element;
        if (profileComponents != null) {
            list = profileComponents.eventParams;
        } else {
            list = null;
        }
        C1248840ibS.LIZ(c1248840ibS, type, list, new AwS484S0200000_19(this.LLILLJJLI, (AwemePagerAssem) this.LLILLL, (C259800zU<String>) 9), 4);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AwemePagerAssem@c9ce.tabInfoCollect$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
