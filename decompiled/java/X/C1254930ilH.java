package X;

import Y.ARunnableS88S0200000_19;
import android.graphics.Bitmap;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.profile.business.profile.background.ProfileBgImagePreviewActivity;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ilH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.background.ProfileBgImagePreviewActivity$loadImageFromNetwork$1", f = "ProfileBgImagePreviewActivity.kt", l = {}, m = "invokeSuspend")
public final class C1254930ilH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ProfileBgImagePreviewActivity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1254930ilH(ProfileBgImagePreviewActivity profileBgImagePreviewActivity, InterfaceC1364105Vn<? super C1254930ilH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = profileBgImagePreviewActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1254930ilH(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileBgImagePreviewActivity@7895.loadImageFromNetwork$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final C259800zU c259800zU = new C259800zU();
        try {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(new ImageUrlModel("", this.LL.LLILZIL));
            c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
            final ProfileBgImagePreviewActivity profileBgImagePreviewActivity = this.LL;
            c1331670kl3LJIIIIZZ.LJIILJJIL(new InterfaceC605070NoH() { // from class: X.0ilI
                @Override // X.InterfaceC605070NoH
                public final void onCanceled() {
                    C1248210iaR.LJ("ProfileBgImagePreview", "loadImage: download canceled", EnumC1253850ijX.OTHERS, "");
                    c259800zU.element = null;
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [T, android.graphics.Bitmap] */
                @Override // X.InterfaceC605070NoH
                public final void LIZ(File file) {
                    String path;
                    C259800zU<Bitmap> c259800zU2 = c259800zU;
                    if (file == null || (path = file.getPath()) == null) {
                        path = "";
                    }
                    c259800zU2.element = BitmapUtils.getBitmapFromSD(path, 1080, 1080);
                    ProfileBgImagePreviewActivity profileBgImagePreviewActivity2 = profileBgImagePreviewActivity;
                    Bitmap bitmap = c259800zU.element;
                    profileBgImagePreviewActivity2.getClass();
                    profileBgImagePreviewActivity2.runOnUiThread(new ARunnableS88S0200000_19(bitmap, profileBgImagePreviewActivity2, 43));
                }

                @Override // X.InterfaceC605070NoH
                public final void onFailed(Throwable th) {
                    String message;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("loadImage: download failed, error: ");
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    sbLIZ.append(message);
                    C1248210iaR.LIZJ("ProfileBgImagePreview", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.OTHERS, "");
                    c259800zU.element = null;
                    ProfileBgImagePreviewActivity profileBgImagePreviewActivity2 = profileBgImagePreviewActivity;
                    profileBgImagePreviewActivity2.getClass();
                    profileBgImagePreviewActivity2.runOnUiThread(new ARunnableS88S0200000_19((Object) null, profileBgImagePreviewActivity2, 43));
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadImage failed: ");
            sbLIZ.append(e.getMessage());
            C1248210iaR.LIZJ("ProfileBgImagePreview", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.OTHERS, "");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileBgImagePreviewActivity@7895.loadImageFromNetwork$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
