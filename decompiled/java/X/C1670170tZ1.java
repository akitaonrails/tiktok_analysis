package X;

import Y.AgS76S0400000_25;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;
import njp.a;

/* JADX INFO: renamed from: X.0tZ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.main.SocMediaPickerGridListKt$SocMediaPickerGridList$3$1", f = "SocMediaPickerGridList.kt", l = {84}, m = "invokeSuspend")
public final class C1670170tZ1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1690050u55 LLILLJJLI;
    public final /* synthetic */ SocialMediaPickerViewModel LLILLL;
    public final /* synthetic */ C05P0<Boolean> LLILZ;
    public final /* synthetic */ InterfaceC1665500tRU<SocMediaResource> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1670170tZ1(C1690050u55 c1690050u55, SocialMediaPickerViewModel socialMediaPickerViewModel, C05P0<Boolean> c05p0, InterfaceC1665500tRU<SocMediaResource> interfaceC1665500tRU, InterfaceC1364105Vn<? super C1670170tZ1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1690050u55;
        this.LLILLL = socialMediaPickerViewModel;
        this.LLILZ = c05p0;
        this.LLILZIL = interfaceC1665500tRU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1670170tZ1(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocMediaPickerGridListKt@a939.SocMediaPickerGridList$3$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(C20028913Yh.LJIIIZ(new AwS569S0100000_25(this.LLILLJJLI, 369)));
            AgS76S0400000_25 agS76S0400000_25 = new AgS76S0400000_25(this.LLILLL, this.LLILLJJLI, this.LLILZ, this.LLILZIL, 0);
            this.LL = 1;
            if (interfaceC346201WaLJIILL.collect(agS76S0400000_25, this) == objLJFF) {
                C1C7U.LIZIZ("SocMediaPickerGridListKt@a939.SocMediaPickerGridList$3$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocMediaPickerGridListKt@a939.SocMediaPickerGridList$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
