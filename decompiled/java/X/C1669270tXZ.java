package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tXZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669270tXZ extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ SocialMediaPickerViewModel LLILLL;
    public final /* synthetic */ Function1<C563580M8m, Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1669270tXZ(float f, float f2, SocialMediaPickerViewModel socialMediaPickerViewModel, Function1<? super C563580M8m, Unit> function1, Function0<Unit> function0, InterfaceC1685750ty9 interfaceC1685750ty9, long j, int i, int i2) {
        super(2);
        this.LL = f;
        this.LLILLJJLI = f2;
        this.LLILLL = socialMediaPickerViewModel;
        this.LLILZ = function1;
        this.LLILZIL = function0;
        this.LLILZLL = interfaceC1685750ty9;
        this.LLIZ = j;
        this.LLIZLLLIL = i;
        this.LLJ = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1669280tXa.LIZJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZLLLIL | 1), this.LLJ);
        return Unit.LIZ;
    }
}
