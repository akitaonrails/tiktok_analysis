package X;

import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lL2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1353980lL2 {
    public static boolean LIZ(InterfaceC1353990lL3 interfaceC1353990lL3, InterfaceC1891350zJl interfaceC1891350zJl) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        Integer num;
        if (!(interfaceC1891350zJl instanceof InterfaceC1353990lL3)) {
            return false;
        }
        InterfaceC1353990lL3 interfaceC1353990lL32 = (InterfaceC1353990lL3) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(interfaceC1353990lL3.getAweme().getAid(), interfaceC1353990lL32.getAweme().getAid()) || interfaceC1353990lL3.LLJLLL() != interfaceC1353990lL32.LLJLLL()) {
            return false;
        }
        User author = interfaceC1353990lL3.getAweme().getAuthor();
        Integer num2 = null;
        if (author != null) {
            numValueOf = Integer.valueOf(author.getFollowStatus());
        } else {
            numValueOf = null;
        }
        User author2 = interfaceC1353990lL32.getAweme().getAuthor();
        if (author2 != null) {
            numValueOf2 = Integer.valueOf(author2.getFollowStatus());
        } else {
            numValueOf2 = null;
        }
        if (!Intrinsics.LJFF(numValueOf, numValueOf2)) {
            return false;
        }
        User author3 = interfaceC1353990lL3.getAweme().getAuthor();
        if (author3 != null) {
            numValueOf3 = Integer.valueOf(author3.getFollowerStatus());
        } else {
            numValueOf3 = null;
        }
        User author4 = interfaceC1353990lL32.getAweme().getAuthor();
        if (author4 != null) {
            numValueOf4 = Integer.valueOf(author4.getFollowerStatus());
        } else {
            numValueOf4 = null;
        }
        if (!Intrinsics.LJFF(numValueOf3, numValueOf4)) {
            return false;
        }
        NowPostInfo nowPostInfo = interfaceC1353990lL3.getAweme().nowPostInfo;
        if (nowPostInfo != null) {
            num = nowPostInfo.nowStatus;
        } else {
            num = null;
        }
        NowPostInfo nowPostInfo2 = interfaceC1353990lL32.getAweme().nowPostInfo;
        if (nowPostInfo2 != null) {
            num2 = nowPostInfo2.nowStatus;
        }
        if (!Intrinsics.LJFF(num, num2) || interfaceC1353990lL3.LJLLLLLL() != interfaceC1353990lL32.LJLLLLLL()) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(InterfaceC1353990lL3 interfaceC1353990lL3, InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof InterfaceC1353990lL3)) {
            return false;
        }
        if (!interfaceC1353990lL3.LJLLLLLL() && !((InterfaceC1353990lL3) interfaceC1891350zJl).LJLLLLLL()) {
            return Intrinsics.LJFF(interfaceC1891350zJl, interfaceC1353990lL3);
        }
        return true;
    }
}
