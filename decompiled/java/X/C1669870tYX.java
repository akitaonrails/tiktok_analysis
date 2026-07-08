package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tYX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669870tYX extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C1690050u55 LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ InterfaceC1665500tRU<SocMediaResource> LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ float LLILZIL;
    public final /* synthetic */ SocialMediaPickerViewModel LLILZLL;
    public final /* synthetic */ float LLIZ;
    public final /* synthetic */ Function2<C1378605aS, SocMediaResource, Unit> LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ InterfaceC20086513iZ LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ int LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1669870tYX(C1690050u55 c1690050u55, int i, InterfaceC1665500tRU<SocMediaResource> interfaceC1665500tRU, float f, float f2, SocialMediaPickerViewModel socialMediaPickerViewModel, float f3, Function2<? super C1378605aS, ? super SocMediaResource, Unit> function2, boolean z, InterfaceC20086513iZ interfaceC20086513iZ, int i2, int i3) {
        super(2);
        this.LL = c1690050u55;
        this.LLILLJJLI = i;
        this.LLILLL = interfaceC1665500tRU;
        this.LLILZ = f;
        this.LLILZIL = f2;
        this.LLILZLL = socialMediaPickerViewModel;
        this.LLIZ = f3;
        this.LLIZLLLIL = function2;
        this.LLJ = z;
        this.LLJI = interfaceC20086513iZ;
        this.LLJIJIL = i2;
        this.LLJILJIL = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1669880tYY.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJIJIL | 1), this.LLJILJIL);
        return Unit.LIZ;
    }
}
