package X;

import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter;
import com.ss.android.vesdk.VEUtils;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18j0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter$processLivePhotoSelected$3", f = "BackgroundVideoStickerPresenter.kt", l = {}, m = "invokeSuspend")
public final class C21363218j0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ BackgroundVideoStickerPresenter LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21363218j0(String str, BackgroundVideoStickerPresenter backgroundVideoStickerPresenter, String str2, InterfaceC1364105Vn<? super C21363218j0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = backgroundVideoStickerPresenter;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21363218j0(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        C1C7U.LIZ("BackgroundVideoStickerPresenter@77bb.processLivePhotoSelected$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strLIZIZ = this.LL;
        if (strLIZIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(UUID.randomUUID());
            sbLIZ.append("_image.jpeg");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        BackgroundVideoStickerPresenter backgroundVideoStickerPresenter = this.LLILLJJLI;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(UUID.randomUUID());
        sbLIZ2.append("_live.mp4");
        backgroundVideoStickerPresenter.LLJLLIL = C2188811AlT.LIZIZ(sbLIZ2);
        String strLJFF = C21363018iy.LJFF(this.LLILLJJLI.LLLIIIIL, "live_photo_picker", "live_photo_path");
        Boolean boolValueOf = null;
        if (!C123100dR.LIZ(strLJFF)) {
            strLJFF = null;
        }
        int iLJIIZILJ = 0;
        if (strLJFF != null) {
            BackgroundVideoStickerPresenter backgroundVideoStickerPresenter2 = this.LLILLJJLI;
            String str = this.LLILLL;
            C0VSJ c0vsj = new C0VSJ(strLJFF, strLIZIZ);
            String path = c0vsj.getPath();
            C0VSJ c0vsj2 = new C0VSJ(strLJFF, backgroundVideoStickerPresenter2.LLJLLIL);
            String path2 = c0vsj2.getPath();
            if (!c0vsj.exists()) {
                C2286708xd.LJIIIIZZ(c0vsj.getPath(), true);
            }
            if (!c0vsj2.exists()) {
                C2286708xd.LJIIIIZZ(c0vsj2.getPath(), true);
            }
            boolean zLIZJ = C2471909mP.LIZJ(str, path);
            C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Copy photo from ");
            sbLIZ3.append(str);
            sbLIZ3.append(" to effect path: ");
            sbLIZ3.append(path);
            sbLIZ3.append(" result ");
            sbLIZ3.append(zLIZJ);
            C201955140j.LIZLLL(c20012313Rx, "BackgroundVideoStickerPresenter", C2188811AlT.LIZIZ(sbLIZ3));
            if (str != null) {
                boolValueOf = Boolean.valueOf(VEUtils.isLivePhotoForJPEGFile(str, path2, true));
            }
            VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(path2);
            if (videoFileInfo != null) {
                i = videoFileInfo.rotation;
            } else {
                i = 0;
            }
            backgroundVideoStickerPresenter2.LLJZ = 360 - i;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Extracting live photo video from ");
            sbLIZ4.append(str);
            sbLIZ4.append(" to effect path: ");
            sbLIZ4.append(path2);
            sbLIZ4.append(" result ");
            sbLIZ4.append(boolValueOf);
            C201955140j.LIZLLL(c20012313Rx, "BackgroundVideoStickerPresenter", C2188811AlT.LIZIZ(sbLIZ4));
        }
        BackgroundVideoStickerPresenter backgroundVideoStickerPresenter3 = this.LLILLJJLI;
        C2259261Dbo c2259261DboLJIILLIIL = C2471909mP.LJIILLIIL(this.LLILLL);
        if (c2259261DboLJIILLIIL != null) {
            iLJIIZILJ = c2259261DboLJIILLIIL.LJIIZILJ();
        }
        backgroundVideoStickerPresenter3.LLJLLL = 360 - iLJIIZILJ;
        BackgroundVideoStickerPresenter backgroundVideoStickerPresenter4 = this.LLILLJJLI;
        String strLIZ = C21363018iy.LIZ(backgroundVideoStickerPresenter4.LLJLLL, backgroundVideoStickerPresenter4.LLJZ, backgroundVideoStickerPresenter4.LLJLLIL, strLIZIZ, true);
        C201955140j.LIZLLL(C20012313Rx.LIZIZ, "BackgroundVideoStickerPresenter", "Sending message to effect: " + strLIZ);
        this.LLILLJJLI.LLILZLL.get().LJIIJ(0L, strLIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BackgroundVideoStickerPresenter@77bb.processLivePhotoSelected$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
