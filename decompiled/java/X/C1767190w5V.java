package X;

import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.migration.InboxShopEntranceMigrationConfig;

/* JADX INFO: renamed from: X.0w5V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1767190w5V {
    public static final boolean LIZ;
    public static final boolean LIZIZ;
    public static final boolean LIZJ;
    public static final int LIZLLL;
    public static final int LJ;
    public static final int LJFF;
    public static final int LJI;
    public static final int LJII;

    static {
        InboxShopEntranceMigrationConfig inboxShopEntranceMigrationConfig = new InboxShopEntranceMigrationConfig(1, 0, 14, 7, 1);
        InboxShopEntranceMigrationConfig inboxShopEntranceMigrationConfig2 = (InboxShopEntranceMigrationConfig) C0C64.LJIILLIIL().LJJII(InboxShopEntranceMigrationConfig.class, inboxShopEntranceMigrationConfig, "inbox_shop_entry_migration_config", true);
        if (inboxShopEntranceMigrationConfig2 != null) {
            inboxShopEntranceMigrationConfig = inboxShopEntranceMigrationConfig2;
        }
        Integer num = inboxShopEntranceMigrationConfig.migrationType;
        boolean z = num != null && num.intValue() == 1;
        LIZ = z;
        Integer num2 = inboxShopEntranceMigrationConfig.migrationType;
        boolean z2 = num2 != null && num2.intValue() == 2;
        LIZIZ = z2;
        LIZJ = z || z2;
        Integer num3 = inboxShopEntranceMigrationConfig.version;
        LIZLLL = num3 != null ? num3.intValue() : 1;
        Integer num4 = inboxShopEntranceMigrationConfig.migrationType;
        LJ = num4 != null ? num4.intValue() : 0;
        Integer num5 = inboxShopEntranceMigrationConfig.displayDurationDays;
        LJFF = num5 != null ? num5.intValue() : 14;
        Integer num6 = inboxShopEntranceMigrationConfig.reshowDelayDays;
        LJI = num6 != null ? num6.intValue() : 7;
        Integer num7 = inboxShopEntranceMigrationConfig.maxClickButtonCount;
        LJII = num7 != null ? num7.intValue() : 1;
    }
}
