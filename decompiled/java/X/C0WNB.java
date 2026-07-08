package X;

import com.bytedance.pumbaa.hybrid.governance.router.settings.PnsMigrateItem;
import com.bytedance.pumbaa.hybrid.governance.router.settings.PnsOnelinkMigrateConfigModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0WNB, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WNB {
    public static PnsOnelinkMigrateConfigModel LIZ;
    public static long LIZIZ = System.currentTimeMillis();

    public static final PnsOnelinkMigrateConfigModel LIZ() {
        if (LIZ == null || System.currentTimeMillis() - LIZIZ > 300000) {
            PnsOnelinkMigrateConfigModel pnsOnelinkMigrateConfigModel = LIZ;
            if (pnsOnelinkMigrateConfigModel == null) {
                pnsOnelinkMigrateConfigModel = new PnsOnelinkMigrateConfigModel(C1697810uHb.LJIILJJIL(new PnsMigrateItem(".onelink.me", "", "cct", C1697810uHb.LJIIJJI(CardStruct.IStatusCode.DEFAULT, "402657281", "67108864"), C1697810uHb.LJIIJJI("snssdk1233.onelink.me", "snssdk1180.onelink.me", "snssdk473824.onelink.me"))));
            }
            LIZ = (PnsOnelinkMigrateConfigModel) C821960WMg.LIZ(PnsOnelinkMigrateConfigModel.class, "pns_onelink_migrate_config", pnsOnelinkMigrateConfigModel);
            LIZIZ = System.currentTimeMillis();
        }
        return LIZ;
    }
}
