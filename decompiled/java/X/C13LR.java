package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.ranges.IntRange;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13LR, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13LR {
    public final Set<String> LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public C13LR(Collection collection) {
        HashSet hashSet;
        String string = UUID.randomUUID().toString();
        int iLJIIJ = C13LZ.LJIIJ(AbstractC19994813Le.Default, new IntRange(43, 128));
        List listLJLILLLLZI = C13LP.LJLILLLLZI('~', C13LP.LJLILLLLZI('_', C13LP.LJLILLLLZI('.', C13LP.LJLILLLLZI('-', C13LP.LJLIL(new C13LT('0', '9'), C13LP.LJLIIL(new C13LT('a', 'z'), new C13LT('A', 'Z')))))));
        ArrayList arrayList = new ArrayList(iLJIIJ);
        for (int i = 0; i < iLJIIJ; i++) {
            arrayList.add(Character.valueOf(((Character) C13LP.LJLJJI(listLJLILLLLZI, AbstractC19994813Le.Default)).charValue()));
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, "", null, null, 0, null, null, 62);
        if (string != null && string.length() != 0 && a0.LJJIZ(string, ' ', 0, false, 6) < 0 && C20012613Sa.LIZIZ(strLJJLIIIJ)) {
            if (collection != null) {
                hashSet = new HashSet(collection);
            } else {
                hashSet = new HashSet();
            }
            hashSet.add("openid");
            this.LIZ = Collections.unmodifiableSet(hashSet);
            this.LIZIZ = string;
            this.LIZJ = strLJJLIIIJ;
            return;
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }
}
