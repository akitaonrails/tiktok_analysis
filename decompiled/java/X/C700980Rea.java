package X;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700980Rea extends C09AY implements Function1<C701270Rf3, C701270Rf3> {
    public C700980Rea() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C701270Rf3 invoke(C701270Rf3 c701270Rf3) {
        C701030Ref c701030RefLIZ;
        String str;
        C701270Rf3 c701270Rf32 = c701270Rf3;
        C700170RdH c700170RdH = c701270Rf32.LIZIZ;
        if (c700170RdH != null) {
            Iterator<Map.Entry<String, C700970ReZ>> it2 = c700170RdH.LIZ.LIZIZ().entrySet().iterator();
            while (it2.hasNext()) {
                C700970ReZ value = it2.next().getValue();
                String str2 = null;
                if (Intrinsics.LJFF(value.LJ, "added")) {
                    C701240Rf0 c701240Rf0 = value.LJIIIIZZ;
                    if (c701240Rf0 != null) {
                        str = c701240Rf0.LIZ;
                    } else {
                        str = null;
                    }
                    C700970ReZ c700970ReZLIZ = c700170RdH.LIZ.LIZ(str);
                    if (c700970ReZLIZ != null) {
                        C701030Ref c701030RefLIZ2 = c700970ReZLIZ.LIZ(new C701130Rep(value));
                        if (c701030RefLIZ2 != null) {
                            c700970ReZLIZ.LJ(c701030RefLIZ2);
                        }
                        c700970ReZLIZ.LIZLLL(value, -1);
                    }
                }
                if (Intrinsics.LJFF(value.LJ, "removed")) {
                    value.LJ = "not_changed";
                    C701240Rf0 c701240Rf02 = value.LJIIIIZZ;
                    if (c701240Rf02 != null) {
                        str2 = c701240Rf02.LIZ;
                    }
                    C700970ReZ c700970ReZLIZ2 = c700170RdH.LIZ.LIZ(str2);
                    if (c700970ReZLIZ2 != null && (c701030RefLIZ = c700970ReZLIZ2.LIZ(new C701140Req(value))) != null) {
                        c700970ReZLIZ2.LJ(c701030RefLIZ);
                        c700970ReZLIZ2.LJ = "changed";
                    }
                }
            }
            return new C701270Rf3(c701270Rf32.LIZIZ, c700170RdH.LIZ.LIZIZ().get(c700170RdH.LIZLLL));
        }
        return c701270Rf32;
    }
}
