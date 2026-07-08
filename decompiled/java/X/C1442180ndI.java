package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0ndI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442180ndI {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(536));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(535));

    public static List LIZ() {
        return C13LQ.LJJLL(((Keva) LIZ.getValue()).getStringArray("key_last_published_vid", new String[0]));
    }

    public static void LIZIZ(String str) {
        ArrayList arrayList = new ArrayList(LIZ());
        arrayList.add(str);
        if (arrayList.size() > 5) {
            C19719612Di.LJJIIZ(arrayList);
        }
        ((Keva) LIZ.getValue()).storeStringArray("key_last_published_vid", (String[]) arrayList.toArray(new String[0]));
    }

    public static void LIZJ(VideoPublishEditModel videoPublishEditModel, VEVideoEncodeSettings vEVideoEncodeSettings, boolean z, int i, boolean z2) {
        C1442190ndJ c1442190ndJ = videoPublishEditModel.creativeModel.commonMobModel.vqCompileDataModel;
        VESize videoRes = vEVideoEncodeSettings.getVideoRes();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(videoRes.width);
        sbLIZ.append('x');
        sbLIZ.append(videoRes.height);
        c1442190ndJ.LIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1442190ndJ.LIZIZ = vEVideoEncodeSettings.getExternalSettingsJsonStr();
        c1442190ndJ.LIZJ = z;
        c1442190ndJ.LIZLLL = i;
        VESize watermarkVideoRes = vEVideoEncodeSettings.getWatermarkVideoRes();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(watermarkVideoRes.width);
        sbLIZ2.append('x');
        sbLIZ2.append(watermarkVideoRes.height);
        c1442190ndJ.LJ = C2188811AlT.LIZIZ(sbLIZ2);
        c1442190ndJ.LJFF = vEVideoEncodeSettings.getExternalSettingsJsonStr();
        c1442190ndJ.LJI = vEVideoEncodeSettings.getEncodeStandard();
        c1442190ndJ.LJII = z2;
    }
}
