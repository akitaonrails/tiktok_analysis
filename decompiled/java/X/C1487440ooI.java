package X;

import android.text.TextUtils;
import com.ss.android.ugc.mediabox.bgplay.model.BgPlayAbilityConfig;
import com.ss.android.ugc.mediabox.bgplay.model.BgPlayDataModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ooI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1487440ooI {
    public static final BgPlayDataModel LIZ(C1513680pUc c1513680pUc) {
        String str;
        int i;
        InterfaceC1481730of5 interfaceC1481730of5LJIIIZ;
        long duration;
        InterfaceC1481730of5 interfaceC1481730of5LJIIIZ2;
        C1479510obV c1479510obVLIZJ;
        BgPlayAbilityConfig bgPlayAbilityConfig = new BgPlayAbilityConfig(false, false, false, false);
        bgPlayAbilityConfig.canPlayFastForward = true;
        bgPlayAbilityConfig.canPlayFastBackWard = true;
        String strLJIIIZ = c1513680pUc.LJIIIZ();
        if (TextUtils.isEmpty(strLJIIIZ)) {
            strLJIIIZ = c1513680pUc.LJ();
        }
        InterfaceC1483670oiD interfaceC1483670oiDLJI = c1513680pUc.LJI();
        String str2 = "";
        if (interfaceC1483670oiDLJI == null || (interfaceC1481730of5LJIIIZ2 = interfaceC1483670oiDLJI.LJIIIZ()) == null || (c1479510obVLIZJ = interfaceC1481730of5LJIIIZ2.LIZJ()) == null || (str = c1479510obVLIZJ.LJIIIZ) == null) {
            str = "";
        }
        if (strLJIIIZ == null) {
            strLJIIIZ = "";
        }
        String strLJFF = c1513680pUc.LJFF();
        String strLJIIIIZZ = c1513680pUc.LJIIIIZZ();
        if (strLJIIIIZZ != null) {
            str2 = strLJIIIIZZ;
        }
        String strLJII = c1513680pUc.LJII();
        String strLJ = c1513680pUc.LJ();
        Long lLJIIJ = c1513680pUc.LJIIJ();
        if (lLJIIJ != null) {
            duration = lLJIIJ.longValue();
        } else {
            InterfaceC1483670oiD interfaceC1483670oiDLJI2 = c1513680pUc.LJI();
            if (interfaceC1483670oiDLJI2 != null && (interfaceC1481730of5LJIIIZ = interfaceC1483670oiDLJI2.LJIIIZ()) != null) {
                duration = interfaceC1481730of5LJIIIZ.getDuration();
            } else {
                i = 0;
                return new BgPlayDataModel(str, strLJIIIZ, strLJFF, str2, strLJII, strLJ, R.drawable.clz, i, bgPlayAbilityConfig);
            }
        }
        i = (int) duration;
        return new BgPlayDataModel(str, strLJIIIZ, strLJFF, str2, strLJII, strLJ, R.drawable.clz, i, bgPlayAbilityConfig);
    }
}
