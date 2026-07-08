package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: renamed from: X.0MAW, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MAW extends C09AY implements Function1<C0MAX, Unit> {
    public final /* synthetic */ SocialMediaPickerViewModel LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ InterfaceC1665500tRU<SocMediaResource> LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ float LLILZIL;
    public final /* synthetic */ float LLILZLL;
    public final /* synthetic */ Function2<C1378605aS, SocMediaResource, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0MAW(SocialMediaPickerViewModel socialMediaPickerViewModel, int i, InterfaceC1665500tRU<SocMediaResource> interfaceC1665500tRU, float f, float f2, float f3, Function2<? super C1378605aS, ? super SocMediaResource, Unit> function2) {
        super(1);
        this.LL = socialMediaPickerViewModel;
        this.LLILLJJLI = i;
        this.LLILLL = interfaceC1665500tRU;
        this.LLILZ = f;
        this.LLILZIL = f2;
        this.LLILZLL = f3;
        this.LLIZ = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0MAX c0max) {
        C0MAX c0max2 = c0max;
        if (this.LL.LL.getMediaAreaUIConfig().getHasCameraEntrance() && this.LLILLJJLI == 0) {
            c0max2.LIZ("Capture", null, "Capture", new C19719212De(1118704096, new C0M9P(this.LLILZIL, this.LLILZLL, this.LL), true));
        }
        InterfaceC1665500tRU<SocMediaResource> interfaceC1665500tRU = this.LLILLL;
        c0max2.LJ(interfaceC1665500tRU.size(), new C020W(AFwS239S0000000_8.get$arr$(126), interfaceC1665500tRU, 14), null, new C020W(AFwS239S0000000_8.get$arr$(127), interfaceC1665500tRU, 15), new C19719212De(699646206, new C0M9L(interfaceC1665500tRU, this.LL, this.LLIZ, this.LLILZIL, this.LLILZLL), true));
        float f = this.LLILZ;
        if (f > 0.0f) {
            c0max2.LIZ(null, AFwS266S0000000_25.get$arr$(192), null, new C19719212De(899878935, new C0MAH(f), true));
        }
        return Unit.LIZ;
    }
}
