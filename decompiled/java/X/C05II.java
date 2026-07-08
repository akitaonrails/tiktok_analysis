package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05II, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.main.MediaPickerMainPageKt$MediaPickerMainPage$4$1", f = "MediaPickerMainPage.kt", l = {120}, m = "invokeSuspend")
public final class C05II extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SocialMediaPickerViewModel LLILLJJLI;
    public final /* synthetic */ LifecycleOwner LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05II(Context context, LifecycleOwner lifecycleOwner, SocialMediaPickerViewModel socialMediaPickerViewModel, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = socialMediaPickerViewModel;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        SocialMediaPickerViewModel socialMediaPickerViewModel = this.LLILLJJLI;
        return new C05II(this.LLILZ, this.LLILLL, socialMediaPickerViewModel, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaPickerMainPageKt@611b.MediaPickerMainPage$4$1");
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
            SocialMediaPickerViewModel socialMediaPickerViewModel = this.LLILLJJLI;
            InterfaceC346201Wa<C06MT> interfaceC346201Wa = socialMediaPickerViewModel.LLJJJJ;
            C06MS c06ms = new C06MS(this.LLILZ, this.LLILLL, socialMediaPickerViewModel, null);
            this.LL = 1;
            if (C09IC.LJII(interfaceC346201Wa, this, c06ms) == objLJFF) {
                C1C7U.LIZIZ("MediaPickerMainPageKt@611b.MediaPickerMainPage$4$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaPickerMainPageKt@611b.MediaPickerMainPage$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
