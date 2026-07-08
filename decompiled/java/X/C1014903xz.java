package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomSchemaBizTypeDetectionModel;
import java.util.List;

/* JADX INFO: renamed from: X.03xz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1014903xz {
    public static final EcomSchemaBizTypeDetectionModel LIZ;

    static {
        List listLJIIJJI = C1697810uHb.LJIIJJI("/pdp", "/sku", "/order_submit_v2", "/delivery");
        Boolean bool = Boolean.FALSE;
        LIZ = new EcomSchemaBizTypeDetectionModel(listLJIIJJI, bool, bool);
    }
}
