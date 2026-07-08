package X;

import com.ss.android.ugc.aweme.bulletin.db.modle.BulletinItemBase;
import com.ss.android.ugc.aweme.bulletin.db.modle.BulletinItemContent;
import com.ss.android.ugc.aweme.bulletin.db.modle.BulletinItemInteraction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS240S0000000_9;

/* JADX INFO: renamed from: X.0OaG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C621860OaG {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZIZ(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (list.isEmpty()) {
            return arrayList;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C619060OPw c619060OPw = (C619060OPw) it2.next();
            BulletinItemBase bulletinItemBase = c619060OPw.LIZ;
            if (bulletinItemBase != null) {
                int i = 3;
                Object[] objArr = {bulletinItemBase.itemId, bulletinItemBase.bulletinBoardId, bulletinItemBase.lastUpdateTime, bulletinItemBase.createTime, bulletinItemBase.publishUserId, bulletinItemBase.type, bulletinItemBase.hasRead, bulletinItemBase.ttl, bulletinItemBase.status, bulletinItemBase.styleId};
                String strLIZJ = LIZJ(EnumC621930OaN.values().length);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                char c = '(';
                sbLIZ.append('(');
                sbLIZ.append(strLIZJ);
                sbLIZ.append(')');
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("\n            INSERT OR REPLACE INTO bulletin_item_base \n            (");
                sbLIZ2.append(C13LQ.LJJJ(EnumC621930OaN.values(), ", ", null, null, AFwS240S0000000_9.get$arr$(735), 30));
                sbLIZ2.append(") \n            VALUES ");
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append("\n        ");
                arrayList2.add(new Pair(C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ2)), objArr));
                List<BulletinItemContent> list2 = c619060OPw.LIZIZ;
                if (list2 != null) {
                    for (BulletinItemContent bulletinItemContent : list2) {
                        Object[] objArr2 = new Object[i];
                        objArr2[0] = bulletinItemContent.itemId;
                        objArr2[1] = bulletinItemContent.contentKey;
                        objArr2[2] = bulletinItemContent.contentValue;
                        String strLIZJ2 = LIZJ(EnumC621870OaH.values().length);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(c);
                        sbLIZ3.append(strLIZJ2);
                        sbLIZ3.append(')');
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("\n            INSERT OR REPLACE INTO bulletin_item_content \n            (");
                        sbLIZ4.append(C13LQ.LJJJ(EnumC621870OaH.values(), ", ", null, null, AFwS240S0000000_9.get$arr$(736), 30));
                        sbLIZ4.append(") \n            VALUES ");
                        sbLIZ4.append(strLIZIZ2);
                        sbLIZ4.append("\n        ");
                        arrayList3.add(new Pair(C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ4)), objArr2));
                        i = 3;
                        c = '(';
                    }
                }
                BulletinItemInteraction bulletinItemInteraction = c619060OPw.LIZJ;
                if (bulletinItemInteraction != null) {
                    Object[] objArr3 = new Object[5];
                    objArr3[0] = bulletinItemInteraction.itemId;
                    objArr3[1] = bulletinItemInteraction.emoji;
                    objArr3[2] = bulletinItemInteraction.comment;
                    objArr3[i] = bulletinItemInteraction.viewCount;
                    objArr3[4] = bulletinItemInteraction.bottomStruct;
                    String strLIZJ3 = LIZJ(EnumC621910OaL.values().length);
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(c);
                    sbLIZ5.append(strLIZJ3);
                    sbLIZ5.append(')');
                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ5);
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("\n            INSERT OR REPLACE INTO bulletin_item_interaction \n            (");
                    sbLIZ6.append(C13LQ.LJJJ(EnumC621910OaL.values(), ", ", null, null, AFwS240S0000000_9.get$arr$(737), 30));
                    sbLIZ6.append(") \n            VALUES ");
                    sbLIZ6.append(strLIZIZ3);
                    sbLIZ6.append("\n        ");
                    arrayList4.add(new Pair(C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ6)), objArr3));
                }
            }
        }
        arrayList.addAll(arrayList2);
        arrayList.addAll(arrayList3);
        arrayList.addAll(arrayList4);
        return arrayList;
    }

    public static String LIZJ(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add("?");
        }
        return C13LP.LJJLIIIJ(arrayList, ", ", null, null, 0, null, null, 62);
    }

    public static List LIZ(long j, long j2, String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\n        DELETE FROM bulletin_item_base\n        WHERE ");
        EnumC621930OaN enumC621930OaN = EnumC621930OaN.BULLETIN_BOARD_ID;
        sbLIZ.append(enumC621930OaN.getKey());
        sbLIZ.append(" = ?\n          AND ");
        EnumC621930OaN enumC621930OaN2 = EnumC621930OaN.CREATE_TIME;
        sbLIZ.append(enumC621930OaN2.getKey());
        sbLIZ.append(" BETWEEN ? AND ?\n    ");
        String strLIZJ = C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("\n        DELETE FROM bulletin_item_content\n        WHERE ");
        sbLIZ2.append(EnumC621870OaH.ITEM_ID.getKey());
        sbLIZ2.append(" IN (\n            SELECT ");
        EnumC621930OaN enumC621930OaN3 = EnumC621930OaN.ITEM_ID;
        sbLIZ2.append(enumC621930OaN3.getKey());
        sbLIZ2.append(" \n            FROM bulletin_item_base\n            WHERE ");
        sbLIZ2.append(enumC621930OaN.getKey());
        sbLIZ2.append(" = ?\n              AND ");
        sbLIZ2.append(enumC621930OaN2.getKey());
        sbLIZ2.append(" BETWEEN ? AND ?\n        )\n    ");
        String strLIZJ2 = C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("\n        DELETE FROM bulletin_item_interaction\n        WHERE ");
        sbLIZ3.append(EnumC621910OaL.ITEM_ID.getKey());
        sbLIZ3.append(" IN (\n            SELECT ");
        sbLIZ3.append(enumC621930OaN3.getKey());
        sbLIZ3.append(" \n            FROM bulletin_item_base\n            WHERE ");
        sbLIZ3.append(enumC621930OaN.getKey());
        sbLIZ3.append(" = ?\n              AND ");
        sbLIZ3.append(enumC621930OaN2.getKey());
        sbLIZ3.append(" BETWEEN ? AND ?\n        )\n    ");
        arrayList.add(new Pair(C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ3)), new Object[]{str, Long.valueOf(j2), Long.valueOf(j)}));
        arrayList.add(new Pair(strLIZJ2, new Object[]{str, Long.valueOf(j2), Long.valueOf(j)}));
        arrayList.add(new Pair(strLIZJ, new Object[]{str, Long.valueOf(j2), Long.valueOf(j)}));
        return arrayList;
    }
}
