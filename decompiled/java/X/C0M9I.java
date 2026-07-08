package X;

import Y.AfS177S0100000_8;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.ISocialMediaPickerAPI;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import com.ss.android.ugc.aweme.story.model.StoryArchDetailResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M9I, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.topbar.MediaPickerTopBarKt$MediaPickerSimpleTopBar$1$2$1", f = "MediaPickerTopBar.kt", l = {}, m = "invokeSuspend")
public final class C0M9I extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SocialMediaPickerViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M9I(SocialMediaPickerViewModel socialMediaPickerViewModel, InterfaceC1364105Vn<? super C0M9I> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = socialMediaPickerViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0M9I(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C11NZ<StoryArchDetailResponse> storyArchDetail;
        C1C7U.LIZ("MediaPickerTopBarKt@a02d.MediaPickerSimpleTopBar$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SocialMediaPickerViewModel socialMediaPickerViewModel = this.LL;
        if (socialMediaPickerViewModel.LL.getHasStoryArchiveV2Entrance()) {
            ISocialMediaPickerAPI.LIZ.getClass();
            ISocialMediaPickerAPI value = C0M9J.LIZIZ.getValue();
            if (value != null && (storyArchDetail = value.getStoryArchDetail()) != null) {
                socialMediaPickerViewModel.LLLFF.LIZ(storyArchDetail.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(socialMediaPickerViewModel, 94)));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaPickerTopBarKt@a02d.MediaPickerSimpleTopBar$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
