package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tXb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669290tXb extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C1680470tpd LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ SocialMediaPickerViewModel LLILZ;
    public final /* synthetic */ Function1<C563580M8m, Unit> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ InterfaceC1685750ty9 LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1669290tXb(C1680470tpd c1680470tpd, float f, float f2, SocialMediaPickerViewModel socialMediaPickerViewModel, Function1<? super C563580M8m, Unit> function1, Function0<Unit> function0, InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2) {
        super(2);
        this.LL = c1680470tpd;
        this.LLILLJJLI = f;
        this.LLILLL = f2;
        this.LLILZ = socialMediaPickerViewModel;
        this.LLILZIL = function1;
        this.LLILZLL = function0;
        this.LLIZ = interfaceC1685750ty9;
        this.LLIZLLLIL = i;
        this.LLJ = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1669280tXa.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZLLLIL | 1), this.LLJ);
        return Unit.LIZ;
    }
}
