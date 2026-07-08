package X;

import com.ss.android.ugc.aweme.ecommerce.mixmall.settings.ECMixMallBlockRunnableOptModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: renamed from: X.1Ae9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2184271Ae9 {
    public static final C2184271Ae9 LIZ = new C2184271Ae9();
    public static final ECMixMallBlockRunnableOptModel LIZIZ = new ECMixMallBlockRunnableOptModel(false, 0, 1000, null);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(557));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(556));

    public static C2184901AfA LIZ(ECMixMallBlockRunnableOptModel eCMixMallBlockRunnableOptModel) {
        C2184301AeC c2184301AeC;
        int i = eCMixMallBlockRunnableOptModel.blockType;
        C1AWY c1awy = C1AWY.SINGLE;
        if (i == c1awy.ordinal()) {
            c2184301AeC = new C2184301AeC();
            c2184301AeC.LJI = c1awy;
            c2184301AeC.LJIIIIZZ = eCMixMallBlockRunnableOptModel.blockDuration;
            c2184301AeC.LJFF = EnumC2184291AeB.TIME;
            List<String> list = eCMixMallBlockRunnableOptModel.blockList;
            if (list != null) {
                for (String str : list) {
                    if (str != null && str.length() != 0) {
                        ((ArrayList) c2184301AeC.LIZIZ).add(str);
                    }
                }
            }
        } else {
            c2184301AeC = new C2184301AeC();
            c2184301AeC.LJI = C1AWY.ALL;
            c2184301AeC.LJIIIIZZ = eCMixMallBlockRunnableOptModel.blockDuration;
            c2184301AeC.LJFF = EnumC2184291AeB.TIME;
            List<String> list2 = eCMixMallBlockRunnableOptModel.blockList;
            if (list2 != null) {
                for (String str2 : list2) {
                    if (str2 != null && str2.length() != 0) {
                        ((ArrayList) c2184301AeC.LIZ).add(str2);
                    }
                }
            }
        }
        C2184901AfA c2184901AfA = new C2184901AfA();
        c2184901AfA.LJFF = "mall";
        c2184901AfA.LIZIZ = Collections.singletonList(c2184301AeC);
        return c2184901AfA;
    }
}
