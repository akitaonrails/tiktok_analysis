package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Tx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel$refreshStoryAlbumDraftEntrance$1$2", f = "SocialMediaPickerViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1359905Tx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SocialMediaPickerViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1359905Tx(SocialMediaPickerViewModel socialMediaPickerViewModel, InterfaceC1364105Vn<? super C1359905Tx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = socialMediaPickerViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1359905Tx(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialMediaPickerViewModel@4194.refreshStoryAlbumDraftEntrance$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((C13FE) this.LL.LLJJ).setValue(Boolean.FALSE);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialMediaPickerViewModel@4194.refreshStoryAlbumDraftEntrance$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
