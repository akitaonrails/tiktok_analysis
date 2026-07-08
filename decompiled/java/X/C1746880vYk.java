package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vYk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746880vYk {
    public static final String LIZIZ(Object obj) {
        Iterable iterable;
        List<Region> listLJLJJLL;
        String str;
        if (!(obj instanceof List) || (iterable = (Iterable) obj) == null || (listLJLJJLL = C13LP.LJLJJLL(iterable)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Region region : listLJLJJLL) {
            if (region == null || ((str = region.code) == null && (str = region.name) == null)) {
                str = "";
            }
            arrayList.add(str);
        }
        return C13LP.LJJLIIIJ(arrayList, ", ", null, null, 0, null, AFwS268S0000000_26.get$arr$(729), 30);
    }

    public static final String LIZJ(Context context) {
        Object objH2;
        int itemCount;
        ClipData.Item itemLJJIIZ;
        CharSequence charSequenceLJJIIJ;
        String string = "";
        if (context == null) {
            objH2 = null;
        } else {
            try {
                objH2 = C786410Ut5.H2(context, "clipboard");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1019103yf.LIZ(EnumC1014603xw.ERR54, e, null);
                return string;
            }
        }
        ClipData clipDataLIZIZ = C20145713s7.LIZIZ((ClipboardManager) objH2, CertProviderManagerKt.findCert("bpea-gec_address_paste", 1476399140));
        if (clipDataLIZIZ != null) {
            itemCount = clipDataLIZIZ.getItemCount();
        } else {
            itemCount = 0;
        }
        if (itemCount <= 0) {
            return "";
        }
        if (clipDataLIZIZ == null || (itemLJJIIZ = C2204961BRm.LJJIIZ(clipDataLIZIZ, 0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsHbqVmM644AOU/NbMI+jA5qp6qzBw6T0=", null))) == null || (charSequenceLJJIIJ = C2204961BRm.LJJIIJ(itemLJJIIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KIch+E5zrpsHbqVmM644AOU/NbMI+jA5qp6qzBw6T0=", null))) == null) {
            return null;
        }
        string = charSequenceLJJIIJ.toString();
        return string;
    }

    public static final Region LIZ(Object obj, String str) {
        boolean z;
        List list;
        String str2;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || !(obj instanceof List) || (list = (List) obj) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            Region region = (Region) obj2;
            if (region != null) {
                str2 = region.districtKey;
            } else {
                str2 = null;
            }
            if (Intrinsics.LJFF(str2, str)) {
                arrayList.add(obj2);
            }
        }
        return (Region) C13LP.LJJJLZIJ(0, arrayList);
    }
}
