package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS89S0200000_20;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0kZb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1324570kZb {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    public static String LJFF(String str) {
        C1325710kbR c1325710kbRLIZ;
        InterfaceC1317730kOZ interfaceC1317730kOZLJIIJ;
        File file;
        if (str != null && !str.isEmpty()) {
            Uri uri = UriProtector.parse(str);
            if (LJI(uri) && (c1325710kbRLIZ = C1325710kbR.LIZ(uri)) != null) {
                C1324810kZz c1324810kZzLJI = C1324810kZz.LJI();
                c1324810kZzLJI.getClass();
                C592490NLr c592490NLrLJ = c1324810kZzLJI.LJ(c1325710kbRLIZ.LIZIZ);
                if (c592490NLrLJ != null && (interfaceC1317730kOZLJIIJ = C1328130kfL.LJIILIIL().LJIILL().LJIIJ(c592490NLrLJ)) != null && (file = ((C1335740krc) interfaceC1317730kOZLJIIJ).LIZ) != null) {
                    return file.getAbsolutePath();
                }
            }
            return "";
        }
        return "";
    }

    public static boolean LJI(Uri uri) {
        C1325710kbR c1325710kbRLIZ;
        if (uri != null && (c1325710kbRLIZ = C1325710kbR.LIZ(uri)) != null) {
            C1324810kZz c1324810kZzLJI = C1324810kZz.LJI();
            c1324810kZzLJI.getClass();
            C592490NLr c592490NLrLJ = c1324810kZzLJI.LJ(c1325710kbRLIZ.LIZIZ);
            if (c592490NLrLJ != null) {
                return C1328130kfL.LJIILIIL().LJIILL().LJII(c592490NLrLJ);
            }
        }
        return false;
    }

    public static void LJIIIIZZ(ImageModel imageModel) {
        if (C497740JfY.LJII() != null && imageModel != null && !C0IKQ.LIZ(imageModel.getUrls())) {
            C1322200kVm.LIZ().LJIIZILJ(C1325710kbR.LIZIZ((String) ListProtector.get(imageModel.getUrls(), 0)), C497740JfY.LJII());
        }
    }

    public static void LIZ(C1324720kZq c1324720kZq, int i) {
        if (c1324720kZq == null) {
            return;
        }
        c1324720kZq.setImageURI(C1325700kbQ.LIZJ(i).LIZ().LIZIZ);
    }

    public static void LIZIZ(ImageModel imageModel, C1324720kZq c1324720kZq) {
        LIZJ(c1324720kZq, imageModel, null, null, null, false);
    }

    public static C1325710kbR[] LJ(ImageModel imageModel, C1324630kZh c1324630kZh, C1291830jin c1291830jin, boolean z) {
        if (imageModel != null && imageModel.getUrls() != null && imageModel.getUrls().size() != 0) {
            ArrayList arrayList = new ArrayList();
            C1335920kru c1335920kru = new C1335920kru();
            for (String str : imageModel.getUrls()) {
                if (!C2093608Ic.LJ(str)) {
                    C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
                    if (c1291830jin != null) {
                        c1325700kbQLIZLLL.LJIILIIL = c1291830jin;
                    }
                    if (c1324630kZh != null) {
                        c1325700kbQLIZLLL.LIZJ = c1324630kZh;
                    }
                    c1335920kru.LIZIZ++;
                    c1325700kbQLIZLLL.LJIIZILJ = c1335920kru;
                    if (z) {
                        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
                        c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
                    }
                    arrayList.add(c1325700kbQLIZLLL.LIZ());
                }
            }
            if (arrayList.size() == 0) {
                return new C1325710kbR[0];
            }
            return (C1325710kbR[]) arrayList.toArray(new C1325710kbR[arrayList.size()]);
        }
        return new C1325710kbR[0];
    }

    public static void LJII(ImageModel imageModel, int i, int i2, C1291830jin c1291830jin, final InterfaceC1324590kZd interfaceC1324590kZd) {
        C1324630kZh c1324630kZh;
        if (i > 0 && i2 > 0) {
            c1324630kZh = new C1324630kZh(i, i2);
        } else {
            c1324630kZh = null;
        }
        C1325710kbR[] c1325710kbRArrLJ = LJ(imageModel, c1324630kZh, c1291830jin, false);
        if (c1325710kbRArrLJ != null && c1325710kbRArrLJ.length != 0) {
            final InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSYLJI = C1328130kfL.LJIILIIL().LJIIL().LJI(c1325710kbRArrLJ[0], null);
            ((AbstractC1321260kUG) interfaceC1320200kSYLJI).LIZJ(new AbstractC447090Hg3() { // from class: X.0kZc
                @Override // X.C0HWE
                public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                    if (interfaceC1320200kSY != null) {
                        interfaceC1320200kSY.close();
                    }
                    InterfaceC1324590kZd interfaceC1324590kZd2 = interfaceC1324590kZd;
                    if (interfaceC1324590kZd2 != null) {
                        C786410Ut5.LJJZZIII(C1324570kZb.LIZ, new ARunnableS120S0100000_20(interfaceC1324590kZd2, 266));
                    }
                }

                @Override // X.AbstractC447090Hg3
                public final void LJI(Bitmap bitmap) {
                    if (interfaceC1320200kSYLJI.LIZ() && bitmap != null) {
                        C786410Ut5.LJJZZIII(C1324570kZb.LIZ, new ARunnableS89S0200000_20(Bitmap.createBitmap(bitmap), interfaceC1324590kZd, 167));
                    } else {
                        InterfaceC1324590kZd interfaceC1324590kZd2 = interfaceC1324590kZd;
                        if (interfaceC1324590kZd2 != null) {
                            C786410Ut5.LJJZZIII(C1324570kZb.LIZ, new ARunnableS120S0100000_20(interfaceC1324590kZd2, 269));
                        }
                    }
                    interfaceC1320200kSYLJI.close();
                }
            }, C822700WPc.LL);
        }
    }

    public static void LIZJ(C1322110kVd c1322110kVd, ImageModel imageModel, Drawable drawable, C1291830jin c1291830jin, InterfaceC1142670fqD interfaceC1142670fqD, boolean z) {
        LIZLLL(c1322110kVd, imageModel, drawable, c1291830jin, interfaceC1142670fqD, z, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZLLL(C1322110kVd c1322110kVd, ImageModel imageModel, Drawable drawable, C1291830jin c1291830jin, InterfaceC1142670fqD interfaceC1142670fqD, boolean z, boolean z2) {
        C1324630kZh c1324630kZh;
        if (LiveImageLoaderModuleSetting.useImageModule() && c1291830jin == null) {
            if (!C1819620xS4.LIZLLL(imageModel)) {
                return;
            }
            C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(imageModel.getUrls());
            c1324610kZfLIZJ.LJ = -1;
            c1324610kZfLIZJ.LJFF = -1;
            c1324610kZfLIZJ.LJIIL = interfaceC1142670fqD;
            c1324610kZfLIZJ.LJJII = false;
            c1324610kZfLIZJ.LJIJI = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
            c1324610kZfLIZJ.LJIIJJI = drawable;
            c1324610kZfLIZJ.LJIL = z;
            c1324610kZfLIZJ.LJJ = Boolean.valueOf(z2);
            c1324610kZfLIZJ.LJJI(c1322110kVd);
            return;
        }
        if (c1322110kVd != null && imageModel != null && imageModel.getUrls() != null && imageModel.getUrls().size() != 0) {
            int measuredWidth = c1322110kVd.getMeasuredWidth();
            int measuredHeight = c1322110kVd.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0) {
                c1324630kZh = new C1324630kZh(measuredWidth, measuredHeight);
            } else {
                c1324630kZh = null;
            }
            C1325710kbR[] c1325710kbRArrLJ = LJ(imageModel, c1324630kZh, c1291830jin, z2);
            if (c1325710kbRArrLJ != 0 && c1325710kbRArrLJ.length != 0) {
                C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                c1320810kTXLIZJ.LJIILJJIL = c1322110kVd.getController();
                if (!C1322020kVU.LIZ()) {
                    c1320810kTXLIZJ.LJFF(c1325710kbRArrLJ, true);
                } else if (c1325710kbRArrLJ.length == 1) {
                    c1320810kTXLIZJ.LIZLLL = c1325710kbRArrLJ[0];
                } else {
                    c1320810kTXLIZJ.LJFF(c1325710kbRArrLJ, false);
                }
                if (z) {
                    c1320810kTXLIZJ.LJIIJJI = true;
                }
                if (drawable != null) {
                    if (c1322110kVd.getHierarchy() == null) {
                        C1331090kk7 c1331090kk7 = new C1331090kk7(c1322110kVd.getContext().getResources());
                        c1331090kk7.LIZJ = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
                        c1331090kk7.LJ = drawable;
                        c1331090kk7.LJFF = InterfaceC1320380kSq.LJI;
                        c1322110kVd.setHierarchy(c1331090kk7.LIZ());
                    } else {
                        C1331070kk5 hierarchy = c1322110kVd.getHierarchy();
                        hierarchy.LJIJI(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
                        hierarchy.LJIJ(drawable, 1);
                        c1322110kVd.setHierarchy(hierarchy);
                    }
                }
                c1320810kTXLIZJ.LJIIIIZZ = new C1142660fqC(imageModel, interfaceC1142670fqD);
                c1322110kVd.setController(c1320810kTXLIZJ.LIZ());
            }
        }
    }
}
