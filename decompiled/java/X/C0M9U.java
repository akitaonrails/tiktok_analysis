package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0M9U, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M9U extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1685750ty9 LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ SocialMediaPickerViewModel LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M9U(InterfaceC1685750ty9 interfaceC1685750ty9, float f, SocialMediaPickerViewModel socialMediaPickerViewModel, int i) {
        super(2);
        this.LL = interfaceC1685750ty9;
        this.LLILLJJLI = f;
        this.LLILLL = socialMediaPickerViewModel;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1669260tXY.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZ | 1));
        return Unit.LIZ;
    }
}
