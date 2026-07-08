package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZZ8, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZZ8 {
    public static C461530I7z LIZ(C0ZZ9 c0zz9, InterfaceC1891350zJl interfaceC1891350zJl) {
        C0ZZ9 c0zz92;
        boolean z;
        boolean z2;
        String str;
        String str2;
        String string;
        String string2;
        UrlModel urlModel;
        List<String> urlList;
        UrlModel urlModel2;
        List<String> urlList2;
        if ((interfaceC1891350zJl instanceof C0ZZ9) && (c0zz92 = (C0ZZ9) interfaceC1891350zJl) != null) {
            boolean zLJFF = true;
            if (Intrinsics.LJFF(c0zz9.LJJJLL(), c0zz92.LJJJLL()) && Intrinsics.LJFF(c0zz9.getRoomInfo(), c0zz92.getRoomInfo())) {
                z = false;
            } else {
                z = true;
            }
            if (c0zz9.LJJJLL().LIZ().LIZ.booleanValue() != c0zz92.LJJJLL().LIZ().LIZ.booleanValue()) {
                z2 = true;
            } else {
                z2 = !Intrinsics.LJFF(c0zz9.LIZJ(), c0zz92.LIZJ());
            }
            if (c0zz9.LJJJLL().LIZ().LIZ.booleanValue() == c0zz92.LJJJLL().LIZ().LIZ.booleanValue()) {
                C0ZZ1 roomInfo = c0zz9.getRoomInfo();
                if (roomInfo != null) {
                    str = roomInfo.LIZLLL;
                } else {
                    str = null;
                }
                C0ZZ1 roomInfo2 = c0zz92.getRoomInfo();
                if (roomInfo2 != null) {
                    str2 = roomInfo2.LIZLLL;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str, str2)) {
                    C0ZZ1 roomInfo3 = c0zz9.getRoomInfo();
                    if (roomInfo3 != null && (urlModel2 = roomInfo3.LJ) != null && (urlList2 = urlModel2.getUrlList()) != null) {
                        string = urlList2.toString();
                    } else {
                        string = null;
                    }
                    C0ZZ1 roomInfo4 = c0zz92.getRoomInfo();
                    if (roomInfo4 != null && (urlModel = roomInfo4.LJ) != null && (urlList = urlModel.getUrlList()) != null) {
                        string2 = urlList.toString();
                    } else {
                        string2 = null;
                    }
                    zLJFF = true ^ Intrinsics.LJFF(string, string2);
                }
            }
            C0ZZA c0zza = new C0ZZA(z, z2, zLJFF);
            C461530I7z c461530I7zLIZIZ = C461450I7r.LIZIZ(c0zz9, interfaceC1891350zJl);
            if (c461530I7zLIZIZ == null) {
                return null;
            }
            return C461530I7z.LIZIZ(c461530I7zLIZIZ, null, c0zza, 5);
        }
        return C461450I7r.LIZIZ(c0zz9, interfaceC1891350zJl);
    }
}
