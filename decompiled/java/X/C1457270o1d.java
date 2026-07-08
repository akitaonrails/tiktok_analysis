package X;

import Y.ARunnableS17S1300000_22;
import Y.ARunnableS30S0400000_22;
import Y.ARunnableS81S0200000_12;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.service.IStoryAlbumEnterEditTimingService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.social.creation.api.edit.spi.IAlbumSharpImagePreloadService;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS105S1200000_22;
import nv7.c0;

/* JADX INFO: renamed from: X.0o1d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1457270o1d {
    public static volatile boolean LIZIZ;
    public static final C1457270o1d LIZ = new C1457270o1d();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(133));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(132));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(134));

    public static void LIZ(ImageView imageView) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("view already positioned: ");
            sbLIZ.append(layoutParams.width);
            sbLIZ.append('x');
            sbLIZ.append(layoutParams.height);
            LJ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        FrameLayout.LayoutParams layoutParamsLJ = c0.LIZ.LJ(9, 16);
        if (layoutParamsLJ.width > 0 && layoutParamsLJ.height > 0) {
            C786410Ut5.c6(imageView, layoutParamsLJ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("applyCanvasLayout: ");
            sbLIZ2.append(layoutParamsLJ.width);
            sbLIZ2.append('x');
            sbLIZ2.append(layoutParamsLJ.height);
            sbLIZ2.append(", top=");
            sbLIZ2.append(layoutParamsLJ.topMargin);
            sbLIZ2.append(", left=");
            sbLIZ2.append(layoutParamsLJ.leftMargin);
            LJ(C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("applyCanvasLayout skip: canvasParams=");
        sbLIZ3.append(layoutParamsLJ.width);
        sbLIZ3.append('x');
        sbLIZ3.append(layoutParamsLJ.height);
        LJ(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static void LIZIZ(ImageView imageView) {
        final float f = imageView.getResources().getDisplayMetrics().density * 12.0f;
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(new ViewOutlineProvider() { // from class: X.0o1e
            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), f);
            }
        });
    }

    public static void LIZJ(InterfaceC1446740nke interfaceC1446740nke) {
        FrameLayout frameLayoutUZ;
        MutableLiveData<Boolean> mutableLiveDataPs;
        if (!C263640AUw.LIZIZ && (C298390Bmn.LIZ() & 1) == 0 && !C0B0L.LIZ()) {
            return;
        }
        LIZIZ = false;
        if (interfaceC1446740nke != null && (mutableLiveDataPs = interfaceC1446740nke.Ps()) != null) {
            mutableLiveDataPs.setValue(Boolean.FALSE);
        }
        if (interfaceC1446740nke != null) {
            MutableLiveData<Bitmap> mutableLiveDataLk = interfaceC1446740nke.lk();
            if (mutableLiveDataLk != null) {
                mutableLiveDataLk.setValue(null);
            }
            frameLayoutUZ = interfaceC1446740nke.UZ();
        } else {
            frameLayoutUZ = null;
        }
        ImageView imageViewLIZLLL = LIZLLL(frameLayoutUZ);
        if (imageViewLIZLLL == null) {
            return;
        }
        imageViewLIZLLL.setBackground(null);
        imageViewLIZLLL.setScaleType(ImageView.ScaleType.FIT_XY);
        imageViewLIZLLL.setClipToOutline(false);
        imageViewLIZLLL.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        LIZJ.set(false);
        IAlbumSharpImagePreloadService iAlbumSharpImagePreloadService = (IAlbumSharpImagePreloadService) LIZLLL.getValue();
        if (iAlbumSharpImagePreloadService != null) {
            iAlbumSharpImagePreloadService.clear();
        }
    }

    public static ImageView LIZLLL(FrameLayout frameLayout) {
        String simpleName;
        ImageView imageView;
        if (frameLayout == null) {
            return null;
        }
        View childAt = frameLayout.getChildAt(frameLayout.getChildCount() - 1);
        if ((childAt instanceof ImageView) && (imageView = (ImageView) childAt) != null) {
            return imageView;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("skip: firstFrameView not found, lastChild=");
        if (childAt != null) {
            simpleName = childAt.getClass().getSimpleName();
        } else {
            simpleName = null;
        }
        sbLIZ.append(simpleName);
        LJ(C2188811AlT.LIZIZ(sbLIZ));
        return null;
    }

    public static void LJ(String str) {
        C201955140j.LIZLLL(C1662160tM6.LIZIZ, "EditorThumbnailPlaceholder", str);
    }

    public static GradientDrawable LJII(String str, String str2) {
        C0L23 c0l23LIZIZ = C0L22.LIZIZ(str);
        if (c0l23LIZIZ == null && (c0l23LIZIZ = C0L22.LIZIZ(str2)) == null) {
            LJ("gradient not in cache");
            return null;
        }
        Pair<Integer, Integer> pair = c0l23LIZIZ.LIZJ;
        int iIntValue = pair.getFirst().intValue();
        int iIntValue2 = pair.getSecond().intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gradient from cache, start=#");
        sbLIZ.append(Integer.toHexString(iIntValue));
        sbLIZ.append(", end=#");
        sbLIZ.append(Integer.toHexString(iIntValue2));
        LJ(C2188811AlT.LIZIZ(sbLIZ));
        return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{iIntValue, iIntValue2});
    }

    public static ImageView.ScaleType LJIIIIZZ(int i, int i2) {
        boolean zLIZIZ;
        boolean z = C0BNT.LIZIZ;
        if (z) {
            zLIZIZ = C567860MOy.LIZIZ(i, i2);
        } else if (i > 0 && i2 > 0 && i2 / i < 1.3333334f) {
            zLIZIZ = true;
        } else {
            zLIZIZ = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resolveScaleType: ");
        sbLIZ.append(i);
        sbLIZ.append('x');
        sbLIZ.append(i2);
        sbLIZ.append(", cropOpt=");
        sbLIZ.append(z);
        sbLIZ.append(", fit=");
        sbLIZ.append(zLIZIZ);
        LJ(C2188811AlT.LIZIZ(sbLIZ));
        if (zLIZIZ) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    public static void LJFF(final ImageView imageView, InterfaceC1446740nke interfaceC1446740nke, final String str) {
        if (interfaceC1446740nke.lk().getValue() == null && imageView.getDrawable() == null && imageView.getBackground() == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("skip timing: no bitmap or background, source=");
            sbLIZ.append(str);
            LJ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (LIZJ.compareAndSet(false, true)) {
            IStoryAlbumEnterEditTimingService iStoryAlbumEnterEditTimingService = (IStoryAlbumEnterEditTimingService) LJFF.getValue();
            if (iStoryAlbumEnterEditTimingService != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("06_first_frame_view_visible_");
                sbLIZ2.append(str);
                C2188811AlT.LIZIZ(sbLIZ2);
                iStoryAlbumEnterEditTimingService.LIZ();
            }
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                ViewTreeObserver.OnDrawListener onDrawListener = new ViewTreeObserver.OnDrawListener() { // from class: X.0T63
                    public final AtomicBoolean LL = new AtomicBoolean(false);

                    @Override // android.view.ViewTreeObserver.OnDrawListener
                    public final void onDraw() {
                        if (this.LL.compareAndSet(false, true)) {
                            C1457270o1d.LIZ.getClass();
                            IStoryAlbumEnterEditTimingService iStoryAlbumEnterEditTimingService2 = (IStoryAlbumEnterEditTimingService) C1457270o1d.LJFF.getValue();
                            if (iStoryAlbumEnterEditTimingService2 != null) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("06d_first_frame_view_drawn_");
                                sbLIZ3.append(str);
                                C2188811AlT.LIZIZ(sbLIZ3);
                                iStoryAlbumEnterEditTimingService2.LIZ();
                            }
                            ImageView imageView2 = imageView;
                            HandlerHook.viewPost(imageView2, new ARunnableS81S0200000_12(this, imageView2, 61));
                        }
                    }
                };
                viewTreeObserver.addOnDrawListener(onDrawListener);
                C2187701Ajg.LIZ(viewTreeObserver, onDrawListener, ViewTreeObserver.OnDrawListener.class);
            }
        }
    }

    public static void LJI(String str, InterfaceC1446740nke interfaceC1446740nke, ImageView imageView) {
        IAlbumSharpImagePreloadService iAlbumSharpImagePreloadService;
        if (str != null && str.length() != 0 && (iAlbumSharpImagePreloadService = (IAlbumSharpImagePreloadService) LIZLLL.getValue()) != null) {
            iAlbumSharpImagePreloadService.LIZLLL(str, new AwS105S1200000_22(imageView, interfaceC1446740nke, str, 1));
        }
    }

    public static void LJIIIZ(InterfaceC1446740nke interfaceC1446740nke, VideoPublishEditModel videoPublishEditModel, Context context) {
        boolean z;
        FrameLayout frameLayoutUZ;
        String realImportPath;
        IAlbumSharpImagePreloadService iAlbumSharpImagePreloadService;
        Bitmap bitmapLIZIZ;
        ImportVideoInfo importVideoInfo;
        FrameLayout frameLayoutUZ2;
        String originImportPath;
        String str;
        ImportVideoInfo importVideoInfo2;
        FrameLayout frameLayoutUZ3;
        String originImportPath2 = null;
        if (C0B0L.LIZ() && videoPublishEditModel.creativeModel.streaksData.isStreaksPost()) {
            int i = videoPublishEditModel.creativeModel.streaksData.posterBgColor;
            if (i == 0) {
                LJ("[streaks] skip: no bgColor");
            } else if (interfaceC1446740nke != null && (frameLayoutUZ3 = interfaceC1446740nke.UZ()) != null) {
                ImageView imageViewLIZLLL = LIZLLL(frameLayoutUZ3);
                if (imageViewLIZLLL != null) {
                    LIZIZ = true;
                    LIZJ.set(false);
                    LIZ(imageViewLIZLLL);
                    LIZIZ(imageViewLIZLLL);
                    imageViewLIZLLL.setBackground(new ColorDrawable(i));
                    interfaceC1446740nke.Ps().setValue(Boolean.TRUE);
                    LJFF(imageViewLIZLLL, interfaceC1446740nke, "streaks_color");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[streaks] placeholder visible, bgColor=#");
                    sbLIZ.append(Integer.toHexString(i));
                    LJ(C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
            } else {
                LJ("[streaks] skip: previewLayout is null");
            }
        }
        if ((C298390Bmn.LIZ() & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (!C263640AUw.LIZIZ) {
                LJ("[legacy] skip: AB disabled");
                return;
            }
            if (!u4.LJIIZILJ(videoPublishEditModel)) {
                LJ("[legacy] skip: not Story entrance");
                return;
            }
            if (!videoPublishEditModel.creativeModel.storyModel.isShootFromSocialAlbum()) {
                LJ("[legacy] skip: not from social album");
                return;
            }
            if (!C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData())) {
                LJ("[legacy] skip: not photo canvas mode");
                return;
            }
            LIZIZ = true;
            if (interfaceC1446740nke != null && (frameLayoutUZ2 = interfaceC1446740nke.UZ()) != null) {
                ArrayList<ImportVideoInfo> importInfoList = videoPublishEditModel.getImportInfoList();
                if (importInfoList != null && (importVideoInfo2 = (ImportVideoInfo) C13LP.LJJJLL(importInfoList)) != null) {
                    originImportPath = importVideoInfo2.getOriginImportPath();
                    originImportPath2 = importVideoInfo2.getRealImportPath();
                } else {
                    originImportPath = null;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[legacy] originPath=");
                sbLIZ2.append(originImportPath);
                sbLIZ2.append(", realPath=");
                sbLIZ2.append(originImportPath2);
                LJ(C2188811AlT.LIZIZ(sbLIZ2));
                if (originImportPath2 == null) {
                    str = originImportPath;
                    if (originImportPath == null) {
                        LJ("[legacy] skip: media paths are null");
                        return;
                    }
                } else {
                    str = originImportPath2;
                }
                ImageView imageViewLIZLLL2 = LIZLLL(frameLayoutUZ2);
                if (imageViewLIZLLL2 == null) {
                    return;
                }
                HandlerHook.viewPost(frameLayoutUZ2, new ARunnableS30S0400000_22(imageViewLIZLLL2, LJII(originImportPath, originImportPath2), interfaceC1446740nke, frameLayoutUZ2, 1));
                C823050WQl.LIZLLL().execute(new ARunnableS17S1300000_22(context, str, imageViewLIZLLL2, interfaceC1446740nke, 1));
                return;
            }
            LJ("[legacy] skip: previewLayout is null");
            return;
        }
        if ((C298390Bmn.LIZ() & 1) != 0) {
            if (!u4.LJIIZILJ(videoPublishEditModel)) {
                LJ("skip: not Story entrance");
                return;
            }
            if (!videoPublishEditModel.creativeModel.storyModel.isShootFromSocialAlbum()) {
                LJ("skip: not from social album");
                return;
            }
            if (!C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData())) {
                LJ("skip: not photo canvas mode");
                return;
            }
            LIZIZ = true;
            LIZJ.set(false);
            if (interfaceC1446740nke != null && (frameLayoutUZ = interfaceC1446740nke.UZ()) != null) {
                ArrayList<ImportVideoInfo> importInfoList2 = videoPublishEditModel.getImportInfoList();
                if (importInfoList2 != null && (importVideoInfo = (ImportVideoInfo) C13LP.LJJJLL(importInfoList2)) != null) {
                    originImportPath2 = importVideoInfo.getOriginImportPath();
                    realImportPath = importVideoInfo.getRealImportPath();
                } else {
                    realImportPath = null;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("originPath=");
                sbLIZ3.append(originImportPath2);
                sbLIZ3.append(", realPath=");
                sbLIZ3.append(realImportPath);
                LJ(C2188811AlT.LIZIZ(sbLIZ3));
                if (realImportPath == null && originImportPath2 == null) {
                    LJ("skip: media paths are null");
                    return;
                }
                ImageView imageViewLIZLLL3 = LIZLLL(frameLayoutUZ);
                if (imageViewLIZLLL3 == null) {
                    return;
                }
                LIZ(imageViewLIZLLL3);
                LIZIZ(imageViewLIZLLL3);
                imageViewLIZLLL3.setBackground(LJII(originImportPath2, realImportPath));
                interfaceC1446740nke.Ps().setValue(Boolean.TRUE);
                LJFF(imageViewLIZLLL3, interfaceC1446740nke, "gradient");
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("placeholder visible, parentSize=");
                sbLIZ4.append(frameLayoutUZ.getWidth());
                sbLIZ4.append('x');
                sbLIZ4.append(frameLayoutUZ.getHeight());
                LJ(C2188811AlT.LIZIZ(sbLIZ4));
                C01GW c01gw = LIZLLL;
                IAlbumSharpImagePreloadService iAlbumSharpImagePreloadService2 = (IAlbumSharpImagePreloadService) c01gw.getValue();
                if ((iAlbumSharpImagePreloadService2 != null && (bitmapLIZIZ = iAlbumSharpImagePreloadService2.LIZIZ(originImportPath2)) != null) || ((iAlbumSharpImagePreloadService = (IAlbumSharpImagePreloadService) c01gw.getValue()) != null && (bitmapLIZIZ = iAlbumSharpImagePreloadService.LIZIZ(realImportPath)) != null)) {
                    LJIIJ(interfaceC1446740nke, imageViewLIZLLL3, bitmapLIZIZ, true);
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("parentSize=");
                    sbLIZ5.append(frameLayoutUZ.getWidth());
                    sbLIZ5.append('x');
                    sbLIZ5.append(frameLayoutUZ.getHeight());
                    LJ(C2188811AlT.LIZIZ(sbLIZ5));
                    return;
                }
                LJI(originImportPath2, interfaceC1446740nke, imageViewLIZLLL3);
                LJI(realImportPath, interfaceC1446740nke, imageViewLIZLLL3);
                return;
            }
            LJ("skip: previewLayout is null");
            return;
        }
        LJ("skip: AB disabled");
    }

    public static void LJIIJ(InterfaceC1446740nke interfaceC1446740nke, ImageView imageView, Bitmap bitmap, boolean z) {
        ImageView.ScaleType scaleTypeLJIIIIZZ = LJIIIIZZ(bitmap.getWidth(), bitmap.getHeight());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sharp bitmap apply: ");
        sbLIZ.append(bitmap.getWidth());
        sbLIZ.append('x');
        sbLIZ.append(bitmap.getHeight());
        sbLIZ.append(", scaleType=");
        sbLIZ.append(scaleTypeLJIIIIZZ);
        sbLIZ.append(", fromCache=");
        sbLIZ.append(z);
        LJ(C2188811AlT.LIZIZ(sbLIZ));
        imageView.setScaleType(scaleTypeLJIIIIZZ);
        interfaceC1446740nke.lk().setValue(bitmap);
        boolean z2 = true;
        if (interfaceC1446740nke.lk().getValue() == null && imageView.getDrawable() == null && imageView.getBackground() == null) {
            z2 = false;
        }
        if (!z2) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("skip reveal: no bitmap or background, source=");
            sbLIZ2.append("sharp");
            LJ(C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            interfaceC1446740nke.Ps().setValue(Boolean.TRUE);
            LJFF(imageView, interfaceC1446740nke, "sharp");
        }
        IStoryAlbumEnterEditTimingService iStoryAlbumEnterEditTimingService = (IStoryAlbumEnterEditTimingService) LJFF.getValue();
        if (iStoryAlbumEnterEditTimingService != null) {
            iStoryAlbumEnterEditTimingService.LIZ();
        }
    }
}
