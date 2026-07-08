package X;

import androidx.fragment.app.Fragment;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S2S, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S2S {
    public static EnumC2172611A1b LIZ(String str) {
        EnumC2172611A1b next;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Fragment fragmentLIZLLL;
        Iterator<EnumC2172611A1b> it2 = EnumC2172611A1b.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getEtString(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EnumC2172611A1b enumC2172611A1b = next;
        if (enumC2172611A1b == null) {
            enumC2172611A1b = EnumC2172611A1b.UNKNOWN;
        }
        if (enumC2172611A1b == EnumC2172611A1b.UNKNOWN) {
            C0W8I.LIZ.getClass();
            if (C0W8I.LIZIZ() && (abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) != null && (fragmentLIZLLL = abstractC1387200mCcLIZIZ.LIZLLL()) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(fragmentLIZLLL);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(str);
                sbLIZ.append("] is not added to QuickMessageEnterFrom. Please add it or contact @dongwoo.han!!!");
                c1389890mGx.LJIIJ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return enumC2172611A1b;
    }
}
