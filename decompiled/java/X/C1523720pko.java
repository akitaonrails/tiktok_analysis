package X;

import com.ss.android.ugc.aweme.ecommerce.sparkpreload.ECSparkPreloadConfigItem;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1523720pko extends C09AY implements Function0<List<? extends InterfaceC1523710pkn>> {
    public C1523720pko() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends InterfaceC1523710pkn> invoke() {
        return C1697810uHb.LJIIJJI(C1523760pks.LIZ, new InterfaceC1523710pkn() { // from class: X.0pkq
            public static final ECSparkPreloadConfigItem[] LIZIZ = new ECSparkPreloadConfigItem[0];

            @Override // X.InterfaceC1523710pkn
            public final List<ECSparkPreloadConfigItem> LIZ() {
                Object[] objArr;
                if (C1523760pks.LIZIZ().enable && (objArr = (Object[]) C0C64.LJIILLIIL().LJJII(ECSparkPreloadConfigItem[].class, LIZIZ, "ecom_spark_common_preload_config_ext1", true)) != null) {
                    return C13LQ.LJJLL(objArr);
                }
                return null;
            }
        }, new InterfaceC1523710pkn() { // from class: X.0pkr
            public static final ECSparkPreloadConfigItem[] LIZIZ = new ECSparkPreloadConfigItem[0];

            @Override // X.InterfaceC1523710pkn
            public final List<ECSparkPreloadConfigItem> LIZ() {
                Object[] objArr;
                if (C1523760pks.LIZIZ().enable && (objArr = (Object[]) C0C64.LJIILLIIL().LJJII(ECSparkPreloadConfigItem[].class, LIZIZ, "ecom_spark_common_preload_config_ext2", true)) != null) {
                    return C13LQ.LJJLL(objArr);
                }
                return null;
            }
        });
    }
}
