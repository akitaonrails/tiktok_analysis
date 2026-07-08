package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19v4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21692819v4 extends AbstractC21691919uv {
    public final View LIZJ;
    public final InterfaceC21692419v0 LIZLLL;
    public final InterfaceC21693319v9 LJ;
    public final C0HYF LJFF;
    public final Context LJI;
    public final C01GW LJII;
    public C21692119ux LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;

    public abstract C21693219v8 LIZIZ();

    public void LIZLLL() {
        C21693219v8 c21693219v8LIZIZ = LIZIZ();
        if (c21693219v8LIZIZ != null) {
            c21693219v8LIZIZ.LIZIZ();
        }
        this.LJIIIIZZ = null;
        this.LJIIIZ = false;
        this.LJIIJ = -1;
        this.LJIIJJI = -1;
    }

    public EnumC720680SOs LIZJ() {
        return EnumC720680SOs.NONE;
    }

    public InterfaceC469401sC LIZ(C21692119ux c21692119ux) {
        PhotoModeImage photoModeImageLIZJ;
        UrlModel urlModel;
        String str;
        String str2;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        String blurHashCode;
        float fFloatValue;
        List<PhotoModeImageUrlModel> imageList2;
        PhotoModeImageUrlModel photoModeImageUrlModel2;
        Integer blurHashPreviewType;
        Aweme aweme;
        if (Intrinsics.LJFF(c21692119ux, this.LJIIIIZZ)) {
            return null;
        }
        LIZLLL();
        this.LJIIIIZZ = c21692119ux;
        final EnumC720680SOs enumC720680SOsLIZJ = LIZJ();
        final C21693219v8 c21693219v8LIZIZ = LIZIZ();
        if (c21693219v8LIZIZ != null) {
            final int i = c21692119ux.LIZ;
            final VideoItemParams videoItemParams = c21692119ux.LIZJ;
            Boolean bool = c21692119ux.LJ;
            if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
                photoModeImageLIZJ = C720350SNl.LIZJ(i, aweme);
            } else {
                photoModeImageLIZJ = null;
            }
            C21693119v7 c21693119v7 = c21693219v8LIZIZ.LJIIIZ;
            if (videoItemParams != null) {
                videoItemParams.getAweme();
            }
            c21693119v7.getClass();
            if (bool != null) {
                bool.booleanValue();
                bool.booleanValue();
                if (photoModeImageLIZJ != null && (urlModel = photoModeImageLIZJ.urlModel) != null) {
                    c21693219v8LIZIZ.LJI = i;
                    List<String> urlList = urlModel.getUrlList();
                    if (urlList == null || (str = (String) C13LP.LJJJLZIJ(0, urlList)) == null) {
                        str = "";
                    }
                    c21693219v8LIZIZ.LJ = str;
                    c21693219v8LIZIZ.LJII = urlModel;
                    c21693219v8LIZIZ.LJFF = videoItemParams;
                    c21693219v8LIZIZ.LJIIIIZZ = SystemClock.elapsedRealtime();
                    C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(urlModel.getUrlList()));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("photomode-");
                    if (videoItemParams != null) {
                        str2 = videoItemParams.mEventType;
                    } else {
                        str2 = null;
                    }
                    sbLIZ.append(str2);
                    c1331670kl3LJIIJ.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                    c1331670kl3LJIIJ.LJJIII = EnumC1334360kpO.HIGH;
                    if (videoItemParams != null) {
                        PhotoModeImage photoModeImageLIZJ2 = C720350SNl.LIZJ(c21693219v8LIZIZ.LJI, videoItemParams.getAweme());
                        if (photoModeImageLIZJ2 != null && (photoModeImageInfo = videoItemParams.getAweme().getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(c21693219v8LIZIZ.LJI, imageList)) != null && (blurHashCode = photoModeImageUrlModel.getBlurHashCode()) != null && blurHashCode.length() != 0) {
                            if (Intrinsics.LJFF(c21693219v8LIZIZ.LIZJ.getHierarchy().LJIIJJI(), InterfaceC1320380kSq.LIZJ)) {
                                int i2 = photoModeImageLIZJ2.width;
                                int i3 = photoModeImageLIZJ2.height;
                                c1331670kl3LJIIJ.LJJJLZIJ = i2;
                                c1331670kl3LJIIJ.LJJJZ = i3;
                            } else if (c21693219v8LIZIZ.LIZJ.getWidth() != 0 && c21693219v8LIZIZ.LIZJ.getHeight() != 0) {
                                int width = c21693219v8LIZIZ.LIZJ.getWidth();
                                int height = c21693219v8LIZIZ.LIZJ.getHeight();
                                c1331670kl3LJIIJ.LJJJLZIJ = width;
                                c1331670kl3LJIIJ.LJJJZ = height;
                            } else {
                                int i4 = photoModeImageLIZJ2.width;
                                int i5 = photoModeImageLIZJ2.height;
                                c1331670kl3LJIIJ.LJJJLZIJ = i4;
                                c1331670kl3LJIIJ.LJJJZ = i5;
                            }
                            PhotoModeImageInfo photoModeImageInfo2 = videoItemParams.getAweme().getPhotoModeImageInfo();
                            if (photoModeImageInfo2 != null && (imageList2 = photoModeImageInfo2.getImageList()) != null && (photoModeImageUrlModel2 = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(c21693219v8LIZIZ.LJI, imageList2)) != null && (blurHashPreviewType = photoModeImageUrlModel2.getBlurHashPreviewType()) != null && blurHashPreviewType.intValue() == 2) {
                                c1331670kl3LJIIJ.LIZIZ(blurHashCode);
                            } else {
                                float f = 20;
                                Float f2 = photoModeImageLIZJ2.aspectRatio;
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
                    }
                    c1331670kl3LJIIJ.LJIL = c21693219v8LIZIZ.LJIIJ;
                    if (C443940Hay.LIZIZ(videoItemParams.getAweme())) {
                        c1331670kl3LJIIJ.LJI = true;
                    }
                    if (C443940Hay.LIZIZ(videoItemParams.getAweme())) {
                        c1331670kl3LJIIJ.LJII = true;
                    }
                    if (C255670A0f.LIZ() != 2048 && urlModel.getWidth() > 0 && urlModel.getHeight() > 0) {
                        c1331670kl3LJIIJ.LJJIJIIJI(urlModel.getWidth(), urlModel.getHeight(), C255670A0f.LIZ());
                    }
                    C1325420kay.LIZJ(new InterfaceC442640HXi() { // from class: X.19v5
                        @Override // X.InterfaceC442640HXi
                        public final void onResult(Object obj) {
                            if (!((Boolean) obj).booleanValue()) {
                                AbstractC21693019v6 abstractC21693019v6 = c21693219v8LIZIZ;
                                EnumC720680SOs enumC720680SOs = enumC720680SOsLIZJ;
                                if (!abstractC21693019v6.LIZLLL) {
                                    C21693119v7 c21693119v72 = abstractC21693019v6.LJIIIZ;
                                    InterfaceC21693319v9 interfaceC21693319v9 = abstractC21693019v6.LIZ;
                                    c21693119v72.getClass();
                                    if ((enumC720680SOs != EnumC720680SOs.NONE && (enumC720680SOs != EnumC720680SOs.BLUR_PLACEHOLDER || !c21693119v72.LJI)) || c21693119v72.LIZIZ.getVisibility() == 0) {
                                        return;
                                    }
                                    if (c21693119v72.LJI) {
                                        C426320Gne c426320Gne = c21693119v72.LIZLLL;
                                        if (c21693119v72.LJII == 10.0f) {
                                            C438910HIz.LIZ(c426320Gne, 0L, 2);
                                            c426320Gne.LLILZLL = true;
                                            c426320Gne.LLIZ = false;
                                            ViewParent parent = c426320Gne.getParent();
                                            if (parent instanceof ViewGroup) {
                                                ((ViewGroup) parent).setClipChildren(false);
                                            }
                                            c426320Gne.postInvalidate();
                                        }
                                        View view = c21693119v72.LIZ;
                                        if (!view.isShown() || !view.getGlobalVisibleRect(new Rect())) {
                                            return;
                                        }
                                        c21693119v72.LIZIZ(c21693119v72.LIZLLL);
                                        return;
                                    }
                                    if (interfaceC21693319v9.H5() && !interfaceC21693319v9.ew()) {
                                        return;
                                    }
                                    ImageView imageView = c21693119v72.LIZJ;
                                    C419910GdJ c419910GdJ = new C419910GdJ();
                                    c419910GdJ.LIZ = R.raw.icon_tiktok_logo;
                                    c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.ei, c21693119v72.LJ);
                                    imageView.setImageDrawable(c419910GdJ.LIZ(c21693119v72.LJ));
                                    C339190DRl.LIZLLL(c21693119v72.LIZJ);
                                }
                            }
                        }
                    }, c21693219v8LIZIZ.LJ);
                    C21693119v7 c21693119v72 = c21693219v8LIZIZ.LJIIIZ;
                    C720350SNl.LIZJ(i, videoItemParams.getAweme());
                    c21693119v72.getClass();
                    C21693119v7 c21693119v73 = c21693219v8LIZIZ.LJIIIZ;
                    C720350SNl.LIZJ(i, videoItemParams.getAweme());
                    c21693119v73.getClass();
                    c21693219v8LIZIZ.LIZJ(c1331670kl3LJIIJ);
                } else {
                    AbstractC19486711Lt.LJIIJJI(new InterfaceC781210Ukh() { // from class: X.0SMl
                        @Override // X.InterfaceC781210Ukh
                        public final void run() {
                            String str3;
                            Aweme aweme2;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("displayImageNoWatermark is null \ngroup_id: ");
                            VideoItemParams videoItemParams2 = videoItemParams;
                            sbLIZ2.append((videoItemParams2 == null || (aweme2 = videoItemParams2.getAweme()) == null) ? null : aweme2.getAid());
                            sbLIZ2.append(" \n image_index: ");
                            sbLIZ2.append(i);
                            sbLIZ2.append(" \n, enterFrom: ");
                            VideoItemParams videoItemParams3 = c21693219v8LIZIZ.LJFF;
                            if (videoItemParams3 == null || (str3 = videoItemParams3.mEventType) == null) {
                                str3 = "";
                            }
                            sbLIZ2.append(str3);
                            C2344809Gs.LIZLLL(6, "PhotoLoader", C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    }).LJIJJLI(C11S5.LIZ()).LJIIZILJ();
                    return null;
                }
            }
        }
        return null;
    }

    public AbstractC21692819v4(View view, InterfaceC21692419v0 interfaceC21692419v0, InterfaceC21693319v9 interfaceC21693319v9, C0HYF c0hyf) {
        super(view);
        this.LIZJ = view;
        this.LIZLLL = interfaceC21692419v0;
        this.LJ = interfaceC21693319v9;
        this.LJFF = c0hyf;
        this.LJI = view.getContext();
        this.LJII = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3783));
        this.LJIIJ = -1;
        this.LJIIJJI = -1;
    }
}
