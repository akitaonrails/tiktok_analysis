package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.vesdk.VEUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09M7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel$onItemVisible$1", f = "SocialMediaPickerViewModel.kt", l = {}, m = "invokeSuspend")
public final class C09M7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SocMediaResource LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09M7(SocMediaResource socMediaResource, InterfaceC1364105Vn<? super C09M7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = socMediaResource;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09M7(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("SocialMediaPickerViewModel@4194.onItemVisible$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.LIZLLL()) {
            SocMediaResource socMediaResource = this.LL;
            if (socMediaResource.rotation == null) {
                VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(socMediaResource.tiktokMediaModel.LJFF());
                if (videoFileInfo == null) {
                    i = 0;
                } else {
                    i = videoFileInfo.rotation;
                }
                socMediaResource.rotation = C2286608xc.LJ(i);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialMediaPickerViewModel@4194.onItemVisible$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
