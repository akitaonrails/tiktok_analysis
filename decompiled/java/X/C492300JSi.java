package X;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestGaussEncodeOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestGaussSizeSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0JSi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C492300JSi {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(ImageModel imageModel, C1324720kZq c1324720kZq, InterfaceC1142670fqD interfaceC1142670fqD) {
        if (!C1819620xS4.LIZLLL(imageModel)) {
            return;
        }
        int value = MultiGuestGaussSizeSetting.INSTANCE.getValue();
        if (c1324720kZq != null) {
            c1324720kZq.setBackground(null);
            c1324720kZq.setForeground(null);
            c1324720kZq.setTag(null);
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
            c1324610kZfLJIIIZ.LJJ = Boolean.valueOf(MultiGuestGaussEncodeOptSetting.INSTANCE.enable());
            if (value > 0) {
                c1324610kZfLJIIIZ.LJI = value;
                c1324610kZfLJIIIZ.LJII = value;
            }
            if (interfaceC1142670fqD != null) {
                c1324610kZfLJIIIZ.LJIIL = interfaceC1142670fqD;
            }
            int width = c1324720kZq.getWidth();
            int height = c1324720kZq.getHeight();
            c1324610kZfLJIIIZ.LJ = width;
            c1324610kZfLJIIIZ.LJFF = height;
            c1324610kZfLJIIIZ.LJJI(c1324720kZq);
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [REQUEST, X.0kbR] */
    /* JADX WARN: Type inference failed for: r0v2, types: [REQUEST, X.0kbR] */
    public static final void LIZ(int i, int i2, ImageModel imageModel, C1324720kZq c1324720kZq) {
        float f;
        String str;
        if (i != 0 && i2 != 0) {
            f = i2 / i;
        } else {
            f = 0.74698794f;
        }
        C1291830jin c1291830jin = new C1291830jin(f);
        if (imageModel != null && imageModel.getUrls() != null && imageModel.getUrls().size() != 0) {
            C1291820jim c1291820jim = new C1291820jim(5);
            List urls = imageModel.getUrls();
            if (urls != null) {
                str = (String) C13LP.LJJJLL(urls);
            } else {
                str = null;
            }
            C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
            c1325700kbQLIZLLL.LJIILIIL = c1291820jim;
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.ARGB_8888);
            imageDecodeOptionsBuilder.getClass();
            c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
            ?? LIZ2 = c1325700kbQLIZLLL.LIZ();
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            c1320810kTXLIZJ.LIZLLL = LIZ2;
            c1320810kTXLIZJ.LJIILJJIL = c1324720kZq.getController();
            c1324720kZq.setController(c1320810kTXLIZJ.LIZ());
            return;
        }
        C1325700kbQ c1325700kbQLIZJ = C1325700kbQ.LIZJ(R.drawable.el_);
        c1325700kbQLIZJ.LJIILIIL = c1291830jin;
        ?? LIZ3 = c1325700kbQLIZJ.LIZ();
        C1320810kTX c1320810kTXLIZJ2 = C1322200kVm.LIZJ();
        c1320810kTXLIZJ2.LIZLLL = LIZ3;
        c1320810kTXLIZJ2.LJIILJJIL = c1324720kZq.getController();
        c1324720kZq.setController(c1320810kTXLIZJ2.LIZ());
    }
}
