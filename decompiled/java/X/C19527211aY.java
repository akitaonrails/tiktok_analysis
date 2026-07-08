package X;

import java.util.Map;

/* JADX INFO: renamed from: X.11aY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19527211aY extends AbstractC19524811aA<Long> {
    public final Map<String, Long> LIZIZ;

    public C19527211aY(Map<String, Long> map) {
        super(map);
        this.LIZIZ = map;
    }

    @Override // X.AbstractC19524811aA
    public final void LIZ(InterfaceC19526611aS interfaceC19526611aS, C19525911aL c19525911aL) {
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        long jLongValue4;
        long jLongValue5;
        Long l = (Long) interfaceC19526611aS.LJIIL("pp_data_key_original_file_size");
        long jLongValue6 = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Long l2 = (Long) interfaceC19526611aS.LJIIL("pp_data_key_extract_file_size");
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = 0;
        }
        Long l3 = (Long) interfaceC19526611aS.LJIIL("pp_data_key_download_file_size");
        if (l3 != null) {
            jLongValue3 = l3.longValue();
        } else {
            jLongValue3 = 0;
        }
        Map<String, Long> map = this.LIZIZ;
        Long l4 = map.get("pp_data_key_original_file_size");
        if (l4 != null) {
            jLongValue4 = l4.longValue();
        } else {
            jLongValue4 = 0;
        }
        map.put("pp_data_key_original_file_size", Long.valueOf(Math.max(jLongValue, jLongValue4)));
        Map<String, Long> map2 = this.LIZIZ;
        Long l5 = map2.get("pp_data_key_extract_file_size");
        if (l5 != null) {
            jLongValue5 = l5.longValue();
        } else {
            jLongValue5 = 0;
        }
        map2.put("pp_data_key_extract_file_size", Long.valueOf(Math.max(jLongValue2, jLongValue5)));
        Map<String, Long> map3 = this.LIZIZ;
        Long l6 = map3.get("pp_data_key_download_file_size");
        if (l6 != null) {
            jLongValue6 = l6.longValue();
        }
        map3.put("pp_data_key_download_file_size", Long.valueOf(Math.max(jLongValue3, jLongValue6)));
    }
}
