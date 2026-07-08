package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel$refreshStoryAlbumDraftEntrance$1$1", f = "SocialMediaPickerViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1360005Ty extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SocialMediaPickerViewModel LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1360005Ty(SocialMediaPickerViewModel socialMediaPickerViewModel, int i, long j, InterfaceC1364105Vn<? super C1360005Ty> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = socialMediaPickerViewModel;
        this.LLILLJJLI = i;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1360005Ty(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Long] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialMediaPickerViewModel@4194.refreshStoryAlbumDraftEntrance$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SocialMediaPickerViewModel socialMediaPickerViewModel = this.LL;
        int i = this.LLILLJJLI;
        C563560M8k c563560M8k = socialMediaPickerViewModel.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SocialMediaPickerViewModel.LLLI;
        boolean z = false;
        c563560M8k.LIZIZ = Integer.valueOf(i);
        SocialMediaPickerViewModel socialMediaPickerViewModel2 = this.LL;
        long j = this.LLILLL;
        socialMediaPickerViewModel2.LLJJIII.LIZIZ = Long.valueOf(j);
        SocialMediaPickerViewModel socialMediaPickerViewModel3 = this.LL;
        if (this.LLILLJJLI > 0) {
            z = true;
        }
        ((C13FE) socialMediaPickerViewModel3.LLJJ).setValue(Boolean.valueOf(z));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialMediaPickerViewModel@4194.refreshStoryAlbumDraftEntrance$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
