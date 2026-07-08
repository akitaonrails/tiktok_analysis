package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ZG, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.common.MediaPickerBottomBarKt$MediaPickerBottomBar$1$3$1$1", f = "MediaPickerBottomBar.kt", l = {}, m = "invokeSuspend")
public final class C05ZG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SocialMediaPickerViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05ZG(SocialMediaPickerViewModel socialMediaPickerViewModel, InterfaceC1364105Vn<? super C05ZG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = socialMediaPickerViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05ZG(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaPickerBottomBarKt@3ff2.MediaPickerBottomBar$1$3$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.onEvent$social_creation_mediapicker_release(C05ZH.LIZIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaPickerBottomBarKt@3ff2.MediaPickerBottomBar$1$3$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
