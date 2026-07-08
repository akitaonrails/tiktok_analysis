package X;

import android.os.Message;
import com.ss.android.ugc.aweme.legoImp.task.AnrThanosEarliestTask;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.08Bg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2075808Bg implements InterfaceC2076108Bj {
    public static final boolean LIZ() {
        if (!AnrThanosEarliestTask.LL) {
            ArrayList<Message> arrayListLIZIZ = C20682088i.LIZIZ(C20682088i.LIZ(), 100);
            if (arrayListLIZIZ == null || arrayListLIZIZ.isEmpty()) {
                return false;
            }
            Iterator<Message> it2 = arrayListLIZIZ.iterator();
            while (it2.hasNext()) {
                if (C2075908Bh.LIZ(it2.next())) {
                }
            }
            return C2075908Bh.LLILLL;
        }
        return true;
    }
}
