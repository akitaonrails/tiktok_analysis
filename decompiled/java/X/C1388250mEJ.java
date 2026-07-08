package X;

import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0mEJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1388250mEJ {
    public static final Map<BaseSharePackage, C1388240mEI> LIZ = new LinkedHashMap();

    public static C1388240mEI LIZ(BaseSharePackage baseSharePackage) {
        return (C1388240mEI) ((LinkedHashMap) LIZ).get(baseSharePackage);
    }

    public static void LIZIZ(BaseSharePackage baseSharePackage) {
        LIZ.remove(baseSharePackage);
    }
}
