package X;

import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.core.ab.SeaPdpQualityPerceptionOptConfigModel;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: renamed from: X.04Gu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1071004Gu {
    public static final n LIZ;
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;

    static {
        n nVar = new n();
        nVar.LJJIII(1, "add_extra_facade_in_preload");
        nVar.LJJIII(2, "lockup_split_version");
        nVar.LJJIII(1, "old_lynx_node_type_as_godav1");
        LIZ = nVar;
        LIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(358));
        LIZJ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(357));
    }

    public static SeaPdpQualityPerceptionOptConfigModel LIZIZ() {
        return (SeaPdpQualityPerceptionOptConfigModel) LIZJ.getValue();
    }

    public static n LIZJ() {
        return (n) LIZIZ.getValue();
    }

    public static boolean LIZ() {
        k kVarLJJIIZ = LIZJ().LJJIIZ("bottom_bar_bff_version");
        return kVarLJJIIZ != null && kVarLJJIIZ.LJIIJJI() >= 1;
    }
}
