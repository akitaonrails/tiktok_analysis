package X;

import com.ss.android.ugc.profile.business.avatar.OtherProfileAvatarAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CSO, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.avatar.OtherProfileAvatarAssem$onResume$1", f = "OtherProfileAvatarAssem.kt", l = {}, m = "invokeSuspend")
public final class C0CSO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ OtherProfileAvatarAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CSO(OtherProfileAvatarAssem otherProfileAvatarAssem, InterfaceC1364105Vn<? super C0CSO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = otherProfileAvatarAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CSO(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OtherProfileAvatarAssem@a27e.onResume$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getClass();
        OtherProfileAvatarAssem.jq();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OtherProfileAvatarAssem@a27e.onResume$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
