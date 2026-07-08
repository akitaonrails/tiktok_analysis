package X;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Wb6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C826220Wb6 {
    public final C826250Wb9 LIZ = new C826250Wb9();

    public C826220Wb6(List<C826240Wb8> list) {
        for (C826240Wb8 c826240Wb8 : list) {
            String str = c826240Wb8.LIZ;
            EnumC826230Wb7 enumC826230Wb7 = c826240Wb8.LIZIZ;
            List<String> listLJLJJLL = C13LP.LJLJJLL(a0.LJJLIIIJILLIZJL(str.toLowerCase(Locale.ROOT), new String[]{e3.d}, 0, 6));
            C826250Wb9 c826250Wb9 = this.LIZ;
            for (String str2 : listLJLJJLL) {
                if (str2.length() != 0) {
                    HashMap<String, C826250Wb9> map = c826250Wb9.LIZ;
                    C826250Wb9 c826250Wb92 = map.get(str2);
                    if (c826250Wb92 == null) {
                        c826250Wb92 = new C826250Wb9();
                        map.put(str2, c826250Wb92);
                    }
                    c826250Wb9 = c826250Wb92;
                }
            }
            c826250Wb9.LIZIZ = enumC826230Wb7;
        }
    }
}
