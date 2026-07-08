package X;

/* JADX INFO: renamed from: X.0vha, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1752360vha {
    public static String LIZ(Integer num) {
        int type = EnumC1752350vhZ.DEFAULT_MODE.getType();
        if (num != null && num.intValue() == type) {
            return "sku";
        }
        int type2 = EnumC1752350vhZ.ENRICH_MODE.getType();
        if (num != null && num.intValue() == type2) {
            return "sku_enriched";
        }
        int type3 = EnumC1752350vhZ.EXCHANGE_MODE.getType();
        if (num == null || num.intValue() != type3) {
            return "sku";
        }
        return "sku_exchange";
    }
}
