package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CRf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.tiktok.homepage.mainpagefragment.assem.SocialPublishLandingAssem$observeStoryPublishStatus$3$1", f = "SocialPublishLandingAssem.kt", l = {}, m = "invokeSuspend")
public final class C313650CRf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C313650CRf(Context context, InterfaceC1364105Vn<? super C313650CRf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C313650CRf(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialPublishLandingAssem@5578.observeStoryPublishStatus$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C319400Cfa.LIZ(C319400Cfa.LIZ, this.LL, EnumC313670CRh.PRELOAD_PUBLISH_LANDING);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialPublishLandingAssem@5578.observeStoryPublishStatus$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
