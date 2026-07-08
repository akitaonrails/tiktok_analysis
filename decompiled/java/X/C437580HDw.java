package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HDw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.tiktok.homepage.mainpagefragment.SocialAvatarIconFlipPrerequisiteViewModel$listenToSocialAvatarStatus$1$firstState$1$1", f = "SocialAvatarIconFlipPrerequisiteViewModel.kt", l = {}, m = "invokeSuspend")
public final class C437580HDw extends C09AX implements Function2<C437560HDu, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C437580HDw(InterfaceC1364105Vn<? super C437580HDw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C437580HDw c437580HDw = new C437580HDw(interfaceC1364105Vn);
        c437580HDw.LL = obj;
        return c437580HDw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("SocialAvatarIconFlipPrerequisiteViewModel@7f93.listenToSocialAvatarStatus$1$firstState$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (((C437560HDu) this.LL).LIZ != EnumC437540HDs.UNKNOWN) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("SocialAvatarIconFlipPrerequisiteViewModel@7f93.listenToSocialAvatarStatus$1$firstState$1$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C437560HDu c437560HDu, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c437560HDu, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
