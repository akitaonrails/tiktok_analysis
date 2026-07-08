package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0M9K, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M9K extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1685750ty9 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ SocialMediaPickerViewModel LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M9K(InterfaceC1685750ty9 interfaceC1685750ty9, String str, Function0<Unit> function0, SocialMediaPickerViewModel socialMediaPickerViewModel, int i) {
        super(2);
        this.LL = interfaceC1685750ty9;
        this.LLILLJJLI = str;
        this.LLILLL = function0;
        this.LLILZ = socialMediaPickerViewModel;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1669310tXd.LIZJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZIL | 1));
        return Unit.LIZ;
    }
}
