package X;

import com.ss.android.ugc.profile.business.profile.menu.viewmodel.ProfileMenuViewModel;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Na4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.menu.viewmodel.ProfileMenuViewModel$observeDynamicMenuSource$1$onUpdate$1", f = "ProfileMenuViewModel.kt", l = {}, m = "invokeSuspend")
public final class C596260Na4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ProfileMenuViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C596260Na4(ProfileMenuViewModel profileMenuViewModel, InterfaceC1364105Vn<? super C596260Na4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = profileMenuViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C596260Na4(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileMenuViewModel@fa0c.observeDynamicMenuSource$1$onUpdate$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.vQ2(Collections.singletonList("SETTINGS"));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileMenuViewModel@fa0c.observeDynamicMenuSource$1$onUpdate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
