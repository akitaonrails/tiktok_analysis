package X;

import android.app.Activity;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HDc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl$enterSocialAvatarFlow$1$3$1", f = "SocialAvatarServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C437380HDc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0HHA LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C437380HDc(C0HHA c0hha, InterfaceC1364105Vn<? super C437380HDc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0hha;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C437380HDc(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activity;
        C1C7U.LIZ("SocialAvatarServiceImpl@45de.enterSocialAvatarFlow$1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Context context = this.LL.LIZ;
        Unit unit = null;
        if ((context instanceof Activity) && (activity = (Activity) context) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIIZ(2131837962);
            c1389890mGx.LJIIJJI();
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("SocialAvatarServiceImpl@45de.enterSocialAvatarFlow$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
