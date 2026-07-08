package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hUh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1206210hUh {
    public final Context LIZ;
    public final String LIZIZ;
    public final Boolean LIZJ;
    public final String LIZLLL;
    public final boolean LJ;

    public static List LIZ(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C0OFL) it2.next()).LIZ().fragmentPowerItem);
        }
        return arrayList;
    }

    public final String LIZIZ(int i, String str) {
        String string = this.LIZ.getString(i);
        if (!Intrinsics.LJFF(string, str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            String strSubstring = string.substring(0, 1);
            Locale locale = Locale.ROOT;
            sbLIZ.append(strSubstring.toUpperCase(locale));
            sbLIZ.append(string.substring(1).toLowerCase(locale));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return string;
    }

    public C1206210hUh(C19EG c19eg, String str, Boolean bool, String str2, boolean z) {
        this.LIZ = c19eg;
        this.LIZIZ = str;
        this.LIZJ = bool;
        this.LIZLLL = str2;
        this.LJ = z;
    }
}
