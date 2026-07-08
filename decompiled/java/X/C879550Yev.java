package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879550Yev implements InterfaceC882190YjB {
    public final String LIZ = "ChatListUnreadStateDecorator";
    public final String LIZIZ = "unread_state_decorator";
    public final List<C886620YqK> LIZJ = Collections.singletonList(C886620YqK.LIZ);

    @Override // X.InterfaceC882190YjB
    public final boolean LJFF() {
        return false;
    }

    @Override // X.InterfaceC882190YjB
    public final String LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC882190YjB
    public final List<C886620YqK> LIZJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC882190YjB
    public final InterfaceC1517005wm LIZLLL() {
        return C1491005sa.LIZ;
    }

    @Override // X.InterfaceC882190YjB
    public final String getTag() {
        return this.LIZ;
    }

    @Override // X.InterfaceC882190YjB
    public final void LIZIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
        C882180YjA.LIZ(this, interfaceC879010Ye3, c879540Yeu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC882190YjB
    public final C882270YjJ<?, ?> LJ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC886530YqB<?, ?> abstractC886530YqB, C882270YjJ<?, ?> c882270YjJ) {
        ArrayList arrayList;
        String key;
        long j;
        C879580Yey c879580Yey;
        List list;
        C0Y8T c0y8t;
        Object obj;
        boolean z;
        InterfaceC1490905sZ<?> interfaceC1490905sZ = c879540Yeu.LIZ;
        C880340YgC c880340YgC = null;
        IMUser iMUser = null;
        c880340YgC = null;
        c880340YgC = null;
        c880340YgC = null;
        if (interfaceC1490905sZ instanceof C1709506mj) {
            C886620YqK c886620YqK = C886620YqK.LIZ;
            if (Intrinsics.LJFF(abstractC886530YqB, c886620YqK)) {
                T t = c879540Yeu.LIZJ;
                if (!(t instanceof C0Y8T) || (c0y8t = (C0Y8T) t) == null) {
                    return null;
                }
                C1490405sU<?> c1490405sU = c879540Yeu.LIZLLL.get(C1718806oE.LIZ);
                if (c1490405sU != null) {
                    obj = c1490405sU.LIZIZ;
                } else {
                    obj = null;
                }
                if (obj instanceof IMUser) {
                    iMUser = (IMUser) obj;
                }
                Pair<Boolean, Boolean> pairLIZ = C876830YaX.LIZ(c0y8t);
                int unreadCount = (int) c0y8t.getUnreadCount();
                boolean zBooleanValue = pairLIZ.getFirst().booleanValue();
                boolean zIsMute = c0y8t.isMute();
                if (iMUser != null && iMUser.isBlock()) {
                    z = true;
                } else {
                    z = false;
                }
                return new C882270YjJ<>(c886620YqK, C880280Yg6.LIZJ(unreadCount, zBooleanValue, zIsMute, z, pairLIZ.getSecond().booleanValue(), C876830YaX.LIZJ(c0y8t), null, false));
            }
        } else if ((interfaceC1490905sZ instanceof C878900Yds) && Intrinsics.LJFF(abstractC886530YqB, C886620YqK.LIZ)) {
            T t2 = c879540Yeu.LIZJ;
            if ((t2 instanceof List) && (list = (List) t2) != null) {
                arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if ((obj2 instanceof C0Y9G) && obj2 != null) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = null;
            }
            C886620YqK c886620YqK2 = C886620YqK.LIZ;
            InterfaceC1491305sd interfaceC1491305sd = c879540Yeu.LIZIZ;
            if ((interfaceC1491305sd instanceof C879580Yey) && (c879580Yey = (C879580Yey) interfaceC1491305sd) != null) {
                key = c879580Yey.getKey();
            } else {
                key = null;
            }
            if (Intrinsics.LJFF(key, "message_request_spam")) {
                Keva keva = C879560Yew.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("im_message_request_story_cell_unread_time_");
                sbLIZ.append(((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId());
                long j2 = keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
                if (arrayList != null) {
                    ArrayList<C0Y9G> arrayList2 = new ArrayList();
                    for (Object obj3 : arrayList) {
                        if (((C0Y9G) obj3).LJ > j2) {
                            arrayList2.add(obj3);
                        }
                    }
                    long j3 = 0;
                    for (C0Y9G c0y9g : arrayList2) {
                        if (!c0y9g.LJII && c0y9g.LIZLLL > 0) {
                            j = 1;
                        } else {
                            j = 0;
                        }
                        j3 += j;
                    }
                    Long lValueOf = Long.valueOf(j3);
                    if (lValueOf != null && lValueOf.longValue() > 0) {
                        c880340YgC = new C880340YgC((int) lValueOf.longValue(), R.attr.a04, R.attr.zi);
                    }
                }
            }
            return new C882270YjJ<>(c886620YqK2, c880340YgC);
        }
        return null;
    }
}
