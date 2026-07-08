package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.NoticeboardParam;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0bM3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C970210bM3 {
    public static final Long LIZIZ() {
        Object next;
        C953610avH.LJJI.getClass();
        String str = C953610avH.LJJII;
        if (str == null) {
            return null;
        }
        Iterator it2 = C953760avW.LIZIZ.LIZ().LIZLLL(3, str).iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                long j = ((C953770avX) next).LIZJ;
                do {
                    Object next2 = it2.next();
                    long j2 = ((C953770avX) next2).LIZJ;
                    if (j < j2) {
                        next = next2;
                        j = j2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        C953770avX c953770avX = (C953770avX) next;
        if (c953770avX != null) {
            return c953770avX.LJIIL;
        }
        return null;
    }

    public static final C916750Zxp LIZ(NoticeboardParam noticeboardParam) {
        int iIntValue;
        Integer num = noticeboardParam.officialMaterialType;
        if (num != null) {
            iIntValue = num.intValue();
        } else if (noticeboardParam.templateId > 0) {
            iIntValue = 1;
        } else if (C1533950q1J.LJ(noticeboardParam.nodeId)) {
            iIntValue = 2;
        } else {
            iIntValue = 0;
        }
        String str = noticeboardParam.nodeId;
        if (str == null) {
            str = "";
        }
        return new C916750Zxp(iIntValue, noticeboardParam.templateId, str);
    }
}
