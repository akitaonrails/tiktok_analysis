package X;

import com.bytedance.android.btm.api.model.BufferBtm;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.android.btm.impl.setting.FeatureModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Ct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21246918Ct {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(PageInfo pageInfo, String str) {
        int iIntValue;
        C21246818Cs c21246818Cs;
        if (pageInfo != null) {
            pageInfo.setBtmPreSetFromSourceBtmToken(true);
            pageInfo.setUpdateBySourceBtmTokenInThisDisplay(true);
        }
        C21248618Dk c21248618Dk = C21248618Dk.LIZ;
        c21248618Dk.getClass();
        if (str != null && str.length() != 0) {
            FeatureModel featureModelLIZJ = C18CS.LIZ.LIZJ();
            featureModelLIZJ.getClass();
            Object objLIZIZ = C1972007ny.LIZIZ(featureModelLIZJ, "add_token_in_chain", Integer.valueOf(featureModelLIZJ.addTokenInChain));
            if (!(objLIZIZ instanceof Integer)) {
                objLIZIZ = null;
            }
            Integer num = (Integer) objLIZIZ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = featureModelLIZJ.addTokenInChain;
            }
            featureModelLIZJ.addTokenInChain = iIntValue;
            if (iIntValue == 1 && (c21246818Cs = c21248618Dk.LJIIJ().get(str)) != null) {
                C21246818Cs c21246818Cs2 = new C21246818Cs(c21246818Cs.LIZ, c21246818Cs.LIZIZ, c21246818Cs.LIZJ, c21246818Cs.LIZLLL, c21246818Cs.LJ, true, c21246818Cs.LJFF, c21246818Cs.LJI, c21246818Cs.LJII, c21246818Cs.LJIIIIZZ, c21246818Cs.LJIIIZ, c21246818Cs.LJIIJ, c21246818Cs.LJIIJJI, c21246818Cs.LJIIL, c21246818Cs.LJIILIIL);
                c21248618Dk.LJIIJ().put(str, c21246818Cs2);
                ((C18EH) C21248618Dk.LIZJ.getValue()).LIZLLL(c21246818Cs2, str, false);
            }
        }
    }

    public static void LIZIZ(BufferBtm bufferBtm, PageInfo pageInfo) {
        if (pageInfo.getBtmPreSetFromSourceBtmToken() && C18CS.LIZ.LIZJ().LJIIL().LIZLLL() == 1 && bufferBtm != null && !Intrinsics.LJFF(pageInfo.getBtmPre(), bufferBtm.getBtm())) {
            C189C.LIZ(new C21247118Cv(bufferBtm, pageInfo));
        }
    }
}
