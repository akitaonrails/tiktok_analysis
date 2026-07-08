package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.setting.performance.videoquality.StickerBitrateToResolution;
import com.ss.android.ugc.aweme.setting.performance.videoquality.StickerPreviewResolutionConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.vesdk.VESize;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0sPI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1625700sPI {
    public final Function0<EnumC1448590nnd> LIZ;
    public final ShortVideoContext LIZIZ;

    public final int[] LIZJ() {
        return C1448570nnb.LIZJ(this.LIZ.invoke());
    }

    public static String LIZ(String str) {
        List<String> list;
        StickerPreviewResolutionConfig stickerPreviewResolutionConfigLIZ = C1622030sJN.LIZ();
        if (stickerPreviewResolutionConfigLIZ != null && (list = stickerPreviewResolutionConfigLIZ.resolution) != null) {
            List listLJLLLL = C13LP.LJLLLL(new Comparator() { // from class: X.012X
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    String str2 = (String) obj;
                    String str3 = (String) obj2;
                    if (str2 == null) {
                        if (str3 == null) {
                            return 0;
                        }
                        return -1;
                    }
                    if (str3 == null) {
                        return 1;
                    }
                    if (a0.LJJIIZI(str2, "x", false) && a0.LJJIIZI(str3, "x", false)) {
                        try {
                            return CastIntegerProtector.parseInt((String) a0.LJJLIIIJILLIZJL(str2, new String[]{"x"}, 0, 6).get(0)) - CastIntegerProtector.parseInt((String) a0.LJJLIIIJILLIZJL(str3, new String[]{"x"}, 0, 6).get(0));
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            return str2.compareTo(str3);
                        }
                    }
                    return str2.compareTo(str3);
                }
            }, list);
            int i = 0;
            if (listLJLLLL != null && !listLJLLLL.isEmpty()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("findDowngradeResolution sorted categoryList ");
                sbLIZ.append(Arrays.toString(listLJLLLL.toArray(new String[0])));
                C1625690sPH.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                int iIndexOf = listLJLLLL.indexOf(str);
                if (iIndexOf >= 0 || (iIndexOf = listLJLLLL.size() - 1) >= 0) {
                    while (true) {
                        int i2 = iIndexOf - i;
                        if (i2 < 0) {
                            break;
                        }
                        String str2 = (String) ListProtector.get(listLJLLLL, i2);
                        if (!Intrinsics.LJFF(str, str2)) {
                            return str2;
                        }
                        i++;
                    }
                }
            }
        }
        return str;
    }

    public static float LIZIZ(VESize vESize) {
        String strLIZ;
        List<StickerBitrateToResolution> list = (List) C07MJ.LIZ.getValue();
        if (vESize.width >= 720) {
            strLIZ = C1625690sPH.LIZ(vESize);
        } else {
            strLIZ = "576x1024";
        }
        if (list != null) {
            for (StickerBitrateToResolution stickerBitrateToResolution : list) {
                if (Intrinsics.LJFF(stickerBitrateToResolution.resolution, strLIZ)) {
                    return stickerBitrateToResolution.bitrate;
                }
            }
        }
        return AVSettingsWrapper.com_ss_android_ugc_aweme_property_AVSettingsWrapper_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getRecordBitrate();
    }

    public C1625700sPI(ShortVideoContext shortVideoContext, Function0 function0) {
        this.LIZ = function0;
        this.LIZIZ = shortVideoContext;
    }

    public final VESize LIZLLL(int i, String str) {
        boolean z;
        String strLIZIZ;
        int[] videoSize;
        int[] iArrLIZJ = LIZJ();
        NowsShootModel nowsShootModel = this.LIZIZ.creativeModel.nowsShootModel;
        if ((!r1.LJI().isEmpty()) && this.LIZIZ.LJII() > 0 && str != null && !a0.LJJJIL(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z && (videoSize = AVSettingsWrapper.getVideoSize(str)) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sticker render video size: draft: ");
            sbLIZ.append(Arrays.toString(videoSize));
            sbLIZ.append(", origin_size: ");
            sbLIZ.append(Arrays.toString(iArrLIZJ));
            C1625690sPH.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            return new VESize(videoSize[0], videoSize[1]);
        }
        C1442490ndn c1442490ndn = InterfaceC1442520ndq.LJIIIZ;
        if (c1442490ndn.videoSizeIndex() != c1442490ndn.staticVideoSizeIndex()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("sticker render video size: byteBench: ");
            sbLIZ2.append(Arrays.toString(iArrLIZJ));
            sbLIZ2.append(", origin_size: ");
            sbLIZ2.append(Arrays.toString(iArrLIZJ));
            C1625690sPH.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
            return new VESize(iArrLIZJ[0], iArrLIZJ[1]);
        }
        if (iArrLIZJ.length != 2) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(iArrLIZJ[0]);
            sbLIZ3.append('x');
            sbLIZ3.append(iArrLIZJ[1]);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        String strLIZ = LIZ(strLIZIZ);
        int i2 = i - 1;
        for (int i3 = 0; i3 < i2; i3++) {
            strLIZ = LIZ(strLIZ);
        }
        int[] videoSize2 = AVSettingsWrapper.getVideoSize(strLIZ);
        if (videoSize2 != null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("sticker render video size: downgrade_size: ");
            sbLIZ4.append(Arrays.toString(videoSize2));
            sbLIZ4.append(", origin_size: ");
            sbLIZ4.append(Arrays.toString(iArrLIZJ));
            C1625690sPH.LIZIZ(C2188811AlT.LIZIZ(sbLIZ4));
            return new VESize(videoSize2[0], videoSize2[1]);
        }
        return null;
    }
}
