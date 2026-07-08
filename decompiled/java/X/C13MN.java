package X;

import android.util.Base64;
import com.bytedance.pns.psi.PsiEncrypt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.13MN, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13MN {
    public static List LIZ(List list, byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Pair<Boolean, Pair<String, String>> pairLIZIZ = LIZIZ((String) it2.next(), bArr);
            if (pairLIZIZ.getFirst().booleanValue()) {
                arrayList.add(pairLIZIZ.getSecond());
            }
        }
        return arrayList;
    }

    public static final Pair<Boolean, Pair<String, String>> LIZIZ(String str, byte[] bArr) {
        PsiEncrypt.Companion companion = PsiEncrypt.LIZ;
        byte[] bArrDefaultPrefixOfHash = companion.defaultPrefixOfHash(str);
        byte[] bArrEncrypt = companion.encrypt(str, bArr);
        if (bArrDefaultPrefixOfHash != null && bArrDefaultPrefixOfHash.length != 0 && bArrEncrypt != null && bArrEncrypt.length != 0) {
            return new Pair<>(true, new Pair(Base64.encodeToString(bArrDefaultPrefixOfHash, 2), Base64.encodeToString(bArrEncrypt, 2)));
        }
        return new Pair<>(false, new Pair("", ""));
    }
}
