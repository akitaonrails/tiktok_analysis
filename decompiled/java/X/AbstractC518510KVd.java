package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KVd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC518510KVd<TYPE> {
    public final C098J<String, TYPE> LIZ = new C098J<>(5);

    public static String LIZ(String str, String str2) {
        String[] strArr = new String[2];
        if (str2 == null || !C1533950q1J.LJ(str2) || Intrinsics.LJFF(str2, CardStruct.IStatusCode.DEFAULT) || Intrinsics.LJFF(str2, "null")) {
            str2 = null;
        }
        strArr[0] = str2;
        if (str == null || !C1533950q1J.LJ(str) || Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT) || Intrinsics.LJFF(str, "null")) {
            str = null;
        }
        strArr[1] = str;
        List listLJIJI = C13LQ.LJIJI(strArr);
        if (!(!((ArrayList) listLJIJI).isEmpty())) {
            return null;
        }
        return C13LP.LJJLIIIJ(listLJIJI, ":", null, null, 0, null, null, 62);
    }

    public final TYPE LIZIZ(String str, String str2) {
        String strLIZ = LIZ(str, str2);
        if (strLIZ != null) {
            return this.LIZ.get(strLIZ);
        }
        return null;
    }
}
