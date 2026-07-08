package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.06ZW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06ZW {
    public static final List LIZ(String str, List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C869590Y9l c869590Y9l = (C869590Y9l) obj;
            if (c869590Y9l.getMsgId() != 0) {
                arrayList.add(obj);
            } else {
                C0I0B.LJFF.LIZIZ();
                C830490Whz c830490Whz = new C830490Whz();
                c830490Whz.put("submit_type", str);
                c830490Whz.put("msg_type", String.valueOf(c869590Y9l.getMsgType()));
                c830490Whz.put("msg_status", String.valueOf(c869590Y9l.getMsgStatus()));
                C20684815ws.LJIILLIIL("submit_zero_msg_id", c830490Whz);
            }
        }
        return arrayList;
    }
}
