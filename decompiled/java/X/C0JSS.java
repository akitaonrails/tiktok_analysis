package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0JSS, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JSS {
    public static String LIZ(ImageModel imageModel) {
        if (imageModel != null && !C0IKQ.LIZ(imageModel.getUrls())) {
            return (String) ListProtector.get(imageModel.getUrls(), 0);
        }
        return "";
    }

    public static boolean LIZIZ(Context context) {
        if (context == null) {
            return false;
        }
        if (!(context instanceof Activity)) {
            if ((context instanceof Application) || !(context instanceof ContextWrapper)) {
                return true;
            }
            return LIZIZ(((ContextWrapper) context).getBaseContext());
        }
        if (((Activity) context).isDestroyed()) {
            return false;
        }
        return !r3.isFinishing();
    }

    public static void LIZLLL(ImageView imageView, ImageModel imageModel) {
        if (imageModel != null && !C086I.LIZIZ(imageModel.getUrls())) {
            LJ(imageView, imageModel, 0);
        }
    }

    public static void LJII(ImageView imageView, ImageModel imageModel) {
        if (LiveImageLoaderModuleSetting.useImageModule()) {
            if (!C1819620xS4.LIZLLL(imageModel)) {
                return;
            }
            C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(imageModel.getUrls());
            c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
            c1324610kZfLIZJ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLIZJ.LJJI(imageView);
            return;
        }
        if (imageView != null && LIZIZ(imageView.getContext())) {
            C1322000kVS c1322000kVSLJFF = C1322000kVS.LJFF(imageView.getContext());
            c1322000kVSLJFF.LJFF = imageModel;
            c1322000kVSLJFF.LJ();
            c1322000kVSLJFF.LIZ(ImageView.ScaleType.CENTER_CROP);
            c1322000kVSLJFF.LIZJ(imageView);
        }
    }

    public static void LJ(ImageView imageView, ImageModel imageModel, int i) {
        LIZJ(-1, -1, i, imageView, imageModel, null, false);
    }

    public static void LJFF(ImageView imageView, ImageModel imageModel, int i, C0IYA c0iya) {
        LIZJ(-1, -1, i, imageView, imageModel, c0iya, false);
    }

    public static void LJI(ImageView imageView, ImageModel imageModel, int i, int i2) {
        if (LiveImageLoaderModuleSetting.useImageModule()) {
            if (!C1819620xS4.LIZLLL(imageModel)) {
                return;
            }
            C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(imageModel.getUrls());
            c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
            c1324610kZfLIZJ.LJIIIZ = i;
            c1324610kZfLIZJ.LJIJI(Float.valueOf(((int) C497740JfY.LIZIZ(i2)) + 0.0f));
            c1324610kZfLIZJ.LJJI(imageView);
            return;
        }
        if (imageView != null && imageModel != null && LIZIZ(imageView.getContext())) {
            C1322000kVS c1322000kVSLJFF = C1322000kVS.LJFF(imageView.getContext());
            c1322000kVSLJFF.LIZLLL(LIZ(imageModel));
            int iLIZIZ = (int) C497740JfY.LIZIZ(i2);
            if (c1322000kVSLJFF.LJIIIZ == null) {
                c1322000kVSLJFF.LJIIIZ = new C1331100kk8();
            }
            c1322000kVSLJFF.LJIIIZ.LJII(iLIZIZ);
            c1322000kVSLJFF.LJFF = imageModel;
            c1322000kVSLJFF.LIZ(ImageView.ScaleType.CENTER_CROP);
            c1322000kVSLJFF.LIZ.getResources().getDrawable(i);
            c1322000kVSLJFF.LIZJ(imageView);
        }
    }

    public static void LJIIIIZZ(ImageView imageView, ImageModel imageModel, int i, int i2, int i3, InterfaceC1142670fqD interfaceC1142670fqD) {
        if (LiveImageLoaderModuleSetting.useImageModule()) {
            ArrayList arrayList = new ArrayList();
            if (imageModel != null && imageModel.getUrls() != null) {
                arrayList.addAll(imageModel.getUrls());
            }
            C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(arrayList);
            c1324610kZfLIZJ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
            c1324610kZfLIZJ.LJ = i;
            c1324610kZfLIZJ.LJFF = i2;
            c1324610kZfLIZJ.LJIIIZ = i3;
            c1324610kZfLIZJ.LJIIL = interfaceC1142670fqD;
            c1324610kZfLIZJ.LJJI(imageView);
            return;
        }
        C0JSR.LIZ(i, i2, i3, imageView, imageModel, interfaceC1142670fqD);
    }

    public static void LIZJ(int i, int i2, int i3, ImageView imageView, ImageModel imageModel, InterfaceC1142670fqD interfaceC1142670fqD, boolean z) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        String str = null;
        if (imageModel == null) {
            if (interfaceC1142670fqD != null) {
                interfaceC1142670fqD.LIZLLL(null, new IllegalArgumentException("imageModel == null"));
                return;
            }
            return;
        }
        if (LiveImageLoaderModuleSetting.useImageModule()) {
            if (!C1819620xS4.LIZLLL(imageModel)) {
                return;
            }
            C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(imageModel.getUrls());
            c1324610kZfLIZJ.LJIIIZ = i3;
            c1324610kZfLIZJ.LJIJJ = scaleType;
            c1324610kZfLIZJ.LJIL = z;
            c1324610kZfLIZJ.LJ = i;
            c1324610kZfLIZJ.LJFF = i2;
            c1324610kZfLIZJ.LJIIL = interfaceC1142670fqD;
            c1324610kZfLIZJ.LJJI(imageView);
            return;
        }
        if (imageModel.getUrls().size() != 0) {
            str = (String) ListProtector.get(imageModel.getUrls(), 0);
        }
        if (C086I.LIZIZ(imageModel.getUrls())) {
            if (interfaceC1142670fqD == null) {
                return;
            }
            interfaceC1142670fqD.LIZLLL(str, new IllegalArgumentException("CollectionUtils.isEmpty(imageModel.urls)"));
            return;
        }
        if (imageView != null && LIZIZ(imageView.getContext())) {
            C1322000kVS c1322000kVSLJFF = C1322000kVS.LJFF(imageView.getContext());
            c1322000kVSLJFF.LIZLLL(LIZ(imageModel));
            c1322000kVSLJFF.LJFF = imageModel;
            c1322000kVSLJFF.LIZ(scaleType);
            if (i > 0 && i2 > 0) {
                c1322000kVSLJFF.LJI = new C1324630kZh(i, i2);
            }
            if (i3 > 0) {
                c1322000kVSLJFF.LIZ.getResources().getDrawable(i3);
            }
            if (z) {
                c1322000kVSLJFF.LJIIJ = true;
            }
            c1322000kVSLJFF.LIZLLL = new C1142660fqC(imageModel, interfaceC1142670fqD);
            c1322000kVSLJFF.LIZJ(imageView);
            return;
        }
        if (interfaceC1142670fqD == null) {
            return;
        }
        interfaceC1142670fqD.LIZLLL(str, new IllegalArgumentException("!isActivityOK(view.getContext())"));
    }
}
