package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarQuotaResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0HDa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl$enterSocialAvatarFlow$1$1", f = "SocialAvatarServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C437360HDa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SocialAvatarQuotaResponse LL;
    public final /* synthetic */ SocialAvatarServiceImpl LLILLJJLI;
    public final /* synthetic */ C0HHA LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ EnumC437540HDs LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C437360HDa(SocialAvatarQuotaResponse socialAvatarQuotaResponse, SocialAvatarServiceImpl socialAvatarServiceImpl, C0HHA c0hha, Context context, EnumC437540HDs enumC437540HDs, Function0<Unit> function0, InterfaceC1364105Vn<? super C437360HDa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = socialAvatarQuotaResponse;
        this.LLILLJJLI = socialAvatarServiceImpl;
        this.LLILLL = c0hha;
        this.LLILZ = context;
        this.LLILZIL = enumC437540HDs;
        this.LLILZLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C437360HDa(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        Activity activity;
        String string;
        C1C7U.LIZ("SocialAvatarServiceImpl@45de.enterSocialAvatarFlow$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean zBooleanValue = false;
        if (Intrinsics.LJFF(this.LL.isAllowed(), true)) {
            SocialAvatarServiceImpl socialAvatarServiceImpl = this.LLILLJJLI;
            C0HHA c0hha = this.LLILLL;
            Context context = this.LLILZ;
            EnumC437540HDs enumC437540HDs = this.LLILZIL;
            Boolean boolIsFirstGeneration = this.LL.isFirstGeneration();
            if (boolIsFirstGeneration != null) {
                zBooleanValue = boolIsFirstGeneration.booleanValue();
            }
            socialAvatarServiceImpl.getClass();
            C0HHC c0hhcLJIJ = SocialAvatarServiceImpl.LJIJ(c0hha, context, enumC437540HDs, zBooleanValue);
            SocialAvatarServiceImpl socialAvatarServiceImpl2 = this.LLILLJJLI;
            Function0<Unit> function0 = this.LLILZLL;
            socialAvatarServiceImpl2.getClass();
            SocialAvatarServiceImpl.LJIJI(c0hhcLJIJ, function0);
            unit = Unit.LIZ;
        } else {
            Context context2 = this.LLILLL.LIZ;
            unit = null;
            if ((context2 instanceof Activity) && (activity = (Activity) context2) != null) {
                if (C2277121EBa.LIZ()) {
                    string = activity.getString(2131838912, C2286608xc.LJ(C2277121EBa.LIZIZ()));
                } else {
                    string = activity.getString(2131827074);
                }
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIJ(string);
                c1389890mGx.LJIIJJI();
                unit = Unit.LIZ;
            }
        }
        C1C7U.LIZIZ("SocialAvatarServiceImpl@45de.enterSocialAvatarFlow$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
