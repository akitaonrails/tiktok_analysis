package X;

import android.graphics.Bitmap;
import com.bytedance.common.utility.BitmapUtils;
import com.ss.android.ugc.aweme.socialavatar.viewmodel.v2.SocialAvatarCreationViewModelV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HLA, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.viewmodel.v2.SocialAvatarCreationViewModelV2$updatePreviewImage$1", f = "SocialAvatarCreationViewModelV2.kt", l = {}, m = "invokeSuspend")
public final class C0HLA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ SocialAvatarCreationViewModelV2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HLA(String str, SocialAvatarCreationViewModelV2 socialAvatarCreationViewModelV2, InterfaceC1364105Vn<? super C0HLA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = socialAvatarCreationViewModelV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HLA(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SocialAvatarCreationViewModelV2@c606.updatePreviewImage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bitmap bitmapLIZLLL = C2471909mP.LIZLLL(this.LL, null);
        if (bitmapLIZLLL == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SocialAvatarCreationViewModelV2@c606.updatePreviewImage$1");
            return unit;
        }
        int iLIZ = C13W4.LIZ(this.LL);
        Bitmap bitmapRotateBitmap = BitmapUtils.rotateBitmap(bitmapLIZLLL, iLIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updatePreviewImage. bitmap width: ");
        sbLIZ.append(bitmapRotateBitmap.getWidth());
        sbLIZ.append(", height: ");
        sbLIZ.append(bitmapRotateBitmap.getHeight());
        sbLIZ.append("， degree: ");
        sbLIZ.append(iLIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C2252321DDq c2252321DDq = this.LLILLJJLI.LLJJIJIIJIL;
        while (!c2252321DDq.compareAndSet(c2252321DDq.getValue(), new C1696790uFx(bitmapRotateBitmap))) {
        }
        this.LLILLJJLI.LLILLJJLI.getClass();
        C0HMP.LIZIZ(bitmapRotateBitmap);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarCreationViewModelV2@c606.updatePreviewImage$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
