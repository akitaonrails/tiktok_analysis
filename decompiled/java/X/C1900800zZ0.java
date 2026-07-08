package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zZ0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1900800zZ0 {
    public static final C1900820zZ2 LIZ = C1900820zZ2.LL;

    public static Pair LIZIZ(C1900810zZ1 c1900810zZ1) {
        MusNotice musNotice;
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (NoticeItems noticeItems : c1900810zZ1.LJIIIZ.values()) {
            List<? extends MusNotice> list = noticeItems.items;
            if (list != null && (musNotice = (MusNotice) C13LP.LJJJLL(list)) != null) {
                if (musNotice.createTime <= 0 || (str = musNotice.nid) == null || str.length() == 0 || Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, musNotice.nid)) {
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("InsertExtra but notice invalid: item.group:");
                    sbLIZ.append(noticeItems.group);
                    sbLIZ.append(", nid:");
                    sbLIZ.append(musNotice.nid);
                    sbLIZ.append(", noticeType:");
                    sbLIZ.append(musNotice.type);
                    C1720106oR.LJI("Creators_Inbox:DataProcessHelper", C2188811AlT.LIZIZ(sbLIZ));
                    String str2 = musNotice.nid;
                    if (str2 == null || str2.length() == 0) {
                        musNotice.nid = String.valueOf(musNotice.hashCode());
                    }
                }
                if (!c1900810zZ1.LIZLLL(musNotice)) {
                    musNotice.noticeListType = noticeItems.listType;
                    musNotice.needCollapse = C1900560zYc.LIZJ(musNotice);
                    if (musNotice.hasRead) {
                        arrayList2.add(musNotice);
                    } else {
                        musNotice.priority = 1;
                        arrayList.add(musNotice);
                    }
                }
            }
        }
        C1900820zZ2 c1900820zZ2 = LIZ;
        C08XD.LJJ(arrayList2, c1900820zZ2);
        C08XD.LJJ(arrayList, c1900820zZ2);
        return new Pair(arrayList, arrayList2);
    }

    public static void LIZ(List list, List list2, C1900810zZ1 c1900810zZ1, String str) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            MusNotice musNotice = (MusNotice) it2.next();
            ArrayList arrayList = (ArrayList) list2;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                BaseNotice baseNotice = (BaseNotice) ListProtector.get(arrayList, i);
                int i2 = musNotice.priority;
                int i3 = baseNotice.priority;
                int i4 = i2 - i3;
                if (i2 == i3) {
                    if (musNotice.createTime - baseNotice.createTime > 0) {
                        c1900810zZ1.LJ(musNotice, i);
                        int i5 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Insert ");
                        sbLIZ.append(str);
                        C1720106oR.LJI("Creators_Inbox:DataProcessHelper", C2188811AlT.LIZIZ(sbLIZ));
                        break;
                    }
                } else {
                    if (i4 > 0) {
                        c1900810zZ1.LJ(musNotice, i);
                        int i52 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Insert ");
                        sbLIZ2.append(str);
                        C1720106oR.LJI("Creators_Inbox:DataProcessHelper", C2188811AlT.LIZIZ(sbLIZ2));
                        break;
                        break;
                    }
                }
            }
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            MusNotice musNotice2 = (MusNotice) it3.next();
            if (!c1900810zZ1.LIZLLL(musNotice2) && !c1900810zZ1.LJIIJ) {
                int i6 = C2187451AjH.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Insert ");
                sbLIZ3.append(str);
                sbLIZ3.append(" to the end");
                C1720106oR.LJI("Creators_Inbox:DataProcessHelper", C2188811AlT.LIZIZ(sbLIZ3));
                c1900810zZ1.LJ(musNotice2, -1);
            }
        }
    }
}
