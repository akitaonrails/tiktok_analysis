package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IAvatarPublishStoryService;
import com.ss.android.ugc.aweme.services.IExternalService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HBp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarEditViewModel$openEditStoryPage$2$1", f = "SocialAvatarEditViewModel.kt", l = {}, m = "invokeSuspend")
public final class C436990HBp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ Bundle LLILLJJLI;
    public final /* synthetic */ C436980HBo LLILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C436990HBp(C19EG c19eg, Bundle bundle, C436980HBo c436980HBo, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C436990HBp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19eg;
        this.LLILLJJLI = bundle;
        this.LLILLL = c436980HBo;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C436990HBp(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        IAvatarPublishStoryService iAvatarPublishStoryServiceAvatarService;
        C1C7U.LIZ("SocialAvatarEditViewModel@c2d3.openEditStoryPage$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null && (iAvatarPublishStoryServiceAvatarService = iExternalService.avatarService()) != null) {
            C19EG c19eg = this.LL;
            Bundle bundle = this.LLILLJJLI;
            String str = this.LLILLL.LIZLLL;
            iAvatarPublishStoryServiceAvatarService.openEditPage(c19eg, bundle, str, str, false, this.LLILZ);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("SocialAvatarEditViewModel@c2d3.openEditStoryPage$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
