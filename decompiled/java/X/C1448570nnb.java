package X;

import com.ss.android.ugc.asve.context.PreviewSize;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import kotlin.jvm.internal.AFwS210S0000000_22;
import lth.o;

/* JADX INFO: renamed from: X.0nnb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448570nnb {
    public static final C1448570nnb LIZ = new C1448570nnb();

    public static int[] LIZJ(EnumC1448590nnd enumC1448590nnd) {
        boolean z;
        if (enumC1448590nnd != EnumC1448590nnd.RATIO_3_4 && enumC1448590nnd != EnumC1448590nnd.RATIO_1_1) {
            z = false;
        } else {
            z = true;
        }
        int[] recordVideoSize = AVSettingsWrapper.getRecordVideoSize(z);
        if (recordVideoSize == null) {
            recordVideoSize = new int[]{720, 1280};
        }
        if (z) {
            if (C1448580nnc.LIZ[enumC1448590nnd.ordinal()] == 2) {
                return new int[]{recordVideoSize[0], recordVideoSize[0]};
            }
            return new int[]{recordVideoSize[0], (int) (recordVideoSize[0] / 0.75f)};
        }
        return recordVideoSize;
    }

    public static int[] LIZ(EnumC1448590nnd enumC1448590nnd, CameraComponentModel cameraComponentModel) {
        int i = C1448580nnc.LIZ[enumC1448590nnd.ordinal()];
        if (i != 1 && i != 2) {
            return new int[]{cameraComponentModel.mVideoWidth, cameraComponentModel.mVideoHeight};
        }
        C1443590nfZ c1443590nfZ = o.LJIILIIL;
        c1443590nfZ.LIZ();
        int i2 = c1443590nfZ.LIZ;
        return new int[]{i2, (int) (i2 / enumC1448590nnd.getRatio())};
    }

    public static int[] LIZIZ(C1448570nnb c1448570nnb, EnumC1448590nnd enumC1448590nnd) {
        EnumC1448590nnd enumC1448590nnd2;
        AFwS210S0000000_22 aFwS210S0000000_22 = AFwS210S0000000_22.get$arr$(159);
        c1448570nnb.getClass();
        int i = C1448580nnc.LIZ[enumC1448590nnd.ordinal()];
        if (i != 1 && i != 2) {
            if (((Boolean) C1866520yfi.LIZ.getValue()).booleanValue() && enumC1448590nnd == (enumC1448590nnd2 = EnumC1448590nnd.RATIO_9_16)) {
                int[] iArr = (int[]) aFwS210S0000000_22.invoke();
                if (iArr.length == 2 && iArr[0] > 0 && iArr[1] > 0) {
                    return new int[]{iArr[0], (int) (iArr[0] / enumC1448590nnd2.getRatio())};
                }
                return new int[]{720, 1280};
            }
            return (int[]) aFwS210S0000000_22.invoke();
        }
        InterfaceC1442420ndg.LJFF.getClass();
        PreviewSize previewSizeLIZIZ = C1442310ndV.LIZIZ();
        if (previewSizeLIZIZ == null) {
            int[] iArr2 = (int[]) aFwS210S0000000_22.invoke();
            if (iArr2.length == 2) {
                return new int[]{iArr2[0], (int) (iArr2[0] / enumC1448590nnd.getRatio())};
            }
            return new int[]{720, 960};
        }
        return new int[]{previewSizeLIZIZ.width, previewSizeLIZIZ.height};
    }
}
