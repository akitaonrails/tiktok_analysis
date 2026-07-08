package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S2c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C714800S2c {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZJ() {
        return C14KQ.LJII() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84));
    }

    public static int LIZLLL() {
        return C14KQ.LJII() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(145));
    }

    public static Pair LIZ(Float f, int i, EnumC714820S2e enumC714820S2e) {
        float f2;
        float f3;
        int i2;
        if (f != null && f.floatValue() > 0.0f) {
            int i3 = C714810S2d.LIZ[enumC714820S2e.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    if (Intrinsics.LIZLLL(f, 1.0f)) {
                        i2 = i;
                    } else {
                        if (f.floatValue() > 1.0f) {
                            f2 = i;
                            f3 = 1.3333334f;
                        } else {
                            f2 = i;
                            f3 = 0.75f;
                        }
                        i2 = (int) (f2 * f3);
                    }
                    return new Pair(Integer.valueOf(i2), Integer.valueOf(i));
                }
                throw new C1954807lC();
            }
            return new Pair(Integer.valueOf(i), Integer.valueOf((int) (i / f.floatValue())));
        }
        return new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(237))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(316))));
    }

    public static Pair LIZIZ(Float f, int i, EnumC714830S2f enumC714830S2f) {
        float f2;
        int i2;
        float f3;
        int i3;
        if (f != null && f.floatValue() > 0.0f) {
            int i4 = C714810S2d.LIZIZ[enumC714830S2f.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    if (Intrinsics.LIZLLL(f, 1.0f)) {
                        i3 = i;
                    } else {
                        if (f.floatValue() > 1.0f) {
                            f3 = i / 0.75f;
                        } else {
                            f3 = i / 1.25f;
                        }
                        i3 = (int) f3;
                    }
                    return new Pair(Integer.valueOf(i3), Integer.valueOf(i));
                }
                throw new C1954807lC();
            }
            if (Intrinsics.LIZLLL(f, 1.0f)) {
                i2 = i;
            } else {
                if (f.floatValue() > 1.0f) {
                    f2 = i * 0.75f;
                } else {
                    f2 = i * 1.25f;
                }
                i2 = (int) f2;
            }
            return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        }
        return new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(237))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(316))));
    }

    public static void LJ(PhotoModeImage photoModeImage, SmartImageView smartImageView, Pair pair, Aweme aweme, InterfaceC658750Psf interfaceC658750Psf, Context context, int i, InterfaceC427850Gq7 interfaceC427850Gq7, boolean z) {
        int i2;
        UrlModel urlModel;
        List<String> urlList;
        int i3;
        int i4;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        String blurHashCode;
        InterfaceC1320380kSq interfaceC1320380kSqLJIIJJI;
        int width;
        int height;
        float fFloatValue;
        List<PhotoModeImageUrlModel> imageList2;
        PhotoModeImageUrlModel photoModeImageUrlModel2;
        Integer blurHashPreviewType;
        C1331070kk5 hierarchy;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        float fLIZIZ = C418440Gaw.LIZIZ(i2);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZJ = Float.valueOf(fLIZIZ);
        c384050F3z.LJFF = Integer.valueOf(R.attr.a02);
        Drawable drawableLIZ = c384050F3z.LIZ(context);
        float[] fArr = {fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ};
        if (smartImageView != null) {
            C462800ICw.LIZ(smartImageView, fArr);
        }
        if (photoModeImage != null) {
            urlModel = photoModeImage.urlModel;
        } else {
            urlModel = null;
        }
        if (urlModel != null) {
            urlList = urlModel.getUrlList();
        } else {
            urlList = null;
        }
        C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(urlList));
        c1331670kl3LJIIJ.LJJIIZI(drawableLIZ);
        C01GW c01gw = C2554609zk.LIZ;
        if (((Number) c01gw.getValue()).floatValue() > 0.0f) {
            if (photoModeImage != null) {
                if (pair == null) {
                    int i5 = photoModeImage.width;
                    int i6 = photoModeImage.height;
                    c1331670kl3LJIIJ.LJIIIIZZ = i5;
                    c1331670kl3LJIIJ.LJIIIZ = i6;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("loadImage resizing, originalSize=[");
                    sbLIZ.append(photoModeImage.width);
                    sbLIZ.append(", ");
                    sbLIZ.append(photoModeImage.height);
                    sbLIZ.append("], contentSize=[");
                    sbLIZ.append(((Number) pair.getFirst()).intValue());
                    sbLIZ.append(", ");
                    sbLIZ.append(((Number) pair.getSecond()).intValue());
                    sbLIZ.append(']');
                    C2188811AlT.LIZIZ(sbLIZ);
                    float fFloatValue2 = ((Number) c01gw.getValue()).floatValue();
                    int iFloatValue = (int) (((Number) pair.getFirst()).floatValue() * fFloatValue2);
                    if (iFloatValue < 0) {
                        iFloatValue = 0;
                    }
                    int iFloatValue2 = (int) (((Number) pair.getSecond()).floatValue() * fFloatValue2);
                    if (iFloatValue2 < 0) {
                        iFloatValue2 = 0;
                    }
                    int i7 = photoModeImage.width;
                    if (iFloatValue > i7 || iFloatValue2 > photoModeImage.height) {
                        iFloatValue2 = photoModeImage.height;
                        iFloatValue = i7;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("samplingRatio=");
                    sbLIZ2.append(fFloatValue2);
                    sbLIZ2.append(", sampledSize=[");
                    sbLIZ2.append(iFloatValue);
                    sbLIZ2.append(", ");
                    sbLIZ2.append(iFloatValue2);
                    sbLIZ2.append(']');
                    C2188811AlT.LIZIZ(sbLIZ2);
                    c1331670kl3LJIIJ.LJIIIIZZ = iFloatValue;
                    c1331670kl3LJIIJ.LJIIIZ = iFloatValue2;
                }
            }
        } else {
            if (photoModeImage != null) {
                i3 = photoModeImage.width;
                i4 = photoModeImage.height;
            } else {
                i3 = 0;
                i4 = 0;
            }
            c1331670kl3LJIIJ.LJIIIIZZ = i3;
            c1331670kl3LJIIJ.LJIIIZ = i4;
        }
        c1331670kl3LJIIJ.LJJJIL = interfaceC658750Psf;
        c1331670kl3LJIIJ.LIZLLL("photomode-friends");
        PhotoModeImage photoModeImageLJIILIIL = C720360SNm.LJIILIIL(aweme, i, false);
        if (photoModeImageLJIILIIL != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(i, imageList)) != null && (blurHashCode = photoModeImageUrlModel.getBlurHashCode()) != null && blurHashCode.length() != 0) {
            if (smartImageView != null && (hierarchy = smartImageView.getHierarchy()) != null) {
                interfaceC1320380kSqLJIIJJI = hierarchy.LJIIJJI();
            } else {
                interfaceC1320380kSqLJIIJJI = null;
            }
            if (Intrinsics.LJFF(interfaceC1320380kSqLJIIJJI, InterfaceC1320380kSq.LIZJ)) {
                int i8 = photoModeImageLJIILIIL.width;
                int i9 = photoModeImageLJIILIIL.height;
                c1331670kl3LJIIJ.LJJJLZIJ = i8;
                c1331670kl3LJIIJ.LJJJZ = i9;
            } else {
                if (smartImageView != null) {
                    if (smartImageView.getWidth() != 0 && smartImageView.getHeight() != 0) {
                        width = smartImageView.getWidth();
                        height = smartImageView.getHeight();
                    } else {
                        int i10 = photoModeImageLJIILIIL.width;
                        int i11 = photoModeImageLJIILIIL.height;
                        c1331670kl3LJIIJ.LJJJLZIJ = i10;
                        c1331670kl3LJIIJ.LJJJZ = i11;
                    }
                } else {
                    width = 0;
                    height = 0;
                }
                c1331670kl3LJIIJ.LJJJLZIJ = width;
                c1331670kl3LJIIJ.LJJJZ = height;
            }
            PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo2 != null && (imageList2 = photoModeImageInfo2.getImageList()) != null && (photoModeImageUrlModel2 = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(i, imageList2)) != null && (blurHashPreviewType = photoModeImageUrlModel2.getBlurHashPreviewType()) != null && blurHashPreviewType.intValue() == 2) {
                c1331670kl3LJIIJ.LIZIZ(blurHashCode);
            } else {
                float f = 20;
                Float f2 = photoModeImageLJIILIIL.aspectRatio;
                if (f2 != null) {
                    fFloatValue = f2.floatValue();
                } else {
                    fFloatValue = 1.0f;
                }
                c1331670kl3LJIIJ.LJJJLIIL = 20;
                c1331670kl3LJIIJ.LJJJLL = (int) (f / fFloatValue);
                c1331670kl3LJIIJ.LJJJJZI = blurHashCode;
            }
        }
        c1331670kl3LJIIJ.LJII = true;
        c1331670kl3LJIIJ.LJIL(drawableLIZ);
        c1331670kl3LJIIJ.LJJIII = EnumC1334360kpO.HIGH;
        c1331670kl3LJIIJ.LJJ(smartImageView);
        if (((Boolean) C0AIJ.LIZ.getValue()).booleanValue()) {
            c1331670kl3LJIIJ.LJIIL(interfaceC427850Gq7);
        } else {
            c1331670kl3LJIIJ.LJIIJ(interfaceC427850Gq7);
        }
    }
}
