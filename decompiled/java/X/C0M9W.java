package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0M9W, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M9W extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ SocialMediaPickerViewModel LL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ Function2<C1378605aS, SocMediaResource, Unit> LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0M9W(SocialMediaPickerViewModel socialMediaPickerViewModel, InterfaceC1685750ty9 interfaceC1685750ty9, float f, Function2<? super C1378605aS, ? super SocMediaResource, Unit> function2, int i, int i2) {
        super(2);
        this.LL = socialMediaPickerViewModel;
        this.LLILLJJLI = interfaceC1685750ty9;
        this.LLILLL = f;
        this.LLILZ = function2;
        this.LLILZIL = i;
        this.LLILZLL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C569920MWw.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZIL | 1), this.LLILZLL);
        return Unit.LIZ;
    }
}
