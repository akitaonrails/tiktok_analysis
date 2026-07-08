package X;

import com.bytedance.android.btm.api.config.BcmChainInLogger;
import com.bytedance.android.btm.api.config.BtmEventConfigModel;
import com.bytedance.android.btm.impl.setting.FeatureModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;

/* JADX INFO: renamed from: X.18Bw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21244618Bw {
    public static final int[] LIZ;
    public static volatile BtmEventConfigModel LIZIZ;
    public static int LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int[] iArr = {1, 9, 20, 30};
        LIZ = iArr;
        BtmEventConfigModel btmEventConfigModel = new BtmEventConfigModel();
        if (btmEventConfigModel instanceof LazyDataBase) {
            C1972007ny.LIZLLL("btm_libra_event_config", "btm_libra_event_config", (LazyDataBase) btmEventConfigModel, "");
        }
        LIZIZ = btmEventConfigModel;
        int i = LIZJ;
        int i2 = i < 4 ? iArr[i] : 60;
        C18GU c18gu = C18GU.LIZ;
        RunnableC21244718Bx runnableC21244718Bx = new RunnableC21244718Bx();
        c18gu.getClass();
        C18GU.LIZLLL(((long) i2) * 60000, runnableC21244718Bx);
    }

    public static BcmChainInLogger LIZ() {
        if (LIZIZ.getSwitch() != 0) {
            return LIZIZ.getReportBcmChain();
        }
        FeatureModel featureModelLIZJ = C18CS.LIZ.LIZJ();
        featureModelLIZJ.getClass();
        C1972007ny.LIZLLL(featureModelLIZJ.getLazyDataRootKey(), featureModelLIZJ.getLazyDataKey(), featureModelLIZJ.reportBcmChain, "bcm_chain_in_logger");
        return featureModelLIZJ.reportBcmChain;
    }

    public static void LIZIZ(BtmEventConfigModel btmEventConfigModel) {
        if (btmEventConfigModel.getVersion() > LIZIZ.getVersion()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateEventConfig, new version:");
            sbLIZ.append(btmEventConfigModel.getVersion());
            sbLIZ.append(", old version:");
            sbLIZ.append(LIZIZ.getVersion());
            C18CK.LIZJ("BtmLibra", new C21244818By(C2188811AlT.LIZIZ(sbLIZ)), false);
            LIZIZ = btmEventConfigModel;
            C1971707nv.LJ(BtmEventConfigModel.class, "btm_libra_event_config", GsonProtectorUtils.toJson(C18CS.LIZ(), btmEventConfigModel));
        }
    }
}
