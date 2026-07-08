package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: renamed from: X.0iXn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246570iXn {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(List list, List list2) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = (ArrayList) list2;
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            BaseNotice baseNotice = (BaseNotice) listIterator.next();
            int i = baseNotice.type;
            if (i == 1001 || (i == 999 && baseNotice.timeLineType == 0)) {
                listIterator.remove();
            }
        }
        arrayList.addAll(0, list);
        list.size();
        ListProtector.add(arrayList, 0, new MusNotice() { // from class: X.0iXl
            {
                this.type = 999;
                this.timeLineType = 0;
                this.nid = String.valueOf(hashCode());
            }

            @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
            public final int hashCode() {
                return Objects.hash(Integer.valueOf(this.type), Integer.valueOf(this.timeLineType));
            }

            @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice, com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1246550iXl)) {
                    return false;
                }
                BaseNotice baseNotice2 = (BaseNotice) obj;
                if (this.type == baseNotice2.type && this.timeLineType == baseNotice2.timeLineType) {
                    return true;
                }
                return false;
            }
        });
    }
}
