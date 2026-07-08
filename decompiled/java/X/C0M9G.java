package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0M9G, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M9G extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ SocialMediaPickerViewModel LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ InterfaceC1685750ty9 LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M9G(SocialMediaPickerViewModel socialMediaPickerViewModel, boolean z, InterfaceC1685750ty9 interfaceC1685750ty9, Function0<Unit> function0, int i, int i2) {
        super(2);
        this.LL = socialMediaPickerViewModel;
        this.LLILLJJLI = z;
        this.LLILLL = interfaceC1685750ty9;
        this.LLILZ = function0;
        this.LLILZIL = i;
        this.LLILZLL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1668950tX3.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZIL | 1), this.LLILZLL);
        return Unit.LIZ;
    }
}
