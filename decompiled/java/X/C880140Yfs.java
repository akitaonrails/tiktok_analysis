package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yfs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C880140Yfs extends AbstractC880270Yg5<C880160Yfu> {
    public final C880150Yft LIZIZ(C880160Yfu c880160Yfu) {
        C879950YfZ c879950YfZ;
        C0Y8T c0y8t;
        boolean z;
        boolean z2;
        InterfaceC1490905sZ<?> interfaceC1490905sZ = c880160Yfu.LIZ;
        if (interfaceC1490905sZ instanceof InterfaceC1606206Qq) {
            Object obj = c880160Yfu.LIZIZ;
            if ((obj instanceof C0Y8T) && (c0y8t = (C0Y8T) obj) != null) {
                IMUser iMUser = c880160Yfu.LIZJ;
                Pair<Boolean, Boolean> pairLIZ = C876830YaX.LIZ(c0y8t);
                FilterTabType filterTabType = c880160Yfu.LIZLLL;
                int unreadCount = (int) c0y8t.getUnreadCount();
                boolean zIsMute = c0y8t.isMute();
                if (!c0y8t.isSingleChat() && !c0y8t.isGroupChat()) {
                    z = false;
                } else {
                    z = true;
                }
                boolean zIsRisky = c0y8t.isRisky();
                if (iMUser != null && iMUser.isBlock() && c0y8t.isSingleChat()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return LIZ(new C880310Yg9(unreadCount, zIsMute, z, zIsRisky, z2, c0y8t.isHide(), pairLIZ.getFirst().booleanValue(), pairLIZ.getSecond().booleanValue(), C876830YaX.LIZJ(c0y8t), C876830YaX.LIZIZ(c0y8t), filterTabType));
            }
            return C880150Yft.LIZLLL;
        }
        if (Intrinsics.LJFF(interfaceC1490905sZ, C878910Ydt.INSTANCE)) {
            Object obj2 = c880160Yfu.LIZIZ;
            if ((obj2 instanceof C879950YfZ) && (c879950YfZ = (C879950YfZ) obj2) != null) {
                return LIZ(new C880310Yg9(c879950YfZ.LJII, false, false, false, false, false, false, false, c879950YfZ.LJIIIIZZ, false, c880160Yfu.LIZLLL));
            }
            return C880150Yft.LIZLLL;
        }
        return C880150Yft.LIZLLL;
    }
}
