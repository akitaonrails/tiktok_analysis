package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPassExt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yT3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858670yT3 {
    public static final String LIZIZ(Message message) {
        TakoPassExt takoPassExt;
        String str;
        TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
        if (takoMixFeedLJIIIZ == null || (takoPassExt = takoMixFeedLJIIIZ.ext) == null || (str = takoPassExt.messageType) == null) {
            return "";
        }
        return str;
    }

    public static final boolean LIZJ(Message message) {
        TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
        if (takoMixFeedLJIIIZ == null || takoMixFeedLJIIIZ.cardType != 301) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(Message message) {
        TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
        if (takoMixFeedLJIIIZ == null || takoMixFeedLJIIIZ.cardType != 1005) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJ(com.ss.android.ugc.aweme.tako.ccl.model.api.Message r3) {
        /*
            boolean r0 = X.C07IB.LIZ()
            if (r0 != 0) goto L2c
            int r0 = r3.LJFF()
        La:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        Le:
            int r1 = r3.msgType
            r0 = 2
            if (r1 == r0) goto L16
            r0 = 5
            if (r1 != r0) goto L37
        L16:
            com.ss.android.ugc.aweme.tako.ccl.model.api.MessageSender r0 = r3.sender
            boolean r0 = r0.isSelf
            if (r0 != 0) goto L37
            int r1 = r3.LIZIZ
            r0 = 7
            if (r1 == r0) goto L2a
            if (r2 == 0) goto L37
            int r1 = r2.intValue()
            r0 = 4
            if (r1 != r0) goto L37
        L2a:
            r0 = 1
            return r0
        L2c:
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed r0 = r3.LJIIIZ()
            if (r0 == 0) goto L35
            int r0 = r0.status
            goto La
        L35:
            r2 = 0
            goto Le
        L37:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1858670yT3.LJ(com.ss.android.ugc.aweme.tako.ccl.model.api.Message):boolean");
    }

    public static final boolean LJFF(Message message) {
        int i = message.LIZIZ;
        if (i != 7 && i != 6) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(Message message) {
        Integer numValueOf;
        int i;
        TakoMixFeed takoMixFeedLJIIIZ;
        if (!LJFF(message)) {
            List listLJIIJJI = C1697810uHb.LJIIJJI(200, 201, 202, 203, 33, 43, 50);
            TakoMixFeed takoMixFeedLJIIIZ2 = message.LJIIIZ();
            Integer numValueOf2 = null;
            if (takoMixFeedLJIIIZ2 != null) {
                numValueOf = Integer.valueOf(takoMixFeedLJIIIZ2.cardType);
            } else {
                numValueOf = null;
            }
            if ((C13LP.LJJJJ(numValueOf, listLJIIJJI) && message.msgType == 3) || (message.msgType == 3 && (takoMixFeedLJIIIZ = message.LJIIIZ()) != null && takoMixFeedLJIIIZ.cardType == 301)) {
                return true;
            }
            TakoMixFeed takoMixFeedLJIIIZ3 = message.LJIIIZ();
            if ((takoMixFeedLJIIIZ3 == null || takoMixFeedLJIIIZ3.cardType != 107) && (i = message.LIZIZ) != 13 && i != 14) {
                if (message.msgType == 3) {
                    TakoMixFeed takoMixFeedLJIIIZ4 = message.LJIIIZ();
                    if (takoMixFeedLJIIIZ4 != null) {
                        numValueOf2 = Integer.valueOf(takoMixFeedLJIIIZ4.cardType);
                    }
                    if (C0R2X.LIZ(numValueOf2)) {
                        return true;
                    }
                }
                int i2 = message.LIZIZ;
                if (i2 != 11 && i2 != 12 && !LJIILJJIL(message)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean LJII(Message message) {
        Integer numValueOf;
        int iLJFF;
        int i;
        if (!C07IB.LIZ()) {
            iLJFF = message.LJFF();
        } else {
            TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
            if (takoMixFeedLJIIIZ != null) {
                iLJFF = takoMixFeedLJIIIZ.status;
            } else {
                numValueOf = null;
                i = message.LIZIZ;
                if ((i != 4 || i == 5) && numValueOf != null && numValueOf.intValue() == 3) {
                    return true;
                }
                return false;
            }
        }
        numValueOf = Integer.valueOf(iLJFF);
        i = message.LIZIZ;
        if (i != 4) {
        }
        return true;
    }

    public static final boolean LJIIIIZZ(Message message) {
        int i = message.LIZIZ;
        if (i != 3 && i != 2) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIZ(Message message) {
        int i = message.LIZIZ;
        if (i != 8 && i != 10 && i != 9) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIJ(Message message) {
        int i;
        if (LJIIIIZZ(message) || LJFF(message) || (i = message.LIZIZ) == 12 || i == 13 || i == 14) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIJJI(Message message) {
        Integer numValueOf;
        int iLJFF;
        int i;
        TakoMixFeed takoMixFeedLJIIIZ;
        if (!C07IB.LIZ()) {
            iLJFF = message.LJFF();
        } else {
            TakoMixFeed takoMixFeedLJIIIZ2 = message.LJIIIZ();
            if (takoMixFeedLJIIIZ2 != null) {
                iLJFF = takoMixFeedLJIIIZ2.status;
            } else {
                numValueOf = null;
                i = message.LIZIZ;
                if ((i == 4 && i != 5) || numValueOf == null || numValueOf.intValue() != 1 || (takoMixFeedLJIIIZ = message.LJIIIZ()) == null || takoMixFeedLJIIIZ.cardType != 301) {
                    return false;
                }
                return true;
            }
        }
        numValueOf = Integer.valueOf(iLJFF);
        i = message.LIZIZ;
        if (i == 4) {
        }
        return true;
    }

    public static final boolean LJIIL(Message message) {
        TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
        if (takoMixFeedLJIIIZ != null && takoMixFeedLJIIIZ.cardType == 1001) {
            return true;
        }
        TakoMixFeed takoMixFeedLJIIIZ2 = message.LJIIIZ();
        if (takoMixFeedLJIIIZ2 != null && takoMixFeedLJIIIZ2.cardType == 1002) {
            return true;
        }
        TakoMixFeed takoMixFeedLJIIIZ3 = message.LJIIIZ();
        if (takoMixFeedLJIIIZ3 != null && takoMixFeedLJIIIZ3.cardType == 1003) {
            return true;
        }
        TakoMixFeed takoMixFeedLJIIIZ4 = message.LJIIIZ();
        if (takoMixFeedLJIIIZ4 != null && takoMixFeedLJIIIZ4.cardType == 1012) {
            return true;
        }
        TakoMixFeed takoMixFeedLJIIIZ5 = message.LJIIIZ();
        if (takoMixFeedLJIIIZ5 != null && takoMixFeedLJIIIZ5.cardType == 1022) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILIIL(Message message) {
        Integer numValueOf;
        TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
        if (takoMixFeedLJIIIZ == null || takoMixFeedLJIIIZ.cardType != 50) {
            TakoMixFeed takoMixFeedLJIIIZ2 = message.LJIIIZ();
            if (takoMixFeedLJIIIZ2 != null) {
                numValueOf = Integer.valueOf(takoMixFeedLJIIIZ2.cardType);
            } else {
                numValueOf = null;
            }
            if (!C0R2X.LIZ(numValueOf)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJIILJJIL(Message message) {
        TakoMixFeed takoMixFeedLJIIIZ;
        if (message.msgType == 3 && (takoMixFeedLJIIIZ = message.LJIIIZ()) != null && takoMixFeedLJIIIZ.nimbleConfig != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILL(Message message) {
        int iLJFF;
        if (!C07IB.LIZ()) {
            iLJFF = message.LJFF();
        } else {
            TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
            if (takoMixFeedLJIIIZ != null) {
                iLJFF = takoMixFeedLJIIIZ.status;
            } else {
                return false;
            }
        }
        Integer numValueOf = Integer.valueOf(iLJFF);
        if (numValueOf != null && numValueOf.intValue() == 2) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILLIIL(Message message) {
        String str;
        TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
        if ((takoMixFeedLJIIIZ == null || takoMixFeedLJIIIZ.cardType != 301) && AnonymousClass1418.LJIIIZ(message.LJIIIZ()).length() == 0) {
            return true;
        }
        TakoMixFeed takoMixFeedLJIIIZ2 = message.LJIIIZ();
        if (takoMixFeedLJIIIZ2 != null && takoMixFeedLJIIIZ2.cardType == 301) {
            TakoMixFeed takoMixFeedLJIIIZ3 = message.LJIIIZ();
            if (takoMixFeedLJIIIZ3 != null) {
                str = takoMixFeedLJIIIZ3.hintInText;
            } else {
                str = null;
            }
            if (C123100dR.LIZ(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final List<Message> LIZ(Message message, IMessageAbility iMessageAbility) {
        List<Message> listCM2;
        Message message2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(message);
        if (iMessageAbility != null && (listCM2 = iMessageAbility.CM2(message.replyUuid)) != null) {
            Iterator<Message> it2 = listCM2.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(it2.next().msgId, message.msgId)) {
                    if (i > -1 && listCM2 != null && (message2 = (Message) C13LP.LJJJLZIJ(i + 1, listCM2)) != null && LJIIL(message2)) {
                        arrayList.add(message2);
                    }
                } else {
                    i++;
                }
            }
        }
        return arrayList;
    }
}
