package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.lemon.postmode.model.PostModeDetailParams;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.19v2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21692619v2 extends AbstractC21692819v4 {
    public final ViewGroup LJIIL;
    public final ViewOnTouchListenerC21650819oI LJIILIIL;
    public EnumC720680SOs LJIILJJIL;
    public final C01GW LJIILL;
    public final int LJIILLIIL;
    public final C21693219v8 LJIIZILJ;
    public final InterfaceC690040R4w LJIJ;
    public int LJIJI;
    public int LJIJJ;

    @Override // X.AbstractC21692819v4
    public final EnumC720680SOs LIZJ() {
        Bitmap bitmap;
        VideoItemParams videoItemParams;
        Aweme aweme;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        int i;
        int i2 = 1;
        if ((C1012040cRW.LIZIZ().LJIIL == -1 || this.LIZIZ == C1012040cRW.LIZIZ().LJIIL) && (bitmap = C308690C8d.LIZ) != null && (!bitmap.isRecycled())) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.LJI.getResources(), bitmap);
            LJ(bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
            this.LJIILIIL.getHierarchy().LJJIFFI(bitmapDrawable, this.LJIILIIL.getHierarchy().LJIIJJI());
            C308690C8d.LIZ = null;
            return EnumC720680SOs.COVER_PLACEHOLDER;
        }
        C21692119ux c21692119ux = this.LJIIIIZZ;
        if (c21692119ux != null && (videoItemParams = c21692119ux.LIZJ) != null && (aweme = videoItemParams.getAweme()) != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(this.LIZIZ, imageList)) != null && photoModeImageUrlModel.getBlurHashCode() != null) {
            PhotoModeImage photoModeImageLIZJ = C720350SNl.LIZJ(this.LIZIZ, aweme);
            int i3 = 0;
            if (photoModeImageLIZJ != null) {
                i = photoModeImageLIZJ.width;
                i3 = photoModeImageLIZJ.height;
            } else {
                i = 0;
            }
            int iMax = Math.max(i, i3);
            int iLIZ = C255670A0f.LIZ();
            if (iLIZ > 0) {
                while (iMax > iLIZ) {
                    i2++;
                    iMax = Math.max(i, i3) / i2;
                }
            }
            int i4 = i / i2;
            this.LJIJI = i4;
            int i5 = i3 / i2;
            this.LJIJJ = i5;
            LJ(i4, i5);
        }
        return this.LJIILIIL.getHierarchy().LJIILJJIL() ? EnumC720680SOs.BLUR_PLACEHOLDER : EnumC720680SOs.NONE;
    }

    @Override // X.AbstractC21692819v4
    public final void LIZLLL() {
        super.LIZLLL();
        this.LJIILJJIL = EnumC720680SOs.NONE;
        this.LJIILIIL.setPlaceholderImage((Drawable) null);
        this.LJIILIIL.setTouchEnabled(false);
    }

    @Override // X.AbstractC21692819v4
    public final C21693219v8 LIZIZ() {
        return this.LJIIZILJ;
    }

    @Override // X.AbstractC21692819v4
    public final InterfaceC469401sC LIZ(C21692119ux c21692119ux) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        PostModeDetailParams postModeDetailParamsH;
        String aid;
        Aweme aweme;
        VideoItemParams videoItemParams;
        View view;
        Aweme aweme2;
        this.LJIJI = 0;
        this.LJIJJ = 0;
        C21693619vC c21693619vC = (C21693619vC) this.LJIILL.getValue();
        if (c21693619vC.LIZ != null && (((videoItemParams = c21692119ux.LIZJ) == null || (aweme2 = videoItemParams.getAweme()) == null || !AwemeExtKt.isAdTraffic(aweme2)) && (view = c21693619vC.LIZ) != null)) {
            if (view.getContext() == null) {
                C844470XAv.LIZ.getClass();
                C844470XAv.LIZ();
            }
            C786410Ut5.LJLLLLLL(8, view);
        }
        C0HYF c0hyf = this.LJFF;
        if (c0hyf != null && (postModeDetailParamsH = c0hyf.H()) != null && c21692119ux.LIZ == postModeDetailParamsH.position) {
            ViewOnTouchListenerC21650819oI viewOnTouchListenerC21650819oI = this.LJIILIIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C0HYF c0hyf2 = this.LJFF;
            if (c0hyf2 != null && (aweme = c0hyf2.getAweme()) != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            sbLIZ.append("_cover_none");
            viewOnTouchListenerC21650819oI.setTransitionName(C2188811AlT.LIZIZ(sbLIZ));
        }
        ViewGroup.LayoutParams layoutParams = this.LJIIL.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = this.LJIILLIIL;
            C786410Ut5.X5(marginLayoutParams, this.LJIIL);
        }
        if (C1601690rmZ.LIZIZ()) {
            this.LJIIL.setContentDescription(c21692119ux.LIZIZ.altText);
        }
        super.LIZ(c21692119ux);
        return null;
    }

    public final void LJ(int i, int i2) {
        ImageView.ScaleType scaleType;
        EnumC1338240kve enumC1338240kve;
        Bitmap bitmap = C308690C8d.LIZ;
        float fLIZ = C308690C8d.LIZ(Integer.valueOf(i), Integer.valueOf(i2));
        EnumC308660C8a enumC308660C8a = EnumC308660C8a.CASE_DEFAULT;
        if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJLJLLL()) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        } else if (enumC308660C8a == EnumC308660C8a.CASE_C) {
            if (fLIZ < 0.75f) {
                scaleType = ImageView.ScaleType.CENTER_CROP;
            } else {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
        } else if (fLIZ <= ((Number) C308680C8c.LIZIZ.getValue()).floatValue()) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        C426750GoL.LJIIIZ(this.LJIIL, null, Integer.valueOf(this.LJIILLIIL), null, null, false, 29);
        ViewOnTouchListenerC21650819oI viewOnTouchListenerC21650819oI = this.LJIILIIL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewOnTouchListenerC21650819oI);
        viewOnTouchListenerC21650819oI.setTranslationY(0.0f);
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        ViewOnTouchListenerC21650819oI viewOnTouchListenerC21650819oI2 = this.LJIILIIL;
        switch (C340130DVb.LIZ[scaleType.ordinal()]) {
            case 1:
                enumC1338240kve = EnumC1338240kve.FIT_XY;
                break;
            case 2:
                enumC1338240kve = EnumC1338240kve.FIT_START;
                break;
            case 3:
                enumC1338240kve = EnumC1338240kve.FIT_CENTER;
                break;
            case 4:
                enumC1338240kve = EnumC1338240kve.FIT_END;
                break;
            case 5:
                enumC1338240kve = EnumC1338240kve.CENTER;
                break;
            case 6:
                enumC1338240kve = EnumC1338240kve.CENTER_CROP;
                break;
            case 7:
                enumC1338240kve = EnumC1338240kve.CENTER_INSIDE;
                break;
            default:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unsupported scale type ");
                sbLIZ.append(scaleType);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        viewOnTouchListenerC21650819oI2.setActualImageScaleType(enumC1338240kve);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.19v3] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.19uz] */
    public C21692619v2(View view, InterfaceC21651419oO interfaceC21651419oO, InterfaceC21692419v0 interfaceC21692419v0, InterfaceC21693319v9 interfaceC21693319v9, ViewGroup viewGroup, InterfaceC21693419vA interfaceC21693419vA, C0HYF c0hyf) {
        int i;
        ViewStub viewStub;
        C1331860klM c1331860klM;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super(view, interfaceC21692419v0, interfaceC21693319v9, c0hyf);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.qeg);
        this.LJIIL = viewGroup2;
        ViewOnTouchListenerC21650819oI viewOnTouchListenerC21650819oI = (ViewOnTouchListenerC21650819oI) viewGroup2.findViewById(R.id.vmb);
        this.LJIILIIL = viewOnTouchListenerC21650819oI;
        this.LJIILJJIL = EnumC720680SOs.NONE;
        this.LJIILL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3784));
        ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i = marginLayoutParams.topMargin;
        } else {
            i = 0;
        }
        this.LJIILLIIL = i;
        this.LJIIZILJ = new C21693219v8(interfaceC21693319v9, interfaceC21693419vA, view, new InterfaceC21693519vB() { // from class: X.19v3
            @Override // X.InterfaceC21693519vB
            public final void LIZ(int i2, int i3) {
                C21692119ux c21692119ux;
                Aweme aweme;
                PhotoModeImage photoModeImageLIZJ;
                VideoItemParams videoItemParams;
                Aweme aweme2;
                PhotoModeImage photoModeImageLIZJ2;
                C21692119ux c21692119ux2;
                VideoItemParams videoItemParams2;
                Aweme aweme3;
                PhotoModeImageInfo photoModeImageInfo;
                C21692619v2 c21692619v2 = this.LIZ;
                int i4 = c21692619v2.LJIJI;
                if (i4 != 0 && c21692619v2.LJIJJ != 0 && Math.abs(i4 - i2) < 3 && Math.abs(this.LIZ.LJIJJ - i3) < 3) {
                    C21692619v2 c21692619v22 = this.LIZ;
                    c21692619v22.LJIIJ = c21692619v22.LJIJI;
                    c21692619v22.LJIIJJI = c21692619v22.LJIJJ;
                } else {
                    C21692619v2 c21692619v23 = this.LIZ;
                    c21692619v23.LJIIJ = i2;
                    c21692619v23.LJIIJJI = i3;
                }
                C21692619v2 c21692619v24 = this.LIZ;
                int i5 = c21692619v24.LJIIJ;
                int i6 = c21692619v24.LJIIJJI;
                c21692619v24.LJIILIIL.setTouchEnabled(true);
                C21692119ux c21692119ux3 = c21692619v24.LJIIIIZZ;
                UrlModel urlModel = null;
                if (c21692119ux3 != null && (videoItemParams = c21692119ux3.LIZJ) != null && (aweme2 = videoItemParams.getAweme()) != null && (photoModeImageLIZJ2 = C720350SNl.LIZJ(c21692619v24.LIZIZ, aweme2)) != null && ((photoModeImageLIZJ2.width != i5 || photoModeImageLIZJ2.height != i6) && (c21692119ux2 = c21692619v24.LJIIIIZZ) != null && (videoItemParams2 = c21692119ux2.LIZJ) != null && (aweme3 = videoItemParams2.getAweme()) != null && (photoModeImageInfo = aweme3.getPhotoModeImageInfo()) != null)) {
                    List<PhotoModeImage> listLIZIZ = C720350SNl.LIZIZ(photoModeImageInfo);
                    int i7 = c21692619v24.LIZIZ;
                    UrlModel urlModel2 = photoModeImageLIZJ2.urlModel;
                    Bitmap bitmap = C308690C8d.LIZ;
                    ListProtector.set(listLIZIZ, i7, new PhotoModeImage(urlModel2, i5, i6, Float.valueOf(C308690C8d.LIZ(Integer.valueOf(photoModeImageLIZJ2.width), Integer.valueOf(photoModeImageLIZJ2.height))), photoModeImageLIZJ2.translatedUrlModel, c21692619v24.LIZIZ));
                }
                c21692619v24.LJ(i5, i6);
                if (c21692619v24.LJIJ != null && C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJJI() && (c21692119ux = c21692619v24.LJIIIIZZ) != null) {
                    int i8 = c21692119ux.LIZ;
                    VideoItemParams videoItemParamsD6 = c21692619v24.LJ.d6();
                    if (videoItemParamsD6 != null && (aweme = videoItemParamsD6.getAweme()) != null && (photoModeImageLIZJ = C720350SNl.LIZJ(i8, aweme)) != null) {
                        urlModel = photoModeImageLIZJ.urlModel;
                    }
                    ImageUrlModel imageUrlModelLIZ = C438710HIf.LIZ(urlModel);
                    InterfaceC690040R4w interfaceC690040R4w = c21692619v24.LJIJ;
                    if (interfaceC690040R4w != null) {
                        interfaceC690040R4w.LIZIZ(i5, i6, imageUrlModelLIZ);
                    }
                }
                C21692619v2 c21692619v25 = this.LIZ;
                c21692619v25.LJIILIIL.setPinchEnabled(c21692619v25.LJIIZILJ.LIZLLL);
            }
        });
        ?? r7 = new InterfaceC21651119oL() { // from class: X.19uz
            public float LIZ = 1.0f;

            @Override // X.InterfaceC21651119oL
            public final void LJJJIL() {
                C21692619v2 c21692619v2 = this.LIZIZ;
                c21692619v2.getClass();
                ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).setTitleTabVisibility(false);
                c21692619v2.LIZLLL.N();
                this.LIZ = 1.0f;
            }

            @Override // X.InterfaceC21651119oL
            public final void LJZL() {
                C21692619v2 c21692619v2 = this.LIZIZ;
                c21692619v2.getClass();
                ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).setTitleTabVisibility(true);
                c21692619v2.LIZLLL.O();
                c21692619v2.LJIIIZ = false;
            }

            @Override // X.InterfaceC21651119oL
            public final void onScale(float f) {
                if (f >= 1.01f) {
                    C21692619v2 c21692619v2 = this.LIZIZ;
                    if (!c21692619v2.LJIIIZ) {
                        c21692619v2.LJIIIZ = true;
                    }
                }
                this.LIZ = f;
            }
        };
        InterfaceC1332050klf interfaceC1332050klf = new InterfaceC1332050klf() { // from class: X.19v1
            @Override // X.InterfaceC1332050klf
            public final void LIZ(Drawable drawable) {
                EnumC720680SOs enumC720680SOs;
                BitmapDrawable bitmapDrawable;
                Bitmap bitmap;
                C21692619v2 c21692619v2 = this.LIZ;
                if (drawable instanceof C1317740kOa) {
                    enumC720680SOs = EnumC720680SOs.BLUR_PLACEHOLDER;
                } else {
                    enumC720680SOs = EnumC720680SOs.COVER_PLACEHOLDER;
                }
                c21692619v2.LJIILJJIL = enumC720680SOs;
                C21693119v7 c21693119v7 = c21692619v2.LJIIZILJ.LJIIIZ;
                if (!c21693119v7.LJI || enumC720680SOs != EnumC720680SOs.BLUR_PLACEHOLDER) {
                    c21693119v7.LIZ();
                }
                if (this.LIZ.LJIILJJIL != EnumC720680SOs.BLUR_PLACEHOLDER && (drawable instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) drawable) != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                    this.LIZ.LJ(bitmap.getWidth(), bitmap.getHeight());
                }
            }
        };
        viewGroup2.setOnTouchListener(viewOnTouchListenerC21650819oI);
        if (viewGroup != null) {
            viewOnTouchListenerC21650819oI.getClass();
            viewOnTouchListenerC21650819oI.LLJILLL = new C21650919oJ(viewOnTouchListenerC21650819oI, viewGroup2, viewGroup, r7, interfaceC21651419oO);
            C1331070kk5 hierarchy = viewOnTouchListenerC21650819oI.getHierarchy();
            if ((hierarchy instanceof C1331860klM) && (c1331860klM = (C1331860klM) hierarchy) != null) {
                c1331860klM.LJII = interfaceC1332050klf;
            }
            C2271391DvN.LIZ(viewGroup2, C2271381DvM.LIZIZ());
        }
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJIJI().LJJJI() && (viewStub = (ViewStub) view.findViewById(R.id.wzf)) != null) {
            this.LJIJ = c19252910Tv.LIZLLL().LJIJI().LLILZ(viewStub, C960203pA.LIZ(R.attr.bn, this.LJI));
        }
    }
}
