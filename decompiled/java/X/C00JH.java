package X;

import com.bytedance.android.livesdk.model.message.MemberInfo;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.00JH, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00JH {
    public final List<MemberInfo> LIZ;
    public final long LIZIZ;

    public final MemberInfo LIZ(long j) {
        MemberInfo next;
        Iterator<MemberInfo> it2 = this.LIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.userId == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public C00JH(List list, long j) {
        this.LIZ = list;
        this.LIZIZ = j;
    }
}
