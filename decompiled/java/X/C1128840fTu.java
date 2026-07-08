package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveGiftMagicSetting;
import com.bytedance.android.livesdk.model.Gift;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0fTu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128840fTu {
    public static Gift LIZJ(List list) {
        Object next;
        AbstractC293401Bs c1126040fPO;
        Object obj = null;
        if (list.isEmpty()) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((Gift) next).LJFF()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Gift gift = (Gift) next;
        if (gift == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Gift gift2 = (Gift) it3.next();
            if (gift2.LJ()) {
                c1126040fPO = new C293001Bo(gift2);
            } else {
                c1126040fPO = new C1126040fPO(gift2);
            }
            linkedList.add(c1126040fPO);
        }
        long jLIZ = C1125060fNo.LIZ(gift.id, linkedList);
        Iterator it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Object next2 = it4.next();
            if (((Gift) next2).id == jLIZ) {
                obj = next2;
                break;
            }
        }
        return (Gift) obj;
    }

    public static C1129380fUm LIZIZ(List list, Gift gift, String str) {
        int i = 12;
        Long l = null;
        if (!gift.LIZIZ()) {
            return new C1129380fUm(gift, str, l, i);
        }
        if (!LiveGiftMagicSetting.INSTANCE.isEnable()) {
            return new C1129380fUm(gift, str, l, i);
        }
        Gift giftLIZJ = LIZJ(list);
        if (giftLIZJ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_MagicEntrance");
            return new C1129380fUm(giftLIZJ, C2188811AlT.LIZIZ(sbLIZ), l, i);
        }
        return new C1129380fUm(gift, str, l, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:219:0x0377, code lost:
    
        if (r3 != null) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:466:0x04b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1129380fUm LIZ(java.util.List r23, int r24, X.C1129080fUI r25, X.C1091480eVe r26, java.lang.Long r27, java.lang.Integer r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 1559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128840fTu.LIZ(java.util.List, int, X.0fUI, X.0eVe, java.lang.Long, java.lang.Integer, boolean):X.0fUm");
    }
}
