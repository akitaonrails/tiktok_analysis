package X;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06MS, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.main.MediaPickerMainPageKt$MediaPickerMainPage$4$1$1", f = "MediaPickerMainPage.kt", l = {}, m = "invokeSuspend")
public final class C06MS extends C09AX implements Function2<C06MT, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ SocialMediaPickerViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06MS(Context context, LifecycleOwner lifecycleOwner, SocialMediaPickerViewModel socialMediaPickerViewModel, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = context;
        this.LLILZ = socialMediaPickerViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C06MS c06ms = new C06MS(this.LLILLL, this.LLILLJJLI, this.LLILZ, interfaceC1364105Vn);
        c06ms.LL = obj;
        return c06ms;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaPickerMainPageKt@611b.MediaPickerMainPage$4$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C06MT c06mt = (C06MT) this.LL;
        IComplianceBusinessService iComplianceBusinessService = (IComplianceBusinessService) PluggableExtentionKt.pluggableSpi$default(IComplianceBusinessService.class, false, false, false, 14, null);
        if (iComplianceBusinessService == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MediaPickerMainPageKt@611b.MediaPickerMainPage$4$1$1");
            return unit;
        }
        Lifecycle lifecycle = this.LLILLJJLI.getLifecycle();
        Context context = this.LLILLL;
        String str = c06mt.LIZ;
        String str2 = c06mt.LIZIZ;
        String str3 = c06mt.LIZJ;
        final SocialMediaPickerViewModel socialMediaPickerViewModel = this.LLILZ;
        lifecycle.addObserver(iComplianceBusinessService.LJJJJLI(context, 2131833819, str, str2, str3, new InterfaceC1916320zy2() { // from class: X.06MU
            @Override // X.InterfaceC1916320zy2
            public final void LIZ() {
            }

            @Override // X.InterfaceC1916320zy2
            public final boolean goBack() {
                socialMediaPickerViewModel.onEvent$social_creation_mediapicker_release(C06MV.LIZIZ);
                return true;
            }
        }));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MediaPickerMainPageKt@611b.MediaPickerMainPage$4$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C06MT c06mt, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c06mt, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
