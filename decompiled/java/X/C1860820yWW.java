package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Charsets;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0yWW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1860820yWW {
    public static String LIZJ(String str) {
        return a0.LJJJJJL('0', 32, new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(str.getBytes(Charsets.UTF_8))).toString(16));
    }

    public static final String LIZ(InterfaceC1858000yRy interfaceC1858000yRy, List<TakoVideoItem> list) {
        String strRetrieveIncrementalId;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = null;
        if (interfaceC1858000yRy != null) {
            strRetrieveIncrementalId = interfaceC1858000yRy.retrieveIncrementalId();
        } else {
            strRetrieveIncrementalId = null;
        }
        sb.append(strRetrieveIncrementalId);
        sb.append('_');
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<TakoVideoItem> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().awemeId);
            }
        }
        sb.append(arrayList);
        return LIZJ(sb.toString());
    }

    public static final String LIZIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return LIZJ(C2188811AlT.LIZIZ(sbLIZ));
    }
}
