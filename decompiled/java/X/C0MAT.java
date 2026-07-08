package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0MAT, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MAT extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1685750ty9 LL;
    public final /* synthetic */ SocialMediaPickerViewModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ AbstractC1690640u62 LLILZIL;
    public final /* synthetic */ Function2<Integer, Integer, Unit> LLILZLL;
    public final /* synthetic */ Function1<Integer, Unit> LLIZ;
    public final /* synthetic */ Function1<C1683130ttv, Unit> LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0MAT(InterfaceC1685750ty9 interfaceC1685750ty9, SocialMediaPickerViewModel socialMediaPickerViewModel, boolean z, int i, AbstractC1690640u62 abstractC1690640u62, Function2<? super Integer, ? super Integer, Unit> function2, Function1<? super Integer, Unit> function1, Function1<? super C1683130ttv, Unit> function12, int i2, int i3) {
        super(2);
        this.LL = interfaceC1685750ty9;
        this.LLILLJJLI = socialMediaPickerViewModel;
        this.LLILLL = z;
        this.LLILZ = i;
        this.LLILZIL = abstractC1690640u62;
        this.LLILZLL = function2;
        this.LLIZ = function1;
        this.LLIZLLLIL = function12;
        this.LLJ = i2;
        this.LLJI = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1669570tY3.LIZJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJ | 1), this.LLJI);
        return Unit.LIZ;
    }
}
