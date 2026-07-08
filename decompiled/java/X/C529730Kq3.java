package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0Kq3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529730Kq3 {
    public static final List<C530500KrI> LIZ;
    public static final C530500KrI LIZIZ;

    static {
        IntRange intRange = new IntRange(1, 5);
        ArrayList arrayList = new ArrayList();
        C531650Kt9 it2 = intRange.iterator();
        while (it2.LLILLL) {
            int iNextInt = it2.nextInt();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fc_card");
            sbLIZ.append(iNextInt);
            sbLIZ.append("_before.jpeg");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fc_card");
            sbLIZ2.append(iNextInt);
            sbLIZ2.append("_after.jpeg");
            C19719612Di.LJJI(C1697810uHb.LJIIJJI(new C530500KrI("ai_portrait_creation_img_res", C2188811AlT.LIZIZ(sbLIZ)), new C530500KrI("ai_portrait_creation_img_res", C2188811AlT.LIZIZ(sbLIZ2))), arrayList);
        }
        LIZ = arrayList;
        LIZIZ = new C530500KrI("ai_portrait_creation_img_res", "bg_creation_page.jpg");
    }
}
