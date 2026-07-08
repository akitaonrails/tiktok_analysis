package X;

import android.util.Pair;
import com.bytedance.im.core.proto.ConversationCoreInfo;
import com.bytedance.im.core.proto.ConversationSettingInfo;
import com.bytedance.im.core.proto.ParticipantsPage;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0ZtU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C914060ZtU implements InterfaceC872410YKh {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC872410YKh
    public final Object LIZ() {
        switch (this.$t) {
            case 0:
                return LIZ$0(this);
            case 1:
                return LIZ$1(this);
            case 2:
                return LIZ$2(this);
            case 3:
                return LIZ$3(this);
            case 4:
                return LIZ$4(this);
            case 5:
                return LIZ$5(this);
            case 6:
                return LIZ$6(this);
            case 7:
                return LIZ$7(this);
            case 8:
                return LIZ$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return LIZ$9(this);
            default:
                return null;
        }
    }

    public static final Object LIZ$0(C914060ZtU c914060ZtU) {
        C0Y8T c0y8tLIZ;
        boolean zLJJL = ((C867970Y3f) c914060ZtU.l2).LLILZ.LJIIJJI().LJJL(c914060ZtU.s0, (Map) c914060ZtU.l1);
        if (zLJJL && (c0y8tLIZ = ((C867970Y3f) c914060ZtU.l2).LLILLJJLI.LJIIZILJ().LIZLLL().LIZ().LIZ(c914060ZtU.s0)) != null) {
            c0y8tLIZ.setLocalExt((Map) c914060ZtU.l1);
            ((C867970Y3f) c914060ZtU.l2).LLILLJJLI.LJIIZILJ().LIZLLL().LIZLLL().LJJL(10, c0y8tLIZ);
        }
        return Boolean.valueOf(zLJJL);
    }

    public static final Object LIZ$1(C914060ZtU c914060ZtU) {
        ((C0Y60) c914060ZtU.l2).LJIILIIL.LIZLLL().LJIIJJI("ConversationListModel getConversation async");
        C0Y8T c0y8tLIZ = ((C0Y60) c914060ZtU.l2).LJIILJJIL.LJIIJJI().LIZ(c914060ZtU.s0, true);
        if (c0y8tLIZ != null) {
            if (((C0Y60) c914060ZtU.l2).LJIILIIL.LJIIZILJ().LIZLLL().LJI().LJIILLIIL(c0y8tLIZ)) {
                ((C0Y60) c914060ZtU.l2).LJIILIIL.LJIIZILJ().LIZLLL().LJI().LJIIJ(c0y8tLIZ);
            } else {
                ((C0Y60) c914060ZtU.l2).LJLIIIL(c0y8tLIZ);
            }
        }
        InterfaceC863600XuI interfaceC863600XuI = (InterfaceC863600XuI) c914060ZtU.l1;
        if (interfaceC863600XuI != null) {
            interfaceC863600XuI.onSuccess(c0y8tLIZ);
        }
        return c0y8tLIZ;
    }

    public static final Object LIZ$2(C914060ZtU c914060ZtU) {
        return ((C0Y9I) c914060ZtU.l2).LLILLJJLI.LJI().LJLJI(c914060ZtU.s0, (Map) c914060ZtU.l1);
    }

    public static final Object LIZ$3(C914060ZtU c914060ZtU) {
        String strLJFF;
        ((C868960Y7a) c914060ZtU.l2).LIZJ.LIZLLL().LJIIJJI("LoadHistoryHandler pull onRun");
        C868960Y7a c868960Y7a = (C868960Y7a) c914060ZtU.l2;
        String str = c914060ZtU.s0;
        if (c868960Y7a.LIZJ.LJIIIZ().LJJLIIIIJ.LJIIIZ.enableConvKvCache) {
            strLJFF = c868960Y7a.LIZJ.LJIIZILJ().LIZLLL().LJ().LJFF(str, "conv_history_cursor");
        } else {
            strLJFF = c868960Y7a.LIZLLL.LJIILJJIL().LJFF(str, "conv_history_cursor");
        }
        long jLJFF = C870740YDw.LJFF(c868960Y7a.LIZJ.LIZLLL(), strLJFF);
        if (jLJFF <= 0) {
            jLJFF = ((C868960Y7a) c914060ZtU.l2).LIZLLL.LJI().LJJIJIIJIL(c914060ZtU.s0);
            C868780Y6i c868780Y6iLIZLLL = ((C868960Y7a) c914060ZtU.l2).LIZJ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LoadHistoryHandler kv cursor<=0, db smallest cursor=");
            sbLIZ.append(jLJFF);
            c868780Y6iLIZLLL.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (jLJFF <= 0) {
            jLJFF = ((C0Y8T) c914060ZtU.l1).getLastMessageIndex();
            C868780Y6i c868780Y6iLIZLLL2 = ((C868960Y7a) c914060ZtU.l2).LIZJ.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("LoadHistoryHandler fallback cursor=");
            sbLIZ2.append(jLJFF);
            c868780Y6iLIZLLL2.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        C868780Y6i c868780Y6iLIZLLL3 = ((C868960Y7a) c914060ZtU.l2).LIZJ.LIZLLL();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("LoadHistoryHandler pull start ");
        sbLIZ3.append(jLJFF);
        c868780Y6iLIZLLL3.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ3));
        if (jLJFF >= 0) {
            ((C868960Y7a) c914060ZtU.l2).LJIIJJI(jLJFF, (C0Y8T) c914060ZtU.l1);
        } else {
            ((C868960Y7a) c914060ZtU.l2).LJIIJJI(0L, (C0Y8T) c914060ZtU.l1);
        }
        return 0L;
    }

    public static final Object LIZ$4(C914060ZtU c914060ZtU) {
        int conversationType;
        ((ArrayList) ((C0Y1J) c914060ZtU.l2).LJ).addAll(C0Y8V.LIZJ(c914060ZtU.s0, ((ParticipantsPage) c914060ZtU.l1).participants));
        C0Y8T c0y8tLIZ = ((C0Y1J) c914060ZtU.l2).LIZJ.LJIIZILJ().LIZLLL().LIZ().LIZ(c914060ZtU.s0);
        ((C0Y1J) c914060ZtU.l2).LIZLLL.LJIILIIL().LJIILIIL(c914060ZtU.s0);
        C0Y1X c0y1xLJIILIIL = ((C0Y1J) c914060ZtU.l2).LIZLLL.LJIILIIL();
        String str = c914060ZtU.s0;
        if (c0y8tLIZ == null) {
            conversationType = -1;
        } else {
            conversationType = c0y8tLIZ.getConversationType();
        }
        c0y1xLJIILIIL.LIZJ(conversationType, str, ((C0Y1J) c914060ZtU.l2).LJ);
        ((C0Y1J) c914060ZtU.l2).LIZLLL.LJIIJJI().LJJLI(((ArrayList) ((C0Y1J) c914060ZtU.l2).LJ).size(), c914060ZtU.s0);
        C868140Y3w c868140Y3w = ((C0Y1J) c914060ZtU.l2).LIZJ.LJIIZILJ().getDomain().LIZIZ;
        ((CopyOnWriteArraySet) c868140Y3w.LJFF).remove(c914060ZtU.s0);
        C0Y8T c0y8tLIZ2 = ((C0Y1J) c914060ZtU.l2).LIZLLL.LJIIJJI().LIZ(c914060ZtU.s0, true);
        if (c0y8tLIZ2 != null) {
            C0Y1J c0y1j = (C0Y1J) c914060ZtU.l2;
            if (c0y1j.LJFF) {
                c0y1j.LIZJ.LJIIZILJ().LIZLLL().LIZLLL().LJJL(7, c0y8tLIZ2);
            }
        }
        return new Pair(c0y8tLIZ2, ((C0Y1J) c914060ZtU.l2).LJ);
    }

    public static final Object LIZ$5(C914060ZtU c914060ZtU) {
        long jLJJIIJ = ((C867300Y0q) c914060ZtU.l2).LIZLLL.LJI().LJJIIJ(c914060ZtU.s0);
        if (jLJJIIJ <= 0) {
            return Long.valueOf(((C0Y8T) c914060ZtU.l1).getMinIndex());
        }
        return Long.valueOf(jLJJIIJ);
    }

    public static final Object LIZ$6(C914060ZtU c914060ZtU) {
        C0Y8T c0y8tLIZ = ((C0Y1E) c914060ZtU.l2).LIZLLL.LJIIJJI().LIZ(c914060ZtU.s0, true);
        C0Y8Y c0y8yLJ = C0Y8V.LJ(c914060ZtU.s0, null, (ConversationCoreInfo) c914060ZtU.l1);
        if (c0y8tLIZ != null) {
            c0y8tLIZ.setCoreInfo(c0y8yLJ);
        }
        ((C0Y1E) c914060ZtU.l2).LIZLLL.LJIIIIZZ().LJI(c0y8yLJ);
        return c0y8tLIZ;
    }

    public static final Object LIZ$7(C914060ZtU c914060ZtU) {
        C0Y8T c0y8tLIZ = ((C0Y1D) c914060ZtU.l2).LIZLLL.LJIIJJI().LIZ(c914060ZtU.s0, true);
        C0Y8W c0y8wLJFF = C0Y8V.LJFF(null, (ConversationSettingInfo) c914060ZtU.l1);
        if (c0y8tLIZ != null) {
            c0y8tLIZ.setSettingInfo(c0y8wLJFF);
        }
        ((C0Y1D) c914060ZtU.l2).LIZLLL.LIZ().LJII(c0y8wLJFF);
        return c0y8tLIZ;
    }

    public static final Object LIZ$8(C914060ZtU c914060ZtU) {
        C0Y8T c0y8tLIZ = ((C0Y11) c914060ZtU.l2).LIZJ.LJIIZILJ().LIZLLL().LIZ().LIZ(c914060ZtU.s0);
        if (c0y8tLIZ == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(((C0Y11) c914060ZtU.l2).LIZLLL.LJIILIIL().LIZJ(c0y8tLIZ.getConversationType(), c914060ZtU.s0, (List) c914060ZtU.l1));
    }

    public static final Object LIZ$9(C914060ZtU c914060ZtU) {
        C869660Y9s c869660Y9sLJIIJ = ((C0YA4) c914060ZtU.l2).LIZLLL.LJIIJ();
        String str = c914060ZtU.s0;
        c869660Y9sLJIIJ.LIZ.LIZLLL().LJFF("IMMsgPropertyDao collectResendProperties with msg uuid");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" AND p.");
        sbLIZ.append(EnumC869700Y9w.COLUMN_MSG_UUID.key);
        sbLIZ.append("='");
        sbLIZ.append(str);
        sbLIZ.append("'");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C869660Y9s.LJ());
        sbLIZ2.append(strLIZIZ);
        Collection<C0YA6> collectionLIZLLL = c869660Y9sLJIIJ.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
        if (collectionLIZLLL != null && !collectionLIZLLL.isEmpty()) {
            C868780Y6i c868780Y6iLIZLLL = ((C0YA4) c914060ZtU.l2).LIZJ.LIZLLL();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("triggerResend for single message, size ");
            sbLIZ3.append(collectionLIZLLL.size());
            sbLIZ3.append(", ");
            sbLIZ3.append(collectionLIZLLL);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            c868780Y6iLIZLLL.getClass();
            C868780Y6i.LJ(c868780Y6iLIZLLL, "ModifyMsgPropertyHandler", strLIZIZ2, 4);
            for (C0YA6 c0ya6 : collectionLIZLLL) {
                c0ya6.setResend(true);
                C0YA4 c0ya4 = (C0YA4) c914060ZtU.l2;
                C0Y3I c0y3i = (C0Y3I) c914060ZtU.l1;
                c0y3i.getClass();
                c0ya4.LJIILJJIL(c0y3i, c0ya6);
            }
            ((C0YA4) c914060ZtU.l2).LJIILIIL(collectionLIZLLL, true);
            return Boolean.TRUE;
        }
        C868780Y6i c868780Y6iLIZLLL2 = ((C0YA4) c914060ZtU.l2).LIZJ.LIZLLL();
        c868780Y6iLIZLLL2.getClass();
        C868780Y6i.LJ(c868780Y6iLIZLLL2, "ModifyMsgPropertyHandler", "triggerResend for single message, no record", 4);
        return Boolean.FALSE;
    }

    public C914060ZtU(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.l1 = obj2;
    }
}
