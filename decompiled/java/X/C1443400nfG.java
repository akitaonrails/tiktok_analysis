package X;

import Y.ACallableS21S1000000_3;
import Y.ARunnableS2S2200000_3;
import Y.ATListenerS447S0100000_14;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.creative.model.publish.PublishCustomCoverModel;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.UploadCustomizeCoverInfo;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import lth.o;

/* JADX INFO: renamed from: X.0nfG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1443400nfG {
    public static final C1443400nfG LIZ = new C1443400nfG();

    public static final void LIZ(View view) {
        if (view == null) {
            return;
        }
        LIZ.getClass();
        LJIJ(view, null, false);
    }

    public static final Bitmap LIZIZ(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            return BitmapFactory.decodeFile(str);
        }
        return null;
    }

    public static final C123X LIZLLL(ViewGroup viewGroup) {
        C123X c123xLIZLLL;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof C123X) {
                return (C123X) childAt;
            }
            if ((childAt instanceof ViewGroup) && (c123xLIZLLL = LIZLLL((ViewGroup) childAt)) != null) {
                return c123xLIZLLL;
            }
        }
        return null;
    }

    public static final Bitmap LJ(String str) {
        return C2477909nN.LIZ(str, C1450870nrJ.LIZIZ() * 2, C1450870nrJ.LIZIZ() * 2, Bitmap.Config.RGB_565);
    }

    public static final String LJI(VideoPublishEditModel videoPublishEditModel) {
        if (!C1447250nlT.LIZ() && !C1447250nlT.LIZLLL()) {
            return null;
        }
        return C1429320nIY.LIZIZ(videoPublishEditModel);
    }

    public static final UploadCustomizeCoverInfo LJII(VideoPublishEditModel videoPublishEditModel) {
        CreativeModel creativeModel;
        CoverPublishModel coverPublishModel;
        if ((!LJIILIIL(videoPublishEditModel) && !C1429320nIY.LIZJ(videoPublishEditModel)) || videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (coverPublishModel = creativeModel.coverPublishModel) == null) {
            return null;
        }
        return coverPublishModel.getCoverInfo();
    }

    public static final PublishCustomCoverModel LJIIIIZZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return null;
        }
        return videoPublishEditModel.creativeModel.publishCustomCoverModel;
    }

    public static final void LJIIJ(View view) {
        Activity activityLIZ = C0FNT.LIZ(view.getContext());
        if (activityLIZ == null) {
            return;
        }
        ATListenerS447S0100000_14 aTListenerS447S0100000_14 = new ATListenerS447S0100000_14(activityLIZ, 0);
        LIZ.getClass();
        LJIJ(view, aTListenerS447S0100000_14, true);
    }

    public static final boolean LJIIJJI(VideoPublishEditModel videoPublishEditModel) {
        CreativeModel creativeModel;
        EditPostModel editPostModel;
        UrlModel videoDynamicCover;
        String uri;
        CreativeModel creativeModel2;
        EditPostModel editPostModel2;
        UrlModel videoCoverAddr;
        String uri2 = null;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (editPostModel = creativeModel.editPostModel) != null && (videoDynamicCover = editPostModel.getVideoDynamicCover()) != null && (uri = videoDynamicCover.getUri()) != null) {
            if (videoPublishEditModel != null && (creativeModel2 = videoPublishEditModel.creativeModel) != null && (editPostModel2 = creativeModel2.editPostModel) != null && (videoCoverAddr = editPostModel2.getVideoCoverAddr()) != null) {
                uri2 = videoCoverAddr.getUri();
            }
            if (Intrinsics.LJFF(uri, uri2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIIL(List<C0WIY<Class<?>, IAVPublishExtension<?>>> list) {
        Iterator<C0WIY<Class<?>, IAVPublishExtension<?>>> it2 = list.iterator();
        while (it2.hasNext()) {
            IAVPublishExtension<?> iAVPublishExtension = it2.next().LIZIZ;
            if (iAVPublishExtension != null && !iAVPublishExtension.isDisplayAnchor()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJIILIIL(VideoPublishEditModel videoPublishEditModel) {
        String coverFromLocalPath;
        CreativeModel creativeModel;
        CoverPublishModel coverPublishModel;
        CreativeModel creativeModel2;
        CoverPublishModel coverPublishModel2;
        if (videoPublishEditModel != null && (creativeModel2 = videoPublishEditModel.creativeModel) != null && (coverPublishModel2 = creativeModel2.coverPublishModel) != null) {
            coverFromLocalPath = coverPublishModel2.getCoverFromLocalPath();
        } else {
            coverFromLocalPath = null;
        }
        if (!C123100dR.LIZ(coverFromLocalPath) && (videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (coverPublishModel = creativeModel.coverPublishModel) == null || !coverPublishModel.isCoverFromUrl())) {
            return false;
        }
        if (!C1447250nlT.LIZ() && !C1447250nlT.LIZLLL()) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILJJIL(VideoPublishEditModel videoPublishEditModel) {
        CreativeModel creativeModel;
        CoverPublishModel coverPublishModel;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (coverPublishModel = creativeModel.coverPublishModel) != null && coverPublishModel.isCoverFromUrl()) {
            if (C1447250nlT.LIZ() || C1447250nlT.LIZLLL()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIILL(VideoPublishEditModel videoPublishEditModel) {
        String coverUri;
        CreativeModel creativeModel;
        CoverPublishModel coverPublishModel;
        UploadCustomizeCoverInfo coverInfo;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (coverPublishModel = creativeModel.coverPublishModel) != null && (coverInfo = coverPublishModel.getCoverInfo()) != null) {
            coverUri = coverInfo.getCoverUri();
        } else {
            coverUri = null;
        }
        if (C123100dR.LIZ(coverUri)) {
            if (C1447250nlT.LIZ() || C1447250nlT.LIZLLL()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final C443120HZe<String, UrlModel, Integer> LJIILLIIL(List<C0WIY<Class<?>, IAVPublishExtension<?>>> list) {
        Integer anchorIconRawId;
        String anchorText;
        UrlModel anchorIconUrl;
        Iterator<C0WIY<Class<?>, IAVPublishExtension<?>>> it2 = list.iterator();
        while (true) {
            anchorIconRawId = null;
            if (it2.hasNext()) {
                C0WIY<Class<?>, IAVPublishExtension<?>> next = it2.next();
                IAVPublishExtension<?> iAVPublishExtension = next.LIZIZ;
                if (iAVPublishExtension != null) {
                    anchorText = iAVPublishExtension.getAnchorText();
                } else {
                    anchorText = null;
                }
                IAVPublishExtension<?> iAVPublishExtension2 = next.LIZIZ;
                if (iAVPublishExtension2 != null) {
                    anchorIconUrl = iAVPublishExtension2.getAnchorIconUrl();
                } else {
                    anchorIconUrl = null;
                }
                IAVPublishExtension<?> iAVPublishExtension3 = next.LIZIZ;
                if (iAVPublishExtension3 != null) {
                    anchorIconRawId = iAVPublishExtension3.getAnchorIconRawId();
                }
                if (anchorText != null && anchorText.length() != 0 && (anchorIconUrl != null || anchorIconRawId != null)) {
                    break;
                }
            } else {
                return new C443120HZe<>(null, null, null);
            }
        }
        return new C443120HZe<>(anchorText, anchorIconUrl, anchorIconRawId);
    }

    public static final void LJIIZILJ(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIJ.getClass();
        boolean z = true;
        if (videoPublishEditModel.isPrivate() != 1) {
            z = false;
        }
        SharePrefCache.inst().getIsAwemePrivate().LJ(Boolean.valueOf(z));
    }

    public static final void LIZJ(String str, Function1<? super Bitmap, Unit> function1) {
        boolean z;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            function1.invoke(null);
        } else {
            C15O7.LIZJ(new ACallableS21S1000000_3(str, 3)).LJ(new C2501509rB(function1, 9), C15O7.LJIIIIZZ, null);
        }
    }

    public static final Bitmap LJFF(Context context, String str) {
        try {
            InputStream inputStreamLJ = C09NT.LJ(context.getContentResolver(), UriProtector.parse(str));
            if (inputStreamLJ != null) {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamLJ);
                inputStreamLJ.close();
                int iLIZLLL = C2477909nN.LIZLLL(str);
                Matrix matrix = new Matrix();
                matrix.postRotate(iLIZLLL);
                return Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
            }
            return null;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final void LJIIIZ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        if (videoPublishEditModel != null) {
            PostPageModel postPageModel = videoPublishEditModel.creativeModel.postPageModel;
            if (TextUtils.isEmpty(postPageModel.customCoverPath) || z) {
                postPageModel.customCoverPath = C383300F1c.LIZLLL(videoPublishEditModel.getCreativeInfo());
            }
            String str = postPageModel.customCoverPath;
            if (str != null) {
                postPageModel.customCoverOriginalPath = u.LJJIFFI(str, "_cover_img_custom.png", "_cover_img_custom_original.png", false);
            }
        }
    }

    public static void LJIJJ(Bitmap bitmap, String str) {
        C0VSV c0vsv;
        if (str.length() != 0 && !bitmap.isRecycled()) {
            C0VSV c0vsv2 = null;
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                try {
                    c0vsv = new C0VSV(str);
                } catch (IOException e) {
                    e = e;
                }
                try {
                    File parentFile = new C0VSJ(str).getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, c0vsv);
                    c0vsv.flush();
                    C0CNO.LIZLLL(0L, new AwS566S0100000_22((Function0) null, (Function0<Boolean>) 354));
                    c0vsv.close();
                } catch (IOException e2) {
                    e = e2;
                    c0vsv2 = c0vsv;
                    TryCatchGuardChecker.doCheck(e);
                    if (c0vsv2 != null) {
                        c0vsv2.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c0vsv2 = c0vsv;
                    TryCatchGuardChecker.doCheck(th);
                    if (c0vsv2 != null) {
                        try {
                            c0vsv2.close();
                            throw th;
                        } catch (IOException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (IOException e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
    }

    public static void LJIJ(View view, ATListenerS447S0100000_14 aTListenerS447S0100000_14, boolean z) {
        if (view.getId() == R.id.b_6) {
            return;
        }
        if (z && Intrinsics.LJFF(view.getTag(R.id.vfz), Boolean.TRUE)) {
            return;
        }
        if (!(view instanceof EditText)) {
            view.setOnTouchListener(aTListenerS447S0100000_14);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                LJIJ(viewGroup.getChildAt(i), aTListenerS447S0100000_14, z);
            }
        }
    }

    public static final void LJIJI(Bitmap bitmap, String str, String str2, Function0<Unit> function0) {
        if (str != null && str.length() != 0 && !bitmap.isRecycled()) {
            C823050WQl.LIZLLL().execute(new ARunnableS2S2200000_3(bitmap, str, str2, function0, 0));
        }
    }
}
