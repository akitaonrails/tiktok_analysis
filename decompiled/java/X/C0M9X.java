package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0M9X, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M9X extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ SocMediaResource LL;
    public final /* synthetic */ C1669630tY9 LLILLJJLI;
    public final /* synthetic */ SocialMediaPickerViewModel LLILLL;
    public final /* synthetic */ Function2<SocMediaResource, C1683130ttv, Unit> LLILZ;
    public final /* synthetic */ Function2<C1378605aS, SocMediaResource, Unit> LLILZIL;
    public final /* synthetic */ Function1<SocMediaResource, Unit> LLILZLL;
    public final /* synthetic */ Function2<SocMediaResource, C1683130ttv, Unit> LLIZ;
    public final /* synthetic */ float LLIZLLLIL;
    public final /* synthetic */ float LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0M9X(SocMediaResource socMediaResource, C1669630tY9 c1669630tY9, SocialMediaPickerViewModel socialMediaPickerViewModel, Function2<? super SocMediaResource, ? super C1683130ttv, Unit> function2, Function2<? super C1378605aS, ? super SocMediaResource, Unit> function22, Function1<? super SocMediaResource, Unit> function1, Function2<? super SocMediaResource, ? super C1683130ttv, Unit> function23, float f, float f2, int i) {
        super(2);
        this.LL = socMediaResource;
        this.LLILLJJLI = c1669630tY9;
        this.LLILLL = socialMediaPickerViewModel;
        this.LLILZ = function2;
        this.LLILZIL = function22;
        this.LLILZLL = function1;
        this.LLIZ = function23;
        this.LLIZLLLIL = f;
        this.LLJ = f2;
        this.LLJI = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1669600tY6.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJI | 1));
        return Unit.LIZ;
    }
}
