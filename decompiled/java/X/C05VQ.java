package X;

import Y.AgS193S0200000_2;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS546S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05VQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.main.MediaPickerListKt$MediaPickerList$2$1$6$1", f = "MediaPickerList.kt", l = {224}, m = "invokeSuspend")
public final class C05VQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SocialMediaPickerViewModel LLILLJJLI;
    public final /* synthetic */ AbstractC1690640u62 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05VQ(SocialMediaPickerViewModel socialMediaPickerViewModel, AbstractC1690640u62 abstractC1690640u62, InterfaceC1364105Vn<? super C05VQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = socialMediaPickerViewModel;
        this.LLILLL = abstractC1690640u62;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05VQ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaPickerListKt@5aa8.MediaPickerList$2$1$6$1");
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
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(C20028913Yh.LJIIIZ(new AwS546S0100000_2(this.LLILLJJLI, 809)));
            AgS193S0200000_2 agS193S0200000_2 = new AgS193S0200000_2(this.LLILLJJLI, this.LLILLL, 11);
            this.LL = 1;
            if (interfaceC346201WaLJIILL.collect(agS193S0200000_2, this) == objLJFF) {
                C1C7U.LIZIZ("MediaPickerListKt@5aa8.MediaPickerList$2$1$6$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaPickerListKt@5aa8.MediaPickerList$2$1$6$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
